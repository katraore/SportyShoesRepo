package com.sporty.shoes.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sporty.shoes.entity.PurchaseReportEntity;


public interface PurchaseReportRepository extends JpaRepository<PurchaseReportEntity, Integer> {
	public List<PurchaseReportEntity> findByDop(Date dop);
	public List<PurchaseReportEntity> findByCategory(String category);

}
