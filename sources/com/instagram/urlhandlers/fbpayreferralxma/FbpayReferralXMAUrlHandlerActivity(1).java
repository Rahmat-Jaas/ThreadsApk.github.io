package com.instagram.urlhandlers.fbpayreferralxma;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C63743iE;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

public class FbpayReferralXMAUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(232033496);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 249188393;
        } else {
            C10300i6 A0S = C18190wL.A0S(A0C);
            this.A00 = A0S;
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, A0S);
            } else {
                String A0i = C18190wL.A0i(A0C);
                if (!TextUtils.isEmpty(A0i)) {
                    Uri A01 = C15430rJ.A01(A0i);
                    if (A01.getPathSegments().contains("fbpay_referral_details")) {
                        if (A01.getQueryParameter("entrypoint") != null) {
                            C18190wL.A12(A01, A0C, "entrypoint");
                        }
                        C18190wL.A12(A01, A0C, "referral_id");
                        C18190wL.A12(A01, A0C, "sender_id");
                        C10300i6 r9 = this.A00;
                        IgBloksScreenConfig A0N = C18190wL.A0N(r9);
                        A0N.A0S = "Invite";
                        A0N.A0P = "com.bloks.www.fbpay.referral.details";
                        String string = A0C.getString("referral_id");
                        String string2 = A0C.getString("sender_id");
                        String string3 = A0C.getString("entrypoint");
                        if (!(string == null || string2 == null)) {
                            HashMap A0y = AnonymousClass0wJ.A0y();
                            HashMap A0y2 = AnonymousClass0wJ.A0y();
                            HashMap A0y3 = AnonymousClass0wJ.A0y();
                            BitSet bitSet = new BitSet(2);
                            A0y.put("referral_id", string);
                            bitSet.set(0);
                            A0y.put("sender_id", string2);
                            bitSet.set(1);
                            A0y.put("entrypoint", string3);
                            if (bitSet.nextClearBit(0) >= 2) {
                                C63743iE A03 = C63743iE.A03("com.bloks.www.fbpay.referral.details", A0y, A0y2);
                                A03.A03 = null;
                                A03.A02 = null;
                                C18220wO.A1B(C63743iE.A00(this, A0N, A03, A0y3), C18180wK.A0Q(this, r9), false);
                            } else {
                                throw C18180wK.A0a("Missing Required Props");
                            }
                        }
                        i = 1180726853;
                    }
                }
            }
            finish();
            i = 1180726853;
        }
        C14030oh.A07(i, A002);
    }
}
