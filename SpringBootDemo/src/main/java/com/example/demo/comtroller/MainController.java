package com.example.demo.comtroller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.DoanhNghiepDAO;
import com.example.demo.model.DoanhNghiepInfo;
@Controller
public class MainController {

	
	  @Autowired
	    private DoanhNghiepDAO doanhnghiepDAO;
	 
	    @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String showDoanhNghiep(Model model) {
	        List<DoanhNghiepInfo> list = doanhnghiepDAO.getDoanhNghiep();
 
	       model.addAttribute("doanhnghiep", list);
	 
	       return "doanhnghiepPage";
	    }
	    
	    @RequestMapping(value = "/add")  
	    public String addDoanhnghiep(Model model) {
	    	DoanhNghiepInfo doanhNghiep = new DoanhNghiepInfo();
	      model.addAttribute("doanhnghiep", doanhNghiep);  
	      return "doanhnghiepAdd";  
	    }  
	    
	    
	    public String deleteDoanhNghiep(String id) {
	    	
			return "doanhnghiepPage";
	    	
	    }
	 
}
