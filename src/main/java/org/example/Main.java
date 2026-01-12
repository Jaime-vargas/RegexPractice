package org.example;

import AdvancedDifficult.AdvancedExercises;
import MediumDifficult.MediumExercises;
import java.util.ArrayList;
import java.util.List;

// REGEX EXERCISES
// These exercises are for practice my skills with REGEX
// I ask ChatGPT 10 exercises in medium difficult and 10 in advanced difficult
// I resolve the whole exercises by myself.
/*
*   Dificultad MEDIA (10)
*   1- Extraer todos los números de un texto y guardarlos en un List<Integer>.
*   2- Validar si una contraseña tiene mínimo 8 caracteres, una mayúscula y un número.
*   3- Contar cuántas palabras empiezan con mayúscula en un texto.
*   4- Extraer todas las fechas con formato dd/mm/yyyy.
*   5- Reemplazar todas las vocales por *.
*   6- Dividir un texto en palabras ignorando múltiples espacios.
*   7- Validar una matrícula tipo ABC-123.
*   8- Eliminar todos los caracteres especiales excepto espacios.
*   9- Extraer los dominios de una lista de correos.
*   10- Contar cuántas veces aparece una palabra sin importar mayúsculas.
*
*   Dificultad AVANZADA (10)
*   1- Validar una contraseña fuerte (mayúscula, minúscula, número, símbolo).
*   2- Extraer etiquetas HTML sin capturar el contenido.
*   3- Detectar números decimales positivos y negativos.
*   4- Reemplazar palabras prohibidas por *** sin afectar otras (mal, malo).
*   5- Validar direcciones IPv4.
*   6- Extraer valores entre comillas dobles.
*   7- Validar un JSON simple usando regex.
*   8- Detectar palabras duplicadas consecutivas.
*   9- Normalizar texto (acentos, espacios, mayúsculas).
*   10- Extraer funciones y sus parámetros de código Java.
*/

public class Main {
    static void main() {

        System.out.println("\nEJERCICIOS DIFICULTAD MEDIA\n");
        // --- MEDIUM DIFFICULT ---
        MediumExercises.Exercise01(MediumTexts(1));
        MediumExercises.Exercise02(MediumTexts(2));
        MediumExercises.Exercise03(MediumTexts(3));
        MediumExercises.Exercise04(MediumTexts(4));
        MediumExercises.Exercise05(MediumTexts(5));
        MediumExercises.Exercise06(MediumTexts(6));
        MediumExercises.Exercise07(MediumTexts(7));
        MediumExercises.Exercise08(MediumTexts(8));
        MediumExercises.Exercise09(MediumTexts(9));
        MediumExercises.Exercise10(MediumTexts(10));

        System.out.println("\nEJERCICIOS DIFICULTAD AVANZADA\n");
        // --- ADVANCED DIFFICULT ---
        AdvancedExercises.Exercise01(AdvancedTexts(1));
        AdvancedExercises.Exercise02(AdvancedTexts(2));
        AdvancedExercises.Exercise03(AdvancedTexts(3));
        AdvancedExercises.Exercise04(AdvancedTexts(4));
        AdvancedExercises.Exercise05(AdvancedTexts(5));
        AdvancedExercises.Exercise06(AdvancedTexts(6));
        AdvancedExercises.Exercise07(AdvancedTexts(7));
        AdvancedExercises.Exercise08(AdvancedTexts(8));
        AdvancedExercises.Exercise09(AdvancedTexts(9));
        AdvancedExercises.Exercise10(AdvancedTexts(10));
    }

