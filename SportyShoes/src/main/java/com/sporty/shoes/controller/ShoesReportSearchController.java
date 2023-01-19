package com.sporty.shoes.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sporty.shoes.entity.PurchaseReportEntity;
import com.sporty.shoes.entity.ShoeEntity;
import com.sporty.shoes.service.ShoesService;

@RestController
@RequestMapping(path="/adm")
public class ShoesReportSearchController {
	
	@Autowired
	ShoesService shoeService;
	
	
	@RequestMapping("/allshoe")
	public List<ShoeEntity> getAllShoes()
	{
		return shoeService.getAllShoes();
	}
	
	@RequestMapping("/shoe/category")
	public List<ShoeEntity> getAllShoesByCategory(@PathVariable String category)
	{
		return shoeService.getAllShoesBycategory(category);
	}
	
	@RequestMapping("/allreport")
	public List<PurchaseReportEntity> getAllReports()
	{
		return shoeService.getAllReports();
	}
	
	@RequestMapping("/report/category")
	public List<PurchaseReportEntity> getAllReportsByCategory(@PathVariable String category)
	{
		return shoeService.getAllReportsByCategory(category);
	}
	
	@RequestMapping("/report/dop")
	public List<PurchaseReportEntity> getAllReportsByDOP(@PathVariable Date dop)
	{
		return shoeService.getAllReportsByDOP(dop);
	}


}
