import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Formulario extends JFrame implements ItemListener, ActionListener {
    //Añadimos los campos que va a usar el usuario con sus respectivos nombres
    public JTextField nombre, apellidos, direccion, telefono, nif, codigoPostal, email, contrasena, poblacion;
    public JLabel nombreJL, apellidosJL, direccionJL, telefonoJL, nifJL, codigoPostalJL, emailJL, contrasenaJL, poblacionJL, paisJL, provinciaJL, sexoJL, idiomaJL, cartapresentacionJL;
    public JComboBox paisCB, provinciaCB;
    public JRadioButton sexoMascRB, sexoFemRB, sexoOtroRB;
    public ButtonGroup grupoSexo;
    public JCheckBox espanol, ingles, frances, aleman, italiano, otros;
    public JTextArea cartaPresentacionTA;
    public JButton mostrarDatos;
    public JEditorPane textoDatos;
    public JScrollPane scrlDatos, scrlpres;
    public JMenuBar menu;
    public JMenu menuOpciones, menuFormato, menuAcciones;
    public JMenuItem itemRojo, itemVerde, itemAzul, itemNaranja, itemNegro, item10, item12, item14, item16, item18, itemLimpiar, itemSalir;

    String [] paises = {"", "Alemania", "Argentina", "Brasil", "Colombia", "España", "Estados Unidos", "Francia", "Holanda", "Inglaterra"};
    String [] Alemania = {"", "Berlín", "Bremen", "Colonia", "Dortmund", "Düsseldorf", "Hamburg", "Hannover", "Kiel", "Mainz", "Munich"};
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
        setSize(700, 540); //Dimensiones del JFrame
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

        sexoJL = new JLabel("Sexo:");
        sexoJL.setBounds(250, 10, 100,30);
        add(sexoJL);

        idiomaJL = new JLabel("Idioma:");
        idiomaJL.setBounds(250,140, 100,30);
        add(idiomaJL);

        cartapresentacionJL = new JLabel("Carta de Presentacion:");
        cartapresentacionJL.setBounds(250,280,140,30);
        add(cartapresentacionJL);

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
        paisCB.setBounds(95,375,130,20);
        add(paisCB);
        paisCB.addItemListener( this); //Añadimos ItemListener

        provinciaCB = new JComboBox();
        provinciaCB.setBounds(95,415,130,20);
        add(provinciaCB);
        provinciaCB.setEnabled(false);

        //Creamos el objeto grupoSexo
        grupoSexo = new ButtonGroup();

        //Añadimos los RadioButton para selección de sexo
        sexoMascRB = new JRadioButton("Masculino");
        sexoMascRB.setBounds(250,35,100, 30);
        add(sexoMascRB);
        grupoSexo.add(sexoMascRB);

        sexoFemRB = new JRadioButton("Femenino");
        sexoFemRB.setBounds(250, 65,100,30);
        add(sexoFemRB);
        grupoSexo.add(sexoFemRB);

        sexoOtroRB = new JRadioButton("Otro");
        sexoOtroRB.setBounds(250, 95,100,30);
        add(sexoOtroRB);
        grupoSexo.add(sexoOtroRB);

        //Añadimos los JCheckBox
        espanol = new JCheckBox("Español");
        espanol.setBounds(250, 165, 75,30);
        add(espanol);

        ingles = new JCheckBox("Inglés");
        ingles.setBounds(350,165,75,30);
        add(ingles);

        frances = new JCheckBox("Francés");
        frances.setBounds(250,205,75,30);
        add(frances);

        aleman = new JCheckBox("Alemán");
        aleman.setBounds(350,205,75,30);
        add(aleman);

        italiano = new JCheckBox("Italiano");
        italiano.setBounds(250,245,75,30);
        add(italiano);

        otros = new JCheckBox("Otros");
        otros.setBounds(350,245,75,30);
        add(otros);

        //Añadimos JTextArea con su JScrollPane
        cartaPresentacionTA = new JTextArea();
        cartaPresentacionTA.setLineWrap(true); //Cuando llego al final salta a la siguiente
        add(cartaPresentacionTA);
        scrlpres = new JScrollPane(cartaPresentacionTA);
        scrlpres.setBounds(250,310,420,160);
        add(scrlpres);

        //Añadimos el botón encargado de generar todos los datos
        mostrarDatos = new JButton("Mostrar datos");
        mostrarDatos.setBounds(450, 15, 220,30);
        add(mostrarDatos);
        mostrarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTexto();
            }
        });

        //Añadimos el JEditorPane con su respectivo JScrollPane
        textoDatos = new JEditorPane();
        textoDatos.setContentType("text/html");
        textoDatos.setEditable(false);
        scrlDatos = new JScrollPane(textoDatos);
        scrlDatos.setBounds(450,60, 220,220);
        add(scrlDatos);

        //Añadimos el JMenuBar
        menu=new JMenuBar();
        setJMenuBar(menu);

        //Añadimos el menu Principal de opciones
        menuOpciones=new JMenu("Opciones");
        menu.add(menuOpciones);

        //Añadimos los submenus Formato y Acciones
        menuFormato=new JMenu("Formato");
        menuOpciones.add(menuFormato);

        menuAcciones=new JMenu("Acciones");
        menuOpciones.add(menuAcciones);

        //Creamos los JMenuItem
        itemRojo=new JMenuItem("Rojo");
        menuFormato.add(itemRojo);
        itemRojo.addActionListener(this);

        itemVerde=new JMenuItem("Verde");
        menuFormato.add(itemVerde);
        itemVerde.addActionListener(this);

        itemAzul=new JMenuItem("Azul");
        menuFormato.add(itemAzul);
        itemAzul.addActionListener(this);

        itemNaranja=new JMenuItem("Naranja");
        menuFormato.add(itemNaranja);
        itemNaranja.addActionListener(this);

        itemNegro=new JMenuItem("Negro");
        menuFormato.add(itemNegro);
        itemNegro.addActionListener(this);

        item10=new JMenuItem("10");
        menuFormato.add(item10);
        item10.addActionListener(this);

        item12=new JMenuItem("12");
        menuFormato.add(item12);
        item12.addActionListener(this);

        item14=new JMenuItem("14");
        menuFormato.add(item14);
        item14.addActionListener(this);

        item16=new JMenuItem("16");
        menuFormato.add(item16);
        item16.addActionListener(this);

        item18=new JMenuItem("18");
        menuFormato.add(item18);
        item18.addActionListener(this);

        itemLimpiar=new JMenuItem("Limpiar");
        menuAcciones.add(itemLimpiar);
        itemLimpiar.addActionListener(this);

        itemSalir=new JMenuItem("Salir");
        menuAcciones.add(itemSalir);
        itemSalir.addActionListener(this);
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

    //Método encargado de mostrar los datos del usuario en el JScrollPane
    public void mostrarTexto(){
        String sexoUsuario = "";
        String provinciaUsuario = "";

        if(sexoMascRB.isSelected()){
            sexoUsuario = sexoMascRB.getText();
        }
        else if(sexoFemRB.isSelected()){
            sexoUsuario = sexoFemRB.getText();
        }
        else if(sexoOtroRB.isSelected()){
            sexoUsuario = sexoOtroRB.getText();
        }

        //Si no selecciona la provincia evitamos que salga como null
        if(provinciaCB.isEnabled()){
            provinciaUsuario = String.valueOf(provinciaCB.getSelectedItem());
            System.out.println("Adios");
        }
        else{
            provinciaUsuario = "";
            System.out.println("Hola");
        }

        textoDatos.setText(
                "<b>Nombre: </b>" +
                        nombre.getText() + "<br>" +
                "<b>Apellido: </b>" +
                        apellidos.getText() + "<br>" +
                "<b>Dirección: </b>" +
                        direccion.getText() + "<br>" +
                "<b>Teléfono: </b>" +
                        telefono.getText() + "<br>" +
                "<b>NIF: </b>" +
                        nif.getText() + "<br>" +
                "<b>Código Postal: </b>" +
                        codigoPostal.getText() + "<br>" +
                "<b>Email: </b>" +
                        email.getText() + "<br>" +
                "<b>Población: </b>" +
                        poblacion.getText() + "<br>" +
                "<b>País: </b>" +
                        paisCB.getSelectedItem() + "<br>" +
                "<b>Provincia: </b>" +
                        provinciaUsuario + "<br>" +
                "<b>Sexo: </b>" +
                        sexoUsuario + "<br>" +
                "<b>Idioma: </b>"
        );
    }//Fin mostrarTexto

    //Acción del menú
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemRojo) {
            nombre.setForeground(Color.RED);
            apellidos.setForeground(Color.RED);
            direccion.setForeground(Color.RED);
            telefono.setForeground(Color.RED);
            nif.setForeground(Color.RED);
            codigoPostal.setForeground(Color.RED);
            email.setForeground(Color.RED);
            contrasena.setForeground(Color.RED);
            poblacion.setForeground(Color.RED);
        }
        if (e.getSource()== itemVerde) {
            nombre.setForeground(Color.GREEN);
            apellidos.setForeground(Color.GREEN);
            direccion.setForeground(Color.GREEN);
            telefono.setForeground(Color.GREEN);
            nif.setForeground(Color.GREEN);
            codigoPostal.setForeground(Color.GREEN);
            email.setForeground(Color.GREEN);
            contrasena.setForeground(Color.GREEN);
            poblacion.setForeground(Color.GREEN);
        }
        if (e.getSource()==itemAzul) {
            nombre.setForeground(Color.BLUE);
            apellidos.setForeground(Color.BLUE);
            direccion.setForeground(Color.BLUE);
            telefono.setForeground(Color.BLUE);
            nif.setForeground(Color.BLUE);
            codigoPostal.setForeground(Color.BLUE);
            email.setForeground(Color.BLUE);
            contrasena.setForeground(Color.BLUE);
            poblacion.setForeground(Color.BLUE);
        }
        if (e.getSource()==itemNaranja) {
            nombre.setForeground(Color.ORANGE);
            apellidos.setForeground(Color.ORANGE);
            direccion.setForeground(Color.ORANGE);
            telefono.setForeground(Color.ORANGE);
            nif.setForeground(Color.ORANGE);
            codigoPostal.setForeground(Color.ORANGE);
            email.setForeground(Color.ORANGE);
            contrasena.setForeground(Color.ORANGE);
            poblacion.setForeground(Color.ORANGE);
        }
        if (e.getSource()==itemNegro) {
            nombre.setForeground(Color.BLACK);
            apellidos.setForeground(Color.BLACK);
            direccion.setForeground(Color.BLACK);
            telefono.setForeground(Color.BLACK);
            nif.setForeground(Color.BLACK);
            codigoPostal.setForeground(Color.BLACK);
            email.setForeground(Color.BLACK);
            contrasena.setForeground(Color.BLACK);
            poblacion.setForeground(Color.BLACK);
        }
        if (e.getSource()==item10) {
            nombre.setFont(new Font("Serif", Font.PLAIN, 10));
            apellidos.setFont(new Font("Serif", Font.PLAIN, 10));
            direccion.setFont(new Font("Serif", Font.PLAIN, 10));
            telefono.setFont(new Font("Serif", Font.PLAIN, 10));
            nif.setFont(new Font("Serif", Font.PLAIN, 10));
            codigoPostal.setFont(new Font("Serif", Font.PLAIN, 10));
            email.setFont(new Font("Serif", Font.PLAIN, 10));
            contrasena.setFont(new Font("Serif", Font.PLAIN, 10));
            poblacion.setFont(new Font("Serif", Font.PLAIN, 10));
        }
        if (e.getSource()==item12) {
            nombre.setFont(new Font("Serif", Font.PLAIN, 12));
            apellidos.setFont(new Font("Serif", Font.PLAIN, 12));
            direccion.setFont(new Font("Serif", Font.PLAIN, 12));
            telefono.setFont(new Font("Serif", Font.PLAIN, 12));
            nif.setFont(new Font("Serif", Font.PLAIN, 12));
            codigoPostal.setFont(new Font("Serif", Font.PLAIN, 12));
            email.setFont(new Font("Serif", Font.PLAIN, 12));
            contrasena.setFont(new Font("Serif", Font.PLAIN, 12));
            poblacion.setFont(new Font("Serif", Font.PLAIN, 12));
        }
        if (e.getSource()==item14) {
            nombre.setFont(new Font("Serif", Font.PLAIN, 14));
            apellidos.setFont(new Font("Serif", Font.PLAIN, 14));
            direccion.setFont(new Font("Serif", Font.PLAIN, 14));
            telefono.setFont(new Font("Serif", Font.PLAIN, 14));
            nif.setFont(new Font("Serif", Font.PLAIN, 14));
            codigoPostal.setFont(new Font("Serif", Font.PLAIN, 14));
            email.setFont(new Font("Serif", Font.PLAIN, 14));
            contrasena.setFont(new Font("Serif", Font.PLAIN, 14));
            poblacion.setFont(new Font("Serif", Font.PLAIN, 14));
        }
        if (e.getSource()==item16) {
            nombre.setFont(new Font("Serif", Font.PLAIN, 16));
            apellidos.setFont(new Font("Serif", Font.PLAIN, 16));
            direccion.setFont(new Font("Serif", Font.PLAIN, 16));
            telefono.setFont(new Font("Serif", Font.PLAIN, 16));
            nif.setFont(new Font("Serif", Font.PLAIN, 16));
            codigoPostal.setFont(new Font("Serif", Font.PLAIN, 16));
            email.setFont(new Font("Serif", Font.PLAIN, 16));
            contrasena.setFont(new Font("Serif", Font.PLAIN, 16));
            poblacion.setFont(new Font("Serif", Font.PLAIN, 16));
        }
        if (e.getSource()==item18) {
            nombre.setFont(new Font("Serif", Font.PLAIN, 18));
            apellidos.setFont(new Font("Serif", Font.PLAIN, 18));
            direccion.setFont(new Font("Serif", Font.PLAIN, 18));
            telefono.setFont(new Font("Serif", Font.PLAIN, 18));
            nif.setFont(new Font("Serif", Font.PLAIN, 18));
            codigoPostal.setFont(new Font("Serif", Font.PLAIN, 18));
            email.setFont(new Font("Serif", Font.PLAIN, 18));
            contrasena.setFont(new Font("Serif", Font.PLAIN, 18));
            poblacion.setFont(new Font("Serif", Font.PLAIN, 18));
        }
        if (e.getSource() == itemLimpiar){
            String texto = "";
            nombre.setText(texto);
            apellidos.setText(texto);
            direccion.setText(texto);
            telefono.setText(texto);
            nif.setText(texto);
            codigoPostal.setText(texto);
            email.setText(texto);
            contrasena.setText(texto);
            poblacion.setText(texto);
            paisCB.setSelectedIndex(0);
            grupoSexo.clearSelection();
            cartaPresentacionTA.setText(texto);
            textoDatos.setText(texto);
        }
        if (e.getSource() == itemSalir){
            System.exit(0);
        }
    }
}//Fin Class
