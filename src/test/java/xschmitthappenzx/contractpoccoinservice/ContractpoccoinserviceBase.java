package xschmitthappenzx.contractpoccoinservice;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xschmitthappenzx.contractpoccoinservice.controllers.CoinController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContractPocCoinServiceApplication.class)
public class ContractpoccoinserviceBase {

    @Autowired CoinController coinController;

    @Before
    public void setup(){
        RestAssuredMockMvc.standaloneSetup(coinController);
    }

    @Test
    public void contextLoads() { }


}
