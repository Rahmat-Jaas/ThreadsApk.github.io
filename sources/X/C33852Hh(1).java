package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Hh  reason: invalid class name and case insensitive filesystem */
public final class C33852Hh {
    public static final Object A00(AnonymousClass601 r5, C63893iY r6) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, r5);
        C127397h3 A02 = C63893iY.A02(r6, 0);
        if (A02 == null) {
            C30967GcS.A02("IgBloksExtensions", "missing parameter: product in bk.action.ig.cxf.ShareProduct");
            return null;
        }
        C19249AtE.A01(A02);
        UserSession A022 = C05030Qo.A02(C63913ic.A0F(r5));
        FragmentActivity A05 = C63913ic.A05(r5);
        C11630kW A0A = C63913ic.A0A(r5);
        C04220Ms.A0B(A022, 0);
        AnonymousClass0wJ.A1M(A05, A1Z ? 1 : 0, A0A);
        throw C18200wM.A0d();
    }
}
