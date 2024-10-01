public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static boolean czyPierwsza(int liczba) {
        if (liczba < 2) {
            return false;
        }
        int pierwiastek = (int)(Math.sqrt(liczba));
        for (int i = 2; i <= pierwiastek; i++) {
            if (liczba % i == 0)
                return false;
        }
        return true;
    }

    public static String zaszyfruj(String slowo) {
        String zaszyfrowane = "";
        int pierwiastek = (int) (Math.sqrt(slowo.length()));
        if (pierwiastek * pierwiastek < slowo.length()) {
            pierwiastek++;
        }
        while (pierwiastek * pierwiastek < slowo.length()) {
            slowo = slowo + " ";
        }
        for (int i = 0; i < pierwiastek; i++) {
            for (int k = i; k < slowo.length(); k = k + pierwiastek) {
                zaszyfrowane = zaszyfrowane + slowo.charAt(k);
            }
        }

        return zaszyfrowane.trim();
    }
}