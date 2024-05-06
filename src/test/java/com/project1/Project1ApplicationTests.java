package com.project1;


import com.project1.entity.Registration;
import com.project1.repository.RegistrationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;


@SpringBootTest
class Project1ApplicationTests {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Test
    void createRegistration(){
        Registration registration = new Registration();
        registration.setName("stallin");
        registration.setEmail("stallin@gmail.com");
        registration.setCourse("java");
        registration.setMobile(8960872276L);
        registrationRepository.save(registration);
    }

    @Test
    void deleteById(){
        registrationRepository.deleteById(3L);
    }

    @Test
    void findById(){
        Optional<Registration> byId = registrationRepository.findById(2L);
        if(byId.isPresent()){
            Registration registration = byId.get();
            System.out.println(registration.getId());
            System.out.println(registration.getName());
            System.out.println(registration.getCourse());
            System.out.println(registration.getEmail());
            System.out.println(registration.getMobile());
        }else {
            System.out.println("record not found");
        }

    }

    @Test
    void findByMobile(){
        Optional<Registration> byId = registrationRepository.findByMobile(8960872274L);
        if(byId.isPresent()){
            Registration registration = byId.get();
            System.out.println(registration.getId());
            System.out.println(registration.getName());
            System.out.println(registration.getCourse());
            System.out.println(registration.getEmail());
            System.out.println(registration.getMobile());
        }else {
            System.out.println("record not found");
        }

    }

    @Test
    void findByEmail(){
        Optional<Registration> byId = registrationRepository.findByEmail("mike@gmail.com");
        if(byId.isPresent()){
            Registration registration = byId.get();
            System.out.println(registration.getId());
            System.out.println(registration.getName());
            System.out.println(registration.getCourse());
            System.out.println(registration.getEmail());
            System.out.println(registration.getMobile());
        }else {
            System.out.println("record not found");
        }

    }

    @Test
    void findByCourse(){
        Optional<Registration> byId = registrationRepository.findByCourse("html");
        if(byId.isPresent()){
            Registration registration = byId.get();
            System.out.println(registration.getId());
            System.out.println(registration.getName());
            System.out.println(registration.getCourse());
            System.out.println(registration.getEmail());
            System.out.println(registration.getMobile());
        }else {
            System.out.println("record not found");
        }

    }

    @Test
    void findByMobileAndEmail(){
        Optional<Registration> byId = registrationRepository.findByMobileAndEmail(8960872274L, "mike@gmail.com");
        if(byId.isPresent()){
            Registration registration = byId.get();
            System.out.println(registration.getId());
            System.out.println(registration.getName());
            System.out.println(registration.getCourse());
            System.out.println(registration.getEmail());
            System.out.println(registration.getMobile());
        }else {
            System.out.println("record not found");
        }

    }

    @Test
    void findByMobileOrEmail(){
        List<Registration> byMobileOrEmail = registrationRepository.findByMobileOrEmail(8960872274L, "adam@gmail.com");
        for (Registration registration:byMobileOrEmail){
            System.out.println(registration.getId());
            System.out.println(registration.getName());
            System.out.println(registration.getCourse());
            System.out.println(registration.getEmail());
            System.out.println(registration.getMobile());
        }
    }

    @Test
    void existsById(){
        boolean val = registrationRepository.existsById(2L);
        System.out.println(val);
    }

    @Test
    void existsByMobile(){
        boolean val = registrationRepository.existsByMobile(8960872274L);
        System.out.println(val);
    }

    @Test
    void existsByEmail(){
        boolean val = registrationRepository.existsByEmail("mike@gmail.com");
        System.out.println(val);
    }
}
