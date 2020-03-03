package contact.hfttech.biz.web;

import contact.hfttech.biz.error.ProcessContactException;
import contact.hfttech.biz.service.bo.ProcessContact;
import contact.hfttech.biz.service.data.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    private static Logger logger = LoggerFactory.getLogger("");

    @Autowired ProcessContact processContact;

    @PostMapping("/contact")
    public void processSubmit(@RequestParam(name="name", required=true) String name,
                              @RequestParam(name="email", required=true) String email,
                              @RequestParam(name="address", required=true) String address,
                              @RequestParam(name="notes", required=true) String notes ) {
        // Their is a better way to bind data just need to lookit up ....?????
        Contact contact = new Contact(name,email,address,notes);

        try {

            // Validate Input .......

            // Process input
            processContact.process(contact);

            // redirect to thankyou page.

        }
        catch(ProcessContactException pce) {
         // redirect to an error page ..... hang on spring has a redirection handler look that up
        }
    }
}
