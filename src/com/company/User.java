package com.company;

import java.util.Comparator;

public class User implements Comparable<User>{
    public static Comparator<? super Object> sortbyNaame;
    public static Comparator<? super Object> sortbyAge;
    private int id;
    private String naame;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaame() {
        return naame;
    }

    public void setNaame(String naame) {
        this.naame = naame;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", naame='" + naame + '\'' +
                ", age=" + age +
                '}';
    }

    public User(int id, String naame, int age) {
        this.id = id;
        this.naame = naame;
        this.age = age;


    }
    @Override
    public int compareTo(User o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }public static Comparator<User>byId=new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return 0;
        }

    public static Comparator<User>byNaame=new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return 0;
        }

    public static Comparator<User>byAge=new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            if (o1.age > o2.age) {
                return 1;

            } else if (o1.age < o2.age) {
                return -1;
            } else {
                return 0;
            }
        }
    };

















