package X;

import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;

/* renamed from: X.3zx  reason: invalid class name and case insensitive filesystem */
public final class C67673zx implements MobileConfigUpdateConfigsCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C62253Xz A01;
    public final /* synthetic */ boolean A02;

    public C67673zx(C62253Xz r1, int i, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }

    public final void onNetworkComplete(boolean z) {
        if (z) {
            this.A01.A00.A0B();
            return;
        }
        boolean z2 = this.A02;
        if (z2) {
            C62253Xz r4 = this.A01;
            int i = this.A00 + 1;
            if (i >= 3) {
                AnonymousClass0LU.A0O("MobileConfigFunctions", "fetchNames failed after max retry:%d. forceFetch:%s", Integer.valueOf(i), Boolean.valueOf(z2));
            } else {
                r4.A00.A06().fetchNames(z2, new C67673zx(r4, i, z2));
            }
        }
    }
}
