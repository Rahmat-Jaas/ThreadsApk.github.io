package X;

import android.os.Bundle;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.1rN  reason: invalid class name and case insensitive filesystem */
public final class C26871rN extends AnonymousClass1d9 implements C82424pb, C82824qK {
    public static final String __redex_internal_original_name = "RegEmailVerifyFragment";
    public RegFlowExtras A00;
    public AnonymousClass3V1 A01;

    public final AnonymousClass265 BDt() {
        return AnonymousClass265.A1N;
    }

    public final void Cth(String str, Integer num) {
        AnonymousClass3WW.A00(this, this.A00, (C07530bf) this.A02, str);
    }

    public final boolean onBackPressed() {
        C62223Xv.A00.A01(this.A02, "sign_up_email_code_confirmation");
        return false;
    }

    public final void onCreate(Bundle bundle) {
        Integer A02;
        int A022 = C14030oh.A02(-1006103799);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass7Ko.A07(bundle2, "Arguments in RegEmailVerifyFragment cannot be null.");
        this.A02 = AnonymousClass0RA.A0C.A04(bundle2);
        RegFlowExtras regFlowExtras = (RegFlowExtras) bundle2.getParcelable("RegFlowExtras.EXTRA_KEY");
        this.A00 = regFlowExtras;
        this.A06 = regFlowExtras.A08;
        AnonymousClass3V1 A002 = AnonymousClass3V1.A00(bundle2);
        this.A01 = A002;
        C10300i6 r2 = this.A02;
        C313625r Aiy = Aiy();
        RegFlowExtras regFlowExtras2 = this.A00;
        if (regFlowExtras2 == null) {
            A02 = null;
        } else {
            A02 = regFlowExtras2.A02();
        }
        AnonymousClass0wJ.A1N(r2, "sign_up_email_code_confirmation");
        AnonymousClass3YT.A00(r2, A002, Aiy, A02, "sign_up_email_code_confirmation", (String) null);
        C14030oh.A09(1920481764, A022);
    }
}
