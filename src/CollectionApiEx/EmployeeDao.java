package CollectionApiEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDao {
    public static void main (String args[]){

        List<EmployeeDetailsBean> emplist = new ArrayList<>();

        emplist.add(new EmployeeDetailsBean("Subhram","18500A", 60000));
        emplist.add(new EmployeeDetailsBean("Dipayan","18500B", 50000));
        emplist.add(new EmployeeDetailsBean("Bodde","18500C", 40000));
        emplist.add(new EmployeeDetailsBean("Motu","18500D", 60000));
        emplist.add(new EmployeeDetailsBean("Subhram","18500A", 20000));
        emplist.add(new EmployeeDetailsBean("Jhum","18500F", 60000));

        //System.out.println(emplist);

        List<Double> salarysame = emplist.stream().filter(p -> p.getSalary() > 50000).map(p -> p.getSalary()).collect(Collectors.toList());
        System.out.println(salarysame);
    }
}
