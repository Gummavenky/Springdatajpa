package com.gummaTech;




import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.gummaTech.entity.Employeeinfo;
import com.gummaTech.repository.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext cst=SpringApplication.run(Application.class, args);
		 EmployeeRepo e=cst.getBean(EmployeeRepo.class);
		 
		 Employeeinfo em=new Employeeinfo();
		 em.setEid(101);
		 /*List<Employeeinfo> le=e.findAll(Sort.by("ename","esal").descending());
		 for(Employeeinfo ea:le)
		 {
			 System.out.println(ea);
		 }*/
		 
		 Example<Employeeinfo> ee=Example.of(em);
		 List<Employeeinfo> el=e.findAll(ee);
		 for(Employeeinfo ef:el)
		 {
			 System.out.println(ef);
		 }
		 
		 
		 
		 Integer pageSize=2;
		 Integer pageNo=1;
		 Pageable p=PageRequest.of(pageNo,pageSize);
		 Page<Employeeinfo> pe=e.findAll(p);
		 List<Employeeinfo> ls=pe.getContent();
		 System.out.println(ls);
		 /*for(Employeeinfo es:ls)
		 {
			 System.out.println(es);
		 }*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		/* em.setEid(106);
		 em.setEname("mahi");
		 em.setEadd("nellore");
		 em.setEsal(4000.0);
		 
		 em.setEname("mahi");
		 em.setEsal(3000.0);
		 
		 
		 
		 Example<Employeeinfo> ex=Example.of(em);
		 
		 List<Employeeinfo> l=e.findAll(ex);
		 
		 for(Employeeinfo ea:l)
		 {
			  System.out.println(ea);
		 }
		 */
		 
		 /*e.save(em);
		
		 System.out.println("insert record");
		 
		 Integer ie=e.findByEid(103);
		 System.out.println(ie);
		 
		 
		 Integer i= e.findByEid("hari");
		 
		System.out.println(i);*/
		 
		/* List<Employeeinfo> le=new ArrayList<>();
		     
		      le = e.findByEid();
		      for(Employeeinfo ef:le)
		      {
		    	  System.out.println(ef);
		      }
		     
		    	 */
		    	  
		      
		
	    /* String s=e.findByNames(2000.00);
		System.out.println(s);
		
		
		
	        e.updateAdd("mahi");
		
		
		String ad=e.findByAdd("mahi");
		System.out.println(ad);
		
		e.deleteRecord("sai");
		*/
		 
		
}
}
