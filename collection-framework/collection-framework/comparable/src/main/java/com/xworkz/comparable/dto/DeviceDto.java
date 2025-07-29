package com.xworkz.comparable.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class DeviceDto implements Comparable<DeviceDto>{
    int deviceId;
    String deviceName;
    String brand;
    double price;
    boolean isSmart;

    @Override
    public int compareTo(DeviceDto o) {
        return this.getDeviceId() - o.getDeviceId();
    }
}
