package org.ListMain;

import entities.Employee;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numberEmployees = sc.nextInt();

        for (int i = 0; i < numberEmployees; i++) {
            System.out.println();

            System.out.printf("Employee #%d: ", (i + 1));
            System.out.println();

            System.out.print("Enter the ID: ");
            int id = sc.nextInt();

            System.out.print("Enter the name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Enter the salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();

        Employee employee = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);

        if (employee == null) {
            System.out.println("This ID does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            employee.increaseSalary(percent);
        }

        System.out.println();
        sc.close();

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ": " + list.get(i));
        }

    }


}
