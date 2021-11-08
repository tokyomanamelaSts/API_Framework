package com.exergyRestApi.Product.Rates;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.xml.sax.SAXException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.exergyRestApi.Repo.Product.ProductsRateRepo;
import com.payloads.rates.ratesPayloads;

import Utilities.ApiHelper;
import Utilities.DataProvider;
import io.restassured.response.Response;


public class RatesTestCases extends ProductsRateRepo{

	
	public static void  Tc1ToTC3(ExtentReports extent) throws URISyntaxException, SAXException, IOException, ParserConfigurationException, FilloException {
		
		

        String productSitUrl = DataProvider.GetPropVal(DataProvider.propertyFilePath, "productSitUrl");
		String productSubId = DataProvider.GetPropVal(DataProvider.propertyFilePath, "SubId");
		String productSubKey = DataProvider.GetPropVal(DataProvider.propertyFilePath, "SubKey");
		ExtentTest test = null;
		Response response = null;
		
		String Query = "Select * from Requests where RunMe = 'Yes'";
		
		Recordset recordset =DataProvider.getDataFromExcelbyQuery("TestData/rates.xlsx",Query );
		
		while(recordset.next()){
			
			loadRequestData(recordset);
			String reqBody= ratesPayloads.getProductsRates( lifeAssuredType1,Age1,lifeAssuredType2,Age2,lifeAssuredType3,Age3,lifeAssuredType4,Age4);	
		    test=extent.createTest(TestCaseNumber);
		    loadTCExpectedResponse(TestCaseNumber) ;
		    response =  ApiHelper.sendRestPostRequest(productSitUrl, productSubKey, productSubId, reqBody,"/Products/"+ProductCode+"/Rates?campaignCode="+ ProductCode);
		    test.info( MarkupHelper.createCodeBlock(description));
		  
		    ApiHelper.AssertEquals("Status code" ,"200", String.valueOf(response.statusCode()) , test);
			
			
			
			
			//Validations
			JSONObject innerJson = new JSONObject(response.getBody().asString());
			
			//Main premiums
			String premiumAmount10K = innerJson.getJSONArray("lifesAssured").getJSONObject(0).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(0).get("premiumAmount").toString();
			ApiHelper.AssertEquals("Main premium amount on R10 000 ", MainpremiumAmount10K, premiumAmount10K, test);
			
			String premiumAmount15K = innerJson.getJSONArray("lifesAssured").getJSONObject(0).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(1).get("premiumAmount").toString();
			ApiHelper.AssertEquals("Main premium amount on R15 000 ", MainpremiumAmount15K, premiumAmount15K, test);
			
			String premiumAmount20K = innerJson.getJSONArray("lifesAssured").getJSONObject(0).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(2).get("premiumAmount").toString();
			ApiHelper.AssertEquals("Main premium amount on R20 000 ", MainpremiumAmount20K, premiumAmount20K, test);
			
			String premiumAmount35K = innerJson.getJSONArray("lifesAssured").getJSONObject(0).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(3).get("premiumAmount").toString();
			ApiHelper.AssertEquals("Main premium amount on R35 000 ", MainpremiumAmount35K, premiumAmount35K, test);
			
			String premiumAmount50K = innerJson.getJSONArray("lifesAssured").getJSONObject(0).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(4).get("premiumAmount").toString();
			ApiHelper.AssertEquals("Main premium amount on R50 000 ", MainpremiumAmount50K, premiumAmount50K, test);
			
			
			
			
			
			//Partner premiums
			
			String partnerAmount10K = innerJson.getJSONArray("lifesAssured").getJSONObject(1).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(0).get("premiumAmount").toString();
			ApiHelper.AssertEquals("partner premium amount on R10 000 ", partnerPremiumAmount10K, partnerAmount10K, test);
			
			String partnerAmount15K = innerJson.getJSONArray("lifesAssured").getJSONObject(1).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(1).get("premiumAmount").toString();
			ApiHelper.AssertEquals("partner premium amount on R15 000 ", partnerPremiumAmount15K, partnerAmount15K, test);
			
			String partnerAmount20K = innerJson.getJSONArray("lifesAssured").getJSONObject(1).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(2).get("premiumAmount").toString();
			ApiHelper.AssertEquals("partner premium amount on R20 000 ", partnerPremiumAmount20K, partnerAmount20K, test);
			
			String partnerAmount35K = innerJson.getJSONArray("lifesAssured").getJSONObject(1).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(3).get("premiumAmount").toString();
			ApiHelper.AssertEquals("partner premium amount on R35 000 ", partnerPremiumAmount35K, partnerAmount35K, test);
			
			String partnerAmount50K = innerJson.getJSONArray("lifesAssured").getJSONObject(1).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(4).get("premiumAmount").toString();
			ApiHelper.AssertEquals("partner premium amount on R50 000 ", partnerPremiumAmount50K, partnerAmount50K, test);
			
			
			
			
			
			//Child premiums
			
			String ChildAmount5K = innerJson.getJSONArray("lifesAssured").getJSONObject(2).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(0).get("premiumAmount").toString();
			ApiHelper.AssertEquals("child premium amount on R5 000 ", ChildPremiumAmount5K, ChildAmount5K, test);
			
			String ChildAmount10K = innerJson.getJSONArray("lifesAssured").getJSONObject(2).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(1).get("premiumAmount").toString();
			ApiHelper.AssertEquals("child premium amount on R10 000 ", ChildPremiumAmount10K, ChildAmount10K, test);
			
			String ChildAmount15K = innerJson.getJSONArray("lifesAssured").getJSONObject(2).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(2).get("premiumAmount").toString();
			ApiHelper.AssertEquals("child premium amount on R15 000 ", ChildPremiumAmount15K, ChildAmount15K, test);
			
			String ChildAmount20K = innerJson.getJSONArray("lifesAssured").getJSONObject(2).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(3).get("premiumAmount").toString();
			ApiHelper.AssertEquals("child premium amount on R20 000 ", ChildPremiumAmount20K, ChildAmount20K, test);
			
		    //Parent premiums
			
			String ParentAmount10K = innerJson.getJSONArray("lifesAssured").getJSONObject(3).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(0).get("premiumAmount").toString();
			ApiHelper.AssertEquals("Parent premium amount on R5 000 ", ParentPremiumAmount10K, ParentAmount10K, test);
			
			String ParentAmount15K = innerJson.getJSONArray("lifesAssured").getJSONObject(3).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(1).get("premiumAmount").toString();
			ApiHelper.AssertEquals("Parent premium amount on R10 000 ", ParentPremiumAmount15K, ParentAmount15K, test);
			
			
			String ParentAmount20K = innerJson.getJSONArray("lifesAssured").getJSONObject(3).getJSONArray("benefits").getJSONObject(0).getJSONArray("premiums").getJSONObject(2).get("premiumAmount").toString();
			ApiHelper.AssertEquals("Parent premium amount on R10 000 ", ParentPremiumAmount20K, ParentAmount20K, test);
			
			
			
			
			}
		test.info( "Find response below");
		test.info( MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.JSON));		
	}
	
	
}