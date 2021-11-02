import javax.swing.*;

public class Formulario extends JFrame {
    //Añadimos los campos que va a usar el usuario con sus respectivos nombres
    public JTextField nombre, apellidos, direccion, telefono, nif, codigoPostal, email, contrasena, poblacion, poblacion2;
    public JLabel nombreJL, apellidosJL, direccionJL, telefonoJL, nifJL, codigoPostalJL, emailJL, contrasenaJL, poblacionJL;

    //Creamos la ventana
    public void initFormulario() {
        setLayout(null); //Layout absoluto
        setTitle("Formulario"); //Título del JFrame
        setSize(520, 520); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }


    public void crearFormulario(){
        //Añadimos los JLabel
        nombreJL = new JLabel("Nombre:");
        nombreJL.setBounds(10,10,100,30);
        add(nombreJL);

        apellidosJL = new JLabel("Apellido:");
        apellidosJL.setBounds(10,50,100,30);
        add(apellidosJL);

        direccionJL = new JLabel("Dirección:");
        direccionJL.setBounds(10,90,100,30);
        add(direccionJL);

        telefonoJL = new JLabel("Teléfono:");
        telefonoJL.setBounds(10,130,100,30);
        add(telefonoJL);

        nifJL = new JLabel("NIF:");
        nifJL.setBounds(10,170,100,30);
        add(nifJL);

        codigoPostalJL = new JLabel("Código Postal:");
        codigoPostalJL.setBounds(10,210,100,30);
        add(codigoPostalJL);

        emailJL = new JLabel("Email:");
        emailJL.setBounds(10,250,100,30);
        add(emailJL);

        contrasenaJL = new JLabel("Contraseña:");
        contrasenaJL.setBounds(10,290,100,30);
        add(contrasenaJL);

        poblacionJL = new JLabel("Población:");
        poblacionJL.setBounds(10,330,100,30);
        add(poblacionJL);

        //Añadimos los JTextField
        nombre = new JTextField();
        nombre.setBounds(95,15,100,20);
        add(nombre);

        apellidos = new JTextField();
        apellidos.setBounds(95,55,100,20);
        add(apellidos);

        direccion = new JTextField();
        direccion.setBounds(95,95,100,20);
        add(direccion);

        telefono = new JTextField();
        telefono.setBounds(95,135,100,20);
        add(telefono);

        nif = new JTextField();
        nif.setBounds(95,175,100,20);
        add(nif);

        codigoPostal = new JTextField();
        codigoPostal.setBounds(95,215,100,20);
        add(codigoPostal);

        email = new JTextField();
        email.setBounds(95,255,100,20);
        add(email);

        contrasena = new JTextField();
        contrasena.setBounds(95,295,100,20);
        add(contrasena);

        poblacion = new JTextField();
        poblacion.setBounds(95,335,100,20);
        add(poblacion);

    }

}
