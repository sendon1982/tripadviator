package com.tripadviator.dao.base;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tripadviator.dao.mongo.product.ProductRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:tripadviator-service.xml"})
public abstract class BaseRepositoryTestCase extends TestCase
{
	@Autowired
	protected ProductRepository productRepository;
	
	@Before
	public void setUp()
	{
		
	}
	
	@After
	public void tearDown()
	{
		
	}
}
