package com.kiyana.deom3;

public class Demo1 {
	public static void main(String[] args) {
		Store store=new KFC();
		store.sale();
		StoreManager manager=new StoreManager();
		manager.show(new Dicos());
	}
}
