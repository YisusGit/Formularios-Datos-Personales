import javax.swing.*;

public class Main extends JFrame {

    public Main(){
        initPantalla();
    }

    //Creamos la ventana
    private void initPantalla() {
        setLayout(null); //Layout absoluto
        setTitle("Formulario"); //Título del JFrame
        setSize(520, 520); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    public static void main(String[] args) {
        new Main();
    }

}
