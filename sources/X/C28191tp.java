package X;

import android.view.ViewGroup;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;

/* renamed from: X.1tp  reason: invalid class name and case insensitive filesystem */
public final class C28191tp extends C28311u3 {
    public final /* synthetic */ AnonymousClass1ZJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28191tp(AnonymousClass1ZJ r7, QuickPromotionSlot quickPromotionSlot, UserSession userSession) {
        super((ViewGroup) null, r7, r7, quickPromotionSlot, userSession);
        this.A00 = r7;
    }

    public final void CEA(C81644o8 r2) {
        C04220Ms.A0B(r2, 0);
        super.CEA(r2);
        C131497s9 r0 = this.A00.A01;
        if (r0 == null) {
            C04220Ms.A0E("controller");
            throw null;
        } else {
            C131497s9.A00(r0);
        }
    }
}
