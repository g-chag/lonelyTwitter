package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.R.string;
import android.test.ActivityInstrumentationTestCase2;
import java.util.Date;

public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

		private static final LonelyTweetModel LonelyTweetModel = null;
		private static final TweetListModel TweetListModel = null;

		public TweetListModelTest() {
			super(LonelyTwitterActivity.class);
		}
		
		public void testFiveIsFive() {
			assertEquals(5, 5);
		}
		
		public void TestTweetListModel() {
			TweetListModel tlm = new TweetListModel();
		}
		
		public void testAdd() {
			LonelyTweetModel t = new LonelyTweetModel("Hello");
			TweetListModel tlm = new TweetListModel();
			tlm.add(t);
			assertTrue(tlm.hasTweet(t));
		}
		
		public void testGetTweet() {
			// the code in this function was obtained from http://tutorials.jenkov.com/java-date-time/java-util-date.html September 30, 2014
			java.util.Date date1 = new java.util.Date();
			java.util.Date date2 = new java.util.Date();
			int comparison = date1.compareTo(date2);
			if (date1 == date2);
				assertTrue();
			}
		
		public void testHasTweet() {
			LonelyTweetModel t1 = new LonelyTweetModel("a");
			LonelyTweetModel t2 = new LonelyTweetModel("b");
			LonelyTweetModel t3 = new LonelyTweetModel("c");
			LonelyTweetModel t4 = new LonelyTweetModel("d");
			LonelyTweetModel t5 = new LonelyTweetModel("e");
			LonelyTweetModel t6 = new LonelyTweetModel("a");
			TweetListModel tlm = new TweetListModel();
			tlm.add(t1);
			tlm.add(t2);
			tlm.add(t3);
			tlm.add(t4);
			tlm.add(t5);
			tlm.add(t6);
			t1 = t6;
			assertTrue();		}
		
		public void testRemoveTweet() {
			LonelyTweetModel t1 = new LonelyTweetModel("a");
			LonelyTweetModel t2 = new LonelyTweetModel("b");
			LonelyTweetModel t3 = new LonelyTweetModel("c");
			LonelyTweetModel t4 = new LonelyTweetModel("d");
			LonelyTweetModel t5 = new LonelyTweetModel("e");
			TweetListModel tlm = new TweetListModel();
			tlm.add(t1);
			tlm.add(t2);
			tlm.add(t3);
			tlm.add(t4);
			tlm.add(t5);
			tlm.remove(t1);
			assertTrue();		}
		
		public void testGetCount() {	
			LonelyTweetModel t1 = new LonelyTweetModel("a");
			LonelyTweetModel t2 = new LonelyTweetModel("b");
			LonelyTweetModel t3 = new LonelyTweetModel("c");
			LonelyTweetModel t4 = new LonelyTweetModel("d");
			LonelyTweetModel t5 = new LonelyTweetModel("e");
			TweetListModel tlm = new TweetListModel();
			tlm.add(t1);
			tlm.add(t2);
			tlm.add(t3);
			tlm.add(t4);
			tlm.add(t5);
			int numberOfTweets = tlm.size();
			assertTrue();
		}

		private void assertTrue() {
			// TODO Auto-generated method stub
			
		}
}
