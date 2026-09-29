package com.wonton.wonton;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/wontonorder")
public class wontonController {


    private  final wontonService wontonService;

    public  wontonController(wontonService wontonService){
        this.wontonService=wontonService;

    }


    @PostMapping 
    public wonton createorder(@Valid @RequestBody  wonton wonton){
       
        return  wontonService.createorder(wonton);
    }
    

    @GetMapping 
    public  List<wonton> getallorder(){

        return  wontonService.getallorder();
    }


    @GetMapping ("/{id}")
     public  wonton getOrderById(@PathVariable Long id){

        return  wontonService.orderbyid(id);
     }


     @DeleteMapping("/{id}")
     public  String deleteorder(@PathVariable Long id){
        
             wontonService.deletebyid(id);
        return  "deleted";
     }


     @PutMapping("/{id}")
     public  wonton updatorder(@PathVariable Long id,@RequestBody  wonton wonton){

        return  wontonService.updatewontonorder(id, wonton);
     }
}
