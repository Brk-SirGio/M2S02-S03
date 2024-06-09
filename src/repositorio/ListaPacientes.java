package repositorio;

import entidades.Paciente;
import java.util.ArrayList;
import java.util.List;

public class ListaPacientes {
    private static List<Paciente> pacientes = new ArrayList<>();

    public static void adicionar(Paciente paciente) {
        pacientes.add(paciente);
    }

    public static void listar() {
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente paciente = pacientes.get(i);
            System.out.println("ID: " + i + " - " + paciente.getNome());
        }
    }


    public static Paciente buscarPorId(int id) {
        if (id >= 0 && id < pacientes.size()) {
            return pacientes.get(id);
        }
        return null;
    }

    public static void alterar(int id, Paciente paciente) {
        if (id >= 0 && id < pacientes.size()) {
            pacientes.set(id, paciente);
        }
    }

    public static void remover(int id) {
        if (id >= 0 && id < pacientes.size()) {
            pacientes.remove(id);
        }
    }

    public static boolean nomeExiste(String nome) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }
}
