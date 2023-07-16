package X;

import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.otc.models.OtcInput;

/* renamed from: X.7kn  reason: invalid class name and case insensitive filesystem */
public final class C128997kn implements C143708hB {
    public final /* synthetic */ CheckoutHandler A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C128997kn(CheckoutHandler checkoutHandler, String str, String str2, String str3, String str4) {
        this.A00 = checkoutHandler;
        this.A04 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    public final void CBm() {
        C128137iw r2 = this.A00.A0U;
        Integer num = AnonymousClass006.A01;
        String str = this.A04;
        String str2 = this.A02;
        r2.BN9(new C110326lV((OtcInput) null, str, str2, this.A01, this.A03), C121537Gp.A00(str, str2), num);
    }
}
