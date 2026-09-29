package com.wonton.wonton;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class wontonserviceTest {
   
    @Mock 
    private  wontonRepo wontonRepo;

    @InjectMocks 
    private  wontonService wontonService;

    @Test 
    void getorderbyidshoudreturn(){
        
    }
    
}
