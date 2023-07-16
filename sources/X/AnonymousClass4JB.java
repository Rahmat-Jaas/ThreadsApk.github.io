package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.hangouts.args.HangoutsDeeplinkArguments;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4JB  reason: invalid class name */
public final class AnonymousClass4JB implements C82924qU {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final UserSession A02;

    public final void BN1(Uri uri, Bundle bundle) {
        Object obj;
        String str;
        if (bundle != null && (obj = bundle.get("target_user_ids")) != null) {
            String str2 = (String) obj;
            Object obj2 = bundle.get("target_thread_id");
            if (obj2 != null) {
                String str3 = (String) obj2;
                Object obj3 = bundle.get("target_group_name");
                if (obj3 == null) {
                    obj3 = "";
                }
                C04220Ms.A0C(obj3, "null cannot be cast to non-null type kotlin.String");
                String str4 = (String) obj3;
                List A07 = C81074n3.A07(str2, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
                UserSession userSession = this.A02;
                C25550Dnj A002 = AnonymousClass6VR.A00(userSession);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Iterator it = A07.iterator();
                while (it.hasNext()) {
                    User A03 = A002.A03(C18180wK.A0k(it));
                    if (A03 != null) {
                        A0v.add(A03);
                    }
                }
                if (A07.size() == 1) {
                    str = C18190wL.A0p(A07, 0);
                } else {
                    str = null;
                }
                FragmentActivity fragmentActivity = this.A01;
                DBI.A00(fragmentActivity, this.A00, fragmentActivity, (HangoutsDeeplinkArguments) null, userSession, str3, str, str4, (String) null, A0v, A07, C76494eB.A00, false);
            }
        }
    }

    public AnonymousClass4JB(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A00 = fragment;
    }
}
