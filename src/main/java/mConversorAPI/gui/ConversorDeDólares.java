package mConversorAPI.gui;

import mConversorAPI.Conversiones;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorDeDólares extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    public static JTextArea textArea;
    public static String monedaSeleccionada;
    public static double monto;
    public static Object[] monedas = {"De Dólares a Colones", "De Dólares a Euros",
            "De Dólares a Libras", "De Dólares a Yen", "De Dólares a Won Coreano",
            "De Dólares a Pesos Méxicanos", "De Dólares a Soles"};

    public ConversorDeDólares() {
        setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 415);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setLocationRelativeTo(null);
        setResizable(false);

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(102, 51, 0), null, null, null));
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(0, 0, 684, 376);
        contentPane.add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.black);
        panel_1.setBounds(0, 0, 684, 74);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("Conversor de Dólares");
        lblNewLabel.setForeground(Color.lightGray);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(245, 11, 216, 43);
        panel_1.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Moneda");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1.setForeground(Color.BLACK);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(20, 85, 148, 44);
        panel.add(lblNewLabel_1);

		final JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 153, 0));
		comboBox.setMaximumRowCount(7);
		comboBox.setBackground(UIManager.getColor("ScrollBar.foreground"));
		comboBox.setBounds(20, 131, 148, 29);
		panel.add(comboBox);

        for (Object moneda : monedas) {
            comboBox.addItem(moneda);
        }

        comboBox.setSelectedItem(monedas[0]);

        textField = new JTextField();
        textField.setForeground(Color.BLACK);
        textField.setBounds(205, 131, 138, 29);
        panel.add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("Convertir");
        btnNewButton.setBounds(215, 172, 117, 29);
        btnNewButton.setForeground(Color.lightGray);
        btnNewButton.setBackground(Color.black);
        btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
        getRootPane().setDefaultButton(btnNewButton);
        panel.add(btnNewButton);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setBounds(441, 131, 164, 29);
        textArea.setBackground(Color.gray);
        textArea.setEditable(false);
        panel.add(textArea);

        JLabel lblNewLabel_1_1 = new JLabel("Monto");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1_1.setForeground(Color.BLACK);
        lblNewLabel_1_1.setBackground(Color.gray);
        lblNewLabel_1_1.setBounds(205, 85, 138, 44);
        panel.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_1_1 = new JLabel("Conversión");
        lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1_1_1.setForeground(Color.BLACK);
        lblNewLabel_1_1_1.setBackground(Color.gray);
        lblNewLabel_1_1_1.setBounds(441, 85, 164, 44);
        panel.add(lblNewLabel_1_1_1);

        // Acciones
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monedaSeleccionada = (String) comboBox.getSelectedItem();
                String montoString = textField.getText();


                try {
                    monto = Double.parseDouble(montoString);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Asegúrate de haber ingresado únicamente números");
                    return;
                }

                if (monedaSeleccionada.equals(monedas[0])) {
                    Conversiones.convertirUsdToCrc(textArea);
                } else if (monedaSeleccionada.equals(monedas[1])) {
                    Conversiones.convertirUsdToEur(textArea);
                } else if (monedaSeleccionada.equals(monedas[2])) {
                    Conversiones.convertirUsdToGBP(textArea);
                } else if (monedaSeleccionada.equals(monedas[3])) {
                    Conversiones.convertirUsdToJPY(textArea);
                } else if (monedaSeleccionada.equals(monedas[4])) {
                    Conversiones.convertirUsdToKRW(textArea);
                } else if (monedaSeleccionada.equals(monedas[5])) {
                    Conversiones.convertirUsdToMXN(textArea);
                } else if (monedaSeleccionada.equals(monedas[6])) {
                    Conversiones.convertirUsdToPEN(textArea);
                }
            }
        });
    }
}
