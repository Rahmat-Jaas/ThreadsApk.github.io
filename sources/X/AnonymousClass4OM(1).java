package X;

import com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback;
import com.instagram.wellbeing.ixttriggers.controller.IxtTriggerController$createCallback$1;

/* renamed from: X.4OM  reason: invalid class name */
public final class AnonymousClass4OM implements Runnable {
    public final /* synthetic */ AnonymousClass1c8 A00;

    public AnonymousClass4OM(AnonymousClass1c8 r1) {
        this.A00 = r1;
    }

    public final void run() {
        IgBloksScreenRequestCallback igBloksScreenRequestCallback = this.A00.A0B;
        if (igBloksScreenRequestCallback != null && (igBloksScreenRequestCallback instanceof IxtTriggerController$createCallback$1)) {
            ((IxtTriggerController$createCallback$1) igBloksScreenRequestCallback).A00.A01 = true;
        }
    }
}
