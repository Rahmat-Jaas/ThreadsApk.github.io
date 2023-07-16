package X;

import android.os.Bundle;

/* renamed from: X.7jv  reason: invalid class name and case insensitive filesystem */
public final class C128607jv implements C145868lF {
    public final Bundle A00;
    public final AnonymousClass57F A01;

    public final C120967Dk ArH() {
        return null;
    }

    public final void BzY(Bundle bundle, C120967Dk r5) {
        if (r5 != null) {
            AnonymousClass7JD.A03(this.A01.A02, new AnonymousClass79P(r5, (Object) null));
        }
    }

    public final void BzZ(Throwable th) {
        AnonymousClass7JD.A03(this.A01.A01, th);
    }

    public C128607jv(Bundle bundle, AnonymousClass57F r6) {
        String str;
        this.A01 = r6;
        this.A00 = bundle;
        if ("PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(C18190wL.A0j(bundle, "AUTH_METHOD_TYPE"))) {
            str = "VERIFY_PAYPAL";
        } else {
            str = "CSC".equalsIgnoreCase(C18190wL.A0j(bundle, "AUTH_METHOD_TYPE")) ? "VERIFY_CVV" : str;
            AnonymousClass7JD.A03(this.A01.A00, new AnonymousClass79P("PIN_RESET_BY_CVV_PAYPAL", new Bundle(this.A00)));
        }
        AnonymousClass7Hq.A04(bundle, str);
        AnonymousClass7JD.A03(this.A01.A00, new AnonymousClass79P("PIN_RESET_BY_CVV_PAYPAL", new Bundle(this.A00)));
    }
}
