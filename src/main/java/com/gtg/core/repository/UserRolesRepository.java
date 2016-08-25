package com.gtg.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gtg.core.entity.UserRoles;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRoles, Long> {

}
