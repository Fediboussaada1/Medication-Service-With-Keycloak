package tn.enicarthage;



import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Medication {

	@Id
	private Long refernce;
	private Float price;
	private String company;
	private String disease;
	private String descripton;
	private String name;
}
