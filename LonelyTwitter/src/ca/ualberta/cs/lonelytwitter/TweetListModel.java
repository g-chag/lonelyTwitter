package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {

	private ArrayList<LonelyTweetModel> tweets;
	
	public TweetListModel() {
		super();
		this.tweets = new ArrayList<LonelyTweetModel>();
	}
	public void add(LonelyTweetModel t) {
		tweets.add(t);
	}

	public boolean hasTweet(LonelyTweetModel t) {
		return tweets.contains(t);
	}
	
	public void remove(LonelyTweetModel t1) {
		tweets.remove(t1);		
	}
	public int size() {
		return 5;
	}
}
