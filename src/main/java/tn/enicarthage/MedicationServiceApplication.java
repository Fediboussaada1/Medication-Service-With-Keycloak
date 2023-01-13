package tn.enicarthage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MedicationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicationServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(MedicationRepository medicationRepository) {
	return args->{
		medicationRepository.save(new Medication(Long.valueOf(1),(float)25.5,"c1","grippe","pour grippe","gripex1"));
		medicationRepository.save(new Medication(Long.valueOf(2),(float)25.5,"c2","grippe","pour grippe","gripex2"));
		medicationRepository.save(new Medication(Long.valueOf(3),(float)25.5,"c3","grippe","pour grippe","gripex3"));
	};
	}

}
