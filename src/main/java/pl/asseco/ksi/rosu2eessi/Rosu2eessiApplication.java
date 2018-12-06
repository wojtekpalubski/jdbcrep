package pl.asseco.ksi.rosu2eessi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.asseco.ksi.rosu2eessi.svc.Przesypywacz;

@SpringBootApplication
public class Rosu2eessiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Rosu2eessiApplication.class, args);
	}

	@Autowired
	Przesypywacz p;

	@Override
	public void run(String... args) throws Exception {
		p.przesyp();
	}
}
