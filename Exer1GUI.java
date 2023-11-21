import javax.swing.*;
public class Exer1GUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Exercise 1 GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        String product1 = "Computer";
        String product2 = "Office desk";
        byte age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        panel.add(new JLabel("Products:"));
        panel.add(new JLabel(product1 + ", which price is $" + price1));
        panel.add(new JLabel(product2 + ", which price is $" + price2));
        panel.add(new JLabel(""));
        panel.add(new JLabel("Record: " + age + " years old, code " + code + " and gender: " + gender));
        panel.add(new JLabel(""));
        panel.add(new JLabel("Measure with eight decimal places: " + measure));
        panel.add(new JLabel("Rounded (three decimal places): " + String.format("%.3f", measure)));
        panel.add(new JLabel("US decimal point: " + String.format("%.3f", measure)));

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
