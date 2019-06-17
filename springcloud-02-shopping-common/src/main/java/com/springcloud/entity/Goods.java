package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	/**
	 * ��Ʒ���
	 */
    private Integer goodsId;
    /**
	 * ��Ʒ����
	 */
    private String goodsName;
    /**
	 * ��Ʒ�۸�
	 */
    private Double goodsPrice;
    /**
	 * ��Ʒ�ۿۼ�
	 */
    private Double goodsDiscount;
    /**
	 * ��Ʒ״̬��  0Ԥ��  1����  2���¼�
	 */
    private Integer goodsStatus;
    /**
	 * ��Ʒ����
	 */
    private Integer goodsNum;
    /**
	 * �Ƿ���Ʒ  0��Ʒ  1������Ʒ
	 */
    private Integer goodsNew;
    /**
	 * �Ƿ�����
	 */
    private Integer goodsHot;
    /**
	 * ��Ʒ�ȼ�
	 */
    private Integer goodsLevel;
    /**
	 * ��Ʒ���
	 */
    private String goodsDesc;
    /**
	 * ��Ʒ����
	 */
    private String goodsDetail;
    /**
	 * ��ƷͼƬ
	 */
    private String goodsImg;
    /**
	 * ���2���
	 */
    private Integer typeTwoId;
    /**
     * ��ѯ ��������Ʒ�۸�����
     */
    private Double goodsPriceMin;
    /**
     * ��ѯ��������Ʒ�۸�����
     */
    private Double goodsPriceMax;
    /**
     * ��ѯ������һ�����ͱ��
     */
    private Integer typeOneId;
    /**
     * ��Ʒ���������ڱ���ͳ�Ʒ���Ľ��
     */
    private Integer goodsSum;
    
}