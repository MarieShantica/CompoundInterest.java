/*
I want to invest $123.456,78 into my account. If I invest it in a fund that earns a nominal
interest rate of 7.1% compounded monthly, how much money will I receive in 30 years?
FV = PV * r^(kn)
r = (1 + r / (100k))
 */
import javax.swing.*;
public class CompoundInterest {
	
	public static void main(String[] args) {
		//k
		final double Period = 12;
		//PV
		String rawPV = JOptionPane.showInputDialog(null, "Input your investment amount ($)", "Investment Amount", JOptionPane.QUESTION_MESSAGE);
		double PV = Double.parseDouble(rawPV);
		// r
		String rawRate = JOptionPane.showInputDialog(null, "Input your interest rate per month (%)", "Interest Rate Per Month",JOptionPane.QUESTION_MESSAGE);
		double rate = Double.parseDouble(rawRate);
		//n
		String rawYear = JOptionPane.showInputDialog(null, "Input your number of years", "Number of Years",JOptionPane.QUESTION_MESSAGE);
		double year = Double.parseDouble(rawYear);
		
		//final r
		double period100 = Period * 100;
		double finalRate = (1 + (rate / period100));
		//r powered
		double yearPeriod = Period * year;
		double ratePow = Math.pow(finalRate, yearPeriod);
		//FV 
		double FV = PV * ratePow;
		
		JOptionPane.showMessageDialog(null, "Your investment after " + year + " year(s) is $" + FV + " or $" + Math.round(FV));
		
	}

}
