package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape14S1200000_1_I2;
import com.facebook.redex.IDxCListenerShape6S1500000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Iu  reason: invalid class name and case insensitive filesystem */
public final class C34242Iu {
    public static final Object A00(AnonymousClass601 r12, C63893iY r13) {
        String A0q;
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        List list = r13.A00;
        if (list.size() == 0) {
            A0q = "";
        } else {
            A0q = C18190wL.A0q(list, 0);
        }
        UserSession userSession = (UserSession) C63913ic.A0F(r12);
        FragmentActivity A05 = C63913ic.A05(r12);
        FragmentActivity A052 = C63913ic.A05(r12);
        if (A0q == null) {
            A0q = "unknown";
        }
        C04220Ms.A0B(A052, 0);
        AnonymousClass0wJ.A1M(A05, A1Z ? 1 : 0, userSession);
        C15720rm r8 = new C15720rm("quiet_mode");
        AnonymousClass4NB r10 = new AnonymousClass4NB(r8, userSession, A0q);
        C25828Dsm A0W = C18190wL.A0W(A052);
        C18230wP.A11(A05, A0W, R.drawable.ig_illustrations_qp_moon_refresh);
        A0W.A02 = A05.getString(2131833948);
        A0W.A0K(2131833946);
        A0W.A0c(new IDxCListenerShape6S1500000_1_I2(A05, A052, r8, userSession, r10, A0q, 1), A05.getString(2131833949));
        A0W.A0O(new IDxCListenerShape14S1200000_1_I2((Object) r8, (Object) userSession, A0q, 10), 2131833947);
        AnonymousClass0wJ.A1K(A0W);
        AnonymousClass3Ui.A00(new AnonymousClass3Ui(r8, userSession), C63823iP.A05(userSession), (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_upsell_enable_flow_dialog_shown", A0q, (Map) null, 4088);
        return null;
    }
}
