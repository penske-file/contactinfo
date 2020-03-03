package contact.hfttech.biz.service.bo;

import contact.hfttech.biz.error.ProcessContactException;
import contact.hfttech.biz.service.data.Contact;

public interface ProcessContactI {

    void process(Contact contact) throws ProcessContactException;

}
