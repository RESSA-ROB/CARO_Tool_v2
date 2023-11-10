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
    int flag;
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
    int prevsatisfaction;
    double impact;
    int flag;
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
class PO
{
    String id1;
    String id2;
    int visited;
    PO next;
}
class POGraph { 
    
    public final int V; 
    public final List<List<Integer>> adj; 
  
    public POGraph(int V)  
    { 
        this.V = V; 
        adj = new ArrayList<>(V); 
          
        for (int i = 0; i < V; i++) 
            adj.add(new LinkedList<>()); 
    } 
      
    // This function is a variation of DFSUtil() in  
    // https://www.geeksforgeeks.org/archives/18212 
   public boolean isCyclicUtil(int i, boolean[] visited, 
                                      boolean[] recStack)  
    { 
          
        // Mark the current node as visited and 
        // part of recursion stack 
        if (recStack[i]) 
            return true; 
  
        if (visited[i]) 
            return false; 
              
        visited[i] = true; 
  
        recStack[i] = true; 
        List<Integer> children = adj.get(i); 
          
        for (Integer c: children) 
            if (isCyclicUtil(c, visited, recStack)) 
                return true; 
                  
        recStack[i] = false; 
  
        return false; 
    } 
  
    public void addEdge(int source, int dest) { 
        adj.get(source).add(dest); 
    } 
  
    // Returns true if the graph contains a  
    // cycle, else false. 
    // This function is a variation of DFS() in  
    // https://www.geeksforgeeks.org/archives/18212 
    public boolean isCyclic()  
    { 
          
        // Mark all the vertices as not visited and 
        // not part of recursion stack 
        boolean[] visited = new boolean[V]; 
        boolean[] recStack = new boolean[V]; 
          
          
        // Call the recursive helper function to 
        // detect cycle in different DFS trees 
        for (int i = 0; i < V; i++) 
            if (isCyclicUtil(i, visited, recStack)) 
                return true; 
  
        return false; 
    } 
}
class GFG{
	   
static int X;
//static final int Z = 2;
 
// Function to find if there is a
// path between two vertices in a
// directed graph
static boolean existPath(int V, int edges[][],
                         int u, int v,int num)
{
	X=num;
     
    // mat matrix
    boolean [][]mat = new boolean[V][V];
 
    // set mat[i][j]=true if there is
    // edge between i to j
    for (int i = 0; i < X; i++)
        mat[edges[i][0]][edges[i][1]] = true;
 
    // Check for all intermediate vertex
    for(int k = 0; k < V; k++) 
    {
        for(int i = 0; i < V; i++) 
        {
            for(int j = 0; j < V; j++)
            {
                mat[i][j] = mat[i][j] || 
                            mat[i][k] &&
                            mat[k][j];
            }
        }
    }
 
    // If vertex is invalid
    if (u >= V || v >= V)
    {
        return false;
    }
 
    // If there is a path
    if (mat[u][v])
        return true;
    return false;
}
}
class sNode
{
    String id;
    int visited;
    int flag;
    sNode next;
    sNode prev;
    
