package atv1_poo2;

import java.util.Scanner;

public class Atv1_Poo2 {

    public static void main(String[] args) {
        String a,b,c;
        int x;
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Informe o nome do medico Cardiologista\n");
        a = ler.next();
        System.out.printf("Informe o CRM:\n");
        b = ler.next();
        System.out.printf("Informe o telefone:\n");
        c = ler.next();
        System.out.printf("Informe o numero da especialidade:\n");
        x = ler.nextInt();        
        Neurologista neuro = new Neurologista(a,b,c,x);
        
        System.out.printf("\nInforme o nome do medico Neurologista\n");
        a = ler.next();
        System.out.printf("Informe o CRM:\n");
        b = ler.next();
        System.out.printf("Informe o telefone:\n");
        c = ler.next();
        System.out.printf("Informe o numero da especialidade:\n");
        x = ler.nextInt();        
        Cardiologista cardio = new Cardiologista(a,b,c,x);

    }

}
