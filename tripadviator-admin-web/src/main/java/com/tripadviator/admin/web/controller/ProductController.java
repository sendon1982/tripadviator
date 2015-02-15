package com.tripadviator.admin.web.controller;

import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tripadviator.dao.mongo.product.ProductRepository;
import com.tripadviator.domain.user.UserReview;
import com.tripadviator.serivce.user.request.UserReviewRequest;
import com.tripadviator.serivce.ws.product.ProductImportService;

@Controller
@RequestMapping("/product")
public class ProductController extends BaseController
{
	private static final Log log = LogFactory.getLog(ProductController.class);
	
	@Autowired
	private ProductImportService productImportService;
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(value = "productHomePage.html")
	public ModelAndView showProductHomePage()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/product/productHomePage");
		
		return mv;
	}
	
	
	// --------------------------------------------------------------------------------------------
	// Product Review Section
	// --------------------------------------------------------------------------------------------
	
	/**
	 * Import Product Review into Mongo DB from Viator API service.
	 * 
	 * @return
	 */
	@RequestMapping(value = "importProductReview.html")
	@ResponseBody
	public String importProductReview()
	{
		String url = "http://viatorapi.viator.com/service/product/reviews";
		
		List<String> allProductCode = productRepository.getAllProductCode();
		
		log.info(String.format("Total product from repository is [%s]", allProductCode.size()));
		
		for (String code : allProductCode) 
		{
			UserReviewRequest request = new UserReviewRequest();
			request.setCode(code);
			request.setTopX("1-50000");
			request.setSortOrder("REVIEW_RATING_D");
			
			List<UserReview> reviews = null;
			
			try
			{
				reviews = productImportService.getProductUserReviewList(url, request);
			}
			catch(Exception e)
			{
				System.out.println("Failed for product : " + code);
				System.out.println(e);
				
				// Try again
				try
				{
					Thread.currentThread().sleep(3000);
					reviews = productImportService.getProductUserReviewList(url, request);
				}
				catch(Exception ex)
				{
					System.out.println("Failed for product : " + code);
					System.out.println(ex);
					reviews = Collections.emptyList();
				}
				
			}
			
			for (UserReview userReview : reviews) 
			{
				productRepository.save(userReview);
			}
		}

		return SUCCESS;
	}
	
}
