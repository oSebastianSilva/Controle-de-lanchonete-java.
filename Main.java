import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int fluxo = 0, fluxo1 = 0, fluxo2 = 0, fluxo3 = 0, fluxo4 = 0;
    int decisao = 0;

    String[] sand_name = new String[3];
    String[] sand_size = new String[3];
    Double[] sand_price = new Double[3];
    String[] sand_ingredients = {"Hambúrguer", "Salada", "Molho Picante", "Queijo", "Presunto", "Picles"};
    String[] sanduiches = new String[3];

    String[] bebidas_name = new String[3];
    String[] bebidas_size = new String[3];
    Double[] bebidas_price = new Double[3];

    String[] client_name = new String[5];
    int[] client_phone = new int[5];
    String[] client_adress = new String[5];
    int[] number_address = new int[5];

    String[] pedido = new String[3];
    String[] sanduba_pedido = new String[3];
    String[] drinkin_pedido = new String[3];
    Double[] price_pedido = new Double[3];

    while (decisao != 5) {

      System.out.println("\n - Slow Food -\n");
      System.out.println("1. Sanduíches");
      System.out.println("2. Bebidas");
      System.out.println("3. Clientes");
      System.out.println("4. Pedidos");
      System.out.println("5. Sair\n");

      System.out.print("Selecione uma opção: ");
      int opcao = ler.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("\n1. Cadastrar sanduíche");
          System.out.println("2. Editar sanduíche");
          System.out.println("3. Listar sanduíches");
          System.out.println("4. Voltar\n");

          System.out.print("Selecione uma opção: ");
          int opcao1 = ler.nextInt();

          switch (opcao1) {
            case 1:
              if (fluxo >= 3) {
                System.out.print("\nO limite de sanduíches cadastrados foi atingido, é possível sobreescrever\n");
                break;
              }

              System.out.print("\nNome do sanduíche: ");
              sand_name[fluxo] = ler.next();

              System.out.print("Tamanho do sanduíche: ");
              sand_size[fluxo] = ler.next();

              System.out.println("\n - Ingredientes - \n");

              for (int i = 0; i < 6; i++)
                System.out.println((1 + i) + " - " + sand_ingredients[i]);

              System.out.print(
                  "\n-- Escreva em formato chave, exemplo: *1234* --\n> Selecione os ingredientes do lanche Nº: ");
              sanduiches[fluxo] = ler.next();

              System.out.print("\nPreço correspodente ao lanche (R$): ");
              sand_price[fluxo] = ler.nextDouble();

              System.out.println("\nSanduíche cadastrado.");

              fluxo += 1;
              break;

            case 2:
              if (sand_name[0] == null) {
                System.out.print("Não há sanduíches cadastrados.\n");
                break;
              }

              System.out.print("\nSanduíches disponíveis: \n\n");

              for (int i = 0; i < 3; i++) {
                if (sand_name[i] == null)
                  System.out.print("");
                else
                  System.out.println((1 + i) + ". " + sand_name[i]);
              }

              System.out.print("\nSelecione o sanduíche que gostaria de alterar: ");
              int edicao = ler.nextInt();

              if (edicao == 1) {
                System.out.println("\n1. NOME  -  2. TAMANHO  -  3.  VALOR\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte1 = ler.nextInt();

                if (parte1 == 1) {
                  System.out.print("Insira o novo nome: ");
                  sand_name[0] = ler.next();
                  System.out.println("O nome do sanduíche foi alterado.\n");

                } else if (parte1 == 2) {
                  System.out.print("Insira o novo tamanho: ");
                  sand_size[0] = ler.next();
                  System.out.print("O tamanho do sanduíche foi alterado.\n");

                } else if (parte1 == 3) {
                  System.out.print("Insira o novo valor: ");
                  sand_price[0] = ler.nextDouble();
                  System.out.print("O valor do sanduíche foi alterado.\n");

                } else
                  System.out.print("Este índice é inacessível.");

                break;

              } else if (edicao == 2) {
                System.out.println("\n1. NOME  -  2. TAMANHO  -  3.  VALOR\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte2 = ler.nextInt();

                if (parte2 == 1) {
                  System.out.print("Insira o novo nome: ");
                  sand_name[1] = ler.next();
                  System.out.println("O nome do sanduíche foi alterado.\n");

                } else if (parte2 == 2) {
                  System.out.print("Insira o novo tamanho: ");
                  sand_size[1] = ler.next();
                  System.out.print("O tamanho do sanduíche foi alterado.\n");

                } else if (parte2 == 3) {
                  System.out.print("Insira o novo valor: ");
                  sand_price[1] = ler.nextDouble();
                  System.out.print("O valor do sanduíche foi alterado.\n");

                } else
                  System.out.print("Este índice é inacessível.");

                break;

              } else if (edicao == 3) {
                System.out.println("\n1. NOME  -  2. TAMANHO  -  3.  VALOR\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte3 = ler.nextInt();

                if (parte3 == 1) {
                  System.out.print("Insira o novo nome: ");
                  sand_name[2] = ler.next();
                  System.out.println("O nome do sanduíche foi alterado.\n");

                } else if (parte3 == 2) {
                  System.out.print("Insira o novo tamanho: ");
                  sand_size[2] = ler.next();
                  System.out.print("O tamanho do sanduíche foi alterado.\n");

                } else if (parte3 == 3) {
                  System.out.print("Insira o novo valor: ");
                  sand_price[2] = ler.nextDouble();
                  System.out.print("O valor do sanduíche foi alterado.\n");

                } else
                  System.out.print("Este índice é inacessível.");

              } else
                System.out.println("Opção inexistente.");

              break;

            case 3:
              if (sand_name[0] == null) {
                System.out.print("Não há sanduíches cadastrados.\n");
                break;
              }

              for (int i = 0; i < 3; i++) {
                if (sand_name[i] == null)
                  System.out.print("");
                else {
                  String[] ing = sanduiches[i].split("");
                  String ingString = "";
                  for (String indice : ing) {
                    int value = Integer.parseInt(indice) - 1;
                    ingString += sand_ingredients[value] + " - ";
                  }
                  System.out.println("\n" + (1 + i) + ". " + sand_name[i] + " - Tamanho: " + sand_size[i] + ", por "
                      + sand_price[i] + " R$" + "\n - Ingredientes: " + ingString);
                }
              }

              break;

            case 4:
              break;

            default:
              System.out.print("\nOpção inexistente. Tente novamente\n");
              break;
          }
          break;

        case 2:
          System.out.println("\n1. Cadastrar bebida");
          System.out.println("2. Editar bebida");
          System.out.println("3. Listar bebidas");
          System.out.println("4. Voltar");

          System.out.print("\nSelecione uma opção: ");
          int opcao2 = ler.nextInt();

          switch (opcao2) {
            case 1:
              if (fluxo1 >= 3) {
                System.out.print("\nO limite de bebidas cadastradas foi atingido, é possível sobreescrever\n");
                break;
              }

              System.out.print("\nNome da bebida: ");
              bebidas_name[fluxo1] = ler.next();

              System.out.print("Tamanho da bebida: ");
              bebidas_size[fluxo1] = ler.next();

              System.out.print("Valor da bebida: ");
              bebidas_price[fluxo1] = ler.nextDouble();

              System.out.print("\nBebida cadastrada.\n");

              fluxo1 += 1;
              break;

            case 2:
              if (bebidas_name[0] == null) {
                System.out.print("Não há bebidas cadastradas.\n");
                break;
              }

              System.out.print("\nBebidas disponíveis: \n\n");
              for (int i = 0; i < 3; i++) {
                if (bebidas_name[i] == null)
                  System.out.print("");
                else
                  System.out.println((1 + i) + ". " + bebidas_name[i]);
              }

              System.out.print("\nSelecione a bebida que gostaria de alterar: ");
              int edicao = ler.nextInt();

              if (edicao == 1) {
                System.out.println("\n1. NOME  -  2. TAMANHO  -  3.  VALOR\n");
                System.out.print("Selecione a modificação: ");
                int parte1 = ler.nextInt();

                if (parte1 == 1) {
                  System.out.print("Insira o novo nome: ");
                  bebidas_name[0] = ler.next();
                  System.out.println("O nome da bebida foi alterada.");

                } else if (parte1 == 2) {
                  System.out.print("Insira o novo tamanho: ");
                  bebidas_size[0] = ler.next();
                  System.out.print("O tamanho da bebida foi alterada.");

                } else if (parte1 == 3) {
                  System.out.print("Insira o novo valor: ");
                  bebidas_price[0] = ler.nextDouble();
                  System.out.print("O valor da bebida foi alterada.");

                } else
                  System.out.print("Este índice é inacessível.");

                break;

              } else if (edicao == 2) {
                System.out.println("\n1. NOME  -  2. TAMANHO  -  3.  VALOR\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte2 = ler.nextInt();

                if (parte2 == 1) {
                  System.out.print("Insira o novo nome: ");
                  bebidas_name[1] = ler.next();
                  System.out.println("O nome do sanduíche foi alterado.");

                } else if (parte2 == 2) {
                  System.out.print("Insira o novo tamanho: ");
                  bebidas_size[1] = ler.next();
                  System.out.print("O tamanho do sanduíche foi alterado.");

                } else if (parte2 == 3) {
                  System.out.print("Insira o novo valor: ");
                  bebidas_price[1] = ler.nextDouble();
                  System.out.print("O valor do sanduíche foi alterado.");

                } else
                  System.out.print("Este índice é inacessível.");

                break;

              } else if (edicao == 3) {
                System.out.println("\n1. NOME  -  2. TAMANHO  -  3.  VALOR\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte3 = ler.nextInt();

                if (parte3 == 1) {
                  System.out.print("Insira o novo nome: ");
                  bebidas_name[2] = ler.next();
                  System.out.println("O nome do sanduíche foi alterado.");

                } else if (parte3 == 2) {
                  System.out.print("Insira o novo tamanho: ");
                  bebidas_size[2] = ler.next();
                  System.out.print("O tamanho do sanduíche foi alterado.");

                } else if (parte3 == 3) {
                  System.out.print("Insira o novo valor: ");
                  bebidas_price[2] = ler.nextDouble();
                  System.out.print("O valor do sanduíche foi alterado.");

                } else
                  System.out.print("Este índice é inacessível.");

              } else
                System.out.println("Opção inexistente.");

              break;

            case 3:
              if (bebidas_name[0] == null) {
                System.out.print("Não há bebidas cadastradas.\n");
                break;
              }

              System.out.println("\nBebidas disponíveis: \n");
              for (int i = 0; i < bebidas_name.length; i++) {
                if (bebidas_name[i] == null)
                  System.out.print("");
                else
                  System.out.println((1 + i) + ". " + bebidas_name[i] + " - Tamanho: " + bebidas_size[i] + ", por "
                      + bebidas_price[i] + " R$");
              }
              break;

            case 4:
              break;
          }
          break;

        case 3:
          System.out.println("\n1. Cadastrar cliente");
          System.out.println("2. Editar cliente");
          System.out.println("3. Listar clientes");
          System.out.println("4. Voltar");

          System.out.print("\nSelecione uma opção: ");
          int opcao3 = ler.nextInt();

          switch (opcao3) {
            case 1:
              if (fluxo2 >= 5) {
                System.out.print("\nO limite de clientes cadastrados foi atingido, é possível sobreescrever\n");
                break;
              }

              System.out.print("\nNome do cliente: ");
              client_name[fluxo2] = ler.next();

              System.out.print("Telefone: ");
              client_phone[fluxo2] = ler.nextInt();

              System.out.print("Endereço (Rua): ");
              client_adress[fluxo2] = ler.next();

              System.out.print("Endereço (Nº da casa): ");
              number_address[fluxo2] = ler.nextInt();

              System.out.print("\nO cliente foi cadastrado.\n");

              fluxo2 += 1;
              break;

            case 2:
              if (client_name[0] == null) {
                System.out.print("Não há clientes cadastrados.\n");
                break;
              }

              System.out.print("\nClientes disponíveis: \n\n");

              for (int i = 0; i < 5; i++) {
                if (client_name[i] == null)
                  System.out.print("");
                else
                  System.out.println((1 + i) + ". " + client_name[i]);
              }

              System.out.print("\nSelecione o cliente que gostaria de editar: ");
              int edicao = ler.nextInt();

              if (edicao == 1) {
                System.out.println("\n1. NOME  -  2. TELEFONE  -  3.  ENDEREÇO\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte1 = ler.nextInt();

                if (parte1 == 1) {
                  System.out.print("Insira o novo nome: ");
                  client_name[0] = ler.next();
                  System.out.println("O nome do cliente foi alterado.\n");

                } else if (parte1 == 2) {
                  System.out.print("Insira o novo telefone: ");
                  client_phone[0] = ler.nextInt();
                  System.out.print("O telefone do cliente foi alterado.\n");

                } else if (parte1 == 3) {
                  System.out.print("Insira o novo endereço (Rua): ");
                  client_adress[0] = ler.next();
                  System.out.print("Insira o novo endereço (Nº da casa): ");
                  number_address[0] = ler.nextInt();
                  System.out.print("O endereço do cliente foi alterado.\n");

                } else
                  System.out.print("Este índice é inacessível.");

                break;

              } else if (edicao == 2) {
                System.out.println("\n1. NOME  -  2. TELEFONE  -  3.  ENDEREÇO\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte2 = ler.nextInt();

                if (parte2 == 1) {
                  System.out.print("Insira o novo nome: ");
                  client_name[1] = ler.next();
                  System.out.println("O nome do cliente foi alterado.\n");

                } else if (parte2 == 2) {
                  System.out.print("Insira o novo telefone: ");
                  client_phone[1] = ler.nextInt();
                  System.out.print("O telefone do cliente foi alterado.\n");

                } else if (parte2 == 3) {
                  System.out.print("Insira o novo endereço (Rua): ");
                  client_adress[1] = ler.next();
                  System.out.print("Insira o novo endereço (Nº da casa): ");
                  number_address[1] = ler.nextInt();
                  System.out.print("O endereço do cliente foi alterado.\n");

                } else
                  System.out.print("Este índice é inacessível.");

                break;

              } else if (edicao == 3) {
                System.out.println("\n1. NOME  -  2. TELEFONE  -  3.  ENDEREÇO\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte3 = ler.nextInt();

                if (parte3 == 1) {
                  System.out.print("Insira o novo nome: ");
                  client_name[2] = ler.next();
                  System.out.println("O nome do cliente foi alterado.\n");

                } else if (parte3 == 2) {
                  System.out.print("Insira o novo telefone: ");
                  client_phone[2] = ler.nextInt();
                  System.out.print("O telefone do cliente foi alterado.\n");

                } else if (parte3 == 3) {
                  System.out.print("Insira o novo endereço (Rua): ");
                  client_adress[2] = ler.next();
                  System.out.print("Insira o novo endereço (Nº da casa): ");
                  number_address[2] = ler.nextInt();
                  System.out.print("O endereço do telefone foi alterado.\n");

                } else
                  System.out.print("Este índice é inacessível.");

                break;

              } else if (edicao == 4) {
                System.out.println("\n1. NOME  -  2. TELEFONE  -  3.  ENDEREÇO\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte4 = ler.nextInt();

                if (parte4 == 1) {
                  System.out.print("Insira o novo nome: ");
                  client_name[3] = ler.next();
                  System.out.println("O nome do cliente foi alterado.\n");

                } else if (parte4 == 2) {
                  System.out.print("Insira o novo telefone: ");
                  client_phone[3] = ler.nextInt();
                  System.out.print("O telefone do cliente foi alterado.\n");

                } else if (parte4 == 3) {
                  System.out.print("Insira o novo endereço (Rua): ");
                  client_adress[3] = ler.next();
                  System.out.print("Insira o novo endereço (Nº da casa): ");
                  number_address[3] = ler.nextInt();
                  System.out.print("O endereço do telefone foi alterado.\n");

                } else
                  System.out.print("Este índice é inacessível.");

                break;

              } else if (edicao == 5) {
                System.out.println("\n1. NOME  -  2. TELEFONE  -  3.  ENDEREÇO\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte5 = ler.nextInt();

                if (parte5 == 1) {
                  System.out.print("Insira o novo nome: ");
                  client_name[4] = ler.next();
                  System.out.println("O nome do cliente foi alterado.\n");

                } else if (parte5 == 2) {
                  System.out.print("Insira o novo telefone: ");
                  client_phone[4] = ler.nextInt();
                  System.out.print("O telefone do cliente foi alterado.\n");

                } else if (parte5 == 3) {
                  System.out.print("Insira o novo endereço (Rua): ");
                  client_adress[4] = ler.next();
                  System.out.print("Insira o novo endereço(Nº da casa): ");
                  number_address[4] = ler.nextInt();
                  System.out.print("O endereço do telefone foi alterado.\n");

                } else
                  System.out.print("Este índice é inacessível.");

              } else
                System.out.println("Opção inexistente.");

              break;

            case 3:
              if (client_name[0] == null) {
                System.out.print("Não há clientes cadastrados.\n");
                break;
              }

              System.out.println("\n - Clientes cadastrados - \n");
              for (int i = 0; i < client_name.length; i++) {
                if (client_name[i] == null)
                  System.out.print("");
                else
                  System.out.println((1 + i) + ". " + client_name[i] + " - Telefone: " + client_phone[i]
                      + " - Endereço: " + client_adress[i] + ", " + number_address[i]);
              }

            case 4:
              break;
          }
          break;

        case 4:
          System.out.println("\n1. Cadastrar pedidos");
          System.out.println("2. Editar pedidos");
          System.out.println("3. Listar pedidos");
          System.out.println("4. Voltar\n");

          System.out.print("Selecione uma opção: ");
          int opcao4 = ler.nextInt();

          switch (opcao4) {
            case 1:
              if (fluxo4 >= 5) {
                System.out.print("\nO limite de pedidos cadastrados foi atingido, é possível sobreescrever.\n");
                break;
              } else if (fluxo3 >= 3) {
                System.out.print("\nO limite de pedidos cadastrados foi atingido, é possível sobreescrever.\n");
                break;
              }

              if (client_name[0] == null && sand_name[0] == null && bebidas_name[0] == null) {
                System.out.print(
                    "\n > É necessário cadastrar um cliente antes, e pelo menos um sanduíche e uma bebida. Verifique se há pelo menos um de cada.\n");
                break;
              } else if (sand_name[0] != null && bebidas_name[0] == null
                  || sand_name[0] == null && bebidas_name[0] != null) {
                System.out.print(
                    "\n > É necessário cadastrar um cliente antes, e pelo menos um sanduíche e uma bebida. Verifique se há pelo menos um de cada.\n");
                break;
              }

              for (int i = 0; i < 5; i++) {
                if (client_name[i] == null)
                  System.out.print("");
                else {
                  System.out.print(i == 0 ? "\nCLIENTES:\n\n" : "");
                  System.out.println((1 + i) + ". " + client_name[i]);
                }
              }

              System.out.print("\nSelecione o cliente do pedido (Nº): ");
              int cliente = ler.nextInt();

              for (int i = 0; i < 3; i++) {
                if (sand_name[i] == null)
                  System.out.print("");
                else {
                  System.out.print(i == 0 ? "\nSANDUÍCHES:\n\n" : "");
                  System.out.println((1 + i) + ". " + sand_name[i]);
                }
              }

              System.out.print("\n\nSelecione o sanduíche: ");
              int sand_pedido = ler.nextInt();

              for (int i = 0; i < 3; i++) {
                if (bebidas_name[i] == null)
                  System.out.print("");
                else {
                  System.out.print(i == 0 ? "\nBEBIDAS:\n\n" : "");
                  System.out.println((1 + i) + ". " + bebidas_name[i]);
                }
              }

              System.out.print("\n\nSelecione a bebida: ");
              int drink_pedido = ler.nextInt();

              price_pedido[fluxo4] = sand_price[sand_pedido - 1] + bebidas_price[drink_pedido - 1];

              String clientName = client_name[cliente - 1] + ", solicitação de:\n - " + sand_name[sand_pedido - 1]
                  + " - " + bebidas_name[drink_pedido - 1] + " - Valor total: "
                  + (sand_price[sand_pedido - 1] + bebidas_price[drink_pedido - 1] + " 3R$");

              pedido[fluxo3] = client_name[cliente - 1];
              sanduba_pedido[fluxo4] = sand_name[sand_pedido - 1];
              drinkin_pedido[fluxo4] = bebidas_name[drink_pedido - 1];

              fluxo3 += 1;
              fluxo4 += 1;
              System.out.print("\n" + clientName);
              System.out.print("\n\nPedido finalizado.\n");
              break;

            case 2:
              if (sand_name[0] == null) {
                System.out.print("Não há pedidos cadastrados.\n");
                break;
              }

              System.out.print("\nClientes com pedidos pendentes: \n");

              for (int i = 0; i < 3; i++) {
                if (pedido[i] == null)
                  System.out.print("");
                else
                  System.out.println((1 + i) + ". " + pedido[i]);
              }

              System.out.print("\nSelecione o pedido do cliente que gostaria de editar: ");
              int edicao = ler.nextInt();

              if (edicao == 1) {
                System.out.println("\n1. CLIENTE  -  2. SANDUÍCHE  -  3. BEBIDA\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte1 = ler.nextInt();
                System.out.print("\n");

                if (parte1 == 1) {
                  for (int i = 0; i < client_name.length; i++) {
                    if (client_name[i] == null)
                      System.out.print("");
                    else
                      System.out.println((i + 1) + ". " + client_name[i]);
                  }

                  System.out.print("\nSelecione o nome que irá substituir: ");
                  int client = ler.nextInt();
                  pedido[0] = client_name[client - 1];
                  System.out.println("O pedido teve o nome do cliente alterado.");

                } else if (parte1 == 2) {
                  for (int i = 0; i < sand_name.length; i++) {
                    if (sand_name[i] == null)
                      System.out.print("");
                    else
                      System.out.print((i + 1) + ". " + sand_name[i]);
                  }

                  System.out.print("Insira o novo sanduíche: ");
                  int sand = ler.nextInt();
                  sanduba_pedido[0] = sand_name[sand - 1];
                  System.out.println("O sanduíche do pedido foi alterado.");

                } else if (parte1 == 3) {
                  for (int i = 0; i < bebidas_name.length; i++) {
                    if (bebidas_name[i] == null)
                      System.out.print("");
                    else
                      System.out.println((i + 1) + ". " + bebidas_name[i]);
                  }

                  System.out.print("Insira a nova bebida: ");
                  int drink = ler.nextInt();
                  drinkin_pedido[0] = bebidas_name[drink - 1];
                  System.out.print("A bebida do pedido foi alterada.");

                } else
                  System.out.print("Este índice é inacessível.");

                break;

              } else if (edicao == 2) {
                System.out.println("\n1. CLIENTE  -  2. SANDUÍCHE  -  3. BEBIDA\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte2 = ler.nextInt();
                System.out.print("\n");

                if (parte2 == 1) {
                  for (int i = 0; i < client_name.length; i++) {
                    if (client_name[i] == null)
                      System.out.print("");
                    else
                      System.out.println((i + 1) + ". " + client_name[i]);
                  }

                  System.out.print("\nSelecione o nome que irá substituir: ");
                  int client = ler.nextInt();
                  pedido[1] = client_name[client - 1];
                  System.out.println("O pedido teve o nome do cliente alterado.");

                } else if (parte2 == 2) {
                  for (int i = 0; i < sand_name.length; i++) {
                    if (sand_name[i] == null)
                      System.out.print("");
                    else
                      System.out.print((i + 1) + ". " + sand_name[i]);
                  }

                  System.out.print("Insira o novo sanduíche: ");
                  int sand = ler.nextInt();
                  sanduba_pedido[1] = sand_name[sand - 1];
                  System.out.println("O sanduíche do pedido foi alterado.");

                } else if (parte2 == 3) {
                  for (int i = 0; i < bebidas_name.length; i++) {
                    if (bebidas_name[i] == null)
                      System.out.print("");
                    else
                      System.out.println((i + 1) + ". " + bebidas_name[i]);
                  }

                  System.out.print("Insira a nova bebida: ");
                  int drink = ler.nextInt();
                  drinkin_pedido[1] = bebidas_name[drink - 1];
                  System.out.print("A bebida do pedido foi alterada.");

                } else
                  System.out.print("Este índice é inacessível.");

                break;

              } else if (edicao == 3) {
                System.out.println("\n1. CLIENTE  -  2. SANDUÍCHE  -  3. BEBIDA\n");
                System.out.print("Selecione o que gostaria de alterar: ");
                int parte3 = ler.nextInt();
                System.out.print("\n");

                if (parte3 == 1) {
                  for (int i = 0; i < client_name.length; i++) {
                    if (client_name[i] == null)
                      System.out.print("");
                    else
                      System.out.println((i + 1) + ". " + client_name[i]);
                  }

                  System.out.print("\nSelecione o nome que irá substituir: ");
                  int client = ler.nextInt();
                  pedido[2] = client_name[client - 1];
                  System.out.println("O pedido teve o nome do cliente alterado.");

                } else if (parte3 == 2) {
                  for (int i = 0; i < sand_name.length; i++) {
                    if (sand_name[i] == null)
                      System.out.print("");
                    else
                      System.out.print((i + 1) + ". " + sand_name[i]);
                  }

                  System.out.print("Insira o novo sanduíche: ");
                  int sand = ler.nextInt();
                  sanduba_pedido[2] = sand_name[sand - 1];
                  System.out.println("O sanduíche do pedido foi alterado.");

                } else if (parte3 == 3) {
                  for (int i = 0; i < bebidas_name.length; i++) {
                    if (bebidas_name[i] == null)
                      System.out.print("");
                    else
                      System.out.println((i + 1) + ". " + bebidas_name[i]);
                  }

                  System.out.print("Insira a nova bebida: ");
                  int drink = ler.nextInt();
                  drinkin_pedido[2] = bebidas_name[drink - 1];
                  System.out.print("A bebida do pedido foi alterada.");

                } else
                  System.out.print("Este índice é inacessível.");

              } else
                System.out.print("Índice de pedido inexistente. Tente novamente.");

              break;

            case 3:
              if (pedido[0] == null) {
                System.out.print("Não há pedidos cadastrados.\n");
                break;
              }

              System.out.println("\nPedidos cadastrados: \n");
              for (int i = 0; i < pedido.length; i++) {
                if (pedido[i] == null)
                  System.out.print("");
                else
                  System.out.println((1 + i) + ". " + pedido[i] + " - Sanduíche: " + sanduba_pedido[i] + " - Bebida: "
                      + drinkin_pedido[i] + " - Valor total: " + price_pedido[i] + " R$");
              }

            case 4:
              break;
          }
          break;

        case 5:
          System.out.println("Programa finalizado.");
          return;
        default:
          System.out.print("\nOpção inexistente. Tente novamente.\n");
          break;
      }
    }
  }
}