import javax.swing.JOptionPane;

public class JavaLibs5026201141 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hey, I do not think I have met you before.");
		String name = JOptionPane.showInputDialog("What do I call you?");
		JOptionPane.showMessageDialog(null, "Nice to meet you, " + name + " !");
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
		String birth = JOptionPane.showInputDialog("Where were you born?");
		String hobby = JOptionPane.showInputDialog("What do you usually do to spend your time?");
		String school = JOptionPane.showInputDialog("Hey, I sometimes do " + hobby + " too! Where do you go to school?");
		int pn = Integer.parseInt(JOptionPane.showInputDialog("May I have your last 4 digits of phone number?"));
		String ffood = JOptionPane.showInputDialog("By the way, what's your favorite food?");
		double sumfood = Double.parseDouble(JOptionPane.showInputDialog("How many " + ffood + " do you eat in one sitting?"));

		int selfage = age + 1;
		double selffood = sumfood + 1.5;
		JOptionPane.showMessageDialog(
			null,
			"Hello, " + name + "! I am Mauritz. I am about " + selfage + " years old.\n I was born in Surabaya, but I am sure I will put " + birth + " to my bucket list! When I go there, we can do " +
			hobby + " together, and maybe even go to " + school + " to meet your teachers!\n After the pandemic is over, I guess. Well, I will  be sure to put xxxxxxx" + pn + " to my contacts list, and maybe we could even cook " + selffood + " more " + ffood + " than you usually do! See you later!");
}
}
