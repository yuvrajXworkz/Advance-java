package com.xworkz.aadhaar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person_info")
public class PersonDto {

    @Id
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")

    private  int id;

    @Column(name = "first_name")
    private  String firstname;

    @Column(name = "last_name")
    private  String lastname;

    @Column(name = "phone")
    private  long phone;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "modified_at")
    private  Date modifiedAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aadhar_id")
    private AdhaarDto adhaarDto;
}
