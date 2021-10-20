package com.exergyRestApi.Application;

import com.applicationPayloads.CreateApplicationPayloads;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Utilities.ApiHelper;
import io.restassured.response.Response;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONObject;
import org.xml.sax.SAXException;


public class CreateApplicationPremiumCollection extends CreateApplicationPayloads {

public static void  createApplicationPremiumCollection(ExtentReports extent) throws URISyntaxException, SAXException, IOException, ParserConfigurationException {
	
	
	
	ExtentTest test;
	test=extent.createTest("Create Application Premium Collection");
	Response response;
	response =  ApiHelper.sendRestPutRequest(ApiHelper.applicationSitUrl,ApiHelper.applicationSubKey, ApiHelper.applicationSubId,CreateApplicationPremiumCollection, "/Application/101975/PremiumCollection");
	response.prettyPrint();
	ApiHelper.AssertEquals("Status code" ,"200", String.valueOf(response.statusCode()) , test);
	
	
    JSONObject innerJson = new JSONObject(response.getBody().asString());
	
    String sourceReference = innerJson.get("sourceReference").toString();
	ApiHelper.AssertEquals("source Reference" ,"T00005100", sourceReference, test);
	
    String productCode = innerJson.get("productCode").toString();
	ApiHelper.AssertEquals("product Code" ,"60200000", productCode, test);
	
    String campaignCode = innerJson.get("campaignCode").toString();
	ApiHelper.AssertEquals("Campaign Code" ,"60200000", campaignCode, test);
	
	
	
	
	test.info( "Find payload(Request) below");
    test.info( MarkupHelper.createCodeBlock(CreateApplicationPremiumCollection,CodeLanguage.JSON));
    test.info( "Find response below");
    test.info( MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.JSON));

	
}

}
