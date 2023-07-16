package com.facebook.browser.lite.extensions.autofill.instagram;

import X.AnonymousClass80Z;
import X.C1189172u;
import X.C1357580a;
import X.C14030oh;
import X.C86154wM;
import X.C89405Ej;
import X.IF5;
import android.content.Context;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import java.util.Map;

public final class AutofillController$InstagramAutofillOptOutCallbackHandler extends AutofillOptOutCallback.Stub {
    public final Context A00;
    public final C89405Ej A01;
    public final IF5 A02;
    public final Map A03;
    public final boolean A04;

    public AutofillController$InstagramAutofillOptOutCallbackHandler(Context context, C89405Ej r4, IF5 if5, Map map, boolean z) {
        int A032 = C14030oh.A03(1865864625);
        this.A00 = context;
        this.A01 = r4;
        this.A04 = z;
        this.A02 = if5;
        this.A03 = map;
        C14030oh.A0A(-590519486, A032);
        C14030oh.A0A(2031910769, C14030oh.A03(2019492565));
    }

    public final void BnX(String str, boolean z) {
        int A032 = C14030oh.A03(-1443480586);
        C86154wM.A1U(str, this.A03, z);
        if (this.A04) {
            C1189172u.A00(new AnonymousClass80Z(this, z));
        }
        if (!z) {
            C1189172u.A00(new C1357580a(this, str));
        }
        C14030oh.A0A(-250285624, A032);
    }
}
