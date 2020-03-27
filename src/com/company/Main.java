package com.company;

public class Main {

    public static void main(String[] args) {
	double x=1;
	double y=3.5;
	double rez=0;
	rez=(Math.sin(x)+Math.cos(y))*Math.tan(x*y)/(Math.cos(x)-Math.sin(y));
	System.out.println(rez);
    }
}
