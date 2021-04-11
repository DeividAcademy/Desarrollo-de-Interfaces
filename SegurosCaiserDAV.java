/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguroscaiserdav;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;

/**
 *
 * @author deivi
 */
public class SegurosCaiserDAV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        QApplication.initialize(args);
            QMainWindow mw = new QMainWindow();
            frmPrincipal principal = new frmPrincipal();
            principal.setupUi(mw);
            mw.show();
        int execStatic = QApplication.execStatic();

    }

}
