package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		
		setSize(Main.SCREEN_height, Main.SCREEN_height);//게임 화면 창 크기
		setResizable(false); 							//사용자가 화면 크기변경 불가
		setLocationRelativeTo(null); 					//화면 정 중앙에 출력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//게임창 종료시 프로그램 전체 종료
		setVisible(true); 								//화면 정상출력
	}

}
