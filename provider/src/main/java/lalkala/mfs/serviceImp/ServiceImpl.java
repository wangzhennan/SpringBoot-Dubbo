package lalkala.mfs.serviceImp;

import lakala.api.PayService;

public class ServiceImpl implements PayService{

	public void pay() {
		System.out.println("pay $100");
	}

	public String payMoney(int  num) {
		return "pay $"+num;
	}

}
