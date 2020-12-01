package nl.leonw.springmicrodemo.recommendationservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.cloud.vault.token=123456"})
class RecommendationserviceApplicationTests {

	@Test
	void contextLoads() {
	}

}
