package BasicOfJava;

public class Notes {
/**
Class Object Method


Class:- When we say class which means it represents generic term through which we can indicate the group of object.


In other word it is imaginary world or blueprint of objet, when we say human being, we won’t make out anything until we say some individual name.

When we say animal we won’t make out anything until we say some individual animal name. without saying animal name, we can just imagine groups of animal object.

e.g: Human being,Vehicle, Animal
Human being represents group of human objects (Ram, Shyam,Mohan)
Vehicle:
Vehicle represents groups of vehicle objects (Car, Bike, Truck)
Animal:-
Animal represents groups of animal objects (Cow, Bear, Ant)

Object:- Object Has properties and behaviors
For e.g Ram has properties (hight, weight,color) and Behaviors like (Walk, Talk, Eat, Sleep) 
Cow Has Properties (color, weight, horn) and Behaviors like (Eat, Walk) 
Car Has properties (Four wheel, Engine, Weight ) and Behaviors like (Run, Sound) 

Method:- Behaviors or Action of object is Method
e.g Walk, Talk, Eat, Sleep,Run, Sound

Structure Of Class
Example of Class, Method and Object

package coreJavaLearning.basicOfJava;
public class Example1 {
int i;
int j;
public void test(int k){
System.out.println("I am method");
}
public static void main(String[] args) {
Example1 obj = new Example1();
obj.test(5);
}
}
Point to remember

First Line of class is always package Name
Public is access of Class
int i, int j is class variables
---------------------------------
public void test(int k)
Method first String "Public" is access to method
"int k" is local variable to method
void is return type of method
---------------------------------
public static void main(String[] args)
Main method is always static method
Return type of main method is always void
Main method return type is always Array of String
 */
}
