package com.tripadviator.admin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tripadviator.serivce.ws.product.ProductImportService;

@Controller
@RequestMapping("/product")
public class ProductController extends BaseController
{
	@Autowired
	private ProductImportService productImportService;
	
	@RequestMapping(value = "productHomePage.html")
	public ModelAndView showProductHomePage()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/product/productHomePage");
		
		return mv;
	}
	
	
}
