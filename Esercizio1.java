import java.util.Scanner;
class Esercizio1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Inserisci il nome: ");
        
        nome= input.nextLine();
        System.out.println("ciao"+ nome);
        input.close();
    }
}