package memory;

import javax.swing.JFrame;

public class setFrame {
	 public static void main(String[] args) {
	        JFrame fr = new JFrame("MEMORY"); 
	        fr.setSize(600, 600); //ũ�� ����
	        fr.setLocationRelativeTo(null);  //����� ��ġ
	        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //������ �޸� ���� 
	        fr.setVisible(true);  //���̰� ����
	    }

}
