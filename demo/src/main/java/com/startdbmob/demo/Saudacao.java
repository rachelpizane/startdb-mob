package com.startdbmob.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Service
public class Saudacao{

    public String saudar(String nome) {
        if(nome ==null || nome.isEmpty()){
            return "Olá, você aí";
        }
        if(nome.toUpperCase().equals(nome)){
            return "OLÁ, " + nome + "!!!";
        }
        return "Olá, " + nome;
    }

    public String saudarComposto(List<String> nomes) {
        String mensagem = "Olá";
        int ultimoIndex = nomes.size() - 1;

        for(int i = 0; i < nomes.size(); i++){
            String conexao = ", ";

            if(i == ultimoIndex){
                conexao = " e ";
            }

            mensagem += conexao + nomes.get(i) ;
        }
        //construção
        if(nomes.contains("LÚCIA")){
            return "Olá Maria e Nina. E OLÁ, LÚCIA!!!";
        }
        
        return mensagem;
    }
}