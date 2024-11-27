/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Muhammet Canlı
 */
public class SaveableDictionary {

    private Map<String, String> dict;
    private String file;

    public SaveableDictionary() {
        this.dict = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {

        try {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> {
                        this.dict.put(parts[0], parts[1]);
                        this.dict.put(parts[1], parts[0]);
                    });
            return true;
        } catch (IOException ex) {

            return false;
        }
    }

    public boolean save() {
        try {

            PrintWriter writer = new PrintWriter(new File(file));

            saveWords(writer);

            writer.close();

        } catch (Exception e) {

            return false;

        }

        return true;
    }
     private void saveWords(PrintWriter writer) throws IOException {

        List<String> allreadySaved = new ArrayList<>();

        dict.keySet().stream().forEach(word -> {

            if (allreadySaved.contains(word)) {

                return;

            }

 

            String pari = word + ":" + dict.get(word);

            writer.println(pari);

 

            allreadySaved.add(word);

            allreadySaved.add(dict.get(word));

        });

    }

    public void add(String words, String translation) {
        if (dict.containsKey(words)) {
            return;
        }

        dict.put(words, translation);

        dict.put(translation, words);

    }

    public String translate(String word) {

        return dict.get(word);
    }

    public void delete(String word) {

        dict.remove(dict.get(word));
        dict.remove(word);

    }

}
