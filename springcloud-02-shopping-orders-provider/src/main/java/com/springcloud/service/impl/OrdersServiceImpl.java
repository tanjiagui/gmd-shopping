/**
 * 
 */
package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.dao.OrdersMapper;
import com.springcloud.entity.Orders;
import com.springcloud.service.OrdersService;

/**
 * @author tanjiagui
 *
 */
@Service
public class OrdersServiceImpl implements OrdersService{
	
	  @Autowired 
	  private OrdersMapper ordersMapper;
	 
	@Override
	public PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber) {
		//在用户名称两端加上%
		if(orders.getUser() != null) {
		orders.getUser().setUserName("%" + orders.getUser().getUserName() + "%");
		
		}
		//设置分页信息
		PageHelper.startPage(pageNumber + 1,PageUtils.PAGE_ROW_COUNT);
		//查询满足条件的信息
		List<Orders> list = this.ordersMapper.selectOrders(orders);
		//返回分页信息
		return new PageInfo<>(list);
	}
	
	@Transactional
	@Override
	public Integer updateOrdersStatus(Orders orders) {
		
		return this.ordersMapper.updateOrdersStatus(orders);
	}

	@Override
	public List<Orders> selectGroup(Orders orders) {
		
		return this.ordersMapper.selectGroup(orders);
	}
}
