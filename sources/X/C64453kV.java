package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.3kV  reason: invalid class name and case insensitive filesystem */
public final class C64453kV implements Handler.Callback {
    public final Handler.Callback A00;

    public final boolean handleMessage(Message message) {
        String str;
        C04220Ms.A0B(message, 0);
        Object obj = message.obj;
        if (obj instanceof AnonymousClass32D) {
            C04220Ms.A0C(obj, "null cannot be cast to non-null type com.bloks.foa.core.surface.MessageParam");
            str = ((AnonymousClass32D) obj).A00;
            if (str != null) {
                C41228M0s.A01(str);
            }
        } else {
            str = null;
        }
        try {
            return this.A00.handleMessage(message);
        } finally {
            if (str != null) {
                C41228M0s.A00();
            }
        }
    }

    public C64453kV(Handler.Callback callback) {
        this.A00 = callback;
    }
}
