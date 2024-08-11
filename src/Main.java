import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends Sort_merge  {
    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();

        for(int i = 2; i < args.length; i++) {
            try{
                BufferedReader bufferRead = new BufferedReader(new FileReader(args[i]));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
                while (bufferRead.ready()) {
                    if(args[0].equals("-s")) {
                        listString.add((bufferRead.readLine()));
                    }else if(args[0].equals("-i")) {
                        listInt.add(Integer.valueOf((bufferRead.readLine())));
                    }
                }

                if(args[0].equals("-i")) {
                    for (Integer s : mergeSortInt(cr_massive(listInt))) {
                        bufferedWriter.write(s);
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.flush();

                } else if(args[0].equals("-s")) {
                    for (String s : mergeSortString(listString.toArray(new String[0]))) {
                        bufferedWriter.write(s);
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.flush();
                }

            } catch (IOException e) {
                System.out.println("Ошибка ввода!");
            }
        }
    }

}