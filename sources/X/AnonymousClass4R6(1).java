package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4R6  reason: invalid class name */
public final class AnonymousClass4R6 implements Runnable {
    public final /* synthetic */ C24421ii A00;
    public final /* synthetic */ UserSession A01;

    public AnonymousClass4R6(C24421ii r1, UserSession userSession) {
        this.A00 = r1;
        this.A01 = userSession;
    }

    public final void run() {
        UserSession userSession = this.A01;
        C24421ii r0 = this.A00;
        C34640IcN icN = r0.A08;
        C313625r r6 = r0.A06;
        String str = r0.A0B;
        synchronized (AnonymousClass3VH.A00()) {
        }
        FragmentActivity activity = icN.getActivity();
        if (activity instanceof C84654td) {
            BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) ((C84654td) activity);
            businessConversionActivity.Bel((Bundle) null);
            if (AnonymousClass0wJ.A1X(businessConversionActivity.A09.getValue())) {
                C04530Oa r1 = businessConversionActivity.A08;
                String str2 = C18220wO.A0U(r1).A0C;
                String str3 = C18220wO.A0U(r1).A0D;
                if (str2 != null) {
                    C67363zQ.A0D(userSession, (Boolean) null, AnonymousClass006.A0K, str2, str3);
                }
                String userId = userSession.getUserId();
                C67283zI.A04(icN.requireActivity(), icN, r6, (Integer) null, AnonymousClass006.A01, userId);
                return;
            }
        }
        C67323zM.A05(activity, C15430rJ.A01(AnonymousClass00U.A0L("instagram://professional_signup_nux?entry_point=", str)), icN, userSession);
    }
}
