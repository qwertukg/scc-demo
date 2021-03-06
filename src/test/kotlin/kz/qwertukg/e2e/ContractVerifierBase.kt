package kz.qwertukg.e2e

import io.restassured.RestAssured
import org.junit.Before
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier

@SpringBootTest
@AutoConfigureMessageVerifier
class ContractVerifierBase {

	@Before
	fun setup() {
		RestAssured.port = 80

		// mock app context here if necessary
	}

}
