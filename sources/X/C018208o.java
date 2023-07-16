package X;

import com.facebook.acra.anr.sigquit.SigquitDetectorLacrima;

/* renamed from: X.08o  reason: invalid class name and case insensitive filesystem */
public final class C018208o implements Runnable {
    public final /* synthetic */ SigquitDetectorLacrima A00;

    public C018208o(SigquitDetectorLacrima sigquitDetectorLacrima) {
        this.A00 = sigquitDetectorLacrima;
    }

    public final void run() {
        boolean nativeHookMethods = SigquitDetectorLacrima.nativeHookMethods();
        synchronized (this.A00.mListener.A0W) {
        }
        if (nativeHookMethods) {
            SigquitDetectorLacrima.nativeStartDetector();
        }
    }
}
