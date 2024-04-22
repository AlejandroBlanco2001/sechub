package com.mercedesbenz.sechub.wrapper.prepare;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mercedesbenz.sechub.adapter.AdapterExecutionResult;
import com.mercedesbenz.sechub.wrapper.prepare.cli.PrepareWrapperEnvironment;
import com.mercedesbenz.sechub.wrapper.prepare.factory.PrepareWrapperPDSUserMessageSupportPojoFactory;
import com.mercedesbenz.sechub.wrapper.prepare.factory.PrepareWrapperPojoFactory;
import com.mercedesbenz.sechub.wrapper.prepare.moduls.PrepareWrapperGIT;
import com.mercedesbenz.sechub.wrapper.prepare.moduls.PrepareWrapperGitModule;
import com.mercedesbenz.sechub.wrapper.prepare.moduls.PrepareWrapperModule;
import com.mercedesbenz.sechub.wrapper.prepare.prepare.PrepareWrapperContextFactory;
import com.mercedesbenz.sechub.wrapper.prepare.prepare.PrepareWrapperPreparationService;
import com.mercedesbenz.sechub.wrapper.prepare.prepare.PrepareWrapperRemoteConfigurationExtractor;

@SpringBootTest(classes = { PrepareWrapperContextFactory.class, PrepareWrapperPreparationService.class, PrepareWrapperPojoFactory.class,
        PrepareWrapperEnvironment.class, PrepareWrapperPDSUserMessageSupportPojoFactory.class, PrepareWrapperRemoteConfigurationExtractor.class,
        PrepareWrapperGitModule.class, PrepareWrapperModule.class, PrepareWrapperGIT.class })
@ExtendWith(SpringExtension.class)
@TestPropertySource(locations = "classpath:application-test.properties")
class PrepareWrapperApplicationSpringBootTest {

    @Autowired
    PrepareWrapperPreparationService preparationService;

    @Test
    void start_preparation_with_remote_test_properties_and_empty_prepare_service_list_is_success() throws IOException {
        /* execute */
        AdapterExecutionResult result = preparationService.startPreparation();

        /* test */
        assertEquals("SECHUB_PREPARE_RESULT;status=OK", result.getProductResult());
        assertEquals(0, result.getProductMessages().size());
    }

}