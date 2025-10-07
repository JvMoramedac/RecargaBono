import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecargaBus {
    private JPanel panelPrincipal;
    private JLabel image;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton recargarBonobusButton;

    public RecargaBus() {
        recargarBonobusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panelPrincipal, "Recarga Bonobus:" +
                        "\nTipo de Bonobus: " + comboBox1.getSelectedItem() +
                        "\nNúmero de Bonobus: " + textField1.getText() +
                        "\nImporte a Recargar: " + textField2.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RecargaBus");
        frame.setContentPane(new RecargaBus().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
