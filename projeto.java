package Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

// Classe Produto para representar os produtos no estoque
class Produto {
    String nome;
    String codigoBarras;
    String validade;

    // Construtor da classe Produto
    Produto(String nome, String codigoBarras, String validade) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.validade = validade;
    }
}

// Classe Usuario para representar os usuários do sistema
class Usuario {
    int senha;
    String nome;

    // Construtor da classe Usuario
    Usuario(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }
}

public class projeto {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        // Lista de produtos no estoque
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Água", gerarCodigoDeBarras(), "28/12/2028"));
        produtos.add(new Produto("Suco", gerarCodigoDeBarras(), "11/01/2025"));
        produtos.add(new Produto("Refrigerante", gerarCodigoDeBarras(), "11/07/2025"));

        // Lista de usuários do sistema
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Joao", 19));
        usuarios.add(new Usuario("Jorshuan", 25));
        usuarios.add(new Usuario("Gustavo", 29));
        usuarios.add(new Usuario("Pedro", 21));
        usuarios.add(new Usuario("Luis", 30));
        usuarios.add(new Usuario("Visitante", 000));

        Usuario usuarioAtual = null; // Variável para armazenar o usuário atualmente logado

        // Mensagem de boas-vindas
        System.out.println("|-----------------------------------------|");
        System.out.println(" Sejam bem vindo ao:");
        System.out.println(" Sistema de estoque do Atacadista SUÉCIA");
        System.out.println("|-----------------------------------------|\n");

        while (true) {
            if (usuarioAtual == null) {
                // Solicita a senha do usuário para login
                System.out.println("Por Favor, identifique-se com a sua senha de usuário...");
                int senhaUsuario = sc.nextInt();

                // Verifica se a senha corresponde a algum usuário cadastrado
                for (Usuario usuario : usuarios) {
                    if (usuario.senha == senhaUsuario) {
                        usuarioAtual = usuario;
                        break;
                    }
                }

                // Caso a senha não corresponda a nenhum usuário, solicita novamente
                while (usuarioAtual == null) {
                    System.out.println("Usuario não encontrado. Tente novamente.");
                    senhaUsuario = sc.nextInt();
                    for (Usuario usuario : usuarios) {
                        if (usuario.senha == senhaUsuario) {
                            usuarioAtual = usuario;
                            break;
                        }
                    }
                }

                // Mensagem de boas-vindas ao usuário logado
                System.out.println("Bem vindo, " + usuarioAtual.nome);
            }

            // Menu de opções para o usuário
            System.out.println("Olá, " + usuarioAtual.nome + ". Escolha uma opção:\n1. Verificar estoque\n2. Cadastrar produto\n3. Remover produto\n4. Gerar nota fiscal\n5. Cadastrar usuário\n6. Remover usuário\n7. Verificar usuários cadastrados\n8. Deslogar\n9. Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Exibe os produtos em estoque
                    System.out.println("Produtos em estoque:");
                    for (Produto produto : produtos) {
                        System.out.println("Nome: " + produto.nome + ", Código de barras: " + produto.codigoBarras + ", Validade: " + produto.validade);
                    }
                    break;

                case 2:
                    // Verifica se o usuário tem permissão para cadastrar produtos
                    if (usuarioAtual.senha == 000) {
                        System.out.println("Desculpe, o usuário visitante não pode cadastrar um produto.");
                        break;
                    }
                    // Solicita os dados do novo produto
                    System.out.println("Digite o nome do produto:");
                    String nome = sc.next();
                    String codigoBarras = gerarCodigoDeBarras();
                    System.out.println("Digite a data de validade do produto (dd/mm/yyyy):");
                    String validade = sc.next();

                    // Verifica se a data de validade está no formato correto
                    if (!validade.matches("\\d{2}/\\d{2}/\\d{4}")) {
                        // Código continua...
                    }
            }
        }
    }

    // Método para gerar um código de barras aleatório
    public static String gerarCodigoDeBarras() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            codigo.append(random.nextInt(10));
        }
        return codigo.toString();
    }
}
