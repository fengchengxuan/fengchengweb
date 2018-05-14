package FreeAppNum.service;

import java.util.List;

import freeapply.entity.FreeApplyNum;

public interface FreeAppNumService {

	 List<FreeApplyNum> getFreeAppNum();//获取免费体验名额//会员页-直达客服经理-免费体验名额

	//List<FreeApplyNum> getFreeAppNum();//获取免费体验名额

	void  findFreeAppNum(); //会员页-直达客服经理-免费体验名额
	boolean authApply();//后台管理页-审批申请  
}
