import java.util.Scanner;
public static void main args(String[] args) {

Scanner sc  = new Scanner(System.in);
System.out.println("Bem-vindo ao Banco do Brasil!");
System.out.println("Por favor, digite o número da conta: ");
int numero= sc.nextInt();
sc.nextLine(); 
System.out.println("Por favor, digite o número da agência: ");
int agencia= sc.nextInt();
sc.nextLine();  
System.out.println("Por favor, digite o nome do cliente: ");    
String nomeCliente= sc.nextLine();
System.out.println("Por favor, digite o saldo: ");
double saldo= sc.nextDouble();
sc.nextLine();  
System.out.println("Olá +" + nomeCliente + ",    
obrigado por criar uma conta em nosso banco, sua agência é" + agencia ", conta "+ numero + ", " +
"e seu saldo " + saldo + " já está disponível para saque" );

}