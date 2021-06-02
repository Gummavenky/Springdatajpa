package com.gummaTech.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.gummaTech.entity.Employeeinfo;

public interface EmployeeRepo extends JpaRepository<Employeeinfo, Integer> {
	
	
	
	
	
	public Integer findByEid(Integer fd);
	
	
	
	@Query("select eid from Employeeinfo where ename like ?1 ")
	public List<Employeeinfo> findByEid(String s);
	
	@Query( value="select ename from Employeeinfo where esal=:sal")
	public String  findByNames(Double sal);
	
	@Query(value="from Employeeinfo where esal=:sal")
	public List<Employeeinfo> findByName(Double sal);
	
	@Query(value="select eadd from Employeeinfo where ename=:name",nativeQuery=true)
	public String findByAdd(String name); 
	
	@Modifying
	@Transactional
	@Query(value="update Employeeinfo set eadd='ongle' where ename=:name ")
	public void updateAdd(String name);
	@Transactional
	@Modifying
	@Query(value="delete from Employeeinfo where ename=:name")
	public void deleteRecord(String name);
	
	
	
	
	
	

}
