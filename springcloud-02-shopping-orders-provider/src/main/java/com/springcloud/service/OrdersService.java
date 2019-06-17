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
	 *   �޸�ָ����ŵĶ���״̬
	 * @param orders   �޸ĵĶ�����Ϣ
	 * @return    �ɹ����ش���0������
	 */
	public abstract Integer updateOrdersStatus(Orders orders);
	/**
	 *   ��ѯָ�����ڷ�Χ�ڵ����۶�
	 * @param orders  ��ѯ����
	 * @return    �ɹ�����java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<Orders> selectGroup(Orders orders);
}
