package com.example.Music.Instrumental.Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Music.Instrumental.Store.Model.DeliveryStatus;
@Repository
public interface DeliveryStatusRepository extends JpaRepository<DeliveryStatus, Integer>{

}
