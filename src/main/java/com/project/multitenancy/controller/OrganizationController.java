package com.project.multitenancy.controller;


import com.project.multitenancy.common.ResponseBuilder;
import com.project.multitenancy.dto.common.OrganizationDto;
import com.project.multitenancy.dto.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@RestController
@RequestMapping("/organization")
@Slf4j
public class OrganizationController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> create(@RequestBody final OrganizationDto organizationDto,
                                              final HttpServletRequest request){
        final ResponseDto res = ResponseBuilder.create();

        log.debug("create");

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }


}
