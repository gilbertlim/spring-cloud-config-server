package com.megazone.ConfigServer;

// import com.megazone.ConfigServer.config.ParameterStoreProperties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

// @ExtendWith(SpringExtension.class)
@SpringBootTest
class ConfigServerApplicationTests {

	@Test
	void contextLoads() {
	}

	// @Autowired
	// private ParameterStoreProperties properties;

	// @Test
	// void local_파라미터를_가져온다() throws Exception {
	// 	System.out.println(properties);
	//
	// 	// assertThat(properties.getEncryptKey()).isEqualTo("devvalue");
	// }

}
