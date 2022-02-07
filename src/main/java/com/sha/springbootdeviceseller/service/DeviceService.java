package com.sha.springbootdeviceseller.service;

import com.sha.springbootdeviceseller.model.Device;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DeviceService
{

    Device saveDevice(Device device);
    void deleteDevice(Long id);

    List<Device> findAllDevices();
}
