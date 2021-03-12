package contracts

import org.springframework.cloud.contract.spec.ContractDsl.Companion.contract

contract {
    request {
        method = method("GET")
        url = url("http://www.mocky.io/v2/5e4e9eea2f000062cd16a98f")
    }
    response {
        status = OK
        body = body("OK")
    }
}