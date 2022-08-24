import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService();


        int opcao = 0;


        while (opcao != 5) {
            System.out.println(" [1] PARA CADASTRO\n [2] PARA LISTAR\n [3] PARA REMOVER USUARIO\n [4] PARA EDITAR\n [5] PARA SAIR");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> usuarioService.cadatroUsuario();
                case 2 -> usuarioService.listarUsuario();
                case 3 -> usuarioService.removerUsuario();
                case 4 -> usuarioService.editarUsuario();
                case 5 -> System.out.println("SAINDO DO PROGRAMA!");

            }
        }


    }
}