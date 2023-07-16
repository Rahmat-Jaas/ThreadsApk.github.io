package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.56o  reason: invalid class name and case insensitive filesystem */
public final class C880556o extends C880856r {
    public final /* synthetic */ AnonymousClass7IX A00;

    public C880556o(AnonymousClass7IX r1) {
        this.A00 = r1;
    }

    public final void A09() {
        AnonymousClass7IX r4 = this.A00;
        synchronized (r4) {
            C002301a r1 = AnonymousClass7IX.A0A;
            if (r4.A00 != null) {
                r1.accept(r4.A01);
            } else {
                r4.A00 = new AnonymousClass7Lz(r1, r4);
                Context context = r4.A02;
                Intent A01 = AnonymousClass7IX.A01(context, r4, "com.fbpay.w3c.FB_EXTENSIONS");
                if (A01 != null) {
                    if (C18230wP.A0O().A0A(context, A01, r4.A00)) {
                    }
                }
                r4.A00 = null;
                r4.A01 = null;
            }
        }
    }

    public final void A0A() {
        AnonymousClass7IX r2 = this.A00;
        AnonymousClass7IX.A02(r2.A02, r2.A00, r2);
        r2.A00 = null;
        r2.A01 = null;
    }
}
