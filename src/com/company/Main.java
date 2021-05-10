/*
Brian Hodge
C00170400
CMPS 260
Programming Assignment: #4
Due Date: 3/27/2019 @ 11:55pm

Program Description:
This program prompts the user to enter strings to be assigned to each ArrayList object
1 and 2. It then, determines if there are duplicate strings in the lists.
If so, it will output those string(s). Next, it determines if any string entered in either list
by the user is unique to a list, if so, it will output those unique string(s).

Certificate of Authenticity:
I certify that the code of this project, other than that that was generated
by IntelliJ, is entirely my own work.
 */

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void duplicateStrings(ArrayList<String> list1, ArrayList<String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            ArrayList<String> listThree = new ArrayList();
            int sameCount = 0;
            if (list1.contains(list2.get(i))) {
                listThree.add(list2.get(i));
                sameCount += 1;
                System.out.println(listThree.get(i));
            }
        }


        for (int i = 0; i < list2.size(); i++) {
            if (list1.contains(list2.get(i)) || list2.contains(list1.get(i))) {
                ArrayList<String> listThree = new ArrayList<>();
                listThree.add(list2.get(i));
                System.out.println(listThree.get(i));

            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //ArrayList<String> listOne;            //create 2 ArrayList<String> instance objects
        //ArrayList<String> listTwo = new ArrayList<>();

        System.out.print("Enter number of strings in ArrayList 1: ");     //Ask user to enter number of strings for ArrayList 1
        int list_1_length = input.nextInt();
        ArrayList<String> listOne = new ArrayList<>(list_1_length);

        for (int i = 0; i < list_1_length; i++) {         //have user enter that number strings and place their references in the first ArrayList.
            System.out.print("Enter String for List 1, value " + i + ": ");
            String stringValue1 = input.next();
            listOne.add(i, stringValue1);
        } System.out.println();

        System.out.print("Enter number of strings in ArrayList 2: ");  //Ask user to enter number of strings for ArrayList 2.
        int list2Length =  input.nextInt();
        ArrayList<String> listTwo = new ArrayList<>(list2Length);

        for (int i = 0; i < list2Length; i++) {       //have user enter that number strings and place their references in the second ArrayList.
            System.out.print("Enter String for List 2, value " + i + ": ");
            String stringValue2 = input.next();
            listOne.add(i, stringValue2);
        }

        ArrayList<String> listThree = new ArrayList<>();  //create a 3rd ArrayList<String> object

        duplicateStrings(listOne, listTwo);

        for (int i = 1; i < list2Length; i++ ) {
            if (listOne.get(i) == listTwo.get(i)) {
                listThree.add(listTwo.get(i));
                System.out.println(listThree.get(i));
            } else
                i++;
        }

        ArrayList<String> listFour = new ArrayList<>();    //create a fourth ArrayList<String> Object

        for (int i = 0; i < list2Length; i++) {
            if (listOne.containsAll(listTwo) == false) {
                System.out.println(listFour.add(listOne.get(i)));
            }
        }

    }
}
