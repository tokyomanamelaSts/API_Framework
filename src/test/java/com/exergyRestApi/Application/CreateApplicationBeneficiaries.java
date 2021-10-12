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

public class CreateApplicationBeneficiaries extends CreateApplicationPayloads {

public static void  createApplicationBeneficiaries(ExtentReports extent) throws URISyntaxException, SAXException, IOException, ParserConfigurationException {
	
	
	
	ExtentTest test;
	test=extent.createTest("create Application Beneficiaries");
	Response response;
	response =  ApiHelper.sendRestPutRequest(ApiHelper.applicationSitUrl,ApiHelper.applicationSubKey, ApiHelper.applicationSubId,CreateApplicationBeneficiariesPayLoad, "/Application/1598/Beneficiaries");
	ApiHelper.AssertEquals("Status code" ,"200", String.valueOf(response.statusCode()) , test);
	
	
	JSONObject innerJson = new JSONObject(response.getBody().asString());
	String applicationRef = innerJson.get("applicationReference").toString();
	ApiHelper.AssertEquals("application Reference" ,"1598", applicationRef, test);
	
	String sourceReference = innerJson.get("sourceReference").toString();
	ApiHelper.AssertEquals("source Reference" ,"T01", sourceReference, test);
	
	String benefitPremiums = innerJson.getJSONObject("premiumAmount").getString("benefitPremiums");
	ApiHelper.AssertEquals("benefit Premiums" ,"256", benefitPremiums, test);
	
	//String bankAccount = innerJson.getJSONObject("premiumCollection").getJSONObject("bankAccount").getString("accountNumber");
	//ApiHelper.AssertEquals("Account Number" ,"123123123", bankAccount, test);
	
	
	test.info( MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.JSON));
	
	
	
	//String pageName = innerJson.getJSONObject("applicationReference").getString("deviceSerialNumber");
	


}
}
