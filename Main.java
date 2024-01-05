public class Main {
public static void main(String[]args){
    CartaEspecial objeto1=new CartaEspecial("carta 1");
    CartaNumerica objeto2=new CartaNumerica("Carta 2",23);
    objeto2.jugar();
    objeto1.activarEfectoEspecial();
}
}
