import java.util.Scanner;

public class GerenciarEstacionamento {
    public static Cliente cliente = new Cliente();
    public static Carro carro = new Carro();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarEstacionamento gerenciar = new GerenciarEstacionamento();

        int opc = 0;

        do {
            opc = menu(sc, gerenciar);
        } while (opc != 6);
    }
    public static int menu(Scanner sc, GerenciarEstacionamento gerenciar) {
        int opc;

        System.out.println("MENU: ");
        System.out.println("1. Cadastrar cliente: ");
        System.out.println("2. Cadastrar carro: ");
        System.out.println("3. Definir proprietario: ");
        System.out.println("4. Mostrar dados do cliente: ");
        System.out.println("5. Mostrar todos: ");
        System.out.println("6. Sair: ");
        System.out.println("Insira a sua opcao: ");
        opc = Integer.parseInt(sc.nextLine());

        switch (opc) {
            case 1:
                execCadastroCliente(sc);
                break;

            case 2:
                execCadastroCarro(sc);
                break;

            case 3:
                execDefineProp(sc);
                break;

            case 4:
                execMostraDadosCliente(sc);
                break;

            case 5:
                execMostraTodos(sc);
                break;

            case 6:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opcao invalida\n");
        }

        return opc;
    }


    public static void execCadastroCliente(Scanner sc) {
        System.out.println("Insira o id do cliente: ");
        cliente.setIdCliente(Integer.parseInt(sc.nextLine()));
        System.out.println("Tipo de pagamento: ");
        cliente.setTipoPagamento(sc.nextLine());
        System.out.println("Insira o nome do cliente: ");
        cliente.setNome(sc.nextLine());
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void execCadastroCarro(Scanner sc) {
        Carro carro1 = new Carro();
        System.out.println("Insira a placa do carro: ");
        carro.setPlaca(sc.nextLine());
        System.out.println("Insira a marca do carro: ");
        carro.setMarca(sc.nextLine());
        System.out.println("Insira o modelo do carro: ");
        carro.setModelo(sc.nextLine());
        System.out.println("Insira o ano do carro: ");
        carro.setAnoFab(Integer.parseInt(sc.nextLine()));
        System.out.println("Carro cadastrado com sucesso!");
    }

    public static void execDefineProp(Scanner sc) {
        Carro carro1 = new Carro();
        cliente.adicionarCarro(carro1);
        System.out.println("Proprietario(a) do Carro: " + cliente.getNome());
    }

    public static void execMostraDadosCliente(Scanner sc) {
        System.out.println(cliente);
    }

    public static void execMostraTodos(Scanner sc) {
        System.out.println(cliente);
        System.out.println(carro);
    }
}