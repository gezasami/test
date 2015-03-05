package edu.mum.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.domain.Product;
import edu.mum.form.ProductForm;

@Controller
public class ProductController  {


	@RequestMapping(value={"/","product_input.action"}, method=RequestMethod.GET)
    public ModelAndView handleRequest() throws Exception {
    	
    	
    	
    	ModelAndView mav=new ModelAndView("ProductForm");
    	
        return mav;
    }
    
	@RequestMapping(value={"product_save.action"}, method=RequestMethod.GET)
    public ModelAndView handleRequest(Product product) throws Exception {
       

        return new ModelAndView("ProductDetails");
    }

}
