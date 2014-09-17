package pkg2014.pkg02.pkg27.rmi.example;

import java.io.Serializable;

public class scores implements Serializable {

    String strPlayer1;
    String strPlayer2;

    int player1set1, player2set1;
    int player1set2, player2set2;
    int player1set3, player2set3;

    public scores() {
        strPlayer1 = "";
        strPlayer2 = "";

        player1set1 = 0;
        player1set2 = 0;
        player1set3 = 0;

        player2set1 = 0;
        player2set2 = 0;
        player2set3 = 0;
    }

    public void setNames(String strPlayer1, String strPlayer2) {
        this.strPlayer1 = strPlayer1;
        this.strPlayer2 = strPlayer2;
    }

    public void setSet1Scrore(int player1set1, int player2set1) {
        this.player1set1 = player1set1;
        this.player2set1 = player2set1;

    }
    public void setSet2Scrore(int player1set2, int player2set2) {
        this.player1set2 = player1set2;
        this.player2set2 = player2set2;

    }
    public void setSet3Scrore(int player1set3, int player2set3) {
        this.player1set3 = player1set3;
        this.player1set3 = player2set3;

    }
}
