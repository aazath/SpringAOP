package lk.ccs.runners;

import lk.ccs.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    private EmployeeDao dao;

    @Override
    public void run(String... args) throws Exception {
        dao.saveEmployee();

    }
}
