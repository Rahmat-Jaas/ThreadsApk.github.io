package X;

import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;

/* renamed from: X.5jp  reason: invalid class name and case insensitive filesystem */
public final class C92765jp extends C882957m {
    public FBPayLoggerData A00;
    public final C880856r A01 = C880856r.A03();

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        bundle.getClass();
        bundle.getSerializable("payout_methods").getClass();
        ImmutableCollection immutableCollection = (ImmutableCollection) bundle.getSerializable("payout_methods");
        this.A00 = (FBPayLoggerData) C18240wQ.A0D(bundle, "logger_data");
        C880856r r7 = this.A01;
        ImmutableList.Builder A0Q = C86164wN.A0Q();
        if (!immutableCollection.isEmpty()) {
            C92665jc.A00(new AnonymousClass5jV(), A0Q, 2131832347);
            C1366783w it = immutableCollection.iterator();
            while (it.hasNext()) {
                FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) it.next();
                AnonymousClass5jS r3 = new AnonymousClass5jS(0);
                String str = fbPayPaymentMethod.A06;
                r3.A0G = StringFormatUtil.formatStrLocaleSafe("%s • %s", str, fbPayPaymentMethod.A07);
                r3.A0F = str;
                r3.A02 = R.drawable.bank_icon_border;
                r3.A01 = R.drawable.payment_bank_on_file_hub;
                r3.A08 = C86164wN.A0L(this, fbPayPaymentMethod, 41);
                AnonymousClass5je.A00(r3, A0Q);
            }
        }
        C86144wL.A1E(r7, A0Q);
    }
}
