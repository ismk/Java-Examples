/*
 * Scores.java
 *
 * Created on May 12, 2007, 11:00 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package badminton;

/**
 *
 * @author Administrator
 */
public class Scores implements java.io.Serializable {
	String strPlayer1;
	String strPlayer2;

	int player1Set1, player2Set1;
	int player1Set2, player2Set2;
	int player1Set3, player2Set3;

	public Scores() {
		strPlayer1 = "";
		strPlayer2 = "";

		player1Set1 = 0;
		player2Set1 = 0;

		player1Set2 = 0;
		player2Set2 = 0;

		player1Set3 = 0;
		player2Set3 = 0;
	}

	public void setNames(String strPlayer1, String strPlayer2) {
		this.strPlayer1 = strPlayer1;
		this.strPlayer2 = strPlayer2;
	}

	public void setSet1Score(int player1Set1, int player2Set1) {
		this.player1Set1 = player1Set1;
		this.player2Set1 = player2Set1;
	}

	public void setSet2Score(int player1Set2, int player2Set2) {
		this.player1Set2 = player1Set2;
		this.player2Set2 = player2Set2;
	}

	public void setSet3Score(int player1Set3, int player2Set3) {
		this.player1Set3 = player1Set3;
		this.player2Set3 = player2Set3;
	}
}

