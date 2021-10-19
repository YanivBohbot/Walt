package com.walt;

import com.walt.dao.CityRepository;
import com.walt.dao.DeliveryRepository;
import com.walt.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.logging.Logger;

@Controller
public class waltcontroller {

    private static final Logger LOGGER = Logger.getLogger(WaltServiceImpl.class.getName());

    @Autowired
    private  WaltService waltservice;
//
//
//
////    private DeliveryRepository deliveryRepository;
//
//    @Autowired
//    private CityRepository CityRepository;

//
//   public waltcontroller(WaltService waltservice){
//        this.waltservice  = waltservice ;
//   }



//    @GetMapping("/delivery")
//    public Delivery CreateDelivery(@RequestParam("customer") String customer_name ,
//                               @RequestParam("city") String city_name ,
//                               @RequestParam("address") String customer_address,
//                               @RequestParam("restaurant") String restaurant_name,
//                               @RequestParam("restaurant_address") String restaurant_address
////                             @RequestParam("time_delivery") String time_delivery
////                             @RequestBody Restaurant restaurant
//                               ){

//
//    @PostMapping("/city")
//    public City postcity(@RequestBody City city){
//            City city1 = new City();
//            city1.setName(city.getName());
//        CityRepository.save(city1);
//        return city1;
//    }
//
    @PostMapping("/delivery")
    public Delivery CreateDelivery(@RequestBody orderRequest order){

       System.out.println("HELOOOO");
//        System.out.println(customer.getCity());
//        System.out.println(customer.getCity());
//        System.out.println(customer.getName());

//        City city = new City(city_name);

            Customer customer =  order.getCustomer();
            Restaurant restaurant =  order.getRestaurant();

//        System.out.println("the city is => " + city.getName());
//
//
//        Customer customer = new Customer(customer_name, city, customer_address);

        System.out.println("the customer is => " + customer.getName());
        System.out.println("the customer is => " + customer.getAddress());
        System.out.println("the customer is => " + customer.getCity().getName());
        System.out.println("the customer is => " + customer.getCity().getId());

//       Restaurant restaurant = new Restaurant(restaurant_name, city, restaurant_address);


        System.out.println("the restauran is => " + restaurant.getName());
        System.out.println("the restauran is => " + restaurant.getAddress());
        System.out.println("the restauran is => " + restaurant.getName());



        Date delivery_time = new Date();

      System.out.println(delivery_time.toString());

   Delivery delivery = waltservice.createOrderAndAssignDriver(customer , restaurant , delivery_time);


//

    return null;
    }



}
