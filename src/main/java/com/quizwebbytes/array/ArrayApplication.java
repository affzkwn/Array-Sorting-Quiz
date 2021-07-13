package com.quizwebbytes.array;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayApplication {

    static void printIntersection(ArrayList<Integer> arr, ArrayList<Integer> arr2, int n, int m)
    {
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr.get(i) < arr2.get(j)){ //check if the value arr less than arr2. Increment to i for next checking.
                i++;
            } 
            else if (arr2.get(j) < arr.get(i)){ //check if the value arr2 less than arr. Increment to j for next checking.
                 j++;    
            }
            else {
                System.out.println(arr2.get(j++) + " "); //if arr is not less than arr2 & arr2 is not less than arr. They are equal.
                i++;
            }
        }
    }
public static void main(String args[])
{
    // Creating arraylist
    ArrayList<Integer> arr = new ArrayList<Integer>();

    // Adding object in arraylist
    arr.add(29);
    arr.add(40);
    arr.add(50);
    arr.add(100);
    arr.add(12);
    arr.add(51);
    arr.add(21);
    arr.add(30);

    //creating arraylist for arr2
    ArrayList<Integer> arr2 = new ArrayList<Integer>();

    //Adding object in arraylist
    arr2.add(77);
    arr2.add(80);
    arr2.add(21);
    arr2.add(12);
    arr2.add(567);
    arr2.add(21);
    arr2.add(102);
    

    // Storing the size of the ArrayList in variable n
    int n = arr.size();
    int m = arr2.size();
    int i=0;
    int div=0;
    System.out.println("Elements of the ArrayList : ");

    for (i = 0; i < n; i++) {
        System.out.print(arr.get(i) + " ");
    
    }
    System.out.println("\n");
    for (i = 0; i < m; i++) {
        System.out.print(arr2.get(i) + " ");
    }

    System.out.println();

    // The ArrayList will be sorted using predefined
    // function
    Collections.sort(arr);
    Collections.sort(arr2);

    System.out.println("ArrayList after sorting : ");

    for (i = 0; i < n; i++) {
        System.out.print(arr.get(i) + " "); //print values after sorting
    }
    System.out.println("\n");
    for (i = 0; i < m; i++) {
        System.out.print(arr2.get(i) + " "); //print values after sorting
    }

    System.out.println();

    // First and last element of the ArrayList gets stored
    // into min and max variable
    int min = arr.get(0); 
    int max = arr.get(n - 1);
    

    System.out.println("Maximum is : " + max);
    System.out.println("Minimum is : " + min);

    System.out.println("Same Value of Array: ");
    printIntersection(arr, arr2, n, m); //public function

    System.out.println("Values that divisible by 3: ");
    for (i = 0; i < n; i++) {
        if(arr.get(i)%3==0){ //check either remainder equal to zero
            div=arr.get(i); 
            System.out.println(div);
            }
        }
    }

}





