package com.java8example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		List<Bus> busList = Stream.of(
				new Bus(1,"RouteBus", 25,"100km",3.5,Arrays.asList("986789093425","7890653456")),
				new Bus(2,"Seater", 100,"200km",4.2,Arrays.asList("986789093444","7890653409")),
				new Bus(3,"SemiSleeper", 500,"300km",4.0,Arrays.asList("886789093425","9790653456")),
				new Bus(4,"Sleeper", 750,"400km",4.5,Arrays.asList("986789093409","7890653411")),
				new Bus(5,"SemiSleeper", 500,"300km",3.8,Arrays.asList("986789093123","7890653123")),
				new Bus(6,"Seater", 100,"200km",3.9,Arrays.asList("884789093425","7890653098")),
				new Bus(7,"Sleeper", 750,"400km",4.3,Arrays.asList("980989093425","7812653456")),
						new Bus(8,"Sleeper", 750,"400km",4.5,Arrays.asList("980989193425","7812643456")),
						new Bus(9,"RouteBus", 25,"100km",4.0,Arrays.asList("776789093425","7690653456")))
				.collect(Collectors.toList());

//		List<Product> studentList= Stream.of(new Product(1,"Anand",25,"Male","ComputerScience","coimbatore",125, Arrays.asList("986789093425","7890653456")),
//		new Product(2,"Arun",25,"Male","Biology","Bangalore",57, Arrays.asList("986789093444","7890653409")),
//				new Product(3,"Basker",27,"Male","Arts","coimbatore",169, Arrays.asList("886789093425","9790653456")),
//				new Product(4,"Divya",24,"Female","ComputerScience","coimbatore",100, Arrays.asList("986789093409","7890653411")),
//				new Product(5,"mohan",25,"Male","Biology","Chennai",17, Arrays.asList("986789093123","7890653123")),
//				new Product(6,"Jaffer",27,"Male","Commerce","Hyderabad",69, Arrays.asList("884789093425","7890653098")),
//				new Product(7,"Philips",28,"Male","Commerce","Chennai",12, Arrays.asList("980989093425","7812653456")),
//				new Product(8,"Sembiyan",25,"Male","Commerce","coimbatore",36, Arrays.asList("986745093425","7890563456")),
//				new Product(9,"Sowmiya",27,"Female","Biology","Hyderabad",42, Arrays.asList("776789093425","7690653456")))
//						.collect(Collectors.toList());


		//1.get list of buses whose ticket price is 50 to 200.

		List<Bus> buses = busList.stream().filter(bus -> bus
						.getStartingRate() >= 50 && bus.getStartingRate() <= 200)
				.collect(Collectors.toList());
		System.out.println(buses);

		//2.buslist who travels to particular distance and sort them by type.

		List<Bus> buses1 = busList.stream().filter(bus -> bus.getTravelDistance().equals("300km"))
				.sorted(Comparator.comparing(Bus::getBusType))
				.collect(Collectors.toList());
		System.out.println(buses1);

		//3.find all bus type names;
		List<String> busType = busList.stream()
				.map(Bus::getBusType)
				.distinct()
				.collect(Collectors.toList());
		System.out.println("bus list using distinct: " + busType);

		// into set.
		Set<String> busSet = busList.stream()
				.map(Bus::getBusType)
				.collect(Collectors.toSet());
		System.out.println("bus list using set: " + busSet);

		//4.find all contact numbers.
		List<List<String>> busContact = busList.stream().map(Bus::getContact).distinct().collect(Collectors.toList());
		System.out.println("bus contacts : " + busContact);

		//flatMap

		List<String> busContactList = busList.stream().flatMap(bus -> bus.getContact().stream()).collect(Collectors.toList());
		System.out.println("bus contact: " + busContactList);

		//5.group bus by busType;
		Map<String, List<Bus>> collect = busList.stream().collect(Collectors.groupingBy(Bus::getBusType));
		System.out.println(collect);

		//if need to get count of bus based on type;
		Map<String, Long> collect1 = busList.stream().collect(Collectors
				.groupingBy(Bus::getBusType, Collectors.counting()));
		System.out.println(collect1);

		//6.Find the bus which has maximum count.
		Map.Entry<String, Long> stringLongEntry = busList.stream().collect(Collectors.groupingBy(Bus::getBusType, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(stringLongEntry);

		//7.find the average rate of sleeper and seater bus;
		Map<String, Double> collect2 = busList.stream().collect(Collectors.groupingBy(Bus::getTravelDistance,
				Collectors.averagingInt(Bus::getStartingRate)));
		System.out.println(collect2);

		//8.find the highest rating in each type.
		Map<String, Optional<Bus>> highestRating = busList.stream()
				.collect(Collectors.groupingBy(Bus::getBusType,
				 Collectors.maxBy(Comparator.comparing(Bus::getStarRating))));
		System.out.println("bus based on rating: " + highestRating);

		//9.find the second highest rating.
		Bus bus = busList.stream().sorted(Comparator.comparing(Bus::getStarRating,
				Comparator.reverseOrder()))
				.skip(1)
				.findFirst().get();
		System.out.println("second max rate: " + bus);
	}

}
