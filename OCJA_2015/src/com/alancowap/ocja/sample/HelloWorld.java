/** 
 *  Simple class to demo java.
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

package com.alancowap.ocja.sample;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Person p = new Person();
		System.out.println(p.getName());
		p.setName("Alan");
		System.out.println(p.getName());

	}

}
