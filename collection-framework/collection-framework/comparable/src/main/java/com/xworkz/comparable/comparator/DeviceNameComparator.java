package com.xworkz.comparable.comparator;

import com.xworkz.comparable.dto.DeviceDto;

import java.util.Comparator;

public class DeviceNameComparator implements Comparator<DeviceDto> {
    @Override
    public int compare(DeviceDto o1, DeviceDto o2) {
        return o1.getDeviceName().compareTo(o2.getDeviceName());
    }
}
