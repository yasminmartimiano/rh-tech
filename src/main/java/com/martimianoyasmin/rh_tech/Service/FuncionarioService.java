package com.martimianoyasmin.rh_tech.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martimianoyasmin.rh_tech.Model.FuncionarioModel;
import com.martimianoyasmin.rh_tech.Repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<FuncionarioModel> buscarPorId(Long id){
        return repository.findById(id);
    }

    public FuncionarioModel salvar(FuncionarioModel funcionarioModel){
        return repository.save(funcionarioModel);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
