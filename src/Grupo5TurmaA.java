/*
    Nome no github:
    Giovanna Bancala: Bancaloxxx,
    Samuel Silva: SJS09
    Gabreiela Arruda: gabmeloo
    Augusto Bitiano: Bitiano

*/

package src;

import java.util.Scanner;
import java.util.Random;

public class Grupo5TurmaA {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    static int opcao;
    static int chances = 1;

    static void errou() {
        chances--;
        if (chances == 0) {
            gameOver();
        }
    }

    static void gameOver() {
        do {
            System.out.println("Game Over");
            System.out.println("Deseja jogar novamente?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    comecoJogo();
                    break;
                case 2:
                    sair();
                    break;
                default:
                    System.out.println("opcao inválida!");
            }
        } while (opcao != 1 && opcao != 2);
    }

    static void funcaoQueSorteiaFuncao1() {
        int numero = random.nextInt(3);
        if (numero == 0) {
            primeroDesafioOpcao1();
        } else if (numero == 1) {
            primeroDesafioOpcao2();
        } else {
            primeroDesafioOpcao3();
        }
    }

    static void funcaoQueSorteiaFuncao2() {
        int numero = random.nextInt(3);
        if (numero == 0) {
            segundoDesafioOpcao1();
        } else if (numero == 1) {
            segundoDesafioOpcao2();
        } else {
            segundoDesafioOpcao3();
        }
    }

    static void funcaoQueSorteiaFuncao3() {
        int numero = random.nextInt(3);
        if (numero == 0) {
            terceiroDesafioOpcao1();
        } else if (numero == 1) {
            terceiroDesafioOpcao2();
        } else {
            terceiroDesafioOpcao3();
        }
    }

    static void funcaoQueSorteiaFuncao4() {
        int numero = random.nextInt(3);
        if (numero == 0) {
            quartoDesafioOpcao1();
        } else if (numero == 1) {
            quartoDesafioOpcao2();
        } else {
            quartoDesafioOpcao3();
        }
    }

