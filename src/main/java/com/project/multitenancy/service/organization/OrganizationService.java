package com.project.multitenancy.service.organization;

import com.project.multitenancy.dto.common.OrganizationDto;
import com.project.multitenancy.exceptions.OrganizationException;

public interface OrganizationService {

    OrganizationDto createOrg(final OrganizationDto organizationDto) throws OrganizationException;

}
