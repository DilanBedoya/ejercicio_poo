public abstract class Carta {
    private String nombre;

    public Carta(String nombre){
        this.nombre=nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void jugar();
    public abstract void mostrarDescripcion();

}

/*CartaNumerica: Clase que hereda de Carta y agrega el campo numero.*/

class CartaNumerica extends Carta{
    private int numero;
    public CartaNumerica(String nombre, int numero ){
        super(nombre);
        this.numero=numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void jugar() {

        System.out.println("Jugando carta numérica " + getNombre() +" con Numero: "+getNumero());
        double valordouble = numero;       /*Conversiones de tipo*/
        System.out.println("\nJugando nueva carta numérica " + getNombre() + " con Numero: " + valordouble);

    }


    @Override
    public void mostrarDescripcion() {
        System.out.println("Carta numérica: " + getNumero());
    }
}

/*CartaEspecial: Clase que hereda de Carta y agrega un
método específico activarEfectoEspecial().*/
// Excepción personalizada


class CartaEspecial extends Carta{

    public CartaEspecial(String nombre) {
        super(nombre);
    }

    @Override
    public void jugar() {
        System.out.println("Jugando carta numérica " + getNombre());
    }
    @Override
    public void mostrarDescripcion() {
        System.out.println("Nombre de la carta: "+ getNombre());
    }

    /*método de excepcion personalizada*/
    public void activarEfectoEspecial(){
        try {
            int numero=2;
        System.out.println("\nNúmero actual: "+numero);
        int multiplicar = numero/0;
        System.out.println("\nEl número se ha multiplicado: " + multiplicar);
    }
        catch (ArithmeticException e) {
            System.out.println("\nError, el número de la carta no puede ser divisible para cero");
        }

    }
}

/*Comandos para subir desde git

git init
git status
git add Carta.java
git add Main.java
git commit -m "archivos subidos"
git remote add origin https://github.com/DilanBedoya/ejercicio_poo.git
git branch -M main
git push -u origin main
*/