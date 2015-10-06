/**
 * 
 */
package com.itunetworkbuilders.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itunetworkbuilders.model.CareerDetails;

/**
 * @author sushruthreddygade
 *
 */
@Controller
@RestController
public class CareerDetailsController {
	

	@RequestMapping("/careerdetails")	
	 public List<CareerDetails> getcareerdetails(){
		List<CareerDetails> careerdetails = getListing();
		return careerdetails;
		
	}

	public List<CareerDetails> getListing() {
										
		List<CareerDetails> careerdetails = new ArrayList<>();
		careerdetails.add(new CareerDetails("jobid","Java Developer"));
		
		return careerdetails;
	}

}
