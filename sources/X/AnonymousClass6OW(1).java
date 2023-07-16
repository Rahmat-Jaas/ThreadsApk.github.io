package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.6OW  reason: invalid class name */
public final class AnonymousClass6OW {
    public static Object A00(AnonymousClass601 r9, C63893iY r10) {
        Object obj;
        Object obj2;
        C170009uH r8;
        UserSession A0J = C63913ic.A0J(r9);
        C04220Ms.A0B(r9, 0);
        FragmentActivity A05 = C63913ic.A05(r9);
        boolean A1Z = AnonymousClass0wJ.A1Z(A0J, A05);
        C18180wK.A1P(r10, 2, r9);
        List list = r10.A00;
        String A0q = C18190wL.A0q(list, 0);
        C108426iL r7 = new C108426iL(r9, C18190wL.A0R(list, 2));
        Object obj3 = null;
        if (5 < list.size()) {
            obj = list.get(5);
        } else {
            obj = null;
        }
        String str = (String) obj;
        if (6 < list.size()) {
            obj2 = list.get(6);
        } else {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 == null || (r8 = C170009uH.valueOf(str2)) == null) {
            r8 = C170009uH.COLLECTION_CHOOSE_COVER;
        }
        if (7 < list.size()) {
            obj3 = list.get(7);
        }
        C19513Axa.A00.A0P();
        AnonymousClass9NG r2 = new AnonymousClass9NG();
        Bundle A06 = C18180wK.A06();
        C86134wK.A15(A06, A0J);
        A06.putString(I17.A00(293), A0q);
        A06.putString("product_id", str);
        A06.putString("merchant_id", (String) obj3);
        A06.putSerializable(AnonymousClass000.A00(76), r8);
        r2.setArguments(A06);
        r2.A00 = r7;
        C25786Drz A0Q = C18180wK.A0Q(A05, A0J);
        A0Q.A03 = r2;
        A0Q.A0D = A1Z;
        C25786Drz.A03(A0Q, AnonymousClass006.A00);
        return null;
    }
}
