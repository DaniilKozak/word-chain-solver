package solver;

import java.io.*;
import java.util.*;



public class WordChainSolver {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine().replaceAll("\"", "")))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] data = line.split(" +");
                list.addAll(Arrays.asList(data));
            }
        }
        String[] words = list.toArray(new String[0]);
        StringBuilder result = getLine(words);
        System.out.println(result);
    }

    public static StringBuilder getLine(String... words) {
        if (words == null ||words.length == 0) return new StringBuilder();
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        List<String> path = new ArrayList<>();
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[wordList.size()];
        for (int i = 0; i < wordList.size(); i++) {
            if(buildChain(wordList,i,used,path))result = path;
        }
        return new StringBuilder(String.join(" ",result.toArray(new String[0])));
    }

    public static boolean buildChain(List<String> words, int index, boolean[] used,List<String> path){
        path.add(words.get(index));
        used[index] = true;
        if(words.size() == path.size())return true;

        char lastCurrentLetter = Character.toLowerCase(words.get(index).charAt(words.get(index).length() - 1));
        for (int i = 0; i < words.size(); i++) {
            if(!used[i]){
                char firstCurrentLetter = Character.toLowerCase(words.get(i).charAt(0));
                if(lastCurrentLetter == firstCurrentLetter){
                    if(buildChain(words, i, used, path)){
                        return true;
                    }
                }
            }
        }
        used[index] = false;
        path.remove(path.size()-1);
        return false;
    }


}





