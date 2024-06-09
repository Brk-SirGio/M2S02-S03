package repositorio;

import entidades.Nutricionista;
import java.util.ArrayList;
import java.util.List;

public class ListaNutricionistas {
    private static List<Nutricionista> nutricionistas = new ArrayList<>();

    public static void adicionar(Nutricionista nutricionista) {
        nutricionistas.add(nutricionista);
    }

    public static void listar() {
        for (int i = 0; i < nutricionistas.size(); i++) {
            Nutricionista nutricionista = nutricionistas.get(i);
            System.out.println("ID: " + i + " - " + nutricionista.getNome());
        }
    }


    public static Nutricionista buscarPorId(int id) {
        if (id >= 0 && id < nutricionistas.size()) {
            return nutricionistas.get(id);
        }
        return null;
    }

    public static void alterar(int id, Nutricionista nutricionista) {
        if (id >= 0 && id < nutricionistas.size()) {
            nutricionistas.set(id, nutricionista);
        }
    }

    public static void remover(int id) {
        if (id >= 0 && id < nutricionistas.size()) {
            nutricionistas.remove(id);
        }
    }

    public static boolean nomeExiste(String nome) {
        for (Nutricionista nutricionista : nutricionistas) {
            if (nutricionista.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public static void incrementarNumeroDeConsultas(String nome) {
        for (Nutricionista nutricionista : nutricionistas) {
            if (nutricionista.getNome().equalsIgnoreCase(nome)) {
                nutricionista.setNumeroDeConsultas(nutricionista.getNumeroDeConsultas() + 1);
                return;
            }
        }
    }
}
