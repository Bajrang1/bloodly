package group.blood.bloody.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long donorId;
    private String donorName;
    private int donorAge;
    private String donorBloodGroup;
    private String donorAddress;
    private Long pinCode;


}
