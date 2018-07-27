/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controller.LocationController;
import controller.RegionController;
import entities.Location;
import entities.Region;
import java.sql.Connection;

/**
 *
 * @author Gusma
 */
public class ManualTester {
    public static void main(String[] args) {
        //System.out.println(new MyConnection().getConnection());
        Connection connection  = new MyConnection().getConnection();
//        String regionId = "1";
//        String regionName = "Kebumen";
//        String locationId = "1200";
//        String streetAddress = "JL Pangeran Bumidirjo";
//        String postalCode = "54317";
 //       String city= "Roma";
//        String stateProvince = "Jawa Tengah";
//        String countryId = "ZW";
       // RegionController regionController = new RegionController(connection);
        LocationController locationController = new LocationController(connection);
//       System.out.println(locationController.save(locationId, streetAddress,postalCode,city,stateProvince,countryId));
//        System.out.println(locationController.edit(locationId, streetAddress,postalCode,city,stateProvince,countryId));
//        System.out.println(locationController.drop(Integer.parseInt(locationId)));
//            for (Location location : locationController.binding()) {
//           System.out.println(location.getLocationId()+"-"+
//           location.getStreetAddress()+"-"+location.getPostalCode()+"-"+location.getCity()+"-"+
//          location.getStateProvince()+"-"+location.getCountryId());
//          }
//        System.out.println("pakai sort");
//          locationController.bindingsort("location_id", "asc").forEach((location)->{
//            System.out.println(location.getLocationId()+"-"+location.getStreetAddress()
//                    +"-"+location.getPostalCode()+"-"+location.getCity()+"-"+
//            location.getStateProvince()+"-"+location.getCountryId());
//           });
//        locationController.find("city", "ma").forEach((location)->{
//            System.out.println(location.getLocationId()+"-"+location.getStreetAddress()
//                    +"-"+location.getPostalCode()+"-"+location.getCity()+"-"+
//            location.getStateProvince()+"-"+location.getCountryId());
//       });
            System.out.println(locationController.findById(1000).getCity());
    }
}
