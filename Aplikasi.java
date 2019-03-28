
package Praktek5;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Tri
 */
public class Aplikasi {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Halo");
        frame.setSize(300, 200);
        
        frame.setLayout(new BorderLayout());
        
        JLabel lblNama = new JLabel();
        lblNama.setText("Tri");
        frame.add(lblNama, BorderLayout.WEST);
        
        JButton btnSimpan = new JButton("Simpan");
        frame.add(btnSimpan, BorderLayout.EAST);
        
        frame.setVisible(true);
    }
     
}
