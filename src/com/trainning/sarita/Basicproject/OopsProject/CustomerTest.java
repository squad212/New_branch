package com.trainning.sarita.Basicproject.OopsProject;

public class CustomerTest {
    public static void main(String[] args) {
        Address homeAddress = new Address("3822 esters rd", "apt 114",
                "Irving","Tx",75038);
        Customer customer = new Customer("Sarita", homeAddress );

        System.out.println(customer);
    }
}
