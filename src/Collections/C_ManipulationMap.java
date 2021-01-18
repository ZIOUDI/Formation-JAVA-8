package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class C_ManipulationMap {

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////
		/////////// 1. Overview of Map ////////
		/////////////////////////////////////////////////////////////////

		/*
		 * Maps are perfectly for key-value association mapping such as dictionaries.
		 * Some examples:
		 *		A map of error codes and their descriptions.
		 *		A map of zip codes and cities
		 * 
		 * Why and When Use Sets? You want to store elements distinctly without
		 * duplication, or unique elements. You don’t care about the order of elements
		 * 
		 */

		///////////////////////////////////////////////////////////////////////
		////////////// 2. Implementations of Map             //////////////////
		///////////////////////////////////////////////////////////////////////

		/*
		 * HashSet: is the best-performing implementation and is a widely-used Set
		 * implementation. It represents the core characteristics of sets: no
		 * duplication and unordered. 
		 * 
		 * HashMap 
		 * 
		 * LinkedHashMap 
		 * 
		 * TreeMap
		 */

		///////////////////////////////////////////////////////////////////////
		////////////// 3. Creating a new Map       //////////////////
		///////////////////////////////////////////////////////////////////////
		
		Map<Integer, String> mapHttpErrors = new HashMap<>();
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		System.out.println(mapHttpErrors);
		
		//The map mapErrors is created with initial elements copied from the map mapHttpErrors.
		Map<Integer, String> mapErrors = new HashMap<>(mapHttpErrors);
		
        System.out.println("---------------- Creating a LinkedHashMap: ------------");
        Map<String, String> mapContacts = new LinkedHashMap<>();
        
        mapContacts.put("0169238175", "Tom");
        mapContacts.put("0904891321", "Peter");
        mapContacts.put("0945678912", "Mary");
        mapContacts.put("0981127421", "John");
         
        System.out.println(mapContacts);

        System.out.println("---------------- Creating a TreeMap : ------------");
        Map<String, String> mapLang = new TreeMap<>();
        
        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");
         
        System.out.println(mapLang);
		
		///////////////////////////////////////////////////////////////////////
		////////////// 4. Performing Basic Operations on a Map  //////////////////
		//////////////////////////////////////////////////////////////////////

	     System.out.println("------------------ Associating a value with a key:-------------");
	     Map<Integer, String> mapHttpErrors4 = new HashMap<>();
	     mapHttpErrors4.put(400, "Bad Request");
	     mapHttpErrors4.put(304, "Not Modified");
	     mapHttpErrors4.put(200, "OK");
	     mapHttpErrors4.put(301, "Moved Permanently");
	     mapHttpErrors4.put(500, "Internal Server Error");
	     
	     
	     System.out.println("-------------- Getting a value associated with a specified key ----------");
	     String status301 = mapHttpErrors4.get(301);
	     System.out.println("301: " + status301);
	     
	     
	     System.out.println("------------- Checking if the map contains a specified value------");
	     if (mapHttpErrors4.containsKey("200")) {
	    	    System.out.println("Http status 200");
	    	}
	     
	     System.out.println("------------- Checking if the map contains a specified value------");
	     if (mapHttpErrors4.containsValue("OK")) {
	    	    System.out.println("Found status OK");
	    	}
	     
	     System.out.println("--------------- Removing a mapping from the map -------------");
	     String removedValue = mapHttpErrors4.remove(500);
	     
	     if (removedValue != null) {
	         System.out.println("Removed value: " + removedValue);
	     }
	     
	     System.out.println("---Replacing a value associated with a specified key:--");
	     System.out.println("Map before: " + mapHttpErrors4);	     
	     mapHttpErrors4.replace(304, "No Changes");	      
	     System.out.println("Map after: " + mapHttpErrors4);

	     System.out.println("------------------ Getting the size of the map:   -------------");
	     int size = mapHttpErrors4.size();
	     
	     System.out.println("------------------ Checking if the map is empty:   -------------");
	     if (mapHttpErrors4.isEmpty()) {
	    	    System.out.println("No Error");
	    	} else {
	    	    System.out.println("Have HTTP Errors");
	    	}
        
        
	     
	    
	    

	
	    
		///////////////////////////////////////////////////////////////////////
		////////// 5. Iterating Over a Map (using Collection views)  ///////////////
		///////////////////////////////////////////////////////////////////////

         
	     
         System.out.println("-- ---keySet():     returns a Set view of the keys contained in the map--------------");
 
         Map<String, String> mapCountryCodes = new HashMap<>();
         
         mapCountryCodes.put("1", "USA");
         mapCountryCodes.put("44", "United Kingdom");
         mapCountryCodes.put("33", "France");
         mapCountryCodes.put("81", "Japan");
          
         Set<String> setCodes = mapCountryCodes.keySet();
         Iterator<String> iterator = setCodes.iterator();
          
         while (iterator.hasNext()) {
             String code = iterator.next();
             String country = mapCountryCodes.get(code);
          
             System.out.println(code + " => " + country);
         }
 	    
 	    System.out.println("-----values():    returns a collection of values contained in the map.--------------");
 	   Collection<String> countries = mapCountryCodes.values();
 	  
 	  for (String country : countries) {
 	      System.out.println(country);
 	  }
 	  
	    System.out.println("-----entrySet()  :  returns a Set view of the mappings contained in this map.-------");
 
	    Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();
	    
	    for (Map.Entry<String, String> entry : entries) {
	        String code = entry.getKey();
	        String country = entry.getValue();
	     
	        System.out.println(code + " => " + country);
	    }
	    
	    System.out.println("---   ----------    forEach()     ------------------------------------");
	    mapCountryCodes.forEach(
	    	    (code, country) -> System.out.println(code + " => " + country));
	    
		///////////////////////////////////////////////////////////////////////
		////////////// 6. Performing Bulk Operations with Maps   ///////////////
		///////////////////////////////////////////////////////////////////////
		
	    System.out.println("------------------------------------------------------------------");
	    System.out.println("---------------  clear() and putAll(). ------------ --------------");	    	    
	    System.out.println("------------------------------------------------------------------");
	    // clear() method removes all mappings from the map. The map will be empty after this method returns
	    
	    
	    System.out.println("-------        clear()   --------------");
	    mapHttpErrors.clear();
	    System.out.println("Is map empty? " + mapHttpErrors.isEmpty());

	    // putAll(Map<K, V> m) method copies all of the mappings from the specified map to this map
	    Map<Integer, String> countryCodesEU = new HashMap<>();
	    
	    countryCodesEU.put(44, "United Kingdom");
	    countryCodesEU.put(33, "France");
	    countryCodesEU.put(49, "Germany");
	     
	    Map<Integer, String> countryCodesWorld = new HashMap<>();
	     
	    countryCodesWorld.put(1, "United States");
	    countryCodesWorld.put(86, "China");
	    countryCodesWorld.put(82, "South Korea");
	     
	     
	    System.out.println("Before: " + countryCodesWorld);
	     
	    countryCodesWorld.putAll(countryCodesEU);
	     
	    System.out.println("After: " + countryCodesWorld);
	    
	    
	     
	     

	    
	    
		 
	    
	     
		/////////////////////////////////////////////////////////////////////////////
		//////////////////////      7. Concurrent Maps           ////////////////////
		/////////////////////////////////////////////////////////////////////////////
	    

	}
}
