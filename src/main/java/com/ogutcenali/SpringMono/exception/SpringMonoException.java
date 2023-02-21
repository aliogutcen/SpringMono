package com.ogutcenali.SpringMono.exception;

public class SpringMonoException  extends  RuntimeException{

    private final ErrorType errorType;


    /**
     * RunTime dan miras alığımız için hata mesajımız kendisine iletilmesi
     * gereklidir.
     * @param errorType
     */

    public SpringMonoException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }

    public SpringMonoException (ErrorType errorType , String message){
        super(message);
        this.errorType=errorType;

    }

}
