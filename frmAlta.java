/** ******************************************************************************
 ** Form generated from reading ui file 'frmAlta.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ******************************************************************************* */
package seguroscaiserdav;

import com.trolltech.qt.QSignalEmitter;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QAbstractButton;
import com.trolltech.qt.gui.QMessageBox.StandardButton;
import static com.trolltech.qt.gui.QMessageBox.StandardButton.Yes;
import static com.trolltech.qt.gui.QToolTip.text;
import com.trolltech.qt.help.*;
import static com.trolltech.qt.phonon.AbstractAddon.TitleCommand.title;

public class frmAlta implements com.trolltech.qt.QUiForm<QDialog> {

    public QWidget panelDatos;
    public QLabel lbCodigo;
    public QLabel lbNombre;
    public QLabel lbApellidos;
    public QLineEdit txtCodigo;
    public QLineEdit txtNombre;
    public QLineEdit txtApellidos;
    public QLabel lbDireccion;
    public QLineEdit txtDireccion;
    public QLabel lbTelefono;
    public QLineEdit txtTelefono;
    public QLabel lbFechaAlta;
    public QLabel lbTarifa;
    public QLineEdit txtTarifa;
    public QDateTimeEdit dateTimeEdit;
    public QLabel lbLogohogar;
    public QFrame separadorSuperior;
    public QLabel lbTitulo;
    public QFrame separadorCentral;
    public QFrame separadorInferior;
    public QWidget panelZona;
    public QLabel lbZona;
    public QCheckBox checkBoxEstructura;
    public QCheckBox checkBoxCimentacion;
    public QCheckBox checkBoxAlbaileria;
    public QCheckBox checkBoxFontaneria;
    public QCheckBox checkBoxCArpinteria;
    public QCheckBox checkBoxDecoracion;
    public QGroupBox groupBox;
    public QRadioButton rbtnLevante;
    public QRadioButton rbtnCentro;
    public QRadioButton rbtnSur;
    public QWidget panelBotones;
    public QPushButton btnAceptar;
    public QPushButton btnCancelar;
    public QWidget panelComercial;
    public QLabel lbComercial;
    public QLineEdit txtComercial;
    public QLabel lbLogoSuperior;

    public frmAlta() {
        super();
    }
        
    //Mensajes dialogos de los botones Acetpar y cancelar.
    void mensajeAceptar() {
        QMessageBox msgBox = new QMessageBox();
        msgBox.setIcon(QMessageBox.Icon.Information);
        msgBox.setText("Registro guardado");
        msgBox.exec();
    }
    void mensajeCancelar() {  
        /*
        Segun la documentación de QT Designer *(https://doc.qt.io/qt-5/qmessagebox.html):
        QMessageBox msgBox;
        msgBox.setText("The document has been modified.");
        msgBox.setInformativeText("Do you want to save your changes?");
        msgBox.setStandardButtons(QMessageBox::Save | QMessageBox::Discard | QMessageBox::Cancel);
        msgBox.setDefaultButton(QMessageBox::Save);
        int ret = msgBox.exec();
        */
        //La manera en la que yo he creado mi diálogo: (No veo la manera de darle la funcionalidad para cuando le de a Cancelar no me cierre el formulario, no veo el todo como poder condicionar y jugar con los signal/slot).
        QMessageBox msgBox = new QMessageBox();
        msgBox.setText("Realmente deseas cancelar el registro ?");
        msgBox.setInformativeText("Y salir del formulario !");
        msgBox.setIcon(QMessageBox.Icon.Question);
        msgBox.addButton(QMessageBox.StandardButton.Yes);
        msgBox.addButton(QMessageBox.StandardButton.Cancel);
        msgBox.exec();
    }        

