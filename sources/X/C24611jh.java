package X;

import android.content.Intent;

/* renamed from: X.1jh  reason: invalid class name and case insensitive filesystem */
public final class C24611jh extends C19819BBt {
    public final /* synthetic */ AnonymousClass1cQ A00;

    public C24611jh(AnonymousClass1cQ r1) {
        this.A00 = r1;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass1cQ r1 = this.A00;
        if (r1.A01 == null) {
            C04220Ms.A0E("calHelper");
            throw null;
        } else {
            AnonymousClass3Zp.A01(intent, new C27321sK(intent, r1), i, i2);
        }
    }
}
