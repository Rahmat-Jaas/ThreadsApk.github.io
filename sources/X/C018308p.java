package X;

import com.facebook.acra.anr.sigquit.SigquitDetectorLacrima;

/* renamed from: X.08p  reason: invalid class name and case insensitive filesystem */
public final class C018308p extends Thread {
    public final /* synthetic */ SigquitDetectorLacrima A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C018308p(SigquitDetectorLacrima sigquitDetectorLacrima) {
        super("LacrimaSigquitNotifier");
        this.A00 = sigquitDetectorLacrima;
    }

    public final void run() {
        SigquitDetectorLacrima.nativeWaitForSignal();
    }
}
