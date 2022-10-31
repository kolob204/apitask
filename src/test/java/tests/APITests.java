package tests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import helpers.CommonCode;
import helpers.TestData;
import pojo.User;
import pojo.UserCreationResponse;

public class APITests extends BaseTest {

	
    @Test(testName = "Создание пользователя", dataProvider = "preparedData", dataProviderClass = TestData.class)    
    public void firstHomeTest(User user) {   	
      
        UserCreationResponse createdUser = given()
        		.body(user)
                .post("/rest/createuser").as(UserCreationResponse.class);
        
        Assert.assertEquals(user.getName(), createdUser.getName());
        Assert.assertEquals(user.getEmail().toLowerCase(), createdUser.getEmail().toLowerCase());
        Assert.assertEquals(user.getHobby(), createdUser.getHobby());
        Assert.assertEquals(user.getPhone(), createdUser.getPhone());
        
        Assert.assertTrue(CommonCode.compareArrays(user.getCompanies(),createdUser.getCompaniesAsIntArrayOfId()));
     
    }

 

    
}
