import javax.swing.JOptionPane;

public class JOptionPane {
    public static void main (String[] args){
        String nameOfThePerson;
        int ageOfThePerson;

        nameOfThePerson = JOptionPane.showInputDialog("Enter Your Name :");
        ageOfThePerson = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age :"));
        JOptionPane.showMessageDialog(null,"Your Name :"+nameOfThePerson);
        JOptionPane.showMessageDialog(null,"You Are"+ageOfThePerson+"Years Old");



    }
