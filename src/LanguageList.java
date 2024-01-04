import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    public static void main(String[] args) {
        LanguageList lista = new LanguageList();
        lista.languages.add("Java");
        lista.languages.add("Kotlin");
        lista.languages.remove("Kotlin");
        System.out.println(lista.isExciting());
    }
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
            return languages.isEmpty();


    }

    public void addLanguage(String language) {
        throw new UnsupportedOperationException("Please implement the addLanguage() method");
    }

    public void removeLanguage(String language) {
        throw new UnsupportedOperationException("Please implement the removeLanguage() method");
    }

    public String firstLanguage() {
        throw new UnsupportedOperationException("Please implement the firstLanguage() method");
    }

    public int count() {
        throw new UnsupportedOperationException("Please implement the count() method");
    }

    public boolean containsLanguage(String language) {
        throw new UnsupportedOperationException("Please implement the containsLanguage() method");
    }

    public boolean isExciting() {
        return languages.contains("Java") && languages.contains("Kotlin");
    }
}
