package X;

import android.media.MediaPlayer;
import android.widget.VideoView;

/* renamed from: X.3kT  reason: invalid class name and case insensitive filesystem */
public final class C64433kT implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ VideoView A00;
    public final /* synthetic */ C18830xy A01;

    public C64433kT(VideoView videoView, C18830xy r2) {
        this.A01 = r2;
        this.A00 = videoView;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnInfoListener(new C64423kS(this));
    }
}
