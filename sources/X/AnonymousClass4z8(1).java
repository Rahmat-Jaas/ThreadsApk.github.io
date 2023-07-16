package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;

/* renamed from: X.4z8  reason: invalid class name */
public final class AnonymousClass4z8 extends Handler {
    public final /* synthetic */ AnonymousClass55v A00;

    public AnonymousClass4z8(AnonymousClass55v r1) {
        this.A00 = r1;
    }

    public final void handleMessage(Message message) {
        ((View) message.obj).sendAccessibilityEvent(4);
    }
}
