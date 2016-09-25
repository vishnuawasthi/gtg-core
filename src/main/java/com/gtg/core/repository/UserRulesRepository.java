package com.gtg.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gtg.core.entity.UserRules;

@Repository
public interface UserRulesRepository extends CrudRepository<UserRules, Long> {

}
