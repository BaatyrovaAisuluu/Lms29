package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();

    public static void main(String[] args) {
//        Integer массивден жуп сандарды терип алынызда
//        алардын квадраттарынын эн чонун табыныз.

        ArrayList<Integer>integerArrayList=new ArrayList<>(Arrays.asList(2,3,4,5,4,2,1,2,3,5,6,7));
        System.out.println(integerArrayList);
        System.out.println();

        List<Integer>L1=integerArrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println( "Жуп сандары "+L1);
        System.out.println();

     List<Integer> list= L1. stream().map(n ->(int) Math.pow(n, 2)).collect(Collectors.toList());
        System.out.println(list);

       Integer max=list.stream().max(Integer::compare).get();
        System.out.println(" Эн чону "+max);


        
    }




}