    static void primeroDesafioOpcao1() {
        do {
            System.out.println("Qual é o valor binário do número hexadecimal 3D?");
            System.out.println("1 - 11101");
            System.out.println("2 - 10011");
            System.out.println("3 - 110101");
            System.out.println("4 - 101101");
            System.out.println("5 - 11011");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Unn.. muito bem Abayomi, vamos ver do que você é capaz!");
                    segundaParteHistoria();
                    break;
                case 2:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 3:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 4:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 5:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (chances != 0);
        if (chances == 0) {
            gameOver();
        }

    }

    static void primeroDesafioOpcao2() {
        do {
            System.out.println("Revelai o valor decimal do número hexadecimal FF?");
            System.out.println("1 - 250");
            System.out.println("2 - 253");
            System.out.println("3 - 255");
            System.out.println("4 - 257");
            System.out.println("5 - 2592");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 2:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 3:
                    System.out.println("Nada mal....vamos continuar");
                    segundaParteHistoria();
                    break;
                case 4:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 5:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (chances != 0);
        if (chances == 0) {
            gameOver();
        }

    }

    static void primeroDesafioOpcao3() {
        do {
            System.out.println("Qual é o valor decimal do número hexadecimal A3?");
            System.out.println("1 - 103 ");
            System.out.println("2 - 113");
            System.out.println("3 - 153");
            System.out.println("4 - 163");
            System.out.println("5 - 173");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 2:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 3:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 4:
                    System.out.println("Os Deus estão te ajudando nesse momento? Parece estar fácil para você....");
                    segundaParteHistoria();
                    break;
                case 5:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);
        if (chances == 0) {
            gameOver();
        }

    }
    static void segundaParteHistoria() {
        System.out.println("Abayomi avança pelo muro de hieróglifos e entra em um salão repleto de estátuas antigas e armadilhas mortais. Ele percebe que está cada vez mais próximo do tesouro e não pode desistir agora. A voz da Esfinge ecoa novamente, desafiando-o com mais perguntas:");
        funcaoQueSorteiaFuncao2();
    }
    static void segundoDesafioOpcao1() {
        do {
            System.out.println("Desafio-o a revelar o valor hexadecimal do número decimal 1023?");
            System.out.println("1 - 2FF");
            System.out.println("2 - 3FF");
            System.out.println("3 - 4FF");
            System.out.println("4 - 7FF");
            System.out.println("5 - 8FF");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 2:
                    System.out.println("Inteligente....mas será que é forte e poderoso? ");
                    terceiraParteHistoria();
                    break;
                case 3:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 4:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 5:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (chances != 0);
        if (chances == 0) {
            gameOver();
        }

    }

    static void segundoDesafioOpcao2() {
        do {
            System.out.println("Qual a base resultante da conversão do número hexadecimal 3E7 para decimal?");
            System.out.println("1 - 967 ");
            System.out.println("2 - 997");
            System.out.println("3 - 1003");
            System.out.println("4 - 9999");
            System.out.println("5 - 10007");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Nada mal....vamos continua");
                    terceiraParteHistoria();
                    break;
                case 2:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 3:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 4:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 5:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (chances != 0);
        if (chances == 0) {
            gameOver();
        }

    }

    static void segundoDesafioOpcao3() {
        do {
            System.out.println("Qual é o número hexadecimal correspondente ao valor decimal 256? ");
            System.out.println("1 - 100");
            System.out.println("2 - 10A");
            System.out.println("3 - 110");
            System.out.println("4 - 11A");
            System.out.println("5 - 120");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 2:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 3:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 4:
                    System.out.println(
                            "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
                    errou();
                    break;
                case 5:
                    System.out.println("Inteligente....mas será que é forte e poderoso?");
                    terceiraParteHistoria();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (chances != 0);
        if (chances == 0) {
            gameOver();
        }

    }

    static void terceiraParteHistoria() {
        System.out.println("Abayomi supera as armadilhas e chega à sala central da pirâmide. Lá, ele encontra um enigma e a voz da Esfinge ressoa novamente:");
        funcaoQueSorteiaFuncao3();
    }
    static void terceiroDesafioOpcao1() {
        int[] respostas = { 1, 2, 3, 4, 5 };
        String[] mensagens = {
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Os Deus estão te ajudando nesse momento? Parece estar fácil para você...",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia."
        };
        int opcao;
        do {
            System.out.println("Qual a base resultante da conversão do número hexadecimal EFA para decimal?");
            System.out.println("1 - 2730");
            System.out.println("2 - 3250");
            System.out.println("3 - 3330");
            System.out.println("4 - 3750");
            System.out.println("5 - 3890");
            opcao = input.nextInt();
            if (opcao >= 1 && opcao <= 5) {
                if (opcao == respostas[opcao - 1]) {
                    System.out.println(mensagens[opcao - 1]);
                    if (opcao == 3) {
                        quartaParteDaHistoria();
                    }
                } else {
                    System.out.println(mensagens[0]);
                    errou();
                }
            } else {
                System.out.println("Opção inválida!");
            }
        } while (chances != 0);
        if (chances == 0) {
            gameOver();
        }

    }

    static void terceiroDesafioOpcao2() {
        int[] respostas = { 1, 2, 3, 4, 5 };
        String[] mensagens = {
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Os Deus estão te ajudando nesse momento? Parece estar fácil para você...",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia."
        };
        int opcao;
        do {
            System.out.println("Qual é o número hexadecimal correspondente ao valor decimal 1023?");
            System.out.println("1 - 3E7");
            System.out.println("2 - 3FF");
            System.out.println("3 - 40F");
            System.out.println("4 - 417");
            System.out.println("5 - 423");
            opcao = input.nextInt();
            if (opcao >= 1 && opcao <= 5) {
                if (opcao == respostas[opcao - 1]) {
                    System.out.println(mensagens[opcao - 1]);
                    if (opcao == 2) {
                        quartaParteDaHistoria();
                    }
                } else {
                    System.out.println(mensagens[0]);
                    errou();
                }
            } else {
                System.out.println("Opção inválida!");
            }
        } while (chances != 0);
        if (chances == 0) {
            gameOver();
        }

    }

    static void terceiroDesafioOpcao3() {
        int[] respostas = { 1, 2, 3, 4, 5 };
        String[] mensagens = {
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Os Deus estão te ajudando nesse momento? Parece estar fácil para você....",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia."

        };
        int opcao;
        do {
            System.out.println("Qual o valor decimal equivalente ao número hexadecimal 7C8?");
            System.out.println("1 - 1784");
            System.out.println("2 - 1824");
            System.out.println("3 - 1863");
            System.out.println("4 - 1890");
            System.out.println("5 - 1928");
            opcao = input.nextInt();
            if (opcao >= 1 && opcao <= 5) {
                if (opcao == respostas[opcao - 1]) {
                    System.out.println(mensagens[opcao - 1]);
                    if (opcao == 5) {
                        quartaParteDaHistoria();
                    }
                } else {
                    System.out.println(mensagens[0]);
                    errou();
                }
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 2);
    }

    static void quartaParteDaHistoria() {
        System.out.println( "Abayomi enfrenta o mais um desafio com bravura, demonstrando todo o conhecimento adquirido ao longo de sua jornada. A voz da Esfinge ecoa novamente:");
        funcaoQueSorteiaFuncao4();
    }

    static void quartoDesafioOpcao1() {
        int[] respostas = { 1, 2, 3, 4, 5 };
        String[] mensagens = {
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Unn.. muito bem Abayomi, vamos vê do que você é capaz!",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia."
        };
        int opcao;
        do {
            System.out.println("Qual a base resultante da conversão do número hexadecimal 13D para decimal? ");
            System.out.println("1 - 269");
            System.out.println("2 - 309");
            System.out.println("3 - 333");
            System.out.println("4 - 349");
            System.out.println("5 - 365");
            opcao = input.nextInt();
            if (opcao >= 1 && opcao <= 5) {
                if (opcao == respostas[opcao - 1]) {
                    System.out.println(mensagens[opcao - 1]);
                    if (opcao == 3) {
                        escolhadaarma();
                    }
                } else {
                    System.out.println(mensagens[0]);
                    errou();
                }
            } else {
                System.out.println("Opção inválida!");
            }
        } while (chances != 0);
        if (chances == 0) {
            gameOver();
        }

    }

    static void quartoDesafioOpcao2() {
        int[] respostas = { 1, 2, 3, 4, 5 };
        String[] mensagens = {
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Unn.. muito bem Abayomi, vamos vê do que você é capaz!",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia."
        };
        int opcao;
        do {
            System.out.println("Qual é o número hexadecimal correspondente ao valor decimal 512? ");
            System.out.println("1 - 200");
            System.out.println("2 - 280");
            System.out.println("3 - 2A0");
            System.out.println("4 - 2C0");
            System.out.println("5 - 2D0");
            opcao = input.nextInt();
            if (opcao >= 1 && opcao <= 5) {
                if (opcao == respostas[opcao - 1]) {
                    System.out.println(mensagens[opcao - 1]);
                    if (opcao == 3) {
                        escolhadaarma();
                    }
                } else {
                    System.out.println(mensagens[0]);
                    errou();
                }
            } else {
                System.out.println("Opção inválida!");
            }
        } while (chances != 0);
        if (chances == 0) {
            gameOver();
        }

    }

    static void quartoDesafioOpcao3() {
        int[] respostas = { 1, 2, 3, 4, 5 };
        String[] mensagens = {
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.",
                "Inteligente....mas será que é forte e poderoso? ",
                "Resposta incorreta. Esteja preparado da próxima vez./nUm tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia."
        };
        int opcao;
        do {
            System.out.println("Qual a base resultante da conversão do número hexadecimal 8B4 para decimal? ");
            System.out.println("1 - 2088");
            System.out.println("2 - 2164");
            System.out.println("3 - 2268");
            System.out.println("4 - 2308");
            System.out.println("5 - 2436");
            opcao = input.nextInt();
            if (opcao >= 1 && opcao <= 5) {
                if (opcao == respostas[opcao - 1]) {
                    System.out.println(mensagens[opcao - 1]);
                    if (opcao == 4) {
                        escolhadaarma();
                    }
                } else {
                    System.out.println(mensagens[0]);
                    errou();
                }
            } else {
                System.out.println("Opção inválida!");
            }
        } while (chances != 0);
        if (chances == 0) {
            gameOver();
        }

    }

    static int boasVindas() {
        do {
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opcao Instruções");
                    return 1;
                case 2:
                    System.out.println("Você escolheu a opcao Jogar");
                    return 2;
                case 3:
                    System.out.println("Você escolheu a opcao Créditos");
                    return 3;
                case 4:
                    return 4;
                default:
                    System.out.println("opcao inválida!");
            }
        } while (opcao < 1 || opcao > 4);
        return opcao;
    }

    static void instruções() {
        do {
            System.out.println(
                    "Esse é um jogo interativo com fins didáticos, as perguntas contidas no mesmo foram com materiais passados em sala de aula.Você terá apenas uma chance de acertar então seja sucinto e lembre-se não caia nos contos da Esfinge");
            System.out.println("1 - Jogar o jogo");
            System.out.println("2 - Voltar ao menu principal");
            System.out.print("Escolha uma opcao: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opcao Jogar o jogo");
                    comecoJogo();
                    break;
                case 2:
                    System.out.println("Você escolheu a opcao Voltar ao menu principal");
                    primeiraEtapa();
                    break;
                default:
                    System.out.println("opcao inválida!");
            }
        } while (opcao != 1 && opcao != 2);
    }

    static void creditos() {
        do {
            System.out.println("Augusto Henrique Ramos Bitiano, Giovanna Bancala, Gabriela Arruda, Samuel Silva");
            System.out.println("1 - Voltar ao menu principal");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opcao Voltar ao menu principal");
                    primeiraEtapa();
                    break;
                case 2:
                    sair();
                    break;
                default:
                    System.out.println("opcao inválida!");
            }
        } while (opcao != 1 && opcao != 2);
    }

    static void sair() {
        System.out.println("Você escolheu a opcao Sair");
        System.exit(0);
    }

    static void primeiraEtapa() {
        opcao = boasVindas();
        switch (opcao) {
            case 1:
                instruções();
                break;
            case 2:
                comecoJogo();
                break;
            case 3:
                creditos();
                break;
            case 4:
                sair();
                break;
            default:
                System.out.println("opcao inválida!");
        }
    }

    static void comecoJogo() {
        chances = 1;
        System.out.println("Bem vindo a Tales of Sphinx");
        System.out.println(
                "Abayomi é um menino pobre que mora na Cidade Dos Mortos no Egito, enquanto trabalhava pescando peixes, Abayomi encontrou uma garrafa com um papel antigo dentro, ao abrir a garrafa, o menino descobriu que não era apenas um papel velho, mas sim, um mapa que poderia levá-lo até um tesouro, entretanto, junto com um mapa havia um pedaço de papel que dizia “Seja inteligente e corajoso, assim conseguirá obter tudo o que deseja. Não caia no conto da Esfinge”\n"
                        +
                        "Após refletir sobre a frase, Abayomi não pensou duas vezes em ir em busca do tesouro. \n" +
                        "E você está preparado para encarar o Conto da Esfinge?\n");
        System.out.println(
                "Após longos dias de caminhada, Abayomi se depara com a pirâmide. As portas da pirâmide se abrem e Abayomi entra com o desejo de conseguir o tão esperado tesouro. Abayomi se depara com um muro gigantesco com hieróglifos, quando de repente ele se assusta com uma voz que dizia: \"Espero que esteja preparado, Abayomi, eu, a Esfinge, guardiã dos enigmas, estou aqui para desafiar sua mente com perguntas sobre conversão de base, em nome dos deuses do Antigo Egito. Responda com cuidado: ");
        funcaoQueSorteiaFuncao1();
    }
    
    //Sistema de combate feito com if else, switch case e random
    //O usuario escolhe a arma dele e baseado nisso usa uma função e combate especifico pra cada arma
    //O inimigo usa random pra sortear entre ataque fortte e fraco
    
    static int ataqueusuariokhopesh() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Escolha seu ataque:");
        System.out.println("1 - Corte");
        System.out.println("2 - Especial - Corte Fatal");
        return tc.nextInt();
    }

    static int ataqueusuariocajado() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Escolha seu ataque:");
        System.out.println("1 - Bola de Fogo");
        System.out.println("2 - Especial - Lança de Fogo");
        return tc.nextInt();
    }

    static int ataquebot() {
        Random bot = new Random();
        return bot.nextInt(2) + 1;
    }

    static void imprimehp(int hpusuario, int hpbot, int especial) {
        System.out.println("---------------------");
        System.out.println("HP - Abayomi: " + hpusuario);
        System.out.println("HP - Mumia: " + hpbot);
        System.out.println("Especiais: " + especial);
        System.out.println("---------------------");
    }

    static void batalhakhopesh(int i) {
        System.out.println(
                "A pirâmide começa a tremer, o muro com hieróglifos começa a desmontar e uma múmia surge para atacar Abayomi.");
        int hpusuario = 100;
        int hpbot;
        int especial = 3;
        int escolha;

        hpbot = 7 + i;
        while (hpusuario > 0 && hpbot > 0) {
            imprimehp(hpusuario, hpbot, especial);
            escolha = ataqueusuariokhopesh();
            switch (escolha) {
                case 1:
                    System.out.println("Abayomi Cortou o inimigo");
                    hpbot -= 7;
                    break;
                case 2:
                    System.out.println("Abayomi deu um Corte Fatal no inimigo");
                    hpbot -= 10;
                    especial--;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            if (hpbot > 0) {
                escolha = ataquebot();
                switch (escolha) {
                    case 1:
                        System.out.println("A múmia arranhou Abayomi");
                        hpusuario -= 0 + i;
                        break;
                    case 2:
                        System.out.println("A múmia mordeu Abayomi");
                        hpusuario -= 3 + i;
                        break;
                }
            } else {
                System.out.println("Múmia derrotada.");
            }
        }
        parteFinalDaHistoria();
    }

    static void batalhacajado(int i) {
        System.out.println(
                "A pirâmide começa a tremer, o muro com hieróglifos começa a desmontar e uma múmia surge para atacar Abayomi.");
        int hpusuario = 100;
        int hpbot;
        int especial = 3;
        int escolha;

        hpbot = 7 + i;
        while (hpusuario > 0 && hpbot > 0) {
            imprimehp(hpusuario, hpbot, especial);
            escolha = ataqueusuariocajado();
            switch (escolha) {
                case 1:
                    System.out.println("Abayomi lançou uma bola de fogo no inimigo");
                    hpbot -= 7;
                    break;
                case 2:
                    System.out.println("Abayomi usou a lança de fogo no inimigo");
                    hpbot -= 10;
                    especial--;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            if (hpbot > 0) {
                escolha = ataquebot();
                switch (escolha) {
                    case 1:
                        System.out.println("A múmia arranhou Abayomi");
                        hpusuario -= 0 + i;
                        break;
                    case 2:
                        System.out.println("A múmia mordeu Abayomi");
                        hpusuario -= 3 + i;
                        break;
                }
            } else {
                System.out.println("Múmia derrotada.");
            }
        }
        parteFinalDaHistoria();
    }

    static void escolhadaarma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "A voz da Esfinge ressoa pelo corredor, enquanto o olhar penetrante da criatura se fixa em Abayomi. Com um tom solene, ela anuncia: \"Abayomi, antes de enfrentar o seu inimigo. Diante de você, estão duas opções cruciais. Um cajado ancestral, capaz de invocar poderes além da compreensão humana. E um khopesh, uma lâmina curva que representa força e coragem . Ambos possuem um poder intrínseco, mas somente um será seu verdadeiro aliado nesta batalha iminente. ");
        System.out.println("1 - Cajado");
        System.out.println("2 - Khopesh");
        int resposta = scanner.nextInt();

        if (resposta == 1) {
            System.out.println("Abayomi sentiu um poder vindo do cajado");
            batalhacajado(25);
        } else if (resposta == 2) {
            System.out.println("Abayomi sentiu um poder vindo do khopesh");
            batalhakhopesh(25);
        } else {
            System.out.println("Opção inválida");
        }
    }

    static void parteFinalDaHistoria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "'Impressionante... inteligente e ágil, será que é sábio?' Me diga Abayomi... O que é que de manhã tem quatro patas, de tarde tem duas e de noite tem três?'");
        System.out.println("1) A cama");
        System.out.println("2) O canguru");
        System.out.println("3) A mesa");
        System.out.println("4) O ser humano");
        System.out.println("5) O cachorro");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("4")) {
            System.out.println("Parabéns, Abayomi! Você foi digno de chegar até aqui.");
        } else {
            System.out.println("Resposta incorreta. Esteja preparado da próxima vez.");
            System.out.println(
                    "Um tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
            return;
        }

        System.out.println("Um buraco se abre no meio da pirâmide e então surge um baú.");
        System.out.println(
                "Esse baú contém toda a fortuna que um sábio rapaz inteligente e corajoso é digno de receber, mas basta adivinhar o último enigma.");
        System.out.println(
                "O baú era antigo, porém com um cadeado com segredo de 3 dígitos, no topo do baú haviam a gravura de Amon (Deus patrono de Tebas), Osíris (Deus da morte, da fertilidade, da agricultura, etc.), Hórus (Deus dos céus), Anúbis (Deus da morte, da mumificação, da vida após a morte, das tumbas, etc.) e Ísis (principal deusa do panteão egípcio).");
        System.out.println("Qual é o segredo que abrirá o cadeado?");
        System.out.println("1) 101");
        System.out.println("2) 110");
        System.out.println("3) 111");
        System.out.println("4) 100");
        System.out.println("5) 001");
        resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("1")) {
            System.out.println("Parabéns! Você desvendou o enigma final!");
            System.out.println(
                    "O baú se abre e Abayomi encontra um tesouro inestimável. Abayomi conseguiu a riqueza que tanto almejava e sua coragem e sabedoria serão lembradas para sempre.\n");
            System.out.println("Bem vindo a Tales of Sphinx");
            primeiraEtapa();

        } else {
            System.out.println("Resposta incorreta. Esteja preparado da próxima vez.");
            System.out.println(
                    "Um tornado começa a se formar e joga Abayomi para fora da pirâmide, as portas se fecham e a pirâmide se desmonta em uma pilha de areia.");
        }
    }

    public static void main(String[] args) {
        primeiraEtapa();

    }
}
