package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.2Hg  reason: invalid class name and case insensitive filesystem */
public final class C33842Hg {
    public static Object A00(AnonymousClass601 r8, C63893iY r9) {
        String str;
        List list = r9.A00;
        C127397h3 r0 = (C127397h3) list.get(0);
        if (r0 == null) {
            C30967GcS.A02("IgBloksExtensions", "missing parameter: product in bk.action.ig.cxf.SendMessageToMerchant");
        } else {
            r9.A0H(1);
            C127397h3 r1 = (C127397h3) list.get(2);
            Product A01 = C19249AtE.A01(r0);
            if (r1 != null) {
                r1.A0N(36);
                r1.A0R(35);
            }
            UserSession A0J = C63913ic.A0J(r8);
            C04220Ms.A0B(r8, 0);
            FragmentActivity A05 = C63913ic.A05(r8);
            C11630kW A0A = C63913ic.A0A(r8);
            C04220Ms.A0B(A0J, 1);
            C18180wK.A1P(A05, 2, A0A);
            if (C18220wO.A0b(A05) != null) {
                Merchant merchant = A01.A00.A0C;
                if (merchant != null) {
                    str = merchant.A06;
                } else {
                    str = null;
                }
                new User(str, merchant.A08).A1z(A01.A00.A0C.A02);
                throw C18200wM.A0d();
            }
        }
        return null;
    }
}
