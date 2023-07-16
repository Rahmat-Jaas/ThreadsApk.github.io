package X;

import android.os.Bundle;

/* renamed from: X.1p1  reason: invalid class name */
public final class AnonymousClass1p1 extends AnonymousClass3GR {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AnonymousClass1dN A01;

    public AnonymousClass1p1(Bundle bundle, AnonymousClass1dN r2) {
        this.A01 = r2;
        this.A00 = bundle;
    }

    public final void onFail(String str) {
        AnonymousClass1dN r2 = this.A01;
        AnonymousClass1dN.A00(this.A00, r2, AnonymousClass006.A0C);
        synchronized (r2) {
            r2.A0A = false;
            r2.A09 = true;
            AnonymousClass1dN.A02(r2);
        }
    }

    public final void onSuccess() {
        AnonymousClass1dN r2 = this.A01;
        AnonymousClass1dN.A00(this.A00, r2, AnonymousClass006.A00);
        synchronized (r2) {
            r2.A0A = true;
            r2.A09 = true;
            AnonymousClass1dN.A02(r2);
        }
    }
}
