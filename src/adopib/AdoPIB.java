package adopib;

import java.io.*;
import java.util.ArrayList;

public class AdoPIB {

    public static void main(String[] args) {
        // Caminho para o Arquivo de texto PIB

        String nomeArquivo = "C:\\Users\\joao.gmauricio\\Documents\\NetBeansProjects\\Java-leitura-de-arquivo-txt-csv\\src\\adopib\\pib.txt";

        //File f = new File(nomeArquivo);
        // System.out.println(f.getAbsolutePath());
        String linha = null;

        ArrayList<String> linhas = new ArrayList<>();

        ArrayList<Float> listaValoresPIB = new ArrayList<>();

        ArrayList<PIB> listaPib = new ArrayList<>();
        try {

            FileReader fileReader = new FileReader(nomeArquivo); //FileReader fileReader = new FileReader(f.getAbsolutePath());<- na teoria deveria funcionar T-T nao funfou

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                // Leio todas as linhas do arquivo
                while ((linha = bufferedReader.readLine()) != null) {
                    linhas.add(linha);
                }
                // percorro os dados e os coloco em um arrayList do tipo PIB
                for (String l : linhas) {

                    // Separa os dados
                    String[] dadosDaLinha = l.split(";");

                    // Adiciona o estado e Pib no arraylist dados
                    listaValoresPIB.add(Float.parseFloat(dadosDaLinha[1])); // apoio para calcular o PIB

                    // Construo o objetivo com valor do pib e nome do estado
                    PIB pib = new PIB(Float.parseFloat(dadosDaLinha[1]), dadosDaLinha[0]);

                    // adiciono objeto construido a lista
                    listaPib.add(pib);
                }

                // calculo o total do pib
                float total = calcularTotal(listaValoresPIB);

                // com o total atribuo a porcentagem que o objeto PIB possui
                for (PIB pib : listaPib) {
                    pib.setPorcentagem(calcularPorcentagem(total, pib.getValor()));
                }

                // imprime na tela Estado, seu pib e porcentagem equivalente ao total
                for (PIB pib : listaPib) {
                    System.out.println("Estado: " + pib.getEstado() + "| Pib: " + pib.getValor() + "| Porcentagem: " + pib.getPorcentagem() + "%");
                }
                // fecho o bufferedReader
                bufferedReader.close();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + nomeArquivo + "'");
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo '" + nomeArquivo + "'");
        }
        
        // limpo as linhas para ler o proximo arquivo
        linhas.clear();
        linha = null;
        
        
        // Caminho Arquivo de texto Regioes
        String nomeSegundoArquivo = "C:\\Users\\joao.gmauricio\\Documents\\NetBeansProjects\\Java-leitura-de-arquivo-txt-csv\\src\\adopib\\regioes.txt";

        /*/ para Atribuir o a regiao que o estado pertence preciso : 
                 1 - Ler a primeira linha nao vazia e atribuir o valor dela a uma variavel "nomeRegiao"
                 2 - Comparar se os estados lidos com os dos objetos, caso igual atribuir valor da variavel a ele
                 3 - ao encontrar linha vazia a variavel nomeColuna deve receber o valor da proxima linha            
         */
        try {
            // abro o Leitor
            FileReader fr = new FileReader(nomeSegundoArquivo);
            try (BufferedReader bf = new BufferedReader(fr)) {
                
              //  while (linha = bf.readLine()) != null) {                    
                    
            //    }
            } catch (Exception e) {

            }

        } catch (Exception e) {
        }
    }

    static float calcularTotal(ArrayList<Float> listaValores) {
        float total = 0;
        for (Float valor : listaValores) {
            total = total + valor;
        }
        return total;
    }

    static float calcularPorcentagem(float total, float pib) {
        return (pib / total) * 100;
    }

}
