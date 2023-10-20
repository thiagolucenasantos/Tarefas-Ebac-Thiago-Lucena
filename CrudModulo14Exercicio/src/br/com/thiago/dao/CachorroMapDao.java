package br.com.thiago.dao;

import br.com.thiago.domain.Cachorro;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CachorroMapDao implements ICachorroDao {

    private Map<Integer, Cachorro> map;

    public CachorroMapDao() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cachorro cachorro) {
        if (this.map.containsKey(cachorro.getCodigo())) {
            return false;
        }
        this.map.put(cachorro.getCodigo(), cachorro);
        return true;
    }

    @Override
    public void excluir(Integer codigo) {
        Cachorro cachorroCadastrado = this.map.get(codigo);
        if (cachorroCadastrado != null) {
            this.map.remove(cachorroCadastrado.getCodigo(), cachorroCadastrado);
        }

    }

    @Override
    public void alterar(Cachorro cachorro) {
        Cachorro cachorroCadastrado = this.map.get(cachorro.getCodigo());
        if (cachorroCadastrado != null) {
            cachorroCadastrado.setCodigo(cachorro.getCodigo());
            cachorroCadastrado.setNome((cachorro.getNome()));
            cachorroCadastrado.setRaca(cachorro.getRaca());
        }
    }

    @Override
    public Cachorro consultar(Integer codigo) {
        return this.map.get(codigo);
    }

    @Override
    public Collection<Cachorro> buscarTodos() {
        return this.map.values();
    }
}
