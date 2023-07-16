package X;

import android.os.Bundle;

/* renamed from: X.7yK  reason: invalid class name and case insensitive filesystem */
public final class C134777yK implements Comparable {
    public final Bundle A00;
    public final AnonymousClass7AO A01;
    public final boolean A02;
    public final boolean A03;

    /* renamed from: A00 */
    public final int compareTo(C134777yK r5) {
        int size;
        C04220Ms.A0B(r5, 0);
        boolean z = this.A03;
        if (!z || r5.A03) {
            if (!z && r5.A03) {
                return -1;
            }
            Bundle bundle = this.A00;
            Bundle bundle2 = r5.A00;
            if (bundle != null) {
                if (bundle2 != null && (size = bundle.size() - bundle2.size()) <= 0) {
                    if (size < 0) {
                        return -1;
                    }
                }
            } else if (bundle2 != null) {
                return -1;
            }
            if (this.A02) {
                if (!r5.A02) {
                    return 1;
                }
                return 0;
            } else if (r5.A02) {
                return -1;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public C134777yK(Bundle bundle, AnonymousClass7AO r2, boolean z, boolean z2) {
        this.A01 = r2;
        this.A00 = bundle;
        this.A03 = z;
        this.A02 = z2;
    }
}
