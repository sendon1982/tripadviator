package com.tripadviator.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.springframework.http.MediaType;

public class ProductControllerTest extends BaseControllerTest
{
    @Test
    public void testGetProductByCode() throws Exception
    {
    	mockMvc.perform(get("/products/2280SUN").contentType(MediaType.APPLICATION_JSON)).
    		andExpect(status().isOk());
    }
}
