package com.instagram.urlhandlers.p2mincentive;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass2LJ;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C61983Wp;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

public final class P2mIncentiveUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            return r1.A02(A0C);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0B;
        int A00 = C14030oh.A00(317844858);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -1759732490;
        } else {
            Intent intent = getIntent();
            if (intent == null || (A0B = C18210wN.A0B(intent)) == null) {
                finish();
                i = 475155013;
            } else {
                if (!(getSession() instanceof UserSession)) {
                    AnonymousClass3YR.A00.A02(this, A0B, getSession());
                } else {
                    String A0i = C18190wL.A0i(A0B);
                    if (!(A0i == null || A0i.length() == 0)) {
                        try {
                            Uri A0A = C18210wN.A0A(A0i);
                            String queryParameter = A0A.getQueryParameter("offer_id");
                            String A002 = C61983Wp.A00();
                            String queryParameter2 = A0A.getQueryParameter(A002);
                            String queryParameter3 = A0A.getQueryParameter("is_buyer");
                            String queryParameter4 = A0A.getQueryParameter("entry_point");
                            if (!(queryParameter == null || queryParameter.length() == 0 || queryParameter3 == null || queryParameter3.length() == 0)) {
                                boolean equals = queryParameter3.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                                IgBloksScreenConfig A0N = C18190wL.A0N(getSession());
                                A0N.A0P = "com.bloks.www.bloks.p2m.incentive.landing.page.screen";
                                A0N.A0P = "com.bloks.www.bloks.p2m.incentive.landing.page.screen";
                                HashMap A0y = AnonymousClass0wJ.A0y();
                                HashMap A0y2 = AnonymousClass0wJ.A0y();
                                HashMap A0y3 = AnonymousClass0wJ.A0y();
                                BitSet bitSet = new BitSet(2);
                                A0y.put("offer_id", queryParameter);
                                bitSet.set(0);
                                if (queryParameter2 == null) {
                                    queryParameter2 = C18180wK.A0e();
                                    C04220Ms.A06(queryParameter2);
                                }
                                A0y.put(A002, queryParameter2);
                                bitSet.set(1);
                                A0y.put("is_buyer", Boolean.valueOf(equals));
                                if (queryParameter4 == null) {
                                    queryParameter4 = "unknown";
                                }
                                A0y.put("entry_point", queryParameter4);
                                C18180wK.A16(AnonymousClass2LJ.A00(this, A0N, bitSet, A0y3, A0y2, A0y), this, getSession());
                            }
                        } catch (IllegalArgumentException | SecurityException unused) {
                            finish();
                        }
                    }
                    finish();
                }
                i = -273635136;
            }
        }
        C14030oh.A07(i, A00);
    }
}
