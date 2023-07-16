package X;

import android.os.Bundle;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.fbpay.hub.form.params.FormParams;
import com.fbpay.logging.FBPayLoggerData;

/* renamed from: X.5k0  reason: invalid class name */
public final class AnonymousClass5k0 extends C882957m {
    public C109796kd A00;
    public FBPayLoggerData A01;
    public final M5J A02;
    public final C143688h9 A03;

    public AnonymousClass5k0(C109796kd r4, C143688h9 r5) {
        this.A00 = r4;
        this.A03 = r5;
        C880756q r2 = r4.A00;
        this.A02 = C86114wI.A0H(r2, this, 17);
        C880856r.A05(r2, this.A03, this, 221);
    }

    public static void A00(AnonymousClass5k0 r4, FormParams formParams) {
        Bundle A06 = C18180wK.A06();
        A06.putParcelable("form_params", formParams);
        AnonymousClass7JD.A02(r4.A06, new AnonymousClass76N("form", A06));
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        this.A01 = C86104wH.A0Q(bundle);
    }

    public final void A04(String str) {
        AnonymousClass7EL r5 = new AnonymousClass7EL(5, 2131827730, (String) null, 0);
        C91895h1 r4 = new C91895h1(2);
        r4.A0F = str;
        r4.A03 = 2131827730;
        r4.A0G.add((Object) new TextValidatorParams(AnonymousClass006.A0Y, "", 2131827729, 0));
        r5.A09.add((Object) r4.A00());
        A00(this, r5.A01());
    }
}
