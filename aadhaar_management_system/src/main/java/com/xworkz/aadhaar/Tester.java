package com.xworkz.aadhaar;

import com.xworkz.aadhaar.dto.AdhaarDto;
import com.xworkz.aadhaar.dto.PersonDto;
import com.xworkz.aadhaar.service.AdhaarService;
import com.xworkz.aadhaar.service.AdhaarServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        PersonDto personDto=new PersonDto();
        System.out.println("enter firstname");
        personDto.setFirstname(sc.next());

        System.out.println("enter lastname");
        personDto.setLastname(sc.next());

        System.out.println("enter phone");
        personDto.setPhone(sc.nextLong());

        System.out.println("enter createde date");
        personDto.setCreatedAt(new Date());

        System.out.println("enter modified");
        personDto.setModifiedAt(new Date());

        AdhaarDto adhaarDto=new AdhaarDto();

        System.out.println("enter id");
        adhaarDto.setAadhaarid(sc.nextInt());

        System.out.println("enter address");
        adhaarDto.setAddress(sc.next());

        System.out.println("enter pincode");
        adhaarDto.setPincode(sc.nextInt());

        System.out.println("enter credtedat");
        adhaarDto.setCreatedAt(new Date());

        System.out.println("enter modified");
        adhaarDto.setModifiedAt(new Date());

        personDto.setAdhaarDto(adhaarDto);

        AdhaarService adhaarService=new AdhaarServiceImpl();
        adhaarService.addAndvalidate(personDto);


    }
}
