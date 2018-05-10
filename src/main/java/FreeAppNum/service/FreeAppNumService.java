package FreeAppNum.service;

public interface FreeAppNumService {
	void getFreeAppNum();//获取免费体验名额
	void  findFreeAppNum(); //会员页-直达客服经理-免费体验名额
	boolean authApply();//后台管理页-审批申请  
}
