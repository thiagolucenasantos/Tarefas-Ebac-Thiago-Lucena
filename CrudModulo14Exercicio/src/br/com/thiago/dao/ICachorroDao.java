package br.com.thiago.dao;

import br.com.thiago.domain.Cachorro;

import java.util.Collection;


public interface ICachorroDao {
    public Boolean cadastrar(Cachorro cachorro);
    public void excluir(Integer codigo);
    public void alterar(Cachorro cachorro);
    public Cachorro consultar(Integer codigo);
    public Collection<Cachorro> buscarTodos();

}
