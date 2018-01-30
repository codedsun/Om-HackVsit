package com.suneetsrivastava.om;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SleepStory extends Activity {
    public TextView text;
    public TextView storyTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_story);
        storyTitle = findViewById(R.id.storyTitle);
        Bundle bundle = getIntent().getExtras();
        int position =bundle.getInt("position");
        Log.d("TAG","Position : "+position);
        String[] title = {"A Pound Butter","The Obstacle in Our Path","Everyone Has a Story in Life","BE PATIENT","LET GO"};
        String data[] = {"Once, there was a farmer who regularly sold butter to a baker. One day, the baker decided to weigh the butter to see if he was getting the exact amount that he asked for. He found out that he wasn’t, so he took the farmer to court.\n" +
                "The judge asked the farmer if he uses any measure to weigh the butter. The farmer replied, “Your Honor, I’m primitive. I don’t have a proper measure, but I do have a scale.”\n" +
                "The judge replied, “Then how do you weight the butter?”\n" +
                "The farmer replied; “Your Honor, long before the baker started buying butter from me, I have been buying a pound loaf of bread from him. Every day, when the baker brings the bread, I put it on the scale and give him the same weight in butter. If anyone is to be blamed, it’s the baker.”\n" +
                "Moral of the story: In life, you get what you give. Don’t try to cheat others.","In ancient times, a king had his men place a boulder on a roadway. He then hid in the bushes, and watched to see if anyone would move the boulder out of the way. Some of the king’s wealthiest merchants and courtiers passed by and simply walked around it.\n" +
                "Many people blamed the King for not keeping the roads clear, but none of them did anything about getting the stone removed.\n" +
                "One day, a peasant came along carrying vegetables. Upon approaching the boulder, the peasant laid down his burden and tried to push the stone out of the way. After much pushing and straining, he finally managed.\n" +
                "After the peasant went back to pick up his vegetables, he noticed a purse lying in the road where the boulder had been. The purse contained many gold coins and note from the King explain that the gold was for the person who removed the boulder from the road.\n" +
                "Moral of the story: Every obstacle that we come across gives us an opportunity to improve our circumstances, and while the lazy complain, others are creating opportunities through their kind hearts, generosity, and willingness to get things done.","A 24 year old boy seeing out from the train’s window shouted…\n" +
                "“Dad, look the trees are going behind!”\n" +
                "Dad smiled and a young couple sitting nearby, looked at the 24 year old’s childish behavior with pity, suddenly he again exclaimed…\n" +
                "“Dad, look the clouds are running with us!”\n" +
                "The couple couldn’t resist and said to the old man…\n" +
                "“Why don’t you take your son to a good doctor?” The old man smiled and said…“I did and we are just coming from the hospital, my son was blind from birth, he just got his eyes today.”\n" +
                "Every single person on the planet has a story. Don’t judge people before you truly know them. The truth might surprise you.","Sometimes it’s easy to feel like you’re the only one who’s struggling, who’s frustrated or unsatisfied, or barely getting by. That feeling is a lie. And if you just hold on, just find the courage to face it all for another day. Someone or something will find you and make it all okay, because we all need a little help sometimes, someone to help us hear the music in the world, to remind us that it won’t always be this way. That someone is out there, that someone will find you. Sometimes we survive for forgetting and sometimes by taking it within ourselves.\n" +
                "Some day you will find what you are looking for. Or maybe not, maybe you will find something much greater than that.\n" +
                "Everything comes to you in the right moment. Be patient. ","Everybody say at some point you just need to learn “let go”. If it just takes one moment to let go then you never held tightly enough. To a dream, goal, place, person or anything. Let go a little, then hold back on, but with a little less force. The tighter you hold on, the more force you let go with. The deeper you dive, the higher you will fly. The closer you get, the further you will pull away. The weaker you feel the stronger you will become.\n" +
                "The longer you have to wait for something, the more you will appreciate it when it really arrives. The harder you have to wait for something, the more priceless it will become once you achieve it. And the more pain you have to endure in your journey, the sweeter the arrival at your destination. All good things are worth waiting for."};
        text = findViewById(R.id.storyText);
        text.setText(data[position]);
        storyTitle.setText(title[position]);
    }
}
