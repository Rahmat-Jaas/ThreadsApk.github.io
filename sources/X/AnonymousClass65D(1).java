package X;

import com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo;
import com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo;
import com.instagram.shopping.model.destination.home.ProductFeedHeader;
import java.util.ArrayList;

/* renamed from: X.65D  reason: invalid class name */
public final class AnonymousClass65D extends C18203AbX {
    public ShoppingModuleLoggingInfo A00;
    public ShoppingRankingLoggingInfo A01;
    public ProductFeedHeader A02;
    public String A03;
    public ArrayList A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass65D) {
                AnonymousClass65D r5 = (AnonymousClass65D) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ProductFeedHeader A00() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A03(this.A02) * 31))) + C18200wM.A09(this.A03);
    }

    public AnonymousClass65D(ShoppingModuleLoggingInfo shoppingModuleLoggingInfo, ShoppingRankingLoggingInfo shoppingRankingLoggingInfo, ProductFeedHeader productFeedHeader, String str, ArrayList arrayList) {
        this.A02 = productFeedHeader;
        this.A04 = arrayList;
        this.A01 = shoppingRankingLoggingInfo;
        this.A00 = shoppingModuleLoggingInfo;
        this.A03 = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass65D() {
        /*
            r16 = this;
            r2 = 0
            r0 = 3
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget r1 = new com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget
            r1.<init>(r2, r2, r2, r0)
            java.lang.Boolean r0 = X.C18180wK.A0X()
            com.instagram.shopping.model.destination.home.ProductFeedHeader r13 = new com.instagram.shopping.model.destination.home.ProductFeedHeader
            r13.<init>(r1, r2, r0, r2)
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0v()
            r0 = 7
            com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo r12 = new com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo
            r12.<init>(r2, r2, r0)
            java.lang.String r3 = ""
            r6 = -1
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r1 = new com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo
            r4 = r3
            r5 = r3
            r8 = r6
            r10 = r6
            r1.<init>(r2, r3, r4, r5, r6, r8, r10)
            r10 = r16
            r11 = r1
            r14 = r2
            r10.<init>(r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65D.<init>():void");
    }
}
