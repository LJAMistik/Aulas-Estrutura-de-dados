package exercicios;

public class Exercicios {
/*
   1a) Crie um método que recebe um número binário de 8 bits em um vetor do tipo int 
e converta os valores para decimal, atribuindo-os a outro vetor do tipo int, 
utilizando a analogia explicada em aula para a conversão de binário para decimal.
*/

    public static void main(String[] args) {
        int[] vetorBinario = {1, 0, 1, 0, 1, 0, 1, 0}; // Exemplo de número binário
        int numDecimal = binarioParaDecimal(vetorBinario);

        System.out.println("O valor em número decimal é : " + numDecimal);
    }

    public static int binarioParaDecimal(int[] vetorBinario) 
    {
        int decimal = 0;
        int tamanho = vetorBinario.length;

        for (int i = 0; i < tamanho; i++) 
        {
            decimal += vetorBinario[i] * Math.pow(2, tamanho - 1 - i);
        }

        return decimal;
    }

  int[][] matrizBinaria = { 

            {1, 0, 1, 0, 1, 0, 1, 0}, 
            {0, 1, 1, 0, 0, 1, 0, 1}, 
            {1, 1, 0, 0, 1, 0, 1, 1} 

        }; // Exemplo de matriz com números binários 

        int[] numDecimal = binarioparaDecimal(matrizBinaria);      

        System.out.println("Os valores em decimal são: "); 

        for (int i = 0; i < numDecimal.length; i++) { 

            System.out.println(numDecimal[i]); 
        } 

    }   

        public static int[] binarioparaDecimal(int[][] matrizBinaria) { 

            int numLinhas = matrizBinaria.length; 

            int[] decimalValues = new int[numLinhas]; 


            for (int i = 0; i < numLinhas; i++) { 

                int[] vetorBinario = matrizBinaria[i]; 

                int decimalValue = 0;  

                for (int j = 0; j < 8; j++) { 

                    int bit = vetorBinario[j]; 

                    numDecimal += bit * Math.pow(2, 7 - j); 

                } 

                numDecimais[i] = numDecimal; 

            } 

              return numDecimal; 

        }
}
