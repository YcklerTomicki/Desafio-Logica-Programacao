package desafio03;

public class Heroi {

    String nome;
    int idade;
    String tipo;


    public String atacar(){

        String ataque = "";
        if (tipo.equalsIgnoreCase("Mago")){
            ataque = "usou magia";
        } else if (tipo.equalsIgnoreCase("guerreiro")) {
            ataque = "usou espada";
        } else if (tipo.equalsIgnoreCase("monge")) {
            ataque = "usou artes marciais";
        }else if (tipo.equalsIgnoreCase("ninja")){
            ataque = "usou shuriken";
        }

        return " o " + tipo + " atacou usando " + ataque;
    }
}