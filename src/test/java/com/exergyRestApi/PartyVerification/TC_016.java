package com.exergyRestApi.PartyVerification;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONObject;
import org.xml.sax.SAXException;

import com.PartyVerificationRest.Payloads.PartyApiSitPayloads;
import com.PartyVerificationRest.Payloads.PartyApiUatPayloads;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Utilities.ApiHelper;
import Utilities.DataProvider;
import io.restassured.response.Response;

public class TC_016 extends PartyApiUatPayloads {
	
public static void PersonIdentification_Enhanced_Invalid_ID_Format(ExtentReports extent) throws URISyntaxException, SAXException, IOException, ParserConfigurationException {
		
		
		
    String PartyVerificationUATUrl = DataProvider.GetPropVal(DataProvider.propertyFilePath, "PartyVerificationUATUrl");
	
	String PartySubId = DataProvider.GetPropVal(DataProvider.propertyFilePath, "PartyVerificationSubId");

	String PartySubKey = DataProvider.GetPropVal(DataProvider.propertyFilePath, "PartyVerificationSubKey");
		
	
	
	ExtentTest test;
	test=extent.createTest("TC_016_PersonIdentification_Enhanced_Invalid_ID_Format");
	Response response;
	response =  ApiHelper.sendRestPostRequest(PartyVerificationUATUrl,PartySubKey, PartySubId,PersonIndentificationEnhanced, "/Person/42345018089/Identification");
	
	ApiHelper.AssertEquals("Status code" ,"400", String.valueOf(response.statusCode()) , test);
	
	
	//Validations
	
	JSONObject innerJson = new JSONObject(response.getBody().asString());
	
	String errorCode = innerJson.get("ErrorCode").toString();
	ApiHelper.AssertEquals("Error Code" ,"101", errorCode, test);
	

	String error = innerJson.get("ErrorMessage").toString();
	ApiHelper.AssertEquals("Error Message" ,"Identity Number not in the correct format |", error, test);
	
	String uri = innerJson.get("URI").toString();
	ApiHelper.AssertEquals("uri" ," https://hollard-life-partyapi-uat.azurewebsites.net/Person/42345018089/Identification", uri, test);

	String type = innerJson.get("Type").toString();
	ApiHelper.AssertEquals("type" ,"Client", type, test);
	
	
	test.info( "ID Number(Invalid) used: 42345018089");
	
	test.info( "Find payload(Request) below");
    test.info( MarkupHelper.createCodeBlock(PersonIndentificationEnhanced,CodeLanguage.JSON));
    test.info( "Find response below");
    test.info( MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.JSON));
	
	
	}

	

}