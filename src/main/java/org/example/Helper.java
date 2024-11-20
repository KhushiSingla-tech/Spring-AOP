package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

// Advice - What should be called when specific method called -> After, Before
// PointCut - Where should be called -> Method, Class, Package
// methods discussed for before is same for after

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
//    @Before("execution(* org.example.Test1.show())")
//    public void show() {
//        System.out.println("Helper");
//    }

//    @Before("execution(* show*())")
//    public void show() {
//        System.out.println("Helper");
//    }

//    @Before("showPointCut() && showPointCut1()")
//    public void show() {
//        System.out.println("Helper");
//    }

//    @Before("showPointCut1()")
//    public void show(JoinPoint joinPoint) {
//        System.out.println(joinPoint.getTarget());
//        System.out.println("Helper");
//    }

//    @Before("args(name)")
//    public void show(String name) {
//        System.out.println(name);
//        System.out.println("Helper");
//    }
//
//    @Pointcut("execution(* show*())")
//    public void showPointCut() {
//    }
//
    @Pointcut("within(org.example.Test1)")
    public void showPointCut1() {
    }

//    @AfterReturning(pointcut = "args(name)", returning = "returnString")
//    public void show(String name, String returnString) {
//        //Can't change retruning value
//        System.out.println("Helper" + name + " " + returnString);
//    }
//
//    @AfterThrowing(pointcut = "args(name)", throwing = "returnString")
//    public void show1(String name, RuntimeException returnString) {
//        System.out.println("Exception");
//    }

//    @Around("showPointCut1()")
//    public void show(ProceedingJoinPoint joinPoint) {
//        Object value = null;
//        try {
//            System.out.println("Before");
//            value = joinPoint.proceed();
//            System.out.println("After");
//        } catch (Throwable e) {
//            System.out.println("Exception");
//        }
//        System.out.println("After Finally");
//    }

//    @Around("@annotation(org.example.annotation)") //call on specific annotation
//    public void show() {
//    }

}