    public void setupUi(QDialog Dialog) {
        Dialog.setObjectName("Dialog");
        //Modifico el modal de la app desde aqui, porque lo tenia en NonModal.. y lo puse 'ApplicationModal'
        Dialog.setWindowModality(com.trolltech.qt.core.Qt.WindowModality.ApplicationModal);
        Dialog.resize(new QSize(1028, 499).expandedTo(Dialog.minimumSizeHint()));
        panelDatos = new QWidget(Dialog);
        panelDatos.setObjectName("panelDatos");
        panelDatos.setGeometry(new QRect(60, 60, 901, 201));
        panelDatos.setStyleSheet("QWidget#widget {background-color: qconicalgradient(cx:0, cy:0, angle:135, stop:0 rgba(0, 171, 128), stop:0.375 rgba(255, 255, 0, 69), stop:0.423533 rgba(251, 255, 0, 145), stop:0.45 rgba(247, 255, 0, 208), stop:0.477581 rgba(255, 244, 71, 130), stop:0.518717 rgba(255, 218, 71, 130), stop:0.55 rgba(255, 255, 0, 255), stop:0.57754 rgba(255, 203, 0, 130), stop:0.625 rgba(255, 255, 0, 69), stop:1 rgba(0, 171, 128))}\n"
                + "\n"
                + "");
        lbCodigo = new QLabel(panelDatos);
        lbCodigo.setObjectName("lbCodigo");
        lbCodigo.setGeometry(new QRect(30, 10, 71, 21));
        QFont font = new QFont();
        font.setFamily("Nirmala UI Semilight");
        font.setPointSize(12);
        font.setBold(true);
        font.setWeight(75);
        lbCodigo.setFont(font);
        lbNombre = new QLabel(panelDatos);
        lbNombre.setObjectName("lbNombre");
        lbNombre.setGeometry(new QRect(30, 40, 81, 20));
        QFont font1 = new QFont();
        font1.setFamily("Nirmala UI Semilight");
        font1.setPointSize(12);
        font1.setBold(true);
        font1.setWeight(75);
        lbNombre.setFont(font1);
        lbApellidos = new QLabel(panelDatos);
        lbApellidos.setObjectName("lbApellidos");
        lbApellidos.setGeometry(new QRect(360, 40, 81, 21));
        QFont font2 = new QFont();
        font2.setFamily("Nirmala UI Semilight");
        font2.setPointSize(12);
        font2.setBold(true);
        font2.setWeight(75);
        lbApellidos.setFont(font2);
        txtCodigo = new QLineEdit(panelDatos);
        txtCodigo.setObjectName("txtCodigo");
        txtCodigo.setGeometry(new QRect(130, 10, 101, 20));
        QFont font3 = new QFont();
        font3.setFamily("Nirmala UI");
        font3.setPointSize(12);
        txtCodigo.setFont(font3);
        txtCodigo.setMaxLength(5);
        txtCodigo.setCursorPosition(0);
        txtNombre = new QLineEdit(panelDatos);
        txtNombre.setObjectName("txtNombre");
        txtNombre.setGeometry(new QRect(130, 40, 151, 20));
        QFont font4 = new QFont();
        font4.setFamily("Nirmala UI");
        font4.setPointSize(12);
        txtNombre.setFont(font4);
        txtNombre.setMaxLength(10);
        txtNombre.setCursorPosition(0);
        txtApellidos = new QLineEdit(panelDatos);
        txtApellidos.setObjectName("txtApellidos");
        txtApellidos.setGeometry(new QRect(460, 40, 161, 20));
        QFont font5 = new QFont();
        font5.setFamily("Nirmala UI");
        font5.setPointSize(12);
        txtApellidos.setFont(font5);
        txtApellidos.setMaxLength(10);
        txtApellidos.setCursorPosition(0);
        lbDireccion = new QLabel(panelDatos);
        lbDireccion.setObjectName("lbDireccion");
        lbDireccion.setGeometry(new QRect(20, 80, 101, 20));
        QFont font6 = new QFont();
        font6.setFamily("Nirmala UI Semilight");
        font6.setPointSize(12);
        font6.setBold(true);
        font6.setWeight(75);
        lbDireccion.setFont(font6);
        txtDireccion = new QLineEdit(panelDatos);
        txtDireccion.setObjectName("txtDireccion");
        txtDireccion.setGeometry(new QRect(130, 80, 251, 20));
        QFont font7 = new QFont();
        font7.setFamily("Nirmala UI");
        font7.setPointSize(12);
        txtDireccion.setFont(font7);
        txtDireccion.setMaxLength(30);
        txtDireccion.setCursorPosition(0);
        lbTelefono = new QLabel(panelDatos);
        lbTelefono.setObjectName("lbTelefono");
        lbTelefono.setGeometry(new QRect(30, 120, 81, 16));
        QFont font8 = new QFont();
        font8.setFamily("Nirmala UI Semilight");
        font8.setPointSize(12);
        font8.setBold(true);
        font8.setWeight(75);
        lbTelefono.setFont(font8);
        txtTelefono = new QLineEdit(panelDatos);
        txtTelefono.setObjectName("txtTelefono");
        txtTelefono.setGeometry(new QRect(130, 120, 151, 20));
        QFont font9 = new QFont();
        font9.setFamily("Nirmala UI");
        font9.setPointSize(12);
        txtTelefono.setFont(font9);
        txtTelefono.setMaxLength(9);
        txtTelefono.setCursorPosition(0);
        lbFechaAlta = new QLabel(panelDatos);
        lbFechaAlta.setObjectName("lbFechaAlta");
        lbFechaAlta.setGeometry(new QRect(0, 160, 111, 16));
        QFont font10 = new QFont();
        font10.setFamily("Nirmala UI Semilight");
        font10.setPointSize(12);
        font10.setBold(true);
        font10.setWeight(75);
        lbFechaAlta.setFont(font10);
        lbTarifa = new QLabel(panelDatos);
        lbTarifa.setObjectName("lbTarifa");
        lbTarifa.setGeometry(new QRect(380, 120, 61, 20));
        QFont font11 = new QFont();
        font11.setFamily("Nirmala UI Semilight");
        font11.setPointSize(12);
        font11.setBold(true);
        font11.setWeight(75);
        lbTarifa.setFont(font11);
        txtTarifa = new QLineEdit(panelDatos);
        txtTarifa.setObjectName("txtTarifa");
        txtTarifa.setGeometry(new QRect(460, 120, 61, 20));
        QFont font12 = new QFont();
        font12.setFamily("Nirmala UI");
        font12.setPointSize(12);
        txtTarifa.setFont(font12);
        txtTarifa.setMaxLength(3);
        txtTarifa.setCursorPosition(0);
        dateTimeEdit = new QDateTimeEdit(panelDatos);
        dateTimeEdit.setObjectName("dateTimeEdit");
        dateTimeEdit.setGeometry(new QRect(130, 160, 194, 22));
        QFont font13 = new QFont();
        font13.setFamily("Nirmala UI");
        font13.setPointSize(12);
        dateTimeEdit.setFont(font13);
        dateTimeEdit.setDate(new QDate(2020, 11, 10));
        dateTimeEdit.setMinimumDate(new QDate(2000, 1, 1));
        lbLogohogar = new QLabel(panelDatos);
        lbLogohogar.setObjectName("label");
        lbLogohogar.setGeometry(new QRect(750, 0, 141, 121));
        //modificamos la ruta de la imagen para poder visualizarla..

        lbLogohogar.setPixmap(new QPixmap(("src/recursos/caiserhogar.jpg")));

        separadorSuperior = new QFrame(Dialog);
        separadorSuperior.setObjectName("separadorSuperior");
        separadorSuperior.setGeometry(new QRect(60, 50, 901, 20));
        //Los separadores otra cosa que no se ve con el color correcto al pasarlo a está interfaz 'NetBeans'; aparentemente el código de color es correcto, de hecho es el mismo que el de la palabra 'Formulario' la cual si se ve correctamente...
        //La ruta, el nombre, (Line#separadorSuperior) no aprecio donde está el fallo...
        separadorSuperior.setStyleSheet("Line#separadorSuperior { color: rgb(0, 171, 128) }");
        separadorSuperior.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Plain);
        separadorSuperior.setLineWidth(2);
        separadorSuperior.setFrameShape(QFrame.Shape.HLine);
        lbTitulo = new QLabel(Dialog);
        lbTitulo.setObjectName("lbTitulo");
        lbTitulo.setGeometry(new QRect(410, 10, 341, 41));
        QFont font14 = new QFont();
        font14.setFamily("Source Code Pro Black");
        font14.setPointSize(36);
        font14.setBold(false);
        font14.setItalic(false);
        font14.setWeight(10);
        lbTitulo.setFont(font14);
        lbTitulo.setStyleSheet("QLabel#lbTitulo {font: 87 36pt \"Source Code Pro Black\"}\n"
                + "QLabel#lbTitulo { color: rgb(0, 171, 128) }\n"
                + "\n"
                + "\n"
                + "");
        separadorCentral = new QFrame(Dialog);
        separadorCentral.setObjectName("separadorCentral");
        separadorCentral.setGeometry(new QRect(60, 266, 901, 16));
        QFont font15 = new QFont();
        font15.setPointSize(6);
        separadorCentral.setFont(font15);
        separadorCentral.setStyleSheet("Line#separadorCentral { color: rgb(0, 171, 128) }");
        separadorCentral.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Plain);
        separadorCentral.setLineWidth(2);
        separadorCentral.setFrameShape(QFrame.Shape.HLine);
        separadorInferior = new QFrame(Dialog);
        separadorInferior.setObjectName("separadorInferior");
        separadorInferior.setGeometry(new QRect(60, 390, 901, 20));
        separadorInferior.setStyleSheet("Line#separadorInferior {color: rgb(0, 171, 128) }");
        separadorInferior.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Plain);
        separadorInferior.setLineWidth(2);
        separadorInferior.setFrameShape(QFrame.Shape.HLine);
        panelZona = new QWidget(Dialog);
        panelZona.setObjectName("panelZona");
        panelZona.setGeometry(new QRect(60, 289, 721, 101));
        QFont font16 = new QFont();
        font16.setFamily("Nirmala UI Semilight");
        font16.setPointSize(10);
        font16.setBold(true);
        font16.setWeight(75);
        panelZona.setFont(font16);
        lbZona = new QLabel(panelZona);
        lbZona.setObjectName("lbZona");
        lbZona.setGeometry(new QRect(10, 30, 161, 41));
        QFont font17 = new QFont();
        font17.setFamily("Nirmala UI Semilight");
        font17.setPointSize(12);
        font17.setBold(true);
        font17.setWeight(75);
        lbZona.setFont(font17);
        checkBoxEstructura = new QCheckBox(panelZona);
        //Añado el 'setEnabled(false)'
        checkBoxEstructura.setEnabled(true);
        //Intente, pero ni mirando la documentación llego a saber como luego hacer el método para volver activarlo asi que los dejare en "true" para al menos poder seleccionarlos.
        checkBoxEstructura.setObjectName("checkBoxEstructura");
        checkBoxEstructura.setGeometry(new QRect(350, 0, 101, 31));
        QFont font18 = new QFont();
        font18.setFamily("Nirmala UI");
        font18.setPointSize(12);
        font18.setBold(false);
        font18.setWeight(50);
        checkBoxEstructura.setFont(font18);
        checkBoxCimentacion = new QCheckBox(panelZona);
        checkBoxCimentacion.setEnabled(true);
        checkBoxCimentacion.setObjectName("checkBoxCimentacion");
        checkBoxCimentacion.setGeometry(new QRect(360, 30, 121, 31));
        QFont font19 = new QFont();
        font19.setFamily("Nirmala UI");
        font19.setPointSize(12);
        font19.setBold(false);
        font19.setWeight(50);
        checkBoxCimentacion.setFont(font19);
        checkBoxAlbaileria = new QCheckBox(panelZona);
        checkBoxAlbaileria.setEnabled(true);
        checkBoxAlbaileria.setObjectName("checkBoxAlbaileria");
        checkBoxAlbaileria.setGeometry(new QRect(350, 60, 111, 31));
        QFont font20 = new QFont();
        font20.setFamily("Nirmala UI");
        font20.setPointSize(12);
        font20.setBold(false);
        font20.setWeight(50);
        checkBoxAlbaileria.setFont(font20);
        checkBoxFontaneria = new QCheckBox(panelZona);
        checkBoxFontaneria.setEnabled(true);
        checkBoxFontaneria.setObjectName("checkBoxFontaneria");
        checkBoxFontaneria.setGeometry(new QRect(520, 0, 111, 31));
        QFont font21 = new QFont();
        font21.setFamily("Nirmala UI");
        font21.setPointSize(12);
        font21.setBold(false);
        font21.setWeight(50);
        checkBoxFontaneria.setFont(font21);
        checkBoxCArpinteria = new QCheckBox(panelZona);
        checkBoxCArpinteria.setEnabled(true);
        checkBoxCArpinteria.setObjectName("checkBoxCArpinteria");
        checkBoxCArpinteria.setGeometry(new QRect(530, 30, 111, 31));
        QFont font22 = new QFont();
        font22.setFamily("Nirmala UI");
        font22.setPointSize(12);
        font22.setBold(false);
        font22.setWeight(50);
        checkBoxCArpinteria.setFont(font22);
        checkBoxDecoracion = new QCheckBox(panelZona);
        checkBoxDecoracion.setEnabled(true);
        checkBoxDecoracion.setObjectName("checkBoxDecoracion");
        checkBoxDecoracion.setGeometry(new QRect(520, 60, 111, 31));
        QFont font23 = new QFont();
        font23.setFamily("Nirmala UI");
        font23.setPointSize(12);
        font23.setBold(false);
        font23.setWeight(50);
        checkBoxDecoracion.setFont(font23);
        groupBox = new QGroupBox(panelZona);
        groupBox.setObjectName("groupBox");
        groupBox.setGeometry(new QRect(180, 0, 141, 101));
        rbtnLevante = new QRadioButton(groupBox);
        rbtnLevante.setObjectName("rbtnLevante");
        rbtnLevante.setGeometry(new QRect(20, 0, 81, 31));
        QFont font24 = new QFont();
        font24.setFamily("Nirmala UI Semilight");
        font24.setPointSize(12);
        font24.setBold(true);
        font24.setWeight(75);
        rbtnLevante.setFont(font24);
        rbtnCentro = new QRadioButton(groupBox);
        rbtnCentro.setObjectName("rbtnCentro");
        rbtnCentro.setGeometry(new QRect(20, 30, 81, 31));
        QFont font25 = new QFont();
        font25.setFamily("Nirmala UI Semilight");
        font25.setPointSize(12);
        font25.setBold(true);
        font25.setWeight(75);
        rbtnCentro.setFont(font25);
        rbtnSur = new QRadioButton(groupBox);
        rbtnSur.setObjectName("rbtnSur");
        rbtnSur.setGeometry(new QRect(20, 60, 81, 31));
        QFont font26 = new QFont();
        font26.setFamily("Nirmala UI Semilight");
        font26.setPointSize(12);
        font26.setBold(true);
        font26.setWeight(75);
        rbtnSur.setFont(font26);
        panelBotones = new QWidget(Dialog);
        panelBotones.setObjectName("panelBotones");
        panelBotones.setGeometry(new QRect(430, 420, 261, 61));
        panelBotones.setStyleSheet("QWidget#panelBotones { background-color:qconicalgradient(cx:0.073, cy:0.085, angle:135, stop:0 rgba(255, 129, 0, 63), stop:0.375 rgba(255, 148, 25, 69), stop:0.45 rgba(255, 148, 25, 208), stop:0.477581 rgba(255, 244, 71, 130), stop:0.482955 rgba(255, 148, 25, 145), stop:0.518717 rgba(255, 218, 71, 130), stop:0.55 rgba(255, 148, 25, 255), stop:0.57754 rgba(255, 203, 0, 130), stop:0.625 rgba(255, 255, 0, 69), stop:1 rgba(255, 255, 0, 69)) }");
        btnAceptar = new QPushButton(panelBotones);
        btnAceptar.setObjectName("btnAceptar");
        btnAceptar.setEnabled(true);
        btnAceptar.setGeometry(new QRect(20, 20, 101, 31));
        btnAceptar.setStyleSheet("QPushButton#btnAceptar {\n"
                + "    background-color:rgb(0, 171, 128);\n"
                + "    border-style: outset;\n"
                + "    border-width: 2px;\n"
                + "	border-color: rgb(255, 148, 25);\n"
                + "    font: 87 14pt \"Segoe UI Black\";\n"
                + "	color: rgb(255, 255, 255);    \n"
                + "}");
        btnAceptar.setAutoRepeatDelay(300);
        btnAceptar.setAutoDefault(false);
        btnCancelar = new QPushButton(panelBotones);
        btnCancelar.setObjectName("btnCancelar");
        btnCancelar.setGeometry(new QRect(140, 20, 101, 31));
        btnCancelar.setStyleSheet("QPushButton#btnCancelar {\n"
                + "    background-color:rgb(0, 171, 128);\n"
                + "    border-style: outset;\n"
                + "    border-width: 2px;\n"
                + "	border-color: rgb(255, 148, 25);\n"
                + "    font: 87 14pt \"Segoe UI Black\";\n"
                + "	color: rgb(255, 255, 255);    \n"
                + "}\n"
                + "");
        panelComercial = new QWidget(Dialog);
        panelComercial.setObjectName("panelComercial");
        panelComercial.setGeometry(new QRect(60, 420, 291, 61));
        lbComercial = new QLabel(panelComercial);
        lbComercial.setObjectName("lbComercial");
        lbComercial.setGeometry(new QRect(10, 20, 101, 21));
        QFont font27 = new QFont();
        font27.setFamily("Nirmala UI Semilight");
        font27.setPointSize(12);
        font27.setBold(true);
        font27.setWeight(75);
        lbComercial.setFont(font27);
        txtComercial = new QLineEdit(panelComercial);
        txtComercial.setObjectName("txtComercial");
        txtComercial.setGeometry(new QRect(120, 20, 151, 20));
        QFont font28 = new QFont();
        font28.setFamily("Nirmala UI");
        font28.setPointSize(12);
        txtComercial.setFont(font28);
        txtComercial.setMaxLength(10);
        txtComercial.setCursorPosition(0);
        lbLogoSuperior = new QLabel(Dialog);
        lbLogoSuperior.setObjectName("lbLogoSuperior");
        lbLogoSuperior.setGeometry(new QRect(80, 13, 291, 41));
        //Nuevamente tendre que modificar la ruta de la imagen

        lbLogoSuperior.setPixmap(new QPixmap(("src/recursos/caiserseguros.jpg")));

        lbCodigo.setBuddy(txtCodigo);
        lbNombre.setBuddy(txtNombre);
        lbApellidos.setBuddy(txtApellidos);
        lbDireccion.setBuddy(txtDireccion);
        lbTelefono.setBuddy(txtTelefono);
        lbFechaAlta.setBuddy(dateTimeEdit);
        lbTarifa.setBuddy(txtTarifa);
        lbZona.setBuddy(rbtnCentro);
        lbComercial.setBuddy(txtComercial);
        QWidget.setTabOrder(txtCodigo, txtNombre);
        QWidget.setTabOrder(txtNombre, txtApellidos);
        QWidget.setTabOrder(txtApellidos, txtDireccion);
        QWidget.setTabOrder(txtDireccion, txtTelefono);
        QWidget.setTabOrder(txtTelefono, dateTimeEdit);
        QWidget.setTabOrder(dateTimeEdit, txtTarifa);
        QWidget.setTabOrder(txtTarifa, rbtnLevante);
        QWidget.setTabOrder(rbtnLevante, rbtnCentro);
        QWidget.setTabOrder(rbtnCentro, rbtnSur);
        QWidget.setTabOrder(rbtnSur, checkBoxEstructura);
        QWidget.setTabOrder(checkBoxEstructura, checkBoxCimentacion);
        QWidget.setTabOrder(checkBoxCimentacion, checkBoxAlbaileria);
        QWidget.setTabOrder(checkBoxAlbaileria, checkBoxFontaneria);
        QWidget.setTabOrder(checkBoxFontaneria, checkBoxCArpinteria);
        QWidget.setTabOrder(checkBoxCArpinteria, checkBoxDecoracion);
        QWidget.setTabOrder(checkBoxDecoracion, txtComercial);
        QWidget.setTabOrder(txtComercial, btnAceptar);
        QWidget.setTabOrder(btnAceptar, btnCancelar);
        retranslateUi(Dialog);
        btnCancelar.clicked.connect(txtCodigo, "clear()");
        btnCancelar.clicked.connect(txtNombre, "clear()");
        btnCancelar.clicked.connect(txtApellidos, "clear()");
        btnCancelar.clicked.connect(txtDireccion, "clear()");
        btnCancelar.clicked.connect(txtTarifa, "clear()");
        btnCancelar.clicked.connect(txtTelefono, "clear()");
        //me da error
        //btnCancelar.clicked.connect(dateTimeEdit, "clear()");
        btnCancelar.clicked.connect(txtComercial, "clear()");
        
        btnAceptar.clicked.connect(Dialog, "accept()");
        btnCancelar.clicked.connect(Dialog, "disposeLater()");
        //Estos clicked no me son utiles, ni funcionales
        rbtnLevante.pressed.connect(checkBoxEstructura, "click()");
        rbtnLevante.pressed.connect(checkBoxCimentacion, "click()");
        rbtnLevante.pressed.connect(checkBoxAlbaileria, "click()");
        rbtnLevante.pressed.connect(checkBoxFontaneria, "click()");
        rbtnLevante.pressed.connect(checkBoxCArpinteria, "click()");
        rbtnLevante.pressed.connect(checkBoxDecoracion, "click()");
        rbtnCentro.pressed.connect(checkBoxAlbaileria, "click()");
        rbtnCentro.pressed.connect(checkBoxFontaneria, "click()");
        rbtnCentro.pressed.connect(checkBoxCArpinteria, "click()");
        rbtnCentro.pressed.connect(checkBoxDecoracion, "click()");
        rbtnSur.pressed.connect(checkBoxAlbaileria, "click()");
        rbtnSur.pressed.connect(checkBoxCArpinteria, "click()");
        rbtnSur.pressed.connect(checkBoxFontaneria, "click()");
        
        Dialog.accepted.connect(btnAceptar, "showMenu()");
        Dialog.finished.connect(btnCancelar, "close()");

        /**
         * ************************************************
         * Aqui añadimos la conexion signal/slot
         */
        btnAceptar.clicked.connect(this, "mensajeAceptar()");      
        btnCancelar.clicked.connect(this, "mensajeCancelar()");
                
        /**
         * ***************************************************
         */
        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog) {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        lbCodigo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Aqui se insertara el c\u00f3digo del cliente.</p></body></html>", null));
        lbCodigo.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&C\u00f3digo:", null));
        lbNombre.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Nombre de cliente.", null));
        lbNombre.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Nombre:", null));
        lbApellidos.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Apellidos del Cliente.", null));
        lbApellidos.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Apellidos:", null));
        txtCodigo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "M\u00e1ximo 5 caracteres alfan\u00famericos.", null));
        txtCodigo.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "NNNNN; ", null));
        txtCodigo.setText("");
        txtNombre.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "M\u00e1ximo 10 caracteres alfan\u00famericos.", null));
        txtNombre.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "NNNNNNNNNN; ", null));
        txtNombre.setText("");
        txtApellidos.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "M\u00e1ximo 10 caracteres alfan\u00famericos.", null));
        txtApellidos.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "NNNNNNNNNN; ", null));
        txtApellidos.setText("");
        lbDireccion.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Calle, n\u00famero.", null));
        lbDireccion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Direcci\u00f3n:", null));
        txtDireccion.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "M\u00e1ximo 30 caracteres alfan\u00famericos.", null));
        txtDireccion.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNN ; ", null));
        txtDireccion.setText("");
        lbTelefono.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "N\u00famero tel\u00e9fono del cliente.", null));
        lbTelefono.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Tel\u00e9fono:", null));
        txtTelefono.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "M\u00e1ximo 9 caracteres n\u00famericos.", null));
        txtTelefono.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "000000000; ", null));
        txtTelefono.setText("");
        lbFechaAlta.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Introduciremos la fecha de alta del usuario.", null));
        lbFechaAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Fecha de Alta:", null));
        lbTarifa.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "N\u00famerico ", null));
        lbTarifa.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tar&ifa:", null));
        txtTarifa.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "M\u00e1ximo 100\u20ac.", null));
        txtTarifa.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "000; ", null));
        txtTarifa.setText("");
        dateTimeEdit.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Formato: dd/mes/a\u00f1o", null));
        dateTimeEdit.setDisplayFormat(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "dd/MM/yyyy", null));
        lbLogohogar.setText("");
        lbTitulo.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Formulario:", null));
        lbZona.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Elija una zona geogr\u00e1fica de las tres opciones posibles.", null));
        lbZona.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Zona Geogr\u00e1fica:", null));
        checkBoxEstructura.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Estructura", null));
        checkBoxCimentacion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cimentaci\u00f3n", null));
        checkBoxAlbaileria.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Alba\u00f1iler\u00eda", null));
        checkBoxFontaneria.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fontaner\u00eda", null));
        checkBoxCArpinteria.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Carpinter\u00eda", null));
        checkBoxDecoracion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Decoraci\u00f3n", null));
        groupBox.setTitle("");
        rbtnLevante.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Levante", null));
        rbtnCentro.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Centro", null));
        rbtnSur.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Sur", null));
        panelBotones.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Botones Aceptary Cancelar", null));
        btnAceptar.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Este bot\u00f3n se activara, cuando se hayan cumplido todos los requisitos.</p></body></html>", null));
        btnAceptar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Aceptar", null));
        btnCancelar.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Aqui podremos cancelar y salir del formulario.</p></body></html>", null));
        btnCancelar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Cancelar", null));
        lbComercial.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Aqui se insertara el c\u00f3digo del cliente.</p></body></html>", null));
        lbComercial.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "C&omercial:", null));
        txtComercial.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "M\u00e1ximo 10 caracteres.", null));
        txtComercial.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "NNNNNNNNNN; ", null));
        txtComercial.setText("");
        lbLogoSuperior.setText("");
    } // retranslateUi   
}
