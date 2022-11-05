package com.Restaurant.Application;

import java.util.Scanner;

import com.Restaurant.Application.Entity.RestaurantEntity;
import com.Restaurant.Application.Respclass.RestaurantRep;

public class App 
{
    public static void main( String[] args )
    {
    	RestaurantEntity res = new RestaurantEntity();
    	
    	
    	res.setName("kFC");
    	res.setType("Non-veg");
    	res.setAvgPrice(1000D);
    	res.setCity("chennai");
    	res.setContactNum("789655");
    	res.setRating("8");
    	
    	RestaurantRep rep = new RestaurantRep();
    	
    	rep.addRestaurant(res);
    	
    	//System.out.println(rep.getResById(1));
    	
    	//rep.updateConAndCityById("45697", "kerala", 1);
    	
    	//rep.deleteById(2);
    	
    	
    }
}
