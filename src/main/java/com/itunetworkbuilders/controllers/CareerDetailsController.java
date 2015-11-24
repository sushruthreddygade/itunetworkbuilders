/**
 * 
 */
package com.itunetworkbuilders.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itunetworkbuilders.model.Alumni;
import com.itunetworkbuilders.model.CareerDetails;
import com.itunetworkbuilders.model.Person;

/**
 * @author sushruthreddygade
 *
 */
@Controller
@RestController
public class CareerDetailsController {
	

	@Autowired
    private JdbcTemplate jdbcTemplate;
 
 @RequestMapping(value = "/person")
    public
    @ResponseBody
    CareerDetails dailyStats(@RequestParam Integer id) {
        String query = "SELECT first_name, last_name, age" +
                " from person where person.id = " + id;

        return jdbcTemplate.queryForObject(query, (resultSet, i) -> {
            return new CareerDetails (resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3));
        });

    }
 
 @RequestMapping(value = "/alumni_info_list")
  public List<Alumni> getInvoices() {
	 String sql = "SELECT * FROM alumni_info";
	 List<Alumni> invoices = new ArrayList<Alumni>();
	 
	 List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			Alumni invoices1 = new Alumni(sql, sql, sql, sql, sql, sql, sql, sql);
			invoices1.setName((String) row.get("name"));
			invoices1.setPhone_no ((String) row.get("phone_no"));
			invoices1.setEmail_id((String) row.get("email_id"));
			invoices1.setItu_degree((String) row.get("itu_degree"));
			invoices1.setJob_title((String) row.get("job_title"));
			invoices1.setCompany((String) row.get("company"));
			invoices1.setLocation((String) row.get("location"));
			invoices1.setLinkedin((String) row.get("linkedin"));
			invoices.add(invoices1);
		}
	 return invoices;
		
 }
 
 
 
 
// 
// @RequestMapping(value = "/person")
// public
// @ResponseBody
// CareerDetails dailyStats2(@RequestParam String fname, String lname1, Integer age1) {
//     String query = "INSERT INTO person (first_name, last_name, age) VALUES(?,?,?)", +fname, +lname, +age };
//     
//     
//
//     return jdbcTemplate.queryForObject(query, (resultSet, i) -> {
//         return new CareerDetails (resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3));
//     });
//
// }
 
 @RequestMapping(value = "/alumni_info")
 public
 @ResponseBody
 Alumni dailyStats1(@RequestParam String id ) {
     String query = "SELECT *" +
             " from alumni_info where alumni_info.phone_no= " +id;

     return jdbcTemplate.queryForObject(query, (resultSet, i) -> {
         return new Alumni (resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4), resultSet.getString(5), resultSet.getString(6),resultSet.getString(7), resultSet.getString(8));
     });

 }
 
//	@RequestMapping("/careerdetails")	
//	 public List<CareerDetails> getcareerdetails(){
//		List<CareerDetails> careerdetails = getListing();
//		return careerdetails;
//		
//	}
//
//	public List<CareerDetails> getListing() {
//										
//		List<CareerDetails> careerdetails = new ArrayList<>();
//		careerdetails.add(new CareerDetails("jobid","Java Developer"));
//		
//		return careerdetails;
//	}
//
//	@RequestMapping("/test")
//	public String testData(@RequestBody String payload) throws Exception {
//		return "OK";
//	}
//	
//	@RequestMapping("/test")
//	public String testBackend(){
//		String sql ="SELECT" + "*" + "FROM sim_data limit 10";
//		return sql;
//	}
}


