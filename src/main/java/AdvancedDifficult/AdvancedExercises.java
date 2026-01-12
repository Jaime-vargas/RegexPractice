package AdvancedDifficult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdvancedExercises {

    public static void Exercise01 (String str) {
        System.out.println("1- Validar una contraseña fuerte (mayúscula, minúscula, número, símbolo).");
        System.out.println(str);

        String[] passwords = str.split(" ");
        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W).{8,}");
        System.out.print("Password validadas: ");
        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                System.out.print( password + ", ");
            }
        }
        System.out.println("\n");
    }

    public static void Exercise02 (String str) {
        System.out.println("2- Extraer etiquetas HTML sin capturar el contenido.");
        System.out.println(str);

        Pattern pattern = Pattern.compile("(</?[\\w]+).*?(/?>)");
        Matcher matcher = pattern.matcher(str);

        System.out.print("Etiquetas capturadas HTML: ");
        while (matcher.find()) {
            System.out.print(matcher.group(1) + matcher.group(2) + ", ");
        }
        System.out.println("\n");
    }

    public static void Exercise03 (String str) {
        System.out.println("3- Detectar números decimales positivos y negativos.");
        System.out.println(str);

        Pattern pattern = Pattern.compile("-?\\.?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
        System.out.println("\n");
    }

    public static void Exercise04 (String str) {
        System.out.println("4- Reemplazar palabras prohibidas por *** sin afectar otras. (mal, malo)");
        System.out.println(str);

        str = str.replaceAll("malo?\\b", "***");
        System.out.println(str);
        System.out.println();
    }

    public static void Exercise05 (String str) {
        System.out.println("5- Validar direcciones IPv4. (no debe tener 0 a la izquierda ni ser 0 primer valor)");
        System.out.println(str);

        Pattern pattern = Pattern.compile("^([1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(str);
        System.out.print("IPv4 valida: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
        System.out.println("\n");
    }

    public static void Exercise06 (String str) {
        System.out.println("6- Extraer valores entre comillas dobles.");
        System.out.println(str);

        Pattern pattern = Pattern.compile("=\"((?:\\\\.|[^\"])*)\"");
        Matcher matcher = pattern.matcher(str);
        System.out.print("Valores entre comillas dobles. : ");
        while (matcher.find()) {
            System.out.print(matcher.group(1) + ", ");
        }
        System.out.println("\n");
    }

    public static void Exercise07 (String str) {
        System.out.println("7- Validar un JSON simple usando regex.");
        System.out.println(str);
        String [] jsonArray = str.split("\\n");
        List<String> jsonArraygroups = new ArrayList<>();

        Pattern pattern = Pattern.compile("(^\\{(\"[a-zA-Z]+\":(\"[a-zA-Z]+\"|\\d+(\\.\\d)?|true|false|(\\{.*})),?)+}$)");

        System.out.println("mi patron valida el Json al nivel 1, otros niveles se capturan en un grupo pero no se validan");
        System.out.print("JSON valido: ");
        for (int i = 0; i <= jsonArray.length - 1; i++) {
            Matcher matcher = pattern.matcher(jsonArray[i]);
            if (matcher.find()) {
                System.out.print(matcher.group() + ", ");
                if(matcher.group(5) != null) {
                    jsonArraygroups.add(matcher.group(5));
                }
            }
        }
        System.out.print("Grupos capturados: ");
        jsonArraygroups.forEach(System.out::println);
        System.out.println();

    }

    public static void Exercise08 (String str) {
        System.out.println("8- Detectar palabras duplicadas consecutivas.");
        System.out.println(str);

        Pattern pattern = Pattern.compile("(\\w+)\\s\\1");
        Matcher matcher = pattern.matcher(str);

        System.out.print("Palabras consecutivas: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
        System.out.println("\n");
    }

    public static void Exercise09 (String str) {
        System.out.println("9- Normalizar texto (acentos, espacios, mayúsculas).");
        System.out.println(str);
        // Quitar espacios iniciales.
        str = str.replaceAll("^\\s", "");
        str = str.replaceAll("\\s+", " ").toLowerCase();
        System.out.println(str);
        String[] words = str.split(" ");
        System.out.println("número de palabras: " + words.length);
        Arrays.stream(words).forEach(System.out::println);
        System.out.println();
    }
    public static void Exercise10 (String str) {
        System.out.println("10- Extraer funciones y sus parámetros de código Java.");
        System.out.println(str);
        Pattern pattern = Pattern.compile("(\\w+\\s)?(\\w+\\s)?([A-Za-z<>]+)\\s(\\w+)\\((.*)\\)");
        Matcher matcher = pattern.matcher(str);
        System.out.println("\nFunciones encontradas:");
        while (matcher.find()) {
            String [] parametros = matcher.group(5).split(",");
            int parametrosEncontrados = parametros.length;
            if(matcher.group(5).isBlank() || matcher.group(5).isEmpty()) parametrosEncontrados = 0;
            System.out.println("Funcion: " + matcher.group(4) + " - parametros encontrados: " + parametrosEncontrados + " " + matcher.group(5) );
        }
        System.out.println();
    }
}
