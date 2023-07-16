package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2zK  reason: invalid class name and case insensitive filesystem */
public final class C54362zK {
    public static void A00(Context context, C12560m7 r9, FragmentActivity fragmentActivity, UserSession userSession) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        UserSession userSession2 = userSession;
        IDxACallbackShape5S0400000_1_I2 iDxACallbackShape5S0400000_1_I2 = new IDxACallbackShape5S0400000_1_I2(12, fragmentActivity, context, userSession2, r9);
        AnonymousClass322.A00(context, iDxACallbackShape5S0400000_1_I2, userSession2, AnonymousClass006.A01, "challenge/", A0y);
    }
}
