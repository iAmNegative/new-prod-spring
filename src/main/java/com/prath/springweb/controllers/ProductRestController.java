package com.prath.springweb.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prath.springweb.entities.Message;
import com.prath.springweb.entities.Product;
import com.prath.springweb.repos.ChatUtil;

@RestController
public class ProductRestController {

//	@Autowired
//	ProductRepository repository;
	
	@Autowired
	ChatUtil chatUtil; 
	
//	@RequestMapping(value="/products/",method=RequestMethod.GET)
// public List<Product> getProducts(){
//		return repository.findAll();
//	}
//	
//
//	@RequestMapping(value="/products/{id}",method = RequestMethod.GET)
//		public Product getProduct(@PathVariable("id") int id) {
//			return repository.findById(id).get();
//		}
//	@RequestMapping(value="/products/",method = RequestMethod.POST)
//	public Product createProduct(@RequestBody Product product) {
//		return repository.save(product);
//	}
//	
//	@RequestMapping(value="/products/",method = RequestMethod.PUT)
//	public Product updateProduct(@RequestBody Product product) {
//		return repository.save(product);
//	}
//	
//	@RequestMapping(value="/products/{id}",method = RequestMethod.DELETE)
//	public void DeleteProduct(@PathVariable("id") int id) {
//		repository.deleteById(id);
//	}
	
	@RequestMapping(value="/get/all/messages/",method=RequestMethod.GET)
	public List<Message> getMessage() throws IOException
	{
		
		return chatUtil.getMessages();
	}
	
	
	
}
