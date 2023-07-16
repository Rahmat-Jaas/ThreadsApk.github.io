package X;

import android.content.Context;
import com.facebook.redex.IDxDListenerShape321S0100000_2_I2;

/* renamed from: X.6pn  reason: invalid class name and case insensitive filesystem */
public final class C112556pn {
    public long A00;
    public boolean A01;
    public final Context A02;

    public final void A00(String str, boolean z, boolean z2) {
        if (!this.A01 && System.currentTimeMillis() - this.A00 >= 1500) {
            C25828Dsm dsm = new C25828Dsm(this.A02);
            dsm.A0L(2131833869);
            dsm.A0p(str);
            int i = 2131833871;
            if (z) {
                i = 2131833870;
            }
            dsm.A0P(new AnonymousClass7LY(this, str, z, z2), i);
            dsm.A0N(C86154wM.A0N(this, 58), 2131823054);
            dsm.A0e(new IDxDListenerShape321S0100000_2_I2(this, 9));
            dsm.A0q(true);
            dsm.A0r(true);
            AnonymousClass0wJ.A1K(dsm);
            this.A01 = true;
        }
    }

    public C112556pn(Context context) {
        this.A02 = context;
    }
}
