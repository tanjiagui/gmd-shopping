package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * ORDER_DETAILS���Ӧ��ʵ���࣬���ڷ�װһ�ж�����ϸ��Ϣ
 * @author tanjiagui
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
	/*
	 * ������ϸ���
	 */
	private Integer orderDetailId;
	/*
	 * �������
	 */
	private Integer orderId;

	/*
	 * ��Ʒ���
	 */
	private Integer goodsId;
	/*
	 * ��Ʒ����
	 */
	private String goodsName;
	/*
	 * ��Ʒ�ɽ���
	 */
	private Double goodsFinalPrice;
	/*
	 * ��Ʒ�ɽ�����
	 */
	private Integer goodsFinalNum;

}