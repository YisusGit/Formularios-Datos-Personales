import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Formulario extends JFrame implements ItemListener {
    //Añadimos los campos que va a usar el usuario con sus respectivos nombres
    public JTextField nombre, apellidos, direccion, telefono, nif, codigoPostal, email, contrasena, poblacion, poblacion2;
    public JLabel nombreJL, apellidosJL, direccionJL, telefonoJL, nifJL, codigoPostalJL, emailJL, contrasenaJL, poblacionJL, paisJL, provinciaJL;
    public JComboBox paisCB, provinciaCB;
    String [] paises = {"Selecione Pais", "Alemania", "Argentina", "Brasil", "Colombia", "España", "Estados Unidos", "Francia", "Holanda", "Inglaterra"};
    String [] Alemania = {"Berlín", "Bremen", "Colonia", "Dortmund", "Düsseldorf", "Hamburg", "Hannover", "Kiel", "Mainz", "Munich"};
    String [] Argentina = {"Buenos Aires", "Córdoba", "Entre Rios", "Formosa", "Jujuy", "La Rioja", "Mendoza", "Misiones", "Neuquen", "San Juan"};
    String [] Brasil = {"Amapa", "Amazonas", "Bahía", "Caera", "Goias", "Maranhao", "Para", "Paraiba", "Pabamá", "Río de Janeiro"};
    String [] Colombia = {"Amazonas", "Bolívar", "Caldas", "Cesar", "Huila", "Meta", "Putumayo", "Risaralda", "Santander", "Tolima"};
    String [] España = {"Ávila", "Barcelona", "Bilbao", "Cádiz", "Castellón", "Madrid", "Málaga", "Sevilla", "Toledo", "Valencia"};
    String [] EstadosUnidos = {"Alabama","Alaska","California","Colorado", "Florida", "Hawái", "Kansas", "New York", "Texas", "Washington"};
    String [] Francia = {"Alsacia", "Borgoña", "Bretaña", "Centro", "Franco Condado", "Isla de Francia", "Limousin", "Lorena", "Picardia", "PACA"};
    String [] Holanda = {"Drenthe", "Flevoland", "Frisia", "Güeldres", "Holanda del Norte", "Holanda del Sur", "Limburgo","Overijssel", "Utrecht", "Zelanda"};
    String [] Inglaterra = {"Bristol", "Cambrigge", "Cardiff", "Derby", "Liverpool", "Leicester", "Leeds", "Manchester", "Norwich", "Oxford"};


    //Creamos la ventana
    public void initFormulario() {
        setLayout(null); //Layout absoluto
        setTitle("Formulario"); //Título del JFrame
        setSize(520, 520); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }//Fin initFormulario


    public void crearFormulario(){
        //Añadimos los JLabel
        nombreJL = new JLabel("Nombre:");
        nombreJL.setBounds(43,10,100,30);
        add(nombreJL);

        apellidosJL = new JLabel("Apellido:");
        apellidosJL.setBounds(42,50,100,30);
        add(apellidosJL);

        direccionJL = new JLabel("Dirección:");
        direccionJL.setBounds(33,90,100,30);
        add(direccionJL);

        telefonoJL = new JLabel("Teléfono:");
        telefonoJL.setBounds(36,130,100,30);
        add(telefonoJL);

        nifJL = new JLabel("NIF:");
        nifJL.setBounds(68,170,100,30);
        add(nifJL);

        codigoPostalJL = new JLabel("Código Postal:");
        codigoPostalJL.setBounds(10,210,100,30);
        add(codigoPostalJL);

        emailJL = new JLabel("Email:");
        emailJL.setBounds(58,250,100,30);
        add(emailJL);

        contrasenaJL = new JLabel("Contraseña:");
        contrasenaJL.setBounds(23,290,100,30);
        add(contrasenaJL);

        poblacionJL = new JLabel("Población:");
        poblacionJL.setBounds(33,330,100,30);
        add(poblacionJL);

        paisJL = new JLabel("Pais:");
        paisJL.setBounds(64,370,100,30);
        add(paisJL);

        provinciaJL = new JLabel("Provincia:");
        provinciaJL.setBounds(34,410,100,30);
        add(provinciaJL);

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

        //Añadimos los JComboBox
        paisCB = new JComboBox(paises);
        paisCB.setBounds(95,375,80,20);
        add(paisCB);
        paisCB.addItemListener( this); //Añadimos ItemListener

        provinciaCB = new JComboBox();
        provinciaCB.setBounds(95,415,80,20);
        add(provinciaCB);
    }//Fin crearFormulario

    //Metodo ItemListener, dependiendo del pais que seleccione aparecen las provincias
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == paisCB) {
            if (paisCB.getSelectedIndex() == 0) {
                provinciaCB.removeAllItems();
                provinciaCB.setEnabled(false);
            } else if (paisCB.getSelectedIndex() == 1) {
                provinciaCB.removeAllItems();
                for (int i = 0; i < Alemania.length; i++) {
                    provinciaCB.addItem(Alemania[i]);
                }
                provinciaCB.setEnabled(true);
            } else if (paisCB.getSelectedIndex() == 2) {
                provinciaCB.removeAllItems();
                for (int i = 0; i < Argentina.length; i++) {
                    provinciaCB.addItem(Argentina[i]);
                }
                provinciaCB.setEnabled(true);
            } else if (paisCB.getSelectedIndex() == 3) {
                provinciaCB.removeAllItems();
                for (int i = 0; i <Brasil.length; i++) {
                    provinciaCB.addItem(Brasil[i]);
                }
                provinciaCB.setEnabled(true);
            } else if (paisCB.getSelectedIndex() == 4) {
                provinciaCB.removeAllItems();
                for (int i = 0; i < Colombia.length; i++) {
                    provinciaCB.addItem(Colombia[i]);
                }
                provinciaCB.setEnabled(true);
            } else if (paisCB.getSelectedIndex() == 5) {
                provinciaCB.removeAllItems();
                for (int i = 0; i < España.length; i++) {
                    provinciaCB.addItem(España[i]);
                }
                provinciaCB.setEnabled(true);
            } else if (paisCB.getSelectedIndex() == 6) {
                provinciaCB.removeAllItems();
                for (int i = 0; i < EstadosUnidos.length; i++) {
                    provinciaCB.addItem(EstadosUnidos[i]);
                }
                provinciaCB.setEnabled(true);
            } else if (paisCB.getSelectedIndex() == 7) {
                provinciaCB.removeAllItems();
                for (int i = 0; i < Francia.length; i++) {
                    provinciaCB.addItem(Francia[i]);
                }
                provinciaCB.setEnabled(true);
            } else if (paisCB.getSelectedIndex() == 8) {
                provinciaCB.removeAllItems();
                for (int i = 0; i < Holanda.length; i++) {
                    provinciaCB.addItem(Holanda[i]);
                }
                provinciaCB.setEnabled(true);
            } else if (paisCB.getSelectedIndex() == 9) {
                provinciaCB.removeAllItems();
                for (int i = 0; i < Inglaterra.length; i++) {
                    provinciaCB.addItem(Inglaterra[i]);
                }
                provinciaCB.setEnabled(true);
            }
        }//Fin If
    }//Fin itemStateChanged
}//Fin Class
