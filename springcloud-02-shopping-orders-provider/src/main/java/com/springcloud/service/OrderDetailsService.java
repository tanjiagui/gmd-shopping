/**
 * 
 */
package com.springcloud.service;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.OrderDetails;

/**
 * ������ϸģ���ģ�Ͳ�
 * 
 * @author tanjiagui
 *
 */
public interface OrderDetailsService {
	/**
	 * ��ѯָ��������ŵĶ�����ϸ��Ϣ����ҳ���ܣ�
	 * 
	 * @param orderId    �������
	 * @param pageNumber ҳ��
	 * @return ����com.github.pagehelper.PageInfo<OrderDetails>���͵�ʵ��
	 */
	public abstract PageInfo<OrderDetails> selectByOrderId(Integer orderId, Integer pageNumber);
}