package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Res res=new Res();
        Customer cus1=new Customer();
        cus1.setName("cust1");
        cus1.setTag(1);
        cus1.setWaitTime(0);
        res.add(cus1);

        Customer cus2=new Customer();
        cus2.setName("cust2");
        cus2.setTag(0);
        cus2.setWaitTime(5);
        res.add(cus2);

        Customer cus3=new Customer();
        cus3.setName("cus3");
        cus3.setTag(1);
        cus3.setWaitTime(10);
        res.add(cus3);

        Customer cus4=new Customer();
        cus4.setName("cus4");
        cus4.setTag(0);
        cus4.setWaitTime(10);
        res.add(cus4);

        res.getAllList().stream().forEach(customer ->{
            System.out.println(customer.getName());
            System.out.println(customer.getWaitTime());
            System.out.println(customer.isTag());
        });
    }
}