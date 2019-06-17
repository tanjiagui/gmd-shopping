package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TYPE_ONE���Ӧ��ʵ����
 * 
 * @author tanjiagui
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeOne {
	/**
	 * һ�������
	 */
	private Integer typeOneId;
	/**
	 * һ���������
	 */
	private String typeOneName;
	/**
	 * ���
	 */
	private Integer typeOneNum;
	/**
	 * ��ע
	 */
	private String typeOneRemark;

}