package X;

import android.os.Bundle;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.fbpay.logging.FBPayLoggerData;

/* renamed from: X.5jt  reason: invalid class name and case insensitive filesystem */
public final class C92805jt extends C882957m {
    public AddressFormFieldsConfig A00;
    public FBPayLoggerData A01;
    public final M5J A02;
    public final C108916jA A03;
    public final C143688h9 A04;

    public C92805jt(C108916jA r4, C143688h9 r5) {
        this.A03 = r4;
        this.A04 = r5;
        C880756q r2 = r4.A00;
        this.A02 = C86114wI.A0H(r2, this, 16);
        C880856r.A05(r2, this.A03, this, 218);
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        this.A01 = C86104wH.A0Q(bundle);
    }
}
