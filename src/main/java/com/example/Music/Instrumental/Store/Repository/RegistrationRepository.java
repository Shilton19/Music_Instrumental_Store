package com.example.Music.Instrumental.Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Music.Instrumental.Store.Model.Registrations;

@Repository
public interface RegistrationRepository extends JpaRepository<Registrations, Integer> {
}
