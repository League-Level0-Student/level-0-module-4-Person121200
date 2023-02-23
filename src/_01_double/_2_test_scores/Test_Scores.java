package _01_double._2_test_scores;
import javax.swing.JOptionPane;

public class Test_Scores {
public static void main(String[] args) {
String test = JOptionPane.showInputDialog("What is your recent test score?");
float testAsfloat = Float.parseFloat(test);




if (testAsfloat >= 90.000) {
	JOptionPane.showMessageDialog(null, "You did so well on the test, you aced!!!");
}
else if (testAsfloat >= 80.000) {
	JOptionPane.showMessageDialog(null, "You did well, good job");
}
else if(testAsfloat >= 70.000) {
	JOptionPane.showMessageDialog(null, "goood jobb??");
}
else if (testAsfloat >= 60.000) {
	JOptionPane.showMessageDialog(null, "At least you passed..");
}
else if (testAsfloat >= 50.000) {
	JOptionPane.showMessageDialog(null, "Next time do better");

}
}
}
