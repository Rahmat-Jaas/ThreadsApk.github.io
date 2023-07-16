package X;

import android.content.Context;

/* renamed from: X.1sV  reason: invalid class name and case insensitive filesystem */
public final class C27431sV extends AnonymousClass1iV {
    public C12560m7 A00;

    public C27431sV(Context context, C12560m7 r2) {
        super(context);
        this.A00 = r2;
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(35090361);
        super.onFinish();
        C18240wQ.A11(this.A00, "ProgressDialog");
        C14030oh.A0A(651220930, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(2096236740);
        super.onStart();
        C12560m7 r4 = this.A00;
        if (r4.A0O("ProgressDialog") == null) {
            new C29021vz().A0D(new AnonymousClass01J(r4), "ProgressDialog", true);
        }
        C14030oh.A0A(1944442239, A03);
    }
}
