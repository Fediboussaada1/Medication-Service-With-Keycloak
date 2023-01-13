package tn.enicarthage;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullMedication",types=Medication.class)
public interface MedicationProjection {

	public Long getRefernce();
	public Float getPrice();
	public String getCompany();
	public String getDisease();
	public String getDescripton();
	public String getName();
}
