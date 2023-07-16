package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxCListenerShape14S1100000_1_I2;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3YG  reason: invalid class name */
public final class AnonymousClass3YG {
    public final Bundle A00;
    public final FragmentActivity A01;
    public final C27930Evg A02;
    public final C22302CTd A03;
    public final C11630kW A04;
    public final UserSession A05;

    public static void A00(IgFragmentActivity igFragmentActivity, UserSession userSession, List list) {
        C04220Ms.A0B(userSession, 0);
        if (((AnonymousClass364) userSession.A01(AnonymousClass364.class, AnonymousClass4Xt.A00)).A00) {
            list.add(AnonymousClass4MA.A00(C18200wM.A0R(igFragmentActivity, userSession, 172), 2131834843));
        }
    }

    public static void A01(AnonymousClass3YG r2, List list, int i, int i2) {
        list.add(new AnonymousClass4MA((View.OnClickListener) new IDxCListenerShape202S0100000_1_I2_1(r2, i), i2));
    }

    public final void A02(Integer num, String str, List list) {
        String B1H;
        Boolean bool = Boolean.TRUE;
        UserSession userSession = this.A05;
        C04620Ok r3 = C06810aP.A01;
        if (bool.equals(Boolean.valueOf(C18210wN.A1T(C18240wQ.A0W(userSession, r3).AgR()))) && !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316409504074848L)) {
            list.add(AnonymousClass4MA.A00(new IDxCListenerShape14S1100000_1_I2(str, (Object) this, 14), 2131832455));
        }
        Boolean AOJ = C18240wQ.A0W(userSession, r3).AOJ();
        if (AOJ != null && AOJ.booleanValue()) {
            A01(this, list, 116, 2131820795);
        }
        A01(this, list, 114, 2131835191);
        Boolean BRH = C18240wQ.A0W(userSession, r3).BRH();
        if ((BRH != null && BRH.booleanValue()) || C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36310903355932975L)) {
            A01(this, list, HttpStatus.SC_SWITCHING_PROTOCOLS, 2131827749);
        }
        FragmentActivity fragmentActivity = this.A01;
        list.add(AnonymousClass4MA.A00(new IDxCListenerShape70S0200000_1_I2((Activity) fragmentActivity, userSession, 171), 2131827931));
        if (r3.A01(userSession).A35()) {
            A01(this, list, 109, 2131836339);
        }
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36315258452707828L)) {
            if (AnonymousClass3RM.A00 == null) {
                AnonymousClass3RM.A00 = new AnonymousClass3RM();
            }
            A01(this, list, 117, 2131820880);
        }
        if (C63803iN.A0E(r2, userSession, 36316564122766509L)) {
            A01(this, list, 98, 2131821779);
        }
        int i = 2131827935;
        int i2 = 112;
        if (C63803iN.A0E(r2, userSession, 36325733877949669L)) {
            i = 2131827936;
            i2 = HttpStatus.SC_PROCESSING;
        }
        A01(this, list, i2, i);
        list.add(AnonymousClass4MA.A00(new IDxCListenerShape14S1100000_1_I2(str, (Object) this, 13), 2131835532));
        Boolean AVs = C18240wQ.A0W(userSession, r3).AVs();
        if (AVs != null && AVs.booleanValue()) {
            A01(this, list, 107, 2131835571);
        }
        AnonymousClass0TJ r6 = AnonymousClass0TJ.A06;
        if (C63803iN.A0E(r6, userSession, 36310589823320209L) || C63803iN.A0E(r6, userSession, 36310989255213394L)) {
            A01(this, list, 99, 2131828987);
        }
        if (C63803iN.A0E(r6, userSession, 36321013708888530L)) {
            A01(this, list, 105, 2131830254);
        }
        if (!C63803iN.A0E(r2, userSession, 36322680156200398L) && C63803iN.A0E(r2, userSession, 36314274905261925L)) {
            A01(this, list, 103, 2131829626);
        }
        A01(this, list, 111, 2131827932);
        if (C18200wM.A0a(userSession, r3) != C169839tz.PrivacyStatusPrivate && C63803iN.A0E(r2, userSession, 36316813230869846L)) {
            A01(this, list, 100, 2131826748);
        }
        A01(this, list, 104, 2131827805);
        list.add(AnonymousClass4MA.A00(new IDxCListenerShape202S0100000_1_I2_1(this, 110), 2131823197));
        A01(this, list, 115, 2131827937);
        A00((IgFragmentActivity) fragmentActivity, userSession, list);
        if (C63803iN.A0E(r2, userSession, 36316482518387841L)) {
            A01(this, list, 113, 2131834955);
        }
        User A012 = r3.A01(userSession);
        if (!(A012.A3Z() || (B1H = A012.A05.B1H()) == null || B1H.length() == 0)) {
            A01(this, list, 106, 2131824315);
        }
        if (!r3.A01(userSession).A3a()) {
            A01(this, list, 118, 2131822521);
        }
        if (((AnonymousClass36A) userSession.A01(AnonymousClass36A.class, C73774Ub.A00)).A00) {
            A01(this, list, 108, 2131835884);
        }
        C61783Vj r0 = new C61783Vj(this.A03, userSession);
        r0.A02(num, list);
        r0.A03(num, list);
    }

    public AnonymousClass3YG(Bundle bundle, C27930Evg evg, C22302CTd cTd, C11630kW r5, UserSession userSession) {
        this.A03 = cTd;
        this.A01 = cTd.requireActivity();
        this.A00 = bundle;
        this.A05 = userSession;
        this.A04 = r5;
        this.A02 = evg;
    }
}
