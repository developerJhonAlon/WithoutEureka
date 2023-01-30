package com.formacionbdi.springboot.app.item.service;

import java.util.List;

import com.formacionbdi.springboot.app.item.models.Item;

public interface IItemService {
	
	public List<Item> findAll();
	public Item findById(long id,Integer cantidad);
	
}
