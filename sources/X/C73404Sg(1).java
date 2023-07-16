package X;

import android.content.Context;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Sg  reason: invalid class name and case insensitive filesystem */
public final class C73404Sg implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C81644o8 A01;
    public final /* synthetic */ AnonymousClass1x2 A02;

    public C73404Sg(Context context, C81644o8 r2, AnonymousClass1x2 r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        C61833Vz A002 = C36622Sa.A00();
        Context context = this.A00;
        C04220Ms.A05(context);
        UserSession A0X = AnonymousClass0wJ.A0X(this.A02.A0L);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A02;
        C81644o8 r0 = this.A01;
        C04220Ms.A05(r0);
        A002.A0A(context, r0, quickPromotionSlot, A0X);
    }
}
