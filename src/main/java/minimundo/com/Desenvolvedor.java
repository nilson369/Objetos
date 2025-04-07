package minimundo.com;

import java.util.Scanner;

public class Desenvolvedor extends Funcionário {
    // atributos
    private String linguagem;
    private String framework;

    public Desenvolvedor() {
        linguagem = "";
        framework = "";
    }
    public Desenvolvedor(String nome, float salario, String cpf, String linguagem, String framework) {
       super(nome, salario, cpf);
       this.linguagem=linguagem;
       this.framework=framework;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
    @Override
public void perguntar (){
        Scanner perguntar= new Scanner(System.in);
      super.perguntar();
        System.out.print("Qual linguagem você programa: ");
        linguagem=perguntar.nextLine();
        System.out.print("Qual framework você utiliza? ");
        framework=perguntar.nextLine();
}
    // polimorfismo- sobreescritak
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Framework: " + framework);
    }

    //polimorfismo- sobrecarga(overload)
    public void programar() {
        System.out.println("Estounprogramando.....");
    }

    public void programar(String opcao) {
        System.out.println("Estounprogramando mais rapido");
    }

    public void programar(int opcao) {
        System.out.println("Estounprogramando em" + opcao + "x");
    }
}
