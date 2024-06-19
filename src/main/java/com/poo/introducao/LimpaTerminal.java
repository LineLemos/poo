package com.poo.introducao;


        class LimpaTerminal {
            static void limpa_windows() {
                try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } else {
                        System.out.println("Este comando só funciona no Windows.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        
            static void finaliza() {
                System.out.println("\n\n\n\n");
            }
        }
//COLOCAR O ARQUIVO NO GIT
//git add . (Lembrar do ESPAÇO no ponto)
// git commit -m "Nome do projeto top" (NÃO tem espaço no -m)
// git push (Se aparecer "Everything up-to-date" não aconteceu nada)
// git status (Só pra conferir)


