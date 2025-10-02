package Lab1;
import javax.swing.JOptionPane;

public class ShowTwoNumber {

	public static void main(String[] args) {
			String strnum1,strnum2;
			String stringsum;
			strnum1= JOptionPane.showInputDialog(null,JOptionPane.INFORMATION_MESSAGE);
			strnum2= JOptionPane.showInputDialog(null,JOptionPane.INFORMATION_MESSAGE);
			stringsum = strnum1 + "and" + strnum2;
			
			JOptionPane.showMessageDialog(null,stringsum,"",JOptionPane.INFORMATION_MESSAGE);
	}
	

}
