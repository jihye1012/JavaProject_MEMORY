package memory;

import javax.swing.JFrame;

public class setFrame {
	 public static void main(String[] args) {
	        JFrame fr = new JFrame("MEMORY"); 
	        fr.setSize(600, 600); //크기 설정
	        fr.setLocationRelativeTo(null);  //가운데에 배치
	        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //닫으면 메모리 제거 
	        fr.setVisible(true);  //보이게 설정
	    }

}
