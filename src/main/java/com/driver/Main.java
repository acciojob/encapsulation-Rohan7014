package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly rwOnly=new RWOnly();
        // this gives error "name has private access in com.driver.RWOnly"
        //  rwOnly.name="Rohan";
        rwOnly.setName("Rohan");
        String name=rwOnly.getName();
    }
}