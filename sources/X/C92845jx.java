package X;

import android.os.Bundle;
import com.facebook.redex.IDxFunctionShape0S2100000_2_I2;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Map;

/* renamed from: X.5jx  reason: invalid class name and case insensitive filesystem */
public final class C92845jx extends C882957m {
    public FBPayLoggerData A00;
    public C145378kP A01;
    public String A02;
    public boolean A03 = false;
    public final C880756q A04 = C880756q.A01();
    public final C880756q A05 = C880756q.A01();
    public final C143688h9 A06;
    public final C112716q4 A07;

    public static void A00(C92845jx r3) {
        r3.A03 = true;
        Map A052 = C122037Js.A05(r3.A00);
        A052.put("target_name", "add_shoppay_cancel");
        A052.put("product", r3.A02);
        r3.A06.Bb8("user_add_credential_exit", A052);
        C145378kP r0 = r3.A01;
        if (r0 != null) {
            r0.Bnr();
        }
    }

    public C92845jx(C143688h9 r2, C112716q4 r3) {
        this.A07 = r3;
        this.A06 = r2;
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        this.A00 = C86104wH.A0Q(bundle);
        this.A02 = C18190wL.A0j(bundle, IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY);
        C112716q4 r5 = this.A07;
        String A002 = this.A00.A00();
        A002.getClass();
        String str = this.A02;
        M5J A003 = AnonymousClass5k7.A00(new IDxFunctionShape0S2100000_2_I2(r5, str, A002, 4), r5.A02);
        C880856r.A05(A003, this.A05, this, 272);
        C880856r.A05(A003, this.A04, this, 273);
        C880856r.A05(A003, this.A03, this, 274);
    }
}
