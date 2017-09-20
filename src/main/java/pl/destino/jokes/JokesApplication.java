package pl.destino.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JokesApplication {

	public static void main(String[] args) {
            ConfigurableApplicationContext ctx = SpringApplication.run(JokesApplication.class, args);
	}
}
