package X;

import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxDListenerShape133S0300000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1r2  reason: invalid class name and case insensitive filesystem */
public final class C26681r2 extends C26741r8 {
    public final /* synthetic */ AnonymousClass1aS A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26681r2(Fragment fragment, C11630kW r8, C84634tZ r9, AnonymousClass1aS r10, C07530bf r11, AnonymousClass265 r12, List list) {
        super(fragment, r8, r9, r11, r12);
        this.A00 = r10;
        this.A01 = list;
    }

    public final void A03(UserSession userSession, User user) {
        AnonymousClass1aS r4;
        String BK7;
        String id;
        boolean z = true;
        UserSession userSession2 = userSession;
        IDxDListenerShape133S0300000_1_I2 iDxDListenerShape133S0300000_1_I2 = new IDxDListenerShape133S0300000_1_I2(1, this, user, userSession);
        if (this.A01.size() != 1) {
            r4 = this.A00;
            if (!C09790gg.A00(r4.A05)) {
                if (!C63533hk.A02(userSession).A0I(user.getId())) {
                    BK7 = user.BK7();
                    id = user.getId();
                    z = false;
                } else {
                    List<AnonymousClass3FU> list = r4.A05;
                    if (list != null) {
                        for (AnonymousClass3FU A002 : list) {
                            if (!C63533hk.A02(userSession).A0I(A002.A00())) {
                            }
                        }
                    }
                    super.A03(userSession, user);
                }
                BK7 = user.BK7();
                id = user.getId();
                z = false;
                AnonymousClass1aS.A00(iDxDListenerShape133S0300000_1_I2, r4, userSession2, BK7, id, z);
                return;
            }
        }
        if (!C63533hk.A02(userSession).A0I(user.getId())) {
            r4 = this.A00;
            BK7 = user.BK7();
            id = user.getId();
            AnonymousClass1aS.A00(iDxDListenerShape133S0300000_1_I2, r4, userSession2, BK7, id, z);
            return;
        }
        super.A03(userSession, user);
    }

    public static void A00(C26681r2 r0, UserSession userSession, User user) {
        super.A03(userSession, user);
    }

    public final void A02(C26641qy r6) {
        int A03 = C14030oh.A03(1784124848);
        this.A00.A05 = C18210wN.A0J(r6.A0A);
        List list = this.A01;
        if (list.size() > 1) {
            HashSet A0u = C18200wM.A0u();
            A0u.addAll(list);
            C18250wR.A0p(C18200wM.A0C().edit(), "recovered_account_ids", A0u);
        }
        super.A02(r6);
        C14030oh.A0A(-467612879, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C14030oh.A0A(-1661707741, C63873iU.A04(this, obj, 2145434976));
    }
}
