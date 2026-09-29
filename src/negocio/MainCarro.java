package negocio;

public class MainCarro {
    static void main() {
        Carro c1 = new Carro();
        Carro c2= new Carro();
        Carro c3= new Carro();

        c1.potencia=10;
        c1.velocidad =67;
        c2.potencia=11;
        c2.velocidad=100000;
        c2.frenar();
        c3.potencia=1;
        c3.velocidad=1;

        System.out.println("La potencia del carro1 es "+ c1.potencia+" y la velocidad1 es "+c1.velocidad);
        System.out.println("La potencia del carro2 es "+ c2.potencia+" y la velocidad2 es "+c2.velocidad);
        System.out.println("La potencia del carro3 es "+ c3.potencia+" y la velocidad3 es "+c3.velocidad);

    }
}
