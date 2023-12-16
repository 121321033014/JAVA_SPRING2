package com.Centum1.Sharathcars.service;

import com.Centum1.Sharathcars.dto.SharathcarRequest;
import com.Centum1.Sharathcars.entity.Sharathcar;
import com.Centum1.Sharathcars.exception.UserNotfoundException;
import com.Centum1.Sharathcars.repository.SharathcarsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SharathcarService {
    @Autowired
    private SharathcarsRepo repo;

    public Sharathcar saveUsers(SharathcarRequest request){
        Sharathcar savinguser=new Sharathcar();

        savinguser.setId(0);
        savinguser.setCarcode(request.getCarcode());
        savinguser.setCarname(request.getCarname());
        savinguser.setCarmodel(request.getCarmodel());
        savinguser.setCaryear(request.getCaryear());
        savinguser.setCarcolour(request.getCarcolour());
        savinguser.setCarvin(request.getCarvin());
        savinguser.setCarowner(request.getCarowner());
        savinguser.setState(request.getState());
        savinguser.setMobilenumber(request.getMobilenumber());
        savinguser.setPrice(request.getPrice());
        savinguser.setDetails(request.getDetails());
        return repo.save(savinguser);
    }

    public List<Sharathcar> getCars() {
        return repo.findAll();
    }

    public Sharathcar getCar(int id)throws UserNotfoundException {
        Sharathcar car=repo.findById(id);
        if(car!=null){
            return car;

        }else{
            throw new UserNotfoundException("the car your serching is not available");
        }

    }

}
