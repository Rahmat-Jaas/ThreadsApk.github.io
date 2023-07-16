package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3MR  reason: invalid class name */
public final class AnonymousClass3MR {
    public static final void A00(Activity activity, Context context, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        C309923u r3 = C309923u.DOGFOOD_ASSISTANT;
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("NametagFragment.ARGUMENT_ENTRY_POINT", r3);
        A06.putBoolean("NametagFragment.ARGUMENT_SCAN_MODE", true);
        C63863iT.A04(activity, A06, userSession, TransparentModalActivity.class, "nametag").A0I(context);
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession) {
        if (C63803iN.A0E(C18250wR.A0D(userSession, 1), userSession, 36324965078803274L)) {
            Context applicationContext = fragmentActivity.getApplicationContext();
            C37200JmN A00 = C37200JmN.A00();
            ArrayList A0v = AnonymousClass0wJ.A0v();
            C18240wQ.A1Q(A0v, new C28979FfK[]{C28979FfK.DOGFOODING_ASSISTANT});
            A00.A02(userSession, new C36813Jf5((C12560m7) null, new C70194Da(fragmentActivity, userSession, applicationContext), AnonymousClass006.A00, A0v));
        }
    }
}
