package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6NV  reason: invalid class name */
public final class AnonymousClass6NV {
    public static final AnonymousClass5Im A00(User user) {
        AnonymousClass6NY r2;
        KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2;
        if (user.A34()) {
            r2 = AnonymousClass5wP.A00;
        } else {
            r2 = new AnonymousClass5wM(user.B4M());
        }
        String BK7 = user.BK7();
        String Ak1 = user.Ak1();
        String str = "";
        if (Ak1 == null) {
            Ak1 = str;
        }
        String A0v = user.A0v();
        if (A0v != null) {
            str = A0v;
        }
        List A1X = user.A1X();
        if (A1X == null) {
            A1X = AnonymousClass0ZV.A00;
        }
        List A1Q = user.A1Q();
        if (A1Q != null) {
            ktCSuperShape0S2000000_I2 = AnonymousClass6NX.A00(A1Q);
        } else {
            ktCSuperShape0S2000000_I2 = new KtCSuperShape0S2000000_I2((String) null, (String) null, (DefaultConstructorMarker) null, 3, 16);
        }
        return new AnonymousClass5Im(ktCSuperShape0S2000000_I2, r2, AnonymousClass006.A00, BK7, Ak1, str, A1X, C18210wN.A1T(user.A0k()));
    }
}
