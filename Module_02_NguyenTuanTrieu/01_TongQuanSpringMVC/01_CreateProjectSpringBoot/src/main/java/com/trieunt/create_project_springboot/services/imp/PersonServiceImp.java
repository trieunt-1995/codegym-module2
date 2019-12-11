package com.trieunt.create_project_springboot.services.imp;

import com.trieunt.create_project_springboot.entity.Person;
import com.trieunt.create_project_springboot.services.PersonService;

import java.util.HashMap;
import java.util.Map;

public class PersonServiceImp implements PersonService {

    private static Map<Integer, Person> map = new HashMap<>();
    
}
