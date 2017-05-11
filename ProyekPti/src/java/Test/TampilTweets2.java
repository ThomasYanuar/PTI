/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ApiConnect.Connection;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.ResponseList;

/**
 *
 * @author Kirizu
 */
public class TampilTweets2 {

    public static void main(String[] args) throws TwitterException {

        // The factory instance is re-useable and thread safe.
        Twitter twitter = new Connection().GetConnection();
        ResponseList<Status> statuses = twitter.getMentionsTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getScreenName() + "\n"
                    + status.getText());
        }
    }
}
