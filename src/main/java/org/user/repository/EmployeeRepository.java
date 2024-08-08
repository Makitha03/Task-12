package org.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.user.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
