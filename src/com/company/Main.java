package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        LinkedList<User>users=new LinkedList<>();
        users.add(new User(5,"Jora",35));
        users.add(new User(7,"Vova",25));
        users.add(new User(9,"Gulai",15));

        sortById(users);
        sortbyNaame(users);
        sortbyAge(users);





    }static void sortById(List List){
        Collections.sort(List);
        System.out.println(List);

    }static void sortbyNaame(List List){
        Collections.sort(List,User.sortbyNaame);
        System.out.println(List);
    }
    static void sortbyAge(List list){
        Collections.sort(list,User.sortbyAge);
        System.out.println(list);
    }




            }



