package X;

import com.instagram.nux.activity.SignedOutFragmentActivity$9$1$1;

/* renamed from: X.4Rh  reason: invalid class name and case insensitive filesystem */
public final class C73194Rh implements Runnable {
    public final /* synthetic */ AnonymousClass1mc A00;
    public final /* synthetic */ boolean A01;

    public C73194Rh(AnonymousClass1mc r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        this.A00.A01.mLifecycleRegistry.A07(new SignedOutFragmentActivity$9$1$1(this));
    }
}
