package com.CoreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//Consumer
//import java.util.ArrayList;
//        import java.util.List;
//        import java.util.function.Consumer;
public class ConsumerInt{
    static void addList(List<Integer> list)
    {
        int res=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of List: "+res);
    }

    public static void main(String[] args)
    {
        List<Integer>list=new ArrayList<Integer>();
        list.add(20);
        list.add(23);
        list.add(8);
        list.add(13);
        Consumer<List<Integer>> consumer=ConsumerInt::addList;
        consumer.accept(list);
    }
}
