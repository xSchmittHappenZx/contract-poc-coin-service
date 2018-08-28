package contractpoccoinservice

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("Should return a list of coins")
    request {
        url "/coin"
        method GET()
    }
    response {
        status 201
        body(["BTC", "ETH"])
    }
}