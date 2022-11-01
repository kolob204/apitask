package tests;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import helpers.CommonCode;
import helpers.TestData;
import pojo.UserCreationResponse;

public class APITests extends BaseTest {

	
    @Test(testName = "Создание пользователя", dataProvider = "preparedData", dataProviderClass = TestData.class)    
    public void firstHomeTest(JSONObject user) {   	
      
    	UserCreationResponse createdUser = given()
        		.body(user)
                .post("/rest/createuser").as(UserCreationResponse.class);
    	
        Assert.assertEquals(user.get("name"), createdUser.getName());
        Assert.assertEquals(user.get("email").toString().toLowerCase(), createdUser.getEmail().toLowerCase());
        Assert.assertEquals(user.get("hobby"), createdUser.getHobby());
        Assert.assertEquals(user.get("phone"), createdUser.getPhone());
     
        Assert.assertTrue(CommonCode.compareArrays((int[]) user.get("companies"),createdUser.getCompaniesAsIntArrayOfId()));      
    }    
}
