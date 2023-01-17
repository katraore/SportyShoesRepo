package com.sporty.shoes.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty.shoes.entity.PurchaseReportEntity;
import com.sporty.shoes.entity.ShoeEntity;
import com.sporty.shoes.exceptions.ShoeNotFoundException;
import com.sporty.shoes.repository.PurchaseReportRepository;
import com.sporty.shoes.repository.ShoesRepository;
import com.sporty.shoes.service.ShoesService;

@Service
public class ShoeServiceImpl implements ShoesService {
	
	@Autowired
	ShoesRepository shoesRepository;
	
	@Autowired
	PurchaseReportRepository purchaseReportRepository;

	@Override
	public ShoeEntity addShoe(ShoeEntity shoe) throws ShoeNotFoundException {
		// TODO Auto-generated method stub
		return shoesRepository.save(shoe);
	}

	@Override
	public ShoeEntity getShoe(int id) throws ShoeNotFoundException {
		// TODO Auto-generated method stub
		return shoesRepository.findById(id).get();
	}

	@Override
	public void updateShoe(int id, ShoeEntity shoe) {
		// TODO Auto-generated method stub
		if(shoesRepository.findById(id).isPresent())
		{
			ShoeEntity oldShoeEntity = shoesRepository.findById(id).get();
			oldShoeEntity.setName(shoe.getName());
			oldShoeEntity.setPrice(shoe.getPrice());
			oldShoeEntity.setCategory(shoe.getCategory());
			shoesRepository.save(oldShoeEntity);
		}
		
	}

	@Override
	public void deleteShoe(int id) throws ShoeNotFoundException {
		// TODO Auto-generated method stub
		shoesRepository.deleteById(id);
		
	}

	@Override
	public List<ShoeEntity> getAllShoes() {
		// TODO Auto-generated method stub
		return shoesRepository.findAll() ;
	}

	@Override
	public List<ShoeEntity> getAllShoesBycategory(String category) {
		// TODO Auto-generated method stub
		return shoesRepository.findByCategory(category);
	}

	@Override
	public PurchaseReportEntity addReport(PurchaseReportEntity report) throws ShoeNotFoundException {
		// TODO Auto-generated method stub
		return purchaseReportRepository.save(report);
	}

	@Override
	public PurchaseReportEntity getReport(int id) throws ShoeNotFoundException {
		// TODO Auto-generated method stub
		return purchaseReportRepository.findById(id).get();
	}

	@Override
	public void updateReport(int id, PurchaseReportEntity report) {
		// TODO Auto-generated method stub
		if(purchaseReportRepository.findById(id).isPresent())
		{
			PurchaseReportEntity oldPurchaseReportEntity = purchaseReportRepository.findById(id).get();
			oldPurchaseReportEntity.setCategory(report.getCategory());
			oldPurchaseReportEntity.setDop(report.getDop());
			purchaseReportRepository.save(oldPurchaseReportEntity);
		}
		
	}

	@Override
	public void deleteReport(int id) throws ShoeNotFoundException {
		// TODO Auto-generated method stub
		purchaseReportRepository.deleteById(id);
		
	}

	@Override
	public List<PurchaseReportEntity> getAllReports() {
		// TODO Auto-generated method stub
		return purchaseReportRepository.findAll();
	}

	@Override
	public List<PurchaseReportEntity> getAllReportsByDOP(Date dop) {
		// TODO Auto-generated method stub
		return purchaseReportRepository.findByDop(dop);
	}

	@Override
	public List<PurchaseReportEntity> getAllReportsByCategory(String category) {
		// TODO Auto-generated method stub
		return purchaseReportRepository.findByCategory(category);
	}

}
