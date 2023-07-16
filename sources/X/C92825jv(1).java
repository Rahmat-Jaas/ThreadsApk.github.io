package X;

import android.os.Bundle;
import com.fbpay.hub.paymentmethods.api.FbPayPayPal;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.Map;

/* renamed from: X.5jv  reason: invalid class name and case insensitive filesystem */
public final class C92825jv extends C882957m {
    public M5J A00;
    public FbPayPayPal A01;
    public FBPayLoggerData A02;
    public final C880856r A03 = C880856r.A03();
    public final C112706q3 A04;
    public final C143688h9 A05;

    public C92825jv(C112706q3 r2, C143688h9 r3) {
        this.A04 = r2;
        this.A05 = r3;
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        this.A02 = C86104wH.A0Q(bundle);
        this.A01 = (FbPayPayPal) C18240wQ.A0D(bundle, "paypal_credential");
        C880856r r4 = this.A03;
        ImmutableList.Builder A0Q = C86164wN.A0Q();
        AnonymousClass5jS r1 = new AnonymousClass5jS(0);
        r1.A07 = 2131832199;
        r1.A0F = this.A01.A01;
        r1.A02 = R.drawable.payment_paypal_hub;
        A0Q.add((Object) new AnonymousClass5je(r1));
        AnonymousClass5jW r2 = new AnonymousClass5jW();
        r2.A02 = 2131834650;
        r2.A01 = R.attr.fbpay_error_text_color;
        r2.A03 = C86134wK.A0P(this, 70);
        A0Q.add((Object) C92675jd.A00(r2, new C107316gY(), AnonymousClass006.A01));
        C86144wL.A1E(r4, A0Q);
        Map A06 = C122037Js.A06(this.A02);
        C86164wN.A1J(AnonymousClass0wJ.A0d(this.A01.A00), A06);
        this.A05.Bb8("fbpay_edit_paypal_display", A06);
    }
}
