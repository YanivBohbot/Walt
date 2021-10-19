package com.walt;

import com.walt.dao.*;
import com.walt.model.City;
import com.walt.model.Customer;
import com.walt.model.Driver;
import com.walt.model.Restaurant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;


@SpringBootApplication
public class WaltApplication {


//    CityRepository cityRepository;     implements CommandLineRunner
//
//
//    CustomerRepository customerRepository;
//
//
//    DriverRepository driverRepository;
//
//
//    DeliveryRepository deliveryRepository;
//
//
//    RestaurantRepository restaurantRepository;

    private static final Logger log = LoggerFactory.getLogger(WaltApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WaltApplication.class);

    }


//    @Override
//    public void run(String... args) throws  Exception{
//
//        City jerusalem = new City("Jerusalem");
//        City tlv = new City("Tel-Aviv");
//        City bash = new City("Beer-Sheva");
//        City haifa = new City("Haifa");
//
//
//
//
//        log.info("Customers found with findAll():");
//        log.info("-------------------------------");
//        for (City city : cityRepository.findAll()) {
//            log.info(city.toString());
////            log.info(city.getId());
//        }
//        log.info("");
//
//
//
//
//        // fetch all customers
//
//        Restaurant meat = new Restaurant("meat", jerusalem, "All meat restaurant");
//        Restaurant vegan = new Restaurant("vegan", tlv, "Only vegan");
//        Restaurant cafe = new Restaurant("cafe", tlv, "Coffee shop");
//       Restaurant chinese = new Restaurant("chinese", tlv, "chinese restaurant");
//       Restaurant mexican = new Restaurant("restaurant", tlv, "mexican restaurant ");
//
//
//
////
////
//        restaurantRepository.save(meat);
//        restaurantRepository.save(vegan);
//        restaurantRepository.save(cafe);
//        restaurantRepository.save(chinese);
//        restaurantRepository.save(mexican);
//
//
//
//        log.info("rest found with findAll():");
//        log.info("-------------------------------");
//        for (Restaurant restaurant : restaurantRepository.findAll()) {
//            log.info(restaurant.toString());
////            log.info(city.getId());
//        }
//        log.info("");
//
//
//
//
////        Customer beethoven = new Customer("Beethoven", tlv, "Ludwig van Beethoven");
////        Customer mozart = new Customer("Mozart", jerusalem, "Wolfgang Amadeus Mozart");
////        Customer chopin = new Customer("Chopin", haifa, "Frédéric François Chopin");
////        Customer rachmaninoff = new Customer("Rachmaninoff", tlv, "Sergei Rachmaninoff");
////        Customer bach = new Customer("Bach", tlv, "Sebastian Bach. Johann");
////        customerRepository.save(beethoven);
////        customerRepository.save(mozart);
////        customerRepository.save(chopin);
////        customerRepository.save(rachmaninoff);
////        customerRepository.save(bach);
////
////        Driver mary = new Driver("Mary", tlv);
////        Driver patricia = new Driver("Patricia", tlv);
////        Driver jennifer = new Driver("Jennifer", haifa);
////        Driver james = new Driver("James", bash);
////        Driver john = new Driver("John", bash);
////        Driver robert = new Driver("Robert", jerusalem);
////        Driver david = new Driver("David", jerusalem);
////        Driver daniel = new Driver("Daniel", tlv);
////        Driver noa = new Driver("Noa", haifa);
////        Driver ofri = new Driver("Ofri", haifa);
////        Driver nata = new Driver("Neta", jerusalem);
////        driverRepository.save(mary);
////        driverRepository.save(patricia);
////        driverRepository.save(jennifer);
////        driverRepository.save(james);
////        driverRepository.save(john);
////        driverRepository.save(robert);
////        driverRepository.save(david);
////        driverRepository.save(daniel);
////        driverRepository.save(noa);
////        driverRepository.save(ofri);
////        driverRepository.save(nata);
//
////        createDrivers(jerusalem, tlv, bash, haifa);
////
////        createCustomers(jerusalem, tlv, haifa);
////
////        createRestaurant(jerusalem, tlv);
//
//    }
//
////
////    private void createRestaurant(City jerusalem, City tlv) {
////
////    }
////
////    private void createCustomers(City jerusalem, City tlv, City haifa) {
////
////
////    }
////
////    private void createDrivers(City jerusalem, City tlv, City bash, City haifa) {
////
////
////
//    }
//
//
}
