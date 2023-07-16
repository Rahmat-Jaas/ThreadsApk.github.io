package X;

import android.view.Choreographer;
import com.facebook.redex.IDxFCallbackShape472S0100000_2_I2;

/* renamed from: X.7ec  reason: invalid class name and case insensitive filesystem */
public final class C126127ec implements C03880Le {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public final Choreographer A03;
    public final C03870Ld A04;
    public final Choreographer.FrameCallback A05;

    public final void AHx() {
        this.A02 = false;
        this.A03.removeFrameCallback(this.A05);
    }

    public final void AJS() {
        if (!this.A02) {
            this.A00 = -1;
        }
        this.A02 = true;
        this.A03.postFrameCallback(this.A05);
    }

    public C126127ec(Choreographer choreographer, C03870Ld r4) {
        this.A03 = choreographer;
        this.A04 = r4;
        this.A05 = new IDxFCallbackShape472S0100000_2_I2(this, 1);
    }
}
