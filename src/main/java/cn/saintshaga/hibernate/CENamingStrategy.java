package cn.saintshaga.hibernate;

import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.internal.util.StringHelper;

public class CENamingStrategy extends ImprovedNamingStrategy {

	private static final long serialVersionUID = -6169535058092715417L;
	private static final String HEADER = "CE_";
	public String classToTableName(String className) {
		return HEADER + StringHelper.unqualify(className);
	}
	
	public String propertyToColumnName(String propertyName) {
		return HEADER + propertyName;
	}
	
	public String tableName(String tableName) {
		return HEADER + tableName;
	}
	
	public String columnName(String columnName) {
		return HEADER + columnName;
	}

}
