package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.6a3  reason: invalid class name */
public final class AnonymousClass6a3 {
    public static final C141468bf A00;
    public static volatile Choreographer choreographer;

    static {
        Object obj;
        Object obj2 = null;
        try {
            Object A0Z = C86154wM.A0Z(Looper.getMainLooper(), (Object) null, Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}));
            if (A0Z != null) {
                obj = new C141458be((Handler) A0Z, (String) null, false);
                if (!(obj instanceof AnonymousClass0OW)) {
                    obj2 = obj;
                }
                A00 = (C141468bf) obj2;
                return;
            }
            throw C18210wN.A0W("null cannot be cast to non-null type android.os.Handler");
        } catch (Throwable th) {
            obj = new AnonymousClass0OW(th);
        }
    }
}
