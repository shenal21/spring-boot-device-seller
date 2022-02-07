package com.sha.springbootdeviceseller.repository;
import com.sha.springbootdeviceseller.model.Device;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DeviceRepository extends JpaRepository<Device,Long>
{
    
}
