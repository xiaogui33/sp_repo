package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

public interface UserService {
	//�����û�id,��ȡ�û���Ϣ
	User getUser(Integer id);
	
	//�����û�����, ����:�û�id,���ӵĻ���
	void addScore(Integer id, Integer score);
}
