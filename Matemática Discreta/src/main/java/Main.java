import java.io.File;
import java.util.ArrayList;

public class Main {
    public static boolean repete(String carbon, File file) {
        char[] comparar = carbon.toCharArray();

        if ((comparar[3] != comparar[2]) && (comparar[3] != comparar[1]) && (comparar[3] != comparar[0]) && (comparar[2] != comparar[1]) && (comparar[2] != comparar[0]) && (comparar[1] != comparar[0])) {
            if(comparar[3] % 2 == 0){
                ArrayList<String> aux = new ArrayList<>();
                aux.add(comparar[0] + ", " + comparar[1] + ", " + comparar[2] + ", " + comparar[3]);
                EasyCSV.WriteCSV(aux, file);
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int i, cont = 0;
        File file;
        file = EasyCSV.CreateCSV("oi.csv");

        for (i = 1000; i <= 9999; i++) {
            if (repete(Integer.toString(i), file)) {
                cont++;
            }
        }

        System.out.println("O resultado é " + cont);
    }
}
