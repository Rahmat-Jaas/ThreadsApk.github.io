package X;

import com.facebook.mobileboost.framework.os.jni.lite.MobileBoostNativeLite;

/* renamed from: X.61H  reason: invalid class name */
public final class AnonymousClass61H extends AnonymousClass0gG {
    public final C107156gG A00;
    public final boolean A01;

    public final void run() {
        C107156gG r0 = this.A00;
        String str = r0.A01;
        int i = r0.A00;
        MobileBoostNativeLite.mlockPages(str, i & 255, (i >> 14) & 65535, (i >> 30) & 3, this.A01);
    }

    public AnonymousClass61H(C107156gG r2, boolean z) {
        super(402130881);
        this.A00 = r2;
        this.A01 = z;
    }
}
