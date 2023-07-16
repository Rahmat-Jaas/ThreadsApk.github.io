package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.2Hl  reason: invalid class name and case insensitive filesystem */
public final class C33892Hl {
    public static final Object A00(AnonymousClass601 r13) {
        C34640IcN icN;
        C04220Ms.A0B(r13, 1);
        FragmentActivity A05 = C63913ic.A05(r13);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r13));
        C12560m7 supportFragmentManager = A05.getSupportFragmentManager();
        Fragment A03 = C63913ic.A03(r13);
        if (A03 == null || !(A03 instanceof C34640IcN)) {
            icN = null;
        } else {
            icN = (C34640IcN) A03;
        }
        C11630kW A0A = C63913ic.A0A(r13);
        boolean A06 = C63533hk.A06(A02);
        Context A08 = C18230wP.A08();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Integer num = AnonymousClass006.A00;
        if (icN != null) {
            A0A = icN;
        }
        new AnonymousClass1jJ(A08, icN, A05, supportFragmentManager, A0A, A02, num, Collections.emptyList(), A0v, true, A06).A02(new Void[0]);
        return null;
    }
}
