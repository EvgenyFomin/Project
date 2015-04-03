package ru.ifmo.fomin;
import java.io.*;

public class ForUser implements Execute{

    @Override
    public void execute() {
        File forUser = new File("./ForUser.txt");
        try {
            Reader reader = new FileReader(forUser);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String rules = new String();
            while ((rules = bufferedReader.readLine()) != null)
            System.out.println(rules);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
