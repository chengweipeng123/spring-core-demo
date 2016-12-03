package com.seas.SpringCore.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * TODO: 填写Class说明.
 * 
 * <pre>
 * 	TODO: 填写Class详细说明
 * </pre>
 * 
 * @author 杨雷
 * @since TODO: 来源版本
 *
 */
@Aspect
public class CallAdvice {
	public static int steps = 1;
	
	@Pointcut("execution(* com.seas.SpringCore.Service.Service.*(..))")
	public void fooPointcut() {}
	
	/**
	 * 
	 * 方法被执行前调用
	 * <pre>
	 * </pre>
	 * 
	 * @author Seas Cheng
	 * @param jp
	 */
	@Before("execution(* com.seas.SpringCore.Service.Service.*(..))")
	public void doBefore(JoinPoint jp) {
		System.out.println("doBefore");
		String className = jp.getTarget().getClass().getName();
		String methodName = jp.getSignature().getName();
		System.out.println(String.format("[%d: BEFORE  METHOD]: %s.%s()", steps++, className, methodName));
	}
	
	/**
	 * 
	 * 方法被执行后调用
	 * <pre>
	 * </pre>
	 * 
	 * @author Seas Cheng
	 * @param jp
	 */
	@After("fooPointcut()")
	public void doAfter(JoinPoint jp) {
		System.out.println("doAfter");
		String className = jp.getTarget().getClass().getName();
		String methodName = jp.getSignature().getName();
		System.out.println(String.format("[%d: BEFORE  METHOD]: %s.%s()", steps++, className, methodName));
	}
	
	/**
	 * 
	 * 方法被执行时调用
	 * <pre>
	 * </pre>
	 * 
	 * @author Seas Cheng
	 * @param pjp
	 */
	@Around("fooPointcut()")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("doAround");
		String className = pjp.getTarget().getClass().getName();
		String methodName= pjp.getSignature().getName();
		int sn = steps++;
        System.out.println(String.format("[%d: METHOD BEFORE]: %s.%s()", sn, className, methodName));
        
        long time = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        time = System.currentTimeMillis()-time;
        System.out.println(String.format("[%d: METHOD  AFTER]: %s.%s() : %dms\n", sn, className, methodName, time));
        
        return retVal;
	}
	
	/**
	 * 
	 * 抛出异常时调用
	 * <pre>
	 * </pre>
	 * 
	 * @author Seas Cheng
	 * @param jp
	 * @param ex
	 */
	@AfterThrowing(pointcut="fooPointcut()", throwing="error")
	public void doThrowing(JoinPoint jp, Throwable ex) {
		System.out.println("doThrowing");
		String className = jp.getTarget().getClass().getName();
        String methodName = jp.getSignature().getName();
        System.out.println(String.format("[%d: THROW EXCEPTION]: %s.%s()\n", steps++, className, methodName));
        System.out.println(ex.getMessage()); 
	}
	
	/**
	 * 如何在通知体内访问参数
	连接点函数 形式：
    @Log(title = "用户登陆", type = LogType.LOGIN)
    @RequestMapping({ "/login_success.htm" })
    public String login_success(HttpServletRequest request, HttpServletResponse response, String isRegister)
            throws IOException 
            
    切入点函数：
    其中：@annotation(annotation) 对应参数： Log annotation  连接点的注解： @Log(title = "用户登陆", type = LogType.LOGIN)
    args(request,..)对应参数：HttpServletRequest request  连接点的第一个参数：HttpServletRequest request
    @AfterReturning("execution(* com.sandalice.manage..*.*(..))&& @annotation(annotation)&&args(request,..) ")
    public void userLog(JoinPoint joinPoint, Log annotation, HttpServletRequest request) throws Exception {
        String title = annotation.title();
    **/

}
