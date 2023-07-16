package X;

import android.content.Context;
import com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape45S0200000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.2JA  reason: invalid class name */
public final class AnonymousClass2JA {
    public static Object A00(AnonymousClass601 r10, C63893iY r11) {
        C109326jp r0;
        AnonymousClass427 r6;
        Object A0B = C63893iY.A0B(r11, 0);
        if (A0B instanceof C105916eC) {
            r0 = ((C105916eC) A0B).A00;
        } else {
            r0 = null;
        }
        UserSession A0J = C63913ic.A0J(r10);
        if (r0 != null) {
            r6 = new AnonymousClass427(r10, r0, A0J);
        } else {
            r6 = null;
        }
        C04220Ms.A0B(r10, 0);
        AnonymousClass4Aj r3 = new AnonymousClass4Aj(C63913ic.A01(r10), C63913ic.A07(r10), r6, A0J, AnonymousClass0wJ.A0Y(A0J), AnonymousClass006.A0w);
        C63913ic.A0Q(r10, new IDxLListenerShape45S0200000_1_I2(2, (Object) r3, (Object) r10));
        Context context = C63913ic.A01(r10).getContext();
        if (context != null) {
            r3.A08(context);
        }
        return null;
    }
}
