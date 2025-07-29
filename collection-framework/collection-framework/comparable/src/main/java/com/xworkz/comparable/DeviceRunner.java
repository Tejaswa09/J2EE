package com.xworkz.comparable;

import com.xworkz.comparable.comparator.DeviceNameComparator;
import com.xworkz.comparable.dto.DeviceDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeviceRunner {
    public static void main(String[] args) {
        DeviceDto deviceDto = new DeviceDto(3, "Watch", "Boat", 1999.0, true);
        DeviceDto deviceDto1 = new DeviceDto(1, "Laptop", "HP", 55999.0, true);
        DeviceDto deviceDto2 = new DeviceDto(2, "Fan", "Usha", 2999.0, false);
        List<DeviceDto> deviceDtos = new ArrayList<>();
        deviceDtos.add(deviceDto);
        deviceDtos.add(deviceDto1);
        deviceDtos.add(deviceDto2);

        System.out.println("Before Sorting");
        for (DeviceDto device : deviceDtos) {
            System.out.println(device);
        }

        Collections.sort(deviceDtos); // sorting by deviceId

        System.out.println("\nAfter Sorting:");
        for (DeviceDto device : deviceDtos) {
            System.out.println(device);
        }

        System.out.println("Sort by Device Name");

        Collections.sort(deviceDtos,new DeviceNameComparator());
        for (DeviceDto device : deviceDtos) {
            System.out.println(device);
        }
    }
}