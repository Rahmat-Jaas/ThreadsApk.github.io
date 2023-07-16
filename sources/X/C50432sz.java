package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape20S0400000_1_I2;
import com.facebook.redex.IDxCListenerShape217S0100000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2sz  reason: invalid class name and case insensitive filesystem */
public final class C50432sz {
    public static void A00(Activity activity, Context context, Fragment fragment, C11630kW r12, UserSession userSession, C84394t4 r14, User user) {
        IDxCListenerShape20S0400000_1_I2 iDxCListenerShape20S0400000_1_I2 = new IDxCListenerShape20S0400000_1_I2(14, (Object) activity, (Object) userSession, (Object) r14, (Object) user);
        IDxCListenerShape217S0100000_1_I2 A0O = C18220wO.A0O(r14, 179);
        String string = context.getString(2131834655);
        SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0l(context, user.BK7(), 2131834654));
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0j(fragment, userSession);
        A0W.A02 = string;
        A0W.A0p(A0E);
        A0W.A0l(user.B4M(), r12);
        A0W.A0P(iDxCListenerShape20S0400000_1_I2, 2131834651);
        A0W.A0O(A0O, 2131823054);
        AnonymousClass0wJ.A1K(A0W);
    }
}
