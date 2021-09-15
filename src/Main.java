public class Main {

    public static void main(String[] args) {
        // Criar duas pessoas com o mesmo número de RG.
        Pessoa brennoIFood = new Pessoa("Brenno",4800);
        Pessoa ericCoxinha = new Pessoa("Brenno",4800);

        // Comparar se a primeira pessoa criada é igual à segunda.
        if(brennoIFood.equals(ericCoxinha)) {
            System.out.println("Brenno igual ao Eric");
        } else {
            System.out.println("Pessoas diferentes");
        }
//        System.out.println(brennoIFood.equals(ericCoxinha));
//        System.out.println(ericCoxinha.getRG());
    }
}
