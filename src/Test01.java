import java.util.ArrayList;
import java.util.List;

public class Test01
{
    public static void main(String[] args)
    {
        Employee e=new Employee(0301,"ht",3000,"项目部","2007-10");
        Employee e2=new Employee(0302,"ht2",3500,"教学部","2006-10");
        Employee e3=new Employee(0303,"ht3",3550,"教学部","2006-10");
        List<Employee> list=new ArrayList<Employee>();
        list.add(e);
        list.add(e2);
        list.add(e3);
        printEmpName(list);

    }
    public static void printEmpName(List<Employee> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getName());
        }
    }
}
