/**
 * 
 */
package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * @author tanjiagui
 *
 */
public interface OrdersService {
	/**
	 * 
	 * @param orders
	 * @return
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber);
	/**
	 *   修改指定编号的订单状态
	 * @param orders   修改的订单信息
	 * @return    成功返回大于0的整数
	 */
	public abstract Integer updateOrdersStatus(Orders orders);
	/**
	 *   查询指定日期范围内的销售额
	 * @param orders  查询条件
	 * @return    成功返回java.util.List类型的实例，否则返回null
	 */
	public abstract List<Orders> selectGroup(Orders orders);
}
