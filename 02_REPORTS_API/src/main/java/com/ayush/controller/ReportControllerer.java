package com.ayush.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayush.request.SearchRequest;
import com.ayush.responce.SearchResponce;
import com.ayush.services.EligibilityServicesImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportControllerer {

	@Autowired
	private EligibilityServicesImpl eligibilityServicesImpl;
	
	@GetMapping("/plans")
	public ResponseEntity<List<String>> getPlanName(){
		List<String>planNames=eligibilityServicesImpl.getUniquePlanNames();
		return new ResponseEntity<>(planNames,HttpStatus.OK);
	}
	
	@GetMapping("/status")
	public ResponseEntity<List<String>> getPlanStatus(){
		List<String>planStatus=eligibilityServicesImpl.getUniquePlanStatus();
		return new ResponseEntity<>(planStatus,HttpStatus.OK);
	}
	@PostMapping("/search")
	public ResponseEntity<List<SearchResponce>>search(@RequestBody SearchRequest request){
		List<SearchResponce> response=	eligibilityServicesImpl.search(request);
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	@GetMapping("/excel")
	public void excelReporrt(HttpServletResponse responce) throws Exception{
		responce.setContentType("application/octet-stream");
		
		String headerkey="Content-Disposition";
		String headerValue="attachment;filename=data.xlsx";
		responce.setHeader(headerkey, headerValue);
		eligibilityServicesImpl.generateExcel(responce);
	}
	
	@GetMapping("/pdf")
	public void pdfReport(HttpServletResponse response)throws Exception {
		response.setContentType("application/pdf");
		String headerkey="Content-Disposition";
		String headerValue="attachment;filename=data.pdf";
		response.setHeader(headerkey, headerValue);
		eligibilityServicesImpl.generatePdf(response);

	}
}
