package contact.hfttech.biz.service.dao;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@NamedQueries(
        @NamedQuery(name = "findbyname", query="select o from ContactEntity where name=:?")
)
public class ContactEntity implements Serializable {

    private @Id Long id;

    private String name;
    private String email;
    private String address; //could be abstracted into an object heirarcy where the address components are separated out
    private String note; // added extra requirement for somthing I want to do my self latter

    public ContactEntity(String name, String email, String address, String note){
        this.name = name;
        this.email = email;
        this.address = address;
        this.note = note;
    }

}
