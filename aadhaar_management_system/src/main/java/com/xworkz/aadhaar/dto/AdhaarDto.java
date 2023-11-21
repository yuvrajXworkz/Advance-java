package com.xworkz.aadhaar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "aadhar_info")
public class AdhaarDto {
    @Id
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")

    @Column(name = "aadhaar_id")
    private int aadhaarid;

    @Column(name = "address")
    private  String address;

    @Column(name = "pincode")
    private  int pincode;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "mmodified_at")
    private  Date modifiedAt;

}
