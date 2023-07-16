package X;

import com.facebook.acra.anr.sigquit.SigquitDetectorAcra;

/* renamed from: X.08m  reason: invalid class name and case insensitive filesystem */
public final class C018008m implements Runnable {
    public final /* synthetic */ SigquitDetectorAcra A00;

    public C018008m(SigquitDetectorAcra sigquitDetectorAcra) {
        this.A00 = sigquitDetectorAcra;
    }

    public final void run() {
        SigquitDetectorAcra.nativeHookMethods();
        throw new NullPointerException("mStartStopLock");
    }
}
