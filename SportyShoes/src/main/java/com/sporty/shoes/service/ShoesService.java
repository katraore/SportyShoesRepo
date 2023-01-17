package com.sporty.shoes.service;

import java.util.Date;
import java.util.List;

import com.sporty.shoes.entity.PurchaseReportEntity;
import com.sporty.shoes.entity.ShoeEntity;
import com.sporty.shoes.exceptions.ShoeNotFoundException;

public interface ShoesService {
	
	public ShoeEntity addShoe(ShoeEntity shoe) throws ShoeNotFoundException;
	public ShoeEntity getShoe(int id) throws ShoeNotFoundException;
	public void updateShoe(int id, ShoeEntity shoe);
	public void deleteShoe(int id) throws ShoeNotFoundException;
	public List<ShoeEntity> getAllShoes();
	public List<ShoeEntity> getAllShoesBycategory(String category);
	
	
	public PurchaseReportEntity addReport(PurchaseReportEntity report) throws ShoeNotFoundException;
	public PurchaseReportEntity getReport(int id) throws ShoeNotFoundException;
	public void updateReport(int id, PurchaseReportEntity report);
	public void deleteReport(int id) throws ShoeNotFoundException;
	public List<PurchaseReportEntity> getAllReports();
	public List<PurchaseReportEntity> getAllReportsByDOP(Date dop);
	public List<PurchaseReportEntity> getAllReportsByCategory(String category);

}
