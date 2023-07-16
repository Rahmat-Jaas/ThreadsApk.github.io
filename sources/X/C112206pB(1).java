package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.igds.components.tooltip.IDxTCallbackShape160S0100000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.6pB  reason: invalid class name and case insensitive filesystem */
public final class C112206pB {
    public final UserSession A00;
    public final Activity A01;

    public C112206pB(Activity activity, UserSession userSession) {
        C04220Ms.A0B(activity, 1);
        this.A01 = activity;
        this.A00 = userSession;
    }

    public final C25918DvM A00(View view, Integer num) {
        Context context;
        int width;
        AnonymousClass3TC r0;
        C04220Ms.A0B(view, 0);
        C25553Dnn dnn = new C25553Dnn(this.A01, new C26431qd(2131834038));
        int intValue = num.intValue();
        if (intValue != 0) {
            context = view.getContext();
            width = C86144wL.A06(context) / 2;
        } else {
            context = view.getContext();
            width = (view.getWidth() / 2) - C86144wL.A06(context);
        }
        dnn.A02(view, width, C86124wJ.A08(context) * 3, true);
        if (intValue != 0) {
            r0 = AnonymousClass3TC.A06;
        } else {
            r0 = AnonymousClass3TC.A05;
        }
        dnn.A04(r0);
        dnn.A03(D0f.BELOW_ANCHOR);
        dnn.A0E = false;
        dnn.A0A = true;
        dnn.A05 = new IDxTCallbackShape160S0100000_2_I2(this, 0);
        return dnn.A00();
    }
}
