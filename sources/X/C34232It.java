package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape14S1200000_1_I2;
import com.facebook.redex.IDxCListenerShape20S1100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;

/* renamed from: X.2It  reason: invalid class name and case insensitive filesystem */
public final class C34232It {
    public static final Object A00(AnonymousClass601 r21, C63893iY r22) {
        String A0q;
        AnonymousClass601 r6 = r21;
        C63893iY r0 = r22;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r6);
        List list = r0.A00;
        if (list.size() == 0) {
            A0q = "";
        } else {
            A0q = C18190wL.A0q(list, 0);
        }
        UserSession userSession = (UserSession) C63913ic.A0F(r6);
        Fragment A01 = C63913ic.A01(r6);
        FragmentActivity A05 = C63913ic.A05(r6);
        FragmentActivity A052 = C63913ic.A05(r6);
        AnonymousClass4NA r10 = new AnonymousClass4NA(new C15720rm("quiet_mode"), userSession, A0q);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0201000_I2_2((Object) r10, (Object) userSession, (C146958n9) null, 27), C18200wM.A0M(A01), 3);
        AnonymousClass0TJ r62 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r62, userSession, 36320360874514359L)) {
            if (A0q == null) {
                A0q = "unknown";
            }
            C04220Ms.A0B(A052, 0);
            AnonymousClass0wJ.A1M(A05, A1Z, userSession);
            C25828Dsm A0W = C18190wL.A0W(A052);
            C18230wP.A11(A05, A0W, R.drawable.ig_illustrations_qp_moon_refresh);
            A0W.A02 = A05.getString(2131833978);
            int i = 2131833969;
            if (C63803iN.A0E(r62, userSession, 36320360874579896L)) {
                i = 2131833970;
            }
            A0W.A0p(C18220wO.A0h(A05, C63823iP.A07(A05, C63803iN.A03(r62, userSession, 36601835850829580L)), C63823iP.A07(A05, C63803iN.A03(r62, userSession, 36601835850698507L)), i));
            A0W.A0T(new IDxCListenerShape14S1200000_1_I2((Object) A052, (Object) userSession, A0q, 9), AnonymousClass25l.DEFAULT, 2131826643);
            A0W.A0O(new IDxCListenerShape20S1100000_1_I2(A0q, (Object) userSession, 12), 2131831976);
            AnonymousClass0wJ.A1K(A0W);
            AnonymousClass3Ui.A00(new AnonymousClass3Ui(new C15720rm("quiet_mode"), userSession), C63823iP.A05(userSession), (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_upsell_unified_dialog_shown", A0q, (Map) null, 4088);
            return null;
        }
        if (A0q == null) {
            A0q = "unknown";
        }
        C04220Ms.A0B(A052, 0);
        AnonymousClass0wJ.A1M(A05, A1Z ? 1 : 0, userSession);
        AnonymousClass0wJ.A0Y(userSession).A2X(A1Z);
        Drawable drawable = A05.getDrawable(R.drawable.instagram_clock_dotted_pano_outline_24);
        C63733iD A012 = C63733iD.A01();
        C63733iD.A07(A05, A012, 2131833978);
        ImageView imageView = E2V.A03(A052).A0P;
        C04220Ms.A06(imageView);
        A012.A0K = A1Z;
        A012.A04 = imageView;
        A012.A0D = AnonymousClass0wJ.A0k(A05, 2131826643);
        A012.A07 = new AnonymousClass4D8(A052, userSession, A0q);
        A012.A03 = drawable;
        A012.A0E(AnonymousClass22b.ICON);
        A012.A0I = A1Z;
        A012.A0C();
        A012.A0F = A05.getString(2131833977);
        C63733iD.A09(C38040KHr.A01, A012);
        AnonymousClass3Ui.A00(new AnonymousClass3Ui(new C15720rm("quiet_mode"), userSession), C63823iP.A05(userSession), (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_confirmation_toast_shown", A0q, (Map) null, 4088);
        return null;
    }
}
