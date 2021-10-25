package com.exergyRestApi.PartyVerification;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONObject;
import org.xml.sax.SAXException;

import com.PartyVerificationRest.Payloads.PartyApiSitPayloads;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Utilities.ApiHelper;
import Utilities.DataProvider;
import io.restassured.response.Response;

import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.PartyVerificationRest.Payloads.PartyApiSitPayloads;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Utilities.ApiHelper;
import io.restassured.response.Response;

public class TC_007 extends PartyApiSitPayloads {
	
	public static void  TC_007_PersonVerification_RiskRating_Low_ID(ExtentReports extent) throws URISyntaxException, SAXException, IOException, ParserConfigurationException {
		
		
		String PartyVerificationSitUrl = DataProvider.GetPropVal(DataProvider.propertyFilePath, "PartyVerificationSitUrl");
		
		String PartySubId = DataProvider.GetPropVal(DataProvider.propertyFilePath, "PartyVerificationSubId");

		String PartySubKey = DataProvider.GetPropVal(DataProvider.propertyFilePath, "PartyVerificationSubKey");
		
		
		ExtentTest test;
		test=extent.createTest("TC_007_PersonVerification_RiskRating_Low_IdentityNumber");
		Response response;
		response =  ApiHelper.sendRestPostRequest(PartyVerificationSitUrl,PartySubKey, PartySubId,PersonVerificationRRLowID, "/Person/9306116219082/Verification");
		response.prettyPrint();
		ApiHelper.AssertEquals("Status code" ,"200", String.valueOf(response.statusCode()) , test);
		
		
		JSONObject innerJson = new JSONObject(response.getBody().asString());

		String verification = innerJson.get("verification").toString();
		ApiHelper.AssertEquals("verification" ,"Verified", verification, test);
		
		String externalReference = innerJson.get("externalReference").toString();
		ApiHelper.AssertEquals("externalReference" ,"MyRef123", externalReference, test);
		

		String riskRating = innerJson.getJSONObject("riskRatingResult").getString("riskRating");
		ApiHelper.AssertEquals("riskRating" ,"Low", riskRating, test);

		String riskRatingReason = innerJson.getJSONObject("riskRatingResult").getString("riskRatingReason");
		ApiHelper.AssertEquals("riskRatingReason" ,"Premium Collection Is Cash", riskRatingReason, test);

		test.info( "ID Number used: 9306116219082");
		
		test.info( "Find payload(Request) below");
		
		test.info( MarkupHelper.createCodeBlock(PersonIndentificationBasic,CodeLanguage.JSON));
		test.info( "Find response below");
		test.info( MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.JSON));
			
		
		
	}


	


	

}

