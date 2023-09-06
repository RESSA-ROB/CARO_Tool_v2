import java.util.Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.ViewerListener;
import org.graphstream.ui.view.ViewerPipe;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.time.Instant;
import java.text.Format;
import java.util.ArrayList;
import java.util.Dictionary;
import javax.swing.JComponent;
import javax.swing.JFileChooser;

import java.util.Hashtable;
import java.text.DecimalFormat;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Rectangle;

import javax.swing.UIManager;
    import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.IOException;
import java.io.FileReader;
import java.awt.Component;
import java.awt.Desktop;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JFrame;  
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
class Edge1
{
    String id1;
    String id2;
    String type;
    int value;
    double prob;
    double cprob;
    Edge1 next;
}
class Edge2
{
    String id1;
    String id2;
    Edge2 next;
}
class Node
{
    String id;
    int priority;
    Node next;
}
public class SwingDemo extends JFrame{
	static JFrame mainframe = new JFrame();
	static JPanel panel = new JPanel();
	static JPanel panel1 = new JPanel();
	static JPanel panel2 = new JPanel();
	static JPanel panel3 = new JPanel();
	static JPanel panel4 = new JPanel();
	static JPanel panel5 = new JPanel();
	static JPanel panel6= new JPanel();
	static JPanel btnPanel1 = new JPanel();
	static JPanel btnPanel2 = new JPanel();
	static JPanel panel7= new JPanel();
	static JLabel label1 = new JLabel("Set Requirement Dependencies");
	static JLabel label2 = new JLabel("Generate Partial Order");
	static JLabel label3 = new JLabel("Dashboard");
	static JLabel label4 = new JLabel("Project Parameters");
	static JLabel label5 = new JLabel("Welcome to CARO TOOL!");
	static JLabel label6 = new JLabel("Add Requirements to Process");
	static JLabel label7= new JLabel("FR Label");
	static JLabel label8= new JLabel("Description");
	static JLabel label9= new JLabel("NFR Label");
	static JLabel label10= new JLabel("Description");
	static JLabel label11= new JLabel("Functional Requirements");
	static JLabel label12= new JLabel("Non-Functional Requirements");
	static JLabel label13=new JLabel("Change Requests and Risk Assessment");
	static JButton btn1 = new JButton("Relations");
	static JButton btn2 = new JButton("Generate PO");
	static JButton btn3 = new JButton("View Dashboard");
	static JButton btn4 = new JButton("Set Project Parameters");
	static JButton btn5 = new JButton("Load Config");
	static JButton btn6 = new JButton("Save Config");
	static JButton button7;
	static JButton btn8= new JButton("Save FR");
	static JButton btn9= new JButton("Save NFR");
	
