/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kirizu
 */
public class MakeSongRequest {

    ArrayList<SongRequest> list = new ArrayList();
    LinkedList<ArrayList> songList = new LinkedList();
    
    public void addList(String user, String artis, String title) {
        SongRequest songRequest = new SongRequest();
        songRequest.setUser(user);
        songRequest.setArtis(artis);
        songRequest.setTitle(title);
        list.add(songRequest);
        songList.addFirst(list);
    }

    public void getList() {
        int n = 0;
        while (songList.isEmpty()) {
            System.out.println(n++);
            ArrayList<SongRequest> tempList = new ArrayList();
            tempList = songList.removeLast();
            String user = tempList.getUser()
            String artis = songList.removeFirst().getArtis();
            String title = songList.removeFirst().getTitle();
//            String user = songList.removeFirst().getUser();
//            String artis = songList.removeFirst().getArtis();
//            String title = songList.removeFirst().getTitle();
            System.out.println(user + " : " + artis + " - " + title);
        }
    }

    public static void main(String[] args) {
        MakeSongRequest makeSongRequest = new MakeSongRequest();
        makeSongRequest.addList("a", "a", "a");
        makeSongRequest.addList("b", "b", "b");
        makeSongRequest.getList();
    }
}
