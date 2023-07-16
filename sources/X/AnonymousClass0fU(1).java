package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0fU  reason: invalid class name */
public final class AnonymousClass0fU implements C13190nB {
    public final void CdG(String str, String str2, String str3, String str4, boolean z) {
    }

    public final void CdH(String str, String str2, String str3, String str4, WeakReference weakReference, boolean z) {
        C07260bE r1 = C07260bE.A03;
        if (r1 != null) {
            if (str2 != null && !str2.isEmpty()) {
                if (str3 == null || str3.isEmpty()) {
                    str3 = str2;
                } else {
                    str3 = AnonymousClass00U.A0V(str3, ":", str2);
                }
            }
            r1.A00(str2, str3, weakReference);
        }
    }
}
