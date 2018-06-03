package universitas1;

import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author achyar
 */
public class Universitas1 extends JFrame {

    public static void main(String[] args) throws SQLException {
        mhsForm CALL = new mhsForm();
        CALL.setVisible(true);
    }
    
}
