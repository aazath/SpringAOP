package lk.ccs.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionManagement {

    @Pointcut("execution(public void lk.ccs.dao.EmployeeDao.saveEmployee())")
    public void p1(){}


    @Before("p1()")
    public void beginTransaction(){
        System.out.println("Transaction begin");
    }

    @After("p1()")
    public void endTransaction(){
        System.out.println("Transaction committed");
    }
}
