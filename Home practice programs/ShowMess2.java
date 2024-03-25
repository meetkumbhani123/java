import javax.swing.JOptionPane;

public class ShowMess2 {
    public static void main(String[] args) {
        String radiuString = JOptionPane.showInputDialog("Enter the radius of the circle :");
        double radius = Double.parseDouble(radiuString);
        final double PI = 3.14;
        double areaOfCircle;
        areaOfCircle = PI * radius * radius;
        String output = "the Area of circle is " + areaOfCircle;
        JOptionPane.showMessageDialog(null, output);
        JOptionPane.showMessageDialog(null,"my name is meet","introduction", JOptionPane.INFORMATION_MESSAGE);

    }

}
