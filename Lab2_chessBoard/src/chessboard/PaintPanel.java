
package chessboard;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PaintPanel extends JPanel{
	/**
	 * ���̵Ļ�����
	 */
	private static final long serialVersionUID = 1L;
	private int tr = 0, tc = 0;//tr��tc���������ϽǵĿ�ʼ��������ϵ���ʼ�����
	private int specialPoR = 0, specialPoC = 1;//���ⷽ�����ڵ�λ��(Ĭ����0��1��)
	private int level=2,size;
	private int dx;//������ÿ������Ŀ��
	ChessBoard chessBoard;
	public PaintPanel(){
		level=2;
		size = (int) Math.pow(2,level);
		this.setBackground(Color.white);
		
	}
	//���������еķ���(���ⷽ��)
	public void paint(Graphics g){
		super.paint(g);
		dx =(int)this.getSize().width/size;
		g.setColor(Color.white);
		g.drawLine(tr+ specialPoC*dx, tc + specialPoR*dx, tr+ specialPoC*dx+dx, tc + specialPoR*dx);
		g.drawLine(tr+ specialPoC*dx, tc + specialPoR*dx, tr+ specialPoC*dx, tc + specialPoR*dx+dx);
		g.setColor(Color.black);
		g.fillRect(tr+ specialPoC*dx,tc + specialPoR*dx,dx,dx);
		//�������������Լ���L�͹��Ƹ���
		System.out.println("width:"+this.getSize().width+" "+this.getSize().height);
		chessBoard = new ChessBoard(0,0,specialPoR,specialPoC,size,g,this.getSize().width);
	}
	
	public void paintMeth(JTextField text1,JTextField text2,JTextField text3) {
		size = (int) Math.pow(2,Integer.parseInt(text1.getText()));
		specialPoR = Integer.parseInt(text2.getText())-1;
		specialPoC = Integer.parseInt(text3.getText())-1;
		repaint();
	}
}
