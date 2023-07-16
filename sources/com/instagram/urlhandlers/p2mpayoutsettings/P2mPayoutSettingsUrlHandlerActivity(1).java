package com.instagram.urlhandlers.p2mpayoutsettings;

import X.AnonymousClass0BO;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass2RP;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C10300i6;
import X.C122037Js;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C25786Drz;
import X.C61983Wp;
import X.C63743iE;
import X.C63813iO;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.dextricks.Constants;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

public final class P2mPayoutSettingsUrlHandlerActivity extends BaseFragmentActivity {
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
        String string;
        int A00 = C14030oh.A00(-1132824033);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -1331189073;
        } else {
            Intent intent = getIntent();
            if (intent == null || (A0B = C18210wN.A0B(intent)) == null) {
                finish();
                i = -1735864818;
            } else {
                C10300i6 session = getSession();
                if (!(session instanceof UserSession)) {
                    AnonymousClass3YR.A00(this, A0B, session);
                } else {
                    UserSession userSession = (UserSession) session;
                    String string2 = A0B.getString("original_url");
                    if (!(string2 == null || string2.length() == 0)) {
                        try {
                            Uri A0A = C18210wN.A0A(string2);
                            String queryParameter = A0A.getQueryParameter("user_id");
                            String queryParameter2 = A0A.getQueryParameter(C61983Wp.A00());
                            String queryParameter3 = A0A.getQueryParameter("show_payouts");
                            if (!(queryParameter == null || queryParameter.length() == 0)) {
                                if (userSession.getUserId().equals(queryParameter)) {
                                    IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
                                    A0N.A0P = "com.bloks.www.payments.igp2m.payout_management";
                                    HashMap A0y = AnonymousClass0wJ.A0y();
                                    HashMap A0y2 = AnonymousClass0wJ.A0y();
                                    HashMap A0y3 = AnonymousClass0wJ.A0y();
                                    BitSet bitSet = new BitSet(1);
                                    if (queryParameter2 == null || queryParameter2.length() == 0) {
                                        queryParameter2 = C122037Js.A01();
                                    }
                                    A0y.put("logging_session_id", queryParameter2);
                                    boolean z = false;
                                    bitSet.set(0);
                                    if (!(queryParameter3 == null || queryParameter3.length() == 0)) {
                                        z = Boolean.parseBoolean(queryParameter3);
                                    }
                                    A0y.put("show_payouts", Boolean.valueOf(z));
                                    C25786Drz A0Q = C18180wK.A0Q(this, userSession);
                                    if (bitSet.nextClearBit(0) >= 1) {
                                        C63743iE A03 = C63743iE.A03("com.bloks.www.payments.igp2m.payout_management", A0y, A0y2);
                                        A03.A03 = null;
                                        A03.A02 = null;
                                        C18220wO.A1B(C63743iE.A00(this, A0N, A03, A0y3), A0Q, false);
                                    } else {
                                        throw C18180wK.A0a("Missing Required Props");
                                    }
                                } else {
                                    AnonymousClass0BO r12 = userSession.multipleAccountHelper;
                                    if (r12.A0G((String) null).contains(queryParameter)) {
                                        User A0E = r12.A0E(queryParameter);
                                        if (!(A0E == null || !r12.A0N(this, userSession, A0E) || (string = A0B.getString("original_url")) == null || string.length() == 0)) {
                                            try {
                                                Intent flags = C18190wL.A0B(string).setFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
                                                C04220Ms.A06(flags);
                                                flags.setPackage(getPackageName());
                                                r12.A0H(this, flags, userSession, A0E, "deep_link");
                                                finish();
                                            } catch (SecurityException unused) {
                                            }
                                        }
                                    } else if (AnonymousClass2RP.A00(userSession)) {
                                        A0B.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
                                        AnonymousClass3YR.A00(this, A0B, userSession);
                                    } else {
                                        C63813iO.A03(this, (String) null, 2131830299, 0);
                                    }
                                }
                            }
                        } catch (IllegalArgumentException | SecurityException unused2) {
                            finish();
                        }
                    }
                    finish();
                }
                i = 1800696800;
            }
        }
        C14030oh.A07(i, A00);
    }
}
