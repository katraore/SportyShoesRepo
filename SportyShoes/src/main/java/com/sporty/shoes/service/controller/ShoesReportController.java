package com.sporty.shoes.service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sporty.shoes.entity.ShoeEntity;
import com.sporty.shoes.service.ShoesService;

@RestController
@RequestMapping(path="/webapi")
public class ShoesReportController {
	
	ShoesService shoesService;
	
	@RequestMapping("/wepapi")
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
	
public void deleteShoe(@PathVariable int id)
{
	shoesService.deleteShoe(id);
}

@RequestMapping("/allshoe")
public List<ShoeEntity> getAllShoes()
{
	return shoesService.getAllShoes();
}


}
