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
public class SongRequest{
    private String user;
    private String artis;
    private String title;
        
    public static LinkedList<SongRequest> songList = new LinkedList();

    public SongRequest() {}
    
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
    
    public void addList(String user, String artis, String title) {
        SongRequest songRequest = new SongRequest();
        songList.add(new SongRequest(user,artis,title));
    }

    public void getList() {
        int n = 0;
        for (SongRequest songRequest : songList) {
            String user = songRequest.getUser();
            String artis = songRequest.getArtis();
            String title = songRequest.getTitle();
            System.out.println(user + " : " + artis + " - " + title);
        }
    }
    
    public void makeList(String text){
        SongRequest songRequest = new SongRequest();
        String[] textSplit = text.split("[#]");
        songRequest.addList(user, artis, title);
        
    }

    public static void main(String[] args) {
        SongRequest songRequest = new SongRequest();
        int a=1;
        for (int i = 0; i < 10; i++) {
            songRequest.addList(String.valueOf(a),String.valueOf(a),String.valueOf(a));
            a++;
        }
        songRequest.getList();
        System.out.println("<><><><><><><><><><><><><><><><><><>");
        
    }
    
    
    
}
