package EstruturaBasicaOO;

public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Amarelo");
        carro1.setModelo("Puma GTB");
        carro1.setCapacidadeTanque(40);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());

        System.out.println(carro1.totalValorTanque());

        Carro carro2 = new Carro("Branco", "Dodge Charge RT", 80);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque());
    }
}
