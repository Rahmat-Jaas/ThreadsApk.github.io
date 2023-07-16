package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1h7  reason: invalid class name */
public final class AnonymousClass1h7 extends C63873iU {
    public final UserSession A00;

    public AnonymousClass1h7(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void A00(AnonymousClass1UF r7) {
        int i;
        Map map;
        int A03 = C14030oh.A03(1542579803);
        C04220Ms.A0B(r7, 0);
        if (r7.A00 == null) {
            i = -684454047;
        } else {
            Iterator it = C18200wM.A0s(this.A00.multipleAccountHelper.A00.A04((User) null)).iterator();
            while (it.hasNext()) {
                User A0c = C18220wO.A0c(it);
                C569939i r1 = (C569939i) r7.A00.get(A0c.getId());
                if (r1 == null) {
                    A0c.A1g(0);
                    map = null;
                } else {
                    A0c.A1g(r1.A00);
                    map = r1.A02;
                }
                A0c.A06 = map;
            }
            C38040KHr.A01.CWx(new AnonymousClass459());
            i = 1193729816;
        }
        C14030oh.A0A(i, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(1302591628);
        A00((AnonymousClass1UF) obj);
        C14030oh.A0A(-2068763176, A03);
    }
}
