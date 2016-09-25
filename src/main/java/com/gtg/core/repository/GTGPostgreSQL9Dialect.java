package com.gtg.core.repository;

import java.sql.Types;

import org.hibernate.dialect.PostgreSQL9Dialect;

public class GTGPostgreSQL9Dialect extends PostgreSQL9Dialect {

	public GTGPostgreSQL9Dialect() {
		this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
	}
}
