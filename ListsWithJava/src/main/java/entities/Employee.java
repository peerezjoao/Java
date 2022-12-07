package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(int id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        salary +=  salary * percent / 100;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public String toString(){
        return name + ", " + salary;
    }

}
