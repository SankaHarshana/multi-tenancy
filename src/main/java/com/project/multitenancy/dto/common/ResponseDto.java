package com.project.multitenancy.dto.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private boolean status;
    private Iterable<?> data;
    private List<ErrorMessage> errors;
    private List<SuccessMessage> successMessages;
    private HashMap<?,?> headers;
}
