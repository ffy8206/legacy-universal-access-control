package com.harry.uac.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * aop Class and log around method
 * 
 * @author wangsg
 * 
 */
@Aspect
public class LogAspect {

    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    /**
     * AOP function
     *
     * [org.mybatis.spring.mapper.MapperFactoryBean] in daos.xml
     * 
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.harry.uac..*.* (..)) " + "&& !execution(* com.harry.uac..*.set* (..)) "
	            + "&& !execution(* com.harry.uac..*.get* (..)) "
	            + "&& !execution(* com.harry.uac..*.validate (..)) "
	            + "&& !execution(* com.harry.uac.dao..*.* (..))"
	            + "&& !execution(* com.harry.uac.persistence..*.* (..))")
    public Object appendDebugLog(ProceedingJoinPoint pjp) throws Throwable {
	// start stopwatch
	String functionDetail = String.format("%s - method %s", pjp.getTarget().getClass(), pjp.getSignature()
	                .getName());
	logger.debug("begin :" + functionDetail);
	Object retVal = pjp.proceed();
	logger.debug("end :" + functionDetail);
	// stop stopwatch
	return retVal;
    }
}