    // STRINGS TO BE EVALUATED ON EACH EXERCISE
    // --- MEDIUM ---
    public static String MediumTexts (int exerciseNumber){
        List<String> lista = new ArrayList<String>();
        // 1-
        lista.add("El pedido 458 fue enviado el 12/03/2024, contiene 3 cajas y 27 artículos.\n" +
                "Referencia interna: X99-AB12, lote 0045.");
        // 2-
        lista.add("Abc12345 abcdef12 ABCDEF12 Abcdefgh Ab1 Password2024 passWORD9");
        // 3-
        lista.add("Juan y Maria viajaron a Madrid con Pedro y luis.\n" +
                "Después visitaron Barcelona y Valencia.");
        // 4-
        lista.add("Las reuniones serán el 01/02/2024 y el 15/11/2023.\n" +
                "La fecha 32/01/2024 es inválida, y 5/5/2023 no cumple formato.");
        // 5-
        lista.add("Programar en Java es entretenido y educativo.\n");
        // 6-
        lista.add("Esto    es   un     texto      con   muchos espacios");
        // 7-
        lista.add("ABC-123 abc-123 ABCD-123 AB-123 ABC-12 XYZ-999 JVC-193 ABC-12D");
        // 8-
        lista.add("Hola! Este texto tiene @símbolos #raros$ y %signos& extraños.");
        // 9-
        lista.add("Contactos: juan.perez@gmail.com soporte@empresa.com.mx admin@localhost ventas@mi-empresa.org contacto@mi_empresa.com");
        // 10-
        lista.add("Java es un lenguaje. JAVA se usa en backend.\n" +
                "Muchos desarrolladores aman java porque Java es potente.");

        if ( exerciseNumber < 0 || exerciseNumber > lista.size()) {
            return "";
        }
        return lista.get(exerciseNumber -1);
    }

    // --- ADVANCED ---
    public static String AdvancedTexts (int exerciseNumber){
        List<String> lista = new ArrayList<String>();
        // 1-
        lista.add("Abc123!@ abc123!@ ABC123!@ Abcdefgh Abc12345 A1!bcdef StrongP@ss1 1234Ab!c Ab!1");
        // 2-
        lista.add("<div class=\"container\">\n" +
                "  <p>Hola <strong>mundo</strong></p>\n" +
                "  <img src=\"logo.png\" />\n" +
                "  <br>\n" +
                "</div>");
        // 3-
        lista.add("Valores registrados: 23 -45 3.14 -0.99 +.5 5. -.75 abc-12.3");
        // 4-
        lista.add("Este texto contiene palabras malas, mal y maldad. Lo malo no siempre es malicioso.");
        // 5-
        lista.add("192.168.0.1\n" +
                "255.255.255.255\n" +
                "0.0.0.0\n" +
                "256.1.1.1\n" +
                "192.168.1\n" +
                "192.168.01.1\n" +
                "123.045.067.089\n" +
                "154.192.254.224");
        // 6-
        lista.add("nombre=\"Juan Perez\" edad=\"30\" ciudad=\"Ciudad de México\"\n" +
                "mensaje=\"Hola \\\"mundo\\\"\" error=\"false\"");
        // 7-
        lista.add("{\"nombre\":\"Juan\",\"edad\":30}\n" +
                "{\"activo\":true,\"score\":99.5}\n" +
                "{\"a\":1,\"b\":{\"c\":2}}\n" +
                "{\"nombre\":\"Juan\",edad:30}\n" +
                "{nombre:\"Juan\"}");
        // 8-
        lista.add("Esto es es un texto con con palabras duplicadas duplicadas. ");
        // 9-
        lista.add(" Árbol    CAMIÓN   piÑata   programación   JAVA");
        // 10-
        lista.add("public void saludar(String nombre, int edad) {\n" +
                "}\n" +
                "\n" +
                "private static int sumar(int a, int b){\n" +
                "}\n" +
                "\n" +
                "void procesar(){\n" +
                "}\n" +
                "\n" +
                "public List<String> filtrar(List<String> datos, boolean activo)");

        if ( exerciseNumber < 1 || exerciseNumber > lista.size()) {
            return "";
        }
        return lista.get(exerciseNumber -1);
    }
}


