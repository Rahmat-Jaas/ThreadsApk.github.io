package X;

import android.os.Looper;
import com.facebook.onecamera.components.logging.functionalcorrectness.QPLUserFlowImpl;
import com.facebook.onecamera.components.logging.xlogger.OneCameraXLogger;

/* renamed from: X.1nC  reason: invalid class name */
public final class AnonymousClass1nC extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nC(C697249u r7) {
        super("warmup_onecamera", 2052766117, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        if (!C04220Ms.A0I(Looper.myLooper(), Looper.getMainLooper())) {
            OneCameraXLogger.loadSoLibrary();
            QPLUserFlowImpl.loadSoLibrary();
            return;
        }
        throw C18250wR.A0V("OC warm up should not be called from Main Thread");
    }
}
