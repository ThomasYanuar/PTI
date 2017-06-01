/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feed;

import java.util.LinkedList;

/**
 *
 * @author Kirizu
 */
public class SongRequest {

    private String user;
    private String artis;
    private String title;

    public static LinkedList<SongRequest> songList = new LinkedList();

    public SongRequest() {
    }

    public SongRequest(String user, String artis, String title) {
        this.user = user;
        this.artis = artis;
        this.title = title;
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

//    public void addList(String user, String artis, String title) {
//        SongRequest songRequest = new SongRequest();
//        songList.add(new SongRequest(user, artis, title));
//    }

    public void PrintRequest(String user, String artis, String title) {
//        int n = 0;
//        for (SongRequest songRequest : songList) {
//            String user = songRequest.getUser();
//            String artis = songRequest.getArtis();
//            String title = songRequest.getTitle();
//            songList.removeFirst();
//            System.out.println(user + " : " + artis + " - " + title);
//        }
        System.out.println(user + " : " + artis + " - " + title);
    }

    public void MakeRequest(String user, String text) {
        if (text.toLowerCase().contains("!request")) {
            SongRequest songRequest = new SongRequest();
            String temp = text.replaceAll("@Thomas_Yanuar ", "");
            String[] temp2 = temp.split("[!]");
            int i, j;
            for (i = 0; i < temp2.length - 1; i++) {
                if (temp2[i].contains("request")) {
                    j = i;
                }
            }
            String temp3 = temp2[i].replaceAll("request ", "");
            String[] textSplit = temp3.split("[-]");
            songRequest.PrintRequest(user, textSplit[0], textSplit[1]);
        }
    }

    public static void main(String[] args) {
        SongRequest songRequest = new SongRequest();
//        int a=1;
//        for (int i = 0; i < 10; i++) {
//            songRequest.addList(String.valueOf(a),String.valueOf(a),String.valueOf(a));
//            a++;
//        }
        System.out.println("<><><><><><><><><><><><><><><><><><>");
        songRequest.MakeRequest("a", "@Thomas_Yanuar gan minta lagunya !request J Rock - dia apa dia");
        songRequest.MakeRequest("b", "@Thomas_Yanuar gan minta lagunya !request J Rock - dia apa dia");
        songRequest.MakeRequest("c", "@Thomas_Yanuar gan minta lagunya !request J Rock - dia apa dia");
        songRequest.MakeRequest("a", "#reqest J-Rock = dia apa dia");
//        songRequest.getList();
    }

}
