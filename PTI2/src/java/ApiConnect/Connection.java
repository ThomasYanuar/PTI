/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApiConnect;

import twitter4j.*;
import twitter4j.conf.*;

/**
 *
 * @author Sekar
 */
public class Connection {
    String consumerKey = "ejlJRoqj4tozPbP5esGw4ifeq";
    String consumerSecret = "bHfcZZUA5O51o8curikFdCOi8hqUvrRx6xNl7LJzYyb4olIImm";
    String accessToken = "421779736-wEIwNOrATEokxRpnOTKExwAXhxCTJWNYTyyKRoVF";
    String accessTokenSecret = "L4MgdtDyjyOhaQgUPeXqnaEpmZNyf0LmSB4qFyzMgyTCF";
    public Twitter GetConnection() {

        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(consumerKey)
                .setOAuthConsumerSecret(consumerSecret)
                .setOAuthAccessToken(accessToken)
                .setOAuthAccessTokenSecret(accessTokenSecret);

        return new TwitterFactory(cb.build()).getInstance();
    }
    public TwitterStream GetStream() {

        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(consumerKey)
                .setOAuthConsumerSecret(consumerSecret)
                .setOAuthAccessToken(accessToken)
                .setOAuthAccessTokenSecret(accessTokenSecret);

        return new TwitterStreamFactory(cb.build()).getInstance();
    }
    
}
