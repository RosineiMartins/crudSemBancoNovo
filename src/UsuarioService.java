import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioService {
    Scanner scanner = new Scanner(System.in);
    List<Usuario> usuarioList = new ArrayList<>();

    public void cadatroUsuario() {
        Usuario usuario = new Usuario();
        System.out.println("CADASTRO DE USUARIO");
        System.out.println("Digite o seu nome: ");
        usuario.setNome(scanner.next());
        System.out.println("Digite a sua Idade: ");
        usuario.setIdade(scanner.nextInt());
        usuarioList.add(usuario);
    }

    public void removerUsuario() {


        System.out.println("DIGITE O NOME PARA REMOVER: ");
        String nome = scanner.next();
        for (int i = 0; i < usuarioList.size(); i++) {
            if (usuarioList.get(i).getNome().equals(nome)) {
                usuarioList.remove(i);
                break;
            }
        }
    }

    public void editarUsuario() {
        System.out.println("DIGITE O NOME PARA EDITAR: ");
        String nome = scanner.next();
        Integer indice = null;

        for (int i = 0; i < usuarioList.size(); i++) {
            if (usuarioList.get(i).getNome().equals(nome)) {
                indice = i;
                break;
            }
        }
        if (indice == null) {
            System.out.println("Usuario nao encontrado");
        } else {

            System.out.println("DIGITE O NOVO NOME: ");
            nome = scanner.next();
            usuarioList.get(indice).setNome(nome);
        }
    }

    public void listarUsuario() {
        for (int i = 0; i < usuarioList.size(); i++) {
            System.out.println(i + ": " + "Usuario: " + usuarioList.get(i));

        }
    }


}
