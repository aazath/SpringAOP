package lk.ccs.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
    public void saveEmployee(){
        System.out.println("New Employee saved");
    }
}
