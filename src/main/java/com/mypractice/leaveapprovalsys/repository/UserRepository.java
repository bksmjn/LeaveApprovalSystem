package mum.edu.leaveapprovalsys.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.leaveapprovalsys.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

}
