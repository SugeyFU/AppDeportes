
package principal;

//Librerias MySQL
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection; //Es la conexión a la base de datos
import java.sql.DriverManager; //Este es el que carga el Driver en Java
import java.sql.ResultSet; //Nos muestra las consultas
import java.sql.PreparedStatement;//Exclusivo para insertar BD con imagenes
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    //VARIABLES GLOBALES
    static Connection conectar;
    Statement query;
    ResultSet resultado;
    String sql;
    PreparedStatement Query; 
    FileInputStream file;
    File archivo;
    
    public DefaultTableModel DTConsultaVF;
    public DefaultTableModel DTConsultaVV;
    
    
//    Es el constructor
    public Principal() {//inicio del constructor
        initComponents();
        setTitle("Aplicacion de Deportes"); //Este es para el titulo del programa
        setLocationRelativeTo(null); //Sirve para centrar la ventana
        try {
            query=conectar.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Error en el acceso a la BD", JOptionPane.WARNING_MESSAGE);
        }
        
        jTConsultaVF.getTableHeader().setReorderingAllowed(false);//Evita mover las celdas
        creacionTablas();
        consultaVF("SELECT * FROM datospersonales");
        try {
            query=conectar.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Error en el acceso a la BD", JOptionPane.WARNING_MESSAGE);
        }
        
        jTConsultaVV.getTableHeader().setReorderingAllowed(false);//Evita mover las celdas
        creacionTablas();
        consultaVV("SELECT * FROM datospersonales");
    }//fin del constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel49 = new javax.swing.JPanel();
        POPEliminar = new javax.swing.JPopupMenu();
        menuEliminar = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jTabbedPane15 = new javax.swing.JTabbedPane();
        jPanel48 = new javax.swing.JPanel();
        jPanelCodigoVF = new javax.swing.JPanel();
        jTextFieldCodigoVF = new javax.swing.JTextField();
        jPanelNombreVF = new javax.swing.JPanel();
        jTextFieldNombreVF = new javax.swing.JTextField();
        jPanelCarreraVF = new javax.swing.JPanel();
        jTextFieldCarreraVF = new javax.swing.JTextField();
        jPanelSemestreVF = new javax.swing.JPanel();
        jComboBoxSemestreVF = new javax.swing.JComboBox<String>();
        jPanelNSSVF = new javax.swing.JPanel();
        jTextFieldNSSVF = new javax.swing.JTextField();
        jPanelTelVF = new javax.swing.JPanel();
        jTextFieldTelVF = new javax.swing.JTextField();
        jPanelAlergiasVF = new javax.swing.JPanel();
        jTextFieldAlergiasVF = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        jButtonCargarImgVF = new javax.swing.JButton();
        jButtonGuardarVF = new javax.swing.JButton();
        jPanelEmailVF = new javax.swing.JPanel();
        jTextFieldEmailVF = new javax.swing.JTextField();
        jPanel99 = new javax.swing.JPanel();
        jPanelDirVF = new javax.swing.JPanel();
        jTextFieldDirVF = new javax.swing.JTextField();
        jPanel101 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsultaVF = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jTabbedPane16 = new javax.swing.JTabbedPane();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jTabbedPane17 = new javax.swing.JTabbedPane();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jTabbedPane18 = new javax.swing.JTabbedPane();
        jPanel54 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        jPanelCodigoVV = new javax.swing.JPanel();
        jTextFieldCodigoVV = new javax.swing.JTextField();
        jPanelNombreVV = new javax.swing.JPanel();
        jTextFieldNombreVV = new javax.swing.JTextField();
        jPanelCarreraVV = new javax.swing.JPanel();
        jTextFieldCarreraVV = new javax.swing.JTextField();
        jPanelSemestreVV = new javax.swing.JPanel();
        jComboBoxSemestreVV = new javax.swing.JComboBox<String>();
        jPanelNSSVV = new javax.swing.JPanel();
        jTextFieldNSSVV = new javax.swing.JTextField();
        jPanelTelVV = new javax.swing.JPanel();
        jTextFieldTelVV = new javax.swing.JTextField();
        jPanelAlergiasVF2 = new javax.swing.JPanel();
        jTextFieldAlergiasVF2 = new javax.swing.JTextField();
        lblImagen1 = new javax.swing.JLabel();
        jButtonCargarImgVV = new javax.swing.JButton();
        jButtonGuardarVV = new javax.swing.JButton();
        jPanelEmailVV = new javax.swing.JPanel();
        jTextFieldEmailVV = new javax.swing.JTextField();
        jPanel100 = new javax.swing.JPanel();
        jPanelDirVV = new javax.swing.JPanel();
        jTextFieldDirVV = new javax.swing.JTextField();
        jPanel102 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTConsultaVV = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jTabbedPane19 = new javax.swing.JTabbedPane();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jTabbedPane20 = new javax.swing.JTabbedPane();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        jTabbedPane21 = new javax.swing.JTabbedPane();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jTabbedPane22 = new javax.swing.JTabbedPane();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jTabbedPane23 = new javax.swing.JTabbedPane();
        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        jTabbedPane24 = new javax.swing.JTabbedPane();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jTabbedPane25 = new javax.swing.JTabbedPane();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jTabbedPane26 = new javax.swing.JTabbedPane();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jTabbedPane27 = new javax.swing.JTabbedPane();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel30 = new javax.swing.JPanel();
        jTabbedPane36 = new javax.swing.JTabbedPane();
        jPanel91 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jTabbedPane37 = new javax.swing.JTabbedPane();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jTabbedPane28 = new javax.swing.JTabbedPane();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel33 = new javax.swing.JPanel();
        jTabbedPane30 = new javax.swing.JTabbedPane();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jTabbedPane31 = new javax.swing.JTabbedPane();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jTabbedPane29 = new javax.swing.JTabbedPane();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jPanel36 = new javax.swing.JPanel();
        jTabbedPane33 = new javax.swing.JTabbedPane();
        jPanel85 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jTabbedPane34 = new javax.swing.JTabbedPane();
        jPanel87 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jTabbedPane32 = new javax.swing.JTabbedPane();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jTabbedPane35 = new javax.swing.JTabbedPane();
        jPanel89 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane12 = new javax.swing.JTabbedPane();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jTabbedPane13 = new javax.swing.JTabbedPane();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTabbedPane14 = new javax.swing.JTabbedPane();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        menuEliminar.setText("Eliminar dato");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        POPEliminar.add(menuEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Disciplinas"));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel48.setLayout(null);

        jPanelCodigoVF.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jPanelCodigoVF.setPreferredSize(new java.awt.Dimension(202, 50));
        jPanelCodigoVF.setLayout(null);

        jTextFieldCodigoVF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoVFActionPerformed(evt);
            }
        });
        jPanelCodigoVF.add(jTextFieldCodigoVF);
        jTextFieldCodigoVF.setBounds(16, 16, 270, 30);

        jPanel48.add(jPanelCodigoVF);
        jPanelCodigoVF.setBounds(10, 11, 314, 53);
        jPanelCodigoVF.getAccessibleContext().setAccessibleName("Código:");

        jPanelNombreVF.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanelNombreVF.setPreferredSize(new java.awt.Dimension(786, 50));
        jPanelNombreVF.setLayout(null);

        jTextFieldNombreVF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelNombreVF.add(jTextFieldNombreVF);
        jTextFieldNombreVF.setBounds(16, 16, 515, 30);

        jPanel48.add(jPanelNombreVF);
        jPanelNombreVF.setBounds(10, 70, 560, 53);

        jPanelCarreraVF.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrera"));
        jPanelCarreraVF.setPreferredSize(new java.awt.Dimension(206, 50));
        jPanelCarreraVF.setLayout(null);
        jPanelCarreraVF.add(jTextFieldCarreraVF);
        jTextFieldCarreraVF.setBounds(16, 16, 350, 30);

        jPanel48.add(jPanelCarreraVF);
        jPanelCarreraVF.setBounds(10, 129, 394, 53);

        jPanelSemestreVF.setBorder(javax.swing.BorderFactory.createTitledBorder("Semestre:"));
        jPanelSemestreVF.setPreferredSize(new java.awt.Dimension(206, 50));
        jPanelSemestreVF.setLayout(null);

        jComboBoxSemestreVF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        jComboBoxSemestreVF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSemestreVFActionPerformed(evt);
            }
        });
        jPanelSemestreVF.add(jComboBoxSemestreVF);
        jComboBoxSemestreVF.setBounds(16, 16, 80, 30);

        jPanel48.add(jPanelSemestreVF);
        jPanelSemestreVF.setBounds(10, 188, 109, 53);

        jPanelNSSVF.setBorder(javax.swing.BorderFactory.createTitledBorder("NSS:"));
        jPanelNSSVF.setPreferredSize(new java.awt.Dimension(205, 50));
        jPanelNSSVF.setLayout(null);
        jPanelNSSVF.add(jTextFieldNSSVF);
        jTextFieldNSSVF.setBounds(16, 16, 230, 30);

        jPanel48.add(jPanelNSSVF);
        jPanelNSSVF.setBounds(10, 247, 283, 53);

        jPanelTelVF.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfono:"));
        jPanelTelVF.setPreferredSize(new java.awt.Dimension(12, 50));
        jPanelTelVF.setLayout(null);
        jPanelTelVF.add(jTextFieldTelVF);
        jTextFieldTelVF.setBounds(16, 16, 230, 30);

        jPanel48.add(jPanelTelVF);
        jPanelTelVF.setBounds(10, 306, 283, 53);

        jPanelAlergiasVF.setBorder(javax.swing.BorderFactory.createTitledBorder("Alergias:"));
        jPanelAlergiasVF.setLayout(null);
        jPanelAlergiasVF.add(jTextFieldAlergiasVF);
        jTextFieldAlergiasVF.setBounds(16, 16, 337, 30);

        jPanel48.add(jPanelAlergiasVF);
        jPanelAlergiasVF.setBounds(10, 424, 0, 0);
        jPanel48.add(lblImagen);
        lblImagen.setBounds(630, 60, 100, 100);

        jButtonCargarImgVF.setText("Cargar");
        jButtonCargarImgVF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarImgVFActionPerformed(evt);
            }
        });
        jPanel48.add(jButtonCargarImgVF);
        jButtonCargarImgVF.setBounds(750, 100, 73, 23);

        jButtonGuardarVF.setText("Guardar");
        jButtonGuardarVF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarVFActionPerformed(evt);
            }
        });
        jPanel48.add(jButtonGuardarVF);
        jButtonGuardarVF.setBounds(370, 510, 100, 23);

        jPanelEmailVF.setBorder(javax.swing.BorderFactory.createTitledBorder("Email:"));
        jPanelEmailVF.setLayout(null);
        jPanelEmailVF.add(jTextFieldEmailVF);
        jTextFieldEmailVF.setBounds(16, 16, 340, 30);

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanelEmailVF.add(jPanel99);
        jPanel99.setBounds(6, 54, 77, 35);

        jPanel48.add(jPanelEmailVF);
        jPanelEmailVF.setBounds(10, 430, 394, 53);

        jPanelDirVF.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección:"));
        jPanelDirVF.setLayout(null);
        jPanelDirVF.add(jTextFieldDirVF);
        jTextFieldDirVF.setBounds(16, 16, 340, 30);

        javax.swing.GroupLayout jPanel101Layout = new javax.swing.GroupLayout(jPanel101);
        jPanel101.setLayout(jPanel101Layout);
        jPanel101Layout.setHorizontalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel101Layout.setVerticalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanelDirVF.add(jPanel101);
        jPanel101.setBounds(6, 54, 77, 35);

        jPanel48.add(jPanelDirVF);
        jPanelDirVF.setBounds(10, 365, 394, 53);

        jTabbedPane15.addTab("Registros", jPanel48);

        jTConsultaVF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTConsultaVF.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jTConsultaVFComponentRemoved(evt);
            }
        });
        jTConsultaVF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTConsultaVFMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTConsultaVF);

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane15.addTab("Consultas", jPanel96);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane15)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane15)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Intercentros", jPanel15);

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane16.addTab("Registros", jPanel50);

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane16.addTab("Constancias", jPanel51);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane16)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Talleres", jPanel16);

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane17.addTab("Registros ", jPanel52);

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane17.addTab("Constancias", jPanel53);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane17)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Intersedes", jPanel17);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Voleibol Femenil", jPanel3);

        jPanel97.setLayout(null);

        jPanelCodigoVV.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jPanelCodigoVV.setPreferredSize(new java.awt.Dimension(202, 50));
        jPanelCodigoVV.setLayout(null);

        jTextFieldCodigoVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoVVActionPerformed(evt);
            }
        });
        jPanelCodigoVV.add(jTextFieldCodigoVV);
        jTextFieldCodigoVV.setBounds(16, 16, 270, 30);

        jPanel97.add(jPanelCodigoVV);
        jPanelCodigoVV.setBounds(10, 11, 314, 53);

        jPanelNombreVV.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanelNombreVV.setPreferredSize(new java.awt.Dimension(786, 50));
        jPanelNombreVV.setLayout(null);

        jTextFieldNombreVV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelNombreVV.add(jTextFieldNombreVV);
        jTextFieldNombreVV.setBounds(16, 16, 515, 30);

        jPanel97.add(jPanelNombreVV);
        jPanelNombreVV.setBounds(10, 70, 560, 53);

        jPanelCarreraVV.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrera"));
        jPanelCarreraVV.setPreferredSize(new java.awt.Dimension(206, 50));
        jPanelCarreraVV.setLayout(null);
        jPanelCarreraVV.add(jTextFieldCarreraVV);
        jTextFieldCarreraVV.setBounds(16, 16, 350, 30);

        jPanel97.add(jPanelCarreraVV);
        jPanelCarreraVV.setBounds(10, 129, 394, 53);

        jPanelSemestreVV.setBorder(javax.swing.BorderFactory.createTitledBorder("Semestre:"));
        jPanelSemestreVV.setPreferredSize(new java.awt.Dimension(206, 50));
        jPanelSemestreVV.setLayout(null);

        jComboBoxSemestreVV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        jComboBoxSemestreVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSemestreVVActionPerformed(evt);
            }
        });
        jPanelSemestreVV.add(jComboBoxSemestreVV);
        jComboBoxSemestreVV.setBounds(16, 16, 80, 30);

        jPanel97.add(jPanelSemestreVV);
        jPanelSemestreVV.setBounds(10, 188, 109, 53);

        jPanelNSSVV.setBorder(javax.swing.BorderFactory.createTitledBorder("NSS:"));
        jPanelNSSVV.setPreferredSize(new java.awt.Dimension(205, 50));
        jPanelNSSVV.setLayout(null);
        jPanelNSSVV.add(jTextFieldNSSVV);
        jTextFieldNSSVV.setBounds(16, 16, 230, 30);

        jPanel97.add(jPanelNSSVV);
        jPanelNSSVV.setBounds(10, 247, 283, 53);

        jPanelTelVV.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfono:"));
        jPanelTelVV.setPreferredSize(new java.awt.Dimension(12, 50));
        jPanelTelVV.setLayout(null);
        jPanelTelVV.add(jTextFieldTelVV);
        jTextFieldTelVV.setBounds(16, 16, 230, 30);

        jPanel97.add(jPanelTelVV);
        jPanelTelVV.setBounds(10, 306, 283, 53);

        jPanelAlergiasVF2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alergias:"));
        jPanelAlergiasVF2.setLayout(null);
        jPanelAlergiasVF2.add(jTextFieldAlergiasVF2);
        jTextFieldAlergiasVF2.setBounds(16, 16, 337, 30);

        jPanel97.add(jPanelAlergiasVF2);
        jPanelAlergiasVF2.setBounds(10, 424, 0, 0);
        jPanel97.add(lblImagen1);
        lblImagen1.setBounds(630, 60, 100, 100);

        jButtonCargarImgVV.setText("Cargar");
        jButtonCargarImgVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarImgVVActionPerformed(evt);
            }
        });
        jPanel97.add(jButtonCargarImgVV);
        jButtonCargarImgVV.setBounds(750, 100, 73, 23);

        jButtonGuardarVV.setText("Guardar");
        jButtonGuardarVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarVVActionPerformed(evt);
            }
        });
        jPanel97.add(jButtonGuardarVV);
        jButtonGuardarVV.setBounds(370, 510, 100, 23);

        jPanelEmailVV.setBorder(javax.swing.BorderFactory.createTitledBorder("Email:"));
        jPanelEmailVV.setLayout(null);
        jPanelEmailVV.add(jTextFieldEmailVV);
        jTextFieldEmailVV.setBounds(16, 16, 340, 30);

        javax.swing.GroupLayout jPanel100Layout = new javax.swing.GroupLayout(jPanel100);
        jPanel100.setLayout(jPanel100Layout);
        jPanel100Layout.setHorizontalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel100Layout.setVerticalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanelEmailVV.add(jPanel100);
        jPanel100.setBounds(6, 54, 77, 35);

        jPanel97.add(jPanelEmailVV);
        jPanelEmailVV.setBounds(10, 430, 394, 53);

        jPanelDirVV.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección:"));
        jPanelDirVV.setLayout(null);
        jPanelDirVV.add(jTextFieldDirVV);
        jTextFieldDirVV.setBounds(16, 16, 340, 30);

        javax.swing.GroupLayout jPanel102Layout = new javax.swing.GroupLayout(jPanel102);
        jPanel102.setLayout(jPanel102Layout);
        jPanel102Layout.setHorizontalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel102Layout.setVerticalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanelDirVV.add(jPanel102);
        jPanel102.setBounds(6, 54, 77, 35);

        jPanel97.add(jPanelDirVV);
        jPanelDirVV.setBounds(10, 365, 394, 53);

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
            .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel54Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
            .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel54Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane18.addTab("Registros", jPanel54);

        jTConsultaVV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTConsultaVV);

        jTabbedPane18.addTab("Consultas", jScrollPane2);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane18)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Intercentros", jPanel18);

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane19.addTab("Registros", jPanel56);

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane19.addTab("Constancias", jPanel57);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(540, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Talleres", jPanel19);

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane20.addTab("Registros", jPanel58);

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane20.addTab("Constancias", jPanel59);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane20)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Intersedes", jPanel20);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Voleibol Varonil", jPanel4);

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane21.addTab("Registros", jPanel60);

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane21.addTab("Constancias", jPanel61);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Intercentros", jPanel21);

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane22.addTab("Registros ", jPanel62);

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane22.addTab("Constancias", jPanel63);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Talleres", jPanel22);

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane23.addTab("Registros", jPanel64);

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane23.addTab("Constancias", jPanel65);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Intersedes", jPanel23);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(508, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Futbol Femenil", jPanel5);

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane24.addTab("Intercentros", jPanel66);

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane24.addTab("Talleres", jPanel67);

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane24.addTab("Intersedes", jPanel68);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Intercentros", jPanel24);

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane25.addTab("Registros ", jPanel69);

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane25.addTab("Constancias", jPanel70);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Talleres", jPanel25);

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane26.addTab("Registros", jPanel71);

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane26.addTab("Constancias", jPanel72);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Intersedes", jPanel26);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(515, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Futbol Varonil", jPanel6);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Intercentros", jPanel27);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Talleres", jPanel28);

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane27.addTab("Registros", jPanel73);

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane27.addTab("Constancias", jPanel74);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Intersedes", jPanel29);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(487, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Futbol Bardas", jPanel7);

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane36.addTab("Registros", jPanel91);

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane36.addTab("Constancias", jPanel92);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Intercentros", jPanel30);

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane37.addTab("Registros", jPanel93);

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane37.addTab("Constancias", jPanel94);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Talleres", jPanel31);

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane28.addTab("Registros", jPanel75);

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane28.addTab("Constancias", jPanel76);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Intersedes", jPanel32);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Basketball Femenil", jPanel8);

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane30.addTab("Registros", jPanel79);

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane30.addTab("Constancias", jPanel80);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Intercentros", jPanel33);

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane31.addTab("Registros", jPanel81);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane31.addTab("Constancias", jPanel82);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Talleres", jPanel34);

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane29.addTab("Registros", jPanel77);

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane29.addTab("Constancias", jPanel78);

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane9.addTab("Intersedes", jPanel35);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Basketball Varonil", jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane33.addTab("Registros", jPanel85);

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane33.addTab("Constancias", jPanel86);

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane10.addTab("Intercentros", jPanel36);

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane34.addTab("Registros", jPanel87);

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane34.addTab("Constancias", jPanel88);

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane10.addTab("Talleres", jPanel37);

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane32.addTab("Registros", jPanel83);

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane32.addTab("Constancias", jPanel84);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane10.addTab("Intersedes", jPanel38);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Beisbol", jPanel10);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jTabbedPane11.addTab("Intercentros", jPanel39);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jTabbedPane11.addTab("Talleres", jPanel40);

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane35.addTab("Registros", jPanel89);

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane35.addTab("Constancias", jPanel90);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane11.addTab("Intersedes", jPanel41);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(488, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Taekwondo", jPanel1);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane12.addTab("Registros", jPanel42);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane12.addTab("Constancias", jPanel43);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Intercentros", jPanel12);

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane13.addTab("Registros", jPanel44);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane13.addTab("Constancias", jPanel45);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Talleres", jPanel13);

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane14.addTab("Registros ", jPanel46);

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane14.addTab("Constancias", jPanel47);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Intersedes", jPanel14);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(447, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(496, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Box", jPanel11);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoVFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoVFActionPerformed

    }//GEN-LAST:event_jTextFieldCodigoVFActionPerformed
