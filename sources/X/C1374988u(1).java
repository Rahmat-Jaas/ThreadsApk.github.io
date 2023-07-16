package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.88u  reason: invalid class name and case insensitive filesystem */
public final class C1374988u extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        Choreographer instance = Choreographer.getInstance();
        C04220Ms.A06(instance);
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            Handler createAsync = Handler.createAsync(myLooper);
            C04220Ms.A06(createAsync);
            AnonymousClass8bZ r1 = new AnonymousClass8bZ(createAsync, instance);
            return C25235DiG.A01(r1, r1.A06);
        }
        throw C18180wK.A0a("no Looper on this thread");
    }
}
