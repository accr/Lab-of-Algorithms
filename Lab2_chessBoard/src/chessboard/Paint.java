package chessboard;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paint extends JFrame{
	/**
	 * 界面设置
	 */
	private static final long serialVersionUID = 1L;
	private JButton button1;
	JLabel label1, label2, label3,label4;
	JTextField text1, text2, text3;
	ChessBoard chessBoard;
	JPanel p1;
	PaintPanel p;
	public Paint(){
		this.setLayout(new BorderLayout(1,0));
		p = new PaintPanel();
		p1 = new JPanel();
		p1.setBorder(new javax.swing.border.LineBorder(Color.gray));
		Box box1 = Box.createVerticalBox();
		
		JPanel p2 = new JPanel();
		label1 = new JLabel("级数");
		p2.add(label1);
		text1 = new JTextField("2",3);
		p2.add(text1);
		box1.add(p2);
		
		box1.add(Box.createVerticalStrut(3));
		
		JPanel p3 = new JPanel();
		label2 = new JLabel("特殊方格的位置：");
		p3.add(label2);
		box1.add(p3);
		
		box1.add(Box.createVerticalStrut(3));
		JPanel p4 = new JPanel();
		label3 = new JLabel("行：");
		p4.add(label3);
		text2 = new JTextField("1",3);
		p4.add(text2);
		box1.add(p4);
		box1.add(Box.createVerticalStrut(3));
		
		JPanel p5 = new JPanel();
		label4 = new JLabel("列：");
		p5.add(label4);
		text3 = new JTextField("2",3);
		p5.add(text3);
		box1.add(p5);
		box1.add(Box.createVerticalStrut(3));
		
		JPanel p6 = new JPanel();
		button1 = new JButton("棋盘覆盖");
		p6.add(button1);
		box1.add(p6);

		p1.add(box1);
		add(p);
		add(p1,BorderLayout.EAST);
		text1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				p.paintMeth(text1,text2,text3);
				
			}
			
		});
		text2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				p.paintMeth(text1,text2,text3);
				
			}
			
		});
		text3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				p.paintMeth(text1,text2,text3);
				
			}
			
		});
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				p.paintMeth(text1,text2,text3);
				
			}
			
		});
	}

	public static void main(String[] args){
		Paint fram = new Paint();
		fram.setTitle("棋盘覆盖");
		fram.setSize(800,600);
		fram.setLocationRelativeTo(null);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setVisible(true);
	}
}
