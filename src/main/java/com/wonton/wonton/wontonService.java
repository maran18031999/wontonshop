package com.wonton.wonton;

import java.util.List;


import org.springframework.stereotype.Service;

@Service 
public class wontonService {
    
    private  final wontonRepo wontonRepo;


    public  wontonService(wontonRepo wontonRepo){
        this.wontonRepo=wontonRepo;
    }

    public  wonton createorder(wonton wonton){

        return  wontonRepo.save(wonton);
    }


    public  List<wonton> getallorder(){

        return wontonRepo.findAll();
    }

    public  wonton orderbyid(Long id){
        return  wontonRepo.findById(id).orElseThrow(() ->new orderNotFoundException("order not found nigga" +id));
    }

    public  void deletebyid(Long id){
          wontonRepo.deleteById(id);
    }

    public  wonton updatewontonorder(Long id,wonton wonton){
         wonton wontonexisting=wontonRepo.findById(id).orElse(null);
          
         if(wontonexisting ==null){
            return  null;
         }
            wontonexisting.setCustomerName(wonton.getCustomerName());
            wontonexisting.setFoodName(wonton.getFoodName());
            wontonexisting.setPrice(wonton.getPrice());

            return wontonRepo.save(wontonexisting);
        
    }
}
