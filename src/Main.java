// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code. class Carro {
public String marca;     public int anio;     public String placa;     public String conductor;

public Carro(String marca, int anio, String placa, String conductor) {
        // marca = marca;
        //anio = anio;
        //placa = placa;
        //conductor = conductor;         this.marca = marca;         this.anio = anio;         this.placa = placa;
        this.conductor = conductor;
        }

public static void main(String[] args) {
        Carro c1 = new Carro("Lamborghini", 2003, "PJK - 7924", "Joel");
        System.out.println("El conductor es " + c1.conductor);
        System.out.println("La marca es : " + c1.marca);
        System.out.println("Año: " + c1.anio);
        System.out.println("La placa es " + c1.placa);         System.out.println(" ");

        }
public static String Carro(String[] args) {
        Carro vehiculo = new Carro("Ferrari", 2009, "JKS - 8382", "Jorge");
        Carro vehiculo1 = new Carro("BWM", 2000, "SEB - 2503", "Sebas");
        System.out.println("El conductor es " + vehiculo.conductor);
        System.out.println("La marca es : " + vehiculo.marca);
        System.out.println("Año: " + vehiculo.anio);
        System.out.println("La placa es " + vehiculo.placa);
        System.out.println(" ");
        System.out.println("El conductor es " + vehiculo1.conductor);
        System.out.println("La marca es : " + vehiculo1.marca);
        System.out.println("Año: " + vehiculo1.anio);
        System.out.println("La placa es " + vehiculo1.placa);
        }
        }
