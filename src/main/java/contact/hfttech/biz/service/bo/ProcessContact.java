package contact.hfttech.biz.service.bo;

import contact.hfttech.biz.error.ProcessContactException;
import org.springframework.context.annotation.Bean;

import javax.transaction.Transactional;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProcessContact implements ProcessContactI {

    private static Logger logger = Logger.getLogger("ProcessContact");

    @Transactional
    public void process() throws ProcessContactException {
        try {
            // Persist to data base
            // dao.saveorupdate()
            // Send to Other Service.
            // boservice.update()

        } catch (Exception e) {
            logger.log(Level.SEVERE,"An Error Occured. +" + e.getCause() + " Stack trace: " + e.getStackTrace());
            throw new ProcessContactException(e.getMessage());

        } catch (Throwable t) {
            // The txn must roll back if any error occurs checked / unchecked  / run time.
            logger.log(Level.SEVERE,"Something really bad happened");
            throw new ProcessContactException(t.getMessage());
        }
        finally {
            // More academic ...... Usually to clean up / free references
            // Now that we have a closable interface one would use that.
        }
    }
}
