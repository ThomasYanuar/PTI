/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Feed.SongRequest;
import java.util.Date;
import twitter4j.DirectMessage;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserStreamListener;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Yoseph
 */
public class TwitterStreamAPI {

    public static void main(String[] args) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey("ejlJRoqj4tozPbP5esGw4ifeq");
        cb.setOAuthConsumerSecret("bHfcZZUA5O51o8curikFdCOi8hqUvrRx6xNl7LJzYyb4olIImm");
        cb.setOAuthAccessToken("421779736-wEIwNOrATEokxRpnOTKExwAXhxCTJWNYTyyKRoVF");
        cb.setOAuthAccessTokenSecret("L4MgdtDyjyOhaQgUPeXqnaEpmZNyf0LmSB4qFyzMgyTCF");

        TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();

        UserStreamListener listener = new UserStreamListener() {
            @Override
            public void onStatus(Status status) {
                SongRequest songRequest = new SongRequest();
                songRequest.MakeRequest(status.getUser().getScreenName(), status.getText());
                Date dateCreate = status.getCreatedAt();
//                songRequest.getList();
//                System.out.println("onStatus @" + status.getUser().getScreenName() + " - " + status.getText());
            }

            @Override
            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
                //System.out.println("Got a status deletion notice id:" + statusDeletionNotice.getStatusId());
            }

            @Override
            public void onDeletionNotice(long directMessageId, long userId) {
                // System.out.println("Got a direct message deletion notice id:" + directMessageId);
            }

            @Override
            public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
                // System.out.println("Got a track limitation notice:" + numberOfLimitedStatuses);
            }

            @Override
            public void onScrubGeo(long userId, long upToStatusId) {
                // System.out.println("Got scrub_geo event userId:" + userId + " upToStatusId:" + upToStatusId);
            }

            @Override
            public void onStallWarning(StallWarning warning) {
                // System.out.println("Got stall warning:" + warning);
            }

            @Override
            public void onFriendList(long[] friendIds) {
                /*System.out.print("onFriendList");
                for (long friendId : friendIds) {
                    System.out.print(" " + friendId);
                }
                System.out.println();*/
            }

            @Override
            public void onFavorite(User source, User target, Status favoritedStatus) {
                /* System.out.println("onFavorite source:@"
                        + source.getScreenName() + " target:@"
                        + target.getScreenName() + " @"
                        + favoritedStatus.getUser().getScreenName() + " - "
                        + favoritedStatus.getText());*/
            }

            @Override
            public void onUnfavorite(User source, User target, Status unfavoritedStatus) {
                /*System.out.println("onUnFavorite source:@"
                                + source.getScreenName() + " target:@"
                                + target.getScreenName() + " @"
                                + unfavoritedStatus.getUser().getScreenName()
                                + " - " + unfavoritedStatus.getText());*/
            }

            @Override
            public void onFollow(User source, User followedUser) {
                /*System.out.println("onFollow source:@"
                        + source.getScreenName() + " target:@"
                        + followedUser.getScreenName());*/
            }

            @Override
            public void onDirectMessage(DirectMessage directMessage) {
                /* System.out.println("onDirectMessage text:"
                        + directMessage.getText());*/
            }

            @Override
            public void onUserListMemberAddition(User addedMember, User listOwner, UserList list) {
                /*System.out.println("onUserListMemberAddition added member:@"
                        + addedMember.getScreenName()
                        + " listOwner:@" + listOwner.getScreenName()
                        + " list:" + list.getName());*/
            }

            @Override
            public void onUserListMemberDeletion(User deletedMember, User listOwner, UserList list) {
                /* System.out.println("onUserListMemberDeleted deleted member:@"
                        + deletedMember.getScreenName()
                        + " listOwner:@" + listOwner.getScreenName()
                        + " list:" + list.getName());*/
            }

            @Override
            public void onUserListSubscription(User subscriber, User listOwner, UserList list) {
                /*System.out.println("onUserListSubscribed subscriber:@"
                        + subscriber.getScreenName()
                        + " listOwner:@" + listOwner.getScreenName()
                        + " list:" + list.getName());*/
            }

            @Override
            public void onUserListUnsubscription(User subscriber, User listOwner, UserList list) {
                /*System.out.println("onUserListUnsubscribed subscriber:@"
                        + subscriber.getScreenName()
                        + " listOwner:@" + listOwner.getScreenName()
                        + " list:" + list.getName());*/
            }

            @Override
            public void onUserListCreation(User listOwner, UserList list) {
                /*System.out.println("onUserListCreated listOwner:@"
                        + listOwner.getScreenName()
                        + " list:" + list.getName());*/
            }

            @Override
            public void onUserListUpdate(User listOwner, UserList list) {
                /*System.out.println("onUserListUpdated listOwner:@"
                        + listOwner.getScreenName()
                        + " list:" + list.getName());*/
            }

            @Override
            public void onUserListDeletion(User listOwner, UserList list) {
                /*System.out.println("onUserListDestroyed listOwner:@"
                        + listOwner.getScreenName()
                        + " list:" + list.getName());*/
            }

            @Override
            public void onUserProfileUpdate(User updatedUser) {
                //System.out.println("onUserProfileUpdated user:@" + updatedUser.getScreenName());
            }

            @Override
            public void onBlock(User source, User blockedUser) {
                /*System.out.println("onBlock source:@" + source.getScreenName()
                        + " target:@" + blockedUser.getScreenName());*/
            }

            @Override
            public void onUnblock(User source, User unblockedUser) {
                /*System.out.println("onUnblock source:@" + source.getScreenName()
                        + " target:@" + unblockedUser.getScreenName());*/
            }

            @Override
            public void onException(Exception ex) {
                /* ex.printStackTrace();
                System.out.println("onException:" + ex.getMessage());*/
            }

            @Override
            public void onUnfollow(User user, User user1) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onUserSuspension(long l) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onUserDeletion(long l) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onRetweetedRetweet(User user, User user1, Status status) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onFavoritedRetweet(User user, User user1, Status status) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onQuotedTweet(User user, User user1, Status status) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        String useIds[] = {"99901654"};

        twitterStream.addListener(listener);
        twitterStream.user(useIds);
    }
}
