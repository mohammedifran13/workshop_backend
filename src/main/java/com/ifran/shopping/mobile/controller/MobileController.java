package com.ifran.shopping.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ifran.shopping.mobile.entity.Mobile;
import com.ifran.shopping.mobile.service.MobileService;



@CrossOrigin("http://localhost:3000/")
@RestController
public class MobileController {

	
	@Autowired
	private MobileService mobService;
	
	
	@GetMapping("/getMobiles")
	public List<Mobile> readAllMobiles(){
	
		return mobService.getAllMobiles();
	
	}
	
	
	@PostMapping("/add")
	public String insertMobile(@RequestBody Mobile mobile) {
	
		mobService.saveMobile(mobile);
	
		return "Mobile Added";
	
	}
	
		
	@PutMapping("/update/{id}")
	
	public Mobile update(@PathVariable int id,@RequestBody Mobile mobile) {
	
		return mobService.updateMobile(id,mobile);
	
	}
	
	
	
	@PutMapping("increasePrice/{val}/{id}")
	
	public String increasePriceById(@PathVariable int val,@PathVariable int id){
	
		int numOfMobiles = mobService.increasePriceById(val,id);
		
		return numOfMobiles + " updated";
		
	}
	
	@PutMapping("decreasePrice/{val}/{id}")
	
	public String decreasePriceById(@PathVariable int val,@PathVariable int id){
	
		int numOfMobiles = mobService.decreasePriceById(val,id);
		
		return numOfMobiles + " updated successfully";
	
	}
	@DeleteMapping("/delete/{id}")
	
	public String deleteMobileId(@PathVariable int id){
	
	return mobService.deleteMobileById(id) + " deleted";

	}
	
	
}