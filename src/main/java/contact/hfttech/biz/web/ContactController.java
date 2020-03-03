package contact.hfttech.biz.web;

import contact.hfttech.biz.service.data.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {


    @PostMapping("/contact")
    public void processSubmit(@RequestParam(name="name", required=true) String name,
                              @RequestParam(name="email", required=true) String email,
                              @RequestParam(name="address", required=true) String address,
                              @RequestParam(name="notes", required=true) String notes ) {
        // Their is a better way to bind data just need to lookit up ....?????
        Contact contact = new Contact(name,email,address,notes);

        @Autowired

    }

}
