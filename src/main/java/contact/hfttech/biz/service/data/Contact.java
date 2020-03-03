package contact.hfttech.biz.service.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter // Should it be immutable ?? If so leave it out
@NoArgsConstructor
public class Contact {
    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;
    @NotNull
    private String address; //could be abstracted into an object heirarcy where the address components are separated out

    @NotNull
    @Size(min=2, max=500)
    private String notes; // added extra requirement for somthing I want to do my self latter

    public Contact(String name, String email, String address, String notes) {
        this.name = name;
        this.email = email;
        this.address = address
        this.notes = notes;
    }
}
