package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		
		setSize(Main.SCREEN_height, Main.SCREEN_height);//���� ȭ�� â ũ��
		setResizable(false); 							//����ڰ� ȭ�� ũ�⺯�� �Ұ�
		setLocationRelativeTo(null); 					//ȭ�� �� �߾ӿ� ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����â ����� ���α׷� ��ü ����
		setVisible(true); 								//ȭ�� �������
	}

}
