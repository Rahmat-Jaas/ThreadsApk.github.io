package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape217S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.3FC  reason: invalid class name */
public final class AnonymousClass3FC {
    public FragmentActivity A00;
    public UserSession A01;

    public final void A00(DialogInterface.OnDismissListener onDismissListener, boolean z) {
        IDxCListenerShape217S0100000_1_I2 iDxCListenerShape217S0100000_1_I2;
        UserSession userSession = this.A01;
        if (C28161tl.A04(userSession).getBoolean("show_recycling_bin_dialog", true)) {
            AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(userSession)), "show_recycling_bin_dialog", false);
            FragmentActivity fragmentActivity = this.A00;
            C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
            C18230wP.A11(fragmentActivity, A0W, R.drawable.ig_illustrations_illo_delete_recovery);
            A0W.A0q(true);
            A0W.A0r(true);
            A0W.A0L(2131834146);
            A0W.A0K(2131834145);
            A0W.A0N(C18220wO.A0O(this, 187), 2131834147);
            if (z) {
                iDxCListenerShape217S0100000_1_I2 = C18220wO.A0O(this, 188);
            } else {
                iDxCListenerShape217S0100000_1_I2 = null;
            }
            A0W.A0O(iDxCListenerShape217S0100000_1_I2, 2131826195);
            if (onDismissListener != null) {
                A0W.A0e(onDismissListener);
            }
            AnonymousClass0wJ.A1K(A0W);
        }
    }

    public AnonymousClass3FC(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
