package com.test.servicethree.components;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class LogAspect {
    private static final Logger logger = Logger.getLogger(LogAspect.class.getName());
    @Around("@annotation(LogMethodParam)")
    public Object logMethodParam(ProceedingJoinPoint joinPoint) throws Throwable {
        Method method = MethodSignature.class.cast(joinPoint.getSignature()).getMethod();
        Object[] signatureArgs = joinPoint.getArgs();
        for (Object signatureArg : signatureArgs) {
            logger.log(Level.INFO, " Method invoked: " + method + " Input arguments: " + signatureArg.toString());
        }
        return joinPoint.proceed();
    }
}
