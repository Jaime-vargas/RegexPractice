package MediumDifficult;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MediumExercises {

    public static void Exercise01 (String str) {
        System.out.println("1- Extraer todos los números de un texto y guardarlos en un List<Integer>.");
        System.out.println(str);

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        List<Integer> list = new ArrayList<Integer>();
        while (matcher.find()) {
            list.add(Integer.parseInt(matcher.group()));
        }
        System.out.print("Números encontrados: ");
        list.forEach(n -> System.out.print(n+ ", "));
        System.out.println("\n");
    }

    public static void Exercise02 (String str) {
        System.out.println("2- Validar si una contraseña tiene mínimo 8 caracteres, una mayúscula y un número.");
        System.out.println(str);

        String[] passwords = str.split(" ");

        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9]).{8,}");
        System.out.print("Passwords validados: ");
        for (int i = 0; i < passwords.length; i++) {
            Matcher matcher = pattern.matcher(passwords[i]);
            if (matcher.find()) {
                System.out.print(passwords[i] + ", ");
            }
        }
        System.out.println("\n");
    }

    public static void Exercise03 (String str) {
        System.out.println("3- Contar cuántas palabras empiezan con mayúscula en un texto.");
        System.out.println(str);

        Pattern pattern = Pattern.compile("[A-Z]\\p{L}+");
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        System.out.print("Palabras encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
            count++;
        }
        System.out.print("Total: " + count);
        System.out.println("\n");
    }

    public static void Exercise04 (String str) {
        System.out.println(" 4- Extraer todas las fechas con formato dd/mm/yyyy.");
        System.out.println(str);

        System.out.print("Fechas extraídas: ");
        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
        System.out.println("\n");
    }

    public static void Exercise05 (String str) {
        System.out.println(" 5- Reemplazar todas las vocales por *.");
        System.out.print(str);
        System.out.println(str.replaceAll("[aeiou]", "*"));
    }

    public static void Exercise06 (String str) {
        System.out.println(" 6- Dividir un texto en palabras ignorando múltiples espacios.");
        System.out.println(str);
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        System.out.print("Palabras encontradas: String[] words = ["+String.join(", ", words)+"]\n");
        System.out.println(str);
        System.out.println("");
    }

    public static void Exercise07 (String str) {
        System.out.println(" 7- Validar una matrícula tipo ABC-123.");
        System.out.println(str);
        String[] plates = str.split(" ");
        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{3}$");

        System.out.print("Matriculas Validadas: ");
        for(int i = 0; i < plates.length; i++) {
            Matcher matcher = pattern.matcher(plates[i]);
            if(matcher.find()) {
                System.out.print(plates[i] + ", ");
            }
        }
        System.out.println("\n");

    }

    public static void Exercise08 (String str) {
        System.out.println(" 8- Eliminar todos los caracteres especiales excepto espacios.");
        System.out.println(str);
        Pattern pattern = Pattern.compile("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ!¡?¿.,]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println("\n");

    }

    public static void Exercise09 (String str) {
        System.out.println(" 9- Extraer los dominios de una lista de correos.");
        System.out.println(str);

        Pattern pattern = Pattern.compile("@([\\w-]+(\\.[a-z]+)?(\\.[a-z]+)?)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group(1) + ", ");
        }
        System.out.println("\n");
    }

    public static void Exercise10 (String str) {
        System.out.println(" 10- Contar cuántas veces aparece una palabra sin importar mayúsculas.");
        System.out.println(str);

        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        System.out.print("Palabras java entontradas: ");
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
