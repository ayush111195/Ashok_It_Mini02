package com.ayush.services;

import java.util.List;

import com.ayush.request.SearchRequest;
import com.ayush.responce.SearchResponce;

import jakarta.servlet.http.HttpServletResponse;

public interface EligibilityService {

	public List<String>getUniquePlanNames();
	
	public List<String>getUniquePlanStatus();
	
	public List<SearchResponce>search(SearchRequest request);
	
	public void generateExcel(HttpServletResponse response)throws Exception;
	
	public void generatePdf(HttpServletResponse response)throws Exception;

	
	
}
