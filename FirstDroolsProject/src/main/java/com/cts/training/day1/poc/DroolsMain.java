package com.cts.training.day1.poc;
import org.kie.api.KieServices;
import org.kie.api.cdi.KContainer;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

public class DroolsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KieServices ks = KieServices.Factory.get();
		KieContainer kcontainer = ks.getKieClasspathContainer();
		//KieSession kiesession = kcontainer.newKieSession("droolsSession");
		KieSession kiesession = kcontainer.newKieSession("agendaSession");
		Employee employee = new Employee();
		employee.setAge(74);
		
		FactHandle factHandle = kiesession.insert(employee);
		kiesession.getAgenda().getAgendaGroup("citizen").setFocus();
		System.out.println("FACTHANDLE::::"+factHandle.toExternalForm());
		kiesession.fireAllRules();
		kiesession.dispose();
		
	}

}
