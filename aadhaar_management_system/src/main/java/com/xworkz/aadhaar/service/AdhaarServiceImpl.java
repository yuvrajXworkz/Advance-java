package com.xworkz.aadhaar.service;

import com.xworkz.aadhaar.dto.PersonDto;
import com.xworkz.aadhaar.repository.AdhaarRepository;
import com.xworkz.aadhaar.repository.AdhaarRepositoryImpl;

public class AdhaarServiceImpl implements AdhaarService {

    boolean isaadhaaridvalidated = false;
    boolean isaddressvlidated = false;
    boolean ispincodevalidated = false;
    boolean iscreatedvalidted = false;
    boolean ismodifiedvalidted = false;

    AdhaarRepository adhaarRepository;

    public AdhaarServiceImpl() {
        adhaarRepository = new AdhaarRepositoryImpl();
    }

    @Override
    public void addAndvalidate(PersonDto dto) {
        if (dto != null) {

            if (dto.getAdhaarDto().getAadhaarid() > 0) {
                isaadhaaridvalidated = true;
            }
            if (dto.getAdhaarDto().getAddress() != null) {
                isaddressvlidated = true;
            }
            if (dto.getAdhaarDto().getPincode() > 0) {
                ispincodevalidated = true;
            }
            if (dto.getAdhaarDto().getCreatedAt() != null) {
                iscreatedvalidted = true;
            }
            if (dto.getAdhaarDto().getModifiedAt() != null) {
                ismodifiedvalidted = true;
            }

        }
        if (isaadhaaridvalidated==true&&isaddressvlidated==true&&ispincodevalidated==true&&iscreatedvalidted==true&&ismodifiedvalidted==true){
            adhaarRepository.add(dto);
        }

    }
}