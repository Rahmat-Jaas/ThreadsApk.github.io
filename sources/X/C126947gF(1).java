package X;

import com.facebook.pando.Summary;
import java.lang.ref.WeakReference;

/* renamed from: X.7gF  reason: invalid class name and case insensitive filesystem */
public final class C126947gF implements C145218k7 {
    public final WeakReference A00;

    public final void CRg(Summary summary, Object obj) {
        C145218k7 r0 = (C145218k7) this.A00.get();
        if (r0 != null) {
            r0.CRg(summary, obj);
        }
    }

    public final void onError(String str) {
        C145218k7 r0 = (C145218k7) this.A00.get();
        if (r0 != null) {
            r0.onError(str);
        }
    }

    public C126947gF(C145218k7 r2) {
        this.A00 = C86144wL.A0w(r2);
    }
}
