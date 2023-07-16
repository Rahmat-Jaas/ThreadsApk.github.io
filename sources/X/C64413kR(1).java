package X;

import android.media.MediaPlayer;
import android.widget.VideoView;
import com.instagram.barcelona.R;

/* renamed from: X.3kR  reason: invalid class name and case insensitive filesystem */
public final class C64413kR implements MediaPlayer.OnInfoListener {
    public final /* synthetic */ C64443kU A00;

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return true;
        }
        C64443kU r3 = this.A00;
        VideoView videoView = r3.A01;
        C18230wP.A0z(videoView.getContext(), videoView, R.color.fds_transparent);
        C18200wM.A1D(r3.A00, R.id.video_placeholder);
        C18880y3.A00(r3.A02);
        return true;
    }

    public C64413kR(C64443kU r1) {
        this.A00 = r1;
    }
}
