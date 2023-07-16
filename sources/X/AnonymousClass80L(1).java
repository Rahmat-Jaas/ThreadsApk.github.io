package X;

import android.view.Choreographer;
import com.facebook.redex.IDxFCallbackShape472S0100000_2_I2;

/* renamed from: X.80L  reason: invalid class name */
public final class AnonymousClass80L implements Runnable {
    public final /* synthetic */ AnonymousClass8s9 A00;

    public AnonymousClass80L(AnonymousClass8s9 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8s9 r3 = this.A00;
        Choreographer choreographer = AnonymousClass6a3.choreographer;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            C04220Ms.A0A(choreographer);
            AnonymousClass6a3.choreographer = choreographer;
        }
        choreographer.postFrameCallback(new IDxFCallbackShape472S0100000_2_I2(r3, 2));
    }
}
