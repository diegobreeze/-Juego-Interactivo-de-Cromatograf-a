import java.util.Scanner;
import java.util.Random;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String MAGENTA = "\033[0;35m";

    public static void Menu() {
        LimpiarConsola();
        int opcion = 0;

        System.out.println(MAGENTA + "                    _");
        System.out.println("                   _(_)_                          wWWWw   _");
        System.out.println("            @@@@       (_)@(_)   vVVVv     _     @@@@  (___) _(_)_");
        System.out.println("            @@()@@ wWWWw  (_)\\    (___)   _(_)_  @@()@@   Y  (_)@(_)");
        System.out.println("            @@@@  (___)     `|/    Y    (_)@(_)  @@@@   \\|/   (_)\\");
        System.out.println("            /      Y       \\|    \\|/    /(_)    \\|      |/      |");
        System.out.println("            \\|    \\|/      | / \\| / \\|/      |/   \\|     \\|    /");
        System.out.println("           \\\\|//   \\\\|///  \\|//\\\\|///  \\\\|///  \\\\|//  \\\\|//  \\\\|// " + ANSI_CYAN);
        System.out.println("            ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
        System.out.println("~ 1.- Jugar al Ahorcado.\n~ 2.- Creditos del programa.\n~ 3.- Reglas del juego.\n~ 4.- Creditos del curso.\n~ 5.- Definiciones.\n~ 6.- Salir del programa.\n");
        System.out.print("~ Ingrese una opcion: "); opcion = sc.nextInt();

        switch(opcion) {
            case 1: {
                Ahorcado();
            }
            case 2: {
                creditos();
            }
            case 3: {
                reglas();
            }
            case 4: {
                prof();
            }
            case 5: {
                definiciones();
            }
            case 6: {
                LimpiarConsola();
                System.out.println("~ ¡Gracias por haber utilizado el programa :)!");
                System.exit(0);
            }
        }
    }

    public static void definiciones() {
        LimpiarConsola();
        System.out.println(ANSI_PURPLE + "        ,_     _");
        System.out.println("          |\\_,-~/");
        System.out.println("         / _  _ |  ,--.");
        System.out.println("        (  @  @ )   / ,-'");
        System.out.println("         \\  _T_/-._( (");
        System.out.println("         /         `. \\");
        System.out.println("        |         _  \\ |");
        System.out.println("        \\ \\ ,  /      |");
        System.out.println("         || |-_\\__   /");
        System.out.println("        ((_/`(____,-'\n");
        System.out.println(ANSI_RED + "~ DEFINICIONES: \n" + ANSI_CYAN);
        System.out.println("~ Bromatologia: Es el acto por el cual una oficina de la intendencia competente le adjudica a una empresa o a un alimento, una vez habilitados, un número único de validez nacional.\n");
        System.out.println("~ Betacaroteno: Es un colorante natural, también  pertenece a un grupo de pigmentos de color llamados carotenoides. Se convierte en vitamina A en el cuerpo y se encuentra en muchas frutas y verduras. El pigmento del betacaroteno suelen ser rojos, naranjas y amarillos.\n");
        System.out.println("~ Rojo ponceau: Es un colorante artificial, también de color rojo. Suele emplearse en la coloración de una gran variedad de productos alimentarios. Además este colorante posee aplicaciones también en el mundo de la cosmética.\n");
        System.out.println("~ Placa cromatografica: Es una técnica cromatográfica que utiliza una placa inmersa verticalmente en una fase móvil (eluyente). Esta placa cromatográfica consiste en una fase estacionaria polar (comúnmente se utiliza sílica gel) adherida a una superficie sólida.​ La fase estacionaria es una capa uniforme de un absorbente mantenido sobre una placa, la cual puede ser de vidrio, aluminio u otro soporte.\n");
        System.out.println("~ Curcuma: El cúrcuma es un colorante natural de color amarillo intenso,proviene de la raíz de la planta cúrcuma en forma de polvo,se usa como colorante para guisos,currys,helados,salsas,etc. Es muy usado en Países orientales\n");
        System.out.println("~ Colorantes: Sustancia que, añadida a ciertos alimentos,sirve para dar color o teñirlos.\n");
        System.out.println("~ Colorantes artificiales: Compuestos químicos no identificados en productos de origen vegetal. Ejemplo: tartrazina (E-102), amarillo anaranjado S (E-110), azorrubina, carmoisina, (E-122), amaranto (E-123).\n");
        System.out.println("~ Azul patentado: Es un colorante alimentario, es de origen azoico sintético, muy saludable que se utiliza en el agua de color verdoso\n");
        System.out.println("~ Azul brillante: El colorante azul brillante FCF es un colorante pertenecientes al grupo de los colorantes azoico, se obtiene derivado del petróleo.Se emplea en la tinción de helados y en repostería.\n");
        System.out.println("~ Rojo allura: El Rojo allura es un colorante sintético de color rojo que se trata de un compuesto azoderivado. Es una sal disódica que se presenta en forma de polvo rojizo oscuro muy soluble en agua\n");
        System.out.println("~ Siembra: Acción o actividad de sembrar algo en un terreno preparado para ello.\n");
        System.out.println("~ Analisis quimico: El análisis químico estudia los componentes de una muestra de un producto separando, identificando y determinando las cantidades de cada uno.\n");
        System.out.println("~ Cromatografia: La cromatografía describe un procedimiento químico en el que se separa una mezcla en su sus componentes individuales mediante una fase móvil y una fase estacionaria. La fase estacionaria consta, según el procedimiento, de materia sólida o un líquido, y la fase móvil de un líquido o gas.\n");
        System.out.println("~ Muestra: Parte o cantidad pequeña de una cosa que se considera representativa del total y que se toma o se separa de ella con ciertos métodos para someterla a estudio, análisis o experimentación.\n");
        System.out.println("~ Capilar: Tubo cuyo diámetro interior tiene un grosor semejante al de un cabello\n" + ANSI_RED);
        go_to();
    }

    public static void reglas() {
        LimpiarConsola();
        System.out.println(ANSI_RED + "\n|-|-|-|- REGLAS DEL JUEGO |-|-|-|-");
        System.out.println(ANSI_CYAN +
                """
                        \nTurno:
                        - Muñeco: El mu\u00f1eco se dibuja en 5 partes (cabeza, tronco y extremidades), por lo que el adivinador tiene 5 posibilidades de fallar.
                        - Adivinar la Palabra: El jugador puede intentar adivinar la palabra o frase secreta.
                        -- Si acierta la palabra, entonces el programa completa la solución en la consola.
                        -- Si no acierta la palabra, entonces el programa dibujará una parte del muñeco.

                        Fin de la partida:
                        - GANA el adivinador si descubre la palabra o frase secreta.
                        - PIERDE el avidinador si se dibuja el muñeco completo en la horca.
                            \n""" + ANSI_RED);
        go_to();
    }

    public static void prof() {
        LimpiarConsola();
        System.out.println(ANSI_RED + "\n~ Curso: 1° QUIMICA CTS - Informatica.\n~ Profesora:" + ANSI_CYAN + " Natalia Montenegro." + ANSI_RED + " \n~ Exposicion: Cromatografia.\n" + ANSI_CYAN);
        go_to();
    }

    public static void creditos() {
        LimpiarConsola();
        System.out.println(ANSI_YELLOW + "        .--.");
        System.out.println("|__| .-------.");
        System.out.println("|=.| |.-----.|");
        System.out.println("|--| || KCK ||");
        System.out.println("|  | |'-----'|");
        System.out.println("|__|~')_____('\n" + ANSI_RED);
        System.out.println("~ Programa hecho por Diego Breeze y Guillermo Rodriguez." + ANSI_CYAN);
        go_to();
    }

    public static void error() {
        System.out.println(MAGENTA + "\n^         _______________");
        System.out.println("\\     /                 \\    _/\"");
        System.out.println("\\ /                     \\/  (o\"");
        System.out.println("|                              \\___");
        System.out.println("|                                  (");
        System.out.println("|                            ______(");
        System.out.println("|                            \\_");
        System.out.println("\\                     /\\______/");
        System.out.println("\\__             __/");
        System.out.println("| \\___________/  |");
        System.out.println("|    |      |    |");
        System.out.println("|/\\/\\|      |/\\/\\|\n" + ANSI_RED);        
        System.out.println(ANSI_CYAN + "~ LA LETRA ES INCORRECTA!\n" + ANSI_RED);
    }

    public static void acertaste() {
        System.out.println("\n" + ANSI_PURPLE + "         /\\___/\\");
        System.out.println("        /       \\");
        System.out.println("       l  u   u  l");
        System.out.println("     --l----*----l--");
        System.out.println("        \\   w   /     - Meow!");
        System.out.println("          ======");
        System.out.println("        /       \\ __");
        System.out.println("        l        l\\ \\");
        System.out.println("        l        l/ /");
        System.out.println("        l  l l   l /");
        System.out.println("        \\ ml lm /_/" + ANSI_RED + "\n");
    }

    public static void ganaste() {
        LimpiarConsola();
        System.out.println(ANSI_YELLOW + "         /^--^\\     /^--^\\     /^--^\\");
        System.out.println("         \\____/     \\____/     \\____/");
        System.out.println("        /      \\   /      \\   /      \\");
        System.out.println("       |        | |        | |        |");
        System.out.println("        \\__  __/   \\__  __/   \\__  __/");
        System.out.println("^|^|^|^|^|^\\ \\^|^|^|^ \\ \\^|^|^|^| \\ \\^|^|^|^|^|^|^|^|^|^|^|^|^|^|^");
        System.out.println("| | | | | | \\ \\| | |   \\ \\| | | |  \\ \\ | | | | | | | | | | | | |  |");
        System.out.println("############ \\ \\###/    \\ \\#/ /###  \\ \\ ###########################");
        System.out.println("| | | |       \\/\\//  / | \\/\\| | |/   \\/\\ | | | | | | | | | | | |  |");
        System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|\n" + ANSI_CYAN);
        System.out.println("~ GANASTE EL JUEGO!");
    }

    public static void Ahorcado() {
        int opcion, n, pos = 0, intentos = 0;
       
        String palabras[] = new String[16];

        palabras[0] = "bromatologia";
        palabras[1] = "betacaroteno";
        palabras[2] = "rojo ponceau";
        palabras[3] = "placa_cromatografica";
        palabras[4] = "curcuma";
        palabras[5] = "colorantes";
        palabras[6] = "colorantes_artificiales";
        palabras[7] = "azul_patentado";
        palabras[8] = "azul_brillante";
        palabras[9] = "rojo_allura";
        palabras[10] = "siembra";
        palabras[12] = "analisis_quimico";
        palabras[13] = "cromatografia";
        palabras[14] = "muestra";
        palabras[15] = "capilar";

        LimpiarConsola();

        System.out.println(ANSI_RED + "\n|-|-|-|- ¡BIENVENIDO AL JUEGO! |-|-|-|-\n¡Recuerda leer las reglas!\n");
        System.out.println(ANSI_CYAN + "~ Para realizar un espacio utilizar el caracter: _ (Shift + guion)");
        System.out.println(ANSI_CYAN + "~ Palabras: bromatologia, betacaroteno, rojo ponceau, placa cromatografica, curcuma, colorantes, colorantes artificiales, azul patentado, azul brillante, rojo allura, siembra, analisis quimico, cromatografia, muestra, capilar" + ANSI_RED);

        int elemento_random = r.nextInt(palabras.length);

        char[] aciertos = new char[palabras[elemento_random].length()];
        boolean letra_encontrada;
        int relleno_letras = 0;
    
        while (true) {
            letra_encontrada = false;                
            StringBuilder letra = new StringBuilder();
            System.out.print("\nPALABRA A ADIVINAR: ");

            for (int i = 0; i < aciertos.length; i++) {
                if (aciertos[i] != 0x00) {
                    letra.append(aciertos[i]);
                } else {
                    letra.append("_");
                }
            }


            System.out.println(letra);

            System.out.print("~ Ingrese una letra: ");
            char letra_ingresada = sc.next().toLowerCase().charAt(0);

            for (int t = 0; t < palabras[elemento_random].length(); t++) {

                if (aciertos[t] != 0x00) {
                    continue;
                }

                if (palabras[elemento_random].charAt(t) == letra_ingresada) {
                    aciertos[t] = palabras[elemento_random].charAt(t);
                    letra_encontrada = true; 
                    relleno_letras++;
                    break;
                }
            }

            if (relleno_letras == aciertos.length) {
                ganaste();
                System.out.println("\n~ La palabra era: " + palabras[elemento_random]);
                go_to();
                break;
            }

            if (letra_encontrada == true) {
                acertaste();
                System.out.println(ANSI_CYAN + "~ Has encontrado una letra." + ANSI_RED);
            } else {
                intentos++;
                if (intentos == 1) {
                    error();
                } else if (intentos == 2) {
                    error();
                } else if (intentos == 3) {
                    error();
                } else if (intentos == 4) {
                    error();
                } else if (intentos == 5) {
                    error();
                    System.out.println("~ La palabra era: " + palabras[elemento_random]);
                    go_to();
                }
                System.out.println("~ INTENTOS: " + intentos);
            }
        }
    }

    public static void go_to() {
        char volver;

        System.out.print("~ ¿Deseas volver al menu principal?: (S/N): ");
        volver = sc.next().toLowerCase().charAt(0);

        if (volver == 's') {
            Menu();
        } else if (volver == 'n') {
            System.exit(0);
        } else {
            System.out.println("~ Error, has introducido mal una opcion.");
            go_to();
        }
    }

    public static void LimpiarConsola() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Menu();
    }
}