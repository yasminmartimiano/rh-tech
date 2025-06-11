package com.martimianoyasmin.rh_tech.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martimianoyasmin.rh_tech.Model.CargoModel;
import com.martimianoyasmin.rh_tech.Repository.CargoRepository;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repository;
    //GET - listar todos os cargos
    public List<CargoModel> listarTodos(){
        return repository.findAll();
    }

    //POST - cadastrar
    public CargoModel cadastrarCargo(CargoModel cargoModel){
        return repository.save(cargoModel);
    }

    //PUT - atualizar/salvar
    public CargoModel salvar(CargoModel cargoModel){
        return repository.save(cargoModel);
    }

    //GET - buscar por id
    public Optional<CargoModel> buscarPorId(Long id){
        return repository.findById(id);
    }
    
    //DELETE
    public void deletarCargo(Long id){
        repository.deleteById(id);
    }

}
