public class Contador {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Erro: são necessários dois parâmetros");
            return;
        }

        int inicio, fim;
        try {
            inicio = Integer.parseInt(args[0]);
            fim = Integer.parseInt(args[1]);
        } catch 
        (NumberFormatException e) {
            System.out.println("Erro: os parâmetros devem ser números inteiros");
            return;
        }

        try {
            contar(inicio, fim);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int inicio, int fim) throws ParametrosInvalidosException  {
        if (inicio > fim) {
            throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidadeIteracoes = fim - inicio + 1;
        for (int i = 1; i <= quantidadeIteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}