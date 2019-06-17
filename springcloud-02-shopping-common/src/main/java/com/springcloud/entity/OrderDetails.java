package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * ORDER_DETAILS表对应的实体类，用于封装一行订单明细信息
 * @author tanjiagui
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
	/*
	 * 订单明细编号
	 */
	private Integer orderDetailId;
	/*
	 * 订单编号
	 */
	private Integer orderId;

	/*
	 * 商品编号
	 */
	private Integer goodsId;
	/*
	 * 商品名称
	 */
	private String goodsName;
	/*
	 * 商品成交价
	 */
	private Double goodsFinalPrice;
	/*
	 * 商品成交数量
	 */
	private Integer goodsFinalNum;

}