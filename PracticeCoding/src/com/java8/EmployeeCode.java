import java.util.*;

public class EmployeeCode {

    public static void main(String[] args) {
        Employee emp1 = new Employee(101,"Rishi",29, 800000l);
        Employee emp2 = new Employee(102,"Akash",27, 400000l);
        Employee emp3 = new Employee(103,"Hussain",26, 900000l);
        Employee emp4 = new Employee(104,"Yash",32, 950000l);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        //1. print name of employee whose age greater than 27
        empList.stream().filter(e->e.getAge()>27).map(Employee::getName).forEach(System.out::println);

        //2. count number of employee whose age greater than 26
        long count = empList.stream().filter(e-> e.getAge()>26).count();
        System.out.println(count);

        //3. find the employee with name yash
        Optional<Employee> em = empList.stream().filter(e->e.getName().equalsIgnoreCase("Yash")).findAny();
        if(em.isPresent()){
            System.out.println(em.get());
        }

        //4. find maximum age of employee
        OptionalInt op  = empList.stream().mapToInt(Employee::getAge).max();
        if(op.isPresent()){
            System.out.println(op.getAsInt());
        }

        //5(a). sort all the employees based on age ascending order
        empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
        empList.stream().sorted((o1,o2)->o1.getAge()-o2.getAge()).forEach(System.out::println);

        //5(b). sort all the employees based on age descending order
        empList.stream().sorted((o1,o2)->o2.getAge()-o1.getAge()).forEach(System.out::println);

        //6(a). sort all the employees based on name ascending order
        empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        empList.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).forEach(System.out::println);

        //6(b). sort all the employees based on name descending order
        empList.stream().sorted((o1,o2)->o2.getName().compareTo(o1.getName())).forEach(System.out::println);

        //7. sum of salary age greater than 26
        long sum = empList.stream().filter(e->e.getAge()>26).mapToLong(Employee::getSalary).sum();
        System.out.println(sum);

        //8. square the numbers filter them if greater than 100000 and find average
        List<Integer> numbers = Arrays.asList(100,24,13,44,114,200,40,112);
        OptionalDouble a = numbers.stream().mapToInt(n->n*n).filter(n->n>10000).average();
        if(a.isPresent()){
            System.out.println(a.getAsDouble());
        }

    }
}
