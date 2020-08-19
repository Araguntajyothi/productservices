package com.cts.training.day3;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.cdi.KContainer;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.EntryPoint;
import org.kie.api.runtime.rule.FactHandle;

public class DroolsMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stu
KieServices ks = KieServices.Factory.get();
KieContainer kcontainer = ks.getKieClasspathContainer();
KieSession kieSession = kcontainer.newKieSession("rulesSession");

Product product = new Product();
product.setProductName("laptop");
product.setProductPrice(65000.0);

Address address1= new Address();
 address1.setCity("KOL");
 
 Address address2= new Address();
 address2.setCity("BLR");
 
 Address address3= new Address();
 address2.setCity("HYD");
 
 Person person = new Person();
 person.setProduct(product);
 person.setUserType("Regular");
 person.setName("Jyothi");
 person.setAge(50);
 
 List<Address> addressList = new ArrayList<Address>();
 addressList.add(address1); 
 addressList.add(address2); 
 addressList.add(address3); 
 
 person.setAddress(addressList);
 
 Person person2 = new Person();
 person2.setUserType("Regular");
 person2.setName("lakshmi");
 person2.setAge(45);
 
 Person person3 = new Person();
 person3.setUserType("Non-Regular");
 person3.setName("rama");
 person3.setAge(42);
 
 

//insert the fact into working memory
 //kieSession.insert(Product);
 kieSession.insert(person);
 kieSession.insert(person2);
 kieSession.insert(person3);
  
//{below two lines for exists rule,in this uncomment that insert(product) 3rd line
//FactHandle factHandle = kiesession.insert(product);
//kiesession.delete(factHandle);

//Person person = new Person();
//person.setProduct(product);
//person.setUserType("Regular");
//person.setName("neon");
//person.setAge(50);
//all this is for exists condition

//kiesession.insert(person);

//fire all the rules present in the production memory
kieSession.fireAllRules();
kieSession.dispose();
System.out.println("product price ::->" + product.getDiscount());
System.out.println("rule execution end...");
	}

}
