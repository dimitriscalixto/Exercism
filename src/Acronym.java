import java.util.Arrays;
import java.util.Locale;

class Acronym {
    private final String phrase;
    public static void main(String[] args) {
     Acronym acron = new Acronym("Complementary metal-oxide semiconductor");
     System.out.println(acron.get());
    }
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] arraySplited = phrase.trim().replace("-", " ").replace("_"," ").split(" ");
        String acronym = "";
        for(int i = 0;i< arraySplited.length;i++){
            if(!arraySplited[i].isEmpty()){
            String ac = Character.toString(arraySplited[i].charAt(0));
            acronym += ac;
            }
        }
        return acronym.toUpperCase();
    }

}
