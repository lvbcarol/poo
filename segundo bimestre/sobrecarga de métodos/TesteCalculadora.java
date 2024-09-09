import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String [] args){
        var calculator = new calculadora();
        calculator.somar(2, 3);
        caculator.somar(2f, 3f);
        //esse f indica que é float
        calculator.somar("2", "3");
        calculator.somar(2, "3");
        calculator.somar("3", 2);
        calculator.somar("2", "2", "2");
        double v = calculator.somar(2, 3);
        var v2 = calculator.somar(2, 3);
        System.out.println(calculator.somar(2,3));
        JOptionPane.showMessageDialog(null, "oi");
        JOptionPane.showMessageDialog(null, "oi",
        "Título", JOptionPane.INFORMATION_MESSAGE);


    }
}
