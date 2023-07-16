package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.service.session.UserSession;
import java.util.Set;

/* renamed from: X.3EU  reason: invalid class name */
public final class AnonymousClass3EU {
    public final C85894vw[] A00 = {new C70604Fk(), new C70594Fj(), new C70614Fl(), new C70634Fn(), new C70624Fm()};

    public final C62573aJ A00(Context context, QuickPromotionSurface quickPromotionSurface, C57833Cq r21, UserSession userSession, Set set, Set set2, long j, long j2, boolean z) {
        C62573aJ DAL;
        UserSession userSession2 = userSession;
        AnonymousClass44Y A02 = C36622Sa.A00().A02(userSession2);
        C57833Cq r10 = r21;
        String str = r10.A02.A05;
        C85894vw[] r4 = this.A00;
        int length = r4.length;
        int i = 0;
        while (true) {
            boolean z2 = z;
            if (i < length) {
                C85894vw r7 = r4[i];
                A02.A01(r7.BLz(), str, z2);
                DAL = r7.DAL(context, quickPromotionSurface, r10, userSession2, set, set2, j, j2);
                if (!DAL.A02 || DAL.A01) {
                    String str2 = DAL.A00;
                } else {
                    i++;
                }
            } else {
                A02.A01("client_promotion_valid", str, z2);
                return C62573aJ.A00();
            }
        }
        String str22 = DAL.A00;
        if (TextUtils.isEmpty(str22)) {
            str22 = "unknown";
        }
        C10450iM.A03("IG-QP", AnonymousClass00U.A0V(str22, "; promotion id: ", str));
        return DAL;
    }
}
