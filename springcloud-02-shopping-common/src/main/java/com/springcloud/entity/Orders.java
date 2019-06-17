package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  ORDER���Ӧ��ʵ���࣬���ڷ�װһ�ж�����Ϣ
 * @author tanjiagui
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4992635554984637133L;
	/*
	 * ��ǰ������Ӧ���û���Ϣ
	 */
	private Users user;
	
	/*
	 * �û����
	 */
	private Integer userId;
	
	private Integer orderId;
	/*
	 * �ջ������������ʡ��Ĭ��Ϊ�û����е��û�����
	 */
	private String receiverName;
	/*
	 * �ջ��˵绰�����ʡ��Ĭ��Ϊ�û����е��û��绰
	 */
	private String receiverTel;
	/*
	 * �ջ��˵�ַ�������ʡ��Ĭ��Ϊ�û����е��û���ַ
	 */
	private String receiverAddr;
	/*
	 * ����ʱ��
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderTime;
	/*
	 * �����ܶ�
	 */
	private Double orderTotal;
	/*
	 * ����״̬
	 */
	private Integer orderStatus;
	
	/*
	 * ��ѯ������������ʼʱ��
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMin;
	/*
	 * ������ֹʱ��
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMax;
	/*
	 * ��ѯ��������ʼ����
	 */
	private String startMonth;
	/*
	 * ��ѯ��������ֹ����
	 */
	private String endMonth;
	/*
	 * ͳ�ƽ��������
	 */
	private String orderMonth;
	/*
	 * ͳ�ƽ�������۶�
	 */
	private Double orderPrice;
}