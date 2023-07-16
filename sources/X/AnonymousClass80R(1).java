package X;

import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;

/* renamed from: X.80R  reason: invalid class name */
public final class AnonymousClass80R implements Runnable {
    public final /* synthetic */ InstantExperiencesJSBridgeCall A00;
    public final /* synthetic */ C1200678j A01;

    public AnonymousClass80R(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall, C1200678j r2) {
        this.A01 = r2;
        this.A00 = instantExperiencesJSBridgeCall;
    }

    public final void run() {
        C1200678j.A00(this.A00, this.A01);
    }
}
