package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	/*���� ���۸� ��� ���*/
	//���ۿ� �̹����� ��� �� �������� ��������
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackGround;
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);//���� ȭ�� â ũ��
		setResizable(false); 							//����ڰ� ȭ�� ũ�⺯�� �Ұ�
		setLocationRelativeTo(null); 					//ȭ�� �� �߾ӿ� ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����â ����� ���α׷� ��ü ����
		setVisible(true); 								//ȭ�� �������
		
		//Main class�� ��ġ�� ������� �̹����� ���� �̹��� instance�� introBackGround������ �ʱ�ȭ
		introBackGround = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
		
	}
	 
	//��
	public void paint(Graphics g) {
		screenImage = createImage( Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT );	//1280x720 ũ���� �̹����� ����� screenImage�� ����
		screenGraphic = screenImage.getGraphics();							//screenImage�� �̿��ؼ� Graphics ��ü�� ����
		screenDraw(screenGraphic);											//screenGraphic�� �׸��� �׷���
		g.drawImage(screenImage, 0, 0, null);								//screenImage�̹����� 0,0��ġ�� �׷��ش�.
		
	}

	private void screenDraw(Graphics g) {
		g.drawImage(introBackGround, 0, 0, null);
		this.repaint();
	}

}
