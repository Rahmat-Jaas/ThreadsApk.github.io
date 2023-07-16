package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2500000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7gX  reason: invalid class name and case insensitive filesystem */
public final class C127087gX implements C27780EtB {
    public final /* synthetic */ InAppPurchaseControllerBase A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public final void ByK(Throwable th, List list) {
        InAppPurchaseControllerBase inAppPurchaseControllerBase = this.A00;
        inAppPurchaseControllerBase.A0B.DAR((Throwable) null, this.A01, list);
        C145238k9 r1 = inAppPurchaseControllerBase.A04;
        if (r1 != null) {
            r1.CDt(C40289Lbs.NETWORK_FAILURE);
        }
    }

    public C127087gX(InAppPurchaseControllerBase inAppPurchaseControllerBase, List list, Map map, boolean z) {
        this.A00 = inAppPurchaseControllerBase;
        this.A01 = list;
        this.A02 = map;
        this.A03 = z;
    }

    public final void CNX(KtCSuperShape0S2500000_I2 ktCSuperShape0S2500000_I2, List list, List list2) {
        if (list == null || list.isEmpty() || (list2 != null && !list2.isEmpty())) {
            InAppPurchaseControllerBase inAppPurchaseControllerBase = this.A00;
            inAppPurchaseControllerBase.A0B.DAR((Throwable) null, this.A01, list2);
            C145238k9 r1 = inAppPurchaseControllerBase.A04;
            if (r1 != null) {
                r1.CDt(C40289Lbs.SERVER_VERIFICATION_FAILED);
                return;
            }
            return;
        }
        InAppPurchaseControllerBase inAppPurchaseControllerBase2 = this.A00;
        C146698mi r0 = inAppPurchaseControllerBase2.A0B;
        List list3 = this.A01;
        Map map = this.A02;
        r0.DAT(list3, list, map);
        if (this.A03) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2 = (KtCSuperShape0S3100000_I2) it.next();
                C145238k9 r02 = inAppPurchaseControllerBase2.A04;
                if (r02 != null) {
                    r02.CDw(ktCSuperShape0S3100000_I2);
                }
            }
            return;
        }
        inAppPurchaseControllerBase2.AEE(new C104706cF(inAppPurchaseControllerBase2), list3, list, map);
    }
}
