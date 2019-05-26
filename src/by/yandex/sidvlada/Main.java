package by.yandex.sidvlada;

public class Main {

    public static void main(String[] args) {

        String string = "Считаем, значит, следущее: сколько знаков препинания - содержит это предложение!";
        int sum = 0;
        char symbol;

        for (int i=0; i<string.length(); i++) {
            symbol = string.charAt(i);
            if (symbol==',' || symbol=='.' || symbol=='!' || symbol=='?' || symbol==';' || symbol==':' || symbol=='-')
                sum++;
        }
        System.out.println("В этом предложении " + sum + " знаков препинания.");
    }
}
