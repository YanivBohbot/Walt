package com.walt;

import com.walt.dao.*;
import com.walt.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class WaltServiceImpl implements WaltService {

    private static final  Logger LOGGER = Logger.getLogger(WaltServiceImpl.class.getName());


    private DriverRepository driverRepo;
//
//    @Autowired
//    private CityRepository  cityrepo;
//
//    private DriverRepository driverrepo;
//
    private RestaurantRepository restaurantRepository;
//
    private List<Driver> list_driver_bycity;
//
//    private CustomerRepository customerRepository;
//
    private DeliveryRepository deliveryRepo;


    @Override
    public Delivery createOrderAndAssignDriver(Customer customer, Restaurant restaurant, Date deliveryTime) {

        // get the customer city
//        Long customer_city = customer.getCity().getId();

        City city  = new City();
        city.setId(customer.getCity().getId());;
        city.setName(customer.getCity().getName());
        System.out.println("city is "+ city.toString());


//        City city  = cityrepo.findByName(customer.getCity().getName());
//
        Restaurant resto = restaurantRepository.findByName(restaurant.getName());

        System.out.println("driver is ");

        list_driver_bycity = driverRepo.findAllDriversByCity(city);

        for (Driver driver: list_driver_bycity) {

            System.out.println("driver is "+ driver.toString());
            System.out.println("driver is "+ driver.getName());

        }

//
//        driverrepo.findByName("dweoid");
//
//
//         customerRepository.findByName("oioi");
//
//        System.out.println("the customer is living in => " + customer.getCity().getName());
//
//        System.out.println("the customer is living in => " + city);
//        System.out.println("the customer is living in => " + city.getName());
//        System.out.println("the customer is living in => " + city.getId());
//
//        // return list drivers => 0 ,  1 , ...
//       list_driver_bycity = driverRepo.findAllDriversByCity(city);
//
//
//        System.out.println("the list of drivers is => " +  list_driver_bycity);
//
////       delivery.getDeliveryTime();
//
//       // get the list of drivers in the same city of the customer
//
//
//
        // looking in the list which driver is living in the same city as the restaurant
       List<Driver> drivers_same_city_Customer = list_driver_bycity.stream().filter(driver ->
               driver.getCity() == restaurant.getCity()).collect(Collectors.toList()
       );
//
//
//
//        System.out.println(drivers_same_city_Customer);
//
//        if ( (  driverRepo.findAllDriversByCity(customerCity) == customer.getCity()))
//
//
//            ;
//
//        deliveryTime.getTime();

//       / Delivery delivery = new Delivery();

 //   Driver driver = drivers_same_city_Customer.forEach(d -> );

//
        Delivery delivery = new Delivery(driver ,restaurant , customer ,deliveryTime);
        double distance = Math.random() * 20 + 0;

        delivery.setDriver(driver);
        delivery.setCustomer(customer);
        delivery.setRestaurant(restaurant);
        delivery.setDeliveryTime(deliveryTime);


        delivery.setDistance(distance);
        deliveryRepo.save(delivery);

        return null;




    }

    @Override
    public List<DriverDistance> getDriverRankReport() {

        DriverDistance Idriver =null;

        Long total_distance = Idriver.getTotalDistance();

        return null;
    }

    @Override
    public List<DriverDistance> getDriverRankReportByCity(City city) {
        return null;
    }



}
