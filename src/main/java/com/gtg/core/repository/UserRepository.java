package com.gtg.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.gtg.core.entity.User;
//PagingAndSortingRepository
//@Repository
//@Transactional
public interface UserRepository  extends PagingAndSortingRepository<User, Long>,JpaSpecificationExecutor<User>{

	@Query("FROM User u WHERE  u.username = :userName ")
	public User findUserByUsername( @Param("userName")  String userName);
	
	@Query("FROM User u ")
	public List<User> findAll();
	
	@Query("FROM User u WHERE  u.email = :email ")
	public User findUserByEmail( @Param("email")  String email);
}
