package com.fruit.exception;

import com.fruit.utils.ResponseVO;
import com.fruit.utils.SysConstants;
import com.sun.corba.se.impl.io.TypeMismatchException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.io.IOException;

/**
 * ${DESCRIPTION}
 * 自定义异常返回Json
 * @author 张进
 * @create 2017-10-16 20:27
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 记录日志
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String logExceptionFormat = "Capture Exception By GlobalExceptionHandler: Code: %s Detail: %s";

    /**运行时异常*/
    @ExceptionHandler(RuntimeException.class)
    public String runtimeExceptionHandler(RuntimeException ex) {
        return resultFormat(SysConstants.RUNTIME_ERROR, ex);
    }

    /**空指针异常*/
    @ExceptionHandler(NullPointerException.class)
    public String nullPointerExceptionHandler(NullPointerException ex) {
        return resultFormat(SysConstants.NULL_ERROR, ex);
    }

    /**类型转换异常*/
    @ExceptionHandler(ClassCastException.class)
    public String classCastExceptionHandler(ClassCastException ex) {
        return resultFormat(SysConstants.CLASS_CAST_ERROR, ex);
    }

    /**IO异常*/
    @ExceptionHandler(IOException.class)
    public String iOExceptionHandler(IOException ex) {
        return resultFormat(SysConstants.IO_ERROR, ex);
    }

    /**未知方法异常*/
    @ExceptionHandler(NoSuchMethodException.class)
    public String noSuchMethodExceptionHandler(NoSuchMethodException ex) {
        return resultFormat(SysConstants.NO_SUCH_ERROR, ex);
    }

    /**数组越界异常*/
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public String indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException ex) {
        return resultFormat(SysConstants.INDEX_OUT_ERROR, ex);
    }

    /**400错误*/
    @ExceptionHandler({HttpMessageNotReadableException.class})
    public String requestNotReadable(HttpMessageNotReadableException ex) {
        logger.info("400..requestNotReadable");
        return resultFormat(SysConstants.HTTP_NOTREABALE_ERROR, ex);
    }

    /**400错误*/
    @ExceptionHandler({TypeMismatchException.class})
    public String requestTypeMismatch(TypeMismatchException ex) {
        logger.info("400..TypeMismatchException");
        return resultFormat(SysConstants.TYPE_MISMATCH, ex);
    }

    /**400错误*/
    @ExceptionHandler({MissingServletRequestParameterException.class})
    public String requestMissingServletRequest(MissingServletRequestParameterException ex) {
        logger.info("400..MissingServletRequest");
        return resultFormat(SysConstants.MISSING_SERVLET_REQUEST_PARAMTER_ERROR, ex);
    }

    /**405错误*/
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public String request405(HttpRequestMethodNotSupportedException ex) {
        return resultFormat(SysConstants.HTTP_REQUEST_METHOD_NOT_SUPPORTED_ERROR, ex);
    }

    /**406错误*/
    @ExceptionHandler({HttpMediaTypeNotAcceptableException.class})
    public String request406(HttpMediaTypeNotAcceptableException ex) {
        logger.info("406...");
        return resultFormat(SysConstants.HTTP_MEDIA_TYPE_NOT_ACCEPTABLE_ERROR, ex);
    }

    /**500错误*/
    @ExceptionHandler({ConversionNotSupportedException.class, HttpMessageNotWritableException.class})
    public String server500(RuntimeException ex) {
        logger.info("500...");
        return resultFormat(SysConstants.CONVERSION_NOT_SUPPORTED_ERROR, ex);
    }

    /**栈溢出*/
    @ExceptionHandler({StackOverflowError.class})
    public String requestStackOverflow(StackOverflowError ex) {
        return resultFormat(SysConstants.STACK_OVER_ERROR, ex);
    }

    /**其他错误*/
    @ExceptionHandler({Exception.class})
    public String exception(Exception ex) {
        return resultFormat(14, ex);
    }

    private <T extends Throwable> String resultFormat(Integer code, T ex) {
        ex.printStackTrace();
        logger.error(String.format(logExceptionFormat, code, ex.getMessage()));
        return ResponseVO.error(code, ex.getMessage());
    }

}
