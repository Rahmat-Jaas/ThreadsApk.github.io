package com.facebook.redex;

import X.C202313q;
import android.media.MediaPlayer;
import android.widget.VideoView;

public class IDxCListenerShape553S0100000_1_I2 implements MediaPlayer.OnCompletionListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape553S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        VideoView videoView;
        switch (this.A01) {
            case 0:
                mediaPlayer.seekTo(0);
                videoView = (VideoView) this.A00;
                break;
            case 1:
                mediaPlayer.seekTo(0);
                videoView = ((C202313q) this.A00).A06;
                break;
            default:
                return;
        }
        videoView.start();
    }
}
