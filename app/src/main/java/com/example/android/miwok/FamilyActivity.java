package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    private AudioManager mAudioManager;

    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {
                @Override
                public void onAudioFocusChange(int focusChange) {
                    if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                            focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
                        mMediaPlayer.pause();
                        mMediaPlayer.seekTo(0);

                    }
                    else if(focusChange == AudioManager.AUDIOFOCUS_GAIN){
                        mMediaPlayer.start();

                    }
                    else if(focusChange == AudioManager.AUDIOFOCUS_LOSS){
                        releaseMediaPlayer();
                    }
                }
            };

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        mAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<Word> numberWord = new ArrayList<Word>();
        numberWord.add(new Word("father","әpә", R.drawable.family_father, R.raw.family_father));
        numberWord.add(new Word("mother","әṭa", R.drawable.family_mother, R.raw.family_mother));
        numberWord.add(new Word("son","angsi", R.drawable.family_son, R.raw.family_son));
        numberWord.add(new Word("daughter","tune", R.drawable.family_daughter, R.raw.family_daughter));
        numberWord.add(new Word("older brother","taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        numberWord.add(new Word("younger brother","chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        numberWord.add(new Word("older sister","chiwiiṭә", R.drawable.family_older_sister, R.raw.family_older_sister));
        numberWord.add(new Word("younger sister","kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        numberWord.add(new Word("grandmother","ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        numberWord.add(new Word("grandfather","paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this,numberWord, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = numberWord.get(position);
                releaseMediaPlayer();

                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                    mMediaPlayer.start();
                    //Setup a listener on the media player, so that we can stop and release the
                    //media player once the sounds has finished playing.
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });



    }
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
}
