package X;

import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2GT  reason: invalid class name */
public final class AnonymousClass2GT {
    public static final Object A00(AnonymousClass601 r27, C63893iY r28) {
        String A0N;
        int A0H;
        AnonymousClass601 r6 = r27;
        C63893iY r1 = r28;
        boolean A1Z = AnonymousClass0wJ.A1Z(r1, r6);
        C127397h3 A02 = C63893iY.A02(r1, 0);
        Object A0B = C63893iY.A0B(r1, A1Z ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
        C121997Jj r5 = (C121997Jj) A0B;
        r1.A0H(2);
        AnonymousClass3HX r0 = r6.A00;
        if (r0 == null || r0.A00 == null || A02 == null || (A0N = A02.A0N(38)) == null || -1 == (A0H = A02.A0H(40, -1))) {
            return null;
        }
        Map map = (Map) C61043Rr.A00(r6, C63893iY.A01, C18230wP.A0V(A02));
        if (map == null) {
            return null;
        }
        C66843yQ r9 = new C66843yQ((SparseArray) null, (C83284r8) null, (C83284r8) null, (Object) null, (String) null, (String) null, (HashMap) null, AnonymousClass0wJ.A0v(), map, (Map) null, (Map) null, -1, A0H, -1, -1, false, false);
        IgBloksScreenConfig A0N2 = C18190wL.A0N(C63913ic.A0F(r6));
        A0N2.A0Q = A0N;
        String A0N3 = A02.A0N(41);
        FragmentActivity A05 = C63913ic.A05(r6);
        Integer num = AnonymousClass006.A0C;
        C210718u A04 = A0N2.A04();
        AnonymousClass1Xb r02 = (AnonymousClass1Xb) AnonymousClass3ZR.A01(A05);
        if (r02 != null) {
            AnonymousClass1Xb.A00(r02).A05(r02.requireContext(), C63123bZ.A01(A05, r02, r9, r5, A04, A0N), num, A0N3);
            return null;
        }
        throw C18180wK.A0a("Cannot replace a without an existing bottom sheet.");
    }
}
