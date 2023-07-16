package X;

import android.content.Context;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.redex.IDxFCallbackShape319S0100000_7_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/* renamed from: X.49M  reason: invalid class name */
public final class AnonymousClass49M implements AnonymousClass0i4 {
    public List A00;
    public Set A01 = new LinkedHashSet();
    public Vector A02 = new Vector();
    public final UserSession A03;

    public AnonymousClass49M(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A03 = userSession;
    }

    public final void A01(Context context, PendingMedia pendingMedia) {
        if (A02(pendingMedia, true)) {
            this.A00 = null;
            C67463zb A002 = C67463zb.A00();
            UserSession userSession = this.A03;
            List<AnonymousClass3H2> A06 = C63693i8.A06(context, userSession, "ig_android_access_library_igig_feed_cross_posting", (String) null, C307822y.A04);
            ArrayList A0w = AnonymousClass0wJ.A0w(A06);
            for (AnonymousClass3H2 r0 : A06) {
                GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                GraphQlCallInput.A05(A003, r0.A01.A00, "sensitive_string_value");
                A0w.add(A003);
            }
            A002.A06("target_logged_in_account_tokens", ImmutableList.copyOf((Collection) A0w));
            C67453za.A00(userSession).AMA(C67473zc.A00(A002, LGN.class, "IGFxGenEligibleIgIgCrosspostingAccounts"), new IDxFCallbackShape319S0100000_7_I2(this, 1));
        }
    }

    public static final String A00(AnonymousClass49M r2, String str) {
        List<AnonymousClass3AG> list = r2.A00;
        if (list != null) {
            for (AnonymousClass3AG r1 : list) {
                if (C04220Ms.A0I(r1.A00, str)) {
                    return r1.A02;
                }
            }
            return null;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final boolean A02(PendingMedia pendingMedia, boolean z) {
        boolean A0E;
        AnonymousClass0TJ r2;
        long j;
        UserSession userSession = this.A03;
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A06;
        if (C63803iN.A0E(r4, userSession, 2342160900481355808L)) {
            return false;
        }
        if (pendingMedia != null && pendingMedia.A0w() && !pendingMedia.BNn()) {
            r2 = AnonymousClass0TJ.A05;
            j = 36317891267989541L;
        } else if (C63803iN.A0E(r4, userSession, 36317891267792930L) && (pendingMedia == null || !pendingMedia.A0y())) {
            return false;
        } else {
            if (z) {
                r2 = AnonymousClass0TJ.A05;
                j = 36317891267727393L;
            } else {
                A0E = C63803iN.A0E(r4, userSession, 36317891267727393L);
                return C18210wN.A1W(A0E);
            }
        }
        A0E = C63803iN.A0E(r2, userSession, j);
        return C18210wN.A1W(A0E);
    }

    public final void onSessionWillEnd() {
        this.A03.A03(AnonymousClass49M.class);
    }
}
