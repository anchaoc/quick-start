package com.example.aspect;

import com.example.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * rpc服务未知异常包装处理
 *
 * @author anchao
 * @since 1.0
 */
@Aspect
@Slf4j
@Component
public class RpcExceptionAspect {

    @Pointcut("@annotation(com.example.aspect.UnknownExResult)")
    public void pointCut() {
    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            return  proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            log.error(throwable.getMessage(),throwable);
            MethodSignature methodSignature = ((MethodSignature) proceedingJoinPoint.getSignature());
            Method method = methodSignature.getMethod();
            UnknownExResult unknownExResult = method.getAnnotation(UnknownExResult.class);
            Result<Object> objectResult = new Result<>();
            objectResult.setCode(500);
            objectResult.setMsg(unknownExResult.message());
            return objectResult;
        }
    }
}
