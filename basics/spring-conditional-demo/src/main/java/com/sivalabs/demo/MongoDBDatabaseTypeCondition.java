/**
 * 
 */
package com.sivalabs.demo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Siva
 *
 */
public class MongoDBDatabaseTypeCondition implements Condition
{

	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata)
	{
		String enabledDBType = System.getProperty("dbType","MYSQL");
		return (enabledDBType != null && enabledDBType.equalsIgnoreCase("MONGODB"));
	}
	
}
