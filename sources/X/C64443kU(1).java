package X;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.VideoView;

/* renamed from: X.3kU  reason: invalid class name and case insensitive filesystem */
public final class C64443kU implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ VideoView A01;
    public final /* synthetic */ C18880y3 A02;

    public C64443kU(View view, VideoView videoView, C18880y3 r3) {
        this.A02 = r3;
        this.A01 = videoView;
        this.A00 = view;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnInfoListener(new C64413kR(this));
    }
}
