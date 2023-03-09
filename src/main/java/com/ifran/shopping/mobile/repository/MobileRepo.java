package com.ifran.shopping.mobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ifran.shopping.mobile.entity.Mobile;

public interface MobileRepo extends JpaRepository<Mobile,Integer> {
	
	@Modifying
	@Transactional
	@Query("update Mobile b set b.price = b.price + ?1 where b.id in ?2")
	int increasePriceById(int val,int id);
	
	@Modifying
	@Transactional
	@Query("update Mobile b set b.price = b.price - ?1 where b.id in ?2")
	int decreasePriceById(int val,int id);
	
	@Modifying
	@Transactional
	    @Query("delete from Mobile b where b.id = :Id")
	    int deleteMobileById(@Param("Id") int id);
}