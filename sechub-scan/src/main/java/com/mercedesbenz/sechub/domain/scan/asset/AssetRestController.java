// SPDX-License-Identifier: MIT
package com.mercedesbenz.sechub.domain.scan.asset;

import static com.mercedesbenz.sechub.commons.core.CommonConstants.*;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mercedesbenz.sechub.sharedkernel.APIConstants;
import com.mercedesbenz.sechub.sharedkernel.RoleConstants;
import com.mercedesbenz.sechub.sharedkernel.Step;
import com.mercedesbenz.sechub.sharedkernel.logging.AuditLogService;
import com.mercedesbenz.sechub.sharedkernel.logging.LogSanitizer;
import com.mercedesbenz.sechub.sharedkernel.usecases.admin.config.UseCaseAdminDownloadsAssetFile;
import com.mercedesbenz.sechub.sharedkernel.usecases.admin.config.UseCaseAdminUploadsAssetFile;

import jakarta.annotation.security.RolesAllowed;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@EnableAutoConfiguration
@RequestMapping(APIConstants.API_ADMINISTRATION)
@RolesAllowed({ RoleConstants.ROLE_SUPERADMIN })
public class AssetRestController {

    @Autowired
    AssetService assetService;

    @Autowired
    AuditLogService auditLogService;

    @Autowired
    LogSanitizer logSanitizer;

    /* @formatter:off */
    @UseCaseAdminUploadsAssetFile(@Step(number = 1, next = 2, name = "REST API call to upload a file for an asset", needsRestDoc = true))
    @RequestMapping(path = "/asset/{assetId}/file", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    /* @formatter:on */
    public void uploadAssetFile(  
            @PathVariable("assetId") String assetId,
            @RequestPart(MULTIPART_FILE) MultipartFile file,
            @RequestParam(MULTIPART_CHECKSUM) String checkSum) {

        auditLogService.log("starts upload of file:{} for asset: {}", logSanitizer.sanitize(file.getName(), 100),logSanitizer.sanitize(assetId, 40));

        assetService.uploadAssetFile(assetId, file, checkSum);

    }
    
    /* @formatter:off */
    @UseCaseAdminDownloadsAssetFile(@Step(number = 1, next = 2, name = "REST API call to download a file for an asset", needsRestDoc = true))
    @RequestMapping(path = "/asset/{assetId}/file/{fileName}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_OCTET_STREAM_VALUE, MediaType.ALL_VALUE})
    @ResponseStatus(HttpStatus.OK)
    /* @formatter:on */
    public void downloadAssetFile (  
            @PathVariable("assetId") String assetId,
            @PathVariable("fileName") String fileName,
            HttpServletResponse response
            ) throws IOException {
        
        auditLogService.log("starts download of file:{} for asset: {}", logSanitizer.sanitize(fileName, 100),logSanitizer.sanitize(assetId, 40));
        
        assetService.downloadAssetFile(assetId, fileName, response.getOutputStream());
        
    }
}
