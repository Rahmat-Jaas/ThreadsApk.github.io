package X;

import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

/* renamed from: X.08J  reason: invalid class name */
public final class AnonymousClass08J implements Runnable {
    public final /* synthetic */ C05010Qj A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public AnonymousClass08J(C05010Qj r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void run() {
        MultiSignalANRDetector multiSignalANRDetector = this.A00.A00;
        AnonymousClass0LU.A0O(multiSignalANRDetector.A0C, "On error detected waiting for confirmation %b", Boolean.valueOf(multiSignalANRDetector.A0N));
        multiSignalANRDetector.A0F = this.A01;
        multiSignalANRDetector.A0G = this.A02;
        multiSignalANRDetector.A08 = SystemClock.uptimeMillis();
        AnonymousClass08X r2 = AnonymousClass08X.AM_CONFIRMED;
        multiSignalANRDetector.A02(r2, false, false);
        if (multiSignalANRDetector.A0N) {
            multiSignalANRDetector.A0Q.removeCallbacks(multiSignalANRDetector.A0X);
            multiSignalANRDetector.A0N = false;
        }
        MultiSignalANRDetector.A00(r2, multiSignalANRDetector);
    }
}
