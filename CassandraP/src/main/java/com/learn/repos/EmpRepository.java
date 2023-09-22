package com.learn.repos;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.learn.domain.Employee;

public interface EmpRepository extends CassandraRepository<Employee, Integer> {

	@AllowFiltering
	List<Employee> findByAgeGreaterThan(int age);

}