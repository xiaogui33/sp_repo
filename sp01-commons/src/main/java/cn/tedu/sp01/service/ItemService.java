package cn.tedu.sp01.service;

import java.util.List;

import cn.tedu.sp01.pojo.Item;

public interface ItemService {
	//���ݶ������,��ѯ�����е���Ʒ�б�
	List<Item> getItems(String orderId);
	
	//������Ʒ���,���涩��ʱ,������������Ʒ�Ŀ��Ҫ����
	void decreaseNumbers(List<Item> list);
}