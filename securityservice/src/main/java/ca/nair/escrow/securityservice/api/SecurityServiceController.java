package ca.nair.escrow.securityservice.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/security")
public class SecurityServiceController {
    private final Logger logger = LoggerFactory.getLogger(SecurityServiceController.class);

}
