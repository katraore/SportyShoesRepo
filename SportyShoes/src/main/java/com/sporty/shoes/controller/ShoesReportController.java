package com.sporty.shoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sporty.shoes.entity.PurchaseReportEntity;
import com.sporty.shoes.entity.ShoeEntity;
import com.sporty.shoes.service.ShoesService;

@RestController
@RequestMapping(path="/")
public class ShoesReportController {
	
	@Autowired
	ShoesService shoesService;
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "That's pretty basic";
	}

@RequestMapping(method=RequestMethod.POST, value="/shoe")	
public void addShoe(ShoeEntity shoe) {
	shoesService.addShoe(shoe);
}

@RequestMapping("/shoe/{id}")
public ShoeEntity getShoe(@PathVariable int id) 
{
	return shoesService.getShoe(id);
	
}

@RequestMapping(method=RequestMethod.PUT, value="/shoe/{id}")
public void updateShoe(@PathVariable int id, @RequestBody ShoeEntity shoe)
{
	shoesService.updateShoe(id, shoe);
}

@RequestMapping(method=RequestMethod.DELETE, value="/shoe/{id}")
public void deleteShoe(@PathVariable int id)
{
	shoesService.deleteShoe(id);
}


@RequestMapping(method=RequestMethod.POST, value="/report")
public void addReport(PurchaseReportEntity report)
{
	shoesService.addReport(report);
}

@RequestMapping("/report/{id}")
public PurchaseReportEntity getReport(@PathVariable int id)
{
	return shoesService.getReport(id);
}

@RequestMapping(method=RequestMethod.PUT, value="/report/{id}")
public void updateReport(@PathVariable int id, @RequestBody PurchaseReportEntity report)
{
	shoesService.updateReport(id, report);
}

@RequestMapping(method=RequestMethod.DELETE, value="/report/{id}")
public void deleteReport(@PathVariable int id)
{
	shoesService.deleteReport(id);
}

}
