package com.mobile;

import java.util.List;

import com.mobileDao.MobileDao;

import mobile.help.Mobile;

public class MobileDemo {

	public static void main(String[] args) {
	
		
		Mobile m1=new Mobile(101,"samsung","galaxy s21",6600,"exynos 2100");
		Mobile m2=new Mobile(102,"oneplus","nord 3",3555,"android os");
		Mobile m3=new Mobile(103,"google","pixel 3A", 44440,"snapdragon");
		
		//for creating the records
		MobileDao md=new MobileDao();
		md.save(m1);
		md.save(m2);
		md.save(m3);
		
		System.out.println("saved sucessfully");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		
		//find/read the record/data
		Mobile f=md.findby(102);
		System.out.println(f);
		
		//update the database
		m2.setPrice(35000);
		md.update(m2);
		System.out.println("updated price  "+35000);
		
		//delete a record
	
		Mobile del=md.deleteById(101);
		System.out.println("deleted record  "+ del);
		
		//getting all the  records
		List<Mobile> mob =md.findAll();
		for ( Mobile mobile : mob) {
			System.out.println(mobile);
		}
		
	}

}
