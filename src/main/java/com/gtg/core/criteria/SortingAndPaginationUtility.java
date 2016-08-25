package com.gtg.core.criteria;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

public class SortingAndPaginationUtility {

	public static Sort orderBy(String columnName, String sortDirection) {
		if (!StringUtils.isEmpty(columnName) && !StringUtils.isEmpty(sortDirection)) {
			return new Sort(Sort.Direction.valueOf(sortDirection), columnName);
		} else {
			return new Sort(Sort.Direction.ASC, "id");
		}

	}
	
	public static   Pageable createPageRequest(int page,int size ,Sort sort) {
	    //return new PageRequest(1, 10, Sort.Direction.ASC, "title", "description");
		return new PageRequest(page, size, sort);
	}
}
