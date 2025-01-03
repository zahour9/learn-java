import java.util.*;

public class words {
    public static List<String> wordsMethod(String phrase) {
        List<String> words = Arrays.asList(phrase.split("[^a-zA-Z]+"));
        List<String> output = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        if(phrase == ""){
            output.add("");      
        }
        else {
        for(int i = 0; i < words.size(); i++) {
            if(map.get(words.get(i)) == null) {
                map.put(words.get(i), 1 );
            }
            else {
            map.put(words.get(i), map.get(words.get(i)) + 1); 
            }
        }  
        for(String word : map.keySet()) {
            output.add(word + " x " + map.get(word));
        }        
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println("There is " + wordsMethod("J'ai un chat et un chien.").size() + " words in the sentence.");
        System.out.println(wordsMethod("J'ai un chat et un chien."));
    }
    
}
