package com.example.Music.Instrumental.Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Music.Instrumental.Store.Model.Payment;
@Repository

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
