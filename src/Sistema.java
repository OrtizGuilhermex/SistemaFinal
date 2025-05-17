import java.util.Scanner;
import java.text.Normalizer;

public class SistemaTeste {

    // Função para normalizar texto
    public static String normalizar(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                         .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                         .toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIAVEIS
        int menu;
        int idioma;
        int i = 10;
        int c = 0;
        String nomeOrientacao;
        String atualizarOrientacao;

        // ARRAY
        String tituloDaOrientacao[] = new String[11];
        String tipoDaOrientacao[] = new String[11];
        String descricaoDaOrientacao[] = new String[11];

        
        // Idioma
        do {
            System.out.println("\n════════════════════════════════════════");
            System.out.println("       🌍 Escolha o idioma do sistema           ");
            System.out.println("════════════════════════════════════════");
            System.out.println("  1 - Português");
            System.out.println("  2 - Inglês");
            System.out.println("  3 - Alemão");
            System.out.println("  4 - Espanhol");
            System.out.println("  5 - Francês");
            System.out.println("════════════════════════════════════════");
            System.out.print("Digite sua opção: ");
            idioma = sc.nextInt();

            if (idioma >= 1 && idioma <= 5) {
                c++;
            }
            
        } while (c == 0);

        
        // SISTEMA EM PORTUGUÊS:
        if (idioma == 1) {

            // DADOS INICIAIS
            tituloDaOrientacao[0] = "Manual de Operação de Motores";
            tipoDaOrientacao[0] = "Manual de Operação";
            tituloDaOrientacao[1] = "Procedimento de Segurança para Instalação Elétrica";
            tipoDaOrientacao[1] = "Procedimento de Segurança";
            tituloDaOrientacao[2] = "Manutenção de Motores Elétricos";
            tipoDaOrientacao[2] = "Manutenção e Reparos";
            tituloDaOrientacao[3] = "Teste de Diagnóstico de Transformadores";
            tipoDaOrientacao[3] = "Testes e Diagnóstico";
            tituloDaOrientacao[4] = "Manual de Conduta no Setor de Montagem";
            tipoDaOrientacao[4] = "Manual de Conduta e Operações Setoriais";
            tituloDaOrientacao[5] = "Procedimento de Segurança com Risco de Choque Elétrico";
            tipoDaOrientacao[5] = "Procedimento de Segurança";
            tituloDaOrientacao[6] = "Manutenção de Geradores de Energia";
            tipoDaOrientacao[6] = "Manutenção e Reparos";
            tituloDaOrientacao[7] = "Teste de Funcionamento de Equipamentos de Automação";
            tipoDaOrientacao[7] = "Testes e Diagnóstico";
            tituloDaOrientacao[8] = "Manual de Operação de Equipamentos de Soldagem";
            tipoDaOrientacao[8] = "Manual de Operação";
            tituloDaOrientacao[9] = "Procedimento de Segurança no Setor de Montagem";
            tipoDaOrientacao[9] = "Procedimento de Segurança";

            
          //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
         
            // MENU
            do {
                System.out.println("\n════════════════════════════════════════");
                System.out.println("          📋 MENU PRINCIPAL           ");
                System.out.println("════════════════════════════════════════");
                System.out.println("  1 - 📝 Cadastrar");
                System.out.println("  2 - 🔍 Pesquisar");
                System.out.println("  3 - ✏️ Editar");
                System.out.println("  4 - ❌ Excluir");
                System.out.println("  5 - 📊 Exibir");
                System.out.println("  6 - 🚪 Sair");
                System.out.println("════════════════════════════════════════");
                System.out.print("Selecione uma opção: ");
                menu = sc.nextInt();
                sc.nextLine();

              //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
            
                // 1 CADASTRAR
                if (menu == 1) {
                	if (i >= tituloDaOrientacao.length) {
                	    // Aumenta o tamanho dos arrays (título, tipo e descrição)
                	    String[] novoTitulo = new String[tituloDaOrientacao.length + 1];
                	    String[] novoTipo = new String[tipoDaOrientacao.length + 1];
                	    String[] novaDescricao = new String[descricaoDaOrientacao.length + 1];
                	    
                	    // Copia os valores antigos para os novos arrays
                	    for (int j = 0; j < tituloDaOrientacao.length; j++) {
                	        novoTitulo[j] = tituloDaOrientacao[j];
                	        novoTipo[j] = tipoDaOrientacao[j];
                	        novaDescricao[j] = descricaoDaOrientacao[j];
                	    }

                	    // Atualiza os arrays com o novo tamanho
                	    tituloDaOrientacao = novoTitulo;
                	    tipoDaOrientacao = novoTipo;
                	    descricaoDaOrientacao = novaDescricao;
                	}

                	System.out.println("\n\nEscreva o título da orientação: ");
                	tituloDaOrientacao[i] = sc.nextLine();
                	System.out.println("\nEscreva o Tipo da orientação: [Manual de Operação, Procedimento de Segurança, Manutenção e Reparos, Testes e Diagnóstico ou Manual de Conduta e Operações Setoriais]: 	");
                	tipoDaOrientacao[i] = sc.nextLine();
                	System.out.println("\nEscreva a descrição da orientação: ");
                	descricaoDaOrientacao[i] = sc.nextLine();
                	i++;  // Incrementa o índice após adicionar
               //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
                
                	// 2 PESQUISAR
                } else if (menu == 2) {
                    System.out.println("\nTipos de Orientações disponíveis...\n");
                    for (int d = 0; d < i; d++) {
                        System.out.println("📂 Tipo da Orientação: " + tipoDaOrientacao[d]);
                    }

                    System.out.println("\n\nPesquise o tipo da orientação: ");
                    String nomeTipo = sc.nextLine();

                    boolean encontrado = false;
                    for (int j = 0; j < i; j++) {
                        if (normalizar(nomeTipo).equals(normalizar(tipoDaOrientacao[j]))) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("\n❌ Tipo de orientação não encontrado!");
                        continue;  
                    }

                    System.out.println("\n══════════════════════════════════════════════════════════════════════════");
                    System.out.println("Todos os títulos com o tipo de orientação: " + nomeTipo);
                    System.out.println("══════════════════════════════════════════════════════════════════════════\n");

                    for (int n = 0; n < i; n++) {
                        if (normalizar(tipoDaOrientacao[n]).equals(normalizar(nomeTipo))) {
                            System.out.println("🔖 " + tituloDaOrientacao[n]);
                        }
                    }

                    System.out.println("\n\nSelecione um título da orientação: ");
                    String tituloSelecionado = sc.nextLine();
                    boolean tituloEncontrado = false;

                    for (int l = 0; l < i; l++) {
                        if (normalizar(tituloSelecionado).equals(normalizar(tituloDaOrientacao[l]))) {
                            tituloEncontrado = true;

                            // Exibe a descrição cadastrada
                            String descricaoExibida = descricaoDaOrientacao[l] != null && !descricaoDaOrientacao[l].isEmpty()
                                                       ? descricaoDaOrientacao[l]  // Exibe a descrição cadastrada
                                                       : "Descrição não disponível.";  // Caso a descrição seja nula ou vazia

                            System.out.println("\n----------------------------------------");
                            System.out.println("🔖 " + tituloDaOrientacao[l]);
                            System.out.println("📂 Tipo: " + tipoDaOrientacao[l]);
                            System.out.println("📝 Descrição: " + descricaoExibida);
                            System.out.println("----------------------------------------");

                            break;
                        }
                    }

                    if (!tituloEncontrado) {
                        System.out.println("\n❌ Título não encontrado! Você pode tentar novamente.");
                        continue;
                    }
                

                //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
               
                    // 3 EDITAR
                } else if (menu == 3) {
                    System.out.println("\nTipos de Orientações disponíveis...\n");
                    for (int z = 0; z < i; z++) {
                        System.out.println("📂 Tipo da Orientação: " + tipoDaOrientacao[z]);
                    }

                    System.out.println("\nEscreva o tipo de orientação que você deseja mudar: ");
                    atualizarOrientacao = sc.nextLine();  

                    String tipoAtualNormalizado = normalizar(atualizarOrientacao);
                    boolean tipoEncontrado = false;

                    for (int h = 0; h < i; h++) {
                        if (normalizar(tipoDaOrientacao[h]).equals(tipoAtualNormalizado)) {
                            tipoEncontrado = true;
                            System.out.println("\n\nTipo de Orientação selecionada: " + tipoDaOrientacao[h] + "\n\nNovo Tipo: ");
                            atualizarOrientacao = sc.nextLine();  
                            tipoDaOrientacao[h] = atualizarOrientacao;
                            break;
                        }
                    }

                    if (!tipoEncontrado) {
                        System.out.println("\n❌ Tipo de orientação não encontrado para editar!");
                    }

                //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════    
                // 4 REMOVER
                } else if (menu == 4) {
                    String produtoRemovido;

                    System.out.println("\n\nItens disponíveis: \n");
                    for (int p = 0; p < i; p++) {
                        System.out.println("📚 " + tituloDaOrientacao[p]);
                    }
                    System.out.println("\nDigite o item que você deseja remover: ");
                    produtoRemovido = sc.nextLine(); 

                    String nomeProdutoNormalizado = normalizar(produtoRemovido);
                    boolean removido = false;

                    for (int k = 0; k < i; k++) {
                        if (normalizar(tituloDaOrientacao[k]).equals(nomeProdutoNormalizado)) {
                            for (int j = k; j < i - 1; j++) { 
                                tituloDaOrientacao[j] = tituloDaOrientacao[j + 1];
                                tipoDaOrientacao[j] = tipoDaOrientacao[j + 1];
                            }
                            tituloDaOrientacao[i - 1] = null;
                            tipoDaOrientacao[i - 1] = null;
                            i--;
                            removido = true;
                            break;
                        }
                    }

                    if (removido) {
                        System.out.println("\nItem removido com sucesso!");
                        System.out.println("\n\nItens após remoção:\n");
                        for (int p = 0; p < i; p++) {
                            if (tituloDaOrientacao[p] != null) {
                                System.out.println("📂 " + tituloDaOrientacao[p]);
                            }
                        }
                    } else { 
                        System.out.println("Item " + produtoRemovido + " não encontrado para remover!");
                    }

                //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
              
                    // 5 EXIBIR
                } else if (menu == 5) {
                	// No bloco de código do menu 5 (Exibir), exibir a descrição personalizada e a descrição padrão.
                	System.out.println("\n\n════════════════════════════════════════");
                	System.out.println("     📚 ORIENTAÇÕES CADASTRADAS         ");
                	System.out.println("════════════════════════════════════════");

                	for (int d = 0; d < i; d++) {
                	    System.out.println("\n🔖 Título da Orientação: " + tituloDaOrientacao[d]);
                	    System.out.println("📂 Tipo da Orientação: " + tipoDaOrientacao[d]);

                	    // Verificar se a descrição personalizada foi cadastrada
                	    String descricaoExibida = descricaoDaOrientacao[d] != null && !descricaoDaOrientacao[d].isEmpty()
                	                               ? descricaoDaOrientacao[d]  // Exibe a descrição personalizada
                	                               : "";  // Caso não tenha descrição personalizada, deixa em branco

                	    // Adicionar a descrição padrão se não houver uma descrição personalizada
                	    if (descricaoExibida.isEmpty()) {
                	        switch (tipoDaOrientacao[d].toLowerCase()) {
                	            case "manual de operação":
                	                descricaoExibida = "Orientações detalhadas sobre o uso correto e eficiente dos equipamentos. Exemplos: Manual de operação de motores, transformadores, geradores, etc.";
                	                break;
                	            case "procedimento de segurança":
                	                descricaoExibida = "Procedimentos detalhados para garantir a segurança durante a operação de equipamentos e instalações elétricas. Exemplos: Procedimento de segurança para instalação elétrica, risco de choque elétrico, etc.";
                	                break;
                	            case "manutenção e reparos":
                	                descricaoExibida = "Orientações para a manutenção e reparos de equipamentos, sistemas e dispositivos. Exemplos: Manutenção de motores elétricos, geradores de energia, etc.";
                	                break;
                	            case "testes e diagnóstico":
                	                descricaoExibida = "Procedimentos para testar e diagnosticar problemas em equipamentos e sistemas. Exemplos: Teste de diagnóstico de transformadores, automação, etc.";
                	                break;
                	            case "manual de conduta e operações setoriais":
                	                descricaoExibida = "Normas e orientações para a conduta dentro de setores específicos e suas operações. Exemplos: Manual de conduta no setor de montagem, etc.";
                	                break;
                	            default:
                	                descricaoExibida = "Descrição padrão não disponível.";
                	        }
                	    }

                	    // Exibir a descrição
                	    System.out.println("📝 Descrição: " + descricaoExibida);
                	    System.out.println("\n----------------------------------------");
                	}



                //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
                // 6 SAIR
                } else if (menu == 6) {
                    break;
                }
            } while (menu != 6);
        
        
            //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
            //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════

            
         // SISTEMA EM INGLES
        	}if (idioma == 2) {

                // INITIAL DATA
                tituloDaOrientacao[0] = "Motor Operation Manual";
                tipoDaOrientacao[0] = "Operation Manual";
                tituloDaOrientacao[1] = "Electrical Installation Safety Procedure";
                tipoDaOrientacao[1] = "Safety Procedure";
                tituloDaOrientacao[2] = "Electric Motor Maintenance";
                tipoDaOrientacao[2] = "Maintenance and Repairs";
                tituloDaOrientacao[3] = "Transformer Diagnostic Testing";
                tipoDaOrientacao[3] = "Testing and Diagnostics";
                tituloDaOrientacao[4] = "Conduct Manual for Assembly Department";
                tipoDaOrientacao[4] = "Conduct Manual and Sectorial Operations";
                tituloDaOrientacao[5] = "Electrical Shock Risk Safety Procedure";
                tipoDaOrientacao[5] = "Safety Procedure";
                tituloDaOrientacao[6] = "Power Generator Maintenance";
                tipoDaOrientacao[6] = "Maintenance and Repairs";
                tituloDaOrientacao[7] = "Automation Equipment Functionality Test";
                tipoDaOrientacao[7] = "Testing and Diagnostics";
                tituloDaOrientacao[8] = "Welding Equipment Operation Manual";
                tipoDaOrientacao[8] = "Operation Manual";
                tituloDaOrientacao[9] = "Safety Procedure in the Assembly Department";
                tipoDaOrientacao[9] = "Safety Procedure";

                //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
                // MENU
                do {
                    System.out.println("\n════════════════════════════════════════");
                    System.out.println("          📋 MAIN MENU           ");
                    System.out.println("════════════════════════════════════════");
                    System.out.println("  1 - 📝 Register");
                    System.out.println("  2 - 🔍 Search");
                    System.out.println("  3 - ✏️ Edit");
                    System.out.println("  4 - ❌ Delete");
                    System.out.println("  5 - 📊 Display");
                    System.out.println("  6 - 🚪 Exit");
                    System.out.println("════════════════════════════════════════");
                    System.out.print("Select an option: ");
                    menu = sc.nextInt();
                    sc.nextLine();
                  //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════

                    // 1 REGISTER
                    if (menu == 1) {
                        if (i >= tituloDaOrientacao.length) {
                            String[] novoTitulo = new String[tituloDaOrientacao.length + 1];
                            String[] novoTipo = new String[tipoDaOrientacao.length + 1];
                            for (int j = 0; j < tituloDaOrientacao.length; j++) {
                                novoTitulo[j] = tituloDaOrientacao[j];
                                novoTipo[j] = tipoDaOrientacao[j];
                            }
                            tituloDaOrientacao = novoTitulo;
                            tipoDaOrientacao = novoTipo;
                        }

                        System.out.println("\n\nWrite the orientation title: ");
                        tituloDaOrientacao[i] = sc.nextLine();
                        System.out.println("\nWrite the orientation type [Operation Manual, Safety Procedure, Maintenance and Repairs, Testing and Diagnostics, or Conduct Manual and Sectorial Operations]: ");
                        tipoDaOrientacao[i] = sc.nextLine();
                        System.out.println("\nWrite the orientation description: ");
                        descricaoDaOrientacao[i] = sc.nextLine();
                        i++;
                      //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════

                     // 2 SEARCH
                    } else if (menu == 2) {
                        System.out.println("\nAvailable Types of Guidance...\n");
                        for (int d = 0; d < i; d++) {
                            System.out.println("📂 Guidance Type: " + tipoDaOrientacao[d]);
                        }

                        System.out.println("\n\nSearch for the guidance type: ");
                        String nomeTipo = sc.nextLine();

                        boolean encontrado = false;
                        for (int j = 0; j < i; j++) {
                            if (normalizar(nomeTipo).equals(normalizar(tipoDaOrientacao[j]))) {
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("\n❌ Guidance type not found!");
                            continue;  
                        }

                        System.out.println("\n══════════════════════════════════════════════════════════════════════════");
                        System.out.println("All titles with the guidance type: " + nomeTipo);
                        System.out.println("══════════════════════════════════════════════════════════════════════════\n");

                        for (int n = 0; n < i; n++) {
                            if (normalizar(tipoDaOrientacao[n]).equals(normalizar(nomeTipo))) {
                                System.out.println("🔖 " + tituloDaOrientacao[n]);
                            }
                        }

                        System.out.println("\n\nSelect a guidance title: ");
                        String tituloSelecionado = sc.nextLine();
                        boolean tituloEncontrado = false;

                        for (int l = 0; l < i; l++) {
                            if (normalizar(tituloSelecionado).equals(normalizar(tituloDaOrientacao[l]))) {
                                tituloEncontrado = true;

                                // Display the registered description
                                String descricaoExibida = descricaoDaOrientacao[l] != null && !descricaoDaOrientacao[l].isEmpty()
                                                           ? descricaoDaOrientacao[l]  // Display the registered description
                                                           : "Description not available.";  // In case the description is null or empty

                                System.out.println("\n----------------------------------------");
                                System.out.println("🔖 " + tituloDaOrientacao[l]);
                                System.out.println("📂 Type: " + tipoDaOrientacao[l]);
                                System.out.println("📝 Description: " + descricaoExibida);
                                System.out.println("----------------------------------------");

                                break;
                            }
                        }

                        if (!tituloEncontrado) {
                            System.out.println("\n❌ Title not found! You can try again.");
                            continue;
                        }
                    
                        //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════


                    // 3 EDIT
                    } else if (menu == 3) {
                        System.out.println("\nAvailable Orientation Types...\n");
                        for (int z = 0; z < i; z++) {
                            System.out.println("📂 Orientation Type: " + tipoDaOrientacao[z]);
                        }

                        System.out.println("\nWrite the orientation type you want to change: ");
                        atualizarOrientacao = sc.nextLine();

                        String tipoAtualNormalizado = normalizar(atualizarOrientacao);
                        boolean tipoEncontrado = false;

                        for (int h = 0; h < i; h++) {
                            if (normalizar(tipoDaOrientacao[h]).equals(tipoAtualNormalizado)) {
                                tipoEncontrado = true;
                                System.out.println("\n\nSelected Orientation Type: " + tipoDaOrientacao[h] + "\n\nNew Type: ");
                                atualizarOrientacao = sc.nextLine();
                                tipoDaOrientacao[h] = atualizarOrientacao;
                                break;
                            }
                        }

                        if (!tipoEncontrado) {
                            System.out.println("\n❌ Orientation type not found to edit!");
                        }

                        //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════

                    // 4 REMOVE
                    } else if (menu == 4) {
                        String produtoRemovido;

                        System.out.println("\n\nAvailable items: \n");
                        for (int p = 0; p < i; p++) {
                            System.out.println("📚 " + tituloDaOrientacao[p]);
                        }
                        System.out.println("\nEnter the item you want to remove: ");
                        produtoRemovido = sc.nextLine();

                        String nomeProdutoNormalizado = normalizar(produtoRemovido);
                        boolean removido = false;

                        for (int k = 0; k < i; k++) {
                            if (normalizar(tituloDaOrientacao[k]).equals(nomeProdutoNormalizado)) {
                                for (int j = k; j < i - 1; j++) {
                                    tituloDaOrientacao[j] = tituloDaOrientacao[j + 1];
                                    tipoDaOrientacao[j] = tipoDaOrientacao[j + 1];
                                }
                                tituloDaOrientacao[i - 1] = null;
                                tipoDaOrientacao[i - 1] = null;
                                i--;
                                removido = true;
                                break;
                            }
                        }

                        if (removido) {
                            System.out.println("\nItem successfully removed!");
                            System.out.println("\n\nItems after removal:\n");
                            for (int p = 0; p < i; p++) {
                                if (tituloDaOrientacao[p] != null) {
                                    System.out.println("📂 " + tituloDaOrientacao[p]);
                                }
                            }
                        } else {
                            System.out.println("Item " + produtoRemovido + " not found to remove!");
                        }
                        //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════

                     // 5 DISPLAY
                    } else if (menu == 5) {
                        // In the block of code for menu 5 (Display), show the custom description and the default description.
                        System.out.println("\n\n════════════════════════════════════════");
                        System.out.println("     📚 REGISTERED GUIDANCES          ");
                        System.out.println("════════════════════════════════════════");

                        for (int d = 0; d < i; d++) {
                            System.out.println("\n🔖 Guidance Title: " + tituloDaOrientacao[d]);
                            System.out.println("📂 Guidance Type: " + tipoDaOrientacao[d]);

                            // Check if a custom description was registered
                            String descricaoExibida = descricaoDaOrientacao[d] != null && !descricaoDaOrientacao[d].isEmpty()
                                                       ? descricaoDaOrientacao[d]  // Display the custom description
                                                       : "";  // If no custom description, leave it blank

                            // Add the default description if no custom description exists
                            if (descricaoExibida.isEmpty()) {
                                switch (tipoDaOrientacao[d].toLowerCase()) {
                                    case "operation manual":
                                        descricaoExibida = "Detailed guidelines on the proper and efficient use of equipment. Examples: Operation manual for motors, transformers, generators, etc.";
                                        break;
                                    case "safety procedure":
                                        descricaoExibida = "Detailed procedures to ensure safety during the operation of electrical equipment and installations. Examples: Safety procedure for electrical installation, risk of electric shock, etc.";
                                        break;
                                    case "maintenance and repairs":
                                        descricaoExibida = "Guidelines for maintenance and repair of equipment, systems, and devices. Examples: Maintenance of electric motors, power generators, etc.";
                                        break;
                                    case "tests and diagnostics":
                                        descricaoExibida = "Procedures to test and diagnose issues in equipment and systems. Examples: Transformer diagnostic test, automation, etc.";
                                        break;
                                    case "conduct and sector operations manual":
                                        descricaoExibida = "Standards and guidelines for conduct within specific sectors and their operations. Examples: Conduct manual for assembly sector, etc.";
                                        break;
                                    default:
                                        descricaoExibida = "Default description not available.";
                                }
                            }

                            // Display the description
                            System.out.println("📝 Description: " + descricaoExibida);
                            System.out.println("\n----------------------------------------");
                        }
                    

                        //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════

                    // 6 EXIT
                    } else if (menu == 6) {
                        break;
                    }
                } while (menu != 6);

        
            //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
            //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════

            
         // SISTEMA EM ALEMÃO
    		}if (idioma == 3) {

                // DADOS INICIAIS
                tituloDaOrientacao[0] = "Motorbetriebsanleitung";
                tipoDaOrientacao[0] = "Betriebsanleitung";
                tituloDaOrientacao[1] = "Sicherheitsverfahren für elektrische Installationen";
                tipoDaOrientacao[1] = "Sicherheitsverfahren";
                tituloDaOrientacao[2] = "Wartung des Elektromotors";
                tipoDaOrientacao[2] = "Wartung und Reparaturen";
                tituloDaOrientacao[3] = "Diagnosetests für Transformatoren";
                tipoDaOrientacao[3] = "Tests und Diagnostik";
                tituloDaOrientacao[4] = "Verhaltenshandbuch für die Montagabteilung";
                tipoDaOrientacao[4] = "Verhaltenshandbuch und sektorielle Operationen";
                tituloDaOrientacao[5] = "Sicherheitsverfahren bei elektrischem Schockrisiko";
                tipoDaOrientacao[5] = "Sicherheitsverfahren";
                tituloDaOrientacao[6] = "Wartung des Stromgenerators";
                tipoDaOrientacao[6] = "Wartung und Reparaturen";
                tituloDaOrientacao[7] = "Funktionsprüfung der Automatisierungsgeräte";
                tipoDaOrientacao[7] = "Tests und Diagnostik";
                tituloDaOrientacao[8] = "Betriebsanleitung für Schweißgeräte";
                tipoDaOrientacao[8] = "Betriebsanleitung";
                tituloDaOrientacao[9] = "Sicherheitsverfahren in der Montagabteilung";
                tipoDaOrientacao[9] = "Sicherheitsverfahren";

                //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
                // MENÜ
                do {
                    System.out.println("\n════════════════════════════════════════");
                    System.out.println("          📋 HAUPTMENÜ               ");
                    System.out.println("════════════════════════════════════════");
                    System.out.println("  1 - 📝 Registrieren");
                    System.out.println("  2 - 🔍 Suchen");
                    System.out.println("  3 - ✏️ Bearbeiten");
                    System.out.println("  4 - ❌ Löschen");
                    System.out.println("  5 - 📊 Anzeigen");
                    System.out.println("  6 - 🚪 Beenden");
                    System.out.println("════════════════════════════════════════");
                    System.out.print("Wählen Sie eine Option: ");
                    menu = sc.nextInt();
                    sc.nextLine();

                    // 1 REGISTRIEREN
                    if (menu == 1) {
                        if (i >= tituloDaOrientacao.length) {
                            String[] novoTitulo = new String[tituloDaOrientacao.length + 1];
                            String[] novoTipo = new String[tipoDaOrientacao.length + 1];
                            for (int j = 0; j < tituloDaOrientacao.length; j++) {
                                novoTitulo[j] = tituloDaOrientacao[j];
                                novoTipo[j] = tipoDaOrientacao[j];
                            }
                            tituloDaOrientacao = novoTitulo;
                            tipoDaOrientacao = novoTipo;
                        }

                        System.out.println("\n\nSchreiben Sie den Titel der Orientierung: ");
                        tituloDaOrientacao[i] = sc.nextLine();
                        System.out.println("\nSchreiben Sie den Orientierungstyp [Betriebsanleitung, Sicherheitsverfahren, Wartung und Reparaturen, Tests und Diagnostik oder Verhaltenshandbuch und sektorielle Operationen]: ");
                        tipoDaOrientacao[i] = sc.nextLine();
                        System.out.println("\nSchreiben Sie die Beschreibung der Orientierung: ");
                        descricaoDaOrientacao[i] = sc.nextLine();
                        i++;

                     // 2 SUCHE
                    } else if (menu == 2) {
                        System.out.println("\nVerfügbare Arten von Anleitungen...\n");
                        for (int d = 0; d < i; d++) {
                            System.out.println("📂 Anleitungstyp: " + tipoDaOrientacao[d]);
                        }

                        System.out.println("\n\nSuchen Sie den Anleitungstyp: ");
                        String nomeTipo = sc.nextLine();

                        boolean encontrado = false;
                        for (int j = 0; j < i; j++) {
                            if (normalizar(nomeTipo).equals(normalizar(tipoDaOrientacao[j]))) {
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("\n❌ Anleitungstyp nicht gefunden!");
                            continue;  
                        }

                        System.out.println("\n══════════════════════════════════════════════════════════════════════════");
                        System.out.println("Alle Titel mit dem Anleitungstyp: " + nomeTipo);
                        System.out.println("══════════════════════════════════════════════════════════════════════════\n");

                        for (int n = 0; n < i; n++) {
                            if (normalizar(tipoDaOrientacao[n]).equals(normalizar(nomeTipo))) {
                                System.out.println("🔖 " + tituloDaOrientacao[n]);
                            }
                        }

                        System.out.println("\n\nWählen Sie einen Anleitungs-Titel aus: ");
                        String tituloSelecionado = sc.nextLine();
                        boolean tituloEncontrado = false;

                        for (int l = 0; l < i; l++) {
                            if (normalizar(tituloSelecionado).equals(normalizar(tituloDaOrientacao[l]))) {
                                tituloEncontrado = true;

                                // Zeigt die registrierte Beschreibung an
                                String descricaoExibida = descricaoDaOrientacao[l] != null && !descricaoDaOrientacao[l].isEmpty()
                                                           ? descricaoDaOrientacao[l]  // Zeigt die registrierte Beschreibung an
                                                           : "Beschreibung nicht verfügbar.";  // Falls die Beschreibung null oder leer ist

                                System.out.println("\n----------------------------------------");
                                System.out.println("🔖 " + tituloDaOrientacao[l]);
                                System.out.println("📂 Typ: " + tipoDaOrientacao[l]);
                                System.out.println("📝 Beschreibung: " + descricaoExibida);
                                System.out.println("----------------------------------------");

                                break;
                            }
                        }

                        if (!tituloEncontrado) {
                            System.out.println("\n❌ Titel nicht gefunden! Sie können es erneut versuchen.");
                            continue;
                        }
                 
                        

                    // 3 BEARBEITEN
                    } else if (menu == 3) {
                        System.out.println("\nVerfügbare Orientierungstypen...\n");
                        for (int z = 0; z < i; z++) {
                            System.out.println("📂 Orientierungstyp: " + tipoDaOrientacao[z]);
                        }

                        System.out.println("\nSchreiben Sie den Orientierungstyp, den Sie ändern möchten: ");
                        atualizarOrientacao = sc.nextLine();

                        String tipoAtualNormalizado = normalizar(atualizarOrientacao);
                        boolean tipoEncontrado = false;

                        for (int h = 0; h < i; h++) {
                            if (normalizar(tipoDaOrientacao[h]).equals(tipoAtualNormalizado)) {
                                tipoEncontrado = true;
                                System.out.println("\n\nAusgewählter Orientierungstyp: " + tipoDaOrientacao[h] + "\n\nNeuer Typ: ");
                                atualizarOrientacao = sc.nextLine();
                                tipoDaOrientacao[h] = atualizarOrientacao;
                                break;
                            }
                        }

                        if (!tipoEncontrado) {
                            System.out.println("\n❌ Orientierungstyp nicht gefunden!");
                        }

                    // 4 LÖSCHEN
                    } else if (menu == 4) {
                        String produtoRemovido;

                        System.out.println("\n\nVerfügbare Elemente: \n");
                        for (int p = 0; p < i; p++) {
                            System.out.println("📚 " + tituloDaOrientacao[p]);
                        }
                        System.out.println("\nGeben Sie das Element ein, das Sie entfernen möchten: ");
                        produtoRemovido = sc.nextLine();

                        String nomeProdutoNormalizado = normalizar(produtoRemovido);
                        boolean removido = false;

                        for (int k = 0; k < i; k++) {
                            if (normalizar(tituloDaOrientacao[k]).equals(nomeProdutoNormalizado)) {
                                for (int j = k; j < i - 1; j++) {
                                    tituloDaOrientacao[j] = tituloDaOrientacao[j + 1];
                                    tipoDaOrientacao[j] = tipoDaOrientacao[j + 1];
                                }
                                tituloDaOrientacao[i - 1] = null;
                                tipoDaOrientacao[i - 1] = null;
                                i--;
                                removido = true;
                                break;
                            }
                        }

                        if (removido) {
                            System.out.println("\nElement erfolgreich entfernt!");
                            System.out.println("\n\nElemente nach der Entfernung:\n");
                            for (int p = 0; p < i; p++) {
                                if (tituloDaOrientacao[p] != null) {
                                    System.out.println("📂 " + tituloDaOrientacao[p]);
                                }
                            }
                        } else {
                            System.out.println("Element " + produtoRemovido + " nicht gefunden, um es zu löschen!");
                        }

                     // 5 ANZEIGEN
                    } else if (menu == 5) {
                        // Im Block des Menüs 5 (Anzeigen), zeigen Sie die benutzerdefinierte Beschreibung und die Standardbeschreibung an.
                        System.out.println("\n\n════════════════════════════════════════");
                        System.out.println("     📚 REGISTRIERTE GUIDANZEN          ");
                        System.out.println("════════════════════════════════════════");

                        for (int d = 0; d < i; d++) {
                            System.out.println("\n🔖 Titel der Guidance: " + tituloDaOrientacao[d]);
                            System.out.println("📂 Guidance-Typ: " + tipoDaOrientacao[d]);

                            // Überprüfen, ob eine benutzerdefinierte Beschreibung registriert wurde
                            String descricaoExibida = descricaoDaOrientacao[d] != null && !descricaoDaOrientacao[d].isEmpty()
                                                       ? descricaoDaOrientacao[d]  // Zeigt die benutzerdefinierte Beschreibung an
                                                       : "";  // Wenn keine benutzerdefinierte Beschreibung, bleibt es leer

                            // Fügen Sie die Standardbeschreibung hinzu, wenn keine benutzerdefinierte Beschreibung vorhanden ist
                            if (descricaoExibida.isEmpty()) {
                                switch (tipoDaOrientacao[d].toLowerCase()) {
                                    case "betriebsanleitung":
                                        descricaoExibida = "Detaillierte Richtlinien für die richtige und effiziente Nutzung von Geräten. Beispiele: Betriebsanleitung für Motoren, Transformatoren, Generatoren usw.";
                                        break;
                                    case "sicherheitsverfahren":
                                        descricaoExibida = "Detaillierte Verfahren zur Gewährleistung der Sicherheit bei der Nutzung von elektrischen Geräten und Anlagen. Beispiele: Sicherheitsverfahren für die Elektroinstallation, Stromschlaggefahr usw.";
                                        break;
                                    case "wartung und reparaturen":
                                        descricaoExibida = "Richtlinien für Wartung und Reparatur von Geräten, Systemen und Vorrichtungen. Beispiele: Wartung von Elektromotoren, Stromgeneratoren usw.";
                                        break;
                                    case "tests und diagnostik":
                                        descricaoExibida = "Verfahren zum Testen und Diagnostizieren von Problemen in Geräten und Systemen. Beispiele: Diagnoseprüfung von Transformatoren, Automatisierung usw.";
                                        break;
                                    case "verhaltens- und sektorenbetriebsanleitung":
                                        descricaoExibida = "Normen und Richtlinien für das Verhalten in bestimmten Sektoren und deren Betrieb. Beispiele: Verhaltensrichtlinie für den Montagebereich usw.";
                                        break;
                                    default:
                                        descricaoExibida = "Standardbeschreibung nicht verfügbar.";
                                }
                            }

                            // Zeigt die Beschreibung an
                            System.out.println("📝 Beschreibung: " + descricaoExibida);
                            System.out.println("\n----------------------------------------");
                        
                    }


                    // 6 BEENDEN
                    } else if (menu == 6) {
                        break;
                    }
                } while (menu != 6);
            

            
            //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
            //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════

            
            // SISTEMA EN ESPAÑOL
			}if (idioma == 4) {

                // DATOS INICIALES
                tituloDaOrientacao[0] = "Manual de operación del motor";
                tipoDaOrientacao[0] = "Manual de operación";
                tituloDaOrientacao[1] = "Procedimientos de seguridad para instalaciones eléctricas";
                tipoDaOrientacao[1] = "Procedimientos de seguridad";
                tituloDaOrientacao[2] = "Mantenimiento del motor eléctrico";
                tipoDaOrientacao[2] = "Mantenimiento y reparaciones";
                tituloDaOrientacao[3] = "Pruebas de diagnóstico para transformadores";
                tipoDaOrientacao[3] = "Pruebas y diagnóstico";
                tituloDaOrientacao[4] = "Manual de comportamiento para el departamento de montaje";
                tipoDaOrientacao[4] = "Manual de comportamiento y operaciones sectoriales";
                tituloDaOrientacao[5] = "Procedimientos de seguridad en caso de riesgo de descarga eléctrica";
                tipoDaOrientacao[5] = "Procedimientos de seguridad";
                tituloDaOrientacao[6] = "Mantenimiento del generador eléctrico";
                tipoDaOrientacao[6] = "Mantenimiento y reparaciones";
                tituloDaOrientacao[7] = "Prueba de funcionamiento de los dispositivos de automatización";
                tipoDaOrientacao[7] = "Pruebas y diagnóstico";
                tituloDaOrientacao[8] = "Manual de operación para equipos de soldadura";
                tipoDaOrientacao[8] = "Manual de operación";
                tituloDaOrientacao[9] = "Procedimientos de seguridad en el departamento de montaje";
                tipoDaOrientacao[9] = "Procedimientos de seguridad";

                //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
                // MENÚ
                do {
                    System.out.println("\n════════════════════════════════════════");
                    System.out.println("          📋 MENÚ PRINCIPAL           ");
                    System.out.println("════════════════════════════════════════");
                    System.out.println("  1 - 📝 Registrar");
                    System.out.println("  2 - 🔍 Buscar");
                    System.out.println("  3 - ✏️ Editar");
                    System.out.println("  4 - ❌ Eliminar");
                    System.out.println("  5 - 📊 Mostrar");
                    System.out.println("  6 - 🚪 Salir");
                    System.out.println("════════════════════════════════════════");
                    System.out.print("Elija una opción: ");
                    menu = sc.nextInt();
                    sc.nextLine();

                    // 1 REGISTRAR
                    if (menu == 1) {
                        if (i >= tituloDaOrientacao.length) {
                            String[] novoTitulo = new String[tituloDaOrientacao.length + 1];
                            String[] novoTipo = new String[tipoDaOrientacao.length + 1];
                            for (int j = 0; j < tituloDaOrientacao.length; j++) {
                                novoTitulo[j] = tituloDaOrientacao[j];
                                novoTipo[j] = tipoDaOrientacao[j];
                            }
                            tituloDaOrientacao = novoTitulo;
                            tipoDaOrientacao = novoTipo;
                        }

                        System.out.println("\n\nEscriba el título de la orientación: ");
                        tituloDaOrientacao[i] = sc.nextLine();
                        System.out.println("\nEscriba el tipo de orientación [Manual de operación, Procedimientos de seguridad, Mantenimiento y reparaciones, Pruebas y diagnóstico o Manual de comportamiento y operaciones sectoriales]: ");
                        tipoDaOrientacao[i] = sc.nextLine();
                        System.out.println("\nEscriba la descripción de la orientación: ");
                        descricaoDaOrientacao[i] = sc.nextLine();
                        i++;

                     // 2 BUSCAR
                    } else if (menu == 2) {
                        System.out.println("\nTipos de orientaciones disponibles...\n");
                        for (int d = 0; d < i; d++) {
                            System.out.println("📂 Tipo de orientación: " + tipoDaOrientacao[d]);
                        }

                        System.out.println("\n\nBusque el tipo de orientación: ");
                        String nomeTipo = sc.nextLine();

                        boolean encontrado = false;
                        for (int j = 0; j < i; j++) {
                            if (normalizar(nomeTipo).equals(normalizar(tipoDaOrientacao[j]))) {
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("\n❌ Tipo de orientación no encontrado!");
                            continue;  
                        }

                        System.out.println("\n══════════════════════════════════════════════════════════════════════════");
                        System.out.println("Todos los títulos con el tipo de orientación: " + nomeTipo);
                        System.out.println("══════════════════════════════════════════════════════════════════════════\n");

                        for (int n = 0; n < i; n++) {
                            if (normalizar(tipoDaOrientacao[n]).equals(normalizar(nomeTipo))) {
                                System.out.println("🔖 " + tituloDaOrientacao[n]);
                            }
                        }

                        System.out.println("\n\nSeleccione un título de orientación: ");
                        String tituloSelecionado = sc.nextLine();
                        boolean tituloEncontrado = false;

                        for (int l = 0; l < i; l++) {
                            if (normalizar(tituloSelecionado).equals(normalizar(tituloDaOrientacao[l]))) {
                                tituloEncontrado = true;

                                // Muestra la descripción registrada
                                String descricaoExibida = descricaoDaOrientacao[l] != null && !descricaoDaOrientacao[l].isEmpty()
                                                           ? descricaoDaOrientacao[l]  // Muestra la descripción registrada
                                                           : "Descripción no disponible.";  // En caso de que la descripción sea nula o esté vacía

                                System.out.println("\n----------------------------------------");
                                System.out.println("🔖 " + tituloDaOrientacao[l]);
                                System.out.println("📂 Tipo: " + tipoDaOrientacao[l]);
                                System.out.println("📝 Descripción: " + descricaoExibida);
                                System.out.println("----------------------------------------");

                                break;
                            }
                        }

                        if (!tituloEncontrado) {
                            System.out.println("\n❌ Título no encontrado! Puedes intentarlo nuevamente.");
                            continue;
                        }
                    


                    // 3 EDITAR
                    } else if (menu == 3) {
                        System.out.println("\nTipos de orientación disponibles...\n");
                        for (int z = 0; z < i; z++) {
                            System.out.println("📂 Tipo de orientación: " + tipoDaOrientacao[z]);
                        }

                        System.out.println("\nEscriba el tipo de orientación que desea cambiar: ");
                        atualizarOrientacao = sc.nextLine();

                        String tipoAtualNormalizado = normalizar(atualizarOrientacao);
                        boolean tipoEncontrado = false;

                        for (int h = 0; h < i; h++) {
                            if (normalizar(tipoDaOrientacao[h]).equals(tipoAtualNormalizado)) {
                                tipoEncontrado = true;
                                System.out.println("\n\nTipo de orientación seleccionado: " + tipoDaOrientacao[h] + "\n\nNuevo tipo: ");
                                atualizarOrientacao = sc.nextLine();
                                tipoDaOrientacao[h] = atualizarOrientacao;
                                break;
                            }
                        }

                        if (!tipoEncontrado) {
                            System.out.println("\n❌ Tipo de orientación no encontrado!");
                        }

                    // 4 ELIMINAR
                    } else if (menu == 4) {
                        String produtoRemovido;

                        System.out.println("\n\nElementos disponibles: \n");
                        for (int p = 0; p < i; p++) {
                            System.out.println("📚 " + tituloDaOrientacao[p]);
                        }
                        System.out.println("\nEscriba el elemento que desea eliminar: ");
                        produtoRemovido = sc.nextLine();

                        String nomeProdutoNormalizado = normalizar(produtoRemovido);
                        boolean removido = false;

                        for (int k = 0; k < i; k++) {
                            if (normalizar(tituloDaOrientacao[k]).equals(nomeProdutoNormalizado)) {
                                for (int j = k; j < i - 1; j++) {
                                    tituloDaOrientacao[j] = tituloDaOrientacao[j + 1];
                                    tipoDaOrientacao[j] = tipoDaOrientacao[j + 1];
                                }
                                tituloDaOrientacao[i - 1] = null;
                                tipoDaOrientacao[i - 1] = null;
                                i--;
                                removido = true;
                                break;
                            }
                        }

                        if (removido) {
                            System.out.println("\n¡Elemento eliminado exitosamente!");
                            System.out.println("\n\nElementos después de la eliminación:\n");
                            for (int p = 0; p < i; p++) {
                                if (tituloDaOrientacao[p] != null) {
                                    System.out.println("📂 " + tituloDaOrientacao[p]);
                                }
                            }
                        } else {
                            System.out.println("¡Elemento " + produtoRemovido + " no encontrado para eliminar!");
                        }

                     // 5 MOSTRAR
                    } else if (menu == 5) {
                        // En el bloque de código del menú 5 (Mostrar), mostrar la descripción personalizada y la descripción predeterminada.
                        System.out.println("\n\n════════════════════════════════════════");
                        System.out.println("     📚 ORIENTACIONES REGISTRADAS        ");
                        System.out.println("════════════════════════════════════════");

                        for (int d = 0; d < i; d++) {
                            System.out.println("\n🔖 Título de la Orientación: " + tituloDaOrientacao[d]);
                            System.out.println("📂 Tipo de la Orientación: " + tipoDaOrientacao[d]);

                            // Verificar si se ha registrado una descripción personalizada
                            String descricaoExibida = descricaoDaOrientacao[d] != null && !descricaoDaOrientacao[d].isEmpty()
                                                       ? descricaoDaOrientacao[d]  // Muestra la descripción personalizada
                                                       : "";  // Si no tiene descripción personalizada, deja en blanco

                            // Agregar la descripción predeterminada si no existe una descripción personalizada
                            if (descricaoExibida.isEmpty()) {
                                switch (tipoDaOrientacao[d].toLowerCase()) {
                                    case "manual de operación":
                                        descricaoExibida = "Orientaciones detalladas sobre el uso adecuado y eficiente del equipo. Ejemplos: Manual de operación de motores, transformadores, generadores, etc.";
                                        break;
                                    case "procedimiento de seguridad":
                                        descricaoExibida = "Procedimientos detallados para garantizar la seguridad durante la operación de equipos e instalaciones eléctricas. Ejemplos: Procedimiento de seguridad para instalación eléctrica, riesgo de descarga eléctrica, etc.";
                                        break;
                                    case "mantenimiento y reparaciones":
                                        descricaoExibida = "Orientaciones para el mantenimiento y reparación de equipos, sistemas y dispositivos. Ejemplos: Mantenimiento de motores eléctricos, generadores de energía, etc.";
                                        break;
                                    case "pruebas y diagnóstico":
                                        descricaoExibida = "Procedimientos para probar y diagnosticar problemas en equipos y sistemas. Ejemplos: Prueba de diagnóstico de transformadores, automatización, etc.";
                                        break;
                                    case "manual de conducta y operaciones sectoriales":
                                        descricaoExibida = "Normas y orientaciones para la conducta dentro de sectores específicos y sus operaciones. Ejemplos: Manual de conducta en el sector de montaje, etc.";
                                        break;
                                    default:
                                        descricaoExibida = "Descripción predeterminada no disponible.";
                                }
                            }

                            // Muestra la descripción
                            System.out.println("📝 Descripción: " + descricaoExibida);
                            System.out.println("\n----------------------------------------");
                        }
                    


                    // 6 SALIR
                    } else if (menu == 6) {
                        break;
                    }
                } while (menu != 6);
            

     
            //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
            //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════

            
            // SISTEMA EM FRANCES

			}if (idioma == 5) {

                // DONNÉES INITIALES
                tituloDaOrientacao[0] = "Manuel d'opération du moteur";
                tipoDaOrientacao[0] = "Manuel d'opération";
                tituloDaOrientacao[1] = "Procédures de sécurité pour les installations électriques";
                tipoDaOrientacao[1] = "Procédures de sécurité";
                tituloDaOrientacao[2] = "Maintenance du moteur électrique";
                tipoDaOrientacao[2] = "Maintenance et réparations";
                tituloDaOrientacao[3] = "Tests de diagnostic pour les transformateurs";
                tipoDaOrientacao[3] = "Tests et diagnostic";
                tituloDaOrientacao[4] = "Manuel de comportement pour le département de montage";
                tipoDaOrientacao[4] = "Manuel de comportement et opérations sectorielles";
                tituloDaOrientacao[5] = "Procédures de sécurité en cas de risque de décharge électrique";
                tipoDaOrientacao[5] = "Procédures de sécurité";
                tituloDaOrientacao[6] = "Maintenance du générateur électrique";
                tipoDaOrientacao[6] = "Maintenance et réparations";
                tituloDaOrientacao[7] = "Test de fonctionnement des dispositifs d'automatisation";
                tipoDaOrientacao[7] = "Tests et diagnostic";
                tituloDaOrientacao[8] = "Manuel d'opération pour les équipements de soudage";
                tipoDaOrientacao[8] = "Manuel d'opération";
                tituloDaOrientacao[9] = "Procédures de sécurité dans le département de montage";
                tipoDaOrientacao[9] = "Procédures de sécurité";

                //════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════
                // MENU
                do {
                    System.out.println("\n════════════════════════════════════════");
                    System.out.println("          📋 MENU PRINCIPAL            ");
                    System.out.println("════════════════════════════════════════");
                    System.out.println("  1 - 📝 Enregistrer");
                    System.out.println("  2 - 🔍 Chercher");
                    System.out.println("  3 - ✏️ Modifier");
                    System.out.println("  4 - ❌ Supprimer");
                    System.out.println("  5 - 📊 Afficher");
                    System.out.println("  6 - 🚪 Quitter");
                    System.out.println("════════════════════════════════════════");
                    System.out.print("Choisissez une option: ");
                    menu = sc.nextInt();
                    sc.nextLine();

                    // 1 ENREGISTRER
                    if (menu == 1) {
                        if (i >= tituloDaOrientacao.length) {
                            String[] novoTitulo = new String[tituloDaOrientacao.length + 1];
                            String[] novoTipo = new String[tipoDaOrientacao.length + 1];
                            for (int j = 0; j < tituloDaOrientacao.length; j++) {
                                novoTitulo[j] = tituloDaOrientacao[j];
                                novoTipo[j] = tipoDaOrientacao[j];
                            }
                            tituloDaOrientacao = novoTitulo;
                            tipoDaOrientacao = novoTipo;
                        }

                        System.out.println("\n\nÉcrivez le titre de l'orientation : ");
                        tituloDaOrientacao[i] = sc.nextLine();
                        System.out.println("\nÉcrivez le type d'orientation [Manuel d'opération, Procédures de sécurité, Maintenance et réparations, Tests et diagnostic ou Manuel de comportement et opérations sectorielles] : ");
                        tipoDaOrientacao[i] = sc.nextLine();
                        System.out.println("\nÉcrivez la description de l'orientation : ");
                        descricaoDaOrientacao[i] = sc.nextLine();
                        i++;

                     // 2 RECHERCHER
                    } else if (menu == 2) {
                        System.out.println("\nTypes de guidances disponibles...\n");
                        for (int d = 0; d < i; d++) {
                            System.out.println("📂 Type de guidance: " + tipoDaOrientacao[d]);
                        }

                        System.out.println("\n\nRecherchez le type de guidance : ");
                        String nomeTipo = sc.nextLine();

                        boolean encontrado = false;
                        for (int j = 0; j < i; j++) {
                            if (normalizar(nomeTipo).equals(normalizar(tipoDaOrientacao[j]))) {
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("\n❌ Type de guidance non trouvé !");
                            continue;  
                        }

                        System.out.println("\n══════════════════════════════════════════════════════════════════════════");
                        System.out.println("Tous les titres avec le type de guidance : " + nomeTipo);
                        System.out.println("══════════════════════════════════════════════════════════════════════════\n");

                        for (int n = 0; n < i; n++) {
                            if (normalizar(tipoDaOrientacao[n]).equals(normalizar(nomeTipo))) {
                                System.out.println("🔖 " + tituloDaOrientacao[n]);
                            }
                        }

                        System.out.println("\n\nSélectionnez un titre de guidance : ");
                        String tituloSelecionado = sc.nextLine();
                        boolean tituloEncontrado = false;

                        for (int l = 0; l < i; l++) {
                            if (normalizar(tituloSelecionado).equals(normalizar(tituloDaOrientacao[l]))) {
                                tituloEncontrado = true;

                                // Affiche la description enregistrée
                                String descricaoExibida = descricaoDaOrientacao[l] != null && !descricaoDaOrientacao[l].isEmpty()
                                                           ? descricaoDaOrientacao[l]  // Affiche la description enregistrée
                                                           : "Description non disponible.";  // Si la description est nulle ou vide

                                System.out.println("\n----------------------------------------");
                                System.out.println("🔖 " + tituloDaOrientacao[l]);
                                System.out.println("📂 Type : " + tipoDaOrientacao[l]);
                                System.out.println("📝 Description : " + descricaoExibida);
                                System.out.println("----------------------------------------");

                                break;
                            }
                        }

                        if (!tituloEncontrado) {
                            System.out.println("\n❌ Titre non trouvé ! Vous pouvez essayer à nouveau.");
                            continue;
                        }
                    

                        
                    // 3 MODIFIER
                    } else if (menu == 3) {
                        System.out.println("\nTypes d'orientations disponibles...\n");
                        for (int z = 0; z < i; z++) {
                            System.out.println("📂 Type d'orientation: " + tipoDaOrientacao[z]);
                        }

                        System.out.println("\nÉcrivez le type d'orientation que vous souhaitez modifier : ");
                        atualizarOrientacao = sc.nextLine();

                        String tipoAtualNormalizado = normalizar(atualizarOrientacao);
                        boolean tipoEncontrado = false;

                        for (int h = 0; h < i; h++) {
                            if (normalizar(tipoDaOrientacao[h]).equals(tipoAtualNormalizado)) {
                                tipoEncontrado = true;
                                System.out.println("\n\nType d'orientation sélectionné : " + tipoDaOrientacao[h] + "\n\nNouveau type : ");
                                atualizarOrientacao = sc.nextLine();
                                tipoDaOrientacao[h] = atualizarOrientacao;
                                break;
                            }
                        }

                        if (!tipoEncontrado) {
                            System.out.println("\n❌ Type d'orientation non trouvé!");
                        }

                    // 4 SUPPRIMER
                    } else if (menu == 4) {
                        String produtoRemovido;

                        System.out.println("\n\nÉléments disponibles : \n");
                        for (int p = 0; p < i; p++) {
                            System.out.println("📚 " + tituloDaOrientacao[p]);
                        }
                        System.out.println("\nÉcrivez l'élément que vous souhaitez supprimer : ");
                        produtoRemovido = sc.nextLine();

                        String nomeProdutoNormalizado = normalizar(produtoRemovido);
                        boolean removido = false;

                        for (int k = 0; k < i; k++) {
                            if (normalizar(tituloDaOrientacao[k]).equals(nomeProdutoNormalizado)) {
                                for (int j = k; j < i - 1; j++) {
                                    tituloDaOrientacao[j] = tituloDaOrientacao[j + 1];
                                    tipoDaOrientacao[j] = tipoDaOrientacao[j + 1];
                                }
                                tituloDaOrientacao[i - 1] = null;
                                tipoDaOrientacao[i - 1] = null;
                                i--;
                                removido = true;
                                break;
                            }
                        }

                        if (removido) {
                            System.out.println("\nÉlément supprimé avec succès!");
                            System.out.println("\n\nÉléments après la suppression:\n");
                            for (int p = 0; p < i; p++) {
                                if (tituloDaOrientacao[p] != null) {
                                    System.out.println("📂 " + tituloDaOrientacao[p]);
                                }
                            }
                        } else {
                            System.out.println("L'élément " + produtoRemovido + " non trouvé pour suppression!");
                        }

                     // 5 AFFICHER
                    } else if (menu == 5) {
                        // Dans le bloc de code du menu 5 (Afficher), afficher la description personnalisée et la description par défaut.
                        System.out.println("\n\n════════════════════════════════════════");
                        System.out.println("     📚 ORIENTATIONS ENREGISTRÉES         ");
                        System.out.println("════════════════════════════════════════");

                        for (int d = 0; d < i; d++) {
                            System.out.println("\n🔖 Titre de l'Orientation: " + tituloDaOrientacao[d]);
                            System.out.println("📂 Type de l'Orientation: " + tipoDaOrientacao[d]);

                            // Vérifier si une description personnalisée a été enregistrée
                            String descricaoExibida = descricaoDaOrientacao[d] != null && !descricaoDaOrientacao[d].isEmpty()
                                                       ? descricaoDaOrientacao[d]  // Affiche la description personnalisée
                                                       : "";  // Si aucune description personnalisée, laisser vide

                            // Ajouter la description par défaut si aucune description personnalisée n'existe
                            if (descricaoExibida.isEmpty()) {
                                switch (tipoDaOrientacao[d].toLowerCase()) {
                                    case "manuel d'opération":
                                        descricaoExibida = "Directives détaillées sur l'utilisation correcte et efficace des équipements. Exemples : Manuel d'opération pour moteurs, transformateurs, générateurs, etc.";
                                        break;
                                    case "procédure de sécurité":
                                        descricaoExibida = "Procédures détaillées pour garantir la sécurité lors de l'opération d'équipements et d'installations électriques. Exemples : Procédure de sécurité pour installation électrique, risque de choc électrique, etc.";
                                        break;
                                    case "maintenance et réparations":
                                        descricaoExibida = "Directives pour la maintenance et les réparations des équipements, systèmes et dispositifs. Exemples : Maintenance des moteurs électriques, générateurs d'énergie, etc.";
                                        break;
                                    case "tests et diagnostic":
                                        descricaoExibida = "Procédures pour tester et diagnostiquer des problèmes dans les équipements et systèmes. Exemples : Test de diagnostic pour transformateurs, automatisation, etc.";
                                        break;
                                    case "manuel de conduite et opérations sectorielles":
                                        descricaoExibida = "Normes et directives pour le comportement dans des secteurs spécifiques et leurs opérations. Exemples : Manuel de conduite pour le secteur de l'assemblage, etc.";
                                        break;
                                    default:
                                        descricaoExibida = "Description par défaut non disponible.";
                                }
                            }

                            // Afficher la description
                            System.out.println("📝 Description: " + descricaoExibida);
                            System.out.println("\n----------------------------------------");
                        }
                    



                    // 6 QUITTER
                    } else if (menu == 6) {
                        break;
                    }
                } while (menu != 6);
       
        
            
            }
        }
    }
    
