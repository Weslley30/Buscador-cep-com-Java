import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        ConsultaCEP consultaCEP = new ConsultaCEP();

        System.out.println("Digite um numero Cep para consulta");
        var cep = leitura.nextLine();

        try{
            Endereco novoEndereco = consultaCEP.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
