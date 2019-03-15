package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	/*더블 버퍼링 기법 사용*/
	//버퍼에 이미지를 담아 매 순간마다 갱신해줌
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackGround;
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);//게임 화면 창 크기
		setResizable(false); 							//사용자가 화면 크기변경 불가
		setLocationRelativeTo(null); 					//화면 정 중앙에 출력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//게임창 종료시 프로그램 전체 종료
		setVisible(true); 								//화면 정상출력
		
		//Main class의 위치를 기반으로 이미지를 얻어와 이미지 instance를 introBackGround변수에 초기화
		introBackGround = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
		
	}
	 
	//ㅎ
	public void paint(Graphics g) {
		screenImage = createImage( Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT );	//1280x720 크기의 이미지를 만들어 screenImage에 저장
		screenGraphic = screenImage.getGraphics();							//screenImage를 이용해서 Graphics 객체를 얻어옴
		screenDraw(screenGraphic);											//screenGraphic에 그림을 그려줌
		g.drawImage(screenImage, 0, 0, null);								//screenImage이미지를 0,0위치에 그려준다.
		
	}

	private void screenDraw(Graphics g) {
		g.drawImage(introBackGround, 0, 0, null);
		this.repaint();
	}

}
