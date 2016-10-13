
package chessboard;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PaintPanel extends JPanel{
	/**
	 * 棋盘的绘制类
	 */
	private static final long serialVersionUID = 1L;
	private int tr = 0, tc = 0;//tr、tc棋盘在左上角的开始的在面板上的起始坐标点
	private int specialPoR = 0, specialPoC = 1;//特殊方格所在的位置(默认在0行1列)
	private int level=2,size;
	private int dx;//棋盘中每个方格的宽高
	ChessBoard chessBoard;
	public PaintPanel(){
		level=2;
		size = (int) Math.pow(2,level);
		this.setBackground(Color.white);
		
	}
	//绘制棋盘中的方格(特殊方格)
	public void paint(Graphics g){
		super.paint(g);
		dx =(int)this.getSize().width/size;
		g.setColor(Color.white);
		g.drawLine(tr+ specialPoC*dx, tc + specialPoR*dx, tr+ specialPoC*dx+dx, tc + specialPoR*dx);
		g.drawLine(tr+ specialPoC*dx, tc + specialPoR*dx, tr+ specialPoC*dx, tc + specialPoR*dx+dx);
		g.setColor(Color.black);
		g.fillRect(tr+ specialPoC*dx,tc + specialPoR*dx,dx,dx);
		//绘制其他方格以及用L型骨牌覆盖
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
