package X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.2rW  reason: invalid class name and case insensitive filesystem */
public final class C49522rW {
    public static final void A00(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        boolean A1Z = C18200wM.A1Z(userSession);
        SharedPreferences A04 = C28161tl.A04(userSession);
        if (!A04.getBoolean("recon_destination_nux", false)) {
            C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
            A0W.A02 = context.getString(2131834136);
            C18220wO.A14(context, A0W, 2131834135);
            C18230wP.A11(context, A0W, R.drawable.ig_illustrations_illo_shopping_bag);
            A0W.A0c(C64333k4.A00, "See Products");
            A0W.A0q(A1Z);
            A0W.A0r(A1Z);
            AnonymousClass0wJ.A1K(A0W);
            AnonymousClass0wJ.A13(A04.edit(), "recon_destination_nux", A1Z);
        }
    }
}
