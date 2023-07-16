package X;

import android.os.Handler;
import com.facebook.acra.anr.sigquit.SigquitDetectorAcra;

/* renamed from: X.08n  reason: invalid class name and case insensitive filesystem */
public final class C018108n implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ SigquitDetectorAcra A01;
    public final /* synthetic */ Runnable A02;

    public C018108n(Handler handler, SigquitDetectorAcra sigquitDetectorAcra, Runnable runnable) {
        this.A01 = sigquitDetectorAcra;
        this.A00 = handler;
        this.A02 = runnable;
    }

    public final void run() {
        SigquitDetectorAcra.nativeAddSignalHandler();
        this.A00.post(this.A02);
    }
}
