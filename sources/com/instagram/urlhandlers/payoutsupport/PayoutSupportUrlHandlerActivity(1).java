package com.instagram.urlhandlers.payoutsupport;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C25786Drz;
import X.C37067Jjv;
import X.C63743iE;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

public final class PayoutSupportUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "payment_support_url_handler_activity";
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onBackPressed() {
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C14030oh.A00(-1604272144);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
            if (r2.A03(this) != null) {
                if (!(r2.A03(this) instanceof UserSession)) {
                    AnonymousClass3YR.A00.A02(this, A0C, r2.A03(this));
                    finish();
                    i = -831819146;
                } else {
                    String A0i = C18190wL.A0i(A0C);
                    if (A0i != null) {
                        C10300i6 A03 = r2.A03(this);
                        Uri A0A = C18210wN.A0A(A0i);
                        HashMap A0y = AnonymousClass0wJ.A0y();
                        HashMap A0y2 = AnonymousClass0wJ.A0y();
                        HashMap A0y3 = AnonymousClass0wJ.A0y();
                        BitSet bitSet = new BitSet(1);
                        String queryParameter = A0A.getQueryParameter("ref");
                        String queryParameter2 = A0A.getQueryParameter("financial_entity_id");
                        String queryParameter3 = A0A.getQueryParameter("payout_batch_id");
                        String queryParameter4 = A0A.getQueryParameter("transaction_id");
                        if (queryParameter != null) {
                            A0y.put("ref", queryParameter);
                        }
                        if (queryParameter2 != null) {
                            A0y.put("financial_entity_id", queryParameter2);
                        }
                        if (queryParameter3 != null) {
                            A0y.put("payout_batch_id", queryParameter3);
                        }
                        if (queryParameter4 != null) {
                            A0y.put("transaction_id", queryParameter4);
                        }
                        String queryParameter5 = A0A.getQueryParameter("logging_session_id");
                        if (queryParameter5 != null) {
                            A0y.put("logging_session_id", queryParameter5);
                            bitSet.set(0);
                            IgBloksScreenConfig A0N = C18190wL.A0N(A03);
                            A0N.A0S = null;
                            C25786Drz A0Q = C18180wK.A0Q(this, A03);
                            if (bitSet.nextClearBit(0) >= 1) {
                                C63743iE r1 = new C63743iE(C37067Jjv.A02(A0y), A0y2, "com.bloks.www.fbpay.care.receipt_help");
                                C63743iE.A0A(r1, 719983200);
                                r1.A03 = null;
                                r1.A02 = null;
                                C18220wO.A1B(C63743iE.A00(this, A0N, r1, A0y3), A0Q, false);
                                i = -542570362;
                            } else {
                                throw C18180wK.A0a("Missing Required Props");
                            }
                        } else {
                            throw AnonymousClass0wJ.A0b();
                        }
                    } else {
                        finish();
                        i = -221081408;
                    }
                }
                C14030oh.A07(i, A00);
            }
        }
        finish();
        i = -1166148510;
        C14030oh.A07(i, A00);
    }
}