    sNode() {
        this.flag = 0;
    }
}
class plist
{
    int name;
    sNode begin;
    double val;
    double extra;
    double extra2;
    plist next;
    
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
	static JLabel label13=new JLabel("Risk Assessment");
	static JLabel label14= new JLabel("NFR Priority");
	static JLabel labeliteration=new JLabel("Iteration Count");
	static JButton btn1 = new JButton("Add Relations");
	static JButton btn2 = new JButton("Generate PO");
	static JButton btn3 = new JButton("View Dashboard");
	static JButton btn4 = new JButton("Set Project Parameters");
	static JButton btn5 = new JButton("Load Config");
	static JButton btn6 = new JButton("Save Config");
	static JButton button7;
	static JButton btn8= new JButton("Save FR");
	static JButton btn9= new JButton("Save NFR");
	static JButton btn12= new JButton("Add Requirements");
	static JButton loadNFR=new JButton("Load FR/NFR");
	static JButton savePriority = new JButton("Save Priority");
	static JButton btn13= new JButton("Risk Assessment");
	static JButton set=new JButton("Set");
	static JButton RiskExpose=new JButton("Risk Exposure");
	static JButton  addFrozen=new JButton("ADD");
	static JButton delFrozen=new JButton("Delete");
	static JButton generate = new JButton("Generate Optimal PO");
	static JButton viewgraph = new JButton("View Optimal PO graph");
	static JButton generate2 = new JButton("Generate Alternate PO");
	static JButton viewgraph2 = new JButton("View Alternate PO graph");
	static JButton viewrequirements=new JButton("View Requirements");
	static JButton next_iteration=new JButton("Next Iteration");
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
	static JTextArea riskmitigation=new JTextArea(100, 100);
	static JTextArea nfrpriority=new JTextArea(20,20);
	static JTextArea  frozenFRs=new JTextArea(20,20);
	static JTextArea textOrder1=new JTextArea(100, 200);
	static JTextArea iteration_area=new JTextArea(10,10);
	static JScrollPane scrollpane1=new JScrollPane(textOrder1);
	static int loaddata=0;
    static int countfr=0, countnfr=0;
    static JTable frnfr=new JTable();
    static JTable NFR_priority;
    static Edge1 E_FN=null;
    static Edge1 E_NN=null;
    static Edge2 E_FF=null;
    static Edge1 nfrnfrroot=null, nfrnfrroot2=null;
    static Edge1 frnfrroot=null, frnfrroot2=null;
    static Edge1 frfrroot=null, frfrroot2=null;
    static Node frroot=null, frroot2=null;
    static Node nfrroot=null, nfrroot2=null;
    static Node frchangeroot=null;
    static Node nfrchangeroot=null;
    static Node LNFR1;
    static Node LNFR2;
    static int flag=1;
    static Node NFR=null;
    static Node FR=null;
    static Node g, frhead;
    static Node Fro=null;
    static BC bcHead=null, bcHead2=null;
    static MC mcHead=null, mcHead2=null;
    static Rpair root=null, pairroot=null;
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
	static int iteration_count;
	static int total_change=0;
	static int frchange=0;
	static int nfrchange=0;
	static PO proot2;
    static plist rlist,rlist2,rootOp,rootFRo;
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
		                			String fname="Iteration"+iteration_count+"\\"+"FR.txt";
		                			File f1=new File(fname);
		                			checkflag=0;
		                			if(f1.exists()) {
		                				fname="Iteration"+iteration_count+"\\"+"FR.txt";
		                				FileReader fread1=new FileReader(fname);
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
		                					fname="Iteration"+iteration_count+"\\"+"FR.txt";
		                					FileWriter fw1 = new FileWriter(fname, true); 
			                				BufferedWriter bw1 = new BufferedWriter(fw1);
			                				bw1.write(fr1+" "+fr2);
			                				bw1.newLine();
			                				//System.out.println(fr1+" "+fr2);
			                				bw1.close();
			                				fw1.close();
		                				}
		                			}
		                			else {
		                				fname="Iteration"+iteration_count+"\\"+"FR.txt";
		                				FileWriter fw1 = new FileWriter(fname, true); 
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
			                			String fname="Iteration"+iteration_count+"\\"+"NFR.txt";
			                			File f1=new File(fname);
			                			
			                			if(f1.exists()) {
			                				checkflag=0;
			                				fname="Iteration"+iteration_count+"\\"+"NFR.txt";
			                				FileReader fread= new FileReader(fname);
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
			                	    			while((readc=fread.read())!=32) {
			                	    				if(readc>=48 && readc<=57) {
			                							c=(char)readc;
			                		    				temp=temp.concat(Character.toString(c));
			                	    				}
			                					}
			                	    			tempnode.priority=Integer.valueOf(temp);
			                	    			temp="";
			                	    			while((readc=fread.read())!=10) {
			                	    				if(readc>=48 && readc<=57) {
			                							c=(char)readc;
			                		    				temp=temp.concat(Character.toString(c));
			                	    				}
			                	    			}
			                	    			tempnode.satisfaction=Integer.valueOf(temp);
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
			                					fname="Iteration"+iteration_count+"\\"+"NFR.txt";
			                					FileWriter fw1 = new FileWriter(fname, true); 
				                				BufferedWriter bw1 = new BufferedWriter(fw1);
				                				bw1.write(nfr1+" "+nfr2+" "+nfr3+" "+0);
				                				bw1.newLine();
				                				//System.out.println(nfr1+" "+nfr2);
				                				bw1.close();
				                				fw1.close();
			                				}
			                				else if(checkflag==1) {
			                					troot=nfrroot;
			                					fname="Iteration"+iteration_count+"\\"+"NFR.txt";
			                					FileWriter fw1 = new FileWriter(fname, false); 
				                				BufferedWriter bw1 = new BufferedWriter(fw1);
			                					while(troot!=null) {
			                						bw1.write(troot.id+" "+troot.description+" "+troot.priority+" "+troot.satisfaction);
					                				bw1.newLine();
					                				troot=troot.next;
			                					}
			                					bw1.close();
				                				fw1.close();
			                					JOptionPane.showMessageDialog(panel6, "Data updated.");
			                				}
			                				
			                				
			                			}
			                			else {
			                				fname="Iteration"+iteration_count+"\\"+"NFR.txt";
			                				FileWriter fw1 = new FileWriter(fname, true); 
			                				BufferedWriter bw1 = new BufferedWriter(fw1);
			                				bw1.write(nfr1+" "+nfr2+" "+nfr3+" "+0);
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
		String fname="Iteration"+iteration_count+"\\"+"FR.txt";
		File f1=new File(fname);
		System.out.println("File name = "+fname);
		String fname2="Iteration"+iteration_count+"\\"+"NFR.txt";
		System.out.println("File name = "+fname2);
		File f2=new File(fname2);
		Node fr=null;
		Node nfr=null;
		int flag1=1, flag2=1;
		if(!f1.exists() && !f2.exists()) {
			JOptionPane.showMessageDialog(panel6, "FR and NFR data does not exists!");
			flag1=0;
			flag2=0;
		}
		else if (!f1.exists()) {
			JOptionPane.showMessageDialog(panel6, "FR data does not exists!");
			flag1=0;
		}
		else if(!f2.exists()) {
			JOptionPane.showMessageDialog(panel6, "NFR data does not exists!");
			flag2=0;
		}
			int readc=0;
			char c;
			String temp="";
			try {
			if(flag1==1) {
			fname="Iteration"+iteration_count+"\\"+"FR.txt";
			FileReader fread1= new FileReader(fname);
		
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
			fname="Iteration"+iteration_count+"\\"+"NFR.txt";
			FileReader fread2= new FileReader(fname);
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
	                	String fname="Iteration"+iteration_count+"\\"+"FRFR.txt";
	                	frfrroot=null;
	                	System.out.println("File name = "+fname);
	                	File f1=new File(fname);
	                	 FileReader fread= new FileReader(fname);
	             			
	                	if(f1.exists()) {
	            
		   	                //create_list();
		   	                int cflag=0;
		   	               
		        			int readc=0;
		        			String temp="";
		        			char c;
		        			
		        			
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
		        			Edge1 temproot=frfrroot;
		        			while(temproot!=null) {
		        				System.out.println("id1 = "+temproot.id1+" id2= "+temproot.id2);
		        				if(temproot.id1.compareTo(fr1)==0 && temproot.id2.compareTo(fr2)==0) {
		        					temproot.type=frtype;
		        					temproot.value=Integer.valueOf(frdegree);
		        					cflag=1;
		        				}
		        				temproot=temproot.next;
		        			}
		        			System.out.println("cflag= "+cflag);
		        			FileWriter fw1 = new FileWriter(fname, false); 
		   	                BufferedWriter bw1 = new BufferedWriter(fw1);
		        			temproot=frfrroot;
		        			while(temproot!=null) {
		        			    bw1.write(temproot.id1+" "+temproot.id2+" "+temproot.type+" "+temproot.value);
			   	                bw1.newLine();
		        				temproot=temproot.next;
		        			}
		        			if(cflag==0) {
		        			      bw1.write(fr1+" "+fr2+" "+frtype+" "+frdegree);
		  	   	                	bw1.newLine();
		        			}
		        			bw1.close();
		   	                fw1.close();
	                	}
	                	else {
	                		FileWriter fw1 = new FileWriter(fname, false); 
		   	                BufferedWriter bw1 = new BufferedWriter(fw1);
	                	fw1 = new FileWriter(fname, true); 
		   	            bw1 = new BufferedWriter(fw1);
	   	                bw1.write(fr1+" "+fr2+" "+frtype+" "+frdegree);
	   	                bw1.newLine();
	   	                bw1.close();
	   	                fw1.close();
	                	}
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
	                	String fname="Iteration"+iteration_count+"\\"+"FRNFR.txt";
	                	frnfrroot=null;
	                	System.out.println("File name = "+fname);
	                	File f1=new File(fname);
	                	 FileReader fread= new FileReader(fname);
	             			
	                	if(f1.exists()) {
	                		System.out.println("File Exists");
		   	                //create_list();
		   	                int cflag=0;
		   	               
		        			int readc=0;
		        			String temp="";
		        			char c;
		        			
		        			
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
		        					while((readc=fread.read())!=10) {
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
		        			Edge1 temproot=frnfrroot;
		        			while(temproot!=null) {
		        				System.out.println("id1 = "+temproot.id1+" id2= "+temproot.id2);
		        				if(temproot.id1.compareTo(fr1)==0 && temproot.id2.compareTo(fr2)==0) {
		        					temproot.value=Integer.valueOf(frnfrdegree);
		        					cflag=1;
		        				}
		        				temproot=temproot.next;
		        			}
		        			System.out.println("cflag= "+cflag);
		        			FileWriter fw1 = new FileWriter(fname, false); 
		   	                BufferedWriter bw1 = new BufferedWriter(fw1);
		        			temproot=frnfrroot;
		        			while(temproot!=null) {
		        			    bw1.write(temproot.id1+" "+temproot.id2+" "+temproot.value);
			   	                bw1.newLine();
		        				temproot=temproot.next;
		        			}
		        			if(cflag==0) {
		        			      bw1.write(fr1+" "+fr2+" "+frnfrdegree);
		  	   	                	bw1.newLine();
		        			}
		        			bw1.close();
		   	                fw1.close();
	                	}
	                	else {
	                		FileWriter fw1 = new FileWriter(fname, false); 
		   	                BufferedWriter bw1 = new BufferedWriter(fw1);
		   	                fw1 = new FileWriter(fname, true); 
		   	                bw1 = new BufferedWriter(fw1);
		   	                bw1.write(fr1+" "+fr2+" "+frnfrdegree);
		   	                bw1.newLine();
		   	                bw1.close();
		   	                fw1.close();
	                	}
	                	System.out.println("Done");
	   	                compute_NFRsatisfaction();
	                }
	                else {
	                	JOptionPane.showMessageDialog(panel6, "Enter a valid FR-NFR degree!");
	                }
	             
	                System.out.println("Done2");
            	}catch(Exception e3) {
            		System.out.println("File not found!!!");
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
        //panel1.add(nfrnfrdegree);
        degree3.setBounds(500, 550, 40, 40);
        degree3.setToolTipText("Add value between 1 - 100");
       degree3.setBackground(new Color(204, 204, 204));
       // panel1.add(degree3);
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
	                //String nfrnfrdegree= degree3.getText(); 
	                //int degreeval=Integer.valueOf(nfrnfrdegree);
	                String fname="Iteration"+iteration_count+"\\"+"NFRNFR.txt";
                	nfrnfrroot=null;
                	//System.out.println("File name = "+fname);
                	File f1=new File(fname);
                	 FileReader fread= new FileReader(fname);
             			
                	if(f1.exists()) {
                		System.out.println("File Exists");
	   	                //create_list();
	   	                int cflag=0;
	   	               
	        			int readc=0;
	        			String temp="";
	        			char c;
	        			
	        			
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
	        				
	        					while((readc=fread.read())!=10) {
	        						
	        					}
	        					
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
	        			Edge1 temproot=nfrnfrroot;
	        			while(temproot!=null) {
	        				System.out.println("id1 = "+temproot.id1+" id2= "+temproot.id2);
	        				if(temproot.id1.compareTo(fr1)==0 && temproot.id2.compareTo(fr2)==0) {
	        					
	        					cflag=1;
	        				}
	        				temproot=temproot.next;
	        			}
	        			System.out.println("cflag= "+cflag);
	        			FileWriter fw1 = new FileWriter(fname, false); 
	   	                BufferedWriter bw1 = new BufferedWriter(fw1);
	        			temproot=nfrnfrroot;
	        			while(temproot!=null) {
	        			    bw1.write(temproot.id1+" "+temproot.id2+" ");
		   	                bw1.newLine();
	        				temproot=temproot.next;
	        			}
	        			if(cflag==0) {
	        			      bw1.write(fr1+" "+fr2+" ");
	  	   	                	bw1.newLine();
	        			}
	        			bw1.close();
	   	                fw1.close();
                	}
                	else {
                		FileWriter fw1 = new FileWriter(fname, false); 
	   	                BufferedWriter bw1 = new BufferedWriter(fw1);
	   	                fw1 = new FileWriter(fname, true); 
	   	                bw1 = new BufferedWriter(fw1);
	   	                bw1.write(fr1+" "+fr2+" ");
	   	                bw1.newLine();
	   	                bw1.close();
	   	                fw1.close();
                	}
	               compute_NFRconflict();
	             
	                
            	}catch(Exception e3) {
            		System.out.println("File not found!");
            	}
            }
        });
		
	}
	public static void compute_NFRconflict() {
        String fname="Iteration"+iteration_count+"\\"+"NFRNFR.txt";
    	nfrnfrroot=null;
    	try {
    	 FileReader fread= new FileReader(fname);
			int readc=0;
			String temp="";
			char c;
			
			
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
				
					while((readc=fread.read())!=10) {
						
					}
					
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
			System.out.println("Done");
			nfrroot=null;
			fname="Iteration"+iteration_count+"\\"+"NFR.txt";
			fread= new FileReader(fname);
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
					c=(char)readc;
					temp=temp.concat(Character.toString(c));
				}
				tempnode.description=temp;
				temp="";
				while((readc=fread.read())!=32) {
					if(readc>=48 && readc<=57) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
					}
				}
				tempnode.priority=Integer.valueOf(temp);
				temp="";
				while((readc=fread.read())!=10) {
					if(readc>=48 && readc<=57) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
					}
				}
				tempnode.satisfaction=Integer.valueOf(temp);
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
			System.out.println("Done2");
			Edge1 j=nfrnfrroot;
			while(j!=null) {
				int val1=0;
				int val2=0;
				Node t=nfrroot;
				while(t!=null) {
					if(t.id.compareTo(j.id1)==0)
						val1=t.satisfaction;
					else if(t.id.compareTo(j.id2)==0)
						val2=t.satisfaction;
					t=t.next;
				}
				int degree=(100-val1)+(100-val2);
				//System.out.println("j.id1= "+j.id1+"val= "+val1);
				//System.out.println("j.id2= "+j.id2+"val= "+val2);
				//System.out.println("Degree= "+degree);
				if(degree>100)
					degree=100;
				j.value=degree;
				j=j.next;
			}
			fname="Iteration"+iteration_count+"\\"+"NFRNFR.txt";
			FileWriter fw1 = new FileWriter(fname, false); 
             BufferedWriter bw1 = new BufferedWriter(fw1);
			Edge1 temproot=nfrnfrroot;
			while(temproot!=null) {
			    bw1.write(temproot.id1+" "+temproot.id2+" "+temproot.value);
	                bw1.newLine();
				temproot=temproot.next;
			}
			bw1.close();
			fw1.close();
    	}catch(IOException er3) {
    		System.out.println("Errorr");
    	}
    	
	}
	public static void compute_NFRsatisfaction() {
		//NFR List Creation
		nfrroot=null;
		try {
			String fname="Iteration"+iteration_count+"\\"+"NFR.txt";
		FileReader fread= new FileReader(fname);
		int readc=0;
		String temp="";
		char c;
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
			while((readc=fread.read())!=32) {
				if(readc>=48 && readc<=57) {
					c=(char)readc;
    				temp=temp.concat(Character.toString(c));
				}
			}
			tempnode.priority=Integer.valueOf(temp);
			temp="";
			while((readc=fread.read())!=10) {
				if(readc>=48 && readc<=57) {
					c=(char)readc;
    				temp=temp.concat(Character.toString(c));
				}
			}
			tempnode.satisfaction=Integer.valueOf(temp);
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
		//FRNFR List Creation
		frnfrroot=null;
		fname="Iteration"+iteration_count+"\\"+"FRNFR.txt";
		fread= new FileReader(fname);
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
			if(sum1>100) {
				j.prevsatisfaction=j.satisfaction;
				j.satisfaction=100;
			}
			else {
				j.prevsatisfaction=j.satisfaction;
				j.satisfaction=sum1;
			}
			j=j.next;
		}
		fname="Iteration"+iteration_count+"\\"+"NFR.txt";
		FileWriter fw1 = new FileWriter(fname,false); 
		BufferedWriter bw1 = new BufferedWriter(fw1);
		j=nfrroot;
		while(j!=null) {
			bw1.write(j.id+" "+j.description+" "+j.priority+" "+j.satisfaction);
			bw1.newLine();
			j=j.next;
		}
		bw1.close();
		fw1.close();
		}catch(IOException er) {
			System.out.println("Error in File Reading!");
		}
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
				String fname="Iteration"+iteration_count+"\\"+"FR.txt";
				FileReader fread= new FileReader(fname);
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
	    	  System.out.println("File FR.txt not found in panel2!");
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
	          		String fname="Iteration"+iteration_count+"\\"+"Frozen.txt";
	          	File f1=new File(fname);
	          	Fro=null;
	          	int checkflag=0;
	          	if(f1.exists()) {
	          		System.out.println("File exists!");
	          		try {
	          			fname="Iteration"+iteration_count+"\\"+"Frozen.txt";
	          			FileReader fread=new FileReader(fname);
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
	    				fname="Iteration"+iteration_count+"\\"+"Frozen.txt";
	    					FileWriter fw1 = new FileWriter(fname, false); 
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
	              	fname="Iteration"+iteration_count+"\\"+"Frozen.txt";
	              	FileWriter fw1 = new FileWriter(fname, true); 
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
	            		String fname="Iteration"+iteration_count+"\\"+"FR.txt";
	        			FileReader fread= new FileReader(fname);
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
	        			fname="Iteration"+iteration_count+"\\"+"NFR.txt";
	        			fread= new FileReader(fname);
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
	            			while((readc=fread.read())!=32) {
	            				if(readc>=48 && readc<=57) {
	        						c=(char)readc;
	        						if(readc>=48 && readc<=57)
	        							temp=temp.concat(Character.toString(c));
	            				}
	        				}
	            			tempnode.priority=Integer.valueOf(temp);
	            			while((readc=fread.read())!=10) {
	        				}
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
	        			fname="Iteration"+iteration_count+"\\"+"FRFR.txt";
	        			fread= new FileReader(fname);
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
	        			fname="Iteration"+iteration_count+"\\"+"FRNFR.txt";
	        			fread= new FileReader(fname);
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
	        			fname="Iteration"+iteration_count+"\\"+"NFRNFR.txt";
	        			fread= new FileReader(fname);
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
	    		String fname="Iteration"+iteration_count+"\\"+"Parameter.txt";
	    	FileWriter fw1 = new FileWriter(fname, false); 
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
	  
       RiskExpose.setBounds(50, 80, 200, 40);
       RiskExpose.setFont(new Font("Calibri", 2, 16));
       RiskExpose.setBackground(new Color(120, 168, 252));
       RiskExpose.setForeground(Color.black);
       RiskExpose.setToolTipText("Click to view risk identified");
       RiskExpose.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
       panel7.add(RiskExpose);
       JLabel j1= new JLabel("Risk Exposure");
       j1.setBounds(300,80 ,100 ,20 );
       panel7.add(j1);
       JScrollPane sp2 = new JScrollPane(riskexpose);       
       sp2.setBounds(300,120, 550,130);
       sp2.setBackground(new Color(204, 204, 204));
        sp2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel7.add(sp2);
        riskexpose.setEditable(false);
        RiskExpose.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e){
	    		 find_changeCount();
	    	}
     });
        
	  JButton risk1= new JButton("Risk Measurement");
	  risk1.setBounds(50, 270, 200, 40);
	  risk1.setFont(new Font("Calibri", 2, 16));
      risk1.setBackground(new Color(120, 168, 252));
      risk1.setForeground(Color.black);
      risk1.setToolTipText("Click to measure Risks");
      risk1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      panel7.add(risk1);
      risk1.addActionListener(new ActionListener() {
	        @Override
	         public void actionPerformed(final ActionEvent e) {
	        	calculate_risk();
	        	create_riskgraph();
	        }
      });
      
       JLabel j2= new JLabel("Risk Measure");
       j2.setBounds(300,270 ,100 ,20 );
       panel7.add(j2);
       JScrollPane sp3 = new JScrollPane(riskmeasure);       
       sp3.setBounds(300,310, 550,130);
       sp3.setBackground(new Color(204, 204, 204));
        sp3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel7.add(sp3);
       riskmeasure.setEditable(false);

       JButton risk2= new JButton("Risk Mitigation");
 	  risk2.setBounds(50, 450, 200, 40);
 	  risk2.setFont(new Font("Calibri", 2, 16));
       risk2.setBackground(new Color(120, 168, 252));
       risk2.setForeground(Color.black);
       risk2.setToolTipText("Click to view risk mitigation strategy");
       risk2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
       panel7.add(risk2);
       risk2.addActionListener(new ActionListener() {
 	        @Override
 	         public void actionPerformed(final ActionEvent e) {
 	        	int change_case=determine_change_case();
 	        	int change_sub_case=0;
 	        	System.out.println("Change Case is "+change_case);
 	        	if(change_case==1) {
 	        		change_sub_case=determine_FR_change_subcase();
 	        		if(change_sub_case==1 || change_sub_case==2 || change_sub_case==3) {
 	        			determine_change_order();
 	        		}
 	        	}
 	        	else if(change_case==2){
 	        		int flag=check_conflict();
 	        	}
 	        	else if(change_case==3){
 	        		change_sub_case=determine_FRNFR_change_subcase();
 	        		System.out.println("Change sub Case is "+change_sub_case);
 	        		determine_change_order();
 	        	}
 	        }
       });
       
        JLabel j3= new JLabel("Risk Mitigation Order");
        j3.setBounds(300,450 ,300 ,20 );
        panel7.add(j3);
        JScrollPane sp4 = new JScrollPane(riskmitigation);       
        sp4.setBounds(300,490, 550,130);
        sp4.setBackground(new Color(204, 204, 204));
         sp4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
         panel7.add(sp4);
        riskmitigation.setEditable(false);
	}
	public static int determine_change_case() { // Function to determine change case type based on Figure.
		int change_case=0;
		if(frchange>0 && nfrchange==0) {
			change_case=1;
		}
		else if(nfrchange>0 && frchange==0)
		{
			change_case=2;
		}
		else if(frchange>0 && nfrchange>0) {
			change_case=3;
		}
		return change_case;
	}
	public static int determine_FR_change_subcase() { // Function to determine FR change sub-case type based on Figure.
		int change_sub_case=0;
		Node t1=frchangeroot;
		int flag1=0;
		int aflag=0;
		int sflag=0;
		while(t1!=null) {
			int allflag=0;
			Edge1 frfr_list[][]=new Edge1[1000][1000];
			int sizer=0;
			Edge1 k1=frfrroot;
			while(k1!=null) {
				if(k1.id1.compareTo(t1.id)==0) {
					Edge1 node=new Edge1();
					node.id1=k1.id1;
					node.id2=k1.id2;
					node.next=null;
					frfr_list[sizer][0]=node;
				}
				k1=k1.next;
			}
			int flagexit=1;
			int sizetemp=0;
			while(flagexit==1) {
				flagexit=0;
				//System.out.println(size);
				sizetemp=sizer;
				for(int j=0; j<sizer; j++) {
					//Extract the last element
					int last=0;
					for(int m=0;m<cn;m++) {
						if(frfr_list[j][m]==null) {
							last=m-1;
							break;
						}
					}
				//	System.out.println("Last=" +last);
					int count=0;
					String comp="";
					if(last!=-1) {
						comp=frfr_list[j][last].id2;
					//System.out.println("Comp= "+comp);
					Edge1 pointer=frfrroot;
					while(pointer!=null) {
						if(pointer.id1.compareTo(comp)==0) {
								count++;
								flagexit=1;
								Edge1 temp=new Edge1();
								temp.id1=pointer.id1;
								temp.id2=pointer.id2;
								temp.value=pointer.value;
								temp.type=pointer.type;
								//temp.prob=(double)((double)pointer.value/(double)100);
								
								if(count==1) {
									//System.out.println("Inserted");
									frfr_list[j][last+1]=temp;
								}
								else {
									int insert=0;
									for(int m=0;m<1000;m++) {
										if(prop_list[j][m]!=null) {
											Edge1 temp2=new Edge1();
											temp2.id1=frfr_list[j][m].id1;
											temp2.id2=frfr_list[j][m].id2;
											temp2.type=frfr_list[j][m].type;
											temp2.value=frfr_list[j][m].value;
											temp2.prob=frfr_list[j][m].prob;
										
											frfr_list[sizetemp][m]=temp2;
										}
										else {
											insert=m;
											break;
										}
										
									}
									frfr_list[sizetemp][insert-1]=temp;
									sizetemp++;
								}
								
							
						}
						
						pointer=pointer.next;
					//	break;
					}
					
					}
					
					//break;
				}
				sizer=sizetemp;
		
			}
			//Now check for other FRs
			Node t2=t1.next;
			while(t2!=null) {
				for(int i=0;i<sizer;i++) {
					for(int j=0; j<1000; j++) {
						if(frfr_list[i][j]!=null) {
							if(frfr_list[i][j].id1.compareTo(t2.id)==0 || frfr_list[i][j].id2.compareTo(t2.id)==0)
								allflag++;
						}
					}
				}
				t2=t2.next;
			}
			if(allflag==(frchange-1))
				aflag=1;
			else if(allflag>0)
				sflag=1;
			t1=t1.next;
		}
		if(aflag==1) // Case where all FRs are logically related.
			change_sub_case=1;
		//Check is every pair of FR has a common NFR
		t1=frchangeroot;
		int s2flag=0;
		int acount=0;
		while(t1!=null) {
			int flag=0;
			String v1=t1.id;
			Node t2=t1.next;
			while(t2!=null) {
				String v2=t2.id;
				//Now check if they have a common NFR
				Edge1 k1=frnfrroot;
				while(k1!=null) {
					if(k1.id1.compareTo(v1)==0) {
						Edge1 k2=frnfrroot;
						while(k2!=null) {
							if(k2.id1.compareTo(v2)==0) {
								if(k1.id2.compareTo(k2.id2)==0)
									flag=1;
							}
							k2=k2.next;
						}
					}
					k1=k1.next;
				}
				t2=t2.next;
			}
			if(flag==1)
				acount++;
			t1=t1.next;
		}
		if(acount>=1)
			s2flag=1;
		if(s2flag==1)
			change_sub_case=2;
		if(aflag==1 && s2flag==1)
			change_sub_case=3;
		if(aflag==0 && s2flag==0)
			change_sub_case=4;
		return change_sub_case;
	}
	public static int check_conflict() {
		int flag=0;
		int count=0;
		Node t1=nfrchangeroot;
		while(t1!=null) {
			Node t2=t1.next;
			while(t2!=null) {
			Edge1 k1=nfrnfrroot;
			while(k1!=null) {
				if(k1.id1.compareTo(t1.id)==0 && k1.id2.compareTo(t2.id)==0)
					count++;
				if(k1.id1.compareTo(t2.id)==0 && k1.id2.compareTo(t1.id)==0)
					count++;
				k1=k1.next;
			}
			t2=t2.next;
			}
			t1=t1.next;
		}
		if(count>0 && count<=nfrchange-1)
			flag=1;
		return flag;
	}
	public static int determine_FRNFR_change_subcase() {
		int change_sub_case=0;
		int count=0;
		Node t1=frchangeroot;
		while(t1!=null) {
			Edge1 k1=frnfrroot;
			while(k1!=null) {
				if(k1.id1.compareTo(t1.id)==0) {
					Node t2=nfrchangeroot;
					while(t2!=null) {
						if(t2.id.compareTo(k1.id2)==0)
							count++;
						t2=t2.next;
					}
				}
				k1=k1.next;
			}
			t1=t1.next;
		}
		if(count>0)
			change_sub_case=1;
		return change_sub_case;
	}
	public static void determine_change_order() {
		create_list2();
		print_list2();
		create_basiccluster2();
		create_macrocluster2();
		create_requirementsset2();
		generate_changePO();
		remove_transitive();
        exist_path();
        setText();
        setOrderInFrame();
	}
	public static void print_list2() {
		Node t1=frroot2;
		System.out.println("Printing List 2");
		while(t1!=null) {
			System.out.println(t1.id);
			t1=t1.next;
		}
		System.out.println("End of printing");
	}
	//Function to create a requirement list consisting of ones undergoing changes and propagated
	public static void create_list2() { 
		try {
			//FR List Creation
			frroot2=null;
			String fname="Iteration"+iteration_count+"\\"+"FR.txt";
			FileReader fread= new FileReader(fname);
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
    			int flagc=0;
    			Node t1=frchangeroot;
    			while(t1!=null) {
    				if(t1.id.compareTo(temp)==0)
    					flagc=1;
    				t1=t1.next;
    			}
    			//System.out.println("Checking for "+temp);
    			for(int i=0; i<size; i++) {
    				for(int j=0; j<1000; j++) {
    					if(prop_list[i][j]!=null) {
    						//System.out.println("Compairing with "+prop_list[i][j].id1+" and "+prop_list[i][j].id2);
    						if(prop_list[i][j].id1.compareTo(temp)==0 || prop_list[i][j].id2.compareTo(temp)==0)
    							flagc=1;
    					}
    				}
    			}
    			if(flagc==1) {
    			Node tempnode=new Node();
    			tempnode.id=temp;
    			tempnode.next=null;
    			tempnode.impact=0;
    			if(frroot2==null)
    				frroot2=tempnode;
    			else {
    				Node k=frroot2;
    				while(k.next!=null)
    					k=k.next;
    				k.next=tempnode;
    			}
    			}
    			temp="";
    		}
			fread.close();
			//NFR List Creation
			nfrroot2=null;
			fname="Iteration"+iteration_count+"\\"+"NFR.txt";
			fread= new FileReader(fname);
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
    			while((readc=fread.read())!=32) {
    				if(readc>=48 && readc<=57) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
				}
    			tempnode.priority=Integer.valueOf(temp);
    			temp="";
    			while((readc=fread.read())!=10) {
    				if(readc>=48 && readc<=57) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
				}
    			tempnode.satisfaction=Integer.valueOf(temp);
    			
    			tempnode.next=null;
    			int flagc=0;
    			Node t1=nfrchangeroot;
    			while(t1!=null) {
    				if(t1.id.compareTo(temp)==0)
    					flagc=1;
    				t1=t1.next;
    			}
    			for(int i=0; i<size2; i++) {
    				if(prop_frnfrlist[i][0].id2.compareTo(tempnode.id)==0)
    							flagc=1;
    			}
    			for(int i=0; i<size3; i++) {
    				if(prop_nfrnfrlist[i][0].id1.compareTo(tempnode.id)==0 || prop_nfrnfrlist[i][0].id2.compareTo(tempnode.id)==0)
    							flagc=1;
    			}
    			if(flagc==1) {
    			if(nfrroot2==null)
    				nfrroot2=tempnode;
    			else {
    				Node k=nfrroot2;
    				while(k.next!=null)
    					k=k.next;
    				k.next=tempnode;
    			}
    			}
    			temp="";
    		}
			fread.close();
			//FRFR List Creation
			frfrroot2=null;
			fname="Iteration"+iteration_count+"\\"+"FRFR.txt";
			fread= new FileReader(fname);
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
					int flagc=0;
					for(int i=0; i<size; i++) {
	    				for(int j=0; j<1000; j++) {
	    					if(prop_list[i][j]!=null) {
	    						if(prop_list[i][j].id1.compareTo(tempnode.id1)==0 || prop_list[i][j].id2.compareTo(tempnode.id2)==0)
	    							flagc=1;
	    					}
	    				}
	    			}
					if(flagc==1) {
	    			if(frfrroot2==null)
	    				frfrroot2=tempnode;
	    			else {
	    				Edge1 k=frfrroot2;
	    				while(k.next!=null)
	    					k=k.next;
	    				k.next=tempnode;
	    			}
					}
	    			temp="";
				}
			fread.close();
			//FRNFR List Creation
			frnfrroot2=null;
			fname="Iteration"+iteration_count+"\\"+"FRNFR.txt";
			fread= new FileReader(fname);
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
					int flagc=0;
					for(int i=0; i<size2; i++) {
	    				if(prop_frnfrlist[i][0].id1.compareTo(tempnode.id1)==0 || prop_frnfrlist[i][0].id2.compareTo(tempnode.id2)==0)
	    							flagc=1;
	    			}
					if(flagc==1) {
	    			if(frnfrroot2==null)
	    				frnfrroot2=tempnode;
	    			else {
	    				Edge1 k=frnfrroot2;
	    				while(k.next!=null)
	    					k=k.next;
	    				k.next=tempnode;
	    			}
					}
	    			temp="";
				}
			fread.close();
		//NFRNFR List Creation
			nfrnfrroot2=null;
			fname="Iteration"+iteration_count+"\\"+"NFRNFR.txt";
			fread= new FileReader(fname);
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
					
					int flagc=1;
					
					for(int i=0; i<size3; i++) {
	    				if(prop_nfrnfrlist[i][0].id1.compareTo(tempnode.id1)==0 || prop_nfrnfrlist[i][0].id2.compareTo(tempnode.id2)==0)
	    							flagc=1;
	    			}
					if(flagc==1) {
	    			if(nfrnfrroot2==null)
	    				nfrnfrroot2=tempnode;
	    			else {
	    				Edge1 k=nfrnfrroot2;
	    				while(k.next!=null)
	    					k=k.next;
	    				k.next=tempnode;
	    			}
					}
	    			temp="";
				}
			fread.close();
		
		}catch(IOException e5) {
			
		}
	}
	public static void create_basiccluster2() {
		Node nfr = nfrroot2;
        bcHead2 = null;
        while (nfr != null) {
        	//System.out.println("Creating BC for NFR "+nfr.id);
            final BC temp = new BC();
            temp.Nid = nfr.id;
            Edge1 fn = frnfrroot2;
            FRDep flist = null;
            while (fn != null) {
                if (fn.id2.compareTo(nfr.id) == 0) {
                	//System.out.println("Found NFR "+fn.id2);
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
            if (bcHead2 == null) {
                bcHead2 = temp;
            }
            else {
                BC q;
                for (q = bcHead2; q.next != null; q = q.next) {}
                q.next = temp;
            }
            nfr = nfr.next;
        }
	}
	public static void create_macrocluster2() {
		Edge1 Nconflict = nfrnfrroot2;
        mcHead2 = null;
        while (Nconflict != null) {
            BC p = bcHead2;
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
            if (mcHead2 == null) {
                mcHead2 = temp;
            }
            else {
                MC r;
                for (r = mcHead2; r.next != null; r = r.next) {}
                r.next = temp;
            }
            Nconflict = Nconflict.next;
        }
	}
	public static void create_requirementsset2() {
		pairroot = null;
        for (Node p = frroot2; p.next != null; p = p.next) {
            for (Node q = p.next; q != null; q = q.next) {
                final Rpair temp = new Rpair();
                temp.id1 = p.id;
                temp.id2 = q.id;
                temp.done = 0;
                temp.next = null;
                if (pairroot == null) {
                    pairroot = temp;
                }
                else {
                    Rpair s;
                    for (s = pairroot; s.next != null; s = s.next) {}
                    s.next = temp;
                }
            }
        }
	}
	public static void generate_changePO() {
		Node j=frroot2;
    	int co=0;
    	while(j!=null)
    	{
    		co++;
    		j=j.next;
    	}
        proot2 = null;
        for (Rpair point = pairroot; point != null; point = point.next) {
            Edge1 p = frfrroot2;
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
                if (proot2 == null) {
                    proot2 = temp;
                }
                else {
                    PO r;
                    for (r = proot2; r.next != null; r = r.next) {}
                    r.next = temp;
                }
            }
        }
        for (Rpair point = pairroot; point != null; point = point.next) {
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
                for (MC p2 = mcHead2; p2 != null; p2 = p2.next) {
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
                    case3(fr1, fr2);
                }
                else {
                    int rflag1 = 0;
                    int rflag2 = 0;
                    LNFR1 = null;
                    LNFR2 = null;
                    for (BC bcluster = bcHead2; bcluster != null; bcluster = bcluster.next) {
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
                    for (BC bcluster = bcHead2; bcluster != null; bcluster = bcluster.next) {
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
            for (PO u = proot2; u != null; u = u.next) {
                if (u.next == null) {
                    //System.out.println("added edge is : " + u.id1 + "->" + u.id2);
                    break;
                }
            }
            final int f = check_cycle();
            if (f == 1) {
                //System.out.println("Loop is formed");
                PO p3 = proot2;
                PO q3 = p3.next;
                if (q3 != null) {
                    while (q3.next != null) {
                        p3 = p3.next;
                        q3 = p3.next;
                    }
                    p3.next = null;
                }
            }
            for (PO v = proot2; v != null; v = v.next) {
                v.visited = 0;
            }
            
        }
     //   display_matrix(co);
	}
    public static void case3(final String fr1, final String fr2) {
    	matrix nnode=new matrix();
    	nnode.next=null;
    	matrix dnode=new matrix();
    	dnode.next=null;
        float max = 0.0f;
        String nfr1 = null;
        String nfr2 = null;
        int p2 = 0;
        int p3 = 0;
        int degree = 0;
        for (MC p = mcHead2; p != null; p = p.next) {
            int flagmc1 = 0;
            int flagmc2 = 0;
            String N1 = null;
            String N2 = null;
            for (BC q = p.Blist; q != null; q = q.next) {
                for (FRDep r = q.begin; r != null; r = r.next) {
                    if (r.id.compareTo(fr1) == 0) {
                        flagmc1 = 1;
                    }
                    if (r.id.compareTo(fr2) == 0) {
                        flagmc2 = 1;
                    }
                }
            }
            if (flagmc1 == 1 && flagmc2 == 1) {
                BC q = p.Blist;
                N1 = q.Nid;
                q = q.next;
                N2 = q.Nid;
                //System.out.println("N1 and N2 are" + N1 + " " + N2);
                Edge1 conflict = nfrnfrroot2;
                
                while (conflict != null) {
                    if ((N1.compareTo(conflict.id1) == 0 && N2.compareTo(conflict.id2) == 0) || (N1.compareTo(conflict.id2) == 0 && N2.compareTo(conflict.id1) == 0)) {
                        degree = conflict.value;
                    }
                    conflict = conflict.next;
                }
              //  System.out.println("The degree is " + degree);
               
                for (Node k = nfrroot2; k != null; k = k.next) {
                    if (k.id.compareTo(N1) == 0) {
                        p2 = k.priority;
                    }
                    if (k.id.compareTo(N2) == 0) {
                        p3 = k.priority;
                    }
                }
                //System.out.println("p1 and p2 are" + p2 + " " + p3);
                final float product = (degree - 40) * ((p2 + p3) / 200.0f);
               // System.out.println("Product is" + product);
                if (max < product) {
                    max = product;
                    nfr1 = N1;
                    nfr2 = N2;
                }
            }
        }
        Scanner in = new Scanner(fr1).useDelimiter("[^0-9]+");
        int integer = in.nextInt();
        Scanner in2 = new Scanner(fr2).useDelimiter("[^0-9]+");
        int integer2 = in2.nextInt();
      double deg=((p2+p3)/2)*degree;
        double dep;
       // System.out.println("The NFRs are " + nfr1 + " " + nfr2);
        String maxNFR = null;
        String minNFR = null;
        int val1 = 0;
        int val2 = 0;
        for (Node t = nfrroot2; t != null; t = t.next) {
            if (t.id.compareTo(nfr1) == 0) {
                val1 = t.priority;
            }
            else if (t.id.compareTo(nfr2) == 0) {
                val2 = t.priority;
            }
        }
        if (val1 > val2) {
            maxNFR = nfr1;
            minNFR = nfr2;
        }
        else if (val1 < val2) {
            maxNFR = nfr2;
            minNFR = nfr1;
        }
        BC bclist = bcHead2;
        int flag1 = 0;
        int flag2 = 0;
        int v1 = 0;
        int v2 = 0;
        while (bclist != null) {
            flag1 = 0;
            flag2 = 0;
            if (maxNFR.compareTo(bclist.Nid) == 0) {
                for (FRDep flist = bclist.begin; flist != null; flist = flist.next) {
                    if (flist.id.compareTo(fr1) == 0) {
                        flag1 = 1;
                        v1 = flist.val;
                    }
                    else if (flist.id.compareTo(fr2) == 0) {
                        flag2 = 1;
                        v2 = flist.val;
                    }
                }
                break;
            }
            bclist = bclist.next;
        }
        final PO temp = new PO();
        if (flag1 == 1 && flag2 == 1) {
        	dep=Math.abs(v1-v2);
            if (v1 >= v2) {
            	if(v1==v2) {
     	    		
     		        if(integer>integer2) {
     		        	 nnode.row=integer;
     	                nnode.col=integer2;
     	                dnode.row=integer;
     	                dnode.col=integer2;
     		            temp.id1 = fr1;
     		            temp.id2 = fr2;
     		        }
     		        else {
     		            temp.id1 = fr2;
     		            temp.id2 = fr1;
     		           nnode.row=integer2;
     	                nnode.col=integer;
     	                dnode.row=integer2;
     	                dnode.col=integer;
     		        }
     	        }
            	else {
            		 nnode.row=integer;
                     nnode.col=integer2;
                     dnode.row=integer;
                     dnode.col=integer2;
                temp.id1 = fr1;
                temp.id2 = fr2;
            	}
                if(dep<=2)
                	dep=v1;
                else
                	dep=(double)((double)v1+(double)v2)/(double)2;
                nnode.val=deg;
                dnode.val=dep;
               
                //conflict_weight[integer-1][integer2-1]=deg;
                //dep_weight[integer-1][integer2-1]=dep;
                
            }
            else {
                temp.id1 = fr2;
                temp.id2 = fr1;
                if(dep<=2)
                	dep=v1;
                else
                	dep=(double)((double)v1+(double)v2)/(double)2;
                nnode.val=deg;
                dnode.val=dep;
                nnode.row=integer2;
                nnode.col=integer;
                dnode.row=integer2;
                dnode.col=integer;
                //conflict_weight[integer2-1][integer-1]=deg;
                //dep_weight[integer2-1][integer-1]=dep;

            }
        }
        else if (flag1 == 1) {
            temp.id1 = fr1;
            temp.id2 = fr2;
            bclist = bcHead2;
            int v=0;
             while (bclist != null) {
                 flag1 = 0;
                 flag2 = 0;
                 if (minNFR.compareTo(bclist.Nid) == 0) {
                     for (FRDep flist = bclist.begin; flist != null; flist = flist.next) {
                         if (flist.id.compareTo(fr2) == 0)
                             v = flist.val;
                        
                     }
                     break;
                 }
                 bclist = bclist.next;
             }
             dep=Math.abs(v1-v);
             if(dep<=2)
             {
            	 if(v1>v)
             	dep=v1;
            	 else
            		 dep=v;
             }
             	else
             	dep=(double)((double)v1+(double)v2)/(double)2;
             nnode.val=deg;
             dnode.val=dep;
             nnode.row=integer;
             nnode.col=integer2;
             dnode.row=integer;
             dnode.col=integer2;
            // conflict_weight[integer-1][integer2-1]=deg;
             //dep_weight[integer-1][integer2-1]=dep;
        }
        else if (flag2 == 1) {
            temp.id1 = fr2;
            temp.id2 = fr1;
            bclist = bcHead2;
            int v=0;
             while (bclist != null) {
                 flag1 = 0;
                 flag2 = 0;
                 if (minNFR.compareTo(bclist.Nid) == 0) {
                     for (FRDep flist = bclist.begin; flist != null; flist = flist.next) {
                         if (flist.id.compareTo(fr1) == 0)
                             v = flist.val;
                        
                     }
                     break;
                 }
                 bclist = bclist.next;
             }
             dep=Math.abs(v2-v);
             if(dep<=2)
             {
            	 if(v2>v)
             	dep=v2;
            	 else
            		 dep=v;
             }
             	else
             	dep=(double)((double)v+(double)v2)/(double)2;
             nnode.val=deg;
             dnode.val=dep;
             nnode.row=integer2;
             nnode.col=integer;
             dnode.row=integer2;
             dnode.col=integer;
            // conflict_weight[integer2-1][integer-1]=deg;
             //dep_weight[integer2-1][integer-1]=dep;
        }
        else {
            bclist = bcHead2;
            v1 = 0;
            v2 = 0;
            while (bclist != null) {
                flag1 = 0;
                flag2 = 0;
                if (minNFR.compareTo(bclist.Nid) == 0) {
                    for (FRDep flist2 = bclist.begin; flist2 != null; flist2 = flist2.next) {
                        if (flist2.id.compareTo(fr1) == 0) {
                            v1 = flist2.val;
                        }
                        else if (flist2.id.compareTo(fr2) == 0) {
                            v2 = flist2.val;
                        }
                    }
                    break;
                }
                bclist = bclist.next;
            }
            dep=Math.abs(v1-v2);
            if (v1 >= v2) {
            	if(v1==v2) {
     	    		
     		        if(integer>integer2) {
     		            temp.id1 = fr1;
     		            temp.id2 = fr2;
     		           nnode.row=integer;
     	                nnode.col=integer2;
     	                dnode.row=integer;
     	                dnode.col=integer2;
     		        }
     		        else {
     		            temp.id1 = fr2;
     		            temp.id2 = fr1;
     		           nnode.row=integer2;
     	                nnode.col=integer;
     	                dnode.row=integer2;
     	                dnode.col=integer;
     		        }
     	        }
            else {
            	  nnode.row=integer;
                  nnode.col=integer2;
                  dnode.row=integer;
                  dnode.col=integer2;
                temp.id1 = fr1;
                temp.id2 = fr2;
            }
                if(dep<=2)
                	dep=v1;
                else
                	dep=(double)((double)v1+(double)v2)/(double)2;
                nnode.val=deg;
                dnode.val=dep;
              
                //conflict_weight[integer-1][integer2-1]=deg;
                //dep_weight[integer-1][integer2-1]=dep;
            }
            else {
                temp.id1 = fr2;
                temp.id2 = fr1;
                if(dep<=2)
                	dep=v2;
                else
                	dep=(double)((double)v1+(double)v2)/(double)2;
                nnode.val=deg;
                dnode.val=dep;
                nnode.row=integer2;
                nnode.col=integer;
                dnode.row=integer2;
                dnode.col=integer;
                //conflict_weight[integer2-1][integer-1]=deg;
                //dep_weight[integer2-1][integer-1]=dep;
            }
        }
        if (proot2 == null) {
            proot2 = temp;
        }
        else {
            PO r2;
            for (r2 = proot2; r2.next != null; r2 = r2.next) {}
            r2.next = temp;
        }
        if(wn==null)
        	wn=nnode;
        else {
        	matrix k=wn;
        	while(k.next!=null)
        		k=k.next;
        	k.next=nnode;
        }
        if(wd==null)
        	wd=dnode;
        else {
        	matrix k=wd;
        	while(k.next!=null)
        		k=k.next;
        	k.next=dnode;
        }
    }
    public static void caseB(final String fr1, final String fr2) {
    	matrix nnode=new matrix();
    	nnode.next=null;
    	matrix dnode=new matrix();
    	dnode.next=null;
        Node t = nfrroot2;
        int pval=0;
        String maxNFR = null;
        float weight = 0;
        float maxweight=0;
        while (t != null) {
        
            BC b = bcHead2;
            while (b != null) {
                if (b.Nid.compareTo(t.id) == 0) {
                    int flag1 = 0;
                    int flag2 = 0;
                    int v1=0,v2=0;
                	weight=(float) ((float)t.priority*0.5);
                    for (FRDep k = b.begin; k != null; k = k.next) {
                        if (k.id.compareTo(fr1) == 0) {
                            flag1 = 1;
                            v1=k.val;
                            
                        }
                        if (k.id.compareTo(fr2) == 0) {
                            flag2 = 1;
                            v2=k.val;
                        }
                    }
                    if(flag1==1 && flag2==1) {
                    	weight=weight+(float)(((float)v1+(float)v2)*0.5);
                    	if(maxweight<weight)
                    	{
                    		maxweight=weight;
                    	    maxNFR = t.id;
                    	    pval=t.priority;
                    	    break;
                    	}
                    }
                    break;
                }
                else {
                    b = b.next;
                }
            }
            t = t.next;
        }
        //System.out.println("Max NFR is: " + maxNFR);
        BC b = bcHead2;
        int val1 = 0;
        int val2 = 0;
        while (b != null) {
            if (b.Nid.compareTo(maxNFR) == 0) {
                final int flag3 = 0;
                final int flag4 = 0;
                for (FRDep i = b.begin; i != null; i = i.next) {
                    if (i.id.compareTo(fr1) == 0) {
                        val1 = i.val;
                    }
                    if (i.id.compareTo(fr2) == 0) {
                        val2 = i.val;
                    }
                }
            }
            b = b.next;
        }
    	Scanner in = new Scanner(fr1).useDelimiter("[^0-9]+");
        int integer = in.nextInt();
        Scanner in2 = new Scanner(fr2).useDelimiter("[^0-9]+");
        int integer2 = in2.nextInt();
       
        final PO temp = new PO();
         if (val1 >= val2) {
             if(val1==val2) {
 		        if(integer>integer2) {
 		            temp.id1 = fr1;
 		            temp.id2 = fr2;
 		           nnode.row=integer;
 		            nnode.col=integer2;
 		            dnode.row=integer;
 		            dnode.col=integer2;
 		        }
 		        else {
 		            temp.id1 = fr2;
 		            temp.id2 = fr1;
 		           nnode.row=integer2;
 		            nnode.col=integer;
 		            dnode.row=integer2;
 		            dnode.col=integer;
 		        }
 	        }
             else {
            temp.id1 = fr1;
            temp.id2 = fr2;
            nnode.row=integer;
            nnode.col=integer2;
            dnode.row=integer;
            dnode.col=integer2;
            }
            nnode.val=pval;
           // conflict_weight[integer-1][integer2-1]=priority;
            double val;
            val=Math.abs(val1-val2);
            if(val<=2)
            {
            	val=val1;
            }
            else {
            	val=(double)((double)val1+(double)val2)/(double)2;
            }
            //System.out.println("Called caseB. Inserting at "+integer+" | "+integer2+". The value "+priority+" and dep "+val);
           // dep_weight[integer-1][integer2-1]=val;
            dnode.val=val;
          
        }
        else if (val1 < val2) {
            temp.id1 = fr2;
            temp.id2 = fr1;
           nnode.val=pval;
          //  conflict_weight[integer2-1][integer-1]=priority;
            double val;
            val=Math.abs(val1-val2);
            if(val<=2)
            {
            	val=val2;
            }
            else {
            	val=(double)((double)val1+(double)val2)/(double)2;
            }
            dnode.val=val;
            nnode.row=integer2;
            nnode.col=integer;
            dnode.row=integer2;
            dnode.col=integer;
            //System.out.println("Called caseB. Inserting at "+integer2+" | "+integer+". The value "+priority+" and dep "+val);
            //dep_weight[integer2-1][integer-1]=val;
            //System.out.println("dep_weight["+integer+"]["+integer2+"]: "+dep_weight[integer-1][integer2-1]);

        }
        if (proot2 == null) {
            proot2 = temp;
        }
        else {
            PO r;
            for (r = proot2; r.next != null; r = r.next) {}
            r.next = temp;
        }
        if(wn==null)
        	wn=nnode;
        else {
        	matrix k=wn;
        	while(k.next!=null)
        		k=k.next;
        	k.next=nnode;
        }
        if(wd==null)
        	wd=dnode;
        else {
        	matrix k=wd;
        	while(k.next!=null)
        		k=k.next;
        	k.next=dnode;
        }
    }
    public static int check_cycle() {
    	Node p=frroot2;
    	int count=0;
    	while(p!=null) {
    		count++;
    		p=p.next;
    	}
    	 POGraph graph = new POGraph(1000); 
    	 PO q=proot2;
    	 while(q!=null) {
    		 int num1=0,num2=0;
    		/* if((q.id1.compareTo("fb"))==0) {
    			 num1=max+1;
    		 Scanner in1 = new Scanner(q.id2).useDelimiter("[^0-9]+");
    		 int integer = in1.nextInt();
    		 num2=integer;
    		 }*/
    		 //else {
    			 Scanner in1 = new Scanner(q.id1).useDelimiter("[^0-9]+");
        		 int integer1 = in1.nextInt(); 
        		 num1=integer1;
        		 Scanner in2 = new Scanner(q.id2).useDelimiter("[^0-9]+");
        		 int integer2 = in2.nextInt(); 
        		 num2=integer2;
    		 //}
    		 graph.addEdge(num1,num2);
 	       
    		 q=q.next;
    	 }
    	 if(graph.isCyclic()) 
    		 return 1;
    	 else 
    		 return 0;
    }
    public static void remove_transitive() {
    PO j=proot2;
    while(j!=null) {
    	j.visited=0;
    	j=j.next;
    }
    for(Node p=frroot2;p!=null;p=p.next) {
    	for(Node q=frroot2;q!=null;q=q.next) {
    		for(Node r=frroot2;r!=null;r=r.next) {
    			String s1=p.id;
    			String s2=q.id;
    			PO k=proot2;
    			int flag1=0;
    			while(k!=null) {
    				if((k.id1.compareTo(s1))==0 && (k.id2.compareTo(s2))==0) {
    					flag1=1;
    					break;
    				}
    				k=k.next;
    			}
    			s1=q.id;
    			s2=r.id;
    			k=proot2;
    			int flag2=0;
    			while(k!=null) {
    				if((k.id1.compareTo(s1))==0 && (k.id2.compareTo(s2))==0) {
    					flag2=1;
    					break;
    				}
    				k=k.next;
    			}
    			if(flag1==1 && flag2==1) {
        			s1=p.id;
        			s2=r.id;
        			System.out.println("removing "+p.id+" -> "+r.id+" due to "+p.id+" -> "+q.id+" and "+q.id+" -> "+r.id);
        			
        			PO m=proot2;
        			PO n=m;
        			int found=0;
        			while(m!=null) {
        				if((m.id1.compareTo(s1))==0 && (m.id2.compareTo(s2))==0) {
        					found=1;
        					m.visited=1;
        					break;
        				}
        				n=m;
        				m=m.next;
        			}
        			/*if(found==1) {
        				if(m==proot) {
        					if(m.next!=null) {
        						m=m.next;
        						proot=m;
        					}
        					else
        						proot=null;
        				}
        				else if(m.next==null) {
        					n.next=null;
        				}
        				else {
        					m=m.next;
        					n.next=m;
        				}
        			}*/
    		}
    	
    			
    		}
    	}
    }
    PO p=proot2;
    int flag=1;
    while(flag==1) {
    	flag=0;
    	PO m=proot2;
		PO n=m;
		int found=0;
		while(m!=null) {
			if(m.visited==1) {
				found=1;
				break;
			}
			n=m;
			m=m.next;
		}
		//System.out.println("Found "+m.id1+" -> "+m.id2);
		if(found==1) {
			if(m==proot2) {
				if(m.next!=null) {
					m=m.next;
					proot2=m;
				}
				else
					proot2=null;
			}
			else if(m.next==null) {
				n.next=null;
			}
			else {
				m=m.next;
				n.next=m;
			}
		}
    	PO g=proot2;
    	while(g!=null) {
    		if(g.visited==1)
    			flag=1;
    		g=g.next;
    	}
    }
    System.out.println("After removing transitive edges");
    PO r=proot2;
    while(r!=null) {
    	System.out.println(r.id1+" -> "+r.id2);
    	r=r.next;
    }
    }
    public static void exist_path() {
   	 PO remove=null;
   	   	PO k=proot2;
   	   	int count=0;
   	   	while(k!=null) {
   	   		count++;
   	   		System.out.println("Edge:  "+k.id1+" -> "+k.id2);
   	   		k=k.next;
   	   	}
   	   	System.out.println("Number of edges are : "+count);
   	   	Node q=frroot2;
   	   	int V=0;
   	   	while(q!=null) {
   	   		V++;
   	   		q=q.next;
   	   	}
   		System.out.println("Number of FRs are : "+V);
   	   	PO p=proot2;
   	   	int [][] edges;
   	   	while(p!=null) {
   	   		String s1=p.id1;
   	   		String s2=p.id2;
   	   	 Scanner ins = new Scanner(p.id1).useDelimiter("[^0-9]+");
   	        int i1 = ins.nextInt();
   	        Scanner ins2 = new Scanner(p.id2).useDelimiter("[^0-9]+");
   	        int i2 = ins2.nextInt();
   	   		System.out.println("checking for "+s1+" -> "+s2);
   	   		edges=new int[count][2];
   	   		int j=0;
   	   		k=proot2;
   	   		int m=0;
   	   		while(m<count) {
   	   			if(k!=null) {
   	   			for(int n=0;n<2;n++) {
   	   				if((k.id1.compareTo(s1))==0 && (k.id2.compareTo(s2))==0) {
   	   				}else {
   	   					//System.out.println("adding "+k.id1+" -> "+k.id2);
   	   					 Scanner in = new Scanner(k.id1).useDelimiter("[^0-9]+");
   	   			            int integer = in.nextInt();
   	   			            Scanner in2 = new Scanner(k.id2).useDelimiter("[^0-9]+");
   	   			            int integer2 = in2.nextInt();
   	   			            //System.out.println("the integer form "+integer+" -> "+integer2);
   	   			            edges[m][n]=integer;
   	   			            n++;
   	   			            edges[m][n]=integer2;
   	   			            m++;
   	   				}
   	   			}
   	   			k=k.next;
   	   		}
   	   			else
   	   				break;
   	   			
   	   		}
   	   		//System.out.println("the passed edges are:");

   	   		for(m=0;m<count;m++) {
   	   			
   	   				//System.out.println(edges[m][0]+" -> "+edges[m][1]);
   	   			
   	   		}
   	   		 if (existPath(V, edges, i1, i2,count)) {
   	   			 System.out.print("Yes\n");
   	   			 PO temp=new PO();
   	   			 temp.id1=s1;
   	   			 temp.id2=s2;
   	   			 if(remove==null)
   	   				 remove=temp;
   	   			 else {
   	   				 PO t=remove;
   	   				 while(t.next!=null)
   	   					 t=t.next;
   	   				 t.next=temp;
   	   			 }
   	   		 }
   	   		       
   	   		    else
   	   		        System.out.print("No\n");
   	           
   	   		p=p.next;
   	   	}
   	   //	System.out.println("The extras are: ");
   	   	PO t=remove;
   	   	while(t!=null) {
   	   		PO j=proot2;
   	   		PO s=j;
   	   		while(j!=null) {
   	   			if((j.id1.compareTo(t.id1))==0 && (j.id2.compareTo(t.id2))==0) {
   	   				break;
   	   			}
   	   			s=j;
   	   			j=j.next;
   	   		}
   	   		
   	   		if(j==proot2) {
   				if(j.next!=null) {
   					j=j.next;
   					proot2=j;
   				}
   				else
   					proot2=null;
   			}
   			else if(j.next==null) {
   				s.next=null;
   			}
   			else {
   				j=j.next;
   				s.next=j;
   			}
   	   		
   	   		t=t.next;
   	   	}
   	    
   	       /* PO p = proot2;
   	        System.out.println("The partial order is :");
   	        while (p != null) {
   	            System.out.println(String.valueOf(p.id1) + "->" + p.id2);
   	            p = p.next;
   	        }*/

   }
public static boolean existPath(int V, int edges[][], int u, int v,int num)
{


// mat matrix
boolean [][]mat = new boolean[V+1][V+1];

// set mat[i][j]=true if there is
// edge between i to j
for (int i = 0; i < num; i++)
mat[edges[i][0]][edges[i][1]] = true;

// Check for all intermediate vertex
for(int k = 0; k < V+1; k++) 
{
for(int i = 0; i < V+1; i++) 
{
for(int j = 0; j < V+1; j++)
{
   mat[i][j] = mat[i][j] || 
               mat[i][k] &&
               mat[k][j];
  // System.out.println("Hello there!!");
}
}
}

// If vertex is invalid
if (u >= V || v >= V)
{
return false;
}

// If there is a path
if (mat[u][v])
return true;
return false;
}
public static void display_PartialOrder() {
    PO p = proot2;
    System.out.println("The partial order is :");
    while (p != null) {
        System.out.println(String.valueOf(p.id1) + "->" + p.id2);
        p = p.next;
    }
}
public static void setText() {
	rootOp=null;
	//At first find the source vertices
	Node source2=null;
	Node k=frroot2;
	while(k!=null) {
		String s=k.id;
		int exists=0;
		int found=0;
		PO p=proot2;
		while(p!=null) {
			if((p.id2.compareTo(s))==0)
			{
				exists=1;
				break;
			}
			if((p.id1.compareTo(s))==0)
				found=1;
			p=p.next;
		}
		if(exists==0) {
			if(found==1) {
			System.out.println("Source="+k.id);
			Node temp=new Node();
			temp.id=s;
			temp.next=null;
			if(source2==null)
				source2=temp;
			else {
				Node j=source2;
				while(j.next!=null)
					j=j.next;
				j.next=temp;
			}
			}
		}
	
	
		k=k.next;
}
//Count outgoing edge from each source
	Node j=source2;
	while(j!=null) {
		String s=j.id;
		PO m=proot2;
		int c=0;
		while(m!=null) {
			if((m.id1.compareTo(s))==0)
				c++;
			m=m.next;
		}
		j.priority=c;
		j=j.next;
	}
	//Setting visited to 0;
	PO l=proot2;
	while(l!=null) {
		l.visited=0;
		l=l.next;
	}
	//creating a duplicate proot list
	PO pr=null;
	PO pt=proot2;
	while(pt!=null) {
		PO temp=new PO();
		temp.id1=pt.id1;
		temp.id2=pt.id2;
		temp.visited=0;
		temp.next=null;
		if(pr==null)
			pr=temp;
		else {
			PO v=pr;
			while(v.next!=null)
				v=v.next;
			v.next=temp;
		}
		pt=pt.next;
	}
	//Creating the sequences
	//plist root=null;
	j=source2;
	int seq=1;
	while(j!=null) {
		
		PO t=proot2;
		plist temp=new plist();
		while(t!=null) {
			if((t.id1.compareTo(j.id))==0 && t.visited==0) {
		
				temp.name=seq;
				seq++;
				temp.next=null;
				sNode temp2=new sNode();
				temp2.id=t.id1;
				temp2.next=null;
				sNode temp3=new sNode();
				temp3.id=t.id2;
				temp3.next=null;
				temp2.next=temp3;
				temp.begin=temp2;
				if(rootOp==null)
					rootOp=temp;
				else {
					plist g=rootOp;
					while(g.next!=null)
						g=g.next;
					g.next=temp;
				}
				j.priority--;
				t.visited=1;
				PO x=pr;
				while(x!=null) {
					if((x.id1.compareTo(t.id1))==0 && (x.id2.compareTo(t.id2))==0)
						x.visited=1;
					x=x.next;
				}
				break;
			
			}
			t=t.next;
		}
		int found=1;
		while(found==1) {
			found=0;
			sNode m=temp.begin;
			while(m.next!=null)
				m=m.next;
			String s=m.id;
			PO n=proot2;
			while(n!=null) {
				if((n.id1.compareTo(s))==0 && n.visited==0) {
					sNode temp4=new sNode();
    				temp4.id=n.id2;
    				temp4.next=null;
    				m.next=temp4;
    				found=1;
    				PO x=pr;
    				while(x!=null) {
    					if((x.id1.compareTo(n.id1))==0 && (x.id2.compareTo(n.id2))==0)
    						x.visited=1;
    					x=x.next;
    				}
    				break;
    				
				}
				n=n.next;
			}
		}
		
		if(j.priority==0)
		{
			j=j.next;
		}
	}
	//Creating remaining sequences
	PO h=pr;
	plist root2=null;
	//int prevseq=0;
	while(h!=null) {
		
		if(h.visited==0) {
	
			plist v=rootOp;
			while(v!=null) {
				plist temp=new plist();
				temp.name=seq;
    			seq++;
    			temp.begin=null;
				int found=0;
				sNode i=v.begin;
				while(i!=null) {
					if((i.id.compareTo(h.id1))==0)
					{
						System.out.println("Yes Found"+h.id1);
    					sNode wi=v.begin;
    					while((wi.id.compareTo(h.id1))!=0) {
    						sNode temp5=new sNode();
    						temp5.id=wi.id;
    						temp5.next=null;
    						System.out.println("Inserting "+temp5.id);
    						sNode f=temp.begin;
    						if(temp.begin==null)
    							temp.begin=temp5;
    						else {
    							sNode z=temp.begin;
    							while(z.next!=null)
    								z=z.next;
    							z.next=temp5;
    						}
    						wi=wi.next;
    					}
    					
    					break;
					}
					i=i.next;
					
				}
				sNode temp1=new sNode();
    			temp1.id=h.id1;
    			temp1.next=null;
    			sNode f=temp.begin;
				if(temp.begin==null)
					temp.begin=temp1;
				else {
					sNode z=temp.begin;
					while(z.next!=null)
						z=z.next;
					z.next=temp1;
				}
    			sNode temp2=new sNode();
    			temp2.id=h.id2;
    			temp2.next=null;
    			f=temp.begin;
				if(temp.begin==null)
					temp.begin=temp2;
				else {
					sNode z=temp.begin;
					while(z.next!=null)
						z=z.next;
					z.next=temp2;
				}
    			if(root2==null)
    				root2=temp;
    			else
    			{
    				plist b=root2;
    				while(b.next!=null)
    					b=b.next;
    				b.next=temp;
    			}
    			int ex=1;
        		while(ex==1) {
        			ex=0;
        			sNode m=temp.begin;
        			while(m.next!=null)
        				m=m.next;
        			String s=m.id;
        			PO n=proot2;
        			while(n!=null) {
        				if((n.id1.compareTo(s))==0 && n.visited==0) {
        					sNode temp4=new sNode();
            				temp4.id=n.id2;
            				temp4.next=null;
            				m.next=temp4;
            				m=m.next;
            				ex=1;
            				break;
            				
        				}
        				n=n.next;
        			}
        		}
        		System.out.println("list created");
        		System.out.println("V id: "+v.name);
				v=v.next;
				//break;
			}
			System.out.println("Done once");
		}
		h=h.next;
	}
	//Adding remaining to main list
	plist q=root2;
	while(q!=null) {
		plist temp=new plist();
		temp.name=q.name;
		temp.begin=q.begin;
		if(rootOp==null)
			rootOp=temp;
		else {
			plist x=rootOp;
			while(x.next!=null)
				x=x.next;
			x.next=temp;
		}
		q=q.next;
	}
	//Checking duplicate sequence
	plist k2=rootOp;
	while(k2!=null) {
		String temp1="";
		sNode p=k2.begin;
		while(p!=null) {
			temp1=temp1.concat(p.id);
			p=p.next;
		}
		plist m=rootOp;
		int e=0;
		while(m!=null) {
			sNode q2=m.begin;
			String temp2="";
			while(q2!=null) {
				temp2=temp2.concat(q2.id);
				q2=q2.next;
			}
			if(temp2.contains(temp1)) {
				if((temp1.compareTo(temp2))!=0) {
					k2.name=0;
				}
			}
		m=m.next;	
		}
		
		k2=k2.next;
	}
	// Removing duplicate
	int del=1;
	while(del==1) {
		del=0;
		plist v2=rootOp;
		plist v3=v2;
		while(v2!=null) {
			if(v2.name==0) {
				del=1;
				break;
			}
				
			v3=v2;
			v2=v2.next;
		}
		if(del==1) {
			if(v2==rootOp) {
				if(v2.next!=null) {
					v2=v2.next;
					rootOp=v2;
				}
				else
					rootOp=null;
			}
			else if(v2.next==null)
				v3.next=null;
			else {
				v2=v2.next;
				v3.next=v2;
			}
		}
	}
	System.out.println("The sequence for Optimal PO is here");
	plist c=rootOp;
	while(c!=null) {
		
		System.out.println("The sequence S"+c.name);
	sNode r=c.begin;
	while(r!=null) {
		if(r.next!=null) {
			System.out.print(r.id+" -> ");
		}
		else {
			System.out.print(r.id);
			System.out.println();
		}
		r=r.next;
	}
	c=c.next;
	}
}
public static void setOrderInFrame() {
	riskmitigation.append("\n Optimal Change Handling Order");
	riskmitigation.append("\n");
    plist m = rootOp;
    while (m != null) {
        for (sNode n = m.begin; n != null; n = n.next) {
            String temp;
            if (n.next != null) {
                temp = String.valueOf(n.id) + "->";
            }
            else {
                temp = n.id;
            }
            riskmitigation.append(temp);
        }
        m = m.next;
        riskmitigation.append("\n");
    }
}
	public static void create_list() {
		//FR List
		try {
			//FR List Creation
			frroot=null;
			String fname="Iteration"+iteration_count+"\\"+"FR.txt";
			FileReader fread= new FileReader(fname);
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
    			tempnode.impact=0;
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
			fname="Iteration"+iteration_count+"\\"+"NFR.txt";
			fread= new FileReader(fname);
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
    			while((readc=fread.read())!=32) {
    				if(readc>=48 && readc<=57) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
				}
    			tempnode.priority=Integer.valueOf(temp);
    			temp="";
    			while((readc=fread.read())!=10) {
    				if(readc>=48 && readc<=57) {
						c=(char)readc;
	    				temp=temp.concat(Character.toString(c));
    				}
				}
    			tempnode.satisfaction=Integer.valueOf(temp);
    	
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
			fname="Iteration"+iteration_count+"\\"+"FRFR.txt";
			fread= new FileReader(fname);
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
			fname="Iteration"+iteration_count+"\\"+"FRNFR.txt";
			fread= new FileReader(fname);
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
			fname="Iteration"+iteration_count+"\\"+"NFRNFR.txt";
			fread= new FileReader(fname);
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
	public static void change_propagation(String compselect, String catselect) {
		//String compselect=componentbox.getSelectedItem().toString();
		//String catselect=categorybox.getSelectedItem().toString();
		System.out.println("Finding Change Propagation for - "+catselect+" "+compselect);
	
		int countfrnfr=0;
		size=0;
		size2=0;
		size3=0;
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
		System.out.println("Size = "+size);
		//Create chains
		int flagexit=1;
		int sizetemp=size;
		if(size>0) {
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
				String comp="";
				if(last!=-1) {
					comp=prop_list[j][last].id2;
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
		}
		prop_frnfrlist=new Edge1[1000][1];
		Edge1 root=frnfrroot;
		size2=0;
		while(root!=null)
		{
			if(root.id1.compareTo(compselect)==0) {
				Edge1 nodein=new Edge1();
				nodein.id1=root.id1;
				nodein.id2=root.id2;
				nodein.value=root.value;
				prop_frnfrlist[size2][0]=nodein;
				size2++;
			}
			root=root.next;
		}
		//Finding Other FR-NFR Edges 
		int sizetemp2=size2;
		for(int t1=0; t1<size; t1++) {
			for(int t2=0;t2<cn;t2++) {
				if(prop_list[t1][t2]!=null) {
					String v2=prop_list[t1][t2].id2;
					root=frnfrroot;
					Edge1 nodein2;
					//Checking for FR-NFR association of v2
					int v2flag=0;
					while(root!=null) {
						
						if(root.id1.compareTo(v2)==0) {
							v2flag=0;
							for(int t3=0;t3<size2;t3++) {
								//System.out.println(" Comparing with "+prop_frnfrlist[t3][0].id1+" -> "+prop_frnfrlist[t3][0].id2);
								if(prop_frnfrlist[t3][0].id1.compareTo(root.id1)==0 && prop_frnfrlist[t3][0].id2.compareTo(root.id2)==0) {
									v2flag=1;
								}
							}
							//System.out.println("vflag set to :"+v2flag);
							if(v2flag==0) {
								nodein2=new Edge1();
								nodein2.id1=root.id1;
								nodein2.id2=root.id2;
								nodein2.value=root.value;
								prop_frnfrlist[size2][0]=nodein2;
								size2++;
							}
						}
						root=root.next;	
					}
				
				}
			}
		}
		prop_nfrnfrlist=new Edge1[1000][1];
		root=frnfrroot;
		size3=0;
		while(root!=null)
		{
			//System.out.println("Entered ");
			if(root.id1.compareTo(compselect)==0 && root.value>0) {
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
		//Finding other NFR-NFR Edges
		for(int t4=0;t4<size2;t4++) {
			Edge1 root2=nfrnfrroot;
			while(root2!=null) {
				if(root2.id1.compareTo(prop_frnfrlist[t4][0].id2)==0 || root2.id2.compareTo(prop_frnfrlist[t4][0].id2)==0) {
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
		}
		else if(catselect.compareTo("NFR")==0) {
			prop_frnfrlist=new Edge1[1000][1];
			Edge1 root=frnfrroot;
			size2=0;
			while(root!=null)
			{
				if(root.id2.compareTo(compselect)==0) {
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
					//Checking for other possible NFR conflict
					for(int t5=0; t5<size2; t5++) {
						String fr=prop_frnfrlist[t5][0].id1;
						String nfr=prop_frnfrlist[t5][0].id2;
						//Check if fr has relation with other NFR
						Edge1 rootk=frnfrroot;
						while(rootk!=null) {
							if(rootk.id1.compareTo(fr)==0) {
								if(rootk.id2.compareTo(nfr)!=0) {
									//Check if rootk.id2 is conflicting with anyone
									Edge1 rootn=nfrnfrroot;
									while(rootn!=null) {
										if(rootn.id1.compareTo(rootk.id2)==0 || rootn.id2.compareTo(rootk.id2)==0) {
											int cflag=0;
											for(int h=0;h<size3;h++) {
												if(prop_nfrnfrlist[h][0].id1.compareTo(rootn.id1)==0 && prop_nfrnfrlist[h][0].id2.compareTo(rootn.id2)==0)
													cflag=1;
											}
											if(cflag==0) {
											Edge1 nodein=new Edge1();
											nodein.id1=rootn.id1;
											nodein.id2=rootn.id2;
											nodein.value=rootn.value;
											prop_nfrnfrlist[size3][0]=nodein;
											size3++;
											}
										}
										rootn=rootn.next;
									}
								}
							}
								
							rootk=rootk.next;
						}
					}
		}
		System.out.println("FR-FR Edges are: ");
		for(int t=0;t<size;t++) {
			for(int m=0;m<cn;m++) {
				if(prop_list[t][m]!=null) {
					System.out.print(prop_list[t][m].id1+" -> "+prop_list[t][m].id2);
				}
				
		}
			System.out.println();
	}
		System.out.println("FR-NFR Edges are: ");
		for(int t=0;t<size2;t++) {
			
					System.out.println(" Edge is "+prop_frnfrlist[t][0].id1+" -> "+prop_frnfrlist[t][0].id2+" "+prop_frnfrlist[t][0].value);
			
		}
		System.out.println("NFR-NFR Edges are: ");
		for(int t=0;t<size3;t++) {
		
					System.out.println(" Edge is "+prop_nfrnfrlist[t][0].id1+" -> "+prop_nfrnfrlist[t][0].id2);
		}
		try {
			FileWriter fw1 = new FileWriter("FRFRImp.txt",true); 
			BufferedWriter bw1 = new BufferedWriter(fw1);
			for(int t=0;t<size;t++) {
				for(int m=0;m<cn;m++) {
					if(prop_list[t][m]!=null) {
						bw1.write(prop_list[t][m].id1+" "+prop_list[t][m].id2+" "+prop_list[t][m].value+" "+prop_list[t][m].type);
						if(prop_list[t][m+1]!=null)
							bw1.write(" ");
					}
			}
				bw1.newLine();
		}
			bw1.close();
			fw1.close();
			 fw1 = new FileWriter("FRNFRImp.txt",true); 
			 bw1 = new BufferedWriter(fw1);
			for(int t=0;t<size2;t++) {
				bw1.write(prop_frnfrlist[t][0].id1+" "+prop_frnfrlist[t][0].id2+" "+prop_frnfrlist[t][0].value);
				bw1.newLine();
					
			}
			bw1.close();
			fw1.close();
			fw1 = new FileWriter("NFRNFRImp.txt",true); 
			 bw1 = new BufferedWriter(fw1);
			for(int t=0;t<size3;t++) {
				bw1.write(prop_nfrnfrlist[t][0].id1+" "+prop_nfrnfrlist[t][0].id2+" "+prop_nfrnfrlist[t][0].value);
				bw1.newLine();
			}
			bw1.close();
			fw1.close();
		}catch(IOException err) {
			System.out.println("Error in File Writing");
		}
		//create_riskgraph();
	}
	public static void create_riskgraph() {
		//String compselect=componentbox.getSelectedItem().toString();
		//String catselect=categorybox.getSelectedItem().toString();
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
	   	 		v3=v3.concat("D:"+String.valueOf(frfr.value));
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
	   	 		v3=v3.concat("S:"+String.valueOf(frnfr.value));
	   	 		String label=v1+"-"+v2;
	   	 		final Edge edge1 = graph.addEdge(label, v1, v2, true);
	   	 		edge1.addAttribute("layout.weight", 16);
	   	 		edge1.addAttribute("ui.label", v3);
	   	 	if(frchange!=0) {
	   	 	Node hold=frchangeroot;
	   	 	while(hold!=null) {
	   	 	String compselect=hold.id;	
	   	 	if(v1.compareTo(compselect)==0) {
	   	 		if(frnfr.value>=0.25 && frnfr.value<0.50)
	   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,255,51); text-color: rgb(0,0,0);");
	   	 		else if (frnfr.value>=0.50 && frnfr.value<0.75)
	   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,128,0); text-color: rgb(0,0,0);");
	   	 		else
	   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,0,0); text-color: rgb(0,0,0);");
	   	 	}
	   	 	else
	   	 		edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
	   	 	hold=hold.next;
	   	 	}
	   	 	}
	   		if(nfrchange!=0) {
		   	 	Node hold=nfrchangeroot;
		   	 	while(hold!=null) {
		   	 	String compselect=hold.id;	
		   	 	if(v2.compareTo(compselect)==0) {
		   	 		if(frnfr.value>=0.25 && frnfr.value<0.50)
		   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,255,51); text-color: rgb(0,0,0);");
		   	 		else if (frnfr.value>=0.50 && frnfr.value<0.75)
		   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,128,0); text-color: rgb(0,0,0);");
		   	 		else
		   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(255,0,0); text-color: rgb(0,0,0);");
		   	 	}
		   	 	else
		   	 		edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
		   	 	hold=hold.next;
		   	 	}
		   	 	}
	   	 	frnfr=frnfr.next;
		 }
		 Edge1 nfrnfr=nfrnfrroot;
		 while(nfrnfr!=null) {
			 	String v1=nfrnfr.id1;
	   	 		String v2=nfrnfr.id2;
	   	 		String v3="";
	   	 		v3=v3.concat("C:"+String.valueOf(nfrnfr.value));
	   	 		String label=v1+"-"+v2;
	   	 		final Edge edge1 = graph.addEdge(label, v1, v2, false);
	   	 		edge1.addAttribute("layout.weight", 16);
	   	 		edge1.addAttribute("ui.label", v3);
	   	 		frnfr=frnfrroot;
	   	 		if(frchange>0) {
	   	 		Node hold=frchangeroot;
	   	 		while(hold!=null) {
	   	 		String compselect=hold.id;
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
	   	 		hold=hold.next;
	   	 		}
	   	 		}
	   	 		if(nfrchange>0) {
	   	 			Node hold=nfrchangeroot;
	   	 			while(hold!=null){
	   	 				String compselect=hold.id;
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
	   	 		hold=hold.next;
	   	 			}
	   	 			
	   	 		}
	   	 		//edge1.addAttribute("font-size", 20);
	   	 		
	   	 		nfrnfr=nfrnfr.next;
		 }
		
		 for (final org.graphstream.graph.Node node : graph) {
			 node.addAttribute("ui.label", node.getId());
				String k= node.getId();
				int chflag=0;
				if(frchange>0) {
				Node hold=frchangeroot;
				while(hold!=null) {
					String compselect=hold.id;
				if(k.compareTo(compselect)==0) {
					node.addAttribute("layout.weight", 150);
					node.addAttribute("ui.style", "shape: circle; fill-color: rgb(102,0,0); text-color: rgb(255,255,255);");
					chflag=1;
				}
				hold=hold.next;
				}
				}
				if(nfrchange>0) {
					Node hold=nfrchangeroot;
					while(hold!=null) {
						String compselect=hold.id;
						if(k.compareTo(compselect)==0) {
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
					chflag=1;
				}
				hold=hold.next;
				}
				}
				if(k.contains("fr") && !k.contains("nfr") && chflag==0) {
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
				else if(k.contains("nfr") && chflag==0) {
				
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
				if(frchange>0) {
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
				if(nfrchange>0) {
					for(int p=0;p<size2;p++) {
						if(prop_frnfrlist[p][0].id1.compareTo(k)==0) {
							node.addAttribute("layout.weight", 300);
							node.addAttribute("ui.style", "shape: circle; fill-color: rgb(255,0,0); text-color: rgb(255,255,255);");
						}
					}
					for(int p=0;p<size3;p++) {
						if(prop_nfrnfrlist[p][0].id1.compareTo(k)==0) {
							int chflag2=0;
							Node hold=nfrchangeroot;
							while(hold!=null) {
								if(prop_nfrnfrlist[p][0].id1.compareTo(hold.id)==0)
									chflag2=1;
								hold=hold.next;
							}
							if(chflag==0){
							node.addAttribute("layout.weight", 300);
							node.addAttribute("ui.style", "shape: rounded-box; fill-color: rgb(255,0,0); text-color: rgb(255,255,255);");
						}
						}
						if(prop_nfrnfrlist[p][0].id2.compareTo(k)==0) {
							int chflag2=0;
							Node hold=nfrchangeroot;
							while(hold!=null) {
								if(prop_nfrnfrlist[p][0].id2.compareTo(hold.id)==0)
									chflag2=1;
								hold=hold.next;
							}
							if(chflag==0){
							node.addAttribute("layout.weight", 300);
							node.addAttribute("ui.style", "shape: rounded-box; fill-color: rgb(255,0,0); text-color: rgb(255,255,255);");
							}
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
			if(sum1>100) {
				j.prevsatisfaction=j.satisfaction;
				j.satisfaction=100;
			}
			else {
				j.prevsatisfaction=j.satisfaction;
				j.satisfaction=sum1;
			}
			j=j.next;
		}
		j=nfrroot;
		while(j!=null) {
			System.out.println("NFR "+j.id+" Satisfaction = "+j.satisfaction);
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
			String fname="Iteration"+iteration_count+"\\"+"NFRNFR.txt";
		FileWriter fw1 = new FileWriter(fname,false); 
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
	public static void calculate_nodeimpact(String compselect) {
		Node fr=frroot;
		//String compselect=componentbox.getSelectedItem().toString();
		//System.out.println("Started Execution");
		fr=frroot;
		/*while(fr!=null) {
			System.out.println("FR  "+fr.id);
			fr=fr.next;
		}*/
		fr=frroot;
		while(fr!=null) {
	
			if(fr.id.compareTo(compselect)!=0) {
			System.out.println("Comparing with "+fr.id);
			Edge1 ff=frfrroot;
			double sum=0;
			double weight=0;
			int count=0;
			int flagx=0;
			while(ff!=null) {
				if(ff.id2.compareTo(fr.id)==0) {
					System.out.println("Matched with "+ff.id2+" and ff.id1= "+ff.id1);
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
					flagx=1;
				}
				ff=ff.next;
				
			}
			if(flagx==0 && fr.impact==0)
				fr.impact=0;
			else {
			int max= 100*count;
			sum= (double)(sum-(double)count)/(double)((double)max-(double)1);
			weight= weight / ((double)6*(double)count);
			sum = sum * weight;
			fr.impact= sum;
			}
			
			}
			else if(fr.id.compareTo(compselect)==0) {
				System.out.println("Matched = "+fr.id+" Impact = "+fr.impact);
				if(fr.impact>0) {
				//Do nothing already assigned a value
				}
				else
					fr.impact=0;
			}
			
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
		//String catselect=categorybox.getSelectedItem().toString();
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
		System.out.println("size = "+size+" size2 = "+ size2+" size3= "+size3);
		//if(catselect.compareTo("FR")==0) {
		if(frchange>0) {
		
		for(int l=0; l<size;l++) {	
			sumff[index]=0;
			cat=0;
			type=0;
			frozen=0;
			int count=0;
			for(int m=0;m<cn;m++) {
				if(prop_list[l][m]!=null) {
					sumff[index]=sumff[index]+prop_list[l][m].value;
					System.out.println("In calculate risk "+prop_list[l][m].id1+" "+ prop_list[l][m].id2+" "+prop_list[l][m].value);
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
		System.out.println("FR-FR Impact");
		for(int i=0; i<index; i++) {
			//double normal= (double)(sumff[i]-(double)1)/(double)((double)100-(double)1);
			String text="Chain "+(i+1)+" impact is "+sumff[i];
			riskmeasure.append(text);
			riskmeasure.append("\n");
			System.out.println(text);
		}
		}
		double sumfnf=0;
		double sat=0;
		double prio=0;
		
		for(int l=0; l<size2;l++) {	
			String nfr=prop_frnfrlist[l][0].id2;
			Node temp=nfrroot;
			sumfnf=sumfnf+Math.abs(prop_frnfrlist[l][0].value);
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
			System.out.println("FR-NFR Impact");
			System.out.println(text);
			
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
		System.out.println("NFR-NFR Impact");
		System.out.println(text);
		
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
		if(frchange>0) {
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
		System.out.println(text);
		/*else if(catselect.compareTo("NFR")==0) {
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
			riskmeasure.append("\n");*/
		
		String text2="";
		if(prob>=0 && prob<=0.2) {
			text2=" Risk Probability is Low. ";
		}
		else if(prob>0.2 && prob<=0.4) {
			text2=" Risk Probability is Moderate. ";
		}
		else if(prob>0.4 && prob<=0.6) {
			text2=" Risk Probability is Significant. ";
		}
		else if(prob>0.6 && prob<=0.8) {
			text2=" Risk Probability is Major. ";
		}
		else if(prob>0.8) {
			text2=" Risk Probability is High. ";
		}
		if(impact>=0 && impact<=0.2) {
			text2=text2+" Risk Impact is Low. ";
		}
		else if(impact>0.2 && impact<=0.4) {
			text2=text2+" Risk Impact is Moderate. ";
		}
		else if(impact>0.4 && impact<=0.6) {
			text2=text2+" Risk Impact is Significant. ";
		}
		else if(impact>0.6 && impact<=0.8) {
			text2=text2+" Risk Impact is Major. ";
		}
		else if(impact>0.8) {
			text2=text2+" Risk impact is High. ";
		}
		riskmeasure.append(text2);
		riskmeasure.append("\n");
		System.out.println(text2);
	}
	public static void find_changeCount() {
		int now=iteration_count;
		int prev=iteration_count-1;
		frchange=0;
		nfrchange=0;
		Node frroot1,frroot2;
		Node nfrroot1, nfrroot2;
		frchangeroot=null;
		nfrchangeroot=null;
		//Compare FR-FR file
		frroot1=null;
		frroot2=null;
		File myObj = new File("FRFRImp.txt"); 
	    if (myObj.delete()) {
	    	System.out.println("Successfully deleted FRFRImp.txt file");
	    }
	    else {
	    	System.out.println("Not deleted");
	    }
	    File myObj2 = new File("FRNFRImp.txt"); 
	    if (myObj2.delete()) {
	    	System.out.println("Successfully deleted FRNFRImp.txt file");
	    }
	    else {
	    	System.out.println("Not deleted");
	    }
	    File myObj3 = new File("NFRNFRImp.txt"); 
	    if (myObj3.delete()) {
	    	System.out.println("Successfully deleted NFRNFRImp.txt file");
	    }
	    else {
	    	System.out.println("Not deleted");
	    }
		try {
		String fname="Iteration"+now+"\\"+"FR.txt";
		FileReader fread= new FileReader(fname);
		int readc=0;
		char c;
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
			while((readc=fread.read())!=10) {
				if(readc==-1)
					break;
				else {
					c=(char)readc;
    				temp=temp.concat(Character.toString(c));
				}	
			}
			tempnode.description=temp;
			tempnode.next=null;
			if(frroot1==null)
				frroot1=tempnode;
			else {
				Node k=frroot1;
				while(k.next!=null)
					k=k.next;
				k.next=tempnode;
			}
			temp="";
		}
		fread.close();
		fname="Iteration"+prev+"\\"+"FR.txt";
		fread= new FileReader(fname);
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
			while((readc=fread.read())!=10) {
				if(readc==-1)
					break;
				else {
					c=(char)readc;
    				temp=temp.concat(Character.toString(c));
				}
			}
			tempnode.description=temp;
			tempnode.next=null;
			if(frroot2==null)
				frroot2=tempnode;
			else {
				Node k=frroot2;
				while(k.next!=null)
					k=k.next;
				k.next=tempnode;
			}
			temp="";
		}
		fread.close();
		FileWriter fw1 = new FileWriter("ChangeFR.txt", false); 
		BufferedWriter bw1 = new BufferedWriter(fw1);
		Node temp1=frroot1;
		int found=0;
		while(temp1!=null) {
			Node temp2=frroot2;
			while(temp2!=null) {
				if(temp1.id.compareTo(temp2.id)==0) {
					//System.out.println("FR Matched");
					if(temp1.description.compareTo(temp2.description)==0) {
						//System.out.println("Description Matched");
						found=1;
						break;
					}
					else {
						bw1.write(temp1.id);
						bw1.newLine();
						found=1;
						frchange++;
						Node ctemp=new Node();
						ctemp.id=temp1.id;
						ctemp.description=temp1.description;
						ctemp.next=null;
						if(frchangeroot==null)
							frchangeroot=ctemp;
						else {
							Node k=frchangeroot;
							while(k.next!=null)
								k=k.next;
							k.next=ctemp;
						}
					}
				}
				temp2=temp2.next;
			}
			if(found==0) {
				//System.out.println("Not Found "+temp1.id);
				bw1.write(temp1.id);
				bw1.newLine();
				frchange++;
				Node ctemp=new Node();
				ctemp.id=temp1.id;
				ctemp.description=temp1.description;
				ctemp.next=null;
				if(frchangeroot==null)
					frchangeroot=ctemp;
				else {
					Node k=frchangeroot;
					while(k.next!=null)
						k=k.next;
					k.next=ctemp;
				}
			}
			else
				found=0;
			temp1=temp1.next;
		}
		bw1.close();
		fw1.close();
		}catch(IOException changeexcep) {
			System.out.println("Error in FR files");
		}
		System.out.println("Done");
		//Compare NFR-NFR file
		nfrroot1=null;
		nfrroot2=null;
		try {
		String fname="Iteration"+now+"\\"+"NFR.txt";
		FileReader fread= new FileReader(fname);
		int readc=0;
		char c;
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
				if(readc==-1)
					break;
				else {
					c=(char)readc;
    				temp=temp.concat(Character.toString(c));
				}	
			}
			tempnode.description=temp;
			while((readc=fread.read())!=10) {
				
			}
			tempnode.next=null;
			if(nfrroot1==null)
				nfrroot1=tempnode;
			else {
				Node k=nfrroot1;
				while(k.next!=null)
					k=k.next;
				k.next=tempnode;
			}
			temp="";
		}
		fread.close();
		fname="Iteration"+prev+"\\"+"NFR.txt";
		fread= new FileReader(fname);
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
				if(readc==-1)
					break;
				else {
					c=(char)readc;
    				temp=temp.concat(Character.toString(c));
				}
			}
			tempnode.description=temp;
			while((readc=fread.read())!=10) {
				
			}
			tempnode.next=null;
			if(nfrroot2==null)
				nfrroot2=tempnode;
			else {
				Node k=nfrroot2;
				while(k.next!=null)
					k=k.next;
				k.next=tempnode;
			}
			temp="";
		}
		fread.close();
		FileWriter fw2 = new FileWriter("ChangeNFR.txt", false); 
		BufferedWriter bw2 = new BufferedWriter(fw2);
		Node temp1=nfrroot1;
		int found=0;
		while(temp1!=null) {
			Node temp2=nfrroot2;
			while(temp2!=null) {
				if(temp1.id.compareTo(temp2.id)==0) {
					if(temp1.description.compareTo(temp2.description)==0) {
						found=1;
						break;
					}
					else {
						bw2.write(temp1.id);
						bw2.newLine();
						found=1;
						nfrchange++;
						Node ctemp=new Node();
						ctemp.id=temp1.id;
						ctemp.description=temp1.description;
						ctemp.next=null;
						if(nfrchangeroot==null)
							nfrchangeroot=ctemp;
						else {
							Node k=nfrchangeroot;
							while(k.next!=null)
								k=k.next;
							k.next=ctemp;
						}
						}
					found=1;
				}
				temp2=temp2.next;
			}
			if(found==0) {
				bw2.write(temp1.id);
				bw2.newLine();
				nfrchange++;
				Node ctemp=new Node();
				ctemp.id=temp1.id;
				ctemp.description=temp1.description;
				ctemp.next=null;
				if(nfrchangeroot==null)
					nfrchangeroot=ctemp;
				else {
					Node k=nfrchangeroot;
					while(k.next!=null)
						k=k.next;
					k.next=ctemp;
				}
			}
			else
				found=0;
			temp1=temp1.next;
		}
		bw2.close();
		fw2.close();
		}catch(IOException changeexcep) {
			System.out.println("Error in NFR files");
		}
		System.out.println("FR change count= "+frchange);
		System.out.println("NFR change count= "+nfrchange);
		total_change=frchange+nfrchange;
		if(total_change>1) {
		if(frchangeroot!=null) {
			Node fr=frchangeroot;
			while(fr!=null) {
			create_list();
		    compute_satisfaction();
		    compute_conflict();
			change_propagation(fr.id, "FR");
			fr=fr.next;
			}
		}
		if(nfrchangeroot!=null) {
			Node nfr=nfrchangeroot;
			while(nfr!=null) {
			create_list();
		    compute_satisfaction();
		    compute_conflict();
			change_propagation(nfr.id, "NFR");
			nfr=nfr.next;
			}
		}
		merge_sort_chains();
		System.out.println("size = "+size+" size2 = "+ size2+" size3= "+size3);
	//	calculate_nodeimpact();
    	//calculate_risk();
    	//create_riskgraph();
		}
		else {
			if(frchange>0) {
				Node fr=frchangeroot;
				while(fr!=null) {
				create_list();
			    compute_satisfaction();
			    compute_conflict();
				change_propagation(fr.id, "FR");
				fr=fr.next;
				}
				
			}
			else if(nfrchange>0) {
				Node nfr=nfrchangeroot;
				while(nfr!=null) {
				create_list();
			    compute_satisfaction();
			    compute_conflict();
				change_propagation(nfr.id, "NFR");
				
				nfr=nfr.next;
				}
			}
		}
			create_list();
			if(frchange>0) {
				Node fr=frchangeroot;
				while(fr!=null) {
				calculate_nodeimpact(fr.id);
				fr=fr.next;
				}
				
			}
			/*else if(nfrchange>0) {
				Node nfr=nfrchangeroot;
				while(nfr!=null) {
				create_list();
			    compute_satisfaction();
			    compute_conflict();
				change_propagation(nfr.id, "NFR");
				
				nfr=nfr.next;
				}*/
		//	calculate_nodeimpact();
			System.out.println("FR change count is "+frchange);
			System.out.println("NFR change count is "+nfrchange);
        	//calculate_risk();
        //	create_riskgraph();
		
	}
	public static void merge_sort_chains() {
		//Merging and removing redundancy from NFR-NFR
		Edge1 prop_nfrnfrlist2[][]=new Edge1[1000][1];
		int sizenfr=0;
		try {
			FileReader fread=new FileReader("NFRNFRImp.txt");
			int i;
			char c;
			String temp="";
			while((i=fread.read())!=-1) {
				temp="";
				Edge1 newnode=new Edge1();
				c=(char)i;
				temp=temp.concat(Character.toString(c));
				while((i=fread.read())!=32) {
					c=(char)i;
					temp=temp.concat(Character.toString(c));
				}
				newnode.id1=temp;
				temp="";
				while((i=fread.read())!=32) {
					c=(char)i;
					temp=temp.concat(Character.toString(c));
				}
				newnode.id2=temp;
				temp="";
				while((i=fread.read())!=10) {
					c=(char)i;
					if(i>=48 && i<=57)
						temp=temp.concat(Character.toString(c));
				}
				newnode.value=Integer.valueOf(temp);
				if(sizenfr>0) {
					int cflag=0;
					for(int t1=0; t1<sizenfr;t1++) {
						if(prop_nfrnfrlist2[t1][0].id1.compareTo(newnode.id1)==0 && prop_nfrnfrlist2[t1][0].id2.compareTo(newnode.id2)==0)
							cflag=1;
					}
					if(cflag==0)
					{
						prop_nfrnfrlist2[sizenfr][0]=newnode;
						sizenfr++;
					}
				}
				else {
					//System.out.println("Inserted!");
					
					prop_nfrnfrlist2[sizenfr][0]=newnode;
					//System.out.println(prop_nfrnfrlist2[sizenfr][0].id1+" -> "+ prop_nfrnfrlist2[sizenfr][0].id2);
					sizenfr++;
				}
					
			}
			fread.close();
			FileWriter fw1 = new FileWriter("NFRNFRImp.txt",false); 
			BufferedWriter bw1 = new BufferedWriter(fw1);
			for(int t1=0;t1<sizenfr;t1++) {
				bw1.write(prop_nfrnfrlist2[t1][0].id1+" "+prop_nfrnfrlist2[t1][0].id2+" "+prop_nfrnfrlist2[t1][0].value);
				bw1.newLine();
			}
			bw1.close();
			fw1.close();
			//Now copy it back to actual array
			prop_nfrnfrlist=new Edge1[1000][1];
			for(int t2=0; t2<sizenfr; t2++) {
				Edge1 node=new Edge1();
				node.id1=prop_nfrnfrlist2[t2][0].id1;
				node.id2=prop_nfrnfrlist2[t2][0].id2;
				node.value=prop_nfrnfrlist2[t2][0].value;
				prop_nfrnfrlist[t2][0]=node;
			}
			size3=sizenfr;
		}catch(IOException m1) {
			System.out.println("Error in reading file NFRNFRImp.txt");
		}
		//Merging and removing redundancy from FR-NFR
		Edge1 prop_frnfrlist2[][]=new Edge1[1000][1];
		int sizefrnfr=0;
		try {
			FileReader fread=new FileReader("FRNFRImp.txt");
			int i;
			char c;
			String temp="";
			while((i=fread.read())!=-1) {
				temp="";
				Edge1 newnode=new Edge1();
				c=(char)i;
				temp=temp.concat(Character.toString(c));
				while((i=fread.read())!=32) {
					c=(char)i;
					temp=temp.concat(Character.toString(c));
				}
				newnode.id1=temp;
				temp="";
				while((i=fread.read())!=32) {
					c=(char)i;
					temp=temp.concat(Character.toString(c));
				}
				newnode.id2=temp;
				temp="";
				while((i=fread.read())!=10) {
					c=(char)i;
					if(i==45)
						temp=temp.concat(Character.toString(c));
					if(i>=48 && i<=57)
						temp=temp.concat(Character.toString(c));
				}
				newnode.value=Integer.valueOf(temp);
				if(sizefrnfr>0) {
					int cflag=0;
					for(int t1=0; t1<sizefrnfr;t1++) {
						if(prop_frnfrlist2[t1][0].id1.compareTo(newnode.id1)==0 && prop_frnfrlist2[t1][0].id2.compareTo(newnode.id2)==0)
							cflag=1;
					}
					if(cflag==0)
					{
						prop_frnfrlist2[sizefrnfr][0]=newnode;
						sizefrnfr++;
					}
				}
				else {
					//System.out.println("Inserted!");
					
					prop_frnfrlist2[sizefrnfr][0]=newnode;
					//System.out.println(prop_nfrnfrlist2[sizenfr][0].id1+" -> "+ prop_nfrnfrlist2[sizenfr][0].id2);
					sizefrnfr++;
				}
					
			}
			fread.close();
			FileWriter fw1 = new FileWriter("FRNFRImp.txt",false); 
			BufferedWriter bw1 = new BufferedWriter(fw1);
			for(int t1=0;t1<sizefrnfr;t1++) {
				bw1.write(prop_frnfrlist2[t1][0].id1+" "+prop_frnfrlist2[t1][0].id2+" "+prop_frnfrlist2[t1][0].value);
				bw1.newLine();
			}
			bw1.close();
			fw1.close();
			//Now copy it back to actual array
			prop_frnfrlist=new Edge1[1000][1];
			for(int t2=0; t2<sizefrnfr; t2++) {
				Edge1 node=new Edge1();
				node.id1=prop_frnfrlist2[t2][0].id1;
				node.id2=prop_frnfrlist2[t2][0].id2;
				node.value=prop_frnfrlist2[t2][0].value;
				prop_frnfrlist[t2][0]=node;
			}
			size2=sizefrnfr;
		}catch(IOException m1) {
			System.out.println("Error in reading file FRNFRImp.txt");
		}
		//Merging and removing redundancy from FR-FR
		Edge1 prop_list2[][]=new Edge1[1000][1000];
		int sizefrfr=0;
		try {
			FileReader fread=new FileReader("FRFRImp.txt");
			int i;
			char c;
			String temp="";
			//Reading from file to array
			while((i=fread.read())!=-1) {
				temp="";
				c=(char)i;
				temp=temp.concat(Character.toString(c));
				int sizecol=0;
				while((i=fread.read())!=10) {
					c=(char)i;
					temp=temp.concat(Character.toString(c));
					Edge1 newnode=new Edge1();
					while((i=fread.read())!=32) {
						c=(char)i;
						temp=temp.concat(Character.toString(c));
					}
					newnode.id1=temp;
					temp="";
					while((i=fread.read())!=32) {
						c=(char)i;
						temp=temp.concat(Character.toString(c));
					}
					newnode.id2=temp;
					temp="";
					while((i=fread.read())!=32) {
						c=(char)i;
						if(i>=48 && i<=57)
							temp=temp.concat(Character.toString(c));
					}
					newnode.value=Integer.valueOf(temp);
					temp="";
					while((i=fread.read())!=32) {
						c=(char)i;
						if(i==10)
							break;
						if(i!=13)
							temp=temp.concat(Character.toString(c));
					}
					newnode.type=temp;
					temp="";
					prop_list2[sizefrfr][sizecol]=newnode;
					sizecol++;
					System.out.println("Node read "+newnode.id1+" "+newnode.id2+" "+newnode.value+newnode.type);
					if(i==10)
						break;
				}
				sizefrfr++;			
			}
			for(int t1=0; t1<sizefrfr; t1++) {
				String pattern1="";
				for(int t2=0; t2<1000;t2++) {
					if(prop_list2[t1][t2]!=null) {
						System.out.print(prop_list2[t1][t2].id1+" "+prop_list2[t1][t2].id2+" "+prop_list2[t1][t2].value+" "+prop_list2[t1][t2].type+" ");
					}
				}
				System.out.println();
			}
			//Pattern matching procedure
			int sizefr=0;
			prop_list=new Edge1[1000][1000];
			for(int t1=0; t1<sizefrfr; t1++) {
				String pattern1="";
				for(int t2=0; t2<1000;t2++) {
					if(prop_list2[t1][t2]!=null) {
						pattern1=pattern1.concat(prop_list2[t1][t2].id1+prop_list2[t1][t2].id2);
					}
				}
				if(sizefr>0) {
					//Construct pattern2 and check with pattern1
					int cflag=0;
					int index=0;
					for(int t3=0; t3<sizefr; t3++) {
						String pattern2="";
						for(int t4=0; t4<1000; t4++) {
							if(prop_list[t3][t4]!=null) {
								pattern2=pattern2.concat(prop_list[t3][t4].id1+prop_list[t3][t4].id2);
							}
						}
						if(pattern1.compareTo(pattern2)==0) {
							cflag=1;
						}
						else if(pattern2.contains(pattern1))
							cflag=1;
						else if(pattern1.contains(pattern2)) {
							cflag=2;
							index=t3;
						}
					}
					if(cflag==0) {
						int col=0;
						for(int t2=0; t2<1000;t2++) {
							if(prop_list2[t1][t2]!=null) {
								Edge1 node2=new Edge1();
								node2.id1=prop_list2[t1][t2].id1;
								node2.id2=prop_list2[t1][t2].id2;
								node2.value=prop_list2[t1][t2].value;
								node2.type=prop_list2[t1][t2].type;
								prop_list[sizefr][col]=node2;
								col++;
							}
						}
						sizefr++;
					}
					else if(cflag==2) {
						//Clean the row
						for(int t2=0; t2<1000;t2++) {
							prop_list[index][t2]=null;
						}
						int col=0;
						for(int t2=0; t2<1000;t2++) {
							if(prop_list2[t1][t2]!=null) {
								Edge1 node2=new Edge1();
								node2.id1=prop_list2[t1][t2].id1;
								node2.id2=prop_list2[t1][t2].id2;
								node2.value=prop_list2[t1][t2].value;
								node2.type=prop_list2[t1][t2].type;
								prop_list[index][col]=node2;
								col++;
							}
						}
						sizefr++;
					}
				}
				else {
					int col=0;
					for(int t2=0; t2<1000;t2++) {
						if(prop_list2[t1][t2]!=null) {
							Edge1 node2=new Edge1();
							node2.id1=prop_list2[t1][t2].id1;
							node2.id2=prop_list2[t1][t2].id2;
							node2.value=prop_list2[t1][t2].value;
							node2.type=prop_list2[t1][t2].type;
							prop_list[sizefr][col]=node2;
							col++;
						}
					}
					sizefr++;
				}
			}
			fread.close();
			FileWriter fw1 = new FileWriter("FRFRImp.txt",false); 
			BufferedWriter bw1 = new BufferedWriter(fw1);
			size=sizefr;
			for(int t1=0;t1<size;t1++) {
				for(int t2=0; t2<1000; t2++) {
					if(prop_list[t1][t2]!=null) {
						bw1.write(prop_list[t1][t2].id1+" "+prop_list[t1][t2].id2+" "+prop_list[t1][t2].value+" "+prop_list[t1][t2].type);
						if(prop_list[t1][t2+1]!=null)
							bw1.write(" ");
					}
				}
				bw1.newLine();
			}
			bw1.close();
			fw1.close();
			
		}catch(IOException m1) {
			System.out.println("Error in reading file FRFRImp.txt");
		}
		System.out.println("In merge function:- size = "+size+" size2 = "+ size2+" size3= "+size3);
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
	     labeliteration.setBackground(new java.awt.Color(71, 120, 197));
	     labeliteration.setForeground(new java.awt.Color(255, 255, 255));
	     next_iteration.setBackground(new java.awt.Color(71, 120, 197));
	     next_iteration.setForeground(new java.awt.Color(255, 255, 255));
	     next_iteration.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     next_iteration.setBorderPainted(false);
	     iteration_area.setEditable(false);
	     viewrequirements.setBackground(new java.awt.Color(0, 51, 102));
	     viewrequirements.setForeground(new java.awt.Color(255, 255, 255));
	     viewrequirements.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	     viewrequirements.setBorderPainted(false);
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
	     next_iteration.addMouseListener(new java.awt.event.MouseAdapter() {
	    	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	    	next_iteration.setBackground(Color.GRAY);
	    	    }

	    	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	    	next_iteration.setBackground(new java.awt.Color(71, 120, 197));
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
	     viewrequirements.addMouseListener(new java.awt.event.MouseAdapter() {
	    	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	    	viewrequirements.setBackground(Color.GRAY);
	    	    }

	    	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	    	viewrequirements.setBackground(new java.awt.Color(0, 51, 102));
	    	    }
	    	});
	     viewrequirements.addActionListener(new ActionListener() {
		        @Override
		         public void actionPerformed(final ActionEvent e) {
		        	create_requirementsgraph();
		        }
	     });
	     javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(btnPanel1);
	      btnPanel1.setBackground(new Color(0,51,102));
	        btnPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(  		
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(viewrequirements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addComponent(btn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	        
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(120, 120, 120)
	                .addComponent(viewrequirements, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(36, 36, 36)
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
                               .addComponent(btn6)
                               .addGap(50, 50, 50)  
                               .addComponent(labeliteration));  
	       groupLayout.setVerticalGroup(  
                    groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)  
                    			.addGap(50, 50, 50)
                    			 .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE) 
                               .addGap(50, 50, 50)  
                               .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addGap(50, 50, 50)
                               .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addGap(50, 50, 50)
                               .addComponent(labeliteration, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addGap(50, 50, 50));
	       /*  .addComponent(iteration_area, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addGap(50, 50, 50)
                               .addComponent(next_iteration, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addGap(50, 50, 50)*/
	       /*.addGap(50, 50, 50)  
                               .addComponent(iteration_area)
                               .addGap(50, 50, 50)  
                               .addComponent(next_iteration)*/
	       
	      iteration_area.setBounds(600, 15, 70, 30);
	      btnPanel2.add(iteration_area);
	      next_iteration.setBounds(700, 10, 100, 30);
	      btnPanel2.add(next_iteration);
	      next_iteration.addActionListener(new ActionListener() {
		        @Override
		         public void actionPerformed(final ActionEvent e) {
		        	 try {
		   	    	  FileReader fread=new FileReader("Iteration.txt");
		   	    	  int i;
		   	    	  char c;
		   	    	  String temp="";
		   	    	  while((i=fread.read())!=-1) {
		   	    		  if(i!=10) {
		   	    			  c=(char)i;
		   	    			  temp=temp.concat(Character.toString(c));
		   	    		  }
		   	    	  }
		   	    	  iteration_count=Integer.valueOf(temp)+1;
		   	    	  iteration_area.setText(String.valueOf(iteration_count));
		   	    	  fread.close();
		   	    	  FileWriter fw1 = new FileWriter("Iteration.txt",false); 
		   	    	  BufferedWriter bw1 = new BufferedWriter(fw1);
		   	    	  bw1.write(String.valueOf(iteration_count));
		   	    	  bw1.close();
		   	    	  fw1.close();
		   	    	  create_files();
		   	      }catch(IOException er) {
		   	    	  System.out.println("File Reading Error!");
		   	      }
		        }
	      });
	      try {
	    	  FileReader fread=new FileReader("Iteration.txt");
	    	  int i;
	    	  char c;
	    	  String temp="";
	    	  while((i=fread.read())!=-1) {
	    		  if(i!=10) {
	    			  c=(char)i;
	    			  temp=temp.concat(Character.toString(c));
	    		  }
	    	  }
	    	  iteration_area.setText(temp);
	    	  iteration_count=Integer.valueOf(temp);
	    	  fread.close();
	    	  System.out.println("Iteration Count set to "+iteration_count);
	    	 // find_changeCount();
	      }catch(IOException er) {
	    	  System.out.println("File Reading Error!");
	      }
	      mainframe.add(panel, BorderLayout.CENTER);
	      mainframe.add(btnPanel1, BorderLayout.WEST);
	      mainframe.add(btnPanel2, BorderLayout.NORTH);
	      mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      mainframe.setVisible(true);
	      
	}
	public static void create_files() {
		String fname1="Iteration"+iteration_count+"\\"+"FR.txt";
		int prevIterationCount=iteration_count-1;
		String fname2="Iteration"+prevIterationCount+"\\"+"FR.txt";
		try {
			String fname3= "Iteration"+iteration_count;
			File f1=new File(fname3);
			if(!f1.exists()) {
			boolean bool = f1.mkdir(); 
			}
			FileWriter fw1 = new FileWriter(fname1, true); 
            BufferedWriter bw1 = new BufferedWriter(fw1);
            FileReader fread=new FileReader(fname2);
            int i;
            char c;
            while((i=fread.read())!=-1) {
            	c=(char)i;
            	bw1.write(c);
            }
            fread.close();
            bw1.close();
            fw1.close();	
			fname1="Iteration"+iteration_count+"\\"+"NFR.txt";
			fname2="Iteration"+prevIterationCount+"\\"+"NFR.txt";
			fw1 = new FileWriter(fname1, true); 
			bw1 = new BufferedWriter(fw1);
           fread=new FileReader(fname2);
           while((i=fread.read())!=-1) {
           	c=(char)i;
           	bw1.write(c);
           }
           fread.close();
           bw1.close();
           fw1.close();
           fname1="Iteration"+iteration_count+"\\"+"FRFR.txt";
			fname2="Iteration"+prevIterationCount+"\\"+"FRFR.txt";
			fw1 = new FileWriter(fname1, true); 
			bw1 = new BufferedWriter(fw1);
          fread=new FileReader(fname2);
          while((i=fread.read())!=-1) {
          	c=(char)i;
          	bw1.write(c);
          }
          fread.close();
          bw1.close();
          fw1.close();
          fname1="Iteration"+iteration_count+"\\"+"FRNFR.txt";
			fname2="Iteration"+prevIterationCount+"\\"+"FRNFR.txt";
			fw1 = new FileWriter(fname1, true); 
			bw1 = new BufferedWriter(fw1);
        fread=new FileReader(fname2);
        while((i=fread.read())!=-1) {
        	c=(char)i;
        	bw1.write(c);
        }
        fread.close();
        bw1.close();
        fw1.close();
        fname1="Iteration"+iteration_count+"\\"+"NFRNFR.txt";
		fname2="Iteration"+prevIterationCount+"\\"+"NFRNFR.txt";
		fw1 = new FileWriter(fname1, true); 
		bw1 = new BufferedWriter(fw1);
      fread=new FileReader(fname2);
      while((i=fread.read())!=-1) {
      	c=(char)i;
      	bw1.write(c);
      }
      fread.close();
      bw1.close();
      fw1.close();
      fname1="Iteration"+iteration_count+"\\"+"Parameter.txt";
		fname2="Iteration"+prevIterationCount+"\\"+"Parameter.txt";
		fw1 = new FileWriter(fname1, true); 
		bw1 = new BufferedWriter(fw1);
    fread=new FileReader(fname2);
    while((i=fread.read())!=-1) {
    	c=(char)i;
    	bw1.write(c);
    }
    fread.close();
    bw1.close();
    fw1.close();
		}catch(IOException er2) {
			System.out.println("File error in create_files function");
		}
	}
	public static void create_requirementsgraph() {
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		Graph graph = new MultiGraph("Requirements Graph");
		 graph.setAttribute("ui.stylesheet", "node {size : 40px;text-size: 16; fill-color: yellow;text-mode:normal; text-style: bold; text-alignment: center; text-background-mode: none; fill-mode: dyn-plain; text-visibility-mode: normal;}");
		 create_list();
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
	   	 		v3=v3.concat("D:"+String.valueOf(frfr.value));
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
	   	 		v3=v3.concat("S:"+String.valueOf(frnfr.value));
	   	 		String label=v1+"-"+v2;
	   	 		final Edge edge1 = graph.addEdge(label, v1, v2, true);
	   	 		edge1.addAttribute("layout.weight", 16);
	   	 		edge1.addAttribute("ui.label", v3);
	   	 		edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
	   	 		frnfr=frnfr.next;
		 }
		 Edge1 nfrnfr=nfrnfrroot;
		 while(nfrnfr!=null) {
			 	String v1=nfrnfr.id1;
	   	 		String v2=nfrnfr.id2;
	   	 		String v3="";
	   	 		v3=v3.concat("C:"+String.valueOf(nfrnfr.value));
	   	 		String label=v1+"-"+v2;
	   	 		final Edge edge1 = graph.addEdge(label, v1, v2, false);
	   	 		edge1.addAttribute("layout.weight", 16);
	   	 		edge1.addAttribute("ui.label", v3);
	   	 		frnfr=frnfrroot;
   	 			edge1.addAttribute("ui.style", "text-size:16; text-style: bold; size: 2px; fill-color: rgb(46,139,87); text-color: rgb(0,0,0);");
	   	 		nfrnfr=nfrnfr.next;
		 }
		 for (final org.graphstream.graph.Node node : graph) {
			 node.addAttribute("ui.label", node.getId());
			 String k= node.getId();
			 if(k.contains("fr") && !k.contains("nfr")) {
				 node.addAttribute("layout.weight", 150);
				 node.addAttribute("ui.style", "shape: circle; fill-color: rgb(0,100,255); text-color: rgb(255,255,255);");	 
			 }
			 else {
				 node.addAttribute("layout.weight", 150);
				 node.addAttribute("ui.style", "shape: rounded-box; fill-color: rgb(102,204,0); text-color: rgb(255,255,255);"); 
			 }
			 
		 }
		 Viewer viewer = graph.display();
		 viewer.enableAutoLayout();
		 viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
		
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
	  // test_fileread();
	   createframe();
        }
   public static void test_fileread() {
		
		int iteration_count=1;
		String fname="Iteration"+iteration_count+"\\"+"FRFR.txt";
		frfrroot=null;
		System.out.println("File name = "+fname);
		try {
		File f1=new File(fname);
		 FileReader fread= new FileReader(fname);
			//FileWriter fw1 = new FileWriter(fname, false); 
	       //BufferedWriter bw1 = new BufferedWriter(fw1);	
		if(f1.exists()) {

	           //create_list();
	           int cflag=0;
	          
			int readc=0;
			String temp="";
			char c;
			
			
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
			}
			}catch(IOException pr) {
				System.out.println("Errorrrr");
			}
			Edge1 k=frfrroot;
			while(k!=null) {
				
			System.out.println(k.id1+" "+k.id2);
				k=k.next;
			}
	
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
