package X;

import android.content.Context;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

/* renamed from: X.4Gd  reason: invalid class name and case insensitive filesystem */
public final class C70794Gd implements C84384t3 {
    public final Map A00 = AnonymousClass0wJ.A0y();
    public final int A01;
    public final AnonymousClass3EU A02 = new AnonymousClass3EU();
    public final UserSession A03;

    public final void BQn(C81644o8 r1, QuickPromotionSlot quickPromotionSlot) {
    }

    public final void B4r(C567738m r23, C84574tR r24, QuickPromotionSlot quickPromotionSlot, AnonymousClass3UU r26, Map map, Set set) {
        UserSession userSession = this.A03;
        QuickPromotionSlot quickPromotionSlot2 = quickPromotionSlot;
        Map map2 = map;
        C28371uA r9 = new C28371uA(this.A02, quickPromotionSlot2, new AnonymousClass3VC(false), this, userSession, map2, set);
        C70764Ga A002 = AnonymousClass2SX.A00(userSession);
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313888358139612L)) {
            A002.Bd2((String) null, quickPromotionSlot2.toString(), map2);
            r9.A01((AnonymousClass3VC) null);
        }
        int i = this.A01;
        Integer num = AnonymousClass006.A01;
        C58053Dq r16 = C60933Rd.A00;
        if (r16 == null) {
            r16 = new C58053Dq();
            C60933Rd.A00 = r16;
        }
        H1T A003 = r16.A00(r26, userSession, num, map2, i);
        MIS mis = C18987Aon.A00;
        A003.A01 = new CY0(mis, AnonymousClass3O1.class);
        C32165H8c A0Q = C18190wL.A0Q(A003);
        AnonymousClass49C r1 = (AnonymousClass49C) userSession.A01(AnonymousClass49C.class, new KtLambdaShape95S0100000_I2_75(userSession, 18));
        if (r1.A00 == null || C18180wK.A05(((AnonymousClass49T) C18180wK.A0c(r1.A01, AnonymousClass49T.class, 26)).A00, "qp_cooldown_response_expiration_time") <= System.currentTimeMillis()) {
            H1T A0O = C18180wK.A0O(userSession);
            A0O.A0J("qp/get_cooldowns/");
            A0O.A01 = new CY0(mis, C60133Nv.class);
            A0O.A04.A00 = C60933Rd.A01;
            A0O.A0E(AnonymousClass006.A0Y);
            A0O.A0I(String.format("%s/%s", new Object[]{"qp_slot_cooldown_v1", "5f56efad68e1edec7801f630b5c122704ec5378adbee6609a448f105f34a9c73"}));
            C32165H8c A0Q2 = C18190wL.A0Q(A0O);
            A0Q2.A00 = new IDxACallbackShape15S0300000_1_I2(15, (Object) A0Q, (Object) userSession, (Object) r9);
            C31155GhB.A03(A0Q2);
        } else {
            A0Q.A00 = r9;
            C31155GhB.A03(A0Q);
        }
        A002.BdX((String) null, quickPromotionSlot2.toString(), map2);
    }

    public final void Cia(C84374t2 r2, QuickPromotionSlot quickPromotionSlot) {
        this.A00.put(quickPromotionSlot, r2);
    }

    public final void D8U(QuickPromotionSlot quickPromotionSlot) {
        this.A00.remove(quickPromotionSlot);
    }

    public C70794Gd(Context context, UserSession userSession) {
        this.A01 = C18190wL.A03(context);
        this.A03 = userSession;
    }
}
