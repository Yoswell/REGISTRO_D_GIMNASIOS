package proyecto_n1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class GUIPrincipal extends javax.swing.JFrame {
    
    private int mouseX;
    private int mouseY;
    
    public int id, newId;
    public String nombre, newNombre;
    public int canM, canC, newCanM, newCanC;
    public int idGenerado = 0;
    public boolean cross, newCross;
    public char validarNumeros;
    
    private ArrayList<RegistrarGS> listaInscripciones = new ArrayList<>();
    
    Metodos panel = new Metodos();
    DefaultTableModel modeloT1 = new DefaultTableModel();
    DefaultTableModel modeloT2 = new DefaultTableModel();
    DefaultTableModel modeloT3 = new DefaultTableModel();
    DefaultTableModel modeloT4 = new DefaultTableModel();

    public GUIPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Registro de Gimnasios");
        idTField.setText("0");
        
        jScrollPaneLista.getViewport().setBackground(new Color(248,239,229));
        jScrollPaneLista.setBorder(null);
        modeloT1.addColumn("Id");
        modeloT1.addColumn("Nombre");
        modeloT1.addColumn("Can_Maquinas");
        modeloT1.addColumn("Cossfit");
        modeloT1.addColumn("Can_Clientes");
        jTableLista.setModel(modeloT1);
 
        jScrollPaneLista.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPaneLista.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        JTableHeader header = jTableLista.getTableHeader();
        header.setBackground(new Color(239,199,110));
        header.getHeight();
        header.setBorder(new LineBorder(Color.white, 1));
        header.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        Dimension headerDimension = header.getPreferredSize();
        headerDimension.height = 30;
        header.setPreferredSize(headerDimension);
        
        jScrollPane1.getViewport().setBackground(new Color(248,239,229));
        jScrollPane1.setBorder(null);
        modeloT2.addColumn("Id");
        modeloT2.addColumn("Nombre");
        modeloT2.addColumn("Can_Maquinas");
        modeloT2.addColumn("Cossfit");
        modeloT2.addColumn("Can_Clientes");
        jTableBusqueda.setModel(modeloT2);
        
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        JTableHeader headerT2 = jTableBusqueda.getTableHeader();
        headerT2.setBackground(new Color(239,199,110));
        headerT2.getHeight();
        headerT2.setBorder(new LineBorder(Color.white, 1));
        headerT2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        Dimension headerDimensionT2 = headerT2.getPreferredSize();
        headerDimensionT2.height = 30;
        headerT2.setPreferredSize(headerDimensionT2);
        
        jScrollPane2.getViewport().setBackground(new Color(248,239,229));
        jScrollPane2.setBorder(null);
        modeloT3.addColumn("Id");
        modeloT3.addColumn("Nombre");
        modeloT3.addColumn("Can_Maquinas");
        modeloT3.addColumn("Cossfit");
        modeloT3.addColumn("Can_Clientes");
        jTableCompararValores.setModel(modeloT3);
        
        jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        JTableHeader headerT3 = jTableCompararValores.getTableHeader();
        headerT3.setBackground(new Color(239,199,110));
        headerT3.getHeight();
        headerT3.setBorder(new LineBorder(Color.white, 1));
        headerT3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        Dimension headerDimensionT3 = headerT3.getPreferredSize();
        headerDimensionT3.height = 30;
        headerT3.setPreferredSize(headerDimensionT3);
        
        jScrollPane3.getViewport().setBackground(new Color(248,239,229));
        jScrollPane3.setBorder(null);
        modeloT4.addColumn("Id");
        modeloT4.addColumn("Nombre");
        modeloT4.addColumn("Can_Maquinas");
        modeloT4.addColumn("Cossfit");
        modeloT4.addColumn("Can_Clientes");
        jTableOrdenarGimnasios.setModel(modeloT4);
        
        jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        JTableHeader headerT4 = jTableOrdenarGimnasios.getTableHeader();
        headerT4.setBackground(new Color(239,199,110));
        headerT4.getHeight();
        headerT4.setBorder(new LineBorder(Color.white, 1));
        headerT4.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        Dimension headerDimensionT4 = headerT4.getPreferredSize();
        headerDimensionT4.height = 30;
        headerT4.setPreferredSize(headerDimensionT4);
        
        panelListaGimnasios.setVisible(false);
        panelBuscarEditar.setVisible(false);
        panelCompararValores.setVisible(false);
        panelOrdenarGimnasios.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelListaGimnasios = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        verListaButtonClick = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jScrollPaneLista = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        panelBuscarEditar = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        buscarGymTField = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        buscarButton = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        guardarEdicionButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        newCrossCheck = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        newIdTField = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        newNombreTField = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        newCanMTField = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        iconoOptionPane2 = new javax.swing.JLabel();
        mensajeLabelBuscar = new javax.swing.JLabel();
        mensajeLabel7 = new javax.swing.JLabel();
        mensajeLabel8 = new javax.swing.JLabel();
        mensajeLabel9 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        newCanCTField = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBusqueda = new javax.swing.JTable();
        panelRegistrarGimnasio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        inscribirGButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        iconoOptionPane1 = new javax.swing.JLabel();
        mensajeLabel = new javax.swing.JLabel();
        mensajeLabel4 = new javax.swing.JLabel();
        mensajeLabel5 = new javax.swing.JLabel();
        mensajeLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        idTField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        nombreTField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        canMaquinasTField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        checkV = new javax.swing.JCheckBox();
        checkF = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        canClientesTField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        panelCompararValores = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        iconoOptionPane3 = new javax.swing.JLabel();
        mensajeLabelComparar = new javax.swing.JLabel();
        mensajeLabel10 = new javax.swing.JLabel();
        mensajeLabel11 = new javax.swing.JLabel();
        mensajeLabel12 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        compararVTField = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCompararValores = new javax.swing.JTable();
        jPanel37 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        buscarValoresButton = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        panelOrdenarGimnasios = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableOrdenarGimnasios = new javax.swing.JTable();
        jPanel41 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        ordenrPorNombreMergeButton = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        ordenarPorCanMaquinasMergeButton = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        ordenrPorNombreInserccionButton = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        ordenarPorCanMaquinasInserccionButton = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        iconoOptionPane4 = new javax.swing.JLabel();
        mensajeOrdenarLabel = new javax.swing.JLabel();
        mensajeLabel13 = new javax.swing.JLabel();
        mensajeLabel14 = new javax.swing.JLabel();
        mensajeLabel15 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cerrarGUIButton = new javax.swing.JButton();
        minimizarGUIButton = new javax.swing.JButton();
        minimizarGUIButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        logoGymLabel = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        registrarButton = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        verListaButton = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        editarButton = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        compararButton = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        ordenarButton = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        salirButton = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 239, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelListaGimnasios.setBackground(new java.awt.Color(248, 239, 229));
        panelListaGimnasios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(239, 199, 110));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verListaButtonClick.setBackground(new java.awt.Color(23, 23, 23));
        verListaButtonClick.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        verListaButtonClick.setForeground(new java.awt.Color(23, 23, 23));
        verListaButtonClick.setText("Ver lista de gimnasios suscritos");
        verListaButtonClick.setBorder(null);
        verListaButtonClick.setContentAreaFilled(false);
        verListaButtonClick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verListaButtonClick.setFocusPainted(false);
        verListaButtonClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaButtonClickActionPerformed(evt);
            }
        });
        jPanel20.add(verListaButtonClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 340, 40));

        panelListaGimnasios.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 370, 40));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        panelListaGimnasios.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, 60));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        panelListaGimnasios.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, -1, 60));

        jPanel33.setBackground(new java.awt.Color(246, 237, 172));
        jPanel33.setFocusable(false);
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneLista.setBackground(new java.awt.Color(248, 239, 229));
        jScrollPaneLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 237, 172)));
        jScrollPaneLista.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPaneLista.setFocusable(false);
        jScrollPaneLista.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jScrollPaneLista.setOpaque(false);

        jTableLista.setBackground(new java.awt.Color(248, 239, 229));
        jTableLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 239, 229)));
        jTableLista.setFont(new java.awt.Font("Constantia", 0, 16)); // NOI18N
        jTableLista.setForeground(new java.awt.Color(23, 23, 23));
        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableLista.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableLista.setFocusable(false);
        jTableLista.setGridColor(new java.awt.Color(248, 239, 229));
        jTableLista.setRequestFocusEnabled(false);
        jTableLista.setRowHeight(40);
        jTableLista.setRowMargin(2);
        jTableLista.setSelectionBackground(new java.awt.Color(246, 237, 172));
        jTableLista.setSelectionForeground(new java.awt.Color(23, 23, 23));
        jTableLista.setShowGrid(false);
        jTableLista.getTableHeader().setReorderingAllowed(false);
        jTableLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaMouseClicked(evt);
            }
        });
        jScrollPaneLista.setViewportView(jTableLista);

        jPanel33.add(jScrollPaneLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 420));

        panelListaGimnasios.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 780, 440));

        jPanel1.add(panelListaGimnasios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 640));

        panelBuscarEditar.setBackground(new java.awt.Color(248, 239, 229));
        panelBuscarEditar.setDoubleBuffered(false);
        panelBuscarEditar.setFocusable(false);
        panelBuscarEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarGymTField.setBackground(new java.awt.Color(255, 255, 255));
        buscarGymTField.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        buscarGymTField.setForeground(new java.awt.Color(102, 102, 102));
        buscarGymTField.setBorder(null);
        buscarGymTField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel21.add(buscarGymTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 480, 40));

        panelBuscarEditar.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 520, 40));

        jPanel22.setBackground(new java.awt.Color(239, 199, 110));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarButton.setBackground(new java.awt.Color(255, 51, 51));
        buscarButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        buscarButton.setForeground(new java.awt.Color(23, 23, 23));
        buscarButton.setText("Buscar Gimnasios");
        buscarButton.setAlignmentY(0.0F);
        buscarButton.setBorder(null);
        buscarButton.setContentAreaFilled(false);
        buscarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarButton.setFocusPainted(false);
        buscarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarButton.setMargin(new java.awt.Insets(2, 14, 2, 14));
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });
        jPanel22.add(buscarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, 20));

        panelBuscarEditar.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 180, 40));

        jPanel23.setBackground(new java.awt.Color(239, 199, 110));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guardarEdicionButton.setBackground(new java.awt.Color(255, 51, 51));
        guardarEdicionButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        guardarEdicionButton.setForeground(new java.awt.Color(23, 23, 23));
        guardarEdicionButton.setText("Guardar cambios");
        guardarEdicionButton.setAlignmentY(0.0F);
        guardarEdicionButton.setBorder(null);
        guardarEdicionButton.setContentAreaFilled(false);
        guardarEdicionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarEdicionButton.setFocusPainted(false);
        guardarEdicionButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardarEdicionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEdicionButtonActionPerformed(evt);
            }
        });
        jPanel23.add(guardarEdicionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        panelBuscarEditar.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 180, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        panelBuscarEditar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, -1, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        panelBuscarEditar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, -1, 60));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        panelBuscarEditar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, -1, 60));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        panelBuscarEditar.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, 60));

        jLabel62.setFont(new java.awt.Font("Constantia", 0, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(23, 23, 23));
        jLabel62.setText("Nombre del gimnasio a buscar");
        panelBuscarEditar.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 120, 220, -1));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newCrossCheck.setBackground(new java.awt.Color(255, 255, 255));
        newCrossCheck.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        newCrossCheck.setForeground(new java.awt.Color(102, 102, 102));
        newCrossCheck.setBorder(null);
        newCrossCheck.setContentAreaFilled(false);
        newCrossCheck.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        newCrossCheck.setFocusPainted(false);
        jPanel26.add(newCrossCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Si incluye");
        jPanel26.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        panelBuscarEditar.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 148, 40));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newIdTField.setEditable(false);
        newIdTField.setBackground(new java.awt.Color(255, 255, 255));
        newIdTField.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        newIdTField.setForeground(new java.awt.Color(102, 102, 102));
        newIdTField.setBorder(null);
        jPanel28.add(newIdTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 40));

        panelBuscarEditar.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 158, 40));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newNombreTField.setBackground(new java.awt.Color(255, 255, 255));
        newNombreTField.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        newNombreTField.setForeground(new java.awt.Color(102, 102, 102));
        newNombreTField.setBorder(null);
        jPanel29.add(newNombreTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        panelBuscarEditar.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 148, 40));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newCanMTField.setBackground(new java.awt.Color(255, 255, 255));
        newCanMTField.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        newCanMTField.setForeground(new java.awt.Color(102, 102, 102));
        newCanMTField.setBorder(null);
        newCanMTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newCanMTFieldKeyTyped(evt);
            }
        });
        jPanel30.add(newCanMTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        panelBuscarEditar.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 148, 40));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelBuscarEditar.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 60));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelBuscarEditar.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, 60));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelBuscarEditar.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, -1, 60));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelBuscarEditar.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, -1, 60));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelBuscarEditar.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 60));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelBuscarEditar.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 60));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setForeground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoOptionPane2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warning.png"))); // NOI18N
        jPanel31.add(iconoOptionPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        mensajeLabelBuscar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabelBuscar.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabelBuscar.setText("Mensajes de Dialogo");
        jPanel31.add(mensajeLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 530, 30));

        mensajeLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel7.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        mensajeLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel31.add(mensajeLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 20, 20));

        mensajeLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel8.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N
        mensajeLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel31.add(mensajeLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 20, 20));

        mensajeLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel9.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        mensajeLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel31.add(mensajeLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 20, 20));

        panelBuscarEditar.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 760, 50));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelBuscarEditar.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 60));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelBuscarEditar.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, 60));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newCanCTField.setBackground(new java.awt.Color(255, 255, 255));
        newCanCTField.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        newCanCTField.setForeground(new java.awt.Color(102, 102, 102));
        newCanCTField.setBorder(null);
        newCanCTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newCanCTFieldKeyTyped(evt);
            }
        });
        jPanel32.add(newCanCTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        panelBuscarEditar.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 150, 40));

        jPanel34.setBackground(new java.awt.Color(246, 237, 172));
        jPanel34.setEnabled(false);
        jPanel34.setFocusable(false);
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(248, 239, 229));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 237, 172)));
        jScrollPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jScrollPane1.setOpaque(false);

        jTableBusqueda.setBackground(new java.awt.Color(248, 239, 229));
        jTableBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 239, 229)));
        jTableBusqueda.setFont(new java.awt.Font("Constantia", 0, 16)); // NOI18N
        jTableBusqueda.setForeground(new java.awt.Color(23, 23, 23));
        jTableBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableBusqueda.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableBusqueda.setFocusable(false);
        jTableBusqueda.setGridColor(new java.awt.Color(248, 239, 229));
        jTableBusqueda.setRequestFocusEnabled(false);
        jTableBusqueda.setRowHeight(40);
        jTableBusqueda.setRowMargin(2);
        jTableBusqueda.setSelectionBackground(new java.awt.Color(246, 237, 172));
        jTableBusqueda.setSelectionForeground(new java.awt.Color(23, 23, 23));
        jTableBusqueda.setShowGrid(false);
        jTableBusqueda.getTableHeader().setReorderingAllowed(false);
        jTableBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBusquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBusqueda);

        jPanel34.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 230));

        panelBuscarEditar.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 780, 250));

        jPanel1.add(panelBuscarEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 640));

        panelRegistrarGimnasio.setBackground(new java.awt.Color(248, 239, 229));
        panelRegistrarGimnasio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 23, 23));
        jLabel2.setText("Cantidad promedio de clientes mensuales");
        panelRegistrarGimnasio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 23, 23));
        jLabel3.setText("ID del gimnasio a registrar");
        panelRegistrarGimnasio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(23, 23, 23));
        jLabel4.setText("Nombre del gimnasio a registrar");
        panelRegistrarGimnasio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 23, 23));
        jLabel5.setText("Cantidad de máquinas");
        panelRegistrarGimnasio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(23, 23, 23));
        jLabel6.setText("Incluye Crossfit");
        panelRegistrarGimnasio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jPanel4.setBackground(new java.awt.Color(239, 199, 110));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inscribirGButton.setBackground(new java.awt.Color(23, 23, 23));
        inscribirGButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        inscribirGButton.setForeground(new java.awt.Color(23, 23, 23));
        inscribirGButton.setText("Registrar Gimnasios");
        inscribirGButton.setBorder(null);
        inscribirGButton.setContentAreaFilled(false);
        inscribirGButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inscribirGButton.setFocusPainted(false);
        inscribirGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirGButtonActionPerformed(evt);
            }
        });
        jPanel4.add(inscribirGButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        panelRegistrarGimnasio.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 370, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoOptionPane1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warning.png"))); // NOI18N
        jPanel5.add(iconoOptionPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        mensajeLabel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel.setText("Mensajes de Dialogo");
        jPanel5.add(mensajeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 530, 30));

        mensajeLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel4.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        mensajeLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(mensajeLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 20, 20));

        mensajeLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel5.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N
        mensajeLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(mensajeLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 20, 20));

        mensajeLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel6.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        mensajeLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(mensajeLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 20, 20));

        panelRegistrarGimnasio.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 760, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idTField.setBackground(new java.awt.Color(255, 255, 255));
        idTField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        idTField.setForeground(new java.awt.Color(102, 102, 102));
        idTField.setBorder(null);
        jPanel6.add(idTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 460, 40));

        panelRegistrarGimnasio.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 490, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreTField.setBackground(new java.awt.Color(255, 255, 255));
        nombreTField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        nombreTField.setForeground(new java.awt.Color(102, 102, 102));
        nombreTField.setBorder(null);
        jPanel7.add(nombreTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 460, 40));

        panelRegistrarGimnasio.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 490, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        canMaquinasTField.setBackground(new java.awt.Color(255, 255, 255));
        canMaquinasTField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        canMaquinasTField.setForeground(new java.awt.Color(102, 102, 102));
        canMaquinasTField.setBorder(null);
        canMaquinasTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                canMaquinasTFieldKeyTyped(evt);
            }
        });
        jPanel8.add(canMaquinasTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 460, 40));

        panelRegistrarGimnasio.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 490, 40));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkV.setBackground(new java.awt.Color(255, 255, 255));
        checkV.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        checkV.setForeground(new java.awt.Color(102, 102, 102));
        checkV.setBorder(null);
        checkV.setContentAreaFilled(false);
        checkV.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        checkV.setFocusPainted(false);
        checkV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVActionPerformed(evt);
            }
        });
        jPanel9.add(checkV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 30));

        checkF.setBackground(new java.awt.Color(255, 255, 255));
        checkF.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        checkF.setForeground(new java.awt.Color(102, 102, 102));
        checkF.setBorder(null);
        checkF.setContentAreaFilled(false);
        checkF.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        checkF.setFocusPainted(false);
        checkF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFActionPerformed(evt);
            }
        });
        jPanel9.add(checkF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Verdadero");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Falso");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 30));

        panelRegistrarGimnasio.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 490, 90));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        canClientesTField.setBackground(new java.awt.Color(255, 255, 255));
        canClientesTField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        canClientesTField.setForeground(new java.awt.Color(102, 102, 102));
        canClientesTField.setBorder(null);
        canClientesTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                canClientesTFieldKeyTyped(evt);
            }
        });
        jPanel10.add(canClientesTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 40));

        panelRegistrarGimnasio.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 410, 40));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, 60));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, -1, 60));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, 60));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, -1, 60));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, 60));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, -1, 60));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, -1, 60));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 60));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, 60));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 60));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, -1, 60));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, 60));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, -1, 60));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, 60));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, 60));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 60));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, 60));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, -1, 60));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, -1, 60));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 60));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelRegistrarGimnasio.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, 60));

        jPanel1.add(panelRegistrarGimnasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 640));

        panelCompararValores.setBackground(new java.awt.Color(248, 239, 229));
        panelCompararValores.setDoubleBuffered(false);
        panelCompararValores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelCompararValores.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 60));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setForeground(new java.awt.Color(255, 255, 255));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoOptionPane3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warning.png"))); // NOI18N
        jPanel35.add(iconoOptionPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        mensajeLabelComparar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabelComparar.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabelComparar.setText("Mensajes de Dialogo");
        jPanel35.add(mensajeLabelComparar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 530, 30));

        mensajeLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel10.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        mensajeLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel35.add(mensajeLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 20, 20));

        mensajeLabel11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel11.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N
        mensajeLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel35.add(mensajeLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 20, 20));

        mensajeLabel12.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel12.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        mensajeLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel35.add(mensajeLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 20, 20));

        panelCompararValores.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 760, 50));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelCompararValores.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, 60));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelCompararValores.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, -1, 60));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        compararVTField.setBackground(new java.awt.Color(255, 255, 255));
        compararVTField.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        compararVTField.setForeground(new java.awt.Color(102, 102, 102));
        compararVTField.setBorder(null);
        compararVTField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        compararVTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                compararVTFieldKeyTyped(evt);
            }
        });
        jPanel36.add(compararVTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 450, 40));

        panelCompararValores.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 480, 40));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelCompararValores.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, 60));

        jLabel63.setFont(new java.awt.Font("Constantia", 0, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(23, 23, 23));
        jLabel63.setText("Cantidad de clientes por gimnasio");
        panelCompararValores.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 120, 260, -1));

        jScrollPane2.setBackground(new java.awt.Color(248, 239, 229));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 237, 172)));
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane2.setFocusable(false);
        jScrollPane2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jScrollPane2.setOpaque(false);

        jTableCompararValores.setBackground(new java.awt.Color(248, 239, 229));
        jTableCompararValores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 239, 229)));
        jTableCompararValores.setFont(new java.awt.Font("Constantia", 0, 16)); // NOI18N
        jTableCompararValores.setForeground(new java.awt.Color(23, 23, 23));
        jTableCompararValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCompararValores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableCompararValores.setFocusable(false);
        jTableCompararValores.setGridColor(new java.awt.Color(248, 239, 229));
        jTableCompararValores.setRequestFocusEnabled(false);
        jTableCompararValores.setRowHeight(40);
        jTableCompararValores.setRowMargin(2);
        jTableCompararValores.setSelectionBackground(new java.awt.Color(246, 237, 172));
        jTableCompararValores.setSelectionForeground(new java.awt.Color(23, 23, 23));
        jTableCompararValores.setShowGrid(false);
        jTableCompararValores.getTableHeader().setReorderingAllowed(false);
        jTableCompararValores.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jTableCompararValoresMouseWheelMoved(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCompararValores);

        panelCompararValores.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 760, 300));

        jPanel37.setBackground(new java.awt.Color(246, 237, 172));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        panelCompararValores.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 780, 320));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        panelCompararValores.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, -1, 60));

        jPanel38.setBackground(new java.awt.Color(239, 199, 110));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarValoresButton.setBackground(new java.awt.Color(255, 51, 51));
        buscarValoresButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        buscarValoresButton.setForeground(new java.awt.Color(23, 23, 23));
        buscarValoresButton.setText("Buscar Gimnasios");
        buscarValoresButton.setAlignmentY(0.0F);
        buscarValoresButton.setBorder(null);
        buscarValoresButton.setContentAreaFilled(false);
        buscarValoresButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarValoresButton.setFocusPainted(false);
        buscarValoresButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarValoresButton.setMargin(new java.awt.Insets(2, 14, 2, 14));
        buscarValoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarValoresButtonActionPerformed(evt);
            }
        });
        jPanel38.add(buscarValoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, 20));

        panelCompararValores.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 180, 40));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        panelCompararValores.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, 60));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelCompararValores.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 60));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelCompararValores.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 60));

        jPanel1.add(panelCompararValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 640));

        panelOrdenarGimnasios.setBackground(new java.awt.Color(248, 239, 229));
        panelOrdenarGimnasios.setDoubleBuffered(false);
        panelOrdenarGimnasios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBackground(new java.awt.Color(248, 239, 229));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 237, 172)));
        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane3.setFocusable(false);
        jScrollPane3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jScrollPane3.setOpaque(false);

        jTableOrdenarGimnasios.setBackground(new java.awt.Color(248, 239, 229));
        jTableOrdenarGimnasios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 239, 229)));
        jTableOrdenarGimnasios.setFont(new java.awt.Font("Constantia", 0, 16)); // NOI18N
        jTableOrdenarGimnasios.setForeground(new java.awt.Color(23, 23, 23));
        jTableOrdenarGimnasios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableOrdenarGimnasios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableOrdenarGimnasios.setFocusable(false);
        jTableOrdenarGimnasios.setGridColor(new java.awt.Color(248, 239, 229));
        jTableOrdenarGimnasios.setRequestFocusEnabled(false);
        jTableOrdenarGimnasios.setRowHeight(40);
        jTableOrdenarGimnasios.setRowMargin(2);
        jTableOrdenarGimnasios.setSelectionBackground(new java.awt.Color(246, 237, 172));
        jTableOrdenarGimnasios.setSelectionForeground(new java.awt.Color(23, 23, 23));
        jTableOrdenarGimnasios.setShowGrid(false);
        jTableOrdenarGimnasios.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableOrdenarGimnasios);

        panelOrdenarGimnasios.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 760, 350));

        jPanel41.setBackground(new java.awt.Color(246, 237, 172));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        panelOrdenarGimnasios.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 780, 370));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, -1, 60));

        jPanel42.setBackground(new java.awt.Color(239, 199, 110));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordenrPorNombreMergeButton.setBackground(new java.awt.Color(255, 51, 51));
        ordenrPorNombreMergeButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        ordenrPorNombreMergeButton.setForeground(new java.awt.Color(23, 23, 23));
        ordenrPorNombreMergeButton.setText("MergeShort");
        ordenrPorNombreMergeButton.setAlignmentY(0.0F);
        ordenrPorNombreMergeButton.setBorder(null);
        ordenrPorNombreMergeButton.setContentAreaFilled(false);
        ordenrPorNombreMergeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordenrPorNombreMergeButton.setFocusPainted(false);
        ordenrPorNombreMergeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ordenrPorNombreMergeButton.setMargin(new java.awt.Insets(2, 14, 2, 14));
        ordenrPorNombreMergeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenrPorNombreMergeButtonActionPerformed(evt);
            }
        });
        jPanel42.add(ordenrPorNombreMergeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 20));

        panelOrdenarGimnasios.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 150, 40));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, 60));

        jPanel43.setBackground(new java.awt.Color(239, 199, 110));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordenarPorCanMaquinasMergeButton.setBackground(new java.awt.Color(255, 51, 51));
        ordenarPorCanMaquinasMergeButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        ordenarPorCanMaquinasMergeButton.setForeground(new java.awt.Color(23, 23, 23));
        ordenarPorCanMaquinasMergeButton.setText("MergeShort");
        ordenarPorCanMaquinasMergeButton.setAlignmentY(0.0F);
        ordenarPorCanMaquinasMergeButton.setBorder(null);
        ordenarPorCanMaquinasMergeButton.setContentAreaFilled(false);
        ordenarPorCanMaquinasMergeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordenarPorCanMaquinasMergeButton.setFocusPainted(false);
        ordenarPorCanMaquinasMergeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ordenarPorCanMaquinasMergeButton.setMargin(new java.awt.Insets(2, 14, 2, 14));
        ordenarPorCanMaquinasMergeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorCanMaquinasMergeButtonActionPerformed(evt);
            }
        });
        jPanel43.add(ordenarPorCanMaquinasMergeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 20));

        panelOrdenarGimnasios.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 150, 40));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, -1, 60));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, -1, 60));

        jPanel44.setBackground(new java.awt.Color(239, 199, 110));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordenrPorNombreInserccionButton.setBackground(new java.awt.Color(255, 51, 51));
        ordenrPorNombreInserccionButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        ordenrPorNombreInserccionButton.setForeground(new java.awt.Color(23, 23, 23));
        ordenrPorNombreInserccionButton.setText("Insercción");
        ordenrPorNombreInserccionButton.setAlignmentY(0.0F);
        ordenrPorNombreInserccionButton.setBorder(null);
        ordenrPorNombreInserccionButton.setContentAreaFilled(false);
        ordenrPorNombreInserccionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordenrPorNombreInserccionButton.setFocusPainted(false);
        ordenrPorNombreInserccionButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ordenrPorNombreInserccionButton.setMargin(new java.awt.Insets(2, 14, 2, 14));
        ordenrPorNombreInserccionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenrPorNombreInserccionButtonActionPerformed(evt);
            }
        });
        jPanel44.add(ordenrPorNombreInserccionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 20));

        panelOrdenarGimnasios.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 150, 40));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, 60));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, 60));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, 60));

        jPanel45.setBackground(new java.awt.Color(239, 199, 110));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordenarPorCanMaquinasInserccionButton.setBackground(new java.awt.Color(255, 51, 51));
        ordenarPorCanMaquinasInserccionButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        ordenarPorCanMaquinasInserccionButton.setForeground(new java.awt.Color(23, 23, 23));
        ordenarPorCanMaquinasInserccionButton.setText("Inserción");
        ordenarPorCanMaquinasInserccionButton.setToolTipText("");
        ordenarPorCanMaquinasInserccionButton.setAlignmentY(0.0F);
        ordenarPorCanMaquinasInserccionButton.setBorder(null);
        ordenarPorCanMaquinasInserccionButton.setContentAreaFilled(false);
        ordenarPorCanMaquinasInserccionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordenarPorCanMaquinasInserccionButton.setFocusPainted(false);
        ordenarPorCanMaquinasInserccionButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ordenarPorCanMaquinasInserccionButton.setMargin(new java.awt.Insets(2, 14, 2, 14));
        ordenarPorCanMaquinasInserccionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorCanMaquinasInserccionButtonActionPerformed(evt);
            }
        });
        jPanel45.add(ordenarPorCanMaquinasInserccionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 20));

        panelOrdenarGimnasios.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 150, 40));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, 60));

        jLabel9.setBackground(new java.awt.Color(255, 204, 153));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Nombre del los gimnasios");
        jLabel9.setToolTipText("");
        panelOrdenarGimnasios.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 200, -1));

        jLabel65.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 51));
        jLabel65.setText("Cantidad de Maquinas");
        panelOrdenarGimnasios.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 190, -1));

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setForeground(new java.awt.Color(255, 255, 255));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoOptionPane4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warning.png"))); // NOI18N
        jPanel39.add(iconoOptionPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        mensajeOrdenarLabel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeOrdenarLabel.setForeground(new java.awt.Color(23, 23, 23));
        mensajeOrdenarLabel.setText("Mensajes de Dialogo");
        jPanel39.add(mensajeOrdenarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 530, 30));

        mensajeLabel13.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel13.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        mensajeLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel39.add(mensajeLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 20, 20));

        mensajeLabel14.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel14.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N
        mensajeLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel39.add(mensajeLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 20, 20));

        mensajeLabel15.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel15.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        mensajeLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel39.add(mensajeLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 20, 20));

        panelOrdenarGimnasios.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 760, 50));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 60));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 60));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, 60));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        panelOrdenarGimnasios.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 60));

        jPanel1.add(panelOrdenarGimnasios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 640));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 23, 23));
        jLabel1.setText("Asociación Nacional de Gimnasios y Centros de Salud");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        cerrarGUIButton.setBackground(new java.awt.Color(255, 51, 51));
        cerrarGUIButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cerrarGUIButton.setForeground(new java.awt.Color(23, 23, 23));
        cerrarGUIButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        cerrarGUIButton.setBorder(null);
        cerrarGUIButton.setContentAreaFilled(false);
        cerrarGUIButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarGUIButton.setFocusPainted(false);
        cerrarGUIButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cerrarGUIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarGUIButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cerrarGUIButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        minimizarGUIButton.setBackground(new java.awt.Color(255, 51, 51));
        minimizarGUIButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        minimizarGUIButton.setForeground(new java.awt.Color(23, 23, 23));
        minimizarGUIButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        minimizarGUIButton.setBorder(null);
        minimizarGUIButton.setContentAreaFilled(false);
        minimizarGUIButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizarGUIButton.setFocusPainted(false);
        minimizarGUIButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        minimizarGUIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarGUIButtonActionPerformed(evt);
            }
        });
        jPanel1.add(minimizarGUIButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 20, 20));

        minimizarGUIButton1.setBackground(new java.awt.Color(255, 51, 51));
        minimizarGUIButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        minimizarGUIButton1.setForeground(new java.awt.Color(23, 23, 23));
        minimizarGUIButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N
        minimizarGUIButton1.setBorder(null);
        minimizarGUIButton1.setContentAreaFilled(false);
        minimizarGUIButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizarGUIButton1.setFocusPainted(false);
        minimizarGUIButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(minimizarGUIButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 750));

        jPanel2.setBackground(new java.awt.Color(246, 237, 172));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(239, 199, 110));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoGymLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gymLogo.png"))); // NOI18N
        jPanel3.add(logoGymLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 180));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, 190));

        jPanel15.setBackground(new java.awt.Color(248, 239, 229));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrarButton.setBackground(new java.awt.Color(255, 51, 51));
        registrarButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        registrarButton.setForeground(new java.awt.Color(23, 23, 23));
        registrarButton.setText("Registrar Gimnasios");
        registrarButton.setAlignmentY(0.0F);
        registrarButton.setBorder(null);
        registrarButton.setContentAreaFilled(false);
        registrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarButton.setFocusPainted(false);
        registrarButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });
        jPanel15.add(registrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 9, 230, 30));

        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 240, 40));

        jPanel19.setBackground(new java.awt.Color(248, 239, 229));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verListaButton.setBackground(new java.awt.Color(23, 23, 23));
        verListaButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        verListaButton.setForeground(new java.awt.Color(23, 23, 23));
        verListaButton.setText("Lista de gimnasios suscritos");
        verListaButton.setAlignmentY(0.0F);
        verListaButton.setBorder(null);
        verListaButton.setContentAreaFilled(false);
        verListaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verListaButton.setFocusPainted(false);
        verListaButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        verListaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verListaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaButtonActionPerformed(evt);
            }
        });
        jPanel19.add(verListaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 230, 30));

        jPanel2.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 240, 40));

        jPanel18.setBackground(new java.awt.Color(248, 239, 229));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editarButton.setBackground(new java.awt.Color(23, 23, 23));
        editarButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        editarButton.setForeground(new java.awt.Color(23, 23, 23));
        editarButton.setText("Busqueda y edición");
        editarButton.setAlignmentY(0.0F);
        editarButton.setBorder(null);
        editarButton.setContentAreaFilled(false);
        editarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarButton.setFocusPainted(false);
        editarButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        jPanel18.add(editarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 230, 30));

        jPanel2.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 240, 40));

        jPanel17.setBackground(new java.awt.Color(248, 239, 229));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        compararButton.setBackground(new java.awt.Color(23, 23, 23));
        compararButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        compararButton.setForeground(new java.awt.Color(23, 23, 23));
        compararButton.setText("Comparaión de valores");
        compararButton.setAlignmentY(0.0F);
        compararButton.setBorder(null);
        compararButton.setContentAreaFilled(false);
        compararButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compararButton.setFocusPainted(false);
        compararButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        compararButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compararButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compararButtonActionPerformed(evt);
            }
        });
        jPanel17.add(compararButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 230, 30));

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 240, 40));

        jPanel16.setBackground(new java.awt.Color(248, 239, 229));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordenarButton.setBackground(new java.awt.Color(23, 23, 23));
        ordenarButton.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        ordenarButton.setForeground(new java.awt.Color(23, 23, 23));
        ordenarButton.setText("Gimnasios ordenados");
        ordenarButton.setAlignmentY(0.0F);
        ordenarButton.setBorder(null);
        ordenarButton.setContentAreaFilled(false);
        ordenarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordenarButton.setFocusPainted(false);
        ordenarButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ordenarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ordenarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarButtonActionPerformed(evt);
            }
        });
        jPanel16.add(ordenarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 230, 30));

        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 240, 40));

        jPanel11.setBackground(new java.awt.Color(239, 199, 110));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirButton.setBackground(new java.awt.Color(23, 23, 23));
        salirButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salirButton.setForeground(new java.awt.Color(23, 23, 23));
        salirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        salirButton.setBorder(null);
        salirButton.setContentAreaFilled(false);
        salirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirButton.setFocusPainted(false);
        salirButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        jPanel11.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 650, 70, 40));

        jPanel12.setBackground(new java.awt.Color(239, 199, 110));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 60, 20));

        jPanel13.setBackground(new java.awt.Color(239, 199, 110));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 700, 70, 50));

        jPanel14.setBackground(new java.awt.Color(239, 199, 110));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 130));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 60));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 60));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, 60));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, 60));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, 60));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, 60));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, -1, 60));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, -1, 60));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 720, -1, 40));

        jPanel24.setBackground(new java.awt.Color(239, 199, 110));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 720, 90, 30));

        jPanel25.setBackground(new java.awt.Color(239, 199, 110));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 140));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 60));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 10, -1, 60));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 160, -1, 60));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 60));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, -1, 60));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 730, -1, 40));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, -1, 40));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 690, -1, 60));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 720, -1, 40));

        jPanel27.setBackground(new java.awt.Color(239, 199, 110));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 720, 60, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setLocation(getLocation().x + evt.getX() - mouseX, getLocation().y + evt.getY() - mouseY);
    }//GEN-LAST:event_formMouseDragged

    private void cerrarGUIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarGUIButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarGUIButtonActionPerformed

    private void minimizarGUIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarGUIButtonActionPerformed
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizarGUIButtonActionPerformed

    private void inscribirGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirGButtonActionPerformed
        if (nombreTField.getText().isEmpty() || canMaquinasTField.getText().isEmpty() || canClientesTField.getText().isEmpty()) {
            mensajeLabel.setText("Por favor rellene todos los campos");
        } 
        else if (!nombreTField.getText().isEmpty() || !canMaquinasTField.getText().isEmpty() || !canClientesTField.getText().isEmpty()) {
            if (checkV.isSelected() || checkF.isSelected()) {
                id = Integer.parseInt(idTField.getText());          
                nombre = nombreTField.getText();       
                canM = Integer.parseInt(canMaquinasTField.getText());

                if (checkV.isSelected()) {
                    cross = true;
                }
                if (checkF.isSelected()) {
                    cross = false;
                }

                canC = Integer.parseInt(canClientesTField.getText());
                RegistrarGS inscribirGimnasios = new RegistrarGS(id, nombre, canM, cross, canC);
                listaInscripciones.add(inscribirGimnasios);
                mensajeLabel.setText("El gimnasio con ID : [ " + id + " ] ha sido agregado correctamente");
                idTField.setText(generarId());
            } else {
                mensajeLabel.setText("Por favor rellene todos los campos");
            }
        }
    }//GEN-LAST:event_inscribirGButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirButtonActionPerformed

    private void verListaButtonClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaButtonClickActionPerformed
        panel.vaciarRows(modeloT1);
        Iterator<RegistrarGS> iterador = listaInscripciones.iterator();
        while (iterador.hasNext()) {
            RegistrarGS datos = iterador.next();
            Object[] datosArray = {datos.getId(), datos.getNombre(), datos.getCanMaquinas(), datos.getCross(), datos.getCanClientes()};
            Object[] x = new Object[5];
                for (int i = 0; i < 5; i++) {
                    x[i] = datosArray[i];
                }
            modeloT1.addRow(x);
        }
    }//GEN-LAST:event_verListaButtonClickActionPerformed

    private void verListaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaButtonActionPerformed
        panel.mostrarPanel(panelRegistrarGimnasio, panelBuscarEditar, panelCompararValores, panelOrdenarGimnasios, panelListaGimnasios);
    }//GEN-LAST:event_verListaButtonActionPerformed

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        panel.mostrarPanel(panelListaGimnasios, panelBuscarEditar, panelCompararValores, panelOrdenarGimnasios, panelRegistrarGimnasio);
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        panel.mostrarPanel(panelListaGimnasios, panelRegistrarGimnasio, panelCompararValores, panelOrdenarGimnasios, panelBuscarEditar);
    }//GEN-LAST:event_editarButtonActionPerformed

    private void canClientesTFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canClientesTFieldKeyTyped
        validarNumeros = evt.getKeyChar();
        if (Character.isLetter(validarNumeros)) {
            evt.consume();
            mensajeLabel.setText("Por favor ingresar solamente numeros. Gracias");
        }
    }//GEN-LAST:event_canClientesTFieldKeyTyped

    private void canMaquinasTFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canMaquinasTFieldKeyTyped
        validarNumeros = evt.getKeyChar();
        if (Character.isLetter(validarNumeros)) {
            evt.consume();
            mensajeLabel.setText("Por favor ingresar solamente numeros. Gracias");
        }
    }//GEN-LAST:event_canMaquinasTFieldKeyTyped
    
    private void guardarEdicionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEdicionButtonActionPerformed
        int selectedRow = jTableBusqueda.getSelectedRow();

        if (selectedRow != -1) {
            int idCambiarRegistro = (int) jTableBusqueda.getValueAt(selectedRow, 0);
            newId = Integer.parseInt(newIdTField.getText());
            newNombre = newNombreTField.getText();
            newCanM = Integer.parseInt(newCanMTField.getText());

            if (newCrossCheck.isSelected()) {
                newCross = true;
            }
            else if (!newCrossCheck.isSelected()) {
                newCross = false;
            }

            newCanC = Integer.parseInt(newCanCTField.getText());

            RegistrarGS actualizarGimnasios = new RegistrarGS(newId, newNombre, newCanM, newCross, newCanC);
            listaInscripciones.set(idCambiarRegistro, actualizarGimnasios);
            Metodos metodos = new Metodos();
            metodos.actualizarTabla(jTableBusqueda, newId, newNombre, newCanM, newCross, newCanC, selectedRow);
            mensajeLabelBuscar.setText("Registro editado exitosamente");
        } else {
            mensajeLabelBuscar.setText("Primeramente seleccione un registro para poder editar");
        }
    }//GEN-LAST:event_guardarEdicionButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        String searchText = buscarGymTField.getText().toLowerCase();
        panel.vaciarRows(modeloT2);

        Iterator<RegistrarGS> iteratorT2 = listaInscripciones.iterator();
        while (iteratorT2.hasNext()) {
            RegistrarGS gym = iteratorT2.next();
            Object[] datos = {gym.getId(), gym.getNombre(), gym.getCanMaquinas(), gym.getCross(), gym.getCanClientes()};
            String gymName = gym.getNombre().toLowerCase();
            if (gymName.contains(searchText)) {
                Object[] x = new Object[5];
                    for (int i = 0; i < 5; i++) {
                        x[i] = datos[i];
                    }
                modeloT2.addRow(x);
            }
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void jTableCompararValoresMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jTableCompararValoresMouseWheelMoved
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        int scrollAmount = evt.getUnitsToScroll() * verticalScrollBar.getUnitIncrement();
        int newValue = verticalScrollBar.getValue() - (scrollAmount * evt.getWheelRotation());
        verticalScrollBar.setValue(newValue);
    }//GEN-LAST:event_jTableCompararValoresMouseWheelMoved

    private void buscarValoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarValoresButtonActionPerformed
        String searchText = compararVTField.getText();
        int cantidadClientes = Integer.parseInt(searchText);
        panel.vaciarRows(modeloT3);
        buscarClientesConRecursividad(0, cantidadClientes, modeloT3);
    }//GEN-LAST:event_buscarValoresButtonActionPerformed

    public void buscarClientesConRecursividad(int index, int cantidadClientes, DefaultTableModel modelo) {
        //Este codigo fue utilizado y modificado de Oregoom
        if (index >= listaInscripciones.size()) {
            return;
        }

        RegistrarGS clientes = listaInscripciones.get(index);
        Object[] datos = {clientes.getId(), clientes.getNombre(), clientes.getCanMaquinas(), clientes.getCross(), clientes.getCanClientes()};

        int cantidadClientesGym = clientes.getCanClientes();
        if (cantidadClientesGym >= cantidadClientes) {
            Object[] x = new Object[5];
                for (int i = 0; i < 5; i++) {
                    x[i] = datos[i];
                }
            modelo.addRow(x);
        }

        buscarClientesConRecursividad(index + 1, cantidadClientes, modelo);
        //Oregoom. (s.f). Recursividad en Java. Oregoom.com https://oregoom.com/java/recursividad/
    }

    private void compararVTFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_compararVTFieldKeyTyped
        validarNumeros = evt.getKeyChar();
        if (Character.isLetter(validarNumeros)) {
            evt.consume();
            mensajeLabelComparar.setText("Por favor ingresar solamente numeros. Gracias");
        }
    }//GEN-LAST:event_compararVTFieldKeyTyped

    private void compararButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compararButtonActionPerformed
        panel.mostrarPanel(panelListaGimnasios, panelRegistrarGimnasio, panelBuscarEditar, panelOrdenarGimnasios, panelCompararValores);
    }//GEN-LAST:event_compararButtonActionPerformed

    private void jTableBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBusquedaMouseClicked
        int filaSeleccionada = jTableBusqueda.getSelectedRow();
    
        if (filaSeleccionada != -1) {
            JTextField[] textFields = {newIdTField, newNombreTField, newCanMTField, newCanCTField};

            for (int i = 0; i < 3; i++) {
                Object value = jTableBusqueda.getValueAt(filaSeleccionada, i);
                Object respaldo = jTableBusqueda.getValueAt(filaSeleccionada, 4);
                textFields[i].setText(value.toString());
                newCanCTField.setText(respaldo.toString());
                newCrossCheck.setSelected((boolean) jTableBusqueda.getValueAt(filaSeleccionada, 3));
            }
        }
    }//GEN-LAST:event_jTableBusquedaMouseClicked

    private void checkVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVActionPerformed
        if (checkV.isSelected()) {
            checkF.setEnabled(false);
        } else {
            checkF.setEnabled(true);
        }
    }//GEN-LAST:event_checkVActionPerformed

    private void checkFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFActionPerformed
        if (checkF.isSelected()) {
            checkV.setEnabled(false);
        } else {
            checkV.setEnabled(true);
        }
    }//GEN-LAST:event_checkFActionPerformed

    private void ordenrPorNombreMergeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenrPorNombreMergeButtonActionPerformed
        Object[][] copiarRegistros = panel.copiarDatos(listaInscripciones);
        panel.vaciarRows(modeloT4);
        panel.mergeSortByName(copiarRegistros, 0, copiarRegistros.length - 1);

        for (Object[] registro : copiarRegistros) {
            modeloT4.addRow(registro);
        }
        
        mensajeOrdenarLabel.setText("Estas ordenando el nombre con MergeShort");
    }//GEN-LAST:event_ordenrPorNombreMergeButtonActionPerformed

    private void ordenarPorCanMaquinasMergeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorCanMaquinasMergeButtonActionPerformed
        Object[][] copiarRegistros = panel.copiarDatos(listaInscripciones);
        panel.vaciarRows(modeloT4);
        panel.mergeSortByMaquinas(copiarRegistros, 0, copiarRegistros.length - 1);
        for (Object[] registro : copiarRegistros) {
            modeloT4.addRow(registro);
        }
        mensajeOrdenarLabel.setText("Estas ordenando el numero de maquinas con MergeShort");
    }//GEN-LAST:event_ordenarPorCanMaquinasMergeButtonActionPerformed

    private void ordenarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarButtonActionPerformed
        panel.mostrarPanel(panelListaGimnasios, panelRegistrarGimnasio, panelBuscarEditar, panelCompararValores, panelOrdenarGimnasios);
    }//GEN-LAST:event_ordenarButtonActionPerformed

    private void ordenrPorNombreInserccionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenrPorNombreInserccionButtonActionPerformed
        Object[][] copiarRegistros = panel.ordenarNombreInserccion(listaInscripciones);
        panel.vaciarRows(modeloT4);
        for (Object[] registro : copiarRegistros) {
            modeloT4.addRow(registro);
        }
        
        mensajeOrdenarLabel.setText("Estas ordenando el nombre con Insercción");
    }//GEN-LAST:event_ordenrPorNombreInserccionButtonActionPerformed

    private void ordenarPorCanMaquinasInserccionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorCanMaquinasInserccionButtonActionPerformed
        Object[][] copiarRegistros = panel.ordenarMaquinasInserccion(listaInscripciones);
        panel.vaciarRows(modeloT4);
        for (Object[] registro : copiarRegistros) {
            modeloT4.addRow(registro);
        }
        mensajeOrdenarLabel.setText("Estas ordenando el numero de maquinas con Insercción");
    }//GEN-LAST:event_ordenarPorCanMaquinasInserccionButtonActionPerformed

    private void newCanMTFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newCanMTFieldKeyTyped
        validarNumeros = evt.getKeyChar();
        if (Character.isLetter(validarNumeros)) {
            evt.consume();
            mensajeLabelBuscar.setText("Por favor ingresar solamente numeros. Gracias");
        }
    }//GEN-LAST:event_newCanMTFieldKeyTyped

    private void newCanCTFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newCanCTFieldKeyTyped
        validarNumeros = evt.getKeyChar();
        if (Character.isLetter(validarNumeros)) {
            evt.consume();
            mensajeLabelBuscar.setText("Por favor ingresar solamente numeros. Gracias");
        }
    }//GEN-LAST:event_newCanCTFieldKeyTyped

    private void jTableListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableListaMouseClicked

    public String generarId() {
        idGenerado += 1;
        return Integer.toString(idGenerado);
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField buscarGymTField;
    private javax.swing.JButton buscarValoresButton;
    private javax.swing.JTextField canClientesTField;
    private javax.swing.JTextField canMaquinasTField;
    private javax.swing.JButton cerrarGUIButton;
    private javax.swing.JCheckBox checkF;
    private javax.swing.JCheckBox checkV;
    private javax.swing.JButton compararButton;
    private javax.swing.JTextField compararVTField;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton guardarEdicionButton;
    private javax.swing.JLabel iconoOptionPane1;
    private javax.swing.JLabel iconoOptionPane2;
    private javax.swing.JLabel iconoOptionPane3;
    private javax.swing.JLabel iconoOptionPane4;
    private javax.swing.JTextField idTField;
    private javax.swing.JButton inscribirGButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneLista;
    private javax.swing.JTable jTableBusqueda;
    private javax.swing.JTable jTableCompararValores;
    private javax.swing.JTable jTableLista;
    private javax.swing.JTable jTableOrdenarGimnasios;
    private javax.swing.JLabel logoGymLabel;
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JLabel mensajeLabel10;
    private javax.swing.JLabel mensajeLabel11;
    private javax.swing.JLabel mensajeLabel12;
    private javax.swing.JLabel mensajeLabel13;
    private javax.swing.JLabel mensajeLabel14;
    private javax.swing.JLabel mensajeLabel15;
    private javax.swing.JLabel mensajeLabel4;
    private javax.swing.JLabel mensajeLabel5;
    private javax.swing.JLabel mensajeLabel6;
    private javax.swing.JLabel mensajeLabel7;
    private javax.swing.JLabel mensajeLabel8;
    private javax.swing.JLabel mensajeLabel9;
    private javax.swing.JLabel mensajeLabelBuscar;
    private javax.swing.JLabel mensajeLabelComparar;
    private javax.swing.JLabel mensajeOrdenarLabel;
    private javax.swing.JButton minimizarGUIButton;
    private javax.swing.JButton minimizarGUIButton1;
    private javax.swing.JTextField newCanCTField;
    private javax.swing.JTextField newCanMTField;
    private javax.swing.JCheckBox newCrossCheck;
    private javax.swing.JTextField newIdTField;
    private javax.swing.JTextField newNombreTField;
    private javax.swing.JTextField nombreTField;
    private javax.swing.JButton ordenarButton;
    private javax.swing.JButton ordenarPorCanMaquinasInserccionButton;
    private javax.swing.JButton ordenarPorCanMaquinasMergeButton;
    private javax.swing.JButton ordenrPorNombreInserccionButton;
    private javax.swing.JButton ordenrPorNombreMergeButton;
    private javax.swing.JPanel panelBuscarEditar;
    private javax.swing.JPanel panelCompararValores;
    private javax.swing.JPanel panelListaGimnasios;
    private javax.swing.JPanel panelOrdenarGimnasios;
    private javax.swing.JPanel panelRegistrarGimnasio;
    private javax.swing.JButton registrarButton;
    private javax.swing.JButton salirButton;
    private javax.swing.JButton verListaButton;
    private javax.swing.JButton verListaButtonClick;
    // End of variables declaration//GEN-END:variables
}
