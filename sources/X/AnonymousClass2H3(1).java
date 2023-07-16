package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.2H3  reason: invalid class name */
public final class AnonymousClass2H3 {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        C11630kW A0A;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        String A0D = C63893iY.A0D(r10, 0);
        List list = r10.A00;
        String A0q = C18190wL.A0q(list, A1Z ? 1 : 0);
        String A0q2 = C18190wL.A0q(list, 2);
        String A0q3 = C18190wL.A0q(list, 5);
        if (A0q == null || A0q.length() == 0) {
            A0A = C63913ic.A0A(r9);
        } else {
            A0A = new AnonymousClass43I(A0q);
        }
        FragmentActivity A05 = C63913ic.A05(r9);
        if (A05 != null) {
            C18210wN.A0p(A05);
        }
        AnonymousClass3RM r7 = AnonymousClass3RM.A00;
        if (r7 == null) {
            r7 = new AnonymousClass3RM();
            AnonymousClass3RM.A00 = r7;
        }
        FragmentActivity A052 = C63913ic.A05(r9);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r9));
        C40309LcG lcG = (C40309LcG) EnumHelper.A00(A0D, C40309LcG.A0z);
        C04220Ms.A06(lcG);
        AnonymousClass0wJ.A1N(A052, A02);
        AnonymousClass0wJ.A1Q(A0A, lcG);
        AnonymousClass3RM.A00(A052, A0A, lcG, A02, r7, A0q2, (String) null, A0q3).A04();
        return null;
    }
}
