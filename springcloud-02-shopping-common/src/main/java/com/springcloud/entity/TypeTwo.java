package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TYPE_TWO���Ӧ��ʵ����
 * 
 * @author tanjiagui
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeTwo {
	/**
	 * ���������
	 */
	private Integer typeTwoId;
	/**
	 * �����������
	 */
	private String typeTwoName;
	/**
	 * һ�������
	 */
	private Integer typeOneId;
	/**
	 * ��ע
	 */
	private String typeTwoRemark;

}