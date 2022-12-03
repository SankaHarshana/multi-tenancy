package com.project.multitenancy.service.organization;

import com.project.multitenancy.dto.common.OrganizationDto;
import com.project.multitenancy.exceptions.OrganizationException;
import com.project.multitenancy.repository.OrganizationRepository;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public OrganizationDto createOrg(OrganizationDto organizationDto) throws OrganizationException {
        return null;
    }
}
