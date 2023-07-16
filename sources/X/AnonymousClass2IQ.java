package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.2IQ  reason: invalid class name */
public final class AnonymousClass2IQ {
    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        List list = r8.A00;
        String A0q = C18190wL.A0q(list, 0);
        String A0q2 = C18190wL.A0q(list, A1Z ? 1 : 0);
        String A0q3 = C18190wL.A0q(list, 2);
        list.get(3);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r7));
        FragmentActivity A05 = C63913ic.A05(r7);
        C04220Ms.A0B(A05, A1Z);
        Bundle A06 = C18180wK.A06();
        C71494Ja A00 = C63343hJ.A00(A06, A02, A0q, A0q2, A0q3);
        A00.CpK("IgOrderCancellationRoute");
        AnonymousClass4u1.A02(A06, A05, A00, 2131832044);
        return null;
    }
}
