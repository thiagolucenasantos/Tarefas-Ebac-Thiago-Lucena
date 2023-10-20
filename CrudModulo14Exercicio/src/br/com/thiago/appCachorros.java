package br.com.thiago;

import br.com.thiago.dao.CachorroMapDao;
import br.com.thiago.dao.ICachorroDao;
import br.com.thiago.domain.Cachorro;

import javax.swing.*;

public class appCachorros {

    private static CachorroMapDao ICachorroDao;

    public static void main(String[] args) {

        ICachorroDao = new CachorroMapDao();

        String opcao = JOptionPane.showInputDialog("Digite 1 para código, 2 para nome, 3 para raça, 4 para exclusão, 5 para alteração e 6 para sair");

        //  String nome = JOptionPane.showInputDialog("Digite o nome");

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog("Opção inválida!! Digite 1 para código, 2 para nome, 3 para raça, 4 para exclusão, 5 para alteração e 6 para sair");
        }
        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog("Digite os dados separados por vírgula, conforme exemplo: Código,Nome, raça");
                cadastrar(dados);
            }
        }

    }

    private static void cadastrar(String dados) {
        String[] campos = dados.split(",");
        Cachorro cachorro = new Cachorro(campos[0], campos[1], campos[2]);
        Boolean isCadastrado = ICachorroDao.cadastrar(cachorro);
        if (isCadastrado) {
            if (campos.length >= 1 && !campos[0].trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
            } else if (campos.length >= 2 && !campos[1].trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
            } else if ((campos.length >= 3 && !campos[2].trim().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");

            }
        }
    }


    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("6".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Obrigado!!");
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao) || "6".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }
}


