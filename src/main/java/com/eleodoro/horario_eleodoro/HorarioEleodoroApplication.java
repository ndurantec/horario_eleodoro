package com.eleodoro.horario_eleodoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication
public class HorarioEleodoroApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorarioEleodoroApplication.class, args);
	}

}
