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

    public List<FuncionarioModel> listarFuncionario(){
        return repository.findAll();
    }

    public Optional<FuncionarioModel> buscarPorId(Long id){
        return repository.findById(id);
    }

    public FuncionarioModel salvarFuncionario(FuncionarioModel funcionarioModel){
        return repository.save(funcionarioModel);
    }
    
    public void deletar(Long id){
        repository.deleteById(id);
    }

    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel funcionarioModel) {
        Optional<FuncionarioModel> optionalFuncionario = repository.findById(id);
        if (optionalFuncionario.isPresent()) {
            FuncionarioModel funcionarioExistente = optionalFuncionario.get();
            funcionarioExistente.setNome(funcionarioModel.getNome());
            funcionarioExistente.setEmail(funcionarioModel.getEmail());
            funcionarioExistente.setSenha(funcionarioModel.getSenha());
            funcionarioExistente.setCep(funcionarioModel.getCep());
            funcionarioExistente.setEndereco(funcionarioModel.getEndereco());
            funcionarioExistente.setNumero(funcionarioModel.getNumero());
            funcionarioExistente.setBairro(funcionarioModel.getBairro());
            funcionarioExistente.setCidade(funcionarioModel.getCidade());
            funcionarioExistente.setEstado(funcionarioModel.getEstado());
            return repository.save(funcionarioExistente);
        } else {
            return null;
        }
    }
}
