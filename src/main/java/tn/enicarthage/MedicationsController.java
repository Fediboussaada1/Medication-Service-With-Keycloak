package tn.enicarthage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class MedicationsController {

	@Autowired
	MedicationRepository mr; 
	
	@RequestMapping(value = {"/saveMedication"}, method = {RequestMethod.POST, RequestMethod.GET})
	public String insertMed(@ModelAttribute("c") Medication c, Model model)
	{
		System.out.print("\n \n \n insertMedication\\n \\n \\n ");
		System.out.print(c.toString());
		mr.save(c);
		return"redirect:/MedicationAdd.html";
	}
	
	@RequestMapping(value = "/getMedications", method = RequestMethod.GET)
    public ModelAndView getMeds() {
    	ModelAndView mv= new ModelAndView("MedicationsTab.html"); 
        mv.addObject("Medications",mr.findAll());
        return mv;
    }
	
	
	@RequestMapping(value = {"/deleteMedication"}, method = {RequestMethod.POST, RequestMethod.GET})
	public String deleteMed(@ModelAttribute("emp") Medication c, Model model)
	{
		mr.delete(c);
		return"redirect:/getMedications";
	}
}
