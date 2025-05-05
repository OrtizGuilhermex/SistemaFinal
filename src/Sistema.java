import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIAVEIS
        String nomeOrientacao;
        String menu;
        String atualizarOrientacao;
        String idioma;
        int i = 10;
        int c = 0;

        // ARRAY
        String tituloDaOrientacao[] = new String[11];
        String tipoDaOrientacao[] = new String[11]; // (Escolha entre "Manual de Operação", "Procedimento de Segurança",
                                                    // "Manutenção e Reparos", "Testes e Diagnóstico" ou "Manual de
                                                    // Conduta e Operações Setoriais").

        // ===========================================================================================================

        do {

            System.out.println("╔══════════════════════════════════════════════════════════════════╗");
            System.out.println("║        	 🌍 Escolha o idioma do sistema         	           ║");
            System.out.println("║  [Português / Inglês / Alemão / Espanhol / Francês]              ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════╝");
            System.out.print("Digite sua opção: ");
            idioma = sc.next();

            if (idioma.equalsIgnoreCase("portugues") || idioma.equalsIgnoreCase("ingles")
                    || idioma.equalsIgnoreCase("alemao") || idioma.equalsIgnoreCase("espanhol")
                    || idioma.equalsIgnoreCase("frances")) {
                c++;

            } else {

            }

        } while (c == 0);

        // ===========================================================================================================

        // SISTEMA EM PORTUGUÊS:
        if (idioma.equalsIgnoreCase("portugues")) {

            // 10 ORIENTAÇÕES JÁ CADASTRADAS
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

            // ===========================================================================================================

            // REPETIÇÃO COM O DO
            do {
                System.out.println("\n════════════════════════════════════════");
                System.out.println("          📋 MENU PRINCIPAL           ");
                System.out.println("════════════════════════════════════════");
                System.out.println("  1 - 📝 Cadastrar                    ");
                System.out.println("  2 - 🔍 Pesquisar                    ");
                System.out.println("  3 - ✏️ Editar                       ");
                System.out.println("  4 - ❌ Excluir                      ");
                System.out.println("  5 - 📊 Exibir                       ");
                System.out.println("  6 - 🚪 Sair                         ");
                System.out.println("════════════════════════════════════════");
                System.out.print("Selecione uma opção: ");
                menu = sc.next();
                sc.nextLine();

                // ===========================================================================================================

                // 1 CADASTRAR
                if (menu.equalsIgnoreCase("Cadastrar")) {
                    if (i >= tituloDaOrientacao.length) {
                        String[] novoTitulo = new String[tituloDaOrientacao.length + 1];
                        String[] novoTipo = new String[tipoDaOrientacao.length + 1];

                        // COPIAS DO NOVO ARRAY
                        for (int j = 0; j < tituloDaOrientacao.length; j++) {
                            novoTitulo[j] = tituloDaOrientacao[j];
                            novoTipo[j] = tipoDaOrientacao[j];
                        }

                        // AQUI VAMOS ATUALIZAR OS ARRAYS
                        tituloDaOrientacao = novoTitulo;
                        tipoDaOrientacao = novoTipo;
                    }

                    // ESCREVER O TITULO E O TIPO DE ORIENTAÇÃO
                    System.out.println("\n\nEscreva o título da orientação: ");
                    tituloDaOrientacao[i] = sc.nextLine();
                    System.out.println(
                            "\nEscreva o Tipo da orientação: [ \"Manual de Operação\", \"Procedimento de Segurança\", \"Manutenção e Reparos\", \"Testes e Diagnóstico\" ou \"Manual de Conduta e Operações Setoriais\"]: ");
                    tipoDaOrientacao[i] = sc.nextLine();
                    i++;

                    // ===========================================================================================================

                    // 2 PESQUISAR
                } else if (menu.equalsIgnoreCase("Pesquisar")) {
                    System.out.println("\nPesquise o nome do produto: ");
                    nomeOrientacao = sc.nextLine();

                    boolean encontrado = false;

                    for (int j = 0; j < i; j++) {
                        if (nomeOrientacao.equalsIgnoreCase(tituloDaOrientacao[j])) {

                            System.out.println("\nO título que você escolheu é: " + tituloDaOrientacao[j]
                                    + " e ele está em estoque!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("\nEste produto está indisponível!");
                    }

                    // ===========================================================================================================

                    // 3 EDITAR
                } else if (menu.equalsIgnoreCase("Editar")) {
                    System.out.println("\nEscreva a orientação que você deseja mudar: ");
                    atualizarOrientacao = sc.nextLine();

                    for (int h = 0; h < i; h++) {
                        if (atualizarOrientacao.equalsIgnoreCase(tipoDaOrientacao[h])) {
                            System.out.println("\n\nOrientação selecionada: " + tipoDaOrientacao[h]
                                    + "\n\nEscreva o que você quer editar na orientação: ");
                            atualizarOrientacao = sc.nextLine();
                            tipoDaOrientacao[h] = atualizarOrientacao;
                        }
                    }

                    // ===========================================================================================================

                    // 4 REMOVER
                } else if (menu.equalsIgnoreCase("excluir")) {
                    String produtoRemovido;

                    System.out.println("\n\nItens disponíveis: ");
                    for (int p = 0; p < i; p++) {
                        System.out.println(tituloDaOrientacao[p]);
                    }
                    System.out.println("\nDigite o item que você deseja remover: ");
                    produtoRemovido = sc.nextLine();

                    boolean removido = false;

                    for (int k = 0; k < i; k++) {
                        if (tituloDaOrientacao[k].equalsIgnoreCase(produtoRemovido)) {
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
                        System.out.println("\nItens após remoção:");
                        for (int p = 0; p < i; p++) {
                            if (tituloDaOrientacao[p] != null) {
                                System.out.println(tituloDaOrientacao[p]);
                            }
                        }
                    } else {
                        System.out.println("Item " + produtoRemovido + " não encontrado para remover!");
                    }

                    // ===========================================================================================================

                    // 5 EXIBIR
                } else if (menu.equalsIgnoreCase("Exibir")) {

                    System.out.println("\n\n════════════════════════════════════════");
                    System.out.println("     📚 ORIENTAÇÕES CADASTRADAS         ");
                    System.out.println("════════════════════════════════════════");

                    for (int d = 0; d < i; d++) {
                        System.out.println("\n🔖 Título da Orientação: " + tituloDaOrientacao[d]);
                        System.out.println("📂 Tipo da Orientação: " + tipoDaOrientacao[d]);

                        switch (tipoDaOrientacao[d].toLowerCase()) {
                            case "manual de operação":
                                System.out.println(
                                        "📝 Descrição: Orientações detalhadas sobre o uso correto e eficiente dos equipamentos.");
                                System.out.println(
                                        "📌 Exemplos: Manual de operação de motores, transformadores, geradores, etc.");
                                break;
                            case "procedimento de segurança":
                                System.out.println(
                                        "🛡️ Descrição: Procedimentos detalhados para garantir a segurança durante a operação de equipamentos e instalações elétricas.");
                                System.out.println(
                                        "📌 Exemplos: Procedimento de segurança para instalação elétrica, risco de choque elétrico, etc.");
                                break;
                            case "manutenção e reparos":
                                System.out.println(
                                        "🔧 Descrição: Orientações para a manutenção e reparos de equipamentos, sistemas e dispositivos.");
                                System.out.println(
                                        "📌 Exemplos: Manutenção de motores elétricos, geradores de energia, etc.");
                                break;
                            case "testes e diagnóstico":
                                System.out.println(
                                        "🧪 Descrição: Procedimentos para testar e diagnosticar problemas em equipamentos e sistemas.");
                                System.out.println(
                                        "📌 Exemplos: Teste de diagnóstico de transformadores, automação, etc.");
                                break;
                            case "manual de conduta e operações setoriais":
                                System.out.println(
                                        "📘 Descrição: Normas e orientações para a conduta dentro de setores específicos e suas operações.");
                                System.out.println("📌 Exemplos: Manual de conduta no setor de montagem, etc.");
                                break;
                            default:
                                System.out.println("❓ Descrição: Descrição não disponível.");
                        }

                        System.out.println("\n----------------------------------------");
                    }

                    // ===========================================================================================================

                    // 6 SAIR
                } else if (menu.equalsIgnoreCase("Sair")) {
                    break;
                }
            } while (!menu.equalsIgnoreCase("Sair"));

            // ===========================================================================================================
            // ===========================================================================================================

            // SISTEMA EM INGLÊS:
        } else if (idioma.equalsIgnoreCase("ingles")) {

            // VARIABLES
            String orientationName;
            String updateOrientation;

            // ARRAYS
            String orientationTitle[] = new String[11];
            String orientationType[] = new String[11];

            // ===========================================================================================================

            // 10 REGISTERED GUIDELINES
            orientationTitle[0] = "Motor Operation Manual";
            orientationType[0] = "Operation Manual";

            orientationTitle[1] = "Electrical Installation Safety Procedure";
            orientationType[1] = "Safety Procedure";

            orientationTitle[2] = "Electric Motor Maintenance";
            orientationType[2] = "Maintenance and Repairs";

            orientationTitle[3] = "Transformer Diagnostic Test";
            orientationType[3] = "Testing and Diagnosis";

            orientationTitle[4] = "Conduct Manual for the Assembly Sector";
            orientationType[4] = "Conduct and Sector Operations Manual";

            orientationTitle[5] = "Safety Procedure for Risk of Electric Shock";
            orientationType[5] = "Safety Procedure";

            orientationTitle[6] = "Power Generator Maintenance";
            orientationType[6] = "Maintenance and Repairs";

            orientationTitle[7] = "Functionality Test for Automation Equipment";
            orientationType[7] = "Testing and Diagnosis";

            orientationTitle[8] = "Welding Equipment Operation Manual";
            orientationType[8] = "Operation Manual";

            orientationTitle[9] = "Safety Procedure for the Assembly Sector";
            orientationType[9] = "Safety Procedure";

            // ===========================================================================================================

            // LOOP WITH DO-WHILE
            do {
                System.out.println("\n╔═══════════════════════════════");
                System.out.println("║            📋 MENU            ");
                System.out.println("╠═══════════════════════════════");
                System.out.println("║  1 - 📝 Register              ");
                System.out.println("║  2 - 🔍 Search                ");
                System.out.println("║  3 - ✏️ Edit                  ");
                System.out.println("║  4 - ❌ Delete                ");
                System.out.println("║  5 - 📊 Display              ");
                System.out.println("║  6 - 🚪 Exit                  ");
                System.out.println("╚═══════════════════════════════");
                System.out.print("Select an option: ");
                menu = sc.next();
                sc.nextLine();

                // ===========================================================================================================

                // 1 REGISTER
                if (menu.equalsIgnoreCase("Register")) {
                    if (i >= orientationTitle.length) {
                        String[] newTitle = new String[orientationTitle.length + 1];
                        String[] newType = new String[orientationType.length + 1];

                        for (int j = 0; j < orientationTitle.length; j++) {
                            newTitle[j] = orientationTitle[j];
                            newType[j] = orientationType[j];
                        }

                        orientationTitle = newTitle;
                        orientationType = newType;
                    }

                    System.out.println("\nEnter the title of the orientation: ");
                    orientationTitle[i] = sc.nextLine();

                    System.out.println(
                            "Enter the type of orientation [\"Operation Manual\", \"Safety Procedure\", \"Maintenance and Repairs\", \"Testing and Diagnosis\", \"Conduct and Sector Operations Manual\"]:");
                    orientationType[i] = sc.nextLine();
                    i++;

                    // ===========================================================================================================

                    // 2 SEARCH
                } else if (menu.equalsIgnoreCase("Search")) {
                    System.out.println("\nSearch for the orientation title: ");
                    orientationName = sc.nextLine();

                    boolean found = false;

                    for (int j = 0; j < i; j++) {
                        if (orientationName.equalsIgnoreCase(orientationTitle[j])) {
                            System.out.println(
                                    "\nThe selected orientation is: " + orientationTitle[j] + " and it is available!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("\nThis orientation is unavailable!");
                    }

                    // ===========================================================================================================

                    // 3 EDIT
                } else if (menu.equalsIgnoreCase("Edit")) {
                    System.out.println("\nEnter the orientation type you want to change: ");
                    updateOrientation = sc.nextLine();

                    for (int h = 0; h < i; h++) {
                        if (updateOrientation.equalsIgnoreCase(orientationType[h])) {
                            System.out.println("\nSelected orientation: " + orientationType[h]);
                            System.out.println("Enter the new content: ");
                            orientationType[h] = sc.nextLine();
                        }
                    }

                    // ===========================================================================================================

                    // 4 DELETE
                } else if (menu.equalsIgnoreCase("Delete")) {
                    String itemToRemove;

                    System.out.println("\nAvailable items:");
                    for (int p = 0; p < i; p++) {
                        System.out.println(orientationTitle[p]);
                    }

                    System.out.println("\nEnter the item you want to remove: ");
                    itemToRemove = sc.nextLine();

                    boolean removed = false;

                    for (int k = 0; k < i; k++) {
                        if (orientationTitle[k].equalsIgnoreCase(itemToRemove)) {
                            for (int j = k; j < i - 1; j++) {
                                orientationTitle[j] = orientationTitle[j + 1];
                                orientationType[j] = orientationType[j + 1];
                            }
                            orientationTitle[i - 1] = null;
                            orientationType[i - 1] = null;
                            i--;
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("\nItems after removal:");
                        for (int p = 0; p < i; p++) {
                            if (orientationTitle[p] != null) {
                                System.out.println(orientationTitle[p]);
                            }
                        }
                    } else {
                        System.out.println("Item \"" + itemToRemove + "\" not found!");
                    }

                    // ===========================================================================================================

                    // 5 DISPLAY
                } else if (menu.equalsIgnoreCase("Display")) {

                    System.out.println("\n\n════════════════════════════════════════");
                    System.out.println("     📚 REGISTERED GUIDELINES           ");
                    System.out.println("════════════════════════════════════════");

                    for (int d = 0; d < i; d++) {
                        System.out.println("\n🔖 Guideline Title: "
                                + (orientationTitle[d] != null ? orientationTitle[d] : "[Not available]"));
                        System.out.println("📂 Guideline Type: "
                                + (orientationType[d] != null ? orientationType[d] : "[Not available]"));

                        if (orientationType[d] != null) {
                            switch (orientationType[d].toLowerCase()) {
                                case "operation manual":
                                    System.out.println(
                                            "📝 Description: Detailed guidelines for the correct and efficient use of equipment.");
                                    System.out.println(
                                            "📌 Examples: Operation manuals for motors, transformers, generators, etc.");
                                    break;
                                case "safety procedure":
                                    System.out.println(
                                            "🛡️ Description: Detailed procedures to ensure safety during the operation of electrical equipment and installations.");
                                    System.out.println(
                                            "📌 Examples: Safety procedures for electrical installation, risk of electric shock, etc.");
                                    break;
                                case "maintenance and repairs":
                                    System.out.println(
                                            "🔧 Description: Guidelines for maintenance and repair of equipment, systems, and devices.");
                                    System.out.println(
                                            "📌 Examples: Maintenance of electric motors, power generators, etc.");
                                    break;
                                case "testing and diagnosis":
                                    System.out.println(
                                            "🧪 Description: Procedures to test and diagnose problems in equipment and systems.");
                                    System.out.println(
                                            "📌 Examples: Diagnostic tests for transformers, automation systems, etc.");
                                    break;
                                case "conduct and sector operations manual":
                                    System.out.println(
                                            "📘 Description: Standards and guidelines for conduct within specific sectors and their operations.");
                                    System.out.println("📌 Examples: Conduct manual for the assembly sector, etc.");
                                    break;
                                default:
                                    System.out.println("❓ Description: Description not available.");
                            }
                        } else {
                            System.out.println("❓ Description: Description not available.");
                        }

                        System.out.println("\n----------------------------------------");
                    }

                    // ===========================================================================================================

                    // 6 EXIT
                } else if (menu.equalsIgnoreCase("Exit")) {
                    break;
                }

            } while (!menu.equalsIgnoreCase("Exit"));

            // ===========================================================================================================
            // ===========================================================================================================

            // SISTEMA EM Alemão:

        } else if (idioma.equalsIgnoreCase("alemao")) {

            // VARIABLEN
            String orientierungsName;
            String aktualisiereOrientierung;

            // ARRAYS
            String[] orientierungsTitel = new String[11];
            String[] orientierungsTyp = new String[11];

            // ===========================================================================================================

            // 10 REGISTRIERTE RICHTLINIEN
            orientierungsTitel[0] = "Betriebsanleitung für Motoren";
            orientierungsTyp[0] = "Betriebsanleitung";

            orientierungsTitel[1] = "Sicherheitsverfahren für Elektroinstallationen";
            orientierungsTyp[1] = "Sicherheitsverfahren";

            orientierungsTitel[2] = "Wartung von Elektromotoren";
            orientierungsTyp[2] = "Wartung und Reparaturen";

            orientierungsTitel[3] = "Diagnosetest für Transformatoren";
            orientierungsTyp[3] = "Tests und Diagnosen";

            orientierungsTitel[4] = "Verhaltenshandbuch für den Montagebereich";
            orientierungsTyp[4] = "Verhaltens- und Betriebsanleitung für den Sektor";

            orientierungsTitel[5] = "Sicherheitsverfahren bei Stromschlaggefahr";
            orientierungsTyp[5] = "Sicherheitsverfahren";

            orientierungsTitel[6] = "Wartung von Stromgeneratoren";
            orientierungsTyp[6] = "Wartung und Reparaturen";

            orientierungsTitel[7] = "Funktionstest für Automatisierungsgeräte";
            orientierungsTyp[7] = "Tests und Diagnosen";

            orientierungsTitel[8] = "Betriebsanleitung für Schweißgeräte";
            orientierungsTyp[8] = "Betriebsanleitung";

            orientierungsTitel[9] = "Sicherheitsverfahren für den Montagebereich";
            orientierungsTyp[9] = "Sicherheitsverfahren";

            // ===========================================================================================================

            // DO-WHILE-SCHLEIFE
            do {
                System.out.println("\n╔═══════════════════════════════ ");
                System.out.println("║            📋 MENÜ             ");
                System.out.println("╠═══════════════════════════════ ");
                System.out.println("║  1 - 📝 Registrieren            ");
                System.out.println("║  2 - 🔍 Suchen                  ");
                System.out.println("║  3 - ✏️ Bearbeiten             ");
                System.out.println("║  4 - ❌ Löschen                 ");
                System.out.println("║  5 - 📊 Anzeigen                ");
                System.out.println("║  6 - 🚪 Beenden                 ");
                System.out.println("╚═══════════════════════════════ ");
                System.out.print("Option auswählen: ");
                menu = sc.next();
                sc.nextLine();

                // ===========================================================================================================

                // 1 - REGISTRIEREN
                if (menu.equalsIgnoreCase("Registrieren")) {
                    if (i >= orientierungsTitel.length) {
                        String[] neuerTitel = new String[orientierungsTitel.length + 1];
                        String[] neuerTyp = new String[orientierungsTyp.length + 1];

                        for (int j = 0; j < orientierungsTitel.length; j++) {
                            neuerTitel[j] = orientierungsTitel[j];
                            neuerTyp[j] = orientierungsTyp[j];
                        }

                        orientierungsTitel = neuerTitel;
                        orientierungsTyp = neuerTyp;
                    }

                    System.out.println("\n\nGeben Sie den Titel der Orientierung ein: ");
                    orientierungsTitel[i] = sc.nextLine();

                    System.out.println(
                            "\nGeben Sie den Typ der Orientierung ein: [\"Bedienungsanleitung\", \"Sicherheitsverfahren\", \"Wartung und Reparaturen\", \"Tests und Diagnosen\" oder \"Verhaltens- und Betriebsanleitung\"]:");
                    orientierungsTyp[i] = sc.nextLine();
                    i++;

                    // ===========================================================================================================

                    // 2 - SUCHEN
                } else if (menu.equalsIgnoreCase("Suchen")) {
                    System.out.println("\nNach Orientierungstitel suchen: ");
                    orientierungsName = sc.nextLine();

                    boolean gefunden = false;
                    for (int j = 0; j < i; j++) {
                        if (orientierungsName.equalsIgnoreCase(orientierungsTitel[j])) {
                            System.out.println("\nDie ausgewählte Orientierung ist: " + orientierungsTitel[j]
                                    + " und ist verfügbar!");
                            gefunden = true;
                            break;
                        }
                    }

                    if (!gefunden) {
                        System.out.println("\nDiese Orientierung ist nicht verfügbar!");
                    }

                    // ===========================================================================================================

                    // 3 - BEARBEITEN
                } else if (menu.equalsIgnoreCase("Bearbeiten")) {
                    System.out.println("\nGeben Sie den Typ der Orientierung ein, die Sie ändern möchten: ");
                    aktualisiereOrientierung = sc.nextLine();

                    for (int h = 0; h < i; h++) {
                        if (aktualisiereOrientierung.equalsIgnoreCase(orientierungsTyp[h])) {
                            System.out.println("\n\nAusgewählte Orientierung: " + orientierungsTyp[h]);
                            System.out.println("Geben Sie den neuen Inhalt ein: ");
                            orientierungsTyp[h] = sc.nextLine();
                        }
                    }

                    // ===========================================================================================================

                    // 4 - LÖSCHEN
                } else if (menu.equalsIgnoreCase("Löschen")) {
                    System.out.println("\n\nVerfügbare Elemente: ");
                    for (int p = 0; p < i; p++) {
                        System.out.println(orientierungsTitel[p]);
                    }

                    System.out.println("\nGeben Sie das Element ein, das Sie entfernen möchten: ");
                    String zuEntfernendesElement = sc.nextLine();

                    boolean entfernt = false;
                    for (int k = 0; k < i; k++) {
                        if (orientierungsTitel[k].equalsIgnoreCase(zuEntfernendesElement)) {
                            for (int j = k; j < i - 1; j++) {
                                orientierungsTitel[j] = orientierungsTitel[j + 1];
                                orientierungsTyp[j] = orientierungsTyp[j + 1];
                            }
                            orientierungsTitel[i - 1] = null;
                            orientierungsTyp[i - 1] = null;
                            i--;
                            entfernt = true;
                            break;
                        }
                    }

                    if (entfernt) {
                        System.out.println("\nElemente nach dem Entfernen:");
                        for (int p = 0; p < i; p++) {
                            if (orientierungsTitel[p] != null) {
                                System.out.println(orientierungsTitel[p]);
                            }
                        }
                    } else {
                        System.out.println("Element " + zuEntfernendesElement + " wurde nicht gefunden!");
                    }

                    // ===========================================================================================================

                    // 5 - ANZEIGEN
                } else if (menu.equalsIgnoreCase("Anzeigen")) {
                    System.out.println("\n════════════════════════════════════════");
                    System.out.println("     📚 REGISTRIERTE ANLEITUNGEN        ");
                    System.out.println("════════════════════════════════════════");

                    for (int d = 0; d < i; d++) {
                        System.out.println("\n🔖 Titel der Anleitung: "
                                + (orientierungsTitel[d] != null ? orientierungsTitel[d] : "[Nicht verfügbar]"));
                        System.out.println("📂 Typ der Anleitung: "
                                + (orientierungsTyp[d] != null ? orientierungsTyp[d] : "[Nicht verfügbar]"));

                        if (orientierungsTyp[d] != null) {
                            switch (orientierungsTyp[d].toLowerCase()) {
                                case "bedienungsanleitung":
                                    System.out.println(
                                            "📝 Beschreibung: Detaillierte Anleitungen zur korrekten und effizienten Nutzung der Geräte.");
                                    System.out.println(
                                            "📌 Beispiele: Bedienungsanleitung für Motoren, Transformatoren, Generatoren usw.");
                                    break;
                                case "sicherheitsverfahren":
                                    System.out.println(
                                            "🛡️ Beschreibung: Verfahren zur Gewährleistung der Sicherheit beim Betrieb von elektrischen Geräten und Anlagen.");
                                    System.out.println(
                                            "📌 Beispiele: Sicherheitsverfahren für elektrische Installationen, Risiko eines Stromschlags usw.");
                                    break;
                                case "wartung und reparaturen":
                                    System.out.println(
                                            "🔧 Beschreibung: Anleitungen zur Wartung und Reparatur von Geräten, Systemen und Vorrichtungen.");
                                    System.out
                                            .println("📌 Beispiele: Wartung von Elektromotoren, Stromgeneratoren usw.");
                                    break;
                                case "tests und diagnosen":
                                    System.out.println(
                                            "🧪 Beschreibung: Verfahren zum Testen und Diagnostizieren von Problemen an Geräten und Systemen.");
                                    System.out.println(
                                            "📌 Beispiele: Diagnosetests für Transformatoren, Automatisierung usw.");
                                    break;
                                case "verhaltens- und betriebsanleitung":
                                    System.out.println(
                                            "📘 Beschreibung: Standards und Richtlinien für das Verhalten in spezifischen Bereichen und deren Abläufe.");
                                    System.out.println("📌 Beispiele: Verhaltenshandbuch für den Montagebereich usw.");
                                    break;
                                default:
                                    System.out.println("❓ Beschreibung: Keine Beschreibung verfügbar.");
                            }
                        } else {
                            System.out.println("❓ Beschreibung: Keine Beschreibung verfügbar.");
                        }

                        System.out.println("\n----------------------------------------");
                    }

                    // ===========================================================================================================

                    // 6 - BEENDEN
                } else if (menu.equalsIgnoreCase("Beenden")) {
                    break;
                }

            } while (!menu.equalsIgnoreCase("Beenden"));

            // ===========================================================================================================

            // SISTEMA EM espanhol:

        } else if (idioma.equalsIgnoreCase("espanhol")) {

            // VARIABLES
            String nombreOrientacion;
            String actualizarOrientacion;

            // ARRAYS
            String[] tituloOrientacion = new String[11];
            String[] tipoOrientacion = new String[11];

            // ===========================================================================================================

            // 10 DIRECTRICES REGISTRADAS
            // 10 ORIENTACIONES REGISTRADAS
            tituloOrientacion[0] = "Manual de operación de motores";
            tipoOrientacion[0] = "Manual de operación";

            tituloOrientacion[1] = "Procedimiento de seguridad para instalaciones eléctricas";
            tipoOrientacion[1] = "Procedimiento de seguridad";

            tituloOrientacion[2] = "Mantenimiento de motores eléctricos";
            tipoOrientacion[2] = "Mantenimiento y reparaciones";

            tituloOrientacion[3] = "Prueba de diagnóstico de transformadores";
            tipoOrientacion[3] = "Pruebas y diagnósticos";

            tituloOrientacion[4] = "Manual de conducta para el sector de montaje";
            tipoOrientacion[4] = "Manual de conducta y operaciones del sector";

            tituloOrientacion[5] = "Procedimiento de seguridad ante riesgo de descarga eléctrica";
            tipoOrientacion[5] = "Procedimiento de seguridad";

            tituloOrientacion[6] = "Mantenimiento de generadores eléctricos";
            tipoOrientacion[6] = "Mantenimiento y reparaciones";

            tituloOrientacion[7] = "Prueba de funcionamiento de equipos de automatización";
            tipoOrientacion[7] = "Pruebas y diagnósticos";

            tituloOrientacion[8] = "Manual de operación de equipos de soldadura";
            tipoOrientacion[8] = "Manual de operación";

            tituloOrientacion[9] = "Procedimiento de seguridad para el sector de montaje";
            tipoOrientacion[9] = "Procedimiento de seguridad";

            // ===========================================================================================================

            // BUCLE DO-WHILE
            do {
                System.out.println("\n╔═══════════════════════════════ ");
                System.out.println("║            📋 MENÚ             ");
                System.out.println("╠═══════════════════════════════ ");
                System.out.println("║  1 - 📝 Registrar               ");
                System.out.println("║  2 - 🔍 Buscar                  ");
                System.out.println("║  3 - ✏️ Editar                 ");
                System.out.println("║  4 - ❌ Eliminar                ");
                System.out.println("║  5 - 📊 Mostrar                 ");
                System.out.println("║  6 - 🚪 Salir                   ");
                System.out.println("╚═══════════════════════════════ ");
                System.out.print("Seleccione una opción: ");
                menu = sc.next();
                sc.nextLine();

                // ===========================================================================================================

                // 1 - REGISTRAR
                if (menu.equalsIgnoreCase("Registrar")) {
                    if (i >= tituloOrientacion.length) {
                        String[] nuevoTitulo = new String[tituloOrientacion.length + 1];
                        String[] nuevoTipo = new String[tipoOrientacion.length + 1];

                        for (int j = 0; j < tituloOrientacion.length; j++) {
                            nuevoTitulo[j] = tituloOrientacion[j];
                            nuevoTipo[j] = tipoOrientacion[j];
                        }

                        tituloOrientacion = nuevoTitulo;
                        tipoOrientacion = nuevoTipo;
                    }

                    System.out.println("\n\nIngrese el título de la orientación: ");
                    tituloOrientacion[i] = sc.nextLine();
                    System.out.println(
                            "\nIngrese el tipo de orientación: [\"Manual de operación\", \"Procedimiento de seguridad\", \"Mantenimiento y reparaciones\", \"Pruebas y diagnósticos\" o \"Manual de conducta y operaciones del sector\"]:");
                    tipoOrientacion[i] = sc.nextLine();
                    i++;

                    // ===========================================================================================================

                    // 2 - BUSCAR
                } else if (menu.equalsIgnoreCase("Buscar")) {
                    System.out.println("\nBuscar por título de orientación: ");
                    nombreOrientacion = sc.nextLine();

                    boolean encontrado = false;

                    for (int j = 0; j < i; j++) {
                        if (nombreOrientacion.equalsIgnoreCase(tituloOrientacion[j])) {
                            System.out.println("\nLa orientación seleccionada es: " + tituloOrientacion[j]
                                    + " ¡y está disponible!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("\n¡Esta orientación no está disponible!");
                    }

                    // ===========================================================================================================

                    // 3 - EDITAR
                } else if (menu.equalsIgnoreCase("Editar")) {
                    System.out.println("\nIngrese el tipo de orientación que desea cambiar: ");
                    actualizarOrientacion = sc.nextLine();

                    for (int h = 0; h < i; h++) {
                        if (actualizarOrientacion.equalsIgnoreCase(tipoOrientacion[h])) {
                            System.out.println("\n\nOrientación seleccionada: " + tipoOrientacion[h]
                                    + "\n\nIngrese el nuevo contenido: ");
                            actualizarOrientacion = sc.nextLine();
                            tipoOrientacion[h] = actualizarOrientacion;
                        }
                    }

                    // ===========================================================================================================

                    // 4 - ELIMINAR
                } else if (menu.equalsIgnoreCase("Eliminar")) {
                    String elementoAEliminar;

                    System.out.println("\n\nElementos disponibles: ");
                    for (int p = 0; p < i; p++) {
                        System.out.println(tituloOrientacion[p]);
                    }
                    System.out.println("\nIngrese el elemento que desea eliminar: ");
                    elementoAEliminar = sc.nextLine();

                    boolean eliminado = false;

                    for (int k = 0; k < i; k++) {
                        if (tituloOrientacion[k].equalsIgnoreCase(elementoAEliminar)) {
                            for (int j = k; j < i - 1; j++) {
                                tituloOrientacion[j] = tituloOrientacion[j + 1];
                                tipoOrientacion[j] = tipoOrientacion[j + 1];
                            }
                            tituloOrientacion[i - 1] = null;
                            tipoOrientacion[i - 1] = null;
                            i--;
                            eliminado = true;
                            break;
                        }
                    }

                    if (eliminado) {
                        System.out.println("\nElementos después de la eliminación:");
                        for (int p = 0; p < i; p++) {
                            if (tituloOrientacion[p] != null) {
                                System.out.println(tituloOrientacion[p]);
                            }
                        }
                    } else {
                        System.out.println("¡Elemento " + elementoAEliminar + " no encontrado!");
                    }

                    // ===========================================================================================================

                    // 5 - MOSTRAR
                } else if (menu.equalsIgnoreCase("Mostrar")) {

                    System.out.println("\n════════════════════════════════════════");
                    System.out.println("     📚 ORIENTACIONES REGISTRADAS        ");
                    System.out.println("════════════════════════════════════════");

                    for (int d = 0; d < i; d++) {
                        if (tituloOrientacion[d] != null) {
                            System.out.println("\n🔖 Título de la Orientación: " + tituloOrientacion[d]);
                        } else {
                            System.out.println("\n🔖 Título de la Orientación: [No disponible]");
                        }

                        if (tipoOrientacion[d] != null) {
                            System.out.println("📂 Tipo de Orientación: " + tipoOrientacion[d]);

                            switch (tipoOrientacion[d].toLowerCase()) {
                                case "manual de operación":
                                    System.out.println(
                                            "📝 Descripción: Instrucciones detalladas sobre el uso correcto y eficiente de los equipos.");
                                    System.out.println(
                                            "📌 Ejemplos: Manual de operación de motores, transformadores, generadores, etc.");
                                    break;
                                case "procedimiento de seguridad":
                                    System.out.println(
                                            "🛡️ Descripción: Procedimientos detallados para garantizar la seguridad durante la operación de equipos e instalaciones eléctricas.");
                                    System.out.println(
                                            "📌 Ejemplos: Procedimientos de seguridad para instalaciones eléctricas, riesgo de descarga eléctrica, etc.");
                                    break;
                                case "mantenimiento y reparaciones":
                                    System.out.println(
                                            "🔧 Descripción: Instrucciones para el mantenimiento y reparación de equipos, sistemas y dispositivos.");
                                    System.out.println(
                                            "📌 Ejemplos: Mantenimiento de motores eléctricos, generadores de energía, etc.");
                                    break;
                                case "pruebas y diagnósticos":
                                    System.out.println(
                                            "🧪 Descripción: Procedimientos para probar y diagnosticar problemas en equipos y sistemas.");
                                    System.out.println(
                                            "📌 Ejemplos: Pruebas de diagnóstico de transformadores, automatización, etc.");
                                    break;
                                case "manual de conducta y operaciones del sector":
                                    System.out.println(
                                            "📘 Descripción: Normas y directrices para la conducta dentro de sectores específicos y sus operaciones.");
                                    System.out.println("📌 Ejemplos: Manual de conducta en el sector de montaje, etc.");
                                    break;
                                default:
                                    System.out.println("❓ Descripción: Descripción no disponible.");
                            }

                        } else {
                            System.out.println("📂 Tipo de Orientación: [No disponible]");
                            System.out.println("❓ Descripción: Descripción no disponible.");
                        }

                        System.out.println("\n----------------------------------------");
                    }

                    // ===========================================================================================================
                    // ===========================================================================================================

                    // 6 - SALIR
                } else if (menu.equalsIgnoreCase("Salir")) {
                    break;
                }

            } while (!menu.equalsIgnoreCase("Salir"));

            // =============================================================

            // SYSTÈME EN FRANÇAIS:

        } else if (idioma.equalsIgnoreCase("frances")) {

            // VARIABLES
            String nomOrientation;
            String mettreAJourOrientation;

            // TABLEAUX
            String titreOrientation[] = new String[11];
            String typeOrientation[] = new String[11];

            // ...

            // 10 ORIENTATIONS ENREGISTRÉES
            titreOrientation[0] = "Manuel d'opération des moteurs";
            typeOrientation[0] = "Manuel d'opération";

            titreOrientation[1] = "Procédure de sécurité pour les installations électriques";
            typeOrientation[1] = "Procédure de sécurité";

            titreOrientation[2] = "Maintenance des moteurs électriques";
            typeOrientation[2] = "Maintenance et réparations";

            titreOrientation[3] = "Test de diagnostic des transformateurs";
            typeOrientation[3] = "Tests et diagnostics";

            titreOrientation[4] = "Manuel de conduite pour le secteur de montage";
            typeOrientation[4] = "Manuel de conduite et opérations du secteur";

            titreOrientation[5] = "Procédure de sécurité en cas de risque de choc électrique";
            typeOrientation[5] = "Procédure de sécurité";

            titreOrientation[6] = "Maintenance des générateurs électriques";
            typeOrientation[6] = "Maintenance et réparations";

            titreOrientation[7] = "Test de fonctionnement des équipements d'automatisation";
            typeOrientation[7] = "Tests et diagnostics";

            titreOrientation[8] = "Manuel d'opération des équipements de soudage";
            typeOrientation[8] = "Manuel d'opération";

            titreOrientation[9] = "Procédure de sécurité pour le secteur de montage";
            typeOrientation[9] = "Procédure de sécurité";

            // ===========================================================================================================

            // BOUCLE DO-WHILE
            do {
                System.out.println("\n╔═══════════════════════════════ ");
                System.out.println("║            📋 MENU             ");
                System.out.println("╠═══════════════════════════════ ");
                System.out.println("║  1 - 📝 Enregistrer            ");
                System.out.println("║  2 - 🔍 Rechercher             ");
                System.out.println("║  3 - ✏️  Modifier              ");
                System.out.println("║  4 - ❌ Supprimer              ");
                System.out.println("║  5 - 📊 Afficher               ");
                System.out.println("║  6 - 🚪 Quitter                ");
                System.out.println("╚═══════════════════════════════ ");
                System.out.print("Sélectionnez une option: ");
                menu = sc.next();
                sc.nextLine();

                // ===========================================================================================================

                // 1 ENREGISTRER
                if (menu.equalsIgnoreCase("Enregistrer")) {
                    if (i >= titreOrientation.length) {
                        String[] nouveauTitre = new String[titreOrientation.length + 1];
                        String[] nouveauType = new String[typeOrientation.length + 1];

                        for (int j = 0; j < titreOrientation.length; j++) {
                            nouveauTitre[j] = titreOrientation[j];
                            nouveauType[j] = typeOrientation[j];
                        }

                        titreOrientation = nouveauTitre;
                        typeOrientation = nouveauType;
                    }

                    System.out.println("\n\nEntrez le titre de l'orientation: ");
                    titreOrientation[i] = sc.nextLine();
                    System.out.println(
                            "\nEntrez le type d'orientation: [\"Manuel d'opération\", \"Procédure de sécurité\", \"Maintenance et réparations\", \"Tests et diagnostics\" ou \"Manuel de comportement et d'opérations sectorielles\"]:");
                    typeOrientation[i] = sc.nextLine();
                    i++;

                    // ===========================================================================================================

                    // 2 RECHERCHER
                } else if (menu.equalsIgnoreCase("Rechercher")) {
                    System.out.println("\nRechercher par titre d'orientation: ");
                    nomOrientation = sc.nextLine();

                    boolean trouve = false;

                    for (int j = 0; j < i; j++) {
                        if (nomOrientation.equalsIgnoreCase(titreOrientation[j])) {
                            System.out.println("\nL'orientation sélectionnée est: " + titreOrientation[j]
                                    + " et elle est disponible!");
                            trouve = true;
                            break;
                        }
                    }

                    if (!trouve) {
                        System.out.println("\nCette orientation n'est pas disponible!");
                    }

                    // ===========================================================================================================

                    // 3 MODIFIER
                } else if (menu.equalsIgnoreCase("Modifier")) {
                    System.out.println("\nEntrez le type d'orientation que vous souhaitez modifier: ");
                    mettreAJourOrientation = sc.nextLine();

                    for (int h = 0; h < i; h++) {
                        if (mettreAJourOrientation.equalsIgnoreCase(typeOrientation[h])) {
                            System.out.println("\n\nOrientation sélectionnée: " + typeOrientation[h]
                                    + "\n\nEntrez le nouveau contenu: ");
                            mettreAJourOrientation = sc.nextLine();
                            typeOrientation[h] = mettreAJourOrientation;
                        }
                    }

                    // ===========================================================================================================

                    // 4 SUPPRIMER
                } else if (menu.equalsIgnoreCase("Supprimer")) {
                    String elementASupprimer;

                    System.out.println("\n\nÉléments disponibles: ");
                    for (int p = 0; p < i; p++) {
                        System.out.println(titreOrientation[p]);
                    }
                    System.out.println("\nEntrez l'élément que vous souhaitez supprimer: ");
                    elementASupprimer = sc.nextLine();

                    boolean supprime = false;

                    for (int k = 0; k < i; k++) {
                        if (titreOrientation[k].equalsIgnoreCase(elementASupprimer)) {
                            for (int j = k; j < i - 1; j++) {
                                titreOrientation[j] = titreOrientation[j + 1];
                                typeOrientation[j] = typeOrientation[j + 1];
                            }
                            titreOrientation[i - 1] = null;
                            typeOrientation[i - 1] = null;
                            i--;
                            supprime = true;
                            break;
                        }
                    }

                    if (supprime) {
                        System.out.println("\nÉléments après la suppression:");
                        for (int p = 0; p < i; p++) {
                            if (titreOrientation[p] != null) {
                                System.out.println(titreOrientation[p]);
                            }
                        }
                    } else {
                        System.out.println("L'élément " + elementASupprimer + " n'a pas été trouvé!");
                    }

                    // ===========================================================================================================

                    // 5 AFFICHER
                } else if (menu.equalsIgnoreCase("Afficher")) {
                    System.out.println("\n\nAffichage des orientations enregistrées:\n");

                    for (int d = 0; d < i; d++) {
                        System.out.println("Titre de l'orientation: " + titreOrientation[d]);
                        System.out.println("Type d'orientation: " + typeOrientation[d]);

                        if (typeOrientation[d].equalsIgnoreCase("Manuel d'opération")) {
                            System.out.println(
                                    "Description: Instructions détaillées pour l'utilisation correcte et efficace des équipements.");
                            System.out.println(
                                    "Exemples: Manuel d'opération pour moteurs, transformateurs, générateurs, etc.");
                        } else if (typeOrientation[d].equalsIgnoreCase("Procédure de sécurité")) {
                            System.out.println(
                                    "Description: Procédures détaillées pour garantir la sécurité lors de l'utilisation des équipements et des installations électriques.");
                            System.out.println(
                                    "Exemples: Procédures de sécurité pour installations électriques, risques de choc électrique, etc.");
                        } else if (typeOrientation[d].equalsIgnoreCase("Maintenance et réparations")) {
                            System.out.println(
                                    "Description: Directives pour la maintenance et la réparation des équipements, systèmes et dispositifs.");
                            System.out.println("Exemples: Maintenance des moteurs électriques, générateurs, etc.");
                        } else if (typeOrientation[d].equalsIgnoreCase("Tests et diagnostics")) {
                            System.out.println(
                                    "Description: Procédures pour tester et diagnostiquer les équipements et systèmes.");
                            System.out.println(
                                    "Exemples: Tests de diagnostic pour transformateurs, automatisation, etc.");
                        } else if (typeOrientation[d]
                                .equalsIgnoreCase("Manuel de comportement et d'opérations sectorielles")) {
                            System.out.println(
                                    "Description: Normes et directives pour le comportement dans des secteurs spécifiques et leurs processus.");
                            System.out
                                    .println("Exemples: Manuel de comportement pour le secteur de l'assemblage, etc.");
                        } else {
                            System.out.println("Description: Non disponible.");
                        }

                        System.out.println("----------------------------------------");
                    }

                    // ===========================================================================================================

                    // 6 QUITTER
                } else if (menu.equalsIgnoreCase("Quitter")) {
                    break;
                }

            } while (!menu.equalsIgnoreCase("Quitter"));

        }

    }
}
