package com.xworkz.map;

import com.xworkz.map.dto.MapDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    public static void main(String[] args) {
        Map<MapDto,Integer> map = new HashMap();
//         map.put("key1",78);
//         map.put("key2",79);
//         map.put("key3",80);
//        System.out.println("By using refence");
//        System.out.println(map);
//
//        System.out.println();
//
//        System.out.println("By for each");
//        map.forEach((k,v)-> System.out.println(k+"->"+v));
//        System.out.println();
//
//        System.out.println("By convert the map to set");
//        Set<Map.Entry<String,Integer>> mapList = map.entrySet();
//        for(Map.Entry<String,Integer> ma: mapList){
//            System.out.println(ma.getKey()+" "+ma.getValue());
//        }

        MapDto dto = new MapDto("Tejaswa", "D");
        MapDto dto1 = new MapDto("Tejaswa", "D");
        
//         re = System.out.println("hi");



//        System.out.println(dto.hashCode());


    }
}
