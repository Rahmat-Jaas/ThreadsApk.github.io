package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.3Kw  reason: invalid class name and case insensitive filesystem */
public final class C59453Kw {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        C25786Drz A0Q;
        Fragment r0;
        long j;
        AnonymousClass0wJ.A1O(userSession, str);
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36325252841612303L)) {
            IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
            A0N.A0P = "com.bloks.www.ig.branded_content_ads.permissions";
            int i = 2131822583;
            if (C63803iN.A0E(r2, userSession, 36326635821082318L)) {
                i = 2131832170;
            }
            C18210wN.A0s(fragmentActivity, A0N, i);
            HashMap A0y = AnonymousClass0wJ.A0y();
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            HashMap A0y3 = AnonymousClass0wJ.A0y();
            new BitSet(0);
            A0y.put("prior_module", str);
            if (str2 != null) {
                j = Long.parseLong(str2);
            } else {
                j = 0;
            }
            A0y.put("permission_id", Long.valueOf(j));
            C63743iE A03 = C63743iE.A03("com.bloks.www.ig.branded_content_ads.permissions", A0y, A0y2);
            A03.A03 = null;
            A03.A02 = null;
            r0 = C63743iE.A00(fragmentActivity, A0N, A03, A0y3);
            A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        } else {
            A0Q = C18180wK.A0Q(fragmentActivity, userSession);
            C24016D5r.A00();
            Bundle A06 = C18180wK.A06();
            C18210wN.A0x(A06, str);
            A06.putString("ARGUMENT_PERMISSION_ID", str2);
            r0 = new C156369Nf();
            r0.setArguments(A06);
        }
        A0Q.A03 = r0;
        if (z) {
            A0Q.A0C = false;
        }
        A0Q.A05();
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z, boolean z2) {
        C25786Drz A0Q;
        Fragment r0;
        AnonymousClass0TJ A0D = C18250wR.A0D(str, 2);
        if (C63803iN.A0E(A0D, userSession, 36325252841677840L)) {
            IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
            A0N.A0P = "com.bloks.www.ig.branded_content_ads.settings";
            int i = 2131822571;
            if (C63803iN.A0E(A0D, userSession, 36326635821082318L)) {
                i = 2131832173;
            }
            C18210wN.A0s(fragmentActivity, A0N, i);
            HashMap A0y = AnonymousClass0wJ.A0y();
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            HashMap A0y3 = AnonymousClass0wJ.A0y();
            new BitSet(0);
            A0y.put("prior_module", str);
            C63743iE A03 = C63743iE.A03("com.bloks.www.ig.branded_content_ads.settings", A0y, A0y2);
            A03.A03 = null;
            A03.A02 = null;
            r0 = C63743iE.A00(fragmentActivity, A0N, A03, A0y3);
            A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        } else {
            A0Q = C18180wK.A0Q(fragmentActivity, userSession);
            C24016D5r.A00();
            Bundle A06 = C18180wK.A06();
            C18210wN.A0x(A06, str);
            r0 = new AnonymousClass1wy();
            r0.setArguments(A06);
        }
        A0Q.A03 = r0;
        if (z2) {
            A0Q.A08();
        }
        if (z) {
            A0Q.A0C = false;
        }
        A0Q.A05();
    }
}
