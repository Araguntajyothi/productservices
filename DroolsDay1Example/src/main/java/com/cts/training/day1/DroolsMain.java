package com.cts.training.day1;

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
KieSession kieSession = kcontainer.newKieSession("rulesSession");

Product product = new Product();
product.setProductName("laptop");
product.setProductPrice(65000.0);
//insert the fact into working memory
kieSession.insert(product);
//fire all the rules present in the production memory
kieSession.fireAllRules();
kieSession.dispose();
System.out.println("product price ::->" + product.getDiscount());

	}

}
