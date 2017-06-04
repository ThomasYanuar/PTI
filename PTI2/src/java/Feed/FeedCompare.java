/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feed;

import java.util.Comparator;

/**
 *
 * @author Yoseph
 */
public class FeedCompare implements Comparator<SongRequest>{

    @Override
    public int compare(SongRequest o1, SongRequest o2) {
        if(o1.getVote()< o2.getVote()){
            return 1;
        } else {
            return -1;
        }
    }
    
}
