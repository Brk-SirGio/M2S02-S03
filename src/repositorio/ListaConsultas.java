package repositorio;

import entidades.Consulta;
import java.util.ArrayList;
import java.util.List;

public class ListaConsultas {
    private static List<Consulta> consultas = new ArrayList<>();

    public static void adicionar(Consulta consulta) {
        consultas.add(consulta);
    }

    public static List<Consulta> listar() {
        for (int i = 0; i < consultas.size(); i++) {
            Consulta consulta = consultas.get(i);
            System.out.println("ID: " + i + " - " + consulta.getNomeNutricionista() + " com " + consulta.getNomePaciente() + " em " + consulta.getDataHora() + " - Realizada: " + consulta.isConsultaRealizada());
        }
        return consultas;
    }

    public static Consulta buscarPorId(int id) {
        if (id >= 0 && id < consultas.size()) {
            return consultas.get(id);
        }
        return null;
    }

    public static void alterar(int id, Consulta consulta) {
        if (id >= 0 && id < consultas.size()) {
            consultas.set(id, consulta);
        }
    }

    public static void remover(int id) {
        if (id >= 0 && id < consultas.size()) {
            consultas.remove(id);
        }
    }
}
