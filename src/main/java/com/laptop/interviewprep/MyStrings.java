package com.laptop.interviewprep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStrings
{
    public static void main( String[] args )
    {
        
        //Example 1:  //splitting the string based on escape character
        String names = "ram\nshyam";
        String[] namesList = names.split("\n");
       // System.out.println(Arrays.asList(namesList));



        //Example 2
        String fields = "position,client,symbol";
        String[] fieldsList = fields.split(",");
        List<String> fl = Arrays.asList(fieldsList);
        List<String> resultList = fl.stream().map((list)->list.toUpperCase()).collect(Collectors.toList());

        System.out.println("before conversion:"+ fl + '\n' + "after conversion:" + resultList);


    }

}