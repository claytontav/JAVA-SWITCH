import java.util.Scanner;

class Switch{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero do dia da semana: ");
        int diaSemana = scan.nextInt();

        switch(diaSemana){
            case 1: System.out.print("Domingo");
            break;
            case 2: System.out.print("Segunda-feira");
            break;
            case 3: System.out.print("Terça-feira");
            break;
            case 4: System.out.print("Quarta-feira");
            break;
            case 5: System.out.print("Quinta-feira");
            break;
            case 6: System.out.print("Sexta-feira");
            break;
            case 7: System.out.print("Sabado");
            break;
            default: System.out.print("Informe um dia da semana valido");
        }

        switch(diaSemana){
            case 2:             
            case 3:             
            case 4:             
            case 5:             
            case 6: System.out.println(" é um Dia útil");
            break;
            case 1:
            case 7: System.out.println("é um Fim de Semana");
            break;
            default: System.out.println("Informe um dia da semana valido");
        }
    }
}