package X;

import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCCallbackShape583S0100000_1_I2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2G4  reason: invalid class name */
public final class AnonymousClass2G4 {
    public static final Object A00(AnonymousClass601 r22, C63893iY r23) {
        long j;
        Boolean valueOf;
        AnonymousClass601 r10 = r22;
        C63893iY r2 = r23;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r10);
        List list = r2.A00;
        AnonymousClass3HX r9 = (AnonymousClass3HX) list.get(0);
        Object obj = list.get(A1Z ? 1 : 0);
        if (obj instanceof Number) {
            j = C18190wL.A08(obj);
        } else {
            j = 0;
        }
        String A0q = C18190wL.A0q(list, 2);
        List list2 = (List) list.get(3);
        C109326jp A06 = C63893iY.A06(r2, 4);
        C109326jp A0R = C18190wL.A0R(list, 5);
        Object A0B = C63893iY.A0B(r2, 6);
        A0B.getClass();
        C127397h3 r24 = (C127397h3) A0B;
        C04220Ms.A04(r24);
        Boolean bool = null;
        SparseArray clone = r24.A04.clone();
        AnonymousClass326.A03.incrementAndGet();
        r24.A0T(35, A1Z);
        if (clone.get(49) == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(AnonymousClass2LL.A00(clone.get(49), false));
        }
        if (clone.get(50) != null) {
            bool = Boolean.valueOf(AnonymousClass2LL.A00(clone.get(50), false));
        }
        FragmentActivity A05 = C63913ic.A05(r10);
        C10300i6 A0F = C63913ic.A0F(r10);
        C33157Hi9 hi9 = new C33157Hi9(A05, r9, r10, A06, A0R, A0F, valueOf, bool, A0q, (String) clone.get(52), list2, r24.A0H(42, 512), j, r24.A0T(36, false), r24.A0T(38, false));
        C04220Ms.A0B(A0F, 0);
        C37200JmN A00 = C37200JmN.A00();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C18240wQ.A1Q(A0v, new C28979FfK[]{C28979FfK.IGWB_SELFIE_CAPTCHA_CHALLENGE});
        A00.A02(A0F, new C36813Jf5((C12560m7) null, new IDxCCallbackShape583S0100000_1_I2(hi9, 0), AnonymousClass006.A00, A0v));
        return null;
    }
}
