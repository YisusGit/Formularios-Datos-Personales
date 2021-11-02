import javax.swing.*;

public class Main extends JFrame {

    Formulario form = new Formulario();

    public Main(){
        //Creamos el formulario
        form.crearFormulario();
        //Iniciamos la ventana del formulario
        form.initFormulario();
    }

    public static void main(String[] args) {
        new Main();
    }

}
