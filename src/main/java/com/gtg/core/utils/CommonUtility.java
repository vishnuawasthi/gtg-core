package com.gtg.core.utils;

import java.util.Collections;

public class CommonUtility {

	public static <T> Iterable<T> emptyIfNull(Iterable<T> iterable) {
	    return iterable == null ? Collections.<T>emptyList() : iterable;
	}
	
}
