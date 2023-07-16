package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2IN  reason: invalid class name */
public final class AnonymousClass2IN {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        AnonymousClass22H r2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        String A0D = C63893iY.A0D(r10, 0);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r9));
        FragmentActivity A05 = C63913ic.A05(r9);
        AnonymousClass22H[] values = AnonymousClass22H.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r2 = AnonymousClass22H.UNKNOWN;
                break;
            }
            r2 = values[i];
            if (A0D.equalsIgnoreCase(r2.name())) {
                break;
            }
            i++;
        }
        C04220Ms.A06(r2);
        C49102qq.A00(A05, r2, new C15720rm("ig_bloks_settings"), A02, A1Z);
        return null;
    }
}
