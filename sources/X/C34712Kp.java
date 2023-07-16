package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Kp  reason: invalid class name and case insensitive filesystem */
public final class C34712Kp {
    public static final void A00(Context context, DialogInterface.OnClickListener onClickListener, UserSession userSession) {
        boolean A1Z = AnonymousClass0wJ.A1Z(context, userSession);
        try {
            C25828Dsm A0W = C18190wL.A0W(context);
            A0W.A02 = context.getResources().getString(2131826261);
            A0W.A0p(context.getResources().getString(2131826260));
            A0W.A0P(onClickListener, 2131831976);
            C18230wP.A11(context, A0W, R.drawable.ig_illustrations_illo_ads_megaphone);
            A0W.A0r(A1Z);
            AnonymousClass0wJ.A1K(A0W);
            AnonymousClass0wJ.A13(C28161tl.A03(userSession), "clips_draft_sla_nux", A1Z);
        } catch (Resources.NotFoundException unused) {
        }
    }
}
