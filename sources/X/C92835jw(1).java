package X;

import android.os.Bundle;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.logging.FBPayLoggerData;
import java.util.Set;

/* renamed from: X.5jw  reason: invalid class name and case insensitive filesystem */
public class C92835jw extends C882957m {
    public M5J A00;
    public M5J A01;
    public M5J A02;
    public AddressFormFieldsConfig A03;
    public FbPayNewCreditCardOption A04;
    public C112706q3 A05;
    public FBPayLoggerData A06;
    public C112716q4 A07;
    public String A08;
    public final C880856r A09 = C880856r.A03();
    public final C880856r A0A = C880856r.A03();
    public final C880856r A0B = C880856r.A03();
    public final C143158gC A0C = C86114wI.A0Q(this, 254);
    public final C143158gC A0D = C86114wI.A0Q(this, 255);
    public final C143688h9 A0E;
    public final Set A0F = C18200wM.A0u();
    public final Set A0G = C18200wM.A0u();
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public final void onCleared() {
        M5J m5j = this.A00;
        if (m5j != null) {
            m5j.A0F(this.A0C);
        }
    }

    public C92835jw(C112706q3 r5, C143688h9 r6, C112716q4 r7, String str, C969867m[] r9, boolean z, boolean z2, boolean z3) {
        for (C969867m add : r9) {
            this.A0G.add(add);
        }
        this.A0H = z;
        this.A0I = z2;
        this.A0J = z3;
        this.A05 = r5;
        this.A07 = r7;
        this.A0E = r6;
        C880756q r2 = r5.A03;
        r5.A00(this.A0G);
        this.A01 = C30821GXg.A01(r2, new AnonymousClass86K(this, str));
        C880856r.A05(r2, this.A03, this, 256);
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        this.A06 = C86104wH.A0Q(bundle);
    }
}
