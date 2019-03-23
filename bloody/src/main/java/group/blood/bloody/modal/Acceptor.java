package group.blood.bloody.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Acceptor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long acceptorId;
    private String acceptorName;
    private int acceptorAge;
    private String acceptorBloodGroup;
    private String acceptorAddress;
    private Long pinCode;

}
