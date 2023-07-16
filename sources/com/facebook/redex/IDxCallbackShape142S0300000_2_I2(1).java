package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3XX;
import X.AnonymousClass601;
import X.AnonymousClass6DF;
import X.BKU;
import X.C110726mA;
import X.C11630kW;
import X.C127397h3;
import X.C134487xm;
import X.C145498kb;
import X.C146578mT;
import X.C156169Me;
import X.C171229wH;
import X.C19554AyF;
import X.C20098BOf;
import X.C26159E1n;
import X.C26743EUq;
import X.C63483hZ;
import X.C63913ic;
import X.C95355zy;
import X.L1K;
import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;
import com.instagram.reels.recentlydeleted.ReelRecentlyDeletedViewerController;
import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public class IDxCallbackShape142S0300000_2_I2 implements L1K {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCallbackShape142S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void Byg(AnonymousClass3XX r3) {
        if (this.A03 != 0) {
            C63483hZ.A04(r3, ((ReelRecentlyDeletedViewerController) this.A00).A00.getString(2131834837));
            return;
        }
        ((C145498kb) this.A01).CGI(C63483hZ.A04(r3, ((C95355zy) this.A00).A00.getString(2131834837)));
    }

    public final void Byi() {
    }

    public final void Byj() {
    }

    public final /* bridge */ /* synthetic */ void Byk(C146578mT r23) {
        C156169Me r1 = (C156169Me) r23;
        if (this.A03 != 0) {
            C110726mA r5 = (C110726mA) this.A01;
            List list = r1.A04;
            C171229wH r10 = (C171229wH) this.A02;
            if (!list.isEmpty()) {
                String str = ((BKU) list.get(0)).A0f.A4Y;
                UserSession userSession = r5.A05;
                User A2Z = ((BKU) list.get(0)).A2Z(userSession);
                A2Z.getClass();
                C19554AyF.A02();
                Reel A0H = ReelStore.A02(userSession).A0H(new C20098BOf(A2Z), str, list, true);
                C127397h3 r2 = r5.A03;
                AnonymousClass601 r4 = r5.A02;
                View A0J = r2.A0J(r4.A00);
                int[] iArr = new int[2];
                if (A0J != null) {
                    A0J.getLocationOnScreen(iArr);
                }
                AnonymousClass6DF.A00 = new C134487xm(r5);
                ReelRecentlyDeletedViewerController reelRecentlyDeletedViewerController = r5.A04;
                float f = (float) iArr[0];
                float f2 = (float) iArr[1];
                RectF rectF = new RectF(f, f2, f, f2);
                FragmentActivity fragmentActivity = r5.A01;
                C11630kW A0A = C63913ic.A0A(r4);
                A0H.A1W = true;
                C26159E1n A09 = C19554AyF.A02().A09(fragmentActivity, userSession);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                A0v.add(A0H.getId());
                A09.A0P((RectF) null, rectF, A0A, A0H, r10, new IDxRCallbackShape1S0800000_4_I2(rectF, fragmentActivity, reelRecentlyDeletedViewerController, A0H, r10, A09, userSession, A0v, 1), 0);
                return;
            }
            return;
        }
        ((C145498kb) this.A01).CGk((C171229wH) this.A02, r1.A04);
    }

    public final void Byh(C26743EUq eUq) {
    }

    public final /* bridge */ /* synthetic */ void Byl(C146578mT r1) {
    }
}
