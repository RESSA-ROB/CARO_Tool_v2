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
    int prevvalue;
    double prob;
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
    String description;
    int priority;
    int satisfaction;
    double impact;
    Node next;
}
class FRDep
{
    String id;
    int val;
    FRDep next;
}
class BC
{
    String Nid;
    FRDep begin;
    BC next;
}
class MC
{
    BC Blist;
    int CEdge;
    MC next;
}
class Rpair
{
    String id1;
    String id2;
    int done;
    Rpair next;
}
class matrix{
	int row;
	int col;
double val;
	matrix next;
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
	static JLabel label14= new JLabel("NFR Priority");
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
	static JButton loadNFR=new JButton("Load FR/NFR");
	static JButton savePriority = new JButton("Save Priority");
	static JButton btn13= new JButton("Change/Risk");
	static JButton set=new JButton("Set");
	static JButton loadnfr=new JButton("Load NFR/FR");
	static JButton  addFrozen=new JButton("ADD");
	static JButton delFrozen=new JButton("Delete");
	static JButton generate = new JButton("Generate Optimal PO");
	static JButton viewgraph = new JButton("View Optimal PO graph");
	static JButton generate2 = new JButton("Generate Alternate PO");
	static JButton viewgraph2 = new JButton("View Alternate PO graph");
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
	static JTextArea riskexpose=new JTextArea(100, 100);
	static JTextArea riskmeasure=new JTextArea(100, 100);
	static JTextArea nfrpriority=new JTextArea(20,20);
	static JTextArea  frozenFRs=new JTextArea(20,20);
	static JTextArea textOrder1=new JTextArea(100, 200);
	static JScrollPane scrollpane1=new JScrollPane(textOrder1);
	static int loaddata=0;
    static int countfr=0, countnfr=0;
    static JTable frnfr=new JTable();
    static JTable NFR_priority;
    static Edge1 E_FN=null;
    static Edge1 E_NN=null;
    static Edge2 E_FF=null;
    static Edge1 nfrnfrroot=null;
    static Edge1 frnfrroot=null;
    static Edge1 frfrroot=null;
    static Node frroot=null;
    static Node nfrroot=null;
    static int flag=1;
    static Node NFR=null;
    static Node FR=null;
    static Node g, frhead;
    static Node Fro=null;
    static BC bcHead=null;
    static MC mcHead=null;
    static Rpair root=null;
    static matrix wn,wd;
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
	static JComboBox frofr=new JComboBox();
	static Edge1[][] prop_list;
	static Edge1[][] prop_frnfrlist;
	static Edge1[][] prop_nfrnfrlist;
	static Edge1 frnfrlisttemp=null;
	static int size=0, size2=0, size3=0;
	static int cn=0;
	static {
	 fr1=new JTextArea(20,20);
     nfr4=new JTextArea(20,20);
	}
	static JScrollPane scrollPaneFR = new JScrollPane(frozenFRs);
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
			                				//System.out.println(fr1+" "+fr2);
			                				bw1.close();
			                				fw1.close();
		                				}
		                			}
		                			else {
		                				FileWriter fw1 = new FileWriter("FR.txt", true); 
		                				BufferedWriter bw1 = new BufferedWriter(fw1);
		                				bw1.write(fr1+" "+fr2);
		                				//System.out.println(fr1+" "+fr2);
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
			         
			         label14.setFont(new Font("Calibri", 2, 14));
			         label14.setToolTipText("Add NFR Priority");
			         label14.setBounds(280, 490, 100, 40);
			         label14.setBackground(new Color(204, 204, 204));
			          panel6.add(label14);
			          
			          nfrpriority.setFont(new Font("Calibri", 2, 14));
			          nfrpriority.setToolTipText("Add priority value in the range 1-100");
			          nfrpriority.setBounds(360, 480, 100, 40);
			          nfrpriority.setBackground(new Color(204, 204, 204));
			          panel6.add(nfrpriority);
			         
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
			                String nfr3=nfrpriority.getText();
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
			                	else if(nfr3.compareTo("")==0) {
			                		JOptionPane.showMessageDialog(panel6, "Enter a priority value!");
			                	}
			                	else {
			                		try {
			                			File f1=new File("NFR.txt");
			                			
			                			if(f1.exists()) {
			                				checkflag=0;
			                				FileReader fread= new FileReader("NFR.txt");
			                				//NFR List Creation
			                				nfrroot=null;
			                				char c;
			                				int readc=0;
			                				String temp="";
			                				while((readc=fread.read())!=-1) {
			                					Node tempnode=new Node();
			                	    				c=(char)readc;
			                	    				temp=temp.concat(Character.toString(c));
			                	    				while((readc=fread.read())!=32) {
			                	    					c=(char)readc;
			                		    				temp=temp.concat(Character.toString(c));
			                	    				}
			                	    				tempnode.id=temp;
			                	    				temp="";
			                	    			while((readc=fread.read())!=32) {
			                	    				c=(char)readc;
		                		    				temp=temp.concat(Character.toString(c));
			                					}
			                	    			tempnode.description=temp;
			                	    			temp="";
			                	    			while((readc=fread.read())!=10) {
			                	    				if(readc>=48 && readc<=57) {
			                							c=(char)readc;
			                		    				temp=temp.concat(Character.toString(c));
			                	    				}
			                					}
			                	    			tempnode.priority=Integer.valueOf(temp);
			                	    			tempnode.next=null;
			                	    			if(nfrroot==null)
			                	    				nfrroot=tempnode;
			                	    			else {
			                	    				Node k=nfrroot;
			                	    				while(k.next!=null)
			                	    					k=k.next;
			                	    				k.next=tempnode;
			                	    			}
			                	    			temp="";
			                	    		}
			                				fread.close();
			                				//System.out.println("Done Checking");
			                				Node troot=nfrroot;
			                				int pval=Integer.valueOf(nfr3);
			                				while(troot!=null) {
			                					if(troot.id.compareTo(nfr1)==0) {
			                						troot.priority=pval;
			                						troot.description=nfr2;
			                						checkflag=1;
			                					}
			                				
			                					troot=troot.next;
			                				}
			                				troot=nfrroot;
			                			
			                				if(checkflag==0) {
			                					FileWriter fw1 = new FileWriter("NFR.txt", true); 
				                				BufferedWriter bw1 = new BufferedWriter(fw1);
				                				bw1.write(nfr1+" "+nfr2+" "+nfr3);
				                				bw1.newLine();
				                				//System.out.println(nfr1+" "+nfr2);
				                				bw1.close();
				                				fw1.close();
			                				}
			                				else if(checkflag==1) {
			                					troot=nfrroot;
			                					FileWriter fw1 = new FileWriter("NFR.txt", false); 
				                				BufferedWriter bw1 = new BufferedWriter(fw1);
			                					while(troot!=null) {
			                						bw1.write(troot.id+" "+troot.description+" "+troot.priority);
					                				bw1.newLine();
					                				troot=troot.next;
			                					}
			                					bw1.close();
				                				fw1.close();
			                					JOptionPane.showMessageDialog(panel6, "Data updated.");
			                				}
			                				
			                				
			                			}
			                			else {
			                				FileWriter fw1 = new FileWriter("NFR.txt", true); 
			                				BufferedWriter bw1 = new BufferedWriter(fw1);
			                				bw1.write(nfr1+" "+nfr2+" "+nfr3);
			                				//System.out.println(nfr1+" "+nfr2);
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
	                if(degreeval>=-100 && degreeval<=100)
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
			
			//System.out.println("Contents of E_FN:");
			Edge1 h=E_FN;
			while(h!=null) {
				//System.out.println(h.id1+" | "+h.id2+" | "+h.value);
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
			
			//	System.out.println("Contents of E_NN:");
				h=E_NN;
				while(h!=null) {
					//System.out.println(h.id1+" | "+h.id2+" | "+h.value);
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
				
				//System.out.println("Contents of E_FF:");
				Edge2 h2=E_FF;
				while(h2!=null) {
					//System.out.println(h2.id1+" | "+h2.id2);
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
			//System.out.println("The FRs are:");
		    	Node k=FR;
		    	while(k!=null) {
		    	//	System.out.println(k.id);
		    		k=k.next;
		    	}
		    	//System.out.println("The NFRs are:");
		    	Node m=NFR;
		    	while(m!=null) {
		    	//	System.out.println(m.id);
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
	    		//System.out.println(p.id);
	    		p=p.next;
	    	}
	    	
	    //	System.out.println("hii I am here!");
	    	fp_frame.getContentPane().setBackground(new Color(204, 204, 204));
	        try {
	            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	        }
	        catch (Exception e) {
	          //  System.out.println("Look and Feel not set");
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
	         //   System.out.println(f1.length());
	            if(f1.exists()) {
	            	//System.out.println("File Exists");
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
			           // System.out.println("length="+f1.length());
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
			
		

	        // Button to set NFR parameters
	        JLabel parametername;
	        (parametername = new JLabel("Select a Parameter")).setFont(new Font("Calibri", 2, 18));
	        parametername.setBounds(50, 50, 200, 40);
	        panel2.add(parametername);
	        final ButtonGroup buttonGroup = new ButtonGroup();
	        buttonGroup.add(conflict);
	        buttonGroup.add(priority);
	        buttonGroup.add(both);
	        buttonGroup.add(both2);
	        
	        conflict.setFont(new Font("Calibri", 2, 16));
	        conflict.setBounds(50, 100, 100, 40);
	        panel2.add(conflict);
	        
	        priority.setFont(new Font("Calibri", 2, 16));
	        priority.setBounds(50, 130, 130, 40);
	        panel2.add(priority);
	        both.setFont(new Font("Calibri", 2, 16));
	        both.setBounds(50, 160, 130, 40);
	        both.setToolTipText("Product of NFR Conflict and NFR Priority");
	        panel2.add(both);
	        both2.setFont(new Font("Calibri", 2, 16));
	        both2.setBounds(50, 190, 130, 40);
	        both2.setToolTipText("Weighted sum of NFR Conflict and NFR Priority");
	       panel2.add(both2);
	       JLabel weightlabel;
	        (weightlabel = new JLabel("Specify weights:")).setFont(new Font("Calibri", 2, 14));
	        weightlabel.setBounds(280, 50, 100, 40);
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
	        l1.setBounds(200, 100, 80, 40);
	       panel2.add(l1);
	        l2.setFont(new Font("Calibri", 2, 13));
	        l2.setBounds(520, 100, 80, 40);
	        panel2.add(l2);
	        slider1.setLabelTable(labels);
	        slider1.setBounds(260, 100, 250, 50);
	        panel2.add(slider1);
	      submit.setToolTipText("Click to submit the parameter selected!");
	      submit.setBackground(new Color(120, 168, 252));
	      submit.setForeground(Color.black);
	      submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	      submit.setFont(new Font("Calibri", 2, 16));
	        submit.setBounds(280, 180, 100, 30);
	        panel2.add(submit);
	        submit.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(final ActionEvent e) {
	                setChoice();
	            }
	        });
	        
	        //Button to set frozen FRs
	        
	        JLabel labelFrozen=new JLabel("Select FRs to be frozen");
	        labelFrozen.setFont(new Font("Calibri", 2, 18));
	        labelFrozen.setBounds(620, 50, 200, 40);
	        panel2.add(labelFrozen);
	        frofr.setBounds(620, 100, 100, 40);
	        panel2.add(frofr);
	        frofr.addItem("");
	       // frofr.setEnabled(false);
	        addFrozen.setBackground(new Color(120, 168, 252));
	        addFrozen.setForeground(Color.black);
	        addFrozen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        addFrozen.setFont(new Font("Calibri", 2, 16));
	        addFrozen.setBounds(590, 180, 80, 40);
	        addFrozen.setToolTipText("Click to add Frozen Requirements");
	        panel2.add(addFrozen);
	        delFrozen.setBackground(new Color(120, 168, 252));
	        delFrozen.setForeground(Color.black);
	        delFrozen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        delFrozen.setFont(new Font("Calibri", 2, 16));
	        delFrozen.setBounds(680, 180, 80, 40);
	        delFrozen.setToolTipText("Click to Delete Frozen Rqeuirements from the list");
	        panel2.add(delFrozen);
	       //addFrozen.setEnabled(true);
	       //delFrozen.setEnabled(true);
	       scrollPaneFR.setVerticalScrollBarPolicy(22);
	       scrollPaneFR.setHorizontalScrollBarPolicy(32);
	       scrollPaneFR.setBounds(770, 100, 130, 120);
	       frozenFRs.setFont(new Font("Calibri", 2, 20));
	       frozenFRs.setEditable(false);
	      panel2.add(scrollPaneFR);
	      
	      frofr.removeAllItems();
	      try {
				//FR List Creation
				frroot=null;
				FileReader fread= new FileReader("FR.txt");
				int readc=0;
				char c;
				String temp="";
				while((readc=fread.read())!=-1) {
	    				c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
	    				while((readc=fread.read())!=32) {
	    					c=(char)readc;
		    				temp=temp.concat(Character.toString(c));
	    				}
	    			while((readc=fread.read())!=10) {
	    				if(readc==-1)
	    					break;
						
					}
	    			Node tempnode=new Node();
	    			tempnode.id=temp;
	    			tempnode.next=null;
	    			if(frroot==null)
	    				frroot=tempnode;
	    			else {
	    				Node k=frroot;
	    				while(k.next!=null)
	    					k=k.next;
	    				k.next=tempnode;
	    			}
	    			temp="";
	    		}
				fread.close();
	      }catch(IOException e) {
	    	  System.out.println("File FR.txt not found!");
	      }
	   	 Node p=frroot;
	   	 frofr.removeAllItems();
	   	 frofr.addItem("");
	   	   while(p!=null) {
	   		   frofr.addItem(p.id);
	   		   p=p.next;
	   	   }
	   	   
	       addFrozen.addActionListener(new ActionListener() {
	           @Override
	           public void actionPerformed(final ActionEvent e) {
	          
	          	String s=frofr.getSelectedItem().toString(); 
	          	if(s.compareTo("")!=0) {
	          		System.out.println("s= "+s);
	          	File f1=new File("Frozen.txt");
	          	Fro=null;
	          	int checkflag=0;
	          	if(f1.exists()) {
	          		System.out.println("File exists!");
	          		try {
	          			FileReader fread=new FileReader("Frozen.txt");
	          			int i;
	          			char c;
	          			String temp="";
	          			while((i=fread.read())!=-1) {
	          				c=(char)i;
	          				temp=temp.concat(Character.toString(c));
	          				while((i=fread.read())!=10) {
	          					if(i==-1)
	          						break;
	          					c=(char)i;
	          					if((i>=97 && i<=122)|| (i>=49 && i<=57))
	          						temp=temp.concat(Character.toString(c));
	          				}
	          				System.out.println("temp ="+temp);
	          				System.out.println("Printed");
	          				Node element=new Node();
	          				element.id=temp;
	          				element.next=null;
	          				if(Fro==null)
	          					Fro=element;
	          				else
	          				{
	          					Node temproot=Fro;
	          					while(temproot.next!=null)
	          						temproot=temproot.next;
	          					temproot.next=element;
	          				}
	          				if(temp.compareTo(s)==0)
	          					checkflag=1;
	          				temp="";
	          			}
	          			fread.close();
	          	
	    				if(checkflag==0) {
	    					FileWriter fw1 = new FileWriter("Frozen.txt", false); 
		    				BufferedWriter bw1 = new BufferedWriter(fw1);
	    					Node element=new Node();
	    					element.id=s;
	    					element.next=null;
		          			Node temproot=Fro;
		          			while(temproot!=null) {
		          				bw1.write(temproot.id);
		          				bw1.newLine();
		          				if(temproot.next==null) {
		          					temproot.next=element;
		          					break;
		          				}
		          				temproot=temproot.next;
		          			}
		          			bw1.write(s);
		          			bw1.newLine();
		          			bw1.close();
		    				fw1.close();
		    				temproot=Fro;
		          			while(temproot!=null) {
		          			System.out.println("In File" +temproot.id);
		          			temproot=temproot.next;
		          			}
		          		}
	    				else {
	    					JOptionPane.showMessageDialog(panel2, "Item already exists!"); 
	    				}
	    				
	          		}catch(IOException e2) {
	          			System.out.println("Unable to open Frozen,txt");
	          		}
	          	}
	          	else {
	          		System.out.println("File does not exists!");
	          		System.out.println("Element recording in the file!");
	              	try {
	              	FileWriter fw1 = new FileWriter("Frozen.txt", true); 
    				BufferedWriter bw1 = new BufferedWriter(fw1);
    				bw1.write(s);
    			 	//System.out.println("Element recorded in the file!");
    				bw1.newLine();
    			 	//System.out.println("Element recorded in the file 2!");
    				bw1.close();
    				fw1.close();
	              	}catch(IOException e3) {
	              		System.out.println("Unable to open Frozen.txt");
	              	}
	              	System.out.println("Element recorded in the file!");
	            	Node element=new Node();
					element.id=s;
					element.next=null;
					if(Fro==null)
						Fro=element;
					//frozenFRs.setText("");
					
	          	}
	          	frofr.setSelectedItem("");
	          	System.out.println("Hello I am out");
	          	frozenFRs.setText("");
				Node temproot=Fro;
				while(temproot!=null) {
					frozenFRs.append(temproot.id);
	              	frozenFRs.append("\n");
	              	temproot=temproot.next;
				}
				frofr.setSelectedItem("");
	          	}
	          	else {
	          		//Do Nothing
	          		frofr.setSelectedItem("");
	          	}
	           }
	       });
	       generate.setBackground(new Color(120, 168, 252));
	       generate.setForeground(Color.black);
	       generate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	       generate.setFont(new Font("Calibri", 2, 14));
	       generate.setBounds(50, 280, 130, 40);
	       generate.setToolTipText("Click to generate partial order");
	       panel2.add(generate);
	       
	        scrollpane1.setVerticalScrollBarPolicy(22);
	        scrollpane1.setHorizontalScrollBarPolicy(32);
	        scrollpane1.setBounds(50, 350, 240, 350);
	        textOrder1.setFont(new Font("Calibri", 2, 20));
	        textOrder1.setEditable(false);
	        panel2.add(scrollpane1);
	        
	        generate.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(final ActionEvent e) {
	            	if (choice == 0) {
	                    JOptionPane.showMessageDialog(panel2, "Select a parameter");
	                }
	            	else {
	            		//Create FR and NFR list
	            		try {
	            		frroot=null;
	        			FileReader fread= new FileReader("FR.txt");
	        			int readc=0;
	        			char c;
	        			String temp="";
	        			while((readc=fread.read())!=-1) {
	            				c=(char)readc;
	            				temp=temp.concat(Character.toString(c));
	            				while((readc=fread.read())!=32) {
	            					c=(char)readc;
	            					if((readc>=97 && readc<=122)|| (readc>=49 && readc<=57))
	            						temp=temp.concat(Character.toString(c));
	            				}
	            			while((readc=fread.read())!=10) {
	            				if(readc==-1)
	            					break;
	        					
	        				}
	            			Node tempnode=new Node();
	            			tempnode.id=temp;
	            			tempnode.next=null;
	            			if(frroot==null)
	            				frroot=tempnode;
	            			else {
	            				Node k=frroot;
	            				while(k.next!=null)
	            					k=k.next;
	            				k.next=tempnode;
	            			}
	            			temp="";
	            		}
	        			fread.close();
	        			//NFR List Creation
	        			nfrroot=null;
	        			fread= new FileReader("NFR.txt");
	        			readc=0;
	        			temp="";
	        			while((readc=fread.read())!=-1) {
	        				Node tempnode=new Node();
	            				c=(char)readc;
	            				temp=temp.concat(Character.toString(c));
	            				while((readc=fread.read())!=32) {
	            					c=(char)readc;
	            					if((readc>=97 && readc<=122)|| (readc>=49 && readc<=57))
	            						temp=temp.concat(Character.toString(c));
	            				}
	            				tempnode.id=temp;
	            				temp="";
	            			while((readc=fread.read())!=32) {
	        				}
	            			while((readc=fread.read())!=10) {
	            				if(readc>=48 && readc<=57) {
	        						c=(char)readc;
	        						if(readc>=48 && readc<=57)
	        							temp=temp.concat(Character.toString(c));
	            				}
	        				}
	            			tempnode.priority=Integer.valueOf(temp);
	            			tempnode.next=null;
	            			if(nfrroot==null)
	            				nfrroot=tempnode;
	            			else {
	            				Node k=nfrroot;
	            				while(k.next!=null)
	            					k=k.next;
	            				k.next=tempnode;
	            			}
	            			temp="";
	            		}
	        			fread.close();
	        			frfrroot=null;
	        			fread= new FileReader("FRFR.txt");
	        			readc=0;
	        			temp="";
	        			while((readc=fread.read())!=-1) {
	        				Edge1 tempnode=new Edge1();
	        					c=(char)readc;
	        					cn++;
	        					temp=temp.concat(Character.toString(c));
	        					while((readc=fread.read())!=32) {
	        						c=(char)readc;
	        						if((readc>=97 && readc<=122)|| (readc>=49 && readc<=57))
	        							temp=temp.concat(Character.toString(c));
	        					}
	        					tempnode.id1=temp;
	        					temp="";
	        					while((readc=fread.read())!=32) {
	        						c=(char)readc;
	        						if((readc>=97 && readc<=122)|| (readc>=49 && readc<=57))
	        							temp=temp.concat(Character.toString(c));
	        					}
	        					tempnode.id2=temp;
	        					temp="";
	        					while((readc=fread.read())!=32) {
	        						c=(char)readc;
	        	    				temp=temp.concat(Character.toString(c));
	        					}
	        					tempnode.type=temp;
	        					temp="";
	        					while((readc=fread.read())!=10) {
	        						if(readc>=48 && readc<=57) {
	        						c=(char)readc;
	        	    				temp=temp.concat(Character.toString(c));
	        						}
	        					}
	        					int kval=Integer.valueOf(temp);
	        					tempnode.value=kval;
	        					tempnode.next=null;
	        	    			if(frfrroot==null)
	        	    				frfrroot=tempnode;
	        	    			else {
	        	    				Edge1 k=frfrroot;
	        	    				while(k.next!=null)
	        	    					k=k.next;
	        	    				k.next=tempnode;
	        	    			}
	        	   
	        	    			temp="";
	        				}
	        			fread.close();
	        			//FRNFR List Creation
	        			frnfrroot=null;
	        			fread= new FileReader("FRNFR.txt");
	        			readc=0;
	        			temp="";
	        			while((readc=fread.read())!=-1) {
	        				Edge1 tempnode=new Edge1();
	        					c=(char)readc;
	        					temp=temp.concat(Character.toString(c));
	        					while((readc=fread.read())!=32) {
	        						c=(char)readc;
	        						if((readc>=97 && readc<=122)|| (readc>=49 && readc<=57))
	        							temp=temp.concat(Character.toString(c));
	        					}
	        					tempnode.id1=temp;
	        					temp="";
	        					while((readc=fread.read())!=32) {
	        						c=(char)readc;
	        						if((readc>=97 && readc<=122)|| (readc>=49 && readc<=57))
	        							temp=temp.concat(Character.toString(c));
	        					}
	        					tempnode.id2=temp;
	        					temp="";
	        					while((readc=fread.read())!=10) {
	        						if(readc==45) {
	        							c=(char)readc;
	        		    				temp=temp.concat(Character.toString(c));
	        						}
	        						if(readc>=48 && readc<=57) {
	        						c=(char)readc;
	        	    				temp=temp.concat(Character.toString(c));
	        						}
	        					}
	        					int kval=Integer.valueOf(temp);
	        					tempnode.value=kval;
	        					tempnode.next=null;
	        	    			if(frnfrroot==null)
	        	    				frnfrroot=tempnode;
	        	    			else {
	        	    				Edge1 k=frnfrroot;
	        	    				while(k.next!=null)
	        	    					k=k.next;
	        	    				k.next=tempnode;
	        	    			}
	        	   
	        	    			temp="";
	        				}
	        			fread.close();
	        		//NFRNFR List Creation
	        			nfrnfrroot=null;
	        			fread= new FileReader("NFRNFR.txt");
	        			readc=0;
	        			temp="";
	        			while((readc=fread.read())!=-1) {
	        				Edge1 tempnode=new Edge1();
	        					c=(char)readc;
	        					temp=temp.concat(Character.toString(c));
	        					while((readc=fread.read())!=32) {
	        						c=(char)readc;
	        						if((readc>=97 && readc<=122)|| (readc>=49 && readc<=57))
	        							temp=temp.concat(Character.toString(c));
	        					}
	        					tempnode.id1=temp;
	        					temp="";
	        					while((readc=fread.read())!=32) {
	        						c=(char)readc;
	        						if((readc>=97 && readc<=122)|| (readc>=49 && readc<=57))
	        							temp=temp.concat(Character.toString(c));
	        					}
	        					tempnode.id2=temp;
	        					temp="";
	        					while((readc=fread.read())!=10) {
	        						if(readc>=48 && readc<=57) {
	        						c=(char)readc;
	        	    				temp=temp.concat(Character.toString(c));
	        						}
	        					}
	        					int kval=Integer.valueOf(temp);
	        					tempnode.value=kval;
	        					tempnode.next=null;
	        	    			if(nfrnfrroot==null)
	        	    				nfrnfrroot=tempnode;
	        	    			else {
	        	    				Edge1 k=nfrnfrroot;
	        	    				while(k.next!=null)
	        	    					k=k.next;
	        	    				k.next=tempnode;
	        	    			}
	        	   
	        	    			temp="";
	        				}
	        			fread.close();
	        			
	            	}catch(IOException e4) {
	            		System.out.println("File error!");
	            	}
	            		//Create Clusters
	        			create_BasicClusters();
	                  	display_BasicClusters();
	                  	create_MacroClusters();
	                  	 display_MacroClusters();
	                  	 create_requirementSet();
	                  	 wn=null;wd=null;
	                   //  generate_PartialOrderNew();
	                     //remove_transitive();
	                     //exist_path();
	                     //display_PartialOrder();
	                     //setText();
	                
	                    //setOrderInFrame();
	                    //show_matrix();
	            	}
	            	
	            }
	        });
	 }
	 public static void create_BasicClusters() {
		 
	        Node nfr = nfrroot;
	        bcHead = null;
	        while (nfr != null) {
	        	//System.out.println("Creating BC for NFR "+nfr.id);
	            final BC temp = new BC();
	            temp.Nid = nfr.id;
	            Edge1 fn = frnfrroot;
	            FRDep flist = null;
	            while (fn != null) {
	                if (fn.id2.compareTo(nfr.id) == 0) {
	                	System.out.println("Found NFR "+fn.id2);
	                    final FRDep fnode = new FRDep();
	                    fnode.id = fn.id1;
	                    fnode.val = fn.value;
	                    fnode.next = null;
	                    if (flist == null) {
	                        flist = fnode;
	                    }
	                    else {
	                        FRDep p;
	                        for (p = flist; p.next != null; p = p.next) {}
	                        p.next = fnode;
	                    }
	                }
	                fn = fn.next;
	            }
	            if (flist != null) {
	                temp.begin = flist;
	            }
	            temp.next = null;
	            if (bcHead == null) {
	                bcHead = temp;
	            }
	            else {
	                BC q;
	                for (q = bcHead; q.next != null; q = q.next) {}
	                q.next = temp;
	            }
	            nfr = nfr.next;
	        }
	    }
	 public static void display_BasicClusters() {
	        BC p = bcHead;
	        //System.out.println();
	        System.out.println("The basic clusters are:");
	        //System.out.println();
	        while (p != null) {
	            System.out.println("NFR: " + p.Nid);
	            for (FRDep q = p.begin; q != null; q = q.next) {
	                System.out.println("FR: " + q.id);
	                System.out.println("Dependency Edge Weight: " + q.val);
	            }
	            System.out.println();
	            p = p.next;
	        }
	    }
	 public static void create_MacroClusters() {
	        Edge1 Nconflict = nfrnfrroot;
	        mcHead = null;
	        while (Nconflict != null) {
	            BC p = bcHead;
	            final MC temp = new MC();
	            temp.next = null;
	            temp.Blist = null;
	            temp.CEdge = 1;
	            while (p != null) {
	                if (p.Nid.compareTo(Nconflict.id1) == 0 || p.Nid.compareTo(Nconflict.id2) == 0) {
	                    final BC newBC = new BC();
	                    newBC.Nid = p.Nid;
	                    newBC.begin = p.begin;
	                    newBC.next = null;
	                    if (temp.Blist == null) {
	                        temp.Blist = newBC;
	                    }
	                    else {
	                        BC q;
	                        for (q = temp.Blist; q.next != null; q = q.next) {}
	                        q.next = newBC;
	                    }
	                }
	                p = p.next;
	            }
	            if (mcHead == null) {
	                mcHead = temp;
	            }
	            else {
	                MC r;
	                for (r = mcHead; r.next != null; r = r.next) {}
	                r.next = temp;
	            }
	            Nconflict = Nconflict.next;
	        }
	      
	    }
	    
	    public static void display_MacroClusters() {
	        MC p = mcHead;
	        //System.out.println();
	        //System.out.println("The macro clusters are:");
	        //System.out.println();
	        while (p != null) {
	            System.out.println("A macro cluster");
	            for (BC q = p.Blist; q != null; q = q.next) {
	                System.out.println("NFR: " + q.Nid);
	                for (FRDep r = q.begin; r != null; r = r.next) {
	                    System.out.println("FR: " + r.id);
	                    System.out.println("Dependency Edge Weight: " + r.val);
	                }
	                System.out.println();
	            }
	            p = p.next;
	        }
	    }
	    public static void create_requirementSet() {
	        root = null;
	        for (Node p = frroot; p.next != null; p = p.next) {
	            for (Node q = p.next; q != null; q = q.next) {
	                final Rpair temp = new Rpair();
	                temp.id1 = p.id;
	                temp.id2 = q.id;
	                temp.done = 0;
	                temp.next = null;
	                if (root == null) {
	                    root = temp;
	                }
	                else {
	                    Rpair s;
	                    for (s = root; s.next != null; s = s.next) {}
	                    s.next = temp;
	                }
	            }
	        }
	    }
	    
	    public static void display_requirementSet() {
	        Rpair p = root;
	        int count = 0;
	        //System.out.println("The requirements pair are: ");
	        while (p != null) {
	            //System.out.println(String.valueOf(p.id1) + " " + p.id2);
	            p = p.next;
	            ++count;
	        }
	        //System.out.println("The count is : " + count);
	    }
	    /*public static void generate_PartialOrderNew() {
	    	Node j=FR;
	    	int co=0;
	    	while(j!=null)
	    	{
	    		co++;
	    		j=j.next;
	    	}
	    	conflict_weight=new double[co][co];
	    	dep_weight=new double[co][co];
	        proot = null;
	        for (Rpair point = root; point != null; point = point.next) {
	            Edge2 p = E_FF;
	            int tflag = 0;
	            while (p != null) {
	                if ((p.id1.compareTo(point.id1) == 0 && p.id2.compareTo(point.id2) == 0) || (p.id1.compareTo(point.id2) == 0 && p.id2.compareTo(point.id1) == 0)) {
	                    tflag = 1;
	                    break;
	                }
	                p = p.next;
	            }
	            if (tflag == 1) {
	                //System.out.println("Temporal Edge found for : " + point.id1 + " " + point.id2);
	                point.done = 1;
	                final PO temp = new PO();
	                temp.id1 = p.id1;
	                temp.id2 = p.id2;
	                temp.next = null;
	                if (proot == null) {
	                    proot = temp;
	                }
	                else {
	                    PO r;
	                    for (r = proot; r.next != null; r = r.next) {}
	                    r.next = temp;
	                }
	            }
	        }
	        for (Rpair point = root; point != null; point = point.next) {
	            String fr1 = point.id1;
	            String fr2 = point.id2;
	            //System.out.println("Checking for " + fr1 + " " + fr2);
	            if (point.done == 0) {
	                fr1 = point.id1;
	                fr2 = point.id2;
	                //System.out.println("Checking for " + fr1 + " " + fr2);
	                int flagmc1 = 0;
	                int flagmc2 = 0;
	                int flagmc3 = 0;
	                for (MC p2 = mcHead; p2 != null; p2 = p2.next) {
	                    flagmc1 = 0;
	                    flagmc2 = 0;
	                    for (BC q = p2.Blist; q != null; q = q.next) {
	                        for (FRDep r2 = q.begin; r2 != null; r2 = r2.next) {
	                            if (r2.id.compareTo(fr1) == 0) {
	                                flagmc1 = 1;
	                            }
	                            if (r2.id.compareTo(fr2) == 0) {
	                                flagmc2 = 1;
	                            }
	                        }
	                    }
	                    if (flagmc1 == 1 && flagmc2 == 1) {
	                        flagmc3 = 1;
	                        break;
	                    }
	                }
	                if (flagmc3 == 1) {
	                    point.done = 1;
	                    //System.out.println("Belong to same macro cluster " + fr1 + " " + fr2);
	                    if (choice == 1) {
	                        case1(fr1, fr2);
	                    }
	                    else if (choice == 2) {
	                        case2(fr1, fr2);
	                    }
	                    else if (choice == 3) {
	                        case3(fr1, fr2);
	                    }
	                    else if (choice == 4) {
	                        case4(fr1, fr2);
	                    }
	                }
	                else {
	                    int rflag1 = 0;
	                    int rflag2 = 0;
	                    LNFR1 = null;
	                    LNFR2 = null;
	                    for (BC bcluster = bcHead; bcluster != null; bcluster = bcluster.next) {
	                        FRDep s = bcluster.begin;
	                        while (s != null) {
	                            if (s.id.compareTo(point.id1) == 0) {
	                                rflag1 = 1;
	                                final Node temp2 = new Node();
	                                temp2.id = bcluster.Nid;
	                                temp2.next = null;
	                                if (LNFR1 == null) {
	                                    LNFR1 = temp2;
	                                    break;
	                                }
	                                Node q2;
	                                for (q2 = LNFR1; q2.next != null; q2 = q2.next) {}
	                                q2.next = temp2;
	                                break;
	                            }
	                            else {
	                                s = s.next;
	                            }
	                        }
	                    }
	                    for (BC bcluster = bcHead; bcluster != null; bcluster = bcluster.next) {
	                        FRDep s = bcluster.begin;
	                        while (s != null) {
	                            if (s.id.compareTo(point.id2) == 0) {
	                                rflag2 = 1;
	                                final Node temp2 = new Node();
	                                temp2.id = bcluster.Nid;
	                                temp2.next = null;
	                                if (LNFR2 == null) {
	                                    LNFR2 = temp2;
	                                    break;
	                                }
	                                Node q2;
	                                for (q2 = LNFR2; q2.next != null; q2 = q2.next) {}
	                                q2.next = temp2;
	                                break;
	                            }
	                            else {
	                                s = s.next;
	                            }
	                        }
	                    }
	                    int count = 0;
	                    int noteq = 0;
	                    if (rflag1 == 1 && rflag2 == 1) {
	                        Node l1 = LNFR1;
	                        int check = 0;
	                        while (l1 != null) {
	                            Node l2 = LNFR2;
	                            check = 0;
	                            while (l2 != null) {
	                                if (l1.id.compareTo(l2.id) == 0) {
	                                    check = 1;
	                                    ++count;
	                                    break;
	                                }
	                                l2 = l2.next;
	                            }
	                            l1 = l1.next;
	                            if (check == 0) {
	                                noteq = 1;
	                            }
	                        }
	                        l1 = LNFR2;
	                        check = 0;
	                        while (l1 != null) {
	                            Node l2 = LNFR1;
	                            check = 0;
	                            while (l2 != null) {
	                                if (l1.id.compareTo(l2.id) == 0) {
	                                    check = 1;
	                                    ++count;
	                                    break;
	                                }
	                                l2 = l2.next;
	                            }
	                            l1 = l1.next;
	                            if (check == 0) {
	                                noteq = 1;
	                            }
	                        }
	                    }
	                    if (count > 0) {
	                        point.done = 1;
	                        caseB(fr1, fr2);
	                    }
	                }
	            }
	            for (PO u = proot; u != null; u = u.next) {
	                if (u.next == null) {
	                    //System.out.println("added edge is : " + u.id1 + "->" + u.id2);
	                    break;
	                }
	            }
	            final int f = check_cycle();
	            if (f == 1) {
	                //System.out.println("Loop is formed");
	                PO p3 = proot;
	                PO q3 = p3.next;
	                if (q3 != null) {
	                    while (q3.next != null) {
	                        p3 = p3.next;
	                        q3 = p3.next;
	                    }
	                    p3.next = null;
	                }
	            }
	            for (PO v = proot; v != null; v = v.next) {
	                v.visited = 0;
	            }
	            
	        }
	     //   display_matrix(co);
	    }*/
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
	            	//System.out.println("The value is "+s2+" | "+val);
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
	        //System.out.println("The priority values are");
	        Node h=NFR;
	        while(h!=null) {
	        	//System.out.println(h.id+" | "+h.priority);
	        	h=h.next;
	        }
	    }
	    public static void setChoice() {
	    	try {
	    	FileWriter fw1 = new FileWriter("Parameter.txt", false); 
			BufferedWriter bw1 = new BufferedWriter(fw1);
	        if (conflict.isSelected()) {
	            choice = 1;
	            bw1.write("1");
	            bw1.newLine();
	        }
	        else if (priority.isSelected()) {
	            choice = 2;
	            bw1.write("2");
	            bw1.newLine();
	        }
	        else if (both.isSelected()) {
	            choice = 3;
	            bw1.write("3");
	            bw1.newLine();
	        }
	        else if (both2.isSelected()) {
	            w1 = slider1.getValue() / 10.0;
	            w2 = 1.0 - w1;
	            String ws1=String.valueOf(w1);
	            String ws2=String.valueOf(w2);
	            choice = 4;
	            bw1.write("4"+" "+ws1+" "+ws2);
	            bw1.newLine();
	        }
	        else {
	            JOptionPane.showMessageDialog(panel2, "Select a parameter");
	        }
	        bw1.close();
	        fw1.close();
	    	}catch(IOException p) {
	    		System.out.println("File Handling Error for parameter.txt!");
	    	}
	    }
	    
	public static void construct_panel3() {
		
	}
	public static void construct_panel4() {
		
	}
	public static void construct_panel7() {
		frnfrlisttemp=null;
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
	  		   	componentbox.setEditable(true);
	   JLabel NFRImpactlabel= new JLabel("FR/NFR Impacted");
	  			NFRImpactlabel.setBounds(50,270,200, 60);
	  			panel7.add(NFRImpactlabel);
	  			
	  			 nfrimpactbox.addItem("");
	  			 nfrimpactbox.setBounds(180, 270, 100, 40);
	  		     panel7.add(nfrimpactbox);     
	  		   nfrimpactbox.setEditable(true);
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
			    		// System.out.println("File error");
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
       loadnfr.setBounds(810, 200, 120, 40);
 	  loadnfr.setFont(new Font("Calibri", 2, 16));
       loadnfr.setBackground(new Color(120, 168, 252));
       loadnfr.setForeground(Color.black);
       loadnfr.setToolTipText("Click to load FRs/NFRs");
       loadnfr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
       panel7.add(loadnfr);
	  JButton risk1= new JButton("Risk Assessment");
	  risk1.setBounds(650, 380, 200, 40);
	  risk1.setFont(new Font("Calibri", 2, 16));
      risk1.setBackground(new Color(120, 168, 252));
      risk1.setForeground(Color.black);
      risk1.setToolTipText("Click to assess Risks");
      risk1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      panel7.add(risk1);
      risk1.addActionListener(new ActionListener() {
	        @Override
	         public void actionPerformed(final ActionEvent e) {
	        	size=0;
	        	size2=0;
	        	cn=0;
	        	size3=0;
	        	riskexpose.setText("");
	        	create_list();
	        	compute_satisfaction();
	        	compute_conflict();
	        	change_propagation(); // Derives FR-FR propagation chain
	        	
	        	calculate_nodeimpact();
	        	calculate_risk();
	        	create_riskgraph();
	        }
      });
      JLabel j1= new JLabel("Risk Exposure");
      j1.setBounds(50,350 ,100 ,20 );
      panel7.add(j1);
      JScrollPane sp2 = new JScrollPane(riskexpose);       
      sp2.setBounds(50,380, 550,130);
      sp2.setBackground(new Color(204, 204, 204));
       sp2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
       panel7.add(sp2);
       riskexpose.setEditable(false);
       JLabel j2= new JLabel("Risk Measure");
       j2.setBounds(50,520 ,100 ,20 );
       panel7.add(j2);
       JScrollPane sp3 = new JScrollPane(riskmeasure);       
       sp3.setBounds(50,550, 550,130);
       sp3.setBackground(new Color(204, 204, 204));
        sp3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel7.add(sp3);
       riskmeasure.setEditable(false);
      set.setBounds(520, 270, 100, 40);
	  set.setFont(new Font("Calibri", 2, 16));
      set.setBackground(new Color(120, 168, 252));
      set.setForeground(Color.black);
      set.setToolTipText("Click to save value");
      set.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      panel7.add(set);
      loadnfr.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e){
	    		 String componentselected=componentbox.getSelectedItem().toString();
	    		 String categoryselected=categorybox.getSelectedItem().toString();
	    		 if(categoryselected.compareTo("FR")==0) {
			     nfrimpactbox.removeAllItems();
			     nfrimpactbox.addItem("");
			     if(componentselected.compareTo("")!=0) {
			    	 
			     try {
			    	FileReader fread=new FileReader("FRNFR.txt");
			    	int readc=0;
		 			char c;
		 			String temp1="";
		 			String temp2="";
		 			String temp3="";
		 			while((readc=fread.read())!=-1) {
		     				c=(char)readc;
		     				temp1=temp1.concat(Character.toString(c));
		     				while((readc=fread.read())!=32) {
		     					c=(char)readc;
		 	    				temp1=temp1.concat(Character.toString(c));
		     				}
		     				temp2="";
		     				while((readc=fread.read())!=32) {
		     					c=(char)readc;
		 	    				temp2=temp2.concat(Character.toString(c));
		     				}
		     				temp3="";
		     			while((readc=fread.read())!=10) {
		     					if(readc==45) {
		     						c=(char)readc;
			        				temp3=temp3.concat(Character.toString(c));
		     					}
		     					else if(readc>=48 && readc<=57) {
		    					c=(char)readc;
		        				temp3=temp3.concat(Character.toString(c));
		    					}
		    				
		     				if(readc==-1)
		     					break;
		     			}
		     			if(temp1.compareTo(componentselected)==0)
		     				nfrimpactbox.addItem(temp2);
		     			Edge1 newnode=new Edge1();
		     			newnode.id1=temp1;
		     			newnode.id2=temp2;
		     			newnode.value=Integer.valueOf(temp3);
		     			newnode.next=null;
		     			if(frnfrlisttemp==null)
		     				frnfrlisttemp=newnode;
		     			else {
		     				//System.out.println("Inserted");
		     				Edge1 k=frnfrlisttemp;
		     				while(k.next!=null) {
		     					k=k.next;
		     				}
		     				k.next=newnode;
		     			}
		     			//System.out.println("List created");
		     		      Edge1 t=frnfrlisttemp;
		     		      while(t!=null) {
		     		    	//  System.out.println("Here"+t.id1+" "+t.id2+" "+t.value);
		     		    	  t=t.next;
		     		      }
		     			temp1="";
		     		}
		 			fread.close();
			     }catch(IOException e5) {
			    	 
			     }
	    	 }
	    	 }
	    		 else {
	    		     nfrimpactbox.removeAllItems();
				     nfrimpactbox.addItem("");
				     if(componentselected.compareTo("")!=0) {
				    	 
				     try {
				    	FileReader fread=new FileReader("FRNFR.txt");
				    	int readc=0;
			 			char c;
			 			String temp1="";
			 			String temp2="";
			 			String temp3="";
			 			while((readc=fread.read())!=-1) {
			     				c=(char)readc;
			     				temp1=temp1.concat(Character.toString(c));
			     				while((readc=fread.read())!=32) {
			     					c=(char)readc;
			 	    				temp1=temp1.concat(Character.toString(c));
			     				}
			     				temp2="";
			     				while((readc=fread.read())!=32) {
			     					c=(char)readc;
			 	    				temp2=temp2.concat(Character.toString(c));
			     				}
			     				temp3="";
			     			while((readc=fread.read())!=10) {
			     					if(readc==45) {
			     						c=(char)readc;
				        				temp3=temp3.concat(Character.toString(c));
			     					}
			     					else if(readc>=48 && readc<=57) {
			    					c=(char)readc;
			        				temp3=temp3.concat(Character.toString(c));
			    					}
			    				
			     				if(readc==-1)
			     					break;
			     			}
			     			if(temp2.compareTo(componentselected)==0)
			     				nfrimpactbox.addItem(temp1);
			     			Edge1 newnode=new Edge1();
			     			newnode.id1=temp1;
			     			newnode.id2=temp2;
			     			newnode.value=Integer.valueOf(temp3);
			     			newnode.next=null;
			     			if(frnfrlisttemp==null)
			     				frnfrlisttemp=newnode;
			     			else {
			     				//System.out.println("Inserted");
			     				Edge1 k=frnfrlisttemp;
			     				while(k.next!=null) {
			     					k=k.next;
			     				}
			     				k.next=newnode;
			     			}
			     			//System.out.println("List created");
			     		      Edge1 t=frnfrlisttemp;
			     		      while(t!=null) {
			     		    	//  System.out.println("Here"+t.id1+" "+t.id2+" "+t.value);
			     		    	  t=t.next;
			     		      }
			     			temp1="";
			     		}
			 			fread.close();
				     }catch(IOException e5) {
				    	 
				     }
		    	 }
	    		 }
	    	}
      });
      
      set.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e){
	      		 String componentselected=componentbox.getSelectedItem().toString();
	      		 String frnfrselected=nfrimpactbox.getSelectedItem().toString();
	      		 String cval=nfrimpactvalue.getText();
	      		 int cval2=Integer.valueOf(cval);
	      		 if(cval2<-100 || cval2>100)
	      		 {
	      			 JOptionPane.showMessageDialog(panel7, "Impact value outside valid range");
	      		 }
	      		 else {
	      			try { 
	      			FileWriter fw1 = new FileWriter("FRNFR.txt", false); 
    				BufferedWriter bw1 = new BufferedWriter(fw1);
	      			 Edge1 ktemp=frnfrlisttemp;
	      			 while(ktemp!=null) {
	      				 if(ktemp.id1.compareTo(componentselected)==0 && ktemp.id2.compareTo(frnfrselected)==0)
	      					 ktemp.value=cval2;
	      				 else if(ktemp.id2.compareTo(componentselected)==0 && ktemp.id1.compareTo(frnfrselected)==0)
	      					ktemp.value=cval2;
	      				 ktemp=ktemp.next;
	      			 }
	      			 ktemp=frnfrlisttemp;
	      			// System.out.println("Writing");
	      			 while(ktemp!=null) {
	      				
	      				 bw1.write(ktemp.id1+" "+ktemp.id2+" "+ktemp.value);
	      				 bw1.newLine(); 
	      				 ktemp=ktemp.next;
	      			 }
	      			bw1.close();
    				fw1.close();
	      			}catch(IOException e5) {
	      				System.out.println("File not found!");
	      			}
	      		 }
	    	 }
      });	
	}
	public static void create_list() {
		//FR List
		try {
			//FR List Creation
			frroot=null;
			FileReader fread= new FileReader("FR.txt");
			int readc=0;
			char c;
			String temp="";
			while((readc=fread.read())!=-1) {
    				c=(char)readc;
    				temp=temp.concat(Character.toString(c));
    				while((readc=fread.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    			while((readc=fread.read())!=10) {
    				if(readc==-1)
    					break;
					
				}
    			Node tempnode=new Node();
    			tempnode.id=temp;
    			tempnode.next=null;
    			if(frroot==null)
    				frroot=tempnode;
    			else {
    				Node k=frroot;
    				while(k.next!=null)
    					k=k.next;
    				k.next=tempnode;
    			}
    			temp="";
    		}
			fread.close();
			//NFR List Creation
			nfrroot=null;
			fread= new FileReader("NFR.txt");
			readc=0;
			temp="";
			while((readc=fread.read())!=-1) {
				Node tempnode=new Node();
    				c=(char)readc;
    				temp=temp.concat(Character.toString(c));
    				while((readc=fread.read())!=32) {
    					c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
    				tempnode.id=temp;
    				temp="";
    			while((readc=fread.read())!=32) {
				}
    			while((readc=fread.read())!=10) {
    				if(readc>=48 && readc<=57) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
				}
    			tempnode.priority=Integer.valueOf(temp);
    			tempnode.next=null;
    			if(nfrroot==null)
    				nfrroot=tempnode;
    			else {
    				Node k=nfrroot;
    				while(k.next!=null)
    					k=k.next;
    				k.next=tempnode;
    			}
    			temp="";
    		}
			fread.close();
			//FRFR List Creation
			frfrroot=null;
			fread= new FileReader("FRFR.txt");
			readc=0;
			temp="";
			while((readc=fread.read())!=-1) {
				Edge1 tempnode=new Edge1();
					c=(char)readc;
					cn++;
					temp=temp.concat(Character.toString(c));
					while((readc=fread.read())!=32) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
					}
					tempnode.id1=temp;
					temp="";
					while((readc=fread.read())!=32) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
					}
					tempnode.id2=temp;
					temp="";
					while((readc=fread.read())!=32) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
					}
					tempnode.type=temp;
					temp="";
					while((readc=fread.read())!=10) {
						if(readc>=48 && readc<=57) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
						}
					}
					int kval=Integer.valueOf(temp);
					tempnode.value=kval;
					tempnode.next=null;
	    			if(frfrroot==null)
	    				frfrroot=tempnode;
	    			else {
	    				Edge1 k=frfrroot;
	    				while(k.next!=null)
	    					k=k.next;
	    				k.next=tempnode;
	    			}
	   
	    			temp="";
				}
			fread.close();
			//FRNFR List Creation
			frnfrroot=null;
			fread= new FileReader("FRNFR.txt");
			readc=0;
			temp="";
			while((readc=fread.read())!=-1) {
				Edge1 tempnode=new Edge1();
					c=(char)readc;
					temp=temp.concat(Character.toString(c));
					while((readc=fread.read())!=32) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
					}
					tempnode.id1=temp;
					temp="";
					while((readc=fread.read())!=32) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
					}
					tempnode.id2=temp;
					temp="";
					while((readc=fread.read())!=10) {
						if(readc==45) {
							c=(char)readc;
		    				temp=temp.concat(Character.toString(c));
						}
						if(readc>=48 && readc<=57) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
						}
					}
					int kval=Integer.valueOf(temp);
					tempnode.value=kval;
					tempnode.next=null;
	    			if(frnfrroot==null)
	    				frnfrroot=tempnode;
	    			else {
	    				Edge1 k=frnfrroot;
	    				while(k.next!=null)
	    					k=k.next;
	    				k.next=tempnode;
	    			}
	   
	    			temp="";
				}
			fread.close();
		//NFRNFR List Creation
			nfrnfrroot=null;
			fread= new FileReader("NFRNFR.txt");
			readc=0;
			temp="";
			while((readc=fread.read())!=-1) {
				Edge1 tempnode=new Edge1();
					c=(char)readc;
					temp=temp.concat(Character.toString(c));
					while((readc=fread.read())!=32) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
					}
					tempnode.id1=temp;
					temp="";
					while((readc=fread.read())!=32) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
					}
					tempnode.id2=temp;
					temp="";
					while((readc=fread.read())!=10) {
						if(readc>=48 && readc<=57) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
						}
					}
					int kval=Integer.valueOf(temp);
					tempnode.value=kval;
					tempnode.next=null;
	    			if(nfrnfrroot==null)
	    				nfrnfrroot=tempnode;
	    			else {
	    				Edge1 k=nfrnfrroot;
	    				while(k.next!=null)
	    					k=k.next;
	    				k.next=tempnode;
	    			}
	   
	    			temp="";
				}
			fread.close();
		
		}catch(IOException e5) {
			
		}
	}
	public static void change_propagation() {
		String compselect=componentbox.getSelectedItem().toString();
		String catselect=categorybox.getSelectedItem().toString();
		int countfrnfr=0;
		prop_list=new Edge1[1000][cn];
		if(catselect.compareTo("FR")==0) {
		//Create one-hop neighbors
		Edge1 node=frfrroot;
		while(node!=null) {
			if(node.id1.compareTo(compselect)==0) {
				if(node.value>=25) {
					Edge1 temp=new Edge1();
					temp.id1=node.id1;
					temp.id2=node.id2;
					temp.value=node.value;
					temp.type=node.type;
					temp.prob=(double)((double)node.value/(double)100);
					
					prop_list[size][0]=temp;
					size++;
				}
				
			}
			
			node=node.next;
		}
		//Create chains
		int flagexit=1;
		int sizetemp=size;
		while(flagexit==1) {
			flagexit=0;
			//System.out.println(size);
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
			//	System.out.println("Last=" +last);
				int count=0;
				
				String comp=prop_list[j][last].id2;
				//System.out.println("Comp= "+comp);
				Edge1 pointer=frfrroot;
				while(pointer!=null) {
					if(pointer.id1.compareTo(comp)==0) {
						double cprob=(double)(prop_list[j][last].prob * ((double) pointer.value/(double)100));
						//System.out.println("Matched with "+pointer.id1+" -> "+pointer.id2+" with cprob value "+cprob);
						if(cprob>=0.25) {
							count++;
							flagexit=1;
							Edge1 temp=new Edge1();
							temp.id1=pointer.id1;
							temp.id2=pointer.id2;
							temp.value=pointer.value;
							temp.type=pointer.type;
							temp.prob=cprob;
							//temp.prob=(double)((double)pointer.value/(double)100);
							
							if(count==1) {
								//System.out.println("Inserted");
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
	
		}
		for(int l=0; l<size;l++) {
			String chain="";
			for(int m=0;m<cn;m++) {
				if(prop_list[l][m]!=null) {
					if(m==0)
						chain=chain.concat(prop_list[l][m].id1+"-->"+prop_list[l][m].id2);
					else
						chain=chain.concat(prop_list[l][m].id2);
					//System.out.print(prop_list[l][m].id1+" "+prop_list[l][m].id2+" "+prop_list[l][m].value+" "+prop_list[l][m].prob+" --> ");
					int ct=m+1;
					if(prop_list[l][ct]!=null)
						chain=chain.concat("-->");
					
				}
				else
					break;
			}
			String text="Chain "+(l+1)+" "+chain;
			riskexpose.append(text);
			riskexpose.append("\n");
			//System.out.println();
		}
		
		prop_frnfrlist=new Edge1[1000][1];
		Edge1 root=frnfrroot;
		size2=0;
		while(root!=null)
		{
			if(root.id1.compareTo(compselect)==0 && root.value>=25) {
				Edge1 nodein=new Edge1();
				nodein.id1=root.id1;
				nodein.id2=root.id2;
				nodein.value=root.value;
				prop_frnfrlist[size2][0]=nodein;
				size2++;
			}
			root=root.next;
		}
		prop_nfrnfrlist=new Edge1[1000][1];
		root=frnfrroot;
		size3=0;
		while(root!=null)
		{
			if(root.id1.compareTo(compselect)==0 && root.value>=25) {
				Edge1 root2=nfrnfrroot;
				while(root2!=null) {
					if(root2.id1.compareTo(root.id2)==0 || root2.id2.compareTo(root.id2)==0) {
						//Check if already exists or not
						int cflag=0;
						for(int h=0;h<size3;h++) {
							if(prop_nfrnfrlist[h][0].id1.compareTo(root2.id1)==0 && prop_nfrnfrlist[h][0].id2.compareTo(root2.id2)==0)
								cflag=1;
						}
						if(cflag==0) {
						Edge1 nodein=new Edge1();
						nodein.id1=root2.id1;
						nodein.id2=root2.id2;
						nodein.value=root2.value;
						prop_nfrnfrlist[size3][0]=nodein;
						size3++;
						}
					}
					root2=root2.next;
				}
			}
			root=root.next;
		}
		}
		else if(catselect.compareTo("NFR")==0) {
			prop_frnfrlist=new Edge1[1000][1];
			Edge1 root=frnfrroot;
			size2=0;
			while(root!=null)
			{
				if(root.id2.compareTo(compselect)==0 && root.value>=25) {
					Edge1 nodein=new Edge1();
					nodein.id1=root.id1;
					nodein.id2=root.id2;
					nodein.value=root.value;
					prop_frnfrlist[size2][0]=nodein;
					size2++;
				}
				root=root.next;
			}
			prop_nfrnfrlist=new Edge1[1000][1];
			root=frnfrroot;
			size3=0;
			Edge1 root2=nfrnfrroot;
					while(root2!=null) {
						if(root2.id1.compareTo(compselect)==0 || root2.id2.compareTo(compselect)==0) {
							//Check if already exists or not
							int cflag=0;
							for(int h=0;h<size3;h++) {
								if(prop_nfrnfrlist[h][0].id1.compareTo(root2.id1)==0 && prop_nfrnfrlist[h][0].id2.compareTo(root2.id2)==0)
									cflag=1;
							}
							if(cflag==0) {
							Edge1 nodein=new Edge1();
							nodein.id1=root2.id1;
							nodein.id2=root2.id2;
							nodein.value=root2.value;
							prop_nfrnfrlist[size3][0]=nodein;
							size3++;
							}
						}
						root2=root2.next;
					}
					System.out.println("FR-NFR Edges are: ");
					for(int t=0;t<size2;t++) {
						System.out.println(" Edge is "+prop_frnfrlist[t][0].id1+" -> "+prop_frnfrlist[t][0].id2);
					}
		}
		//create_riskgraph();
	}
	public static void create_riskgraph() {
		String compselect=componentbox.getSelectedItem().toString();
		String catselect=categorybox.getSelectedItem().toString();
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		Graph graph = new MultiGraph("Risk Exposure Graph");
		 graph.setAttribute("ui.stylesheet", "node {size : 40px;text-size: 16; fill-color: yellow;text-mode:normal; text-style: bold; text-alignment: center; text-background-mode: none; fill-mode: dyn-plain; text-visibility-mode: normal;}");
		 Node frroottemp=frroot;
		 while(frroottemp!=null) {
			 graph.addNode(frroottemp.id); 
			 frroottemp=frroottemp.next;
		 }
		Node nfr=nfrroot;
		 while(nfr!=null) {
			 graph.addNode(nfr.id);
			 nfr=nfr.next;
		 }
		 Edge1 frfr=frfrroot;
		 while(frfr!=null) {
			 	String v1=frfr.id1;
	   	 		String v2=frfr.id2;
	   	 		String v3="";
	   	 		v3=v3.concat("Dep = "+String.valueOf(frfr.value));
	   	 		String label=v1+"-"+v2;
	   	 		final Edge edge1 = graph.addEdge(label, v2, v1, true);
	   	 		edge1.addAttribute("layout.weight", 16);
	   	 		edge1.addAttribute("ui.label", v3);
	   	 		edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
	   	 		frfr=frfr.next;
		 }
		 Edge1 frnfr=frnfrroot;
		 while(frnfr!=null) {
			 	String v1=frnfr.id1;
	   	 		String v2=frnfr.id2;
	   	 		String v3="";
	   	 		v3=v3.concat("Sat = "+String.valueOf(frnfr.value));
	   	 		String label=v1+"-"+v2;
	   	 		final Edge edge1 = graph.addEdge(label, v1, v2, true);
	   	 		edge1.addAttribute("layout.weight", 16);
	   	 		edge1.addAttribute("ui.label", v3);
	   	 	if(v1.compareTo(compselect)==0 || v2.compareTo(compselect)==0) {
	   	 		if(frnfr.value>=0.25 && frnfr.value<0.50)
	   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,255,51); text-color: rgb(0,0,0);");
	   	 		else if (frnfr.value>=0.50 && frnfr.value<0.75)
	   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,128,0); text-color: rgb(0,0,0);");
	   	 		else
	   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,0,0); text-color: rgb(0,0,0);");
	   	 	}
	   	 	else
	   	 		edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
	   	 		frnfr=frnfr.next;
		 }
		 Edge1 nfrnfr=nfrnfrroot;
		 while(nfrnfr!=null) {
			 	String v1=nfrnfr.id1;
	   	 		String v2=nfrnfr.id2;
	   	 		String v3="";
	   	 		v3=v3.concat("Con = "+String.valueOf(nfrnfr.value));
	   	 		String label=v1+"-"+v2;
	   	 		final Edge edge1 = graph.addEdge(label, v1, v2, false);
	   	 		edge1.addAttribute("layout.weight", 16);
	   	 		edge1.addAttribute("ui.label", v3);
	   	 		frnfr=frnfrroot;
	   	 		if(catselect.compareTo("FR")==0) {
	   	 		while(frnfr!=null) {
	   	 			if(frnfr.id1.compareTo(compselect)==0) {
	   	 				if(v1.compareTo(frnfr.id2)==0 || v2.compareTo(frnfr.id2)==0) {
	   	 				if(nfrnfr.value>=25 && nfrnfr.value<50)	
	   	 					edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,255,51); text-color: rgb(0,0,0);");
	   	 				else if(nfrnfr.value>=50 && nfrnfr.value<75)
	   	 					edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,128,0); text-color: rgb(0,0,0);");
	   	 				else
	   	 				edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,0,0); text-color: rgb(0,0,0);");
	   	 				}
	   	 				else
	   	 				edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
	   	 			}
	   	 				
	   	 			frnfr=frnfr.next;
	   	 		}
	   	 		}
	   	 		else if(catselect.compareTo("NFR")==0) {
	   	 			if(v1.compareTo(compselect)==0 || v2.compareTo(compselect)==0) {
	   	 			if(nfrnfr.value>=25 && nfrnfr.value<50)	
   	 					edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,255,51); text-color: rgb(0,0,0);");
   	 				else if(nfrnfr.value>=50 && nfrnfr.value<75)
   	 					edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,128,0); text-color: rgb(0,0,0);");
   	 				else
   	 				edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,0,0); text-color: rgb(0,0,0);");
	   	 			}
	   	 		else
   	 				edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
	   	 		}
	   	 		//edge1.addAttribute("font-size", 20);
	   	 		
	   	 		nfrnfr=nfrnfr.next;
		 }
		
		 for (final org.graphstream.graph.Node node : graph) {
			 node.addAttribute("ui.label", node.getId());
				String k= node.getId();
			
				if(k.compareTo(compselect)==0 && catselect.compareTo("FR")==0) {
					node.addAttribute("layout.weight", 150);
					node.addAttribute("ui.style", "shape: circle; fill-color: rgb(102,0,0); text-color: rgb(255,255,255);");
				}
				else if(k.compareTo(compselect)==0 && catselect.compareTo("NFR")==0) {
					node.addAttribute("layout.weight", 150);
					node.addAttribute("ui.style", "shape: rounded-box; fill-color: rgb(102,0,0); text-color: rgb(255,255,255);");
					Node t=nfrroot;
				    while(t!=null) {
				    	if(t.id.compareTo(k)==0) {
				    		String name=t.id;
							int s=t.satisfaction;
							String id=name+" "+s;
							node.addAttribute("ui.label", id);
				    	}
				    	t=t.next;
				    }
				}
			
				else if(k.contains("fr") && !k.contains("nfr")) {
					double maxprob=0.0;
					for(int i=0; i<size; i++) {
						for(int m=0; m<cn; m++) {
							if(prop_list[i][m]!=null) {
								if(prop_list[i][m].id2.compareTo(k)==0) {
									if(prop_list[i][m].prob>maxprob)
										maxprob=prop_list[i][m].prob;
								}
							}
						}
					}
					double maximp=0.0;
					Node temproot=frroot;
					while(temproot!=null) {
						if(temproot.id.compareTo(k)==0)
							maximp=temproot.impact;
						temproot=temproot.next;
					}
					String label=k;
					maximp = Math.round(maximp * 100.0) / 100.0;
					if(maxprob>0.0)
					{
						label= label.concat(" P = \n"+String.valueOf(maxprob)+" I = \n"+String.valueOf(maximp));
					}
					node.addAttribute("ui.label", label);
					node.addAttribute("layout.weight", 300);
					node.addAttribute("ui.style", "shape: circle; fill-color: rgb(0,100,255); text-color: rgb(0,0,0);");
					
				}
				else if(k.contains("nfr")) {
				
					node.addAttribute("layout.weight", 300);
				    node.addAttribute("ui.style", "shape: rounded-box; fill-color: rgb(102,204,0); text-color: rgb(0,0,0);");
				    Node t=nfrroot;
				    while(t!=null) {
				    	if(t.id.compareTo(k)==0) {
				    		String name=t.id;
							int s=t.satisfaction;
							String id=name+" "+s;
							node.addAttribute("ui.label", id);
				    	}
				    	t=t.next;
				    }
				}
				if(catselect.compareTo("FR")==0) {
				for(int i=0; i<size; i++) {
					for(int m=0; m<cn; m++) {
						if(prop_list[i][m]!=null) {
							if(prop_list[i][m].id2.compareTo(k)==0) {
								//System.out.println("Matched Yo");
								//System.out.println(prop_list[i][m].prob);
								double cvalue=prop_list[i][m].prob;
								if(prop_list[i][m].prob!=0) {
									cvalue= prop_list[i][m].prob;
									if(cvalue>=0.25 && cvalue<0.50) {
										//System.out.println("Here1");
										node.addAttribute("layout.weight", 300);
										node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255, 255, 51); text-color: rgb(0,0,0);");
									}
									else if(cvalue>=0.50 && cvalue<0.75) {
										//System.out.println("Here2");
										node.addAttribute("layout.weight", 300);
										node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255, 128, 0); text-color: rgb(0,0,0);");
										
									}
									else
									{
										//System.out.println("Here3");
										node.addAttribute("layout.weight", 300);
										node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255,0,0); text-color: rgb(0,0,0);");
									}
								}
								else {
								if(prop_list[i][m].prob>=0.25 && prop_list[i][m].prob<0.50) {
									//System.out.println("Here1");
									node.addAttribute("layout.weight", 300);
									node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255, 255, 51); text-color: rgb(0,0,0);");
								}
								else if(prop_list[i][m].prob>=0.50 && prop_list[i][m].prob<0.75) {
									//System.out.println("Here2");
									node.addAttribute("layout.weight", 300);
									node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255, 128, 0); text-color: rgb(0,0,0);");
									
								}
								else
								{
									//System.out.println("Here3");
									node.addAttribute("layout.weight", 300);
									node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255,0,0); text-color: rgb(0,0,0);");
								}
								}
								
								/*try {
									Thread.sleep(1000);
								}catch(Exception sl) {
									
								}*/	
							}
						}
						
					}
				}
		 }
				else if(catselect.compareTo("NFR")==0) {
					for(int p=0;p<size2;p++) {
						if(prop_frnfrlist[p][0].id1.compareTo(k)==0) {
							node.addAttribute("layout.weight", 300);
							node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255,0,0); text-color: rgb(255,255,255);");
						}
					}
					for(int p=0;p<size3;p++) {
						if(prop_nfrnfrlist[p][0].id1.compareTo(k)==0 && prop_nfrnfrlist[p][0].id1.compareTo(compselect)!=0) {
							node.addAttribute("layout.weight", 300);
							node.addAttribute("ui.style", "shape: rounded-box; fill-color: rgb(255,0,0); text-color: rgb(255,255,255);");
						}
						if(prop_nfrnfrlist[p][0].id2.compareTo(k)==0 && prop_nfrnfrlist[p][0].id2.compareTo(compselect)!=0) {
							node.addAttribute("layout.weight", 300);
							node.addAttribute("ui.style", "shape: rounded-box; fill-color: rgb(255,0,0); text-color: rgb(255,255,255);");
						}
					}
				}
			}
		 Viewer viewer = graph.display();
		 viewer.enableAutoLayout();
		 viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

	}
	public static void compute_satisfaction() {
		Node j=nfrroot;
		while(j!=null) {
			Edge1 t=frnfrroot;
			int sum1=0;
			while(t!=null) {
				if(t.id2.compareTo(j.id)==0) {
					sum1=sum1+t.value;
				}
				t=t.next;
			}
			if(sum1>100)
				j.satisfaction=100;
			else
				j.satisfaction=sum1;
			j=j.next;
		}
	}
	public static void compute_conflict() {
		Edge1 temproot=nfrnfrroot;
		while(temproot!=null) {
			int condegree=0;
			int val1=0;
			int val2=0;
			Node p=nfrroot;
			while(p!=null) {
				if(temproot.id1.compareTo(p.id)==0) {
					val1=100-p.satisfaction;
				}
				else if(temproot.id2.compareTo(p.id)==0) {
					val2=100-p.satisfaction;
				}
				p=p.next;
			}
			condegree=val1+val2;
			if(condegree>=100)
				condegree=100;
			temproot.value=condegree;
			temproot=temproot.next;
		}
		try {
		FileWriter fw1 = new FileWriter("NFRNFR.txt",false); 
		BufferedWriter bw1 = new BufferedWriter(fw1);
		temproot=nfrnfrroot;
	
		while(temproot!=null) {
			//System.out.println("The edge is" +temproot.id1+" "+temproot.id2+" "+temproot.value);
			bw1.write(temproot.id1+" "+temproot.id2+" "+temproot.value);
			bw1.newLine();
			temproot=temproot.next;
		}
		//System.out.println("Hello");
		bw1.close();
		fw1.close();
		}catch(IOException j) {
			System.out.println("Writing Error");
		}	
	}
	public static void calculate_nodeimpact() {
		Node fr=frroot;
		String compselect=componentbox.getSelectedItem().toString();
		System.out.println("Started Execution");
		fr=frroot;
		while(fr!=null) {
			System.out.println("FR  "+fr.id);
			fr=fr.next;
		}
		fr=frroot;
		while(fr!=null) {
			System.out.println("Comparing with "+fr.id);
			if(fr.id.compareTo(compselect)!=0) {
			Edge1 ff=frfrroot;
			double sum=0;
			double weight=0;
			int count=0;
			while(ff!=null) {
				if(ff.id2.compareTo(fr.id)==0) {
					sum=sum+(double)ff.value;
					count++;
					if(ff.value>=25 && ff.value<50)
						weight=weight+(double)1;
					else if(ff.value>=50 && ff.value<75)
						weight=weight+(double)2;
					else if(ff.value>=75)
						weight=weight+(double)3;
					if(ff.type.compareTo("Cohesion")==0)
						weight=weight+(double)1;
					else
						weight=weight+(double)2;
				}
				ff=ff.next;
				
			}
			int max= 100*count;
			sum= (double)(sum-(double)count)/(double)((double)max-(double)1);
			weight= weight / ((double)6*(double)count);
			sum = sum * weight;
			fr.impact= sum;
			
		}
			else 
				fr.impact=0;
		fr=fr.next;
		}
		System.out.println("Finished Execution");
		fr=frroot;
		while(fr!=null) {
			System.out.println("Node Id = "+fr.id+" Impact value= "+fr.impact);
			fr=fr.next;
		}
	}
	public static void calculate_risk() {
		String catselect=categorybox.getSelectedItem().toString();
		double valff=0; // Stores FR-FR impact
		double valfnf=0; // Stores FR-NFR impact
		double valnfnf=0; // Stores NFR-NFR impact
		double[] sumff=new double[size];
		double cat=0;
		double type=0;
		double frozen=0;
		int index=0;
		double prob=0;
		double impact=0;
		if(catselect.compareTo("FR")==0) {
		for(int l=0; l<size;l++) {	
			sumff[index]=0;
			cat=0;
			type=0;
			frozen=0;
			int count=0;
			for(int m=0;m<cn;m++) {
				if(prop_list[l][m]!=null) {
					sumff[index]=sumff[index]+prop_list[l][m].value;
					//System.out.println(prop_list[l][m].id1+" "+ prop_list[l][m].id2+" "+prop_list[l][m].value);
					if(prop_list[l][m].value>=25 && prop_list[l][m].value<50) 
						cat=cat+1;
					else if(prop_list[l][m].value>=50 && prop_list[l][m].value<75)
						cat=cat+2;
					else if(prop_list[l][m].value>=75)
						cat=cat+3;
					if(prop_list[l][m].type.compareTo("Cohesion")==0)
						type=type+1;
					else
						type=type+2;
					frozen=frozen+1;
					count=count+1;
				}
				else
					break;
			}
			double weight= (cat+type+frozen)/(double)((double)6*(double)count);
			 sumff[index]= (double)(sumff[index]-(double)count)/(double)((double)((double)100*(double)count)-(double)count);
			//System.out.println("Category weight= "+cat+" Type weight = "+type+" Frozen weight= "+frozen);
			//System.out.println("Count= "+count+" Weight = "+weight);
			//System.out.println("Before = "+sumff[index]);
			sumff[index]=sumff[index]*weight;
			//System.out.println("Chain Impact= "+sumff[index]);
			index++;
		}
		riskmeasure.append("FR-FR Impact");
		riskmeasure.append("\n");
		for(int i=0; i<index; i++) {
			//double normal= (double)(sumff[i]-(double)1)/(double)((double)100-(double)1);
			String text="Chain "+(i+1)+" impact is "+sumff[i];
			riskmeasure.append(text);
			riskmeasure.append("\n");
		}
		
		double sumfnf=0;
		double sat=0;
		double prio=0;
		
		for(int l=0; l<size2;l++) {	
			String nfr=prop_frnfrlist[l][0].id2;
			Node temp=nfrroot;
			sumfnf=sumfnf+prop_frnfrlist[l][0].value;
			while(temp!=null) {
				if(temp.id.compareTo(nfr)==0) {
					if(temp.satisfaction>0 && temp.satisfaction<35)
						sat=sat+3;
					else if(temp.satisfaction>=35 && temp.satisfaction<75)
						sat=sat+2;
					else if(temp.satisfaction>=75)
						sat=sat+1;
					if(temp.priority>0 && temp.priority<35)
						prio=prio+1;
					else if(temp.priority>=35 && temp.priority<75)
						prio=prio+2;
					else if(temp.priority>=75)
						prio=prio+3;	
				}
				temp=temp.next;
			}
			
		}
			double weight= (sat+prio)/(double)((double)6*(double)size2);
			//System.out.println("Satisfaction weight = "+sat+" Priority weight= "+prio+" Count= "+size2);
			//System.out.println("weight "+weight);
			//System.out.println("sumfnf= "+sumfnf);
			sumfnf= (double)(sumfnf-(double)size2)/(double)((double)((double)100*(double)size2)-(double)size2);
			sumfnf=sumfnf*weight;
			//System.out.println("sumfnf= "+sumfnf);
			
			//double sumfnfnormal= (double)(sumfnf-(double)1)/(double)((double)100-(double)1);
			riskmeasure.append("FR-NFR Impact");
			riskmeasure.append("\n");
			String text="Impact is "+sumfnf;
			riskmeasure.append(text);
			riskmeasure.append("\n");
			
			double sumnfnf=0;
			double prio1=0;
			double prio2=0;
			for(int l=0; l<size3;l++) {	
				String nfr1=prop_nfrnfrlist[l][0].id1;
				String nfr2=prop_nfrnfrlist[l][0].id2;
				Node temp=nfrroot;
				sumnfnf=sumnfnf+prop_nfrnfrlist[l][0].value;
				while(temp!=null) {
					if(temp.id.compareTo(nfr1)==0) {
						if(temp.priority>0 && temp.priority<35)
							prio1=prio1+1;
						else if(temp.priority>=35 && temp.priority<75)
							prio1=prio1+2;
						else if(temp.priority>=75)
							prio1=prio1+3;	
					}
					if(temp.id.compareTo(nfr2)==0) {
						if(temp.priority>0 && temp.priority<35)
							prio2=prio2+1;
						else if(temp.priority>=35 && temp.priority<75)
							prio2=prio2+2;
						else if(temp.priority>=75)
							prio2=prio2+3;	
					}
					temp=temp.next;
				}
		}
		weight= (prio1+prio2)/(double)((double)6*(double)size3*(double)2);
		System.out.println("Priority weight 1= "+prio1+" Priority weight 2= "+prio2+" Count= "+size3);
		System.out.println("weight "+weight);
		System.out.println("sumnfnf= "+sumnfnf);
		sumnfnf= (double)(sumnfnf-(double)size3)/(double)((double)((double)100*(double)size3)-(double)size3);
		sumnfnf=sumnfnf*weight;
		System.out.println("sumnfnf= "+sumnfnf);
		//double sumnfnfnormal= (double)(sumnfnf-(double)1)/(double)((double)100-(double)1);
		riskmeasure.append("NFR-NFR Impact");
		riskmeasure.append("\n");
		text="Impact is "+sumnfnf;
		riskmeasure.append(text);
		riskmeasure.append("\n");
		
		//Count total edges
		int edgecount=0;
		Edge1 root=frfrroot;
		while(root!=null) {
			edgecount++;
			root=root.next;
		}
		root=frnfrroot;
		while(root!=null) {
			edgecount++;
			root=root.next;
		}
		root=nfrnfrroot;
		while(root!=null) {
			edgecount++;
			root=root.next;
		}
		double maximpact=0;
		int size1=0;
		int temp=0;
		for(int j=0; j<index; j++) {
			if(maximpact<sumff[j]) {
				size1=0;
				for(int m=0;m<cn;m++) {
					if(prop_list[j][m]!=null) {
						size1++;
					}
				}
				maximpact=sumff[j];
				temp=j;
			}
			else if(maximpact==sumff[j]) {
				int s1=0;
				for(int m=0;m<cn;m++) {
					if(prop_list[temp][m]!=null) {
						s1++;
					}
				}
				if(size1<s1) {
					size1=s1;
					temp=j;
					maximpact=sumff[j];
				}
			}
		}
		int affectededgecount=size2+size3+size1;
		prob=(double)(affectededgecount)/(double)(edgecount);
		double sumffnormal= (double)(maximpact-(double)1)/(double)((double)100-(double)1);
		impact=(double)(maximpact+sumfnf+sumnfnf);
		double risk= prob * impact;
		//text="Maximum Impact is "+impact;
		//riskmeasure.append(text);
		//riskmeasure.append("\n");
		text=" Maximum Risk is "+risk;
		riskmeasure.append(text);
		riskmeasure.append("\n");
		}
		else if(catselect.compareTo("NFR")==0) {
			double sumfnf=0;
			double sat=0;
			double prio=0;
			for(int l=0; l<size2;l++) {	
				sumfnf=sumfnf+prop_frnfrlist[l][0].value;
			}
			String nfr=prop_frnfrlist[0][0].id2;	
			Node temp=nfrroot;
			while(temp!=null) {
				if(temp.id.compareTo(nfr)==0) {
					if(temp.satisfaction>0 && temp.satisfaction<35)
						sat=sat+3;
					else if(temp.satisfaction>=35 && temp.satisfaction<75)
						sat=sat+2;
					else if(temp.satisfaction>=75)
						sat=sat+1;
					if(temp.priority>0 && temp.priority<35)
						prio=prio+1;
					else if(temp.priority>=35 && temp.priority<75)
						prio=prio+2;
					else if(temp.priority>=75)
						prio=prio+3;	
				}
				temp=temp.next;
			}
				double weight= (sat+prio)/(double)((double)6);
				System.out.println("Satisfaction weight = "+sat+" Priority weight= "+prio+" Count= "+size2);
				System.out.println("weight "+weight);
				System.out.println("sumfnf= "+sumfnf);
				sumfnf= (double)(sumfnf-(double)size2)/(double)((double)((double)100*(double)size2)-(double)size2);
				sumfnf=sumfnf*weight;
				System.out.println("sumfnf= "+sumfnf);
				
				//double sumfnfnormal= (double)(sumfnf-(double)1)/(double)((double)100-(double)1);
				riskmeasure.append("FR-NFR Impact");
				riskmeasure.append("\n");
				String text="Impact is "+sumfnf;
				riskmeasure.append(text);
				riskmeasure.append("\n");
				double sumnfnf=0;
				double prio1=0;
				double prio2=0;
				String compselect=componentbox.getSelectedItem().toString();
				for(int l=0; l<size3;l++) {	
					String nfr1=prop_nfrnfrlist[l][0].id1;
					String nfr2=prop_nfrnfrlist[l][0].id2;
					temp=nfrroot;
					sumnfnf=sumnfnf+prop_nfrnfrlist[l][0].value;
					if(nfr1.compareTo(compselect)==0) {
					while(temp!=null) {
						if(temp.id.compareTo(nfr2)==0) {
							if(temp.priority>0 && temp.priority<35)
								prio2=prio2+1;
							else if(temp.priority>=35 && temp.priority<75)
								prio2=prio2+2;
							else if(temp.priority>=75)
								prio2=prio2+3;	
						}
						temp=temp.next;
					}
					System.out.println("Prio 2 = "+prio2);
					}
					else if(nfr2.compareTo(compselect)==0) {
						while(temp!=null) {
							if(temp.id.compareTo(nfr1)==0) {
								if(temp.priority>0 && temp.priority<35)
									prio2=prio2+1;
								else if(temp.priority>=35 && temp.priority<75)
									prio2=prio2+2;
								else if(temp.priority>=75)
									prio2=prio2+3;	
							}
							temp=temp.next;
						}
						}
				}
				temp=nfrroot;
				while(temp!=null) {
					if(temp.id.compareTo(compselect)==0) {
						if(temp.priority>0 && temp.priority<35)
							prio2=prio2+1;
						else if(temp.priority>=35 && temp.priority<75)
							prio2=prio2+2;
						else if(temp.priority>=75)
							prio2=prio2+3;	
					}
					temp=temp.next;
				}
			weight= (prio2)/(double)((double)6*((double)size3+(double)1));
			System.out.println("Priority weight 1= "+prio1+" Priority weight 2= "+prio2+" Count= "+size3+1);
			System.out.println("weight "+weight);
			System.out.println("sumnfnf= "+sumnfnf);
			sumnfnf=sumnfnf*weight;
			sumnfnf= (double)(sumnfnf-(double)size3)/(double)((double)((double)100*(double)size3)-(double)size3);
			System.out.println("sumnfnf= "+sumnfnf);
			//double sumnfnfnormal= (double)(sumnfnf-(double)1)/(double)((double)100-(double)1);
			riskmeasure.append("NFR-NFR Impact");
			riskmeasure.append("\n");
			text="Impact is "+sumnfnf;
			riskmeasure.append(text);
			riskmeasure.append("\n");
			//Count total edges
			int edgecount=0;
			Edge1 root=frfrroot;
			while(root!=null) {
				edgecount++;
				root=root.next;
			}
			root=frnfrroot;
			while(root!=null) {
				edgecount++;
				root=root.next;
			}
			root=nfrnfrroot;
			while(root!=null) {
				edgecount++;
				root=root.next;
			}
			int affectededgecount=size2+size3;
			prob=(double)(affectededgecount)/(double)(edgecount);
			impact=(double)(sumfnf+sumnfnf);
			double risk= prob * impact;
			System.out.println("Affected edge count "+affectededgecount+" \n Probability= "+prob+" \n Total Impact= "+impact+" \n Risk ="+risk);
			//text="Maximum Impact is "+impact;
			//riskmeasure.append(text);
			//riskmeasure.append("\n");
			text=" Maximum Risk is "+risk;
			riskmeasure.append(text);
			riskmeasure.append("\n");
		}
		String text="";
		if(prob>=0 && prob<=0.2) {
			text=" Risk Probability is Low. ";
		}
		else if(prob>0.2 && prob<=0.4) {
			text=" Risk Probability is Moderate. ";
		}
		else if(prob>0.4 && prob<=0.6) {
			text=" Risk Probability is Significant. ";
		}
		else if(prob>0.6 && prob<=0.8) {
			text=" Risk Probability is Major. ";
		}
		else if(prob>0.8) {
			text=" Risk Probability is High. ";
		}
		if(impact>=0 && impact<=0.2) {
			text=text+" Risk Impact is Low. ";
		}
		else if(impact>0.2 && impact<=0.4) {
			text=text+" Risk Impact is Moderate. ";
		}
		else if(impact>0.4 && impact<=0.6) {
			text=text+" Risk Impact is Significant. ";
		}
		else if(impact>0.6 && impact<=0.8) {
			text=text+" Risk Impact is Major. ";
		}
		else if(impact>0.8) {
			text=text+" Risk impact is High. ";
		}
		riskmeasure.append(text);
		riskmeasure.append("\n");
	}
	public static void createframe()
	{
	      mainframe.setSize(1100, 800);
	      Icon icon = new ImageIcon("C:\\Users\\refresh.png");
	      Image image = ((ImageIcon) icon).getImage(); // transform it 
	      Image newimg = image.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH); 
	      icon = new ImageIcon(newimg); 
	      Icon icon2 = new ImageIcon("caroicon.png");
	      Image image2 = ((ImageIcon) icon2).getImage();
	      mainframe.setIconImage(image2);
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
