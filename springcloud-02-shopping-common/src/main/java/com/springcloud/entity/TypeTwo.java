package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TYPE_TWO表对应的实体类
 * 
 * @author tanjiagui
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeTwo {
	/**
	 * 二级类别编号
	 */
	private Integer typeTwoId;
	/**
	 * 二级类别名称
	 */
	private String typeTwoName;
	/**
	 * 一级类别编号
	 */
	private Integer typeOneId;
	/**
	 * 备注
	 */
	private String typeTwoRemark;

}