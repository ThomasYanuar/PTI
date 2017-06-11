package Feed;

import static Feed.SongRequest.songListQueue;

public class twitterfeedsrvlt {

    public static void main(String[] args) {
        for (SongRequest songRequest : songListQueue) {
            String user = songRequest.getUser();
            String artis = songRequest.getArtis();
            String title = songRequest.getTitle();
            System.out.println(user + " : " + artis + " - " + title);
        }
//        new Feed.SongRequest().PrintRequestQueue();
//        System.out.println("<><><><><>");
//        new Feed.SongRequest().PrintRequestChart();
    }
}
