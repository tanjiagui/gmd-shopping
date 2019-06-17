/**
 * 
 */
package com.springcloud.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springcloud.common.UploadUtils;
import com.springcloud.vo.ResultValue;

/**
 * @author tanjiagui
 *
 */
@RestController
public class FileUploadController {
	
	//从application.properties文件中获得指定键的值，并赋给相应的成员变量
	@Value("${web.user-path}")
	private String userPath;
	

	@Value("${web.goods-path}")
	private String goodsPath;
	
	@RequestMapping(value="/userUpload")
	public ResultValue userUpload(@RequestParam("userImage") MultipartFile file){
		ResultValue rv = new ResultValue();		//获得新的文件名
		try {
			Map<String,Object> map = this.fileUpload(file, userPath);
			if(map != null && map.size() > 0) {
				rv.setCode(0);
				rv.setDataMap(map);
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("用户头像上传失败");
		return rv;
	}
	
	@RequestMapping(value="/goodsUpload")
	public ResultValue goodsUpload(@RequestParam("goodsImage") MultipartFile file){
		ResultValue rv = new ResultValue();		//获得新的文件名
		try {
			Map<String,Object> map = this.fileUpload(file, goodsPath);
			if(map != null && map.size() > 0) {
				rv.setCode(0);
				rv.setDataMap(map);
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("商品图片上传失败");
		return rv;
	}
	
	@RequestMapping(value = "/deleteGoodsImg")
	public ResultValue deleteGoodsImg(@RequestParam("goodsImg") String goodsImg) {
		ResultValue rv = new ResultValue();
		try {
			//从Url中获得商品图片的名字
			int indexOf = goodsImg.lastIndexOf("/");
			if(indexOf != -1) {
				String fileName = goodsImg.substring(indexOf + 1);
				File file = new File(this.goodsPath + fileName);
				
						file.delete();
						rv.setCode(0);
						return rv;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
		
	}
	
	@RequestMapping(value = "/deleteUserImg")
	public ResultValue deleteUserImg(@RequestParam("userImg") String userImg) {
		ResultValue rv = new ResultValue();
		try {
			//从Url中获得商品图片的名字
			int indexOf = userImg.lastIndexOf("/");
			if(indexOf != -1) {
				String fileName = userImg.substring(indexOf + 1);
				File file = new File(this.userPath + fileName);
				
						file.delete();
						rv.setCode(0);
						return rv;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
		
	}
	
	
	
	/**
	 *  上传文件
	 * @param file   需要上传的文件
	 * @param path   
	 * @return
	 * @throws IOException
	 */
	private Map<String,Object> fileUpload(MultipartFile file,String path) throws IOException{
		Map<String, Object> map = null;
		//获得新的文件名
		
		String fileName = UploadUtils.getFileName();
		String extendedName = UploadUtils.getExendedName(file.getOriginalFilename());
		
		//上传文件
		//1.将文件转换为字节类型的数组
		
			byte[] bytes = file.getBytes();
			//2.创建File类的对象，并设置文件名上传路径及文件名
			File saveFile  = new File(path + fileName + extendedName);
			//3.上传文件
			FileCopyUtils.copy(bytes, saveFile);
			
			map = new HashMap<>();
			map.put("fileName", fileName);
			map.put("extendedName", extendedName);
			
			return map;
	}
}
