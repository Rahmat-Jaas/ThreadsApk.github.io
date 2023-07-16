package X;

import android.webkit.ValueCallback;

/* renamed from: X.7S1  reason: invalid class name */
public final class AnonymousClass7S1 implements ValueCallback {
    public final /* synthetic */ C1196776k A00;
    public final /* synthetic */ C107086g7 A01;

    public AnonymousClass7S1(C1196776k r1, C107086g7 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
        this.A01.A00.put(this.A00.A04, obj);
    }
}
