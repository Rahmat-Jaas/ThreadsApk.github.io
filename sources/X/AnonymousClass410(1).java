package X;

import android.os.SystemClock;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.410  reason: invalid class name */
public final class AnonymousClass410 implements C84724tl {
    public float A00 = 1.2f;
    public long A01;
    public long A02 = -9223372036854775807L;
    public final HeroPlayerSetting A03;

    public final float AxK(C72384Ny r12, float f, int i) {
        int i2 = r12.A09 - i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A02;
        if (j == -9223372036854775807L || j + ((long) 200) < elapsedRealtime) {
            this.A02 = elapsedRealtime;
            long j2 = this.A01 + ((long) i2);
            this.A01 = j2;
            int i3 = r12.A0R;
            if (i3 > 0) {
                this.A01 = Math.min((long) i3, Math.max((long) (-i3), j2));
            }
        }
        double d = r12.A01;
        float f2 = this.A00;
        double d2 = (double) f2;
        this.A00 = Math.max(0.5f, f2 * 0.95f);
        return (float) ((((double) 1.0f) - ((d * d2) * ((double) i2))) - ((r12.A00 * d2) * ((double) this.A01)));
    }

    public AnonymousClass410(HeroPlayerSetting heroPlayerSetting) {
        this.A03 = heroPlayerSetting;
    }
}
