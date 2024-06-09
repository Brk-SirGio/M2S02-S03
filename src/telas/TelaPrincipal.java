package telas;

import entidades.*;
import repositorio.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TelaPrincipal {
    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Cadastrar um novo paciente");
            System.out.println("2 - Listar todos os pacientes");
            System.out.println("3 - Alterar informações do paciente");
            System.out.println("4 - Mostrar informações de um paciente");
            System.out.println("5 - Registrar atividade física para um paciente");
            System.out.println("6 - Remover paciente");
            System.out.println("7 - Cadastro de Funcionário");
            System.out.println("8 - Cadastro de Nutricionista");
            System.out.println("9 - Criar consulta");
            System.out.println("10 - Listar Funcionários");
            System.out.println("11 - Listar Consultas");
            System.out.println("12 - Realizar consulta");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPaciente(scanner);
                    break;
                case 2:
                    ListaPacientes.listar();
                    break;
                case 3:
                    alterarPaciente(scanner);
                    break;
                case 4:
                    mostrarInformacoesPaciente(scanner);
                    break;
                case 5:
                    registrarAtividadeFisica(scanner);
                    break;
                case 6:
                    removerPaciente(scanner);
                    break;
                case 7:
                    cadastrarFuncionario(scanner);
                    break;
                case 8:
                    cadastrarNutricionista(scanner);
                    break;
                case 9:
                    criarConsulta(scanner);
                    break;
                case 10:
                    ListaFuncionarios.listar();
                    break;
                case 11:
                    ListaConsultas.listar();
                    break;
                case 12:
                    realizarConsulta(scanner);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarPaciente(Scanner scanner) {
        System.out.print("Nome do Paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Altura em metros: ");
        double altura = scanner.nextDouble();
        System.out.print("Pressão Arterial: ");
        double pressaoArterial = scanner.nextDouble();
        System.out.print("Frequência Cardíaca: ");
        double frequenciaCardiaca = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Dieta Alimentar: ");
        String dietaAlimentar = scanner.nextLine();

        Paciente paciente = new Paciente(nome, idade, peso, altura, pressaoArterial, frequenciaCardiaca, dietaAlimentar);
        ListaPacientes.adicionar(paciente);
        System.out.println("Paciente cadastrado com sucesso!");
    }

    private static void alterarPaciente(Scanner scanner) {
        System.out.print("ID do Paciente a alterar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Paciente paciente = ListaPacientes.buscarPorId(id);
        if (paciente == null) {
            System.out.println("Paciente não encontrado!");
            return;
        }

        System.out.print("Novo Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Nova Altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Nova Pressão Arterial: ");
        double pressaoArterial = scanner.nextDouble();
        System.out.print("Nova Frequência Cardíaca: ");
        double frequenciaCardiaca = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nova Dieta Alimentar: ");
        String dietaAlimentar = scanner.nextLine();

        paciente.setPeso(peso);
        paciente.setAltura(altura);
        paciente.setPressaoArterial(pressaoArterial);
        paciente.setFrequenciaCardiaca(frequenciaCardiaca);
        paciente.setDietaAlimentar(dietaAlimentar);
        ListaPacientes.alterar(id, paciente);
        System.out.println("Informações do paciente alteradas com sucesso!");
    }

    private static void mostrarInformacoesPaciente(Scanner scanner) {
        System.out.print("ID do Paciente: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Paciente paciente = ListaPacientes.buscarPorId(id);
        if (paciente == null) {
            System.out.println("Paciente não encontrado!");
            return;
        }
        System.out.println(paciente.monitoramentoPaciente());
    }

    private static void registrarAtividadeFisica(Scanner scanner) {
        System.out.print("ID do Paciente: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Paciente paciente = ListaPacientes.buscarPorId(id);
        if (paciente == null) {
            System.out.println("Paciente não encontrado!");
            return;
        }
        System.out.print("Nome da Atividade Física: ");
        String atividade = scanner.nextLine();
        paciente.registrarAtividadeFisica(atividade);
        System.out.println("Atividade física registrada com sucesso!");
    }

    private static void removerPaciente(Scanner scanner) {
        System.out.print("ID do Paciente a remover: ");
        int id = scanner.nextInt();
        ListaPacientes.remover(id);
        System.out.println("Paciente removido com sucesso!");
    }

    private static void cadastrarFuncionario(Scanner scanner) {
        System.out.print("Nome do Funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        Endereco endereco = cadastrarEndereco(scanner);

        Funcionario funcionario = new Funcionario(nome, idade, endereco, salario);
        ListaFuncionarios.adicionar(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static Endereco cadastrarEndereco(Scanner scanner) {
        System.out.print("Logradouro: ");
        String logradouro = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        System.out.print("CEP: ");
        String cep = scanner.next();
        scanner.nextLine();

        return new Endereco(logradouro, estado, cidade, numero, cep);
    }

    private static void cadastrarNutricionista(Scanner scanner) {
        System.out.print("Nome do Nutricionista: ");
        String nome = scanner.nextLine();
        if (ListaNutricionistas.nomeExiste(nome)) {
            System.out.println("Nutricionista com esse nome já existe!");
            return;
        }

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Tempo de Experiência (anos): ");
        int tempoDeExperiencia = scanner.nextInt();
        scanner.nextLine();

        Endereco endereco = cadastrarEndereco(scanner);

        Nutricionista nutricionista = new Nutricionista(nome, idade, endereco, salario, tempoDeExperiencia);
        ListaNutricionistas.adicionar(nutricionista);
        ListaFuncionarios.adicionar(nutricionista);
        System.out.println("Nutricionista cadastrado com sucesso!");
    }

    private static void criarConsulta(Scanner scanner) {
        System.out.print("Nome do Nutricionista: ");
        String nomeNutricionista = scanner.nextLine();
        System.out.print("Nome do Paciente: ");
        String nomePaciente = scanner.nextLine();
        System.out.print("Data e Hora (formato: YYYY-MM-DDTHH:MM): ");
        String dataHoraStr = scanner.nextLine();
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraStr);

        Consulta consulta = new Consulta(nomeNutricionista, nomePaciente, dataHora);
        ListaConsultas.adicionar(consulta);
        ListaNutricionistas.incrementarNumeroDeConsultas(nomeNutricionista);
        System.out.println("Consulta criada com sucesso!");
    }

    private static void realizarConsulta(Scanner scanner) {
        System.out.print("ID da Consulta: ");
        int id = scanner.nextInt();
        Consulta consulta = ListaConsultas.buscarPorId(id);
        if (consulta == null) {
            System.out.println("Consulta não encontrada!");
            return;
        }
        consulta.setConsultaRealizada(true);
        System.out.println("Consulta realizada com sucesso!");
    }
}
