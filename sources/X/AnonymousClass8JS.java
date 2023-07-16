package X;

import com.fbpay.logging.LoggingContext;
import java.util.List;

/* renamed from: X.8JS  reason: invalid class name */
public final class AnonymousClass8JS extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C967966s A00;
    public final /* synthetic */ AnonymousClass7DP A01;
    public final /* synthetic */ LoggingContext A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8JS(C967966s r2, AnonymousClass7DP r3, LoggingContext loggingContext, String str, String str2, List list, boolean z) {
        super(1);
        this.A00 = r2;
        this.A03 = str;
        this.A02 = loggingContext;
        this.A06 = z;
        this.A05 = list;
        this.A04 = str2;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [kotlin.jvm.internal.KtLambdaShape2S1410000_I2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            X.C04220Ms.A0B(r15, r0)
            X.66s r2 = r14.A00
            X.66s r0 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r6 = 0
            if (r2 == r0) goto L_0x001e
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = r2.name()
            java.util.Locale r0 = java.util.Locale.US
            X.C04220Ms.A08(r0)
            java.lang.String r0 = X.C18220wO.A0u(r0, r2)
            X.6Ax r6 = X.AnonymousClass6Ax.valueOf(r0)
        L_0x001e:
            java.lang.String r4 = r14.A03
            int r2 = r4.hashCode()
            r0 = -1785516855(0xffffffff95932cc9, float:-5.9443486E-26)
            if (r2 == r0) goto L_0x006f
            r0 = 1996002556(0x76f894fc, float:2.5209207E33)
            if (r2 == r0) goto L_0x00a9
            r0 = 2012838315(0x77f979ab, float:1.0119919E34)
            if (r2 != r0) goto L_0x00ec
            java.lang.String r0 = "DELETE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00ec
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r4 = r14.A02
            boolean r8 = r14.A06
            java.util.List r5 = r14.A05
            X.7DP r0 = r14.A01
            java.util.LinkedHashMap r7 = X.C18220wO.A0y()
            if (r0 == 0) goto L_0x0050
            X.AnonymousClass7Kr.A0B(r0, r7)
        L_0x0050:
            java.lang.String r0 = "error_message"
            r7.put(r0, r15)
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_remove_fbpayaccountmutation_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 386(0x182, float:5.41E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r3 = 4
            kotlin.jvm.internal.KtLambdaShape4S0410000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape4S0410000_I2
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.C128957ke.A04(r0, r4, r2)
        L_0x006c:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x006f:
            java.lang.String r0 = "UPDATE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00ec
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r4 = r14.A02
            boolean r13 = r14.A06
            java.util.List r10 = r14.A05
            X.7DP r0 = r14.A01
            java.util.LinkedHashMap r12 = X.C18220wO.A0y()
            if (r0 == 0) goto L_0x008c
            X.AnonymousClass7Kr.A0B(r0, r12)
        L_0x008c:
            java.lang.String r0 = "error_message"
            r12.put(r0, r15)
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_edit_fbpayaccountmutation_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 229(0xe5, float:3.21E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r8 = 3
            kotlin.jvm.internal.KtLambdaShape4S0410000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape4S0410000_I2
            r7 = r3
            r9 = r4
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x00e3
        L_0x00a9:
            java.lang.String r0 = "CREATE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00ec
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r4 = r14.A02
            boolean r10 = r14.A06
            java.util.List r5 = r14.A05
            java.lang.String r8 = r14.A04
            if (r8 == 0) goto L_0x00e7
            X.7DP r0 = r14.A01
            java.util.LinkedHashMap r7 = X.C18220wO.A0y()
            if (r0 == 0) goto L_0x00ca
            X.AnonymousClass7Kr.A0B(r0, r7)
        L_0x00ca:
            java.lang.String r0 = "error_message"
            r7.put(r0, r15)
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_add_fbpayaccountmutation_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 191(0xbf, float:2.68E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r9 = 1
            kotlin.jvm.internal.KtLambdaShape2S1410000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape2S1410000_I2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x00e3:
            X.C128957ke.A04(r0, r4, r3)
            goto L_0x006c
        L_0x00e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x00ec:
            java.lang.String r0 = "Invalid mutation type: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8JS.invoke(java.lang.Object):java.lang.Object");
    }
}
