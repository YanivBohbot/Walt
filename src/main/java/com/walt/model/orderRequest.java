package com.walt.model;

public class orderRequest {

    private Customer customer;
    private Restaurant restaurant;


    public Customer getCustomer(){ return customer ; }

    public Restaurant getRestaurant(){ return restaurant ; }

    public orderRequest(Customer customer , Restaurant restaurant){
        this.customer = customer ;
        this.restaurant = restaurant;
    }



}
