package minimundo.com;

import java.util.Scanner;

public class Funcionário {
    // atributos
    String nome;
    float salario;
    private String cpf;

   // construtores
    public Funcionário(){
        nome="";
        salario=0;
         cpf="";
    }
    public Funcionário(String nome, float salario, String cpf){
        this.nome= nome;
        this.salario=salario;
        this.cpf=cpf;
    }
    //metodos gets e set
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario(float salario){
        this.salario=salario;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf ){
        this.cpf=cpf;
    }
    public void perguntar(){
        Scanner perguntar= new Scanner(System.in);
        System.out.print("Qual é seu nome: ");
        nome= perguntar.next();
        System.out.print("Qual é seu salario ");
        salario= perguntar.nextInt();
        System.out.print("Digite seu cpf: ");
        cpf= perguntar.next();
    }
    // metodo da lógica do negocio
    public  void apresentar(){
        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+salario);
        System.out.println("CPF: "+cpf);
    }
}
