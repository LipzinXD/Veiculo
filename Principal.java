public class Principal {
    public static void main(String args[]) {
Bike bike =new Bike("Monark", "Monarcosa", "Roxo Brilhoso", 2005);


System.out.println(bike.getMarca());
System.out.println(bike.getModelo());
System.out.println(bike.getCor());
System.out.println(bike.getAno());

Mobilete mobilete =new Mobilete("Mobilete", "Mobilas", "Verdão Parmera", 1998);

System.out.println(mobilete.getMarca());
System.out.println(mobilete.getModelo());
System.out.println(mobilete.getCor());
System.out.println(mobilete.getAno());

Patinete patinete =new Patinete("Hot Wheels", "Patinas", "Branco Escuro", 2022);

System.out.println(patinete.getMarca());
System.out.println(patinete.getModelo());
System.out.println(patinete.getCor());
System.out.println(patinete.getAno());

    }
}