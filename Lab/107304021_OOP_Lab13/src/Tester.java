
import javax.swing.JFrame; 
import javax.swing.JButton;
import java.awt.event.ActionEvent;//抽象視窗工具
import java.awt.event.ActionListener;


public class Tester {

		private static final int FRAME_WIDTH=400;
		private static final int FRAME_HEIGHT=200;
		//private static int currentYear=0;//
		public static void main(String[] args) {  
			final Company c =new Company("NCCU");
			final Vehicle v =new Vehicle(1,500000,10, 50000);
			
			JFrame f = new JFrame("Depreciation Expense Calculator"); 
		    JButton b = new JButton("Do Calaulate");
		    //f.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		    f.add(b);
		    f.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		    
		    class  ButtonListener  implements ActionListener{
		    	//private int currentYear=0;
		    	public void actionPerformed(ActionEvent e) {
		    		String s="";
		    		v.calcDepreciationRate();	
		    		s+=String.format("Year: %d%n", v.getDepreciationYear());	    
		    		s+=String.format("Total depreciation expense: %.2f%n",v.getDepreciationExp());
		    		//c.updateBookValue();
		    		//c.updateDepreciationExp();
		    		s+=String.format("Book value of fixed assets: %.2f%n",v.getBookValue());
		    		if(v.getDepreciationYear()>1) {
		    			System.out.println(s);
		    		}
		    		//System.out.println(s);
		    	}
		    }
		    		ActionListener button = new ButtonListener();
		    	    b.addActionListener(button);		  		    	       
		    	    f.setVisible(true);
		    	    f.setLayout(null);
		    	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
