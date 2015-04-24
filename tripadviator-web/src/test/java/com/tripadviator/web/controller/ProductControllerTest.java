package com.tripadviator.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;

public class ProductControllerTest extends BaseControllerTest
{
    @Test
    public void testGetProductByCode() throws Exception
    {
    	mockMvc.perform(get("/products/2280SUN")).andExpect(status().isOk());
    }
}
