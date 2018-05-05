package com.test.lamda;

public class TyreDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=()->{
			return "MAXIS_17inch";
		};

		System.out.println(" Ouput " + car.getTyreDetails());
	}

}
