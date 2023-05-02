package com.bestpractices.console;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

//import org.apache.commons.lang3.StringUtils;

public class MainClass {
	
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}

	public static void main(String[] args) {
		// Use StringUtil instead of String
		
//		String nullString = null;
//		String emptyString = "";
//		String blankString = "\n \t   \n";
//
//		System.out.println("*****Using isEmpty() method ****");
//		//Worst Practice -1
//		/*if(!nullString.isEmpty()) {
//		    System.out.println("nullString isn't null");
//		}*/
//		
//		//Best Practice -1
//		if (StringUtils.isEmpty(nullString)) {
//		    System.out.println("nullString is null");
//		}
//
//		if(StringUtils.isEmpty(emptyString)) {
//		    System.out.println("emptyString is empty");
//		}
//
//		if(StringUtils.isBlank(blankString)) {
//		    System.out.println("blankString is blank");
//		}
//		
//		System.out.println("*****Using equals() method ****");
//		//Worst practice -2
//		//System.out.println(nullString.equals(null));
//		//System.out.println(nullString.equals("string"));
//		
//		//Best Practice -2
//		System.out.println(StringUtils.equals(nullString, null));
//		System.out.println(StringUtils.equals(nullString, "string"));
//		
//		System.out.println("*****Using compare() method ****");
//		System.out.println(StringUtils.compare(null, null));
//		System.out.println(StringUtils.compare(null , "a"));
//		System.out.println(StringUtils.compare("a", null));
//		System.out.println(StringUtils.compare("a", "A"));
//		System.out.println(StringUtils.compare("a", "a"));
//
//		System.out.println("*****Using indexOf() N contains() method ****");
//		String s = "Java is a general-purpose programming language";
//		System.out.println(StringUtils.indexOf(s, "l"));
//		System.out.println(StringUtils.indexOf(s, "lan"));
//		System.out.println(StringUtils.indexOf(null, "a"));
//		
//		System.out.println(StringUtils.contains(null, "a"));
//		System.out.println(StringUtils.contains(s, "Java"));
//		System.out.println(StringUtils.contains(s, "Python"));
//		System.out.println(StringUtils.contains(s, "pRoGrAmMinG"));
//		
//		
//		System.out.println(StringUtils.substring("I Like Java", 4, 8));
//		System.out.println(StringUtils.substring("I Like Java", -7));
//		System.out.println(StringUtils.substring(null, 5));
//		
//		System.out.println("******split() *********");
//		String csvString = "Id, Name, Age, Location";
//    	
//		System.out.println(Arrays.toString(StringUtils.split(csvString, ',')));
//		//it returns null if the input is null
//		System.out.println(Arrays.toString(StringUtils.split(null, '.')));
//		System.out.println(Arrays.toString(StringUtils.split("", '.')));
//		System.out.println("******join() *********");
//		String[] myStr =  StringUtils.split(csvString, ',');
//		System.out.println(StringUtils.join(myStr, ';'));
//		
//		System.out.println("******remove() *********");
//		System.out.println(StringUtils.remove(null, 'a'));
//		System.out.println(StringUtils.remove("", 'a'));
//		System.out.println(StringUtils.remove("queued", 'u'));
//
//		System.out.println(StringUtils.remove(null, "abc"));
//		System.out.println(StringUtils.remove("", "abc"));
//		System.out.println(StringUtils.remove("abc", null));
//		System.out.println(StringUtils.remove("queued", "ue"));
//		
//		System.out.println("******replace() *********");
//		String string = "a simple sentence";
//		System.out.println(StringUtils.replace(string, "simple", "complicated"));
		
		
		// Creating an EnumMap of the Size enum
				EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);

				// Using the put() Method
				sizes1.put(Size.SMALL, 28);
				sizes1.put(Size.MEDIUM, 32);
				sizes1.put(Size.LARGE, 36);
				sizes1.put(Size.EXTRALARGE, 40);
				System.out.println("EnumMap1: " + sizes1);

				EnumMap<Size, Integer> sizes2 = new EnumMap<>(Size.class);

				// Using the putAll() Method
				sizes2.putAll(sizes1);
				sizes2.put(Size.LARGE, 36);
				System.out.println("EnumMap2: " + sizes2);

				// Using the entrySet() Method
				System.out.println("Key/Value mappings: " + sizes2.entrySet());

				// Using the keySet() Method
				System.out.println("Keys: " + sizes2.keySet());

				// Using the values() Method
				System.out.println("Values: " + sizes2.values());
				
				// Using the get() Method
		        int value = sizes2.get(Size.MEDIUM);
		        System.out.println("Value of MEDIUM: " + value);
		        
		     // Creating an EnumSet using allOf() -contains all the values of the specified
				// enum type Size
				EnumSet<Size> sizes = EnumSet.allOf(Size.class);

				System.out.println("EnumSet: " + sizes);

				// Creating an EnumSet using range()
				EnumSet<Size> sizes11 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);

				System.out.println("EnumSet1: " + sizes1);

				// Using of() with a single parameter -
				// The of() method creates an enum set containing the specified elements
				EnumSet<Size> sizes3 = EnumSet.of(Size.MEDIUM);
				System.out.println("EnumSet3: " + sizes3);

				EnumSet<Size> sizes4 = EnumSet.of(Size.SMALL, Size.LARGE);
				System.out.println("EnumSet4: " + sizes4);

				// Creating an EnumSet using allOf()
				EnumSet<Size> sizes5 = EnumSet.allOf(Size.class);

				Iterator<Size> iterate = sizes5.iterator();

				System.out.print("EnumSet5: ");
				while (iterate.hasNext()) {
					System.out.print(iterate.next());
					System.out.print(", ");
				}

				// Creating an EnumSet using allOf()
				EnumSet<Size> sizes6 = EnumSet.allOf(Size.class);

				// Creating an EnumSet using noneOf()
				EnumSet<Size> sizes7 = EnumSet.noneOf(Size.class);

				// Using add method
				sizes7.add(Size.MEDIUM);
				System.out.println("EnumSet7 Using add(): " + sizes7);

				// Using addAll() method
				sizes7.addAll(sizes11);
				System.out.println("EnumSet7 Using addAll(): " + sizes7);
				
				
				List<byte[]> list = new ArrayList<>();

				try {
					for (int i = 0; i < 200000; i++) {
						byte[] bytes = new byte[10000];
						list.add(bytes);
						System.out.println(list);
						Thread.sleep(10);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	}

}
