package X;

import com.facebook.pando.Summary;
import java.lang.ref.WeakReference;

/* renamed from: X.7gH  reason: invalid class name and case insensitive filesystem */
public final class C126967gH implements C145218k7 {
    public final String A00;
    public final WeakReference A01;

    public final void onError(String str) {
    }

    public final /* bridge */ /* synthetic */ void CRg(Summary summary, Object obj) {
        AnonymousClass7HV r1 = (AnonymousClass7HV) this.A01.get();
        if (r1 != null) {
            r1.A0B(this.A00, obj);
        }
    }

    public C126967gH(AnonymousClass7HV r2, String str) {
        this.A01 = C86144wL.A0w(r2);
        this.A00 = str;
    }
}
