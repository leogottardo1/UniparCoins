import java.util.Scanner;

public class CarteiraDigital {

    double saldo = 0.0;

    public void bemVindo() {
        System.out.println("Bem-vindo à sua Carteira Digital!");
    }


    public void adiconarvalor(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor inválido! Tente novamente! ");
        }
    }

    public void FazerPagamento(double valorpagamento) {
        if (saldo > 0 && saldo > valorpagamento) {
            saldo -= valorpagamento;
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente! ");
        }
    }

    public void Saida() {
        System.out.println("Obrigado por usar a sua Carteira Digital! ");
    }
}
