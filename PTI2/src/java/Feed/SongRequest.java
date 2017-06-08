/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feed;

import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class SongRequest {

    static String tempText = "";
    private String user;
    private String artis;
    private String title;
    private int vote;

    public static LinkedList<SongRequest> songListQueue = new LinkedList();
    public static LinkedList<SongRequest> songListChart = new LinkedList();

    public SongRequest() {
    }

    public SongRequest(String user, String artis, String title) {
        this.user = user;
        this.artis = artis;
        this.title = title;
    }

    public SongRequest(String user, String artis, String title, int vote) {
        this.user = user;
        this.artis = artis;
        this.title = title;
        this.vote = vote;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public void addListQueue(String user, String artis, String title) {
        SongRequest songRequest = new SongRequest();
        songListQueue.addLast(new SongRequest(user, artis, title));
    }

    public void addListChart(String user, String artis, String title, int vote) {
        SongRequest songRequest = new SongRequest();
        songListChart.addLast(new SongRequest(user, artis, title, vote));
    }

    public void PrintRequestQueue() {
//        int n = 0;
        for (SongRequest songRequest : songListQueue) {
            String user = songRequest.getUser();
            String artis = songRequest.getArtis();
            String title = songRequest.getTitle();
            System.out.println(user + " : " + artis + " - " + title);
        }
    }

    public void PrintRequestChart() {
//        int n = 0;
        java.util.Collections.sort(songListChart, new FeedCompare());
        for (SongRequest songRequest : songListChart) {
            String user = songRequest.getUser();
            String artis = songRequest.getArtis();
            String title = songRequest.getTitle();
            int vote = songRequest.getVote();
            System.out.println(user + " : " + artis + " - " + title + " vote " + vote);
        }
    }

    public void MakeRequest(String user, String text) {
        if (!tempText.equals(text)) {
            if (text.toLowerCase().contains("!request")) {
//            JOptionPane.showMessageDialog(null, "masuk");
                SongRequest songRequest = new SongRequest();
                String temp = text.replaceAll("@Thomas_Yanuar ", "");
//            JOptionPane.showMessageDialog(null, temp);
                String[] temp2 = temp.split("[!]");
                int i, j = 0;
                for (i = 0; i < temp2.length; i++) {
                    if (temp2[i].contains("request")) {
                        j = i;
//                    JOptionPane.showMessageDialog(null, "masuk split\n"+i+"\n"+temp2[i]);
                    }
                }
                String temp3 = temp2[j].replaceAll("request ", "");
//            JOptionPane.showMessageDialog(null, "temp3\n"+temp3);
                String[] textSplit = temp3.split("[-]");
//            JOptionPane.showMessageDialog(null, "textSplit[0]\n"+textSplit[0]);
//            JOptionPane.showMessageDialog(null, "textSplit[1]\n"+textSplit[1]);
                songRequest.addListQueue(user, textSplit[0], textSplit[1]);
                temp = (user + textSplit[0] + textSplit[1]).toLowerCase();
                boolean find = false;
                int tempVote = 0;
                for (SongRequest sr : songListChart) {
                    if ((sr.getUser() + sr.getArtis() + sr.getTitle()).toLowerCase().equals(temp)) {
                        find = true;
                        tempVote = sr.getVote();
                        tempVote++;
                        sr.setVote(tempVote);
                    }
                }
                if (find == false) {
                    songRequest.addListChart(user, textSplit[0], textSplit[1], 1);
                }
//            if (find=true){
//                songListChart.
//            }
            }
            tempText=text;
        }
//        JOptionPane.showMessageDialog(null, "tidak masuk");
    }

    public static void main(String[] args) {
        SongRequest songRequest = new SongRequest();
//        int a=1;
//        for (int i = 0; i < 10; i++) {
//            songRequest.addList(String.valueOf(a),String.valueOf(a),String.valueOf(a));
//            a++;
//        }
//        System.out.println("<><><><><><><><><><><><><><><><><><>");
//        songRequest.MakeRequest("a", "@Thomas_Yanuar gan minta lagunya !request J Rock - dia apa dia!");
//        songRequest.MakeRequest("b", "@Thomas_Yanuar gan minta lagunya !request J Rock - dia apa dia!");
//        songRequest.MakeRequest("c", "@Thomas_Yanuar gan minta lagunya !request J Rock - dia apa dia!");
//        songRequest.MakeRequest("a", "#reqest J-Rock = dia apa dia");
//        songRequest.PrintRequestQueue();
//        System.out.println("<><><><><><><><><><><><><><><><><><>");
////        System.out.println("\n\n");
//        songRequest.PrintRequestChart();
//        System.out.println("<><><><><><><><><><><><><><><><><><>");
//        songRequest.MakeRequest("b", "@Thomas_Yanuar gan minta lagunya !request J Rock - dia apa dia!");
//        songRequest.MakeRequest("b", "@Thomas_Yanuar gan minta lagunya !request J - dia apa dia!");
//        songRequest.MakeRequest("b", "@Thomas_Yanuar gan minta lagunya !request J - dia apa dia!");
//        songRequest.MakeRequest("b", "@Thomas_Yanuar gan minta lagunya !request J - dia apa dia!");
//        songRequest.MakeRequest("b", "@Thomas_Yanuar gan minta lagunya !request J - dia apa dia!");
//        songRequest.MakeRequest("b", "@Thomas_Yanuar gan minta lagunya !request J - dia apa dia!");
//        songRequest.MakeRequest("b", "@Thomas_Yanuar gan minta lagunya !request J - dia apa dia!");
//        songRequest.MakeRequest("b", "@Thomas_Yanuar gan minta lagunya !request J - dia apa dia!");
//        songRequest.MakeRequest("c", "@Thomas_Yanuar gan minta lagunya !request J Rock - dia apa dia!");
//        System.out.println("<><><><><><><><><><><><><><><><><><>");
        songRequest.PrintRequestQueue();
        System.out.println("<><><><><><><><><><><><><><><><><><>");
        songRequest.PrintRequestChart();
    }

}
