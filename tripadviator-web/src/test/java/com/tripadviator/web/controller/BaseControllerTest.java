package com.tripadviator.web.controller;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-config.xml"})
@WebAppConfiguration
public abstract class BaseControllerTest 
{
	MockMvc mockMvc;
	
    RequestMappingHandlerAdapter handlerAdapter;
    ObjectMapper mapper;
    
    @Autowired
    WebApplicationContext webApplicationContext;
    
    @SuppressWarnings("rawtypes")
	HttpMessageConverter mappingJackson2HttpMessageConverter;

    @Before
    public void setUp() 
    {
    	mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    	mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();

        mapper = new ObjectMapper();
    }
    
    @After
    public void tearDown()
    {
    	mockMvc = null;
    }
    
    @SuppressWarnings("unchecked")
	protected String json(Object object) throws IOException 
    {
        MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
        this.mappingJackson2HttpMessageConverter.write(object, MediaType.APPLICATION_JSON, mockHttpOutputMessage);
        return mockHttpOutputMessage.getBodyAsString();
    }
}
