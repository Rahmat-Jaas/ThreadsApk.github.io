package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase;
import java.util.List;

/* renamed from: X.7cg  reason: invalid class name and case insensitive filesystem */
public final class C125187cg implements C41703MZy {
    public final /* synthetic */ InAppPurchaseControllerBase A00;
    public final /* synthetic */ AnonymousClass8s9 A01;

    public C125187cg(InAppPurchaseControllerBase inAppPurchaseControllerBase, AnonymousClass8s9 r2) {
        this.A00 = inAppPurchaseControllerBase;
        this.A01 = r2;
    }

    public final void CDy(C41173LyC lyC, List list) {
        AnonymousClass8s9 r1;
        C04220Ms.A0B(list, 1);
        int i = lyC.A00;
        InAppPurchaseControllerBase inAppPurchaseControllerBase = this.A00;
        if (i == 0) {
            inAppPurchaseControllerBase.A08 = list;
            inAppPurchaseControllerBase.A0B.CYg(lyC, list);
            r1 = this.A01;
        } else {
            inAppPurchaseControllerBase.A0B.CYe(lyC);
            r1 = this.A01;
            list = AnonymousClass0ZV.A00;
        }
        r1.resumeWith(C18180wK.A0p(lyC, list));
    }
}
