package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.6Su  reason: invalid class name and case insensitive filesystem */
public final class C101836Su {
    public static Fragment A00(UserSession userSession, boolean z) {
        Fragment ibI;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A06;
        if (C63803iN.A0E(r2, userSession, 36318406663868799L) || C63803iN.A0E(r2, userSession, 36318406663999872L)) {
            ibI = new C34588IbI();
        } else {
            ibI = new C34585IbE();
        }
        Bundle A06 = C18180wK.A06();
        A06.putBoolean(I17.A00(85), z);
        C05050Qq.A00(A06, userSession);
        ibI.setArguments(A06);
        return ibI;
    }
}
