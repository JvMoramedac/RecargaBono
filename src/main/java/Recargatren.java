import javax.swing.*;

public class Recargatren {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Recargatren");
        frame.setContentPane(new Recargatren().RECARGATREN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel RECARGATREN;
    private JButton bono10Viajes12Button;
    private JButton bonoTrimestral12000€Button;
    private JButton PAGARButton;
    private JButton VOLVERButton;
    private JComboBox comboBox1;

}
