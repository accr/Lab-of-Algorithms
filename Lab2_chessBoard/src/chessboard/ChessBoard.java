package chessboard;

import java.awt.*;

public class ChessBoard{
	private int tr = 0, tc =0,dx = 40; 
	public ChessBoard(int t1, int t2, int dr,int dc, int size, Graphics g,int width){
		dx =(int) width/size;
		chessBoard(t1,t2,dr,dc,size,g);
	}
	
	public void chessBoard(int t1, int t2, int dr,int dc, int size, Graphics g){
		if(size == 1) return;
		size = size/2;
		Color color = new Color((int)(Math.random()*256),
		(int)(Math.random()*256),(int)(Math.random()*256));  
  
		if(dr<t1+size && dc<t2+size)
			chessBoard(t1,t2,dr,dc,size,g);
		else{
			g.setColor(Color.white);
			g.drawLine(tr+(t2+size-1)*dx, tc+(t1+size-1)*dx, tr+(t2+size-1)*dx+dx,tc+(t1+size-1)*dx);
			g.drawLine(tr+(t2+size-1)*dx, tc+(t1+size-1)*dx, tr+(t2+size-1)*dx,tc+(t1+size-1)*dx+dx);
			
			g.setColor(color);
			g.fillRect(tr+(t2+size-1)*dx,tc+(t1+size-1)*dx,dx,dx);
			chessBoard(t1,t2,t1+size-1,t2+size-1,size,g);
		}
  
		if(dr<t1+size && dc>=t2+size)
			chessBoard(t1,t2+size,dr,dc,size,g);
		else{
			g.setColor(Color.white);
			g.drawLine(tr+(t2+size)*dx, tc+(t1+size-1)*dx, tr+(t2+size)*dx+dx,tc+(t1+size-1)*dx);
			g.drawLine(tr+(t2+size)*dx, tc+(t1+size-1)*dx, tr+(t2+size)*dx,tc+(t1+size-1)*dx+dx);
			
			g.setColor(color);
			g.fillRect(tr+(t2+size)*dx,tc+(t1+size-1)*dx,dx,dx);
			chessBoard(t1,t2+size,t1+size-1,t2+size,size,g);
		}
  
		if(dr>=t1+size && dc<t2+size)
			chessBoard(t1+size,t2,dr,dc,size,g);
		else{
			g.setColor(Color.white);
			g.drawLine(tr+(t2+size-1)*dx, tc+(t1+size)*dx, tr+(t2+size-1)*dx+dx,tc+(t1+size)*dx);
			g.drawLine(tr+(t2+size-1)*dx, tc+(t1+size)*dx, tr+(t2+size-1)*dx,tc+(t1+size)*dx+dx);
			
			g.setColor(color);
			g.fillRect(tr+(t2+size-1)*dx,tc+(t1+size)*dx,dx,dx);
			chessBoard(t1+size,t2,t1+size,t2+size-1,size,g);
		}
  
		if(dr>=t1+size && dc>=t2+size)
			chessBoard(t1+size,t2+size,dr,dc,size,g);
		else{
			g.setColor(Color.white);
			g.drawLine(tr+(t2+size)*dx, tc+(t1+size)*dx, tr+(t2+size)*dx+dx,tc+(t1+size)*dx);
			g.drawLine(tr+(t2+size)*dx, tc+(t1+size)*dx, tr+(t2+size)*dx,tc+(t1+size)*dx+dx);
			
			g.setColor(color);
			g.fillRect(tr+(t2+size)*dx,tc+(t1+size)*dx,dx,dx);
			chessBoard(t1+size,t2+size,t1+size,t2+size,size,g);
		}
	}
}
