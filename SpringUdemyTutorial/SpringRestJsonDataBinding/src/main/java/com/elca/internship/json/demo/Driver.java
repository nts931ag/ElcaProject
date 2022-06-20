package com.elca.internship.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try{
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/convert to java POJO
            // data/sample-lite.json
            Student student = mapper.readValue(
                    new File("C:\\Users\\NGUS\\intellij-workspace\\ElcaProject\\SpringUdemyTutorial\\SpringRestJsonDataBinding\\data\\sample-full.json")
                    , Student.class);

            // print fist name and last name
            System.out.println("First name = " + student.getFirstName());
            System.out.println("Last name = " + student.getLastName());
        }
        catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