//Boton para cargar imagen
    private void jButtonCargarImgVFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarImgVFActionPerformed
        try {
            JFileChooser buscador = new JFileChooser(); //Objeto que sirve para buscar en el explorador
            //Objetos que sirven para las extensiones que vamos a buscar
            FileNameExtensionFilter extensiones = new FileNameExtensionFilter("PNG & JPG & GIF", "png", "jpg", "gif");
            //El titulo que aparecera cuando busques la imagen
            buscador.setDialogTitle("Selecciona tu imagen");
            //Tipo de extensiones que va a buscar 
            buscador.setFileFilter(extensiones);
            //Guarda el valor numerico si es aceptar o es cancelar
            int band = buscador.showOpenDialog(this);
            //Pregunta si la busueda fue aceptar
            if (band==JFileChooser.APPROVE_OPTION){
                //La imagen que selecciones se va a guardar en la variable archivo
                archivo = buscador.getSelectedFile();
                //Creamos un objeto de tipo imagen y le cargmos la imagen que seleccionamos
                ImageIcon imag = new ImageIcon(archivo.getAbsolutePath());
                //Moldear la imagen al tamaño del label que pusimos
                lblImagen.setIcon(new ImageIcon(imag.getImage().getScaledInstance(lblImagen.getWidth(),lblImagen.getHeight(),Image.SCALE_SMOOTH)));
            }
            }catch (HeadlessException e){
                JOptionPane.showMessageDialog(this,e,"Error al cargar imagen",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCargarImgVFActionPerformed
//Boton para guardar
    private void jButtonGuardarVFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarVFActionPerformed
        String sql = "INSERT INTO datospersonales(dp_codigo, dp_nombre, dp_carrera, dp_semestre, dp_disciplina, dp_nss, dp_tel, dp_dir, dp_email, dp_foto) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
        if(archivo != null){ 
            guardar(sql, archivo);
            JOptionPane.showMessageDialog(this, "Se ha registrado un nuevo usuario con foto","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);
            lblImagen.setIcon(null);
        }else {
            File sinFoto = new File("src/images/sinFoto.jpg");
            guardar(sql, sinFoto);
            JOptionPane.showMessageDialog(this, "Se ha registrado un nuevo usuario sin foto","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);
            lblImagen.setIcon(null);
        }
        archivo = null;
        consultaVF("SELECT * FROM datospersonales");
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e,"Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarVFActionPerformed

    private void jComboBoxSemestreVFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSemestreVFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSemestreVFActionPerformed

    private void jButtonGuardarVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarVVActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT INTO datospersonales(dp_codigo, dp_nombre, dp_carrera, dp_semestre, dp_disciplina, dp_nss, dp_tel, dp_dir, dp_email, dp_foto) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            if(archivo != null){
                guardar(sql, archivo);
                JOptionPane.showMessageDialog(this, "Se ha registrado un nuevo usuario con foto","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);
                lblImagen1.setIcon(null);
            }else {
                File sinFoto = new File("src/images/sinFoto.jpg");
                guardar(sql, sinFoto);
                JOptionPane.showMessageDialog(this, "Se ha registrado un nuevo usuario sin foto","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);
                lblImagen1.setIcon(null);
            }
            archivo = null;
            consultaVF("SELECT * FROM datospersonales");
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e,"Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarVVActionPerformed

    private void jButtonCargarImgVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarImgVVActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser buscador = new JFileChooser(); //Objeto que sirve para buscar en el explorador
            //Objetos que sirven para las extensiones que vamos a buscar
            FileNameExtensionFilter extensiones = new FileNameExtensionFilter("PNG & JPG & GIF", "png", "jpg", "gif");
            //El titulo que aparecera cuando busques la imagen
            buscador.setDialogTitle("Selecciona tu imagen");
            //Tipo de extensiones que va a buscar
            buscador.setFileFilter(extensiones);
            //Guarda el valor numerico si es aceptar o es cancelar
            int band = buscador.showOpenDialog(this);
            //Pregunta si la busueda fue aceptar
            if (band==JFileChooser.APPROVE_OPTION){
                //La imagen que selecciones se va a guardar en la variable archivo
                archivo = buscador.getSelectedFile();
                //Creamos un objeto de tipo imagen y le cargmos la imagen que seleccionamos
                ImageIcon imag = new ImageIcon(archivo.getAbsolutePath());
                //Moldear la imagen al tamaño del label que pusimos
                lblImagen1.setIcon(new ImageIcon(imag.getImage().getScaledInstance(lblImagen1.getWidth(),lblImagen1.getHeight(),Image.SCALE_SMOOTH)));
            }
        }catch (HeadlessException e){
            JOptionPane.showMessageDialog(this,e,"Error al cargar imagen",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCargarImgVVActionPerformed

    private void jComboBoxSemestreVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSemestreVVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSemestreVVActionPerformed

    private void jTextFieldCodigoVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoVVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoVVActionPerformed

    private void jTConsultaVFComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTConsultaVFComponentRemoved
        try{
        int fila = jTConsultaVF.getSelectedRow();
        //String datos [] = new String [7],id="";
        String cod="", nom="", carrera="", sem="", disc="", nss="", tel="", dir="", email="";
        //for (int i = 0; i < 7; i++) {
           // datos[i]=jTConsultaVF.getValueAt(fila, i+1).toString();
        //}
        cod = jTConsultaVF.getValueAt(fila, 0).toString();
        nom = jTConsultaVF.getValueAt(fila, 1).toString();
        carrera = jTConsultaVF.getValueAt(fila, 2).toString();
        sem = jTConsultaVF.getValueAt(fila, 3).toString();
        disc = jTConsultaVF.getValueAt(fila, 4).toString();
        nss = jTConsultaVF.getValueAt(fila, 5).toString();
        tel = jTConsultaVF.getValueAt(fila, 6).toString();
        dir = jTConsultaVF.getValueAt(fila, 7).toString();
        email = jTConsultaVF.getValueAt(fila, 8).toString();
        
        sql = "UPDATE datospersonales SET dp_codigo = '"+cod+"'"+",dp_nombre = '"+nom+"'"+",dp_carrera = '"+carrera+"'"+",dp_semestre = '"+sem+"'"+",dp_disciplina = '"+disc+"'"+",dp_nss = '"+nss+"'"+",dp_tel = '"+tel+"'"+",dp_dir = '"+dir+"'"+",dp_email = '"+email+"'"+cod;
        query.execute(sql);
        consultas("SELECT * FROM datospersonales");
        } catch(SQLException e){
            String tit ="Error en la actualizacion de la base de datos";
            int msj = JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(this, e, tit, msj);
        }
    }//GEN-LAST:event_jTConsultaVFComponentRemoved

    private void jTConsultaVFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTConsultaVFMouseClicked
        if(evt.getButton() == 3){
            POPEliminar.show(jTConsultaVF, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTConsultaVFMouseClicked

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        try {
        String msj="¿Desea eliminar el dato?", tit="Eliminación de datos";
        int tipo = JOptionPane.WARNING_MESSAGE;
        int opc = JOptionPane.showConfirmDialog(this, msj, tit, tipo);
        
        if(opc == 0){
            int fila = jTConsultaVF.getSelectedRow();
            String cod = jTConsultaVF.getValueAt(fila, 0).toString();
            
            sql = "DELETE FROM datospersonales WHERE dp_cod ="+cod;
            query.execute(sql);
            
            msj = "Dato eliminado correctamente";
            tit = "Operación correcta";
            JOptionPane.showMessageDialog(this, msj, tit, JOptionPane.INFORMATION_MESSAGE);
        } else {
           msj = "Operación cancelada";
           tit = "Operación cancelada";
           JOptionPane.showMessageDialog(this, msj, tit, JOptionPane.INFORMATION_MESSAGE); 
        }
        }catch (SQLException e){
            String tit="Error en la eliminación";
            int tipo = JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(this, e, tit, tipo);
        }
    }//GEN-LAST:event_menuEliminarActionPerformed

    //Zona de metodos 
    //Metodo que guarda un registro
    public void guardar(String sql, File archivo){
        try{
            //Abrir una conexion a la base de datos con la que se trabajara, el parametro es una instruccion de INSERT
            Query = conectar.prepareStatement(sql);
            file = new FileInputStream(archivo);
            
            Query.setString(1, jTextFieldCodigoVF.getText());
            jTextFieldCodigoVF.setText(null);
            
            Query.setString(2, jTextFieldNombreVF.getText());
            jTextFieldNombreVF.setText(null);
            
            Query.setString(3, jTextFieldCarreraVF.getText());
            jTextFieldCarreraVF.setText(null);
            
            String sem = this.jComboBoxSemestreVF.getSelectedItem().toString();//Seleccion de combo box
            //Integer semAux = Integer.parseInt(sem);
            jComboBoxSemestreVF.removeAllItems();//Vacia el combo box
            jComboBoxSemestreVF.addItem("1");
            jComboBoxSemestreVF.addItem("2");
            jComboBoxSemestreVF.addItem("3");
            jComboBoxSemestreVF.addItem("4");
            jComboBoxSemestreVF.addItem("5");
            jComboBoxSemestreVF.addItem("6");
            jComboBoxSemestreVF.addItem("7");
            jComboBoxSemestreVF.addItem("8");
            jComboBoxSemestreVF.addItem("9");
            Query.setString(4, sem);
            
            Query.setString(5, "Voleibol Femenil");
            
            Query.setString(6, jTextFieldNSSVF.getText());
            jTextFieldNSSVF.setText(null);
            
            Query.setString(7, jTextFieldTelVF.getText());
            jTextFieldTelVF.setText(null);
            
            Query.setString(8, jTextFieldDirVF.getText());
            jTextFieldDirVF.setText(null);
            
            Query.setString(9, jTextFieldEmailVF.getText());
            jTextFieldEmailVF.setText(null); 
            
            Query.setBinaryStream(10, file,(int)archivo.length());
            
            Query.execute();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(this, e,"Error al guardar los datos",JOptionPane.ERROR_MESSAGE);
        } catch(FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(this, fnfe,"Error al obtener la imagen",JOptionPane.ERROR_MESSAGE);
        } 
        try{
            //Abrir una conexion a la base de datos con la que se trabajara, el parametro es una instruccion de INSERT
            Query = conectar.prepareStatement(sql);
            file = new FileInputStream(archivo);
            
            Query.setString(1, jTextFieldCodigoVV.getText());
            jTextFieldCodigoVV.setText(null);
            
            Query.setString(2, jTextFieldNombreVV.getText());
            jTextFieldNombreVV.setText(null);
            
            Query.setString(3, jTextFieldCarreraVV.getText());
            jTextFieldCarreraVV.setText(null);
            
            String sem = this.jComboBoxSemestreVV.getSelectedItem().toString();//Seleccion de combo box
            //Integer semAux = Integer.parseInt(sem);
            jComboBoxSemestreVV.removeAllItems();//Vacia el combo box
            jComboBoxSemestreVV.addItem("1");
            jComboBoxSemestreVV.addItem("2");
            jComboBoxSemestreVV.addItem("3");
            jComboBoxSemestreVV.addItem("4");
            jComboBoxSemestreVV.addItem("5");
            jComboBoxSemestreVV.addItem("6");
            jComboBoxSemestreVV.addItem("7");
            jComboBoxSemestreVV.addItem("8");
            jComboBoxSemestreVV.addItem("9");
            Query.setString(4, sem);
            
            Query.setString(5, "Voleibol Varonil");
            
            Query.setString(6, jTextFieldNSSVV.getText());
            jTextFieldNSSVV.setText(null);
            
            Query.setString(7, jTextFieldTelVV.getText());
            jTextFieldTelVV.setText(null);
            
            Query.setString(8, jTextFieldDirVV.getText());
            jTextFieldDirVV.setText(null);
            
            Query.setString(9, jTextFieldEmailVV.getText());
            jTextFieldEmailVV.setText(null); 
            
            Query.setBinaryStream(10, file,(int)archivo.length());
            
            Query.execute();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(this, e,"Error al guardar los datos",JOptionPane.ERROR_MESSAGE);
        } catch(FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(this, fnfe,"Error al obtener la imagen",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Con este codigo cargan el Driver
            //El codigo de abajo le dicen a donde quieren que se conecte, la BD, el usuario y la contraseña
            conectar = DriverManager.getConnection("jdbc:mysql://127.0.0.1/deportes", "root", "");
            JOptionPane.showMessageDialog(null, "Aplicación conectada con exito", "Base de Datos para Deportes", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
//            Esta primer excepción es por si falla algo en la conexión
            JOptionPane.showMessageDialog(null, e, "Base de datos no encontrada", JOptionPane.WARNING_MESSAGE);
        } catch (ClassNotFoundException ce) {
//            Esta segunda excepción es por si no encuentra el Driver
            JOptionPane.showMessageDialog(null, ce, "No se encontro el Driver", JOptionPane.WARNING_MESSAGE);
        }
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public void creacionTablas(){
        DTConsultaVF = new DefaultTableModel();//Es el que nos va a permitir editar la tabla
        this.jTConsultaVF.setModel(DTConsultaVF);//Le deciamos a la tabla que variable va ser la que lo va a poder editar
        DTConsultaVF.setColumnIdentifiers(new Object[]{
        "Codigo",
        "Nombre",
        "Carrera",
        "Semestre",
        "Disciplina",
        "NSS",
        "Teléfono",
        "Dirección",
        "Email"
    });
        DTConsultaVV = new DefaultTableModel();//Es el que nos va a permitir editar la tabla
        this.jTConsultaVV.setModel(DTConsultaVV);//Le deciamos a la tabla que variable va ser la que lo va a poder editar
        DTConsultaVV.setColumnIdentifiers(new Object[]{
        "Codigo",
        "Nombre",
        "Carrera",
        "Semestre",
        "Disciplina",
        "NSS",
        "Teléfono",
        "Dirección",
        "Email"
    });
    }
    
    //Consultas
    public void consultaVF(String sql){
        try {
            while (DTConsultaVF.getRowCount()>0){
                DTConsultaVF.removeRow(0);
            }
            resultado = query.executeQuery(sql);
            while (resultado.next()){
                DTConsultaVF.addRow(new Object[]{
                    resultado.getString("dp_codigo"),
                    resultado.getString("dp_nombre"),
                    resultado.getString("dp_carrera"),
                    resultado.getString("dp_semestre"),
                    resultado.getString("dp_disciplina"),
                    resultado.getString("dp_nss"),
                    resultado.getString("dp_tel"),
                    resultado.getString("dp_dir"),
                    resultado.getString("dp_email"),                    
                });
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, e, "Error en la consulta",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void consultaVV(String sql){
        try {
            while (DTConsultaVV.getRowCount()>0){
                DTConsultaVV.removeRow(0);
            }
            resultado = query.executeQuery(sql);
            while (resultado.next()){
                DTConsultaVV.addRow(new Object[]{
                    resultado.getString("dp_codigo"),
                    resultado.getString("dp_nombre"),
                    resultado.getString("dp_carrera"),
                    resultado.getString("dp_semestre"),
                    resultado.getString("dp_disciplina"),
                    resultado.getString("dp_nss"),
                    resultado.getString("dp_tel"),
                    resultado.getString("dp_dir"),
                    resultado.getString("dp_email"),                    
                });
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, e, "Error en la consulta",JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu POPEliminar;
    private javax.swing.JButton jButtonCargarImgVF;
    private javax.swing.JButton jButtonCargarImgVV;
    private javax.swing.JButton jButtonGuardarVF;
    private javax.swing.JButton jButtonGuardarVV;
    private javax.swing.JComboBox<String> jComboBoxSemestreVF;
    private javax.swing.JComboBox<String> jComboBoxSemestreVV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JPanel jPanelAlergiasVF;
    private javax.swing.JPanel jPanelAlergiasVF2;
    private javax.swing.JPanel jPanelCarreraVF;
    private javax.swing.JPanel jPanelCarreraVV;
    private javax.swing.JPanel jPanelCodigoVF;
    private javax.swing.JPanel jPanelCodigoVV;
    private javax.swing.JPanel jPanelDirVF;
    private javax.swing.JPanel jPanelDirVV;
    private javax.swing.JPanel jPanelEmailVF;
    private javax.swing.JPanel jPanelEmailVV;
    private javax.swing.JPanel jPanelNSSVF;
    private javax.swing.JPanel jPanelNSSVV;
    private javax.swing.JPanel jPanelNombreVF;
    private javax.swing.JPanel jPanelNombreVV;
    private javax.swing.JPanel jPanelSemestreVF;
    private javax.swing.JPanel jPanelSemestreVV;
    private javax.swing.JPanel jPanelTelVF;
    private javax.swing.JPanel jPanelTelVV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTConsultaVF;
    private javax.swing.JTable jTConsultaVV;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane12;
    private javax.swing.JTabbedPane jTabbedPane13;
    private javax.swing.JTabbedPane jTabbedPane14;
    private javax.swing.JTabbedPane jTabbedPane15;
    private javax.swing.JTabbedPane jTabbedPane16;
    private javax.swing.JTabbedPane jTabbedPane17;
    private javax.swing.JTabbedPane jTabbedPane18;
    private javax.swing.JTabbedPane jTabbedPane19;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane20;
    private javax.swing.JTabbedPane jTabbedPane21;
    private javax.swing.JTabbedPane jTabbedPane22;
    private javax.swing.JTabbedPane jTabbedPane23;
    private javax.swing.JTabbedPane jTabbedPane24;
    private javax.swing.JTabbedPane jTabbedPane25;
    private javax.swing.JTabbedPane jTabbedPane26;
    private javax.swing.JTabbedPane jTabbedPane27;
    private javax.swing.JTabbedPane jTabbedPane28;
    private javax.swing.JTabbedPane jTabbedPane29;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane30;
    private javax.swing.JTabbedPane jTabbedPane31;
    private javax.swing.JTabbedPane jTabbedPane32;
    private javax.swing.JTabbedPane jTabbedPane33;
    private javax.swing.JTabbedPane jTabbedPane34;
    private javax.swing.JTabbedPane jTabbedPane35;
    private javax.swing.JTabbedPane jTabbedPane36;
    private javax.swing.JTabbedPane jTabbedPane37;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JTextField jTextFieldAlergiasVF;
    private javax.swing.JTextField jTextFieldAlergiasVF2;
    private javax.swing.JTextField jTextFieldCarreraVF;
    private javax.swing.JTextField jTextFieldCarreraVV;
    private javax.swing.JTextField jTextFieldCodigoVF;
    private javax.swing.JTextField jTextFieldCodigoVV;
    private javax.swing.JTextField jTextFieldDirVF;
    private javax.swing.JTextField jTextFieldDirVV;
    private javax.swing.JTextField jTextFieldEmailVF;
    private javax.swing.JTextField jTextFieldEmailVV;
    private javax.swing.JTextField jTextFieldNSSVF;
    private javax.swing.JTextField jTextFieldNSSVV;
    private javax.swing.JTextField jTextFieldNombreVF;
    private javax.swing.JTextField jTextFieldNombreVV;
    private javax.swing.JTextField jTextFieldTelVF;
    private javax.swing.JTextField jTextFieldTelVV;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JMenuItem menuEliminar;
    // End of variables declaration//GEN-END:variables

    private void consultas(String select__from_datospersonales) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
