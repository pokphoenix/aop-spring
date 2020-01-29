

ref : https://www.springboottutorial.com/spring-boot-and-aop-with-spring-boot-starter-aop

## AOP Best Practices ##
------------------------

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.in28minutes.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution(){}

	@Pointcut("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution(){}

}

@Around("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")

