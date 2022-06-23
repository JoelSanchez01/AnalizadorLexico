import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class PruebaJFlex extends JFrame implements ActionListener {


    private JLabel Escoje;
    private JButton FileB, GyC;

    private JScrollPane scroll, scroll2;
    private JTextArea texto;
    JFileChooser abrirArchivo;
    DefaultTableModel dtm;
    JTable  table;
    String nombre = "";
    String path = "";

    PruebaJFlex() {
        setLayout(null);
        setBounds(0, 0, 1050, 500);

        Escoje = new JLabel("Escoja un archivo de texto (.txt) para analizar");
        Escoje.setBounds(580, 20, 400, 20);
        Escoje.setFont(new Font("Sans Serif", Font.PLAIN, 16));
        add(Escoje);

        FileB = new JButton("Buscar");
        FileB.setBounds(550, 50, 120, 30);
        FileB.addActionListener(this);
        add(FileB);
        String[] columnNames = {"Lexemas", "Token",};
        GyC = new JButton("Guardar y compilar");
        GyC.setBounds(700, 50,150, 30);
        add(GyC);
        GyC.addActionListener(this);
        Object[][] datos = {

        };
        texto = new JTextArea();
        texto.setBounds(50, 30, 400, 400);
        add(texto);

        scroll2 = new JScrollPane(texto, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scroll2);
        scroll2.setBounds(50, 30, 400, 400);
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);

        scroll = new JScrollPane();
        scroll.setBounds(500, 120, 500, 300);
        add(scroll);


        dtm = new DefaultTableModel(datos, columnNames){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        } ;
        table = new JTable(dtm);


        scroll.setViewportView(table);




    }


    public static void main(String[] args) {
        PruebaJFlex obj = new PruebaJFlex();
        obj.setResizable(false);

        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);

        obj.setLocationRelativeTo(null);
        obj.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == FileB) {
            if (abrirArchivo == null) abrirArchivo = new JFileChooser();
            //Con esto solamente podamos abrir archivos
            abrirArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            abrirArchivo.setFileFilter(filtro);

            int seleccion = abrirArchivo.showOpenDialog(this);
            String aaa = "";
            String aux = "";
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File f = abrirArchivo.getSelectedFile();
                try {
                    FileReader archivos = new FileReader(f);
                    BufferedReader leer = new BufferedReader(archivos);
                    while ((aux = leer.readLine()) != null) {
                        aaa += aux + "\n";
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }




                texto.setText(aaa);


                InputStream initialSTream = null;
                try {
                    initialSTream = new FileInputStream(f.getPath());
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                Reader targetReader = new InputStreamReader(initialSTream);
                    nombre = f.getName();
                    path = f.getAbsolutePath();
                    String contenido = getArchivo(path);
                    Lexico lexico = new Lexico(targetReader);
                     analisis pars = new analisis(lexico);
                try {
                    pars.parse();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }


            }




        }
        if(e.getSource() == GyC){
            File archivo = new File(path); // este es el archivo que insertaras caracteres
            if (!archivo.exists()) {
                System.out.println("El archivo data no existe.");
            } else {
                archivo.delete();
                System.out.println("El archivo data fue eliminado.");
            }



            try {
                archivo.createNewFile();
                FileWriter escribir = new FileWriter(archivo);
                String aver = texto.getText();
                for(int i=0; i<aver.length();i++) {
                    escribir.write(aver.charAt(i));
                }
                escribir.close();

                String contenido = getArchivo(path);
                InputStream initialSTream = null;
                try {
                    initialSTream = new FileInputStream(path);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                Reader targetReader = new InputStreamReader(initialSTream);
                Lexico lexico = new Lexico(targetReader);
                analisis pars = new analisis(lexico);
                try {
                    pars.parse();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println(path);
        }
    }









    public String getArchivo(String ruta) {
        FileReader fr = null;
        BufferedReader br = null;
        //Cadena de texto donde se guardara el contenido del archivo
        String contenido = "";
        try {
            dtm.setRowCount(0);


            //ruta puede ser de tipo String o tipo File
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);

            AnalizadorLexico analizadorJFlex = new AnalizadorLexico(br);

            while (true) {

                // Obtener el token analizado y mostrar su informacion
                TokenPersonalizado token = analizadorJFlex.yylex();

                if (!analizadorJFlex.existenTokens())
                    break;

                dtm.addRow(new Object[]{token.getLexema(), token.getToken()});
            }
        } catch (Exception e) {
            System.out.println(e.toString());


        }

    return contenido;
    }

}
