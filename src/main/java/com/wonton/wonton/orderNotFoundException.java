package com.wonton.wonton;

public class orderNotFoundException extends RuntimeException  {
    
    public  orderNotFoundException(String messege){
        super(messege);
    }
}
