/********************************************************************************
 ** Form generated from reading ui file 'frmPrincipal.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package seguroscaiserdav;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class frmPrincipal implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionCerrar_Aplicacion;
    public QAction actionAyuda;
    public QAction actionRealizar_Formulario;
    public QWidget centralwidget;
    public QFrame frm_gradient;
    public QWidget widgetCentral;
    public QLabel lbImagenPrincipal;
    public QPushButton btnFormulario;
    public QMenuBar menubar;
    public QMenu menuMen;
    public QMenu menuFormulario;
    public QStatusBar statusbar;

    public frmPrincipal() { super(); }
    
    void abrir(){

        frmAlta Alta = new frmAlta();
        QDialog dialog = new QDialog();
        Alta.setupUi(dialog);
        dialog.show();

    }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.NonModal);
        MainWindow.resize(new QSize(989, 610).expandedTo(MainWindow.minimumSizeHint()));
        QFont font = new QFont();
        font.setFamily("Nirmala UI");
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        MainWindow.setFont(font);
        MainWindow.setCursor(new QCursor(Qt.CursorShape.ArrowCursor));
        MainWindow.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.ClickFocus);
        MainWindow.setContextMenuPolicy(com.trolltech.qt.core.Qt.ContextMenuPolicy.ActionsContextMenu);
        MainWindow.setAcceptDrops(true);
        MainWindow.setStyleSheet("QMainWindoww#MainWindow { background-color: rgb(236, 236, 236) }");
        MainWindow.setTabShape(com.trolltech.qt.gui.QTabWidget.TabShape.Rounded);
        actionCerrar_Aplicacion = new QAction(MainWindow);
        actionCerrar_Aplicacion.setObjectName("actionCerrar_Aplicacion");
        QFont font1 = new QFont();
        font1.setFamily("Nirmala UI Semilight");
        font1.setPointSize(10);
        font1.setBold(true);
        font1.setItalic(true);
        font1.setWeight(75);
        actionCerrar_Aplicacion.setFont(font1);
        actionCerrar_Aplicacion.setMenuRole(com.trolltech.qt.gui.QAction.MenuRole.QuitRole);
        actionCerrar_Aplicacion.setSoftKeyRole(com.trolltech.qt.gui.QAction.SoftKeyRole.NoSoftKey);
        actionAyuda = new QAction(MainWindow);
        actionAyuda.setObjectName("actionAyuda");
        QFont font2 = new QFont();
        font2.setFamily("Nirmala UI Semilight");
        font2.setPointSize(10);
        font2.setBold(true);
        font2.setItalic(true);
        font2.setWeight(75);
        actionAyuda.setFont(font2);
        actionRealizar_Formulario = new QAction(MainWindow);
        actionRealizar_Formulario.setObjectName("actionRealizar_Formulario");
        //Esta la modifique para realizar la acción de abrir.
        actionRealizar_Formulario.triggered.connect(this, "abrir()");
        QFont font3 = new QFont();
        font3.setFamily("Nirmala UI Semilight");
        font3.setPointSize(10);
        font3.setBold(true);
        font3.setItalic(true);
        font3.setWeight(75);
        actionRealizar_Formulario.setFont(font3);
        actionRealizar_Formulario.setMenuRole(com.trolltech.qt.gui.QAction.MenuRole.ApplicationSpecificRole);
        actionRealizar_Formulario.setSoftKeyRole(com.trolltech.qt.gui.QAction.SoftKeyRole.SelectSoftKey);
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        frm_gradient = new QFrame(centralwidget);
        frm_gradient.setObjectName("frm_gradient");
        frm_gradient.setGeometry(new QRect(0, 0, 981, 571));
        frm_gradient.setAcceptDrops(true);
        frm_gradient.setStyleSheet("QFrame#frm_gradient {\n"+
"background-color: qconicalgradient(cx:0.073, cy:0.085, angle:135, stop:0 rgba(255, 129, 0, 63), stop:0.3125 rgba(255, 218, 40, 69), stop:0.375 rgba(255, 148, 25, 69), stop:0.45 rgba(255, 148, 25, 208), stop:0.477581 rgba(255, 71, 71, 130), stop:0.482955 rgba(255, 148, 25, 145), stop:0.488636 rgba(255, 183, 0, 130), stop:0.518717 rgba(255, 155, 32, 130), stop:0.528409 rgba(255, 148, 25, 255), stop:0.573864 rgba(255, 157, 71, 130), stop:0.57754 rgba(255, 140, 0, 130), stop:0.625 rgba(255, 174, 90, 69), stop:1 rgba(255, 255, 0, 69))\n"+
"}");
        frm_gradient.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frm_gradient.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        widgetCentral = new QWidget(frm_gradient);
        widgetCentral.setObjectName("widgetCentral");
        widgetCentral.setGeometry(new QRect(180, 0, 681, 561));
        widgetCentral.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.ClickFocus);
        widgetCentral.setContextMenuPolicy(com.trolltech.qt.core.Qt.ContextMenuPolicy.ActionsContextMenu);
        widgetCentral.setStyleSheet("");
        lbImagenPrincipal = new QLabel(widgetCentral);
        lbImagenPrincipal.setObjectName("lbImagenPrincipal");
        lbImagenPrincipal.setGeometry(new QRect(70, 0, 541, 561));
        QFont font4 = new QFont();
        font4.setFamily("Nirmala UI");
        font4.setPointSize(16);
        font4.setBold(true);
        font4.setWeight(75);
        lbImagenPrincipal.setFont(font4);
        //lbImagenPrincipal.setPixmap(new QPixmap(("Recursos/Caiser_seguros_logo_principal.png")));
        //Aqui modificaremos la ruta del directorio para añadir las imagenes 
        //Estaba teniendo problemas con las imagenes, asi que despues de probar y convertir a formato jpg incluso; al final añadi la carpeta recursos al directorio src.. de forma manual y sin convertirla .jar; de esta manera me aseguro que incluyo mis imagenes a mi Interfaz para no perder la vista que ellas aportan..
        lbImagenPrincipal.setPixmap(new QPixmap(("src/recursos/caiserprincipal.jpg")));
        btnFormulario = new QPushButton(widgetCentral);
        btnFormulario.setObjectName("btnFormulario");
        btnFormulario.setGeometry(new QRect(220, 240, 266, 31));
        QFont font5 = new QFont();
        font5.setFamily("Segoe UI Black");
        font5.setPointSize(14);
        font5.setBold(false);
        font5.setItalic(false);
        font5.setWeight(10);
        btnFormulario.setFont(font5);
        btnFormulario.setStyleSheet("QPushButton#btnFormulario {\n"+
"    background-color: rgb(255, 148, 25);\n"+
"    border-style: outset;\n"+
"    border-width: 2px;\n"+
"    border-radius: 10px;\n"+
"    border-color: beige;\n"+
"    font: 87 14pt \"Segoe UI Black\";\n"+
"	color: rgb(255, 255, 255);\n"+
"    min-width: 10em;\n"+
"    padding: 6px;\n"+
"}\n"+
"\n"+
"\n"+
"\n"+
"");
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 989, 21));
        menuMen = new QMenu(menubar);
        menuMen.setObjectName("menuMen");
        menuMen.setStyleSheet("font: 75 14pt \"Nirmala UI\", rgb(255, 148, 25)");
        menuFormulario = new QMenu(menubar);
        menuFormulario.setObjectName("menuFormulario");
        menuFormulario.setStyleSheet("font: 75 14pt \"Nirmala UI\", rgb(255, 148, 25)");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuMen.menuAction());
        menubar.addAction(menuFormulario.menuAction());
        menuMen.addAction(actionCerrar_Aplicacion);
        menuFormulario.addAction(actionRealizar_Formulario);
        retranslateUi(MainWindow);
        actionCerrar_Aplicacion.triggered.connect(MainWindow, "disposeLater()");
        actionRealizar_Formulario.triggered.connect(MainWindow, "show()");
        
        /*****************************************************************
         * Aqui pongo la conexion signal/slot de usuario
         * Al hacer clic en el botonn Reservas se abre el dialogo de reservas.
         */
        btnFormulario.clicked.connect(this, "abrir()");

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        actionCerrar_Aplicacion.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Cerrar Aplicaci\u00f3n", null));
        actionCerrar_Aplicacion.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Cerraremos la Aplicaci\u00f3n por completo", null));
        actionAyuda.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Soporte", null));
        actionRealizar_Formulario.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Realizar Formulario", null));
        lbImagenPrincipal.setText("");
        btnFormulario.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Formulario", null));
        menuMen.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Men\u00fa", null));
        menuFormulario.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Formulario", null));
    } // retranslateUi

}

