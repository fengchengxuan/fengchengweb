package FreeAppNum.service;

import java.util.List;

import freeapply.entity.FreeApplyNum;

public interface FreeAppNumService {

	 List<FreeApplyNum> getFreeAppNum();//��ȡ�����������//��Աҳ-ֱ��ͷ�����-�����������

	//List<FreeApplyNum> getFreeAppNum();//��ȡ�����������

	void  findFreeAppNum(); //��Աҳ-ֱ��ͷ�����-�����������
	boolean authApply();//��̨����ҳ-��������  
}
