/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feed;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class SongRequest {

    static String tempDate = "";
//    String currentDate = "a";
    static int countDate = -1;
    static String tempText = "";
    private String user;
    private String artis;
    private String title;
    private int vote;

    public static LinkedList<SongRequest> songListQueue = new LinkedList();
    public static LinkedList<SongRequest> songListChart = new LinkedList();
    public static LinkedList<Feed> feedList = new LinkedList();

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
//    public Date getDate() {
//        return date;
//    }
//
//    public void setVote(Date date) {
//        this.date = date;
//    }

    public void addListQueue(String user, String artis, String title) {
        songListQueue.addLast(new SongRequest(user, artis, title));
    }

    public void addListChart(String user, String artis, String title, int vote) {
        songListChart.addLast(new SongRequest(user, artis, title, vote));
    }

    public void addFeedList(String user, String text) {
        feedList.addLast(new Feed(user, text));
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

    public void PrintFeedList() {
        for (Feed feed : SongRequest.feedList) {
            String user = feed.getUser();
            String text = feed.getText();
            System.out.println("@" + user + " : " + text);
        }

    }

    public void MakeRequest(String user, String text) {
        addFeedList(user, text);
        if (!tempText.equals(text)) {
            if (text.toLowerCase().contains("!request")) {
//                JOptionPane.showMessageDialog(null, "masuk");
                System.out.println("");
                SongRequest songRequest = new SongRequest();
                String temp = text.replaceAll("@Thomas_Yanuar ", "");
//                JOptionPane.showMessageDialog(null, temp);
                System.out.println("");
                String[] temp2 = temp.split("[!]");
                int i, j = 0;
                for (i = 0; i < temp2.length; i++) {
                    if (temp2[i].contains("request")) {
                        j = i;
//                        JOptionPane.showMessageDialog(null, "masuk split\n" + i + "\n" + temp2[i]);
                        System.out.println("");
                    }
                }
                String temp3 = temp2[j].replaceAll("request ", "");
//                JOptionPane.showMessageDialog(null, "temp3\n" + temp3);
                System.out.println("");
                String[] textSplit = temp3.split("[-]");
//                JOptionPane.showMessageDialog(null, "textSplit[0]\n" + textSplit[0]);
                System.out.println("");
//                JOptionPane.showMessageDialog(null, "textSplit[1]\n" + textSplit[1]);
                System.out.println("");
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
            }
            tempText = text;
        }
//        JOptionPane.showMessageDialog(null, "tidak masuk");
        System.out.println("");
    }

    public void deleteChart() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String currentDate = dateFormat.format(date);
        if (countDate != 7) {
            if (!tempDate.equals(currentDate)) {
                countDate++;
                tempDate = currentDate;
                System.out.println("tempdate = " + tempDate);
            }
            System.out.println("countdate = " + countDate);
        }
        if (countDate == 7) {
            countDate = 0;
            System.out.println("remove = " + countDate);
            songListChart.removeAll(songListChart);
            songListQueue.removeAll(songListQueue);
            feedList.removeAll(feedList);
        }
    }

    public static void main(String[] args) {
//        SongRequest songRequest = new SongRequest();
//        songRequest.deleteChart();
//        songRequest.currentDate="mi";
//        songRequest.deleteChart();
//        songRequest.currentDate="sen";
//        songRequest.deleteChart();
//        songRequest.currentDate="sel";
//        songRequest.deleteChart();
//        songRequest.currentDate="ra";
//        songRequest.deleteChart();
//        songRequest.currentDate="kam";
//        songRequest.deleteChart();
//        songRequest.currentDate="jum";
//        songRequest.deleteChart();
//        songRequest.currentDate="sab";
//        songRequest.deleteChart();
//        songRequest.currentDate="ming";
//        songRequest.deleteChart();
//        songRequest.currentDate="sen";
//        songRequest.deleteChart();
//        songRequest.currentDate="sel";
//        songRequest.deleteChart();
//        songRequest.currentDate="rab";
//        songRequest.deleteChart();
//        songRequest.currentDate="kam";
//        songRequest.deleteChart();
//        songRequest.currentDate="jum";
//        songRequest.deleteChart();
//        songRequest.currentDate="sab";
//        songRequest.deleteChart();
//        songRequest.currentDate="ming";
//        songRequest.deleteChart();
//        songRequest.currentDate="sen";
    }
}