	static JButton btn12= new JButton("Specify Requirements");
	static JButton loadNFR=new JButton("Load NFR");
	static JButton savePriority = new JButton("Save Priority");
	static JButton btn13= new JButton("Change/Risk");
	static JButton set=new JButton("Set");
    static final JRadioButton conflict = new JRadioButton("Conflict");
    static final JRadioButton priority = new JRadioButton("NFR Priority");
    static final JRadioButton  both = new JRadioButton("Product");
    static final JRadioButton both2 = new JRadioButton("Weighted sum");
    static JButton submit = new JButton("SUBMIT");
	static JTextArea degree, fr1, nfr4;
	static JTextArea frlabel1=new JTextArea(20,20);
	static JTextArea frlabel2=new JTextArea(100,100);
	static JTextArea nfrlabel1=new JTextArea(20,20);
	static JTextArea nfrlabel2=new JTextArea(100,100);
	static JTextArea nfrimpactvalue=new JTextArea(20,20);
	static int loaddata=0;
    static int countfr=0, countnfr=0;
    static JTable frnfr=new JTable();
    static JTable NFR_priority;
    static Edge1 E_FN=null;
    static Edge1 E_NN=null;
    static Edge2 E_FF=null;
    static int flag=1;
    static Node NFR=null;
    static Node FR=null;
    static Node g, frhead;
    static JFrame fp_frame=new JFrame("Set values of FP attributes");
    static JSlider slider1 = new JSlider(0, 0, 10, 0);
    static int choice=0;
    static double w1=0.0, w2=0.0;
    static JComboBox frlist1=new JComboBox();
    static JComboBox frlist2=new JComboBox();
    static JComboBox frlist3=new JComboBox();
    static JComboBox nfrlist1=new JComboBox();
    static JComboBox nfrlist2=new JComboBox();
    static JComboBox nfrlist3=new JComboBox();
	static JComboBox categorybox=new JComboBox();
	static JComboBox componentbox=new JComboBox();
	static JComboBox nfrimpactbox=new JComboBox();
	static Edge1[][] prop_list;
	static {
	 fr1=new JTextArea(20,20);
     nfr4=new JTextArea(20,20);
	}
	public static void construct_panel6() {
		// Setting heading
				Font f = new Font("TimesRoman",Font.BOLD+Font.ITALIC,25);
		  	  	label6.setFont(f);
				panel6.setLayout(null);
				label6.setBounds(300, 10, 500, 100);
				
				//Setting FR portion
				label11.setFont(new Font("Calibri", 2, 14));
		         label11.setBounds(50, 90, 200, 100);
		         panel6.add(label11);
		         
		         label7.setFont(new Font("Calibri", 2, 14));
		         label7.setBounds(50, 150, 200, 100);
		         panel6.add(label7);
		         
		         frlabel1.setFont(new Font("Calibri", 2, 14));
		         frlabel1.setToolTipText("Add labels in the form fr1, fr2...");
		         frlabel1.setBounds(120, 170, 100, 40);
		         frlabel1.setBackground(new Color(204, 204, 204));
		         
		         panel6.add(frlabel1);
		         
		         label8.setFont(new Font("Calibri", 2, 14));
		         label8.setBounds(50, 200, 200, 100);
		         panel6.add(label8);
		         
		         frlabel2.setFont(new Font("Calibri", 2, 14));
		        frlabel2.setBounds(120, 220, 300, 60);
		         frlabel2.setBackground(new Color(204, 204, 204));
		         frlabel2.setWrapStyleWord(true);
		         JScrollPane sp = new JScrollPane(frlabel2);   
		
		        
		        sp.setBounds(120,220, 500,40);
		        sp.setBackground(new Color(204, 204, 204));
		         sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		         panel6.add(sp);
		         
		         btn8.setToolTipText("Click to save FR");
		         btn8.setFont(new Font("Calibri", 2, 16));
		         btn8.setBackground(new Color(120, 168, 252));
		         btn8.setForeground(Color.black);
		         btn8.setBounds(50, 290, 120,30);
		        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		         panel6.add(btn8);
		        btn8.addActionListener(new ActionListener() {
		             @Override
		             public void actionPerformed(final ActionEvent e) {
		                 
		            	String fr1=frlabel1.getText();
		                String fr2=frlabel2.getText();
		                int len=fr1.length();
		                char[] fr1char=fr1.toCharArray();
		                int checkflag=0;
		                for(int i=0; i<len; i++)
		                {
		                	int k=fr1char[i];
		                
		                	if(i<=1) {
		                		if(i==0) {
		                			if(fr1char[i]!='f') {
		                			
		                				checkflag=1;
		                			}
		                		}
		                		else {
		                			if(fr1char[i]!='r') {
		                				
		                				checkflag=1;
		                			}
		                		}
		                			
		                	}
		                	else {
		                		if(k>=48 && k <=57)
		                		{
		                			//Do nothing
		                		}
		                		else {
		                			
		                			checkflag=1;
		                		}
		                	}
		                }
		                if(checkflag==1) {
		                	JOptionPane.showMessageDialog(panel6, "Incorrect FR label format.");
		                }
		                else {
		                	if(fr2.compareTo("")==0) {
		                		JOptionPane.showMessageDialog(panel6, "Enter a description!");
		                	}
		                	else {
		                		try {
		                			File f1=new File("FR.txt");
		                			checkflag=0;
		                			if(f1.exists()) {
		                				
		                				FileReader fread1=new FileReader("FR.txt");
		                				int readc=0;
		                				char c;
		                				String temp="";
		                				while((readc=fread1.read())!=-1) {
		                	    				c=(char)readc;
		                	    				temp=temp.concat(Character.toString(c));
		                	    				while((readc=fread1.read())!=32) {
		                	    					c=(char)readc;
			                	    				temp=temp.concat(Character.toString(c));
		                	    				}
		                	    			if(fr1.compareTo(temp)==0) {
		                	    				JOptionPane.showMessageDialog(panel6, "FR with same label exists");
		                	    				checkflag=1;
		                	    				break;
		                	    			}
		                	    			while((readc=fread1.read())!=10) {
		                	    				if(readc==-1)
		                	    					break;
	                	    				
	                	    				}
		                	    			temp="";
		                	    		}
		                				if(checkflag==0) {
		                					FileWriter fw1 = new FileWriter("FR.txt", true); 
			                				BufferedWriter bw1 = new BufferedWriter(fw1);
			                				bw1.write(fr1+" "+fr2);
			                				bw1.newLine();
			                				System.out.println(fr1+" "+fr2);
			                				bw1.close();
			                				fw1.close();
		                				}
		                			}
		                			else {
		                				FileWriter fw1 = new FileWriter("FR.txt", true); 
		                				BufferedWriter bw1 = new BufferedWriter(fw1);
		                				bw1.write(fr1+" "+fr2);
		                				System.out.println(fr1+" "+fr2);
		                				bw1.newLine();
		                				bw1.close();
		                				fw1.close();
		                			}
		                		}catch(Exception ef) {
		                			System.out.println("File not found!");
		                		}
		                	}
		                }
		                
		             }
		         });
		         
		         //Setting NFR portion
		       //Setting FR portion
					label12.setFont(new Font("Calibri", 2, 14));
			         label12.setBounds(50, 400, 200, 100);
			         panel6.add(label12);
			         
			         label9.setFont(new Font("Calibri", 2, 14));
			         label9.setBounds(50, 460, 200, 100);
			         panel6.add(label9);
			         
			         nfrlabel1.setFont(new Font("Calibri", 2, 14));
			         nfrlabel1.setToolTipText("Add labels in the form nfr1, nfr2...");
			         nfrlabel1.setBounds(120, 480, 100, 40);
			         nfrlabel1.setBackground(new Color(204, 204, 204));
			         
			         panel6.add(nfrlabel1);
			         
			         label10.setFont(new Font("Calibri", 2, 14));
			         label10.setBounds(50, 520, 200, 100);
			         panel6.add(label10);
			         
			         nfrlabel2.setFont(new Font("Calibri", 2, 14));
			        nfrlabel2.setBounds(120, 540, 300, 60);
			        nfrlabel2.setBackground(new Color(204, 204, 204));
			         nfrlabel2.setWrapStyleWord(true);
			         JScrollPane sp2 = new JScrollPane(nfrlabel2);   
			
			        
			        sp2.setBounds(120,540, 500,40);
			        sp2.setBackground(new Color(204, 204, 204));
			         sp2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			         panel6.add(sp2);
			         
			         btn9.setToolTipText("Click to save NFR");
			         btn9.setFont(new Font("Calibri", 2, 16));
			         btn9.setBackground(new Color(120, 168, 252));
			         btn9.setForeground(Color.black);
			         btn9.setBounds(50, 610, 120,30);
			        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
			         panel6.add(btn9);
			         btn9.addActionListener(new ActionListener() {
			             @Override
			             public void actionPerformed(final ActionEvent e) {
			                 
			            	String nfr1=nfrlabel1.getText();
			                String nfr2=nfrlabel2.getText();
			                int len=nfr1.length();
			                char[] nfr1char=nfr1.toCharArray();
			                int checkflag=0;
			                for(int i=0; i<len; i++)
			                {
			                	int k=nfr1char[i];
			                
			                	if(i<=2) {
			                		if(i==0) {
			                			if(nfr1char[i]!='n') {
			                			
			                				checkflag=1;
			                			}
			                		}
			                		else if(i==1){
			                			if(nfr1char[i]!='f') {
			                				
			                				checkflag=1;
			                			}
			                		}
			                		else{
			                			if(nfr1char[i]!='r') {
			                				
			                				checkflag=1;
			                			}
			                		}	
			                	}
			                	else {
			                		if(k>=49 && k <=57)
			                		{
			                			//Do nothing
			                		}
			                		else {
			                			
			                			checkflag=1;
			                		}
			                	}
			                }
			                if(checkflag==1) {
			                	JOptionPane.showMessageDialog(panel6, "Incorrect NFR label format.");
			                }
			                else {
			                	if(nfr2.compareTo("")==0) {
			                		JOptionPane.showMessageDialog(panel6, "Enter a description!");
			                	}
			                	else {
			                		try {
			                			File f1=new File("NFR.txt");
			                			checkflag=0;
			                			if(f1.exists()) {
			                				
			                				FileReader fread1=new FileReader("NFR.txt");
			                				int readc=0;
			                				char c;
			                				String temp="";
			                				while((readc=fread1.read())!=-1) {
			                	    				c=(char)readc;
			                	    				temp=temp.concat(Character.toString(c));
			                	    				while((readc=fread1.read())!=32) {
			                	    					c=(char)readc;
				                	    				temp=temp.concat(Character.toString(c));
			                	    				}
			                	    			if(nfr1.compareTo(temp)==0) {
			                	    				JOptionPane.showMessageDialog(panel6, "NFR with same label exists");
			                	    				checkflag=1;
			                	    				break;
			                	    			}
			                	    			while((readc=fread1.read())!=10) {
			                	    				if(readc==-1)
			                	    					break;
		                	    					
		                	    				}
			                	    			temp="";
			                	    		}
			                				if(checkflag==0) {
			                					FileWriter fw1 = new FileWriter("NFR.txt", true); 
				                				BufferedWriter bw1 = new BufferedWriter(fw1);
				                				bw1.write(nfr1+" "+nfr2);
				                				bw1.newLine();
				                				System.out.println(nfr1+" "+nfr2);
				                				bw1.close();
				                				fw1.close();
			                				}
			                			}
			                			else {
			                				FileWriter fw1 = new FileWriter("NFR.txt", true); 
			                				BufferedWriter bw1 = new BufferedWriter(fw1);
			                				bw1.write(nfr1+" "+nfr2);
			                				System.out.println(nfr1+" "+nfr2);
			                				bw1.newLine();
			                				bw1.close();
			                				fw1.close();
			                			}
			                		}catch(Exception ef) {
			                			System.out.println("File not found!");
			                		}
			                	}
			                }
			                
			             }
			         });
			         
	}
	public static void construct_panel1() {
		Font f = new Font("TimesRoman",Font.BOLD+Font.ITALIC,25);
  	  	label1.setFont(f);
		panel1.setLayout(null);
		label1.setBounds(300, 10, 500, 40);
		File f1=new File("FR.txt");
		File f2=new File("NFR.txt");
		Node fr=null;
		Node nfr=null;
		int flag1=1, flag2=1;
		if(!f1.exists() && !f2.exists()) {
			JOptionPane.showMessageDialog(panel6, "FR and NFR data does not exists!");
		}
		else if (!f1.exists()) {
			JOptionPane.showMessageDialog(panel6, "FR data does not exists!");
		}
		else if(!f2.exists()) {
			JOptionPane.showMessageDialog(panel6, "NFR data does not exists!");
		}
			int readc=0;
			char c;
			String temp="";
			try {
			if(flag1==1) {
			FileReader fread1= new FileReader("FR.txt");
		
			while((readc=fread1.read())!=-1) {
    				c=(char)readc;
    				temp=temp.concat(Character.toString(c));
    				while((readc=fread1.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    			while((readc=fread1.read())!=10) {
    				if(readc==-1)
    					break;
					
				}
    			Node tempnode=new Node();
    			tempnode.id=temp;
    			tempnode.next=null;
    			if(fr==null)
    				fr=tempnode;
    			else {
    				Node k=fr;
    				while(k.next!=null)
    					k=k.next;
    				k.next=tempnode;
    			}
    			temp="";
    		}
			}
			if(flag2==1) {
			FileReader fread2= new FileReader("NFR.txt");
			readc=0;
			temp="";
			while((readc=fread2.read())!=-1) {
    				c=(char)readc;
    				temp=temp.concat(Character.toString(c));
    				while((readc=fread2.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    			while((readc=fread2.read())!=10) {
    				if(readc==-1)
    					break;
					
				}
    			Node tempnode=new Node();
    			tempnode.id=temp;
    			tempnode.next=null;
    			if(nfr==null)
    				nfr=tempnode;
    			else {
    				Node k=nfr;
    				while(k.next!=null)
    					k=k.next;
    				k.next=tempnode;
    			}
    			temp="";
    		}
			}
			}catch(Exception e2) {
				System.out.println("File not found!");
			}
			frlist1.addItem("");
			Node root1=fr;
			while(root1!=null) {
				frlist1.addItem(root1.id);
				root1=root1.next;
			}
			frlist2.addItem("");
			root1=fr;
			while(root1!=null) {
				frlist2.addItem(root1.id);
				root1=root1.next;
			}
			frlist3.addItem("");
			root1=fr;
			while(root1!=null) {
				frlist3.addItem(root1.id);
				root1=root1.next;
			}
			nfrlist1.addItem("");
			Node root2=nfr;
			while(root2!=null) {
				nfrlist1.addItem(root2.id);
				root2=root2.next;
			}
			nfrlist2.addItem("");
			root2=nfr;
			while(root2!=null) {
				nfrlist2.addItem(root2.id);
				root2=root2.next;
			}
			nfrlist3.addItem("");
			root2=nfr;
			while(root2!=null) {
				nfrlist3.addItem(root2.id);
				root2=root2.next;
			}
		
		JLabel frfr=new JLabel("FR-FR Relations");
		JLabel frfr1= new JLabel("Dependee");
		JLabel frfr2= new JLabel("Depender");
		JLabel frfrtype= new JLabel("Type");
		JLabel frfrdegree= new JLabel("Degree");
		JButton frfrsave=new JButton("Save");
		JComboBox type=new JComboBox();
		JTextArea degree=new JTextArea(20,20);
		frfr.setFont(new Font("Calibri", 2, 14));
        frfr.setBounds(30, 80, 100, 40);
        panel1.add(frfr);
        frfr1.setBounds(30,130,100,40);
        panel1.add(frfr1);
        frlist1.setBounds(100, 130, 100, 40);
        panel1.add(frlist1);
        frlist1.setEnabled(true);
        frfr2.setBounds(230, 130, 100, 40);
        panel1.add(frfr2);
        frlist2.setBounds(300, 130, 100, 40);
        panel1.add(frlist2);
        frlist2.setEnabled(true); 
        frfrtype.setBounds(430,130,40,40);
        panel1.add(frfrtype);
        type.addItem("");
        type.addItem("Cohesion");
        type.addItem("Coupling");
        type.setBounds(500, 130, 100, 40);
        panel1.add(type);
        type.setEnabled(true);
        frfrdegree.setBounds(630,130,100,40);
        panel1.add(frfrdegree);
        degree.setBounds(700, 130, 40, 40);
        degree.setToolTipText("Add value between 1-100");
       degree.setBackground(new Color(204, 204, 204));
        panel1.add(degree);
        frfrsave.setBounds(30,200,100,40);
        frfrsave.setFont(new Font("Calibri", 2, 16));
        frfrsave.setBackground(new Color(120, 168, 252));
        frfrsave.setForeground(Color.black);
        panel1.add(frfrsave);
        frfrsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
            	try {
            		String fr1=frlist1.getSelectedItem().toString(); 
	                String fr2=frlist2.getSelectedItem().toString(); 
	                String frtype= type.getSelectedItem().toString(); 
	                String frdegree= degree.getText(); 
	                int degreeval=Integer.valueOf(frdegree);
	                if(degreeval>=1 && degreeval<=100)
	                {
	                	FileWriter fw1 = new FileWriter("FRFR.txt", true); 
	   	                BufferedWriter bw1 = new BufferedWriter(fw1);
	   	                bw1.write(fr1+" "+fr2+" "+frtype+" "+frdegree);
	   	                bw1.newLine();
	   	                bw1.close();
	   	                fw1.close();
	                }
	                else {
	                	JOptionPane.showMessageDialog(panel6, "Enter a valid FR-FR degree!");
	                }
	             
	                
            	}catch(Exception e3) {
            		System.out.println("File not found!");
            	}
            }
        });
        
        
		JLabel frnfr= new JLabel("FR-NFR Relations");
		JLabel frnfr1= new JLabel("FR");
		JLabel frnfr2= new JLabel("NFR");
		JLabel frnfrdegree= new JLabel("Degree");
		JButton frnfrsave=new JButton("Save");
		JTextArea degree2=new JTextArea(20,20);
		frnfr.setFont(new Font("Calibri", 2, 14));
        frnfr.setBounds(30, 300, 100, 40);
        panel1.add(frnfr);
        frnfr1.setBounds(30,350,100,40);
        panel1.add(frnfr1);
        frlist3.setBounds(100, 350, 100, 40);
        panel1.add(frlist3);
        frlist3.setEnabled(true);
        frnfr2.setBounds(230, 350, 100, 40);
        panel1.add(frnfr2);
        nfrlist1.setBounds(300, 350, 100, 40);
        panel1.add(nfrlist1);
        nfrlist1.setEnabled(true); 
        frnfrdegree.setBounds(430,350,100,40);
        panel1.add(frnfrdegree);
        degree2.setBounds(500, 350, 40, 40);
        degree2.setToolTipText("Add value between -100 - +100");
       degree2.setBackground(new Color(204, 204, 204));
        panel1.add(degree2);
        frnfrsave.setBounds(30,420,100,40);
        frnfrsave.setFont(new Font("Calibri", 2, 16));
        frnfrsave.setBackground(new Color(120, 168, 252));
        frnfrsave.setForeground(Color.black);
        panel1.add(frnfrsave);
        frnfrsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
            	try {
            		String fr1=frlist3.getSelectedItem().toString(); 
	                String fr2=nfrlist1.getSelectedItem().toString(); 
	                String frnfrdegree= degree2.getText(); 
	                int degreeval=Integer.valueOf(frnfrdegree);
	                if(degreeval>=1 && degreeval<=100)
	                {
	                	FileWriter fw1 = new FileWriter("FRNFR.txt", true); 
	   	                BufferedWriter bw1 = new BufferedWriter(fw1);
	   	                bw1.write(fr1+" "+fr2+" "+frnfrdegree);
	   	                bw1.newLine();
	   	                bw1.close();
	   	                fw1.close();
	                }
	                else {
	                	JOptionPane.showMessageDialog(panel6, "Enter a valid FR-NFR degree!");
	                }
	             
	                
            	}catch(Exception e3) {
            		System.out.println("File not found!");
            	}
            }
        });
		
		
		
		JLabel nfrnfr= new JLabel("NFR-NFR Relations");
		JLabel nfrnfr1= new JLabel("NFR");
		JLabel nfrnfr2= new JLabel("NFR");
		JLabel nfrnfrdegree= new JLabel("Degree");
		JButton nfrnfrsave=new JButton("Save");
		JTextArea degree3=new JTextArea(20,20);
		nfrnfr.setFont(new Font("Calibri", 2, 14));
        nfrnfr.setBounds(30, 500, 200, 40);
        panel1.add(nfrnfr);
        nfrnfr1.setBounds(30,550,100,40);
        panel1.add(nfrnfr1);
        nfrlist2.setBounds(100, 550, 100, 40);
        panel1.add(nfrlist2);
        nfrlist2.setEnabled(true);
        nfrnfr2.setBounds(230, 550, 100, 40);
        panel1.add(nfrnfr2);
        nfrlist3.setBounds(300, 550, 100, 40);
        panel1.add(nfrlist3);
        nfrlist3.setEnabled(true); 
        nfrnfrdegree.setBounds(430,550,100,40);
        panel1.add(nfrnfrdegree);
        degree3.setBounds(500, 550, 40, 40);
        degree3.setToolTipText("Add value between 1 - 100");
       degree3.setBackground(new Color(204, 204, 204));
        panel1.add(degree3);
        nfrnfrsave.setBounds(30,620,100,40);
        nfrnfrsave.setFont(new Font("Calibri", 2, 16));
        nfrnfrsave.setBackground(new Color(120, 168, 252));
        nfrnfrsave.setForeground(Color.black);
        panel1.add(nfrnfrsave);
        nfrnfrsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
            	try {
            		String fr1=nfrlist2.getSelectedItem().toString(); 
	                String fr2=nfrlist3.getSelectedItem().toString(); 
	                String nfrnfrdegree= degree3.getText(); 
	                int degreeval=Integer.valueOf(nfrnfrdegree);
	                if(degreeval>=1 && degreeval<=100)
	                {
	                	FileWriter fw1 = new FileWriter("NFRNFR.txt", true); 
	   	                BufferedWriter bw1 = new BufferedWriter(fw1);
	   	                bw1.write(fr1+" "+fr2+" "+nfrnfrdegree);
	   	                bw1.newLine();
	   	                bw1.close();
	   	                fw1.close();
	                }
	                else {
	                	JOptionPane.showMessageDialog(panel6, "Enter a valid NFR-NFR degree!");
	                }
	             
	                
            	}catch(Exception e3) {
            		System.out.println("File not found!");
            	}
            }
        });
		
	}
	public static void setValue(int row, int col, int p, int type) {
	    	flag=0;
	    	if(p==1) {
	    	 String s=String.valueOf(frnfr.getValueAt(row, col));
	    	 int val=Integer.valueOf(s);
	    	 if(type==0) {
	    	 //if(val==1)
	    		 frnfr.getModel().setValueAt("-1", col-1, row+1);
	    	// else
	    		// frnfr.getModel().setValueAt("1", col-1, row+1);
	    	}
	    	 else
	    		 frnfr.getModel().setValueAt(s, col-1, row+1); 
	    	}
	    	else
	    		 frnfr.getModel().setValueAt("", row, col);
	    	flag=1;
	    }
	 public static void save_data() {
			E_FN=null;
			E_NN=null;
			FR=null;
			NFR=null;
			E_FF=null;
			int num;
			
			//Storing Dependency relation
		    for(int i=0;i<=countfr;i++) {
		    	for (int j=countfr+1;j<=countfr+countnfr;j++) {
		    	if(frnfr.getValueAt(i, j)==null) {
		    		//Do nothing
		    	}
		    	else {
		    		String s1=String.valueOf(frnfr.getValueAt(i, 0));
		    		String s3=String.valueOf(frnfr.getColumnName(j));
		    		Edge1 temp=new Edge1();
		    		temp.id1=s1;
		    		temp.id2=s3;
		    		temp.value=Integer.valueOf(String.valueOf(frnfr.getValueAt(i, j)));
		    		if(E_FN==null)
		    		{
		    			E_FN=temp;
		    		}
		    		else {
		    			Edge1 p=E_FN;
		    			while(p.next!=null) {
		    				p=p.next;
		    			}
		    			p.next=temp;
		    		}
		    	}
			
				}
			}
			
			System.out.println("Contents of E_FN:");
			Edge1 h=E_FN;
			while(h!=null) {
				System.out.println(h.id1+" | "+h.id2+" | "+h.value);
				h=h.next;
			}
			for(int i=countfr;i<countfr+countnfr;i++) {
		    	for (int j=countfr+1;j<=countfr+countnfr;j++) {
		    		if(frnfr.getValueAt(i, j)==null) {
		        		//Do nothing
		        	}
		        	else {
		        		String s1=String.valueOf(frnfr.getValueAt(i, 0));
		        		String s3=String.valueOf(frnfr.getColumnName(j));
		        		Edge1 temp=new Edge1();
		        		temp.id1=s1;
		        		temp.id2=s3;
		        		temp.value=Integer.valueOf(String.valueOf(frnfr.getValueAt(i, j)));
		        		
		        		if(E_NN==null)
		        		{
		        			E_NN=temp;
		        		}
		        		else {
		        			Edge1 p=E_NN;
		        			//Check if already entered
		        			int flag=0;
		        			while(p.next!=null) {
		        			if((p.id1.compareTo(s3))==0 && (p.id2.compareTo(s1))==0)
		        				flag=1;
		        				p=p.next;
		        			}
		        			if((p.id1.compareTo(s3))==0 && (p.id2.compareTo(s1))==0)
		        				flag=1;
		        			if(flag==0)
		        				p.next=temp;
		        		}
		    		
		    	}
			}
		}
			
				System.out.println("Contents of E_NN:");
				h=E_NN;
				while(h!=null) {
					System.out.println(h.id1+" | "+h.id2+" | "+h.value);
					h=h.next;
				}
				for(int i=0;i<countfr;i++) {
			    	for (int j=1;j<=countfr;j++) {
			    	if(frnfr.getValueAt(i, j)==null) {
			    		//Do nothing
			    	}
			    	else {
			    	String s=String.valueOf(frnfr.getValueAt(i, j));
			    	if((s.compareTo(""))!=0) {
			    	int n=Integer.valueOf(s);
			    	if(n==1) {
			    		String s1=String.valueOf(frnfr.getValueAt(i, 0));
			    		String s3=String.valueOf(frnfr.getColumnName(j));
			    		Edge2 temp=new Edge2();
						temp.id1=s1;
						temp.id2=s3;
						if(E_FF==null)
						{
							E_FF=temp;
						}
						else {
							Edge2 p=E_FF;
							while(p.next!=null) {
								p=p.next;
							}
							p.next=temp;
						}
			    	}
			    	}
			    	}
					}
				}
				
				System.out.println("Contents of E_FF:");
				Edge2 h2=E_FF;
				while(h2!=null) {
					System.out.println(h2.id1+" | "+h2.id2);
					h2=h2.next;
				}
			for(int i=1;i<=countfr;i++) {
				Node temp=new Node();
				temp.id="f"+i;
				temp.next=null;
				if(FR==null)
					FR=temp;
				else {
					Node k=FR;
					while(k.next!=null)
						k=k.next;
					k.next=temp;
				}
			}
			for(int i=1;i<=countnfr;i++) {
				Node temp=new Node();
				temp.id="nf"+i;
				temp.next=null;
				if(NFR==null)
					NFR=temp;
				else {
					Node k=NFR;
					while(k.next!=null)
						k=k.next;
					k.next=temp;
				}
			}
			System.out.println("The FRs are:");
		    	Node k=FR;
		    	while(k!=null) {
		    		System.out.println(k.id);
		    		k=k.next;
		    	}
		    	System.out.println("The NFRs are:");
		    	Node m=NFR;
		    	while(m!=null) {
		    		System.out.println(m.id);
		    		m=m.next;
		    	}
		    	
		    	   
		}
	 public static void addFPValues() {
	    	
	    	//Create FR List
	    	
	    	int c=countfr;
	    	 frhead=null;
	    	int i=1;
	    	while(i<=c) {
	    		String frname="f"+i;
	    	
	    				Node temp=new Node();
	    				temp.id=frname;
	    				temp.next=null;
	    				if(frhead==null)
	    					frhead=temp;
	    				else {
	    					Node p=frhead;
	    					while(p.next!=null) {
	    						p=p.next;
	    					}
	    					p.next=temp;
	    				}
	    		
	    		i++;
	    	}
	    	Node p=frhead;
	    	while(p!=null) {
	    		System.out.println(p.id);
	    		p=p.next;
	    	}
	    	
	    //	System.out.println("hii I am here!");
	    	fp_frame.getContentPane().setBackground(new Color(204, 204, 204));
	        try {
	            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	        }
	        catch (Exception e) {
	            System.out.println("Look and Feel not set");
	        }
	        fp_frame.setLayout(null);
	        fp_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	       fp_frame.setBounds(15, 6, 540, 450);
	       
	       JLabel heading1=new JLabel("Set values of Function-point attributes!!");
	       heading1.setFont(new Font("Calibri", 2, 18));
	       heading1.setBounds(20, 10, 500, 40);
	       fp_frame.add(heading1);
	       g=frhead;
	       String t="Module "+g.id;
	      JLabel  heading2=new JLabel(t);
	      heading2.setFont(new Font("Calibri", 2, 18));
	      heading2.setBounds(160, 60, 500, 40);
	      fp_frame.add(heading2);
	       
	       
	      JTable parameter;
	  
	       String []col2={"Attribute","Count","Complexity Rank"};
	       String [][]data2=null;
	   	 	DefaultTableModel model2 = new DefaultTableModel(data2,col2);  
	   	 	parameter=new JTable(model2);
	   		parameter.setFillsViewportHeight(true);
	   		
	   	parameter.setRowHeight(30);
	    parameter.getColumnModel().getColumn(0).setPreferredWidth(150);
	    parameter.getColumnModel().getColumn(1).setPreferredWidth(20);
			JScrollPane js2=new JScrollPane(parameter);
			  js2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			   //js2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			  js2.setBounds(25, 95, 400, 200);
			js2.setVisible(true);
			//jp2.add(js2);
		fp_frame.add(js2);
		//adding parameters to the table
		Object []o = new Object[1];
		o[0]="External Inputs";
		model2.addRow(o);
		o = new Object[1];
		o[0]="External Outputs";
		model2.addRow(o);
		o = new Object[1];
		o[0]="Inquiries";
		model2.addRow(o);
		o = new Object[1];
		o[0]="Files";
		model2.addRow(o);
		o = new Object[1];
		o[0]="External Interfaces";
		model2.addRow(o);
	    
		//Adding drop-down menus
		 TableColumn testColumn = parameter.getColumnModel().getColumn(2);
	     JComboBox<String> comboBox = new JComboBox<>();
	     comboBox.addItem("Low");
	     comboBox.addItem("Average");
	     comboBox.addItem("High");
	     
	  
	     testColumn.setCellEditor(new DefaultCellEditor(comboBox));
	  
	  //Adding next button
	  JButton next=new JButton("Next");
	  next.setFont(new Font("Calibri", 2, 16));
		next.setBackground(new Color(204, 204, 255));
			next.setForeground(Color.black);
			next.setBounds(40, 340, 120, 30);
			next.setToolTipText("Click to move to next FR!");
			fp_frame.add(next);
			next.addActionListener(new ActionListener() {
	        @Override
	         public void actionPerformed(final ActionEvent e) {
	      	 
	        	g=g.next;
	        	parameter.setValueAt("", 0, 1);
	        	parameter.setValueAt("", 0, 2);
	        	if(g!=null) {
	        	String t="Module "+g.id;
	        	heading2.setText(t);
	        	String fname=g.id+"attributes.txt";
	        	File f1=new File(fname);
	            System.out.println(f1.length());
	            if(f1.exists()) {
	            	System.out.println("File Exists");
	            	try {
	          		   FileReader f2=new FileReader(fname);
	          		   int i=0;
	          		   char c;
	          		   String temp="";
	          		  int j=0;
	          		   while((i=f2.read())!=-1) {
	          			   temp="";
	          			   c=(char)i;
	          			   temp=temp.concat(Character.toString(c));
	          			   while((i=f2.read())!=32) {
	          				   c=(char)i;
		          			   temp=temp.concat(Character.toString(c));
	          			   }
	          			   parameter.setValueAt(temp, j, 1);
	          			   temp="";
	          			   while((i=f2.read())!=32) {
	          				   c=(char)i;
		          			   temp=temp.concat(Character.toString(c));
	          			   }
	          			   parameter.setValueAt(temp, j, 2);
	          			   j++;
	          			   i=f2.read();
	          			   if(i==13)
	          				   i=f2.read();  
	          		   }
	          		   f2.close();
	            }catch(IOException ek) {
	            	
	            }
	        	}
	        
	        	else {
	        	//erasing values
	        	parameter.setValueAt("", 0, 1);
	        	parameter.setValueAt("", 0, 2);
	        	parameter.setValueAt("", 1, 1);
	        	parameter.setValueAt("", 1, 2);
	        	parameter.setValueAt("", 2, 1);
	        	parameter.setValueAt("", 2, 2);
	        	parameter.setValueAt("", 3, 1);
	        	parameter.setValueAt("", 3, 2);
	        	parameter.setValueAt("", 4, 1);
	        	parameter.setValueAt("", 4, 2);
	        	}
	        	}
	        	else {
	        		JOptionPane.showMessageDialog(fp_frame,"No more FR"); 
	        	}
	        	//func("Module F2");
	        	}
	        	
	        	
	         }
	     );
	     
			//Adding prev button
			
			JButton prev=new JButton("Prev");
			  prev.setFont(new Font("Calibri", 2, 16));
				prev.setBackground(new Color(204, 204, 255));
					prev.setForeground(Color.black);
					prev.setBounds(200, 340, 120, 30);
					prev.setToolTipText("Click to move to previous FR!");
					fp_frame.add(prev);
					prev.addActionListener(new ActionListener() {
			        @Override
			         public void actionPerformed(final ActionEvent e) {
			        	Node m=frhead;
			        	while(m!=null)
			        	{
			        		if(m.next==g)
			        			break;
			        		m=m.next;
			        		
			        	}
			        	g=m;
			        	String t="Module "+g.id;
			        	heading2.setText(t);
			        	String fname=g.id+"attributes.txt";
			        	File f1=new File(fname);
			            System.out.println("length="+f1.length());
			            if(f1.exists()) {
			            	try {
			          		   FileReader f2=new FileReader(fname);
			          		   int i=0;
			          		   char c;
			          		   String temp="";
			          		  int j=0;
			          		   while((i=f2.read())!=-1) {
			          			   temp="";
			          			   c=(char)i;
			          			   temp=temp.concat(Character.toString(c));
			          			   while((i=f2.read())!=32) {
			          				   c=(char)i;
				          			   temp=temp.concat(Character.toString(c));
			          			   }
			          			   parameter.setValueAt(temp, j, 1);
			          			   temp="";
			          			   while((i=f2.read())!=32) {
			          				   c=(char)i;
				          			   temp=temp.concat(Character.toString(c));
			          			   }
			          			   parameter.setValueAt(temp, j, 2);
			          			   j++;
			          			   i=f2.read();
			          			   if(i==13)
			          				   i=f2.read();  
			          		   }
			          		   f2.close();
			            }catch(IOException ek) {
			            	
			            }
			        	}
			        }
			        	
			         }
			     );
			    
					
			//Adding save button
			  JButton save=new JButton("Save");
			  save.setFont(new Font("Calibri", 2, 16));
				save.setBackground(new Color(204, 204, 255));
					save.setForeground(Color.black);
					save.setBounds(350, 340, 120, 30);
					save.setToolTipText("Click to save data");
					fp_frame.add(save);
					save.addActionListener(new ActionListener() {
			        @Override
			         public void actionPerformed(final ActionEvent e) {
			      	 //Read data from the table and store it in a file
			        	BufferedWriter b1=null;
			    		try {
			    			String fname=g.id+"attributes.txt";
			    	 		 b1 = new BufferedWriter(new FileWriter(fname, false));
			    	 		 String t=String.valueOf(parameter.getValueAt(0, 1));
			    	 		 String k=String.valueOf(parameter.getValueAt(0,2));
			    	 		 b1.write(t+" "+k+" ");
			    	 		 b1.newLine();
			    	 		 t=String.valueOf(parameter.getValueAt(1, 1));
			    	 		  k=String.valueOf(parameter.getValueAt(1,2));
			    	 		 b1.write(t+" "+k+" ");
			    	 		 b1.newLine();
			    	 		 t=String.valueOf(parameter.getValueAt(2, 1));
			    	 		  k=String.valueOf(parameter.getValueAt(2,2));
			    	 		 b1.write(t+" "+k+" ");
			    	 		 b1.newLine();
			    	 		 t=String.valueOf(parameter.getValueAt(3, 1));
			    	 		  k=String.valueOf(parameter.getValueAt(3,2));
			    	 		 b1.write(t+" "+k+" ");
			    	 		 b1.newLine();
			    	 		 t=String.valueOf(parameter.getValueAt(4, 1));
			    	 		  k=String.valueOf(parameter.getValueAt(4,2));
			    	 		 b1.write(t+" "+k+" ");
			    	 		 b1.newLine();
			    	 		 b1.close();
			    	 	}catch(IOException fe) {
			    	 		
			    	 	}
			        	}
			        	
			        	
			         }
			     );	
	     
	       fp_frame.setVisible(true);
	    
	    }
	 public static void construct_panel2() {
		 Font f = new Font("TimesRoman",Font.BOLD+Font.ITALIC,25);
	  	  	label2.setFont(f);
	  	  	label2.setBounds(300, 10, 500, 40);
			panel2.setLayout(null);
			
			//Button to set NFR priority Values
			
			JLabel heading1=new JLabel("Set NFR Priority");
	          heading1.setFont(new Font("Calibri", 2, 18));
	          heading1.setBounds(30, 50, 200, 40);
	         panel2.add(heading1);
	          
	          String []col2={"NFR","Priority"};
	        	String [][]data2=null;
	        	 DefaultTableModel model2 = new DefaultTableModel(data2,col2);  
	        	NFR_priority=new JTable(model2){
	        	    @Override
	        	    public boolean isCellEditable(int row, int column) {                
	        	        return (column==1);               
	        	    };
	        	};
	        	NFR_priority.setFillsViewportHeight(true);
	  		JScrollPane js2=new JScrollPane(NFR_priority);
	  		  js2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	  		   //js2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	  		  js2.setBounds(30, 150, 170, 220);
	  		js2.setVisible(true);
	  		//jp2.add(js2);
	  		panel2.add(js2);
	  		
	          loadNFR.setFont(new Font("Calibri", 2, 16));
	          loadNFR.setBackground(new Color(204, 204, 153));
	          loadNFR.setForeground(Color.black);
	          loadNFR.setBounds(30, 100, 100, 30);
	          loadNFR.setToolTipText("Click to load NFRs");
	          loadNFR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        panel2.add(loadNFR);
	          
	           /* call a function to add items from a list if exists*/
	         loadNFR.addActionListener(new ActionListener() {
	                @Override
	                 public void actionPerformed(final ActionEvent e) {
	                	 try {
	                     FileReader	f1=new FileReader("NFR.txt");
	                     	int i;
	                     	char c;
	                     	String temp;
	                     	String fe1,fe2,fe3;
	                     	while((i=f1.read())!=-1) {
	                     		
	                     		c=(char)i;
	                     		System.out.println("C="+c);
	                     		temp="";
	                     		if((i>=65 && i<=90) || (i>=97 && i<=122) ||(i>=48 && i<=57))
	                     			temp=temp.concat(Character.toString(c));
	                     		System.out.println("i="+i);
	                     		while((i=f1.read())!=10 && i != 10 && i != 13 && i!=-1) {
	                     			c=(char)i;
	                     			if((i>=65 && i<=90) || (i>=97 && i<=122) ||(i>=48 && i<=57))
	                     				temp=temp.concat(Character.toString(c));
	                     			System.out.println("i="+i);
	                     			while((i=f1.read())!=32) {
	                     				c=(char)i;
	                     				if((i>=65 && i<=90) || (i>=97 && i<=122) ||(i>=48 && i<=57))
	                     					temp=temp.concat(Character.toString(c));
	                     				System.out.println("i="+i);
	                     			}
	                     			fe1=temp;
	                     			temp="";
	                     			while((i=f1.read())!=32) {
	                     				c=(char)i;
	                     				if((i>=65 && i<=90) || (i>=97 && i<=122) ||(i>=48 && i<=57))
	                     					temp=temp.concat(Character.toString(c));
	                     				System.out.println("i="+i);
	                     			}
	                     			fe2=temp;
	                     			System.out.println("Fetched is");
	                     			System.out.println(fe1+" | "+fe2);
	                     			DefaultTableModel model = (DefaultTableModel)NFR_priority.getModel();
	                 				Object []o = new Object[2];
	                 				o[0]=fe1;
	                 				o[1]=fe2;
	                 				model.addRow(o);
	                     		}
	                     	}
	                     	f1.close();
	                     	}
	                 	
	                     	catch(IOException i) {
	                     		
	                     	}
	             	  Node p=NFR;
	             	  if(p!=null) {
	             		  while(p!=null) {
	             			int num=NFR_priority.getRowCount();
	             			int found=0;
	             			for(int j=0;j<num;j++) {
	             				String s=NFR_priority.getValueAt(j, 0).toString();
	             				if((s.compareTo(p.id))==0)
	             					found=1;
	             			}
	             			if(found==0) {
	             			DefaultTableModel model = (DefaultTableModel)NFR_priority.getModel();
	           				Object []o = new Object[2];
	           				o[0]=p.id;
	           				o[1]="";
	           				model.addRow(o);
	             			 
	             		  }
	             			else {
	             				System.out.println("already exists"+p.id);
	             			}
	             			 p=p.next;
	             		  }
	             	  }
	             	  else {
	             		  JOptionPane.showMessageDialog(panel2,"No saved data"); 
	             	  }
	                 }
	             });
	         
	        //Button to save NFR priority values
			savePriority.setFont(new Font("Calibri", 2, 16));
			savePriority.setBackground(new Color(204, 204, 153));
			savePriority.setForeground(Color.black);
			savePriority.setBounds(140, 100, 120, 30);
			savePriority.setToolTipText("Click to save the NFR Priorities!");
			savePriority.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
			panel2.add(savePriority);
	       
	        /* call a function to add items from a list if exists*/
	        savePriority.addActionListener(new ActionListener() {
	             @Override
	              public void actionPerformed(final ActionEvent e) {
	                setPriority();
	              }
	          });
	        
	        // Button to set NFR parameters
	        JLabel parametername;
	        (parametername = new JLabel("Select a Parameter")).setFont(new Font("Calibri", 2, 18));
	        parametername.setBounds(280, 50, 200, 40);
	        panel2.add(parametername);
	        final ButtonGroup buttonGroup = new ButtonGroup();
	        buttonGroup.add(conflict);
	        buttonGroup.add(priority);
	        buttonGroup.add(both);
	        buttonGroup.add(both2);
	        
	        conflict.setFont(new Font("Calibri", 2, 16));
	        conflict.setBounds(280, 100, 100, 40);
	        panel2.add(conflict);
	        
	        priority.setFont(new Font("Calibri", 2, 16));
	        priority.setBounds(280, 130, 130, 40);
	        panel2.add(priority);
	        both.setFont(new Font("Calibri", 2, 16));
	        both.setBounds(280, 160, 130, 40);
	        both.setToolTipText("Product of NFR Conflict and NFR Priority");
	        panel2.add(both);
	        both2.setFont(new Font("Calibri", 2, 16));
	        both2.setBounds(280, 190, 130, 40);
	        both2.setToolTipText("Weighted sum of NFR Conflict and NFR Priority");
	       panel2.add(both2);
	       JLabel weightlabel;
	        (weightlabel = new JLabel("Specify weights:")).setFont(new Font("Calibri", 2, 14));
	        weightlabel.setBounds(280, 240, 100, 40);
	        panel2.add(weightlabel);
	        slider1.setMajorTickSpacing(1);
	        slider1.setMinorTickSpacing(1);
	        slider1.setBackground(new Color(153, 204, 255));
	        slider1.setPaintLabels(true);
	        slider1.setPaintTicks(true);
	        slider1.setPreferredSize(new Dimension(200, 46));
	        final Format f1 = new DecimalFormat("0.0");
	        final Hashtable<Integer, JComponent> labels = new Hashtable<Integer, JComponent>();
	        for (int i = 0; i <= 10; ++i) {
	            final JLabel label = new JLabel(f1.format(i * 0.1));
	            label.setFont(new Font("Calibri", 1, 16));
	            labels.put(i, label);
	        }
	        JLabel l1=new JLabel("Conflict");
	        JLabel l2=new JLabel("NFR Priority");
	        l1.setFont(new Font("Calibri", 2, 13));
	        l1.setBounds(280, 290, 80, 40);
	       panel2.add(l1);
	        l2.setFont(new Font("Calibri", 2, 13));
	        l2.setBounds(600, 290, 80, 40);
	        panel2.add(l2);
	        slider1.setLabelTable(labels);
	        slider1.setBounds(340, 290, 250, 50);
	        panel2.add(slider1);
	        submit.setFont(new Font("Calibri", 2, 16));
	        submit.setBounds(280, 350, 100, 30);
	        submit.setBackground(new Color(204, 204, 153));
	        submit.setForeground(Color.black);
	        submit.setToolTipText("Click to submit the parameter selected!");
	        submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        panel2.add(submit);
	        submit.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(final ActionEvent e) {
	                setChoice();
	            }
	        });
	 }

	//Saving the NFR priorities provided
	    public static void setPriority() {
	        int flag = 0;
	        int num=NFR_priority.getRowCount();
	        for (int i = 0; i < num; ++i) {
	        	String s=NFR_priority.getValueAt(i, 1).toString();
	            if ((s.compareTo(""))==0) {
	                JOptionPane.showMessageDialog(panel2, "Enter all priority values");
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 0) {
	        	
	            int i=0;
	            while(i<num) {
	            	String s1=NFR_priority.getValueAt(i, 0).toString();
	            	String s2=NFR_priority.getValueAt(i, 1).toString();
	            	int val=Integer.valueOf(s2);
	            	System.out.println("The value is "+s2+" | "+val);
	            	Node k=NFR;
	            	while(k!=null) {
	            		if((k.id.compareTo(s1))==0)
	            		{
	            			k.priority=val;
	            			break;
	            		}
	            		k=k.next;
	            	}
	            	i++;
	            }
	        }
	        System.out.println("The priority values are");
	        Node h=NFR;
	        while(h!=null) {
	        	System.out.println(h.id+" | "+h.priority);
	        	h=h.next;
	        }
	    }
	    public static void setChoice() {
	        if (conflict.isSelected()) {
	            choice = 1;
	        }
	        else if (priority.isSelected()) {
	            choice = 2;
	        }
	        else if (both.isSelected()) {
	            choice = 3;
	        }
	        else if (both2.isSelected()) {
	            w1 = slider1.getValue() / 10.0;
	            w2 = 1.0 - w1;
	            choice = 4;
	        }
	        else {
	            JOptionPane.showMessageDialog(panel2, "Select a parameter");
	        }
	    }
	    
	public static void construct_panel3() {
		
	}
	public static void construct_panel4() {
		
	}
	public static void construct_panel7() {
		Font f = new Font("TimesRoman",Font.BOLD+Font.ITALIC,25);
  	  	label13.setFont(f);
  	  	label13.setBounds(300, 10, 500, 40);
		panel7.setLayout(null);
		JLabel categorylabel= new JLabel("Select the category");
		categorylabel.setBounds(50,130,200, 40);
		panel7.add(categorylabel);
	
		 categorybox.addItem("");
	     categorybox.addItem("FR");
	     categorybox.addItem("NFR");
	     categorybox.setBounds(180, 130, 100, 40);
	     panel7.add(categorybox);
	     categorybox.setEditable(true);
	     JLabel componentlabel= new JLabel("Select the component");
	  			componentlabel.setBounds(50,200,200, 60);
	  			panel7.add(componentlabel);
	  			
	  			 componentbox.addItem("");
	  		     componentbox.setBounds(180, 200, 100, 40);
	  		     panel7.add(componentbox);
	  		     
	   JLabel NFRImpactlabel= new JLabel("NFR Impacted");
	  			NFRImpactlabel.setBounds(50,270,200, 60);
	  			panel7.add(NFRImpactlabel);
	  			
	  			 nfrimpactbox.addItem("");
	  			 nfrimpactbox.setBounds(180, 270, 100, 40);
	  		     panel7.add(nfrimpactbox);     
	  		
	   JLabel NFRImpactvallabel= new JLabel("Change Value");
	  			NFRImpactvallabel.setBounds(300,270,200, 60);
	  			panel7.add(NFRImpactvallabel);
	  		     
	  			nfrimpactvalue.setFont(new Font("Calibri", 2, 14));
	  			nfrimpactvalue.setToolTipText("Add value between 1-100");
	  			nfrimpactvalue.setBounds(400, 270, 100, 40);
	  			nfrimpactvalue.setBackground(new Color(204, 204, 204));
	  			panel7.add(nfrimpactvalue);
	  			
	     categorybox.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e){
	    	   String categoryselected=categorybox.getSelectedItem().toString();
			     componentbox.removeAllItems();
			     componentbox.addItem("");
			     if(categoryselected.compareTo("FR")==0){
			    	 try {
			 			
			 			FileReader fread1= new FileReader("FR.txt");
			 			int readc=0;
			 			char c;
			 			String temp="";
			 			while((readc=fread1.read())!=-1) {
			     				c=(char)readc;
			     				temp=temp.concat(Character.toString(c));
			     				while((readc=fread1.read())!=32) {
			     					c=(char)readc;
			 	    				temp=temp.concat(Character.toString(c));
			     				}
			     			while((readc=fread1.read())!=10) {
			     				if(readc==-1)
			     					break;
			     			}
			 				componentbox.addItem(temp);
			     			temp="";
			     		}
			 			fread1.close();
			    	 }catch(Exception e4) {
			    		 System.out.println("File error");
			    	 }
			     }
			     else if(categoryselected.compareTo("NFR")==0) {
			    	 try {
				 			
				 			FileReader fread1= new FileReader("NFR.txt");
				 			int readc=0;
				 			char c;
				 			String temp="";
				 			while((readc=fread1.read())!=-1) {
				     				c=(char)readc;
				     				temp=temp.concat(Character.toString(c));
				     				while((readc=fread1.read())!=32) {
				     					c=(char)readc;
				 	    				temp=temp.concat(Character.toString(c));
				     				}
				     			while((readc=fread1.read())!=10) {
				     				if(readc==-1)
				     					break;
				     			}
				 				componentbox.addItem(temp);
				     			temp="";
				     		}
				 			fread1.close();
				    	 }catch(Exception e4) {
				    		 System.out.println("File error");
				    	 }
			     }
	    	 }
	     }
	    		 );
	     
	  JLabel changedeslabel= new JLabel("Change Description");
	  changedeslabel.setBounds(300, 150, 200, 40);
	  panel7.add(changedeslabel);
	  JTextArea changedestext=new JTextArea();
	//  changedestext.setBounds(250, 300, 200, 80);
	  JScrollPane sp = new JScrollPane(changedestext);       
      sp.setBounds(300,200, 500,40);
      sp.setBackground(new Color(204, 204, 204));
       sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
     //  panel7.add(changedestext);
       panel7.add(sp);
	  JButton risk1= new JButton("Risk Assessment");
	  risk1.setBounds(50, 480, 200, 40);
	  risk1.setFont(new Font("Calibri", 2, 16));
      risk1.setBackground(new Color(120, 168, 252));
      risk1.setForeground(Color.black);
      risk1.setToolTipText("Click to assess Risks");
      risk1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      panel7.add(risk1);
      risk1.addActionListener(new ActionListener() {
	        @Override
	         public void actionPerformed(final ActionEvent e) {
	        	change_propagation();
	        	//create_riskgraph();
	        }
      });
      set.setBounds(520, 270, 100, 40);
	  set.setFont(new Font("Calibri", 2, 16));
      set.setBackground(new Color(120, 168, 252));
      set.setForeground(Color.black);
      set.setToolTipText("Click to save value");
      set.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      panel7.add(set);
		     		
	}
	public static void change_propagation() {
		String compselect=componentbox.getSelectedItem().toString();
		Edge1 frfr=null;
		
		int size=0;
		int cn=0;
		try {
		FileReader fread3= new FileReader("FRFR.txt");
		int readc=0;
		String temp="";
		char c;
		while((readc=fread3.read())!=-1) {
			Edge1 tempnode=new Edge1();
				c=(char)readc;
				cn++;
				temp=temp.concat(Character.toString(c));
				while((readc=fread3.read())!=32) {
					c=(char)readc;
    				temp=temp.concat(Character.toString(c));
				}
				tempnode.id1=temp;
				temp="";
				while((readc=fread3.read())!=32) {
					c=(char)readc;
    				temp=temp.concat(Character.toString(c));
				}
				tempnode.id2=temp;
				temp="";
				while((readc=fread3.read())!=32) {
					c=(char)readc;
    				temp=temp.concat(Character.toString(c));
				}
				tempnode.type=temp;
				temp="";
				while((readc=fread3.read())!=10) {
					if(readc>=48 && readc<=57) {
					c=(char)readc;
    				temp=temp.concat(Character.toString(c));
					}
				}
				int kval=Integer.valueOf(temp);
				tempnode.value=kval;
				tempnode.next=null;
    			if(frfr==null)
    				frfr=tempnode;
    			else {
    				Edge1 k=frfr;
    				while(k.next!=null)
    					k=k.next;
    				k.next=tempnode;
    			}
    			temp="";
			}
		}catch(IOException e) {
			
		}
		prop_list=new Edge1[1000][cn];
		//Create one-hop neighbors
		Edge1 node=frfr;
		while(node!=null) {
			if(node.id1.compareTo(compselect)==0) {
				if(node.value>=25) {
					Edge1 temp=new Edge1();
					temp.id1=node.id1;
					temp.id2=node.id2;
					temp.value=node.value;
					temp.type=node.type;
					temp.prob=(double)((double)node.value/(double)100);
					temp.cprob=0;
					prop_list[size][0]=temp;
					size++;
				}
				
			}
			
			node=node.next;
		}
		//Print one-hop neighbors
		for(int j=0; j<size;j++) {
			for(int m=0;m<cn;m++) {
				if(prop_list[j][m]!=null) {
					System.out.println(prop_list[j][m].id1+" "+prop_list[j][m].id2+" "+prop_list[j][m].value+" "+prop_list[j][m].prob);
					
				}
				else
					break;
			}
		}
		//Create chains
		int flagexit=1;
		int sizetemp=size;
		while(flagexit==1) {
			flagexit=0;
			System.out.println(size);
			sizetemp=size;
			for(int j=0; j<size; j++) {
				//Extract the last element
				int last=0;
				for(int m=0;m<cn;m++) {
					if(prop_list[j][m]==null) {
						last=m-1;
						break;
					}
				}
				System.out.println("Last=" +last);
				int count=0;
				
				String comp=prop_list[j][last].id2;
				System.out.println("Comp= "+comp);
				Edge1 pointer=frfr;
				while(pointer!=null) {
					if(pointer.id1.compareTo(comp)==0) {
						double cprob=(double)(prop_list[j][last].prob * (double) pointer.value);
						System.out.println("Matched with "+pointer.id1+" -> "+pointer.id2+" with cprob value "+cprob);
						if(cprob>=25) {
							count++;
							flagexit=1;
							Edge1 temp=new Edge1();
							temp.id1=pointer.id1;
							temp.id2=pointer.id2;
							temp.value=pointer.value;
							temp.type=pointer.type;
							temp.prob=(double)((double)pointer.value/(double)100);
							temp.cprob=cprob;
							if(count==1) {
								System.out.println("Inserted");
								prop_list[j][last+1]=temp;
							}
							else {
								int insert=0;
								for(int m=0;m<cn;m++) {
									if(prop_list[j][m]!=null) {
										Edge1 temp2=new Edge1();
										temp2.id1=prop_list[j][m].id1;
										temp2.id2=prop_list[j][m].id2;
										temp2.type=prop_list[j][m].type;
										temp2.value=prop_list[j][m].value;
										temp2.prob=prop_list[j][m].prob;
										temp2.cprob=prop_list[j][m].cprob;
										prop_list[sizetemp][m]=temp2;
									}
									else {
										insert=m;
										break;
									}
									
								}
								prop_list[sizetemp][insert-1]=temp;
								sizetemp++;
							}
							
						}
					}
					
					pointer=pointer.next;
				//	break;
				}
				
				
				
				//break;
			}
			size=sizetemp;
			for(int l=0; l<size;l++) {
				for(int m=0;m<cn;m++) {
					if(prop_list[l][m]!=null) {
						System.out.print(prop_list[l][m].id1+" "+prop_list[l][m].id2+" "+prop_list[l][m].value+" "+prop_list[l][m].prob+" --> ");
						
					}
					else
						break;
				}
				System.out.println();
			}
		}
		//Print chains
		for(int j=0; j<size;j++) {
			for(int m=0;m<cn;m++) {
				if(prop_list[j][m]!=null) {
					System.out.print(prop_list[j][m].id1+" "+prop_list[j][m].id2+" "+prop_list[j][m].value+" "+prop_list[j][m].prob+" --> ");
					
				}
				else
					break;
			}
			System.out.println();
		}
		create_riskgraph(size, cn);
	}
	public static void create_riskgraph(int size, int cn) {
		Node fr=null;
		Node nfr=null;
		Edge1 frnfr=null;
		Edge1 frfr=null;
		Edge1 nfrnfr=null;
		String compselect=componentbox.getSelectedItem().toString();
		try {
			
			FileReader fread1= new FileReader("FR.txt");
			int readc=0;
			char c;
			String temp="";
			while((readc=fread1.read())!=-1) {
    				c=(char)readc;
    				temp=temp.concat(Character.toString(c));
    				while((readc=fread1.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    			while((readc=fread1.read())!=10) {
    				if(readc==-1)
    					break;
					
				}
    			Node tempnode=new Node();
    			tempnode.id=temp;
    			tempnode.next=null;
    			if(fr==null)
    				fr=tempnode;
    			else {
    				Node k=fr;
    				while(k.next!=null)
    					k=k.next;
    				k.next=tempnode;
    			}
    			temp="";
    		}
			fread1.close();
			FileReader fread2= new FileReader("NFR.txt");
			readc=0;
			temp="";
			while((readc=fread2.read())!=-1) {
    				c=(char)readc;
    				temp=temp.concat(Character.toString(c));
    				while((readc=fread2.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    			while((readc=fread2.read())!=10) {
    				if(readc==-1)
    					break;
					
				}
    			Node tempnode=new Node();
    			tempnode.id=temp;
    			tempnode.next=null;
    			if(nfr==null)
    				nfr=tempnode;
    			else {
    				Node k=nfr;
    				while(k.next!=null)
    					k=k.next;
    				k.next=tempnode;
    			}
    			temp="";
    		}
			fread2.close();
			FileReader fread3= new FileReader("FRFR.txt");
			readc=0;
			temp="";
			while((readc=fread3.read())!=-1) {
				//System.out.println("Hello");
				Edge1 tempnode=new Edge1();
    				c=(char)readc;
    				temp=temp.concat(Character.toString(c));
    				while((readc=fread3.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    				tempnode.id1=temp;
    			//Hello Hie
    			//	System.out.println("temp= "+temp);
    				temp="";
    				while((readc=fread3.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    				tempnode.id2=temp;
    			
    			//	System.out.println("temp= "+tempnode.id2);
    				temp="";
    				while((readc=fread3.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    				tempnode.type=temp;
    			//	System.out.println("temp= "+tempnode.type);
    				temp="";
    				while((readc=fread3.read())!=10) {
    					if(readc>=48 && readc<=57) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    					}
    				}
    				//System.out.println("Temp=" +temp);
    				int kval=Integer.valueOf(temp);
    				tempnode.value=kval;
    				//System.out.println("temp= "+tempnode.value);
    				//System.out.println(tempnode.id1+" "+tempnode.id2+" "+tempnode.value);
    				//readc=fread3.read();
    				System.out.println("Hello!!");
    				//if(readc==-1)
    					//break;
    				tempnode.next=null;
        			if(frfr==null)
        				frfr=tempnode;
        			else {
        				Edge1 k=frfr;
        				while(k.next!=null)
        					k=k.next;
        				k.next=tempnode;
        			}
        			temp="";
				}
			Edge1 ge=frfr;
			//while(ge!=null) {
				//System.out.println(ge.id1+" "+ge.id2+" "+ge.type+" "+ge.value);
				//ge=ge.next;
			//}
			fread3.close();
			FileReader fread4= new FileReader("FRNFR.txt");
			readc=0;
			temp="";
			while((readc=fread4.read())!=-1) {
				//System.out.println("Hello2");
				Edge1 tempnode=new Edge1();
    				c=(char)readc;
    				temp=temp.concat(Character.toString(c));
    				while((readc=fread4.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    				tempnode.id1=temp;
    				temp="";
    				while((readc=fread4.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    				tempnode.id2=temp;
    				temp="";
    				while((readc=fread4.read())!=10) {
    					if(readc>=48 && readc<=57) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    					}
    				}
    				tempnode.value=Integer.valueOf(temp);
    			//	readc=fread4.read();
    				//if(readc==-1)
    					//break;
    				tempnode.next=null;
        			if(frnfr==null)
        				frnfr=tempnode;
        			else {
        				Edge1 k=frnfr;
        				while(k.next!=null)
        					k=k.next;
        				k.next=tempnode;
        			}
        			temp="";
				}
			fread4.close();
			/*FileReader fread5= new FileReader("NFRNFR.txt");
			readc=0;
			temp="";
			while((readc=fread5.read())!=-1) {
				//System.out.println("Hello3");
				Edge1 tempnode=new Edge1();
    				c=(char)readc;
    				temp=temp.concat(Character.toString(c));
    				while((readc=fread5.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    				tempnode.id1=temp;
    				temp="";
    				while((readc=fread5.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    				tempnode.id2=temp;
    				temp="";
    				while((readc=fread5.read())!=10) {
    					if(readc>=48 && readc<=57) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    					}
    				}
    				tempnode.value=Integer.valueOf(temp);
    				//readc=fread5.read();
    				//if(readc==-1)
    					//break;
    				tempnode.next=null;
        			if(nfrnfr==null)
        				nfrnfr=tempnode;
        			else {
        				Edge1 k=nfrnfr;
        				while(k.next!=null)
        					k=k.next;
        				k.next=tempnode;
        			}
        			temp="";
				}
			fread5.close();*/
			}catch(Exception e2) {
				System.out.println("File not found!");
			}
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		Graph graph = new MultiGraph("Risk Exposure Graph");
		 graph.setAttribute("ui.stylesheet", "node {size : 40px;text-size: 16; fill-color: yellow;text-mode:normal; text-style: bold; text-alignment: center; text-background-mode: none; fill-mode: dyn-plain; text-visibility-mode: normal;}");
		 Node frroot=fr;
		 while(frroot!=null) {
			 graph.addNode(frroot.id);
			 frroot=frroot.next;
		 }
		 Node nfrroot=nfr;
		 while(nfrroot!=null) {
			 graph.addNode(nfrroot.id);
			 nfrroot=nfrroot.next;
		 }
		 Edge1 frfrroot=frfr;
		 while(frfrroot!=null) {
			 	String v1=frfrroot.id1;
	   	 		String v2=frfrroot.id2;
	   	 		//System.out.println(v1);
	   	 		//System.out.println(v2);
	   	 		
	   	 		String v3=String.valueOf(frfrroot.value);
	   	 		String label=v1+"-"+v2;
	   	 		final Edge edge1 = graph.addEdge(label, v2, v1, true);
	   	 		edge1.addAttribute("layout.weight", 16);
	   	 		edge1.addAttribute("ui.label", v3);
	   	 		//edge1.addAttribute("font-size", 20);
	   	 		System.out.println("v1= "+v1+" compselect= "+compselect);
	   	 		//if(v1.compareTo(compselect)==0)
	   	 			//edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(139,69,19); text-color: rgb(0,0,0);");
	   	 		//else
	   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
	   	 		frfrroot=frfrroot.next;
		 }
		 Edge1 frnfrroot=frnfr;
		 while(frnfrroot!=null) {
			 	String v1=frnfrroot.id1;
	   	 		String v2=frnfrroot.id2;
	   	 		String v3=String.valueOf(frnfrroot.value);
	   	 		String label=v1+"-"+v2;
	   	 		final Edge edge1 = graph.addEdge(label, v1, v2, true);
	   	 		edge1.addAttribute("layout.weight", 16);
	   	 		edge1.addAttribute("ui.label", v3);
	   	 		//edge1.addAttribute("font-size", 20);
	   	 	if(v1.compareTo(compselect)==0)
   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(139,69,19); text-color: rgb(0,0,0);");
	   	 	else
	   	 		edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
	   	 		frnfrroot=frnfrroot.next;
		 }
		 Edge1 nfrnfrroot=nfrnfr;
		 while(nfrnfrroot!=null) {
			 	String v1=nfrnfrroot.id1;
	   	 		String v2=nfrnfrroot.id2;
	   	 		String v3=String.valueOf(nfrnfrroot.value);
	   	 		String label=v1+"-"+v2;
	   	 		final Edge edge1 = graph.addEdge(label, v1, v2, false);
	   	 		edge1.addAttribute("layout.weight", 16);
	   	 		edge1.addAttribute("ui.label", v3);
	   	 		frnfrroot=frnfr;
	   	 		while(frnfrroot!=null) {
	   	 			if(frnfrroot.id1.compareTo(compselect)==0) {
	   	 				if(v1.compareTo(frnfrroot.id2)==0 || v2.compareTo(frnfrroot.id2)==0) {
	   	 				edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(139,69,19); text-color: rgb(0,0,0);");
	   	 				}
	   	 				else
	   	 				edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
	   	 			}
	   	 				
	   	 			frnfrroot=frnfrroot.next;
	   	 		}
	   	 		//edge1.addAttribute("font-size", 20);
	   	 		
	   	 		nfrnfrroot=nfrnfrroot.next;
		 }
			frfrroot=frfr;
			Node templist=null;
			while(frfrroot!=null) {
				if(frfrroot.id1.compareTo(compselect)==0) {
					Node t=new Node();
					t.id=frfrroot.id2;
					if(templist==null)
						templist=t;
					else {
						Node t2=templist;
						while(t2.next!=null)
							t2=t2.next;
						t2.next=t;
					}
				}
				frfrroot=frfrroot.next;
			}
		 for (final org.graphstream.graph.Node node : graph) {
				node.addAttribute("ui.label", node.getId());
				String k= node.getId();
			
				if(k.compareTo(compselect)==0) {
					node.addAttribute("layout.weight", 150);
					node.addAttribute("ui.style", "shape: circle; fill-color: rgb(102,0,0); text-color: rgb(255,255,255);");
				}
				else if(k.contains("fr") && !k.contains("nfr")) {
				
					node.addAttribute("layout.weight", 150);
					node.addAttribute("ui.style", "shape: circle; fill-color: rgb(0,100,255); text-color: rgb(255,255,255);");
				}
				else if(k.contains("nfr")) {
				
					node.addAttribute("layout.weight", 150);
				    node.addAttribute("ui.style", "shape: rounded-box; fill-color: rgb(102,204,0); text-color: rgb(0,0,0);");
				}

				for(int i=0; i<size; i++) {
					for(int m=0; m<cn; m++) {
						if(prop_list[i][m]!=null) {
							if(prop_list[i][m].id2.compareTo(k)==0) {
								System.out.println("Matched Yo");
								System.out.println(prop_list[i][m].prob);
								double cvalue=prop_list[i][m].prob;
								if(prop_list[i][m].cprob!=0) {
									cvalue= prop_list[i][m].cprob;
									if(cvalue>=25 && cvalue<50) {
										System.out.println("Here1");
										node.addAttribute("layout.weight", 150);
										node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255, 255, 51); text-color: rgb(255,255,255);");
									}
									else if(cvalue>=50 && cvalue<75) {
										System.out.println("Here2");
										node.addAttribute("layout.weight", 150);
										node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255, 128, 0); text-color: rgb(255,255,255);");
										
									}
									else
									{
										System.out.println("Here3");
										node.addAttribute("layout.weight", 150);
										node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255,0,0); text-color: rgb(255,255,255);");
									}
								}
								else {
								if(prop_list[i][m].prob>=0.25 && prop_list[i][m].prob<0.50) {
									System.out.println("Here1");
									node.addAttribute("layout.weight", 150);
									node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255, 255, 51); text-color: rgb(255,255,255);");
								}
								else if(prop_list[i][m].prob>=0.50 && prop_list[i][m].prob<0.75) {
									System.out.println("Here2");
									node.addAttribute("layout.weight", 150);
									node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255, 128, 0); text-color: rgb(255,255,255);");
									
								}
								else
								{
									System.out.println("Here3");
									node.addAttribute("layout.weight", 150);
									node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255,0,0); text-color: rgb(255,255,255);");
								}
								}
								
									
							}
						}
					
					}
				}
			}
		 
		 Viewer viewer = graph.display();
		 viewer.enableAutoLayout();
		 viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
	}
	public static void createframe()
	{
		
	      mainframe.setSize(1000, 800);
	      Icon icon = new ImageIcon("C:\\Users\\refresh.png");
	      Image image = ((ImageIcon) icon).getImage(); // transform it 
	      Image newimg = image.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH); 
	      icon = new ImageIcon(newimg); 
	      button7 = new JButton(icon);
	      panel5.setLayout(null); 
	      Font f = new Font("TimesRoman",Font.BOLD+Font.ITALIC,25);
	  	  	label5.setFont(f);
	  	  	label5.setBounds(300, 300, 500, 40);
	      CardLayout cardLayout = new CardLayout();
	      panel.setLayout(cardLayout);
	      panel1.add(label1); // Panel for requirement dependencies
	      panel2.add(label2);	// Panel for partial order generation
	      panel3.add(label3);	//Panel for dashboard
	      panel4.add(label4);	//Panel for setting project parameters
	      panel5.add(label5);	//Panel for refreshing
	      panel6.add(label6);
	      panel7.add(label13);
	      panel6.setBackground(new java.awt.Color(255, 255, 255));
	    //  construct_panel6();
	      panel1.setBackground(new java.awt.Color(255, 255, 255));
	     // construct_panel1();
	      panel2.setBackground(new java.awt.Color(255, 255, 255));
	      construct_panel2();
	      panel3.setBackground(new java.awt.Color(255, 255, 255));
	      panel4.setBackground(new java.awt.Color(255, 255, 255));
	      panel5.setBackground(new java.awt.Color(255, 255, 255));
	      panel7.setBackground(new java.awt.Color(255, 255, 255));
	      panel.add(panel5, "link1");
	      panel.add(panel1, "link2");
	      panel.add(panel2, "link3");
	      panel.add(panel3, "link4");
	      panel.add(panel4, "link5");
	      panel.add(panel6, "link6");
	      panel.add(panel7, "link7");
	      
	      btn1.addActionListener(e -> cardLayout.show(panel, "link2"));
	     btn1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(final ActionEvent e) {
	              construct_panel1();
	            }
	        });
	      btn2.addActionListener(e -> cardLayout.show(panel, "link3"));
	      btn2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(final ActionEvent e) {
	            	construct_panel2();
	            }
	        });
	      btn3.addActionListener(e -> cardLayout.show(panel, "link4"));
	      btn3.addActionListener(e -> cardLayout.show(panel, "link3"));
	      btn3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(final ActionEvent e) {
	            	construct_panel3();
	            }
	        });
	      btn4.addActionListener(e -> cardLayout.show(panel, "link5"));
	      button7.addActionListener(e -> cardLayout.show(panel, "link1"));
	      btn12.addActionListener(e -> cardLayout.show(panel, "link6"));
	      btn12.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(final ActionEvent e) {
	            	construct_panel6();
	            }
	        });
	      btn13.addActionListener(e -> cardLayout.show(panel, "link7"));
	      btn13.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(final ActionEvent e) {
	            	construct_panel7();
	            }
	        });
	     btn1.setBackground(new java.awt.Color(0, 51, 102));
	     btn1.setForeground(new java.awt.Color(255, 255, 255));
	     btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     btn1.setBorderPainted(false);
	     btn2.setBackground(new java.awt.Color(0, 51, 102));
	     btn2.setForeground(new java.awt.Color(255, 255, 255));
	     btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     btn2.setBorderPainted(false);
	     btn3.setBackground(new java.awt.Color(0, 51, 102));
	     btn3.setForeground(new java.awt.Color(255, 255, 255));
	     btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     btn3.setBorderPainted(false);
	     btn4.setBackground(new java.awt.Color(0, 51, 102));
	     btn4.setForeground(new java.awt.Color(255, 255, 255));
	     btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     btn4.setBorderPainted(false);
	     btn5.setBackground(new java.awt.Color(71, 120, 197));
	     btn5.setForeground(new java.awt.Color(255, 255, 255));
	     btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     btn5.setBorderPainted(false);
	     btn6.setBackground(new java.awt.Color(71, 120, 197));
	     btn6.setForeground(new java.awt.Color(255, 255, 255));
	     btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     btn6.setBorderPainted(false);
	     btn12.setBackground(new java.awt.Color(0, 51, 102));
	     btn12.setForeground(new java.awt.Color(255, 255, 255));
	     btn12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     btn12.setBorderPainted(false);
	     btn13.setBackground(new java.awt.Color(0, 51, 102));
	     btn13.setForeground(new java.awt.Color(255, 255, 255));
	     btn13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     btn13.setBorderPainted(false);
	     button7.setBackground(new java.awt.Color(71, 120, 197));
	     button7.setForeground(new java.awt.Color(255, 255, 255));
	     button7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     button7.setBorderPainted(false);
	     btn1.addMouseListener(new java.awt.event.MouseAdapter() {
	    	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	       btn1.setBackground(Color.GRAY);
	    	    }

	    	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	     btn1.setBackground(new java.awt.Color(0, 51, 102));
	    	    }
	    	});
	     btn2.addMouseListener(new java.awt.event.MouseAdapter() {
	    	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	       btn2.setBackground(Color.GRAY);
	    	    }

	    	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	     btn2.setBackground(new java.awt.Color(0, 51, 102));
	    	    }
	    	});
	     btn3.addMouseListener(new java.awt.event.MouseAdapter() {
	    	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	       btn3.setBackground(Color.GRAY);
	    	    }

	    	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	     btn3.setBackground(new java.awt.Color(0, 51, 102));
	    	    }
	    	});
	     btn4.addMouseListener(new java.awt.event.MouseAdapter() {
	    	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	       btn4.setBackground(Color.GRAY);
	    	    }

	    	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	     btn4.setBackground(new java.awt.Color(0, 51, 102));
	    	    }
	    	});
	     btn5.addMouseListener(new java.awt.event.MouseAdapter() {
	    	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	       btn5.setBackground(Color.GRAY);
	    	    }

	    	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	     btn5.setBackground(new java.awt.Color(71, 120, 197));
	    	    }
	    	});
	     btn6.addMouseListener(new java.awt.event.MouseAdapter() {
	    	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	       btn6.setBackground(Color.GRAY);
	    	    }

	    	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	     btn6.setBackground(new java.awt.Color(71, 120, 197));
	    	    }
	    	});
	     btn12.addMouseListener(new java.awt.event.MouseAdapter() {
	    	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	       btn12.setBackground(Color.GRAY);
	    	    }

	    	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	     btn12.setBackground(new java.awt.Color(0, 51, 102));
	    	    }
	    	});
	     btn13.addMouseListener(new java.awt.event.MouseAdapter() {
	    	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	       btn13.setBackground(Color.GRAY);
	    	    }

	    	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	     btn13.setBackground(new java.awt.Color(0, 51, 102));
	    	    }
	    	});
	     javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(btnPanel1);
	      btnPanel1.setBackground(new Color(0,51,102));
	        btnPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(  		
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	        
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(180, 180, 180)
	                .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(36, 36, 36)
	                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(36, 36, 36)
	                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(36, 36, 36)
	                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(36, 36, 36)
	                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(36, 36, 36)
	                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(36, 36, 36)));
	        btnPanel2.setBackground(new java.awt.Color(71, 120, 197));
	        GroupLayout groupLayout = new GroupLayout(btnPanel2);  
	       btnPanel2.setLayout(groupLayout);  
	       groupLayout.setHorizontalGroup(  
                   groupLayout.createSequentialGroup()  
                               .addComponent(button7)  
                               .addGap(200, 200, 200)  
                               .addComponent(btn5)
                               .addGap(50, 50, 50)  
                               .addComponent(btn6));  
	       groupLayout.setVerticalGroup(  
                    groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)  
                    			.addGap(50, 50, 50)
                    			 .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE) 
                               .addGap(50, 50, 50)  
                               .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addGap(50, 50, 50)
                               .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addGap(50, 50, 50));  
	  
	      mainframe.add(panel, BorderLayout.CENTER);
	      mainframe.add(btnPanel1, BorderLayout.WEST);
	      mainframe.add(btnPanel2, BorderLayout.NORTH);
	      mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      mainframe.setVisible(true);
	      
	}
    public static class CustomRenderer implements TableCellRenderer{
        TableCellRenderer render;
        Border b;
        public CustomRenderer(TableCellRenderer r, Color top, Color left,Color bottom, Color right){
            render = r;

            //It looks funky to have a different color on each side - but this is what you asked
            //You can comment out borders if you want too. (example try commenting out top and left borders)
            b = BorderFactory.createCompoundBorder();
            b = BorderFactory.createCompoundBorder(b, BorderFactory.createMatteBorder(2,0,0,0,top));
            b = BorderFactory.createCompoundBorder(b, BorderFactory.createMatteBorder(0,2,0,0,left));
            b = BorderFactory.createCompoundBorder(b, BorderFactory.createMatteBorder(0,0,2,0,bottom));
            b = BorderFactory.createCompoundBorder(b, BorderFactory.createMatteBorder(0,0,0,2,right));
        }

        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus, int row,
                int column) {
            JComponent result = (JComponent)render.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            result.setBorder(b);
            
            int[][] coordinatesYellow = new int[1000][2];
            int[][] coordinatesGreen = new int[1000][2];
            int[][] coordinatesBlue = new int[1000][2];
            int count1=0, count2=0, count3=0;
            int m=0,n=0;
            for(int i=0;i<countfr;i++) {
            	for (int j=1;j<=countfr;j++) {
            		coordinatesYellow[m][n]=i;
            		n++;
            		coordinatesYellow[m][n]=j;
            		m++;
            		n=0;
            	}
            		
            }
            count1=m;
            m=0;
            n=0;
            for(int i=0;i<countfr;i++) {
            	for (int j=countfr+1;j<=countfr+countnfr;j++) {
            		coordinatesGreen[m][n]=i;
            		n++;
            		coordinatesGreen[m][n]=j;
            		m++;
            		n=0;
            	}
            		
            }
            for(int i=countfr;i<countfr+countnfr;i++) {
            	for (int j=1;j<=countfr;j++) {
            		coordinatesGreen[m][n]=i;
            		n++;
            		coordinatesGreen[m][n]=j;
            		m++;
            		n=0;
            	}
            		
            }
            count2=m;
            m=0;
            n=0;
            for(int i=countfr;i<countfr+countnfr;i++) {
            	for (int j=countfr+1;j<=countfr+countnfr;j++) {
            		coordinatesBlue[m][n]=i;
            		n++;
            		coordinatesBlue[m][n]=j;
            		m++;
            		n=0;
            	}
            		
            }
            count3=m;
            boolean isYellow = false;
            for (int i = 0; i <= count1; i++) {
                        if ((row == coordinatesYellow[i][0]) && (column == coordinatesYellow[i][1])) {
                            result.setBackground(Color.yellow);
                            isYellow = true;
                        }
                    }
            for (int i = 0; i <=count2; i++) {
                if ((row == coordinatesGreen[i][0]) && (column == coordinatesGreen[i][1])) {
                    result.setBackground(Color.green);
                    isYellow = true;
                }
            }
            for (int i = 0; i <=count3; i++) {
                if ((row == coordinatesBlue[i][0]) && (column == coordinatesBlue[i][1])) {
                    result.setBackground(new Color(83, 130, 161));
                    isYellow = true;
                }
            }
           // if( !isYellow )
             // result.setBackground(Color.white);
            return result;
        }

    }
   public static void main(String[] args) {
	   createframe();
        }
}
class RowHeaderRenderer extends DefaultTableCellRenderer {
	  
	private static final long serialVersionUID = 1L;

	public RowHeaderRenderer() {
       setHorizontalAlignment(JLabel.CENTER);
   }

   public Component getTableCellRendererComponent(JTable table,
           Object value, boolean isSelected, boolean hasFocus, int row,
           int column) {
       if (table != null) {
           JTableHeader header = table.getTableHeader();

           if (header != null) {
               setForeground(header.getForeground());
               setBackground(header.getBackground());
               setFont(header.getFont());
           }
       }

       if (isSelected) {
           setFont(getFont().deriveFont(Font.BOLD));
       }

       setValue(value);
       return this;
   }
}
