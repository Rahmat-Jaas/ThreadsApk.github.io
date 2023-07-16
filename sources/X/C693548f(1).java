package X;

import com.instagram.api.sessionscoped.IDxACallbackShape102S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.48f  reason: invalid class name and case insensitive filesystem */
public final class C693548f implements C33445Ho0 {
    public final /* synthetic */ HEX A00;
    public final /* synthetic */ C85834vq A01;
    public final /* synthetic */ List A02;

    public C693548f(HEX hex, C85834vq r2, List list) {
        this.A00 = hex;
        this.A01 = r2;
        this.A02 = list;
    }

    public final void CwX(C40983LtS ltS) {
        C04220Ms.A0B(ltS, 0);
        AnonymousClass34L r5 = new AnonymousClass34L(ltS);
        UserSession userSession = this.A00.A00;
        String str = AnonymousClass3NM.A00(this.A01).A00;
        List list = this.A02;
        ArrayList A0x = AnonymousClass0wJ.A0x(list, 10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18190wL.A1T(A0x, it);
        }
        if (!A0x.isEmpty()) {
            H1T A0N = AnonymousClass0wJ.A0N(userSession);
            A0N.A0T("direct_v2/threads/%s/add_user/", str);
            JSONArray A0i = C18250wR.A0i();
            Iterator it2 = A0x.iterator();
            while (it2.hasNext()) {
                C18210wN.A1R(it2, A0i);
            }
            A0N.A0O("user_ids", A0i.toString());
            C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, C28464FNa.class, AnonymousClass3MK.class);
            A0T.A00 = new IDxACallbackShape102S0100000_1_I2(userSession, r5, 1);
            C31155GhB.A03(A0T);
        }
    }
}
