package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;

/* renamed from: X.6Oc  reason: invalid class name and case insensitive filesystem */
public final class C100646Oc {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        Object A0B = C63893iY.A0B(r9, 0);
        A0B.getClass();
        C121997Jj r4 = (C121997Jj) A0B;
        Object A0B2 = C63893iY.A0B(r9, A1Z ? 1 : 0);
        A0B2.getClass();
        C127397h3 r3 = (C127397h3) A0B2;
        C04220Ms.A04(r3);
        Bundle A06 = C18180wK.A06();
        AnonymousClass3W9.A01(A06, C63913ic.A0F(r8));
        AnonymousClass3HX r2 = r8.A00;
        C04220Ms.A0B(r4, 0);
        String str = (String) C121107Ed.A04.A0T();
        if (str == null) {
            return null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) AnonymousClass77M.A00.A00(str);
        if (fragmentActivity != null) {
            String A0n = C18190wL.A0n(C03480Iw.A00());
            C1192073y.A00(A0n, str);
            HashMap hashMap = C1192073y.A01;
            hashMap.put(A0n, new C108786iw(r2, r4, r3));
            AnonymousClass5wr r42 = new AnonymousClass5wr();
            Bundle A062 = C18180wK.A06();
            A062.putAll(A06);
            A062.putString("prompt_id", A0n);
            if (C63173fJ.A05(AnonymousClass0TJ.A05, 18313190794340423L)) {
                C98836Hc.A00(A0n, "ConsentFlowContainerController::showBottomSheet", hashMap);
            }
            r42.setArguments(A062);
            AnonymousClass01J A0L = C18220wO.A0L(fragmentActivity);
            A0L.A0F(r42, "consent_bottom_sheet", 16908290);
            A0L.A0G = A1Z;
            A0L.A0K((String) null);
            A0L.A00();
            return null;
        }
        throw C18180wK.A0a("No active consent flow is opened!");
    }
}
