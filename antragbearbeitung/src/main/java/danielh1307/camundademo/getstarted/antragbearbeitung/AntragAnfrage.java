package danielh1307.camundademo.getstarted.antragbearbeitung;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class AntragAnfrage implements JavaDelegate {

    private static final Logger LOGGER = Logger.getLogger(AntragAnfrage.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Processing AntragAnfrage by " + delegateExecution.getVariable("customerId") + " ...");
    }
}
