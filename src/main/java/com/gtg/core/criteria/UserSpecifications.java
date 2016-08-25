package com.gtg.core.criteria;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.gtg.core.entity.User;

public class UserSpecifications {

	public static  Specification <User> findUsers(UserSearchCriteria criteria) {
		
		return new Specification <User> (){

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
				// TODO Auto-generated method stub
				
				
				return null;
			}
			
		};
	}
}
