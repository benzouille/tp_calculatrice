package fr.banane.model;

public class Calcul {

    public Calcul(){

    }

    public String getResult(String chiffre_1, String signe, String chiffre_2){
        String result;

        int num_1 = Integer.parseInt(chiffre_1);
        int num_2 = Integer.parseInt(chiffre_2);

        System.out.println("dans le bean calcul");

        if(signe.equals("+")){
            result = String.valueOf(num_1 + num_2);
        }
        else if(signe.equals("-")){
           result = String.valueOf(num_1 - num_2);
        }
        else if(signe.equals("*")){
            result = String.valueOf(num_1 * num_2);
        }
        else{
            if(num_2 != 0) {
                result = String.valueOf(num_1 / num_2);
            }
            else result = "division par zéro impossible";
        }
        return result;
    }

}
