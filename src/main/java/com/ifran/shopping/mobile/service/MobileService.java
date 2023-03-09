package com.ifran.shopping.mobile.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifran.shopping.mobile.entity.Mobile;
import com.ifran.shopping.mobile.repository.MobileRepo;


@Service
public class MobileService {
	@Autowired
	private MobileRepo mobRepo;
	
	public List<Mobile> getAllMobiles(){
		return mobRepo.findAll();
	}
	
	public Mobile saveMobile(Mobile mobile) {
	return mobRepo.save(mobile);
	}
	
	public Mobile updateMobile(int id,Mobile mobile) {
	mobile.setId(id);
	return mobRepo.saveAndFlush(mobile);
	}
	
	public int deleteMobileById(int id) {
	    return mobRepo.deleteMobileById(id);
	 }
	
	public int increasePriceById(int val,int id) {
	    return mobRepo.increasePriceById(val,id);
	}
	    
	public int decreasePriceById(int val,int id) {
	    return mobRepo.decreasePriceById(val,id);
	}
	    
	
	
}
	
