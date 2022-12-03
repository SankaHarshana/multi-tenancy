package com.project.multitenancy.common;

import com.project.multitenancy.dto.common.ErrorMessage;
import com.project.multitenancy.dto.common.ResponseDto;
import com.project.multitenancy.dto.common.SuccessMessage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResponseBuilder {


    public static ResponseDto addMessage(String message, ResponseDto res) {
        SuccessMessage successMessage =  new SuccessMessage();
        successMessage.setMessage(message);
        successMessage.setStatus(1);
        return addMessage(successMessage, res);
    }

    public static ResponseDto addMessage(SuccessMessage successMessage) {
        return addMessage(successMessage, null);
    }

    public static ResponseDto addMessage(SuccessMessage successMessage, ResponseDto res) {
        res = createIfNull(res);
        if(res.getSuccessMessages() == null){
            List<SuccessMessage> success = new ArrayList<>();
            success.add(successMessage);
            res.setSuccessMessages(success);
        }else{

            res.getSuccessMessages().add(successMessage);
        }
        return res;
    }

    public static ResponseDto setOperationStatus(boolean operationStatus) {
        return setOperationStatus(operationStatus, null);
    }

    public static ResponseDto setOperationStatus(boolean operationStatus, ResponseDto res) {
        res = createIfNull(res);
        res.setStatus(operationStatus);
        return res;
    }

    public static <T> ResponseDto setData(Iterable<T> dataList, ResponseDto res) {
        res = createIfNull(res);
        res.setData(dataList);
        return res;
    }

    public static <T> ResponseDto setHeaders(HashMap<T,T> headers, ResponseDto res) {
        res = createIfNull(res);
        res.setHeaders(headers);
        return res;
    }

    public static <T> ResponseDto setData( T data) {
        return setData(data, null);
    }

    public static <T> ResponseDto setData(T data, ResponseDto res) {
        res = createIfNull(res);
        List<T> dataList = new ArrayList<T>() {{
            add(data);
        }};
        res.setData(dataList);
        return res;
    }

    public static ResponseDto createError(Exception exception)
    {
        return addError(exception,null);
    }

    public static ResponseDto addError(Exception exception,ResponseDto res) {
        res = createIfNull(res);
        if(res.getErrors() == null)
        {
            List<ErrorMessage> errors = new ArrayList<>();
            res.setErrors(errors);
        }
        ErrorMessage error = new ErrorMessage();
        StringWriter errorsStringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(errorsStringWriter));
        error.setMessage(exception.getMessage());
        error.setStackTrace(errorsStringWriter.toString());
        res.getErrors().add(error);
        return res;
    }

    public static ResponseDto create(){
        return createIfNull(null);
    }


    private static ResponseDto createIfNull(ResponseDto res){
        if (res == null)
        {
            res = new ResponseDto();
        }
        return res;
    }


    public static ResponseDto addErrorMessage(String message, ResponseDto res) {
        res = createIfNull(res);
        if(res.getErrors() == null)
        {
            List<ErrorMessage> errors = new ArrayList<>();
            res.setErrors(errors);
        }
        ErrorMessage error = new ErrorMessage();
        error.setMessage(message);
        res.getErrors().add(error);
        return res;
    }

}
