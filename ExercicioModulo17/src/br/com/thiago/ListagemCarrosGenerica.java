package br.com.thiago;

import java.util.HashSet;
import java.util.Set;

public class ListagemCarrosGenerica{

    public static void main(String[] args) {
        Set<Object> listaDeCarros = new HashSet<>();

        listaDeCarros.add(new CarroCivic("Tesla", "Ouro"));
        listaDeCarros.add(new CarroHonda("Honda", "Fogete"));
        listaDeCarros.add(new CarroHonda("Honda 2", "Campeão"));
        listaDeCarros.add(new CarroCivic("Volt", "Fire"));

        for (Object carro : listaDeCarros){
            System.out.println(carro);
        }
    }


}
