package com.sporty.shoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sporty.shoes.entity.ShoeEntity;


public interface ShoesRepository extends JpaRepository<ShoeEntity, Integer> {

	List<ShoeEntity> findByCategory(String category);

}
