package repositorio;

import entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class ListaFuncionarios {
    private static List<Funcionario> funcionarios = new ArrayList<>();

    public static void adicionar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static void listar() {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            System.out.println("ID: " + i + " - " + funcionario.getNome());
        }
    }


    public static Funcionario buscarPorId(int id) {
        if (id >= 0 && id < funcionarios.size()) {
            return funcionarios.get(id);
        }
        return null;
    }

    public static void alterar(int id, Funcionario funcionario) {
        if (id >= 0 && id < funcionarios.size()) {
            funcionarios.set(id, funcionario);
        }
    }

    public static void remover(int id) {
        if (id >= 0 && id < funcionarios.size()) {
            funcionarios.remove(id);
        }
    }
}
