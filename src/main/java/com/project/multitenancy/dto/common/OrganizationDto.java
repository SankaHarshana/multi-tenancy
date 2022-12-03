package com.project.multitenancy.dto.common;

import com.project.multitenancy.model.User;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrganizationDto {

    private Long id;
    private String name;
    private User owner;
    private List<User> users;
}
