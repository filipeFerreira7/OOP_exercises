package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Box> lista = new ArrayList<>();
        //generic
        Box<String> boxText = new Box<>();
        boxText.setContent("Saving text in my box");
        //generic
        Box<Integer> boxAge = new Box<>();
        boxAge.setContent(10);

        lista.add(boxText);
        lista.add(boxAge);
        lista.forEach(System.out::println);
    }
}
