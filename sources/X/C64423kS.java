package X;

import android.media.MediaPlayer;

/* renamed from: X.3kS  reason: invalid class name and case insensitive filesystem */
public final class C64423kS implements MediaPlayer.OnInfoListener {
    public final /* synthetic */ C64433kT A00;

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return true;
        }
        this.A00.A00.setBackgroundColor(0);
        return true;
    }

    public C64423kS(C64433kT r1) {
        this.A00 = r1;
    }
}
