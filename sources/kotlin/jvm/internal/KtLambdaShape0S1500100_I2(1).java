package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C40307LcE;
import com.fbpay.logging.LoggingContext;
import java.util.List;
import java.util.Map;

public class KtLambdaShape0S1500100_I2 extends C02220Ah implements AnonymousClass0YY {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1500100_I2(C40307LcE lcE, LoggingContext loggingContext, String str, List list, List list2, Map map, long j) {
        super(1);
        this.A05 = loggingContext;
        this.A00 = j;
        this.A03 = lcE;
        this.A02 = list;
        this.A06 = str;
        this.A01 = list2;
        this.A04 = map;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r6 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r6
            X.5D4 r3 = new X.5D4
            r3.<init>()
            java.lang.Object r4 = r5.A05
            com.fbpay.logging.LoggingContext r4 = (com.fbpay.logging.LoggingContext) r4
            X.C86104wH.A1K(r3, r4)
            X.5Dh r2 = new X.5Dh
            r2.<init>()
            long r0 = r5.A00
            X.C86164wN.A1D(r2, r0)
            java.lang.Object r0 = r5.A03
            X.LcE r0 = (X.C40307LcE) r0
            X.Lce r0 = X.AnonymousClass7Kr.A03(r0)
            X.C86164wN.A1B(r0, r2)
            java.util.List r1 = X.C18180wK.A0n(r2)
            java.lang.String r0 = "credential_container"
            r3.A0B(r0, r1)
            java.lang.Object r0 = r5.A02
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x004c
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x003a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = X.C18180wK.A0k(r2)
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r0)
            r1.add(r0)
            goto L_0x003a
        L_0x004c:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
        L_0x004e:
            java.lang.String r0 = "container_ids"
            r3.A0B(r0, r1)
            X.AnonymousClass7Hr.A03(r3, r4)
            java.lang.String r0 = r5.A06
            X.C86124wJ.A1K(r3, r0)
            java.lang.Object r1 = r5.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "applied_discounts"
            r3.A0B(r0, r1)
            X.C86114wI.A1C(r6, r3)
            java.lang.Object r0 = r5.A04
            X.C86114wI.A1G(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape0S1500100_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
