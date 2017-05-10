/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ApiConnect.*;
import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author Sekar
 */
public class TampilTweets {

    public static void main(String[] args) throws TwitterException {
        // The factory instance is re-useable and thread safe.
        Twitter twitter = new Connection().GetConnection();
//        Twitter twitter = connection.getSingleton
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":"
                    + status.getText());
        }
    }
}
