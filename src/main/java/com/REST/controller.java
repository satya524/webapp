package com.REST;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@GetMapping(value = "/API", produces = {"Application/json"})

	public String save() {
		return "satya";
	}
	
	@GetMapping(value="/getRecords",produces = "application/json")
	@ResponseBody
	public List<Map<String, Object>> getRecords() {
		String query = "SELECT issuedBy FROM IssuedBydetails";
		List<Map<String,Object>> issuedDetails = jdbctemplate.queryForList(query);

		return issuedDetails;
		 
	}
	
}
