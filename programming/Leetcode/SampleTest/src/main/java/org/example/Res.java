package org.example;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Res{
    Comparator<Customer> orderBasedOnTag=(cust1,cust2)->cust2.isTag()-cust1.isTag();
    Comparator<Customer> orderBasedOnwait= (cust1,cust2)->cust2.getWaitTime()-cust1.getWaitTime();
    
   Set<Customer> list=new TreeSet<>(orderBasedOnTag.thenComparing(orderBasedOnwait));

   public void add(Customer customer){
      list.add(customer);
    }

   public Customer get(){
    return list.stream().findFirst().get();
   }

   public Set<Customer> getAllList(){
    return list;
   }

}