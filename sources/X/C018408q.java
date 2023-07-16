package X;

import android.os.Handler;
import com.facebook.acra.anr.sigquit.SigquitDetectorLacrima;

/* renamed from: X.08q  reason: invalid class name and case insensitive filesystem */
public final class C018408q implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ SigquitDetectorLacrima A01;
    public final /* synthetic */ Runnable A02;

    public C018408q(Handler handler, SigquitDetectorLacrima sigquitDetectorLacrima, Runnable runnable) {
        this.A01 = sigquitDetectorLacrima;
        this.A00 = handler;
        this.A02 = runnable;
    }

    public final void run() {
        SigquitDetectorLacrima.nativeAddSignalHandler();
        this.A00.post(this.A02);
    }
}
