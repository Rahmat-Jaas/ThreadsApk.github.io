package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape17S0200000_I2_1 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape17S0200000_I2_1(int i, Object obj, Object obj2) {
        super(0);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [kotlin.jvm.internal.KtLambdaShape3S1200000_I2] */
    /* JADX WARNING: type inference failed for: r4v20, types: [kotlin.jvm.internal.KtLambdaShape3S1300000_I2] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:44|45|243|242|38|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0351, code lost:
        X.C128957ke.A04(X.C18180wK.A0I(X.C86104wH.A0K(r1.A00, "client_load_terms_fail"), 371), r5, new kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1(r4, r5, r3, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d4, code lost:
        X.C128957ke.A03(X.C18180wK.A0I(X.C86104wH.A0K(r1.A00, "client_load_ordersummary_fail"), 335), r4, r3, r2, 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x040d, code lost:
        r4 = new kotlin.jvm.internal.KtLambdaShape3S1200000_I2(r7, r3, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x046a, code lost:
        r2 = "loggingContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x046d, code lost:
        r2 = "nuxViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x046f, code lost:
        X.C04220Ms.A0E(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0473, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04e0, code lost:
        if (r6 == null) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04e2, code lost:
        r6 = X.AnonymousClass66S.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04e4, code lost:
        X.C04220Ms.A09(r6);
        X.C04220Ms.A0B(r7, 0);
        r1 = X.C18180wK.A0I(X.C86104wH.A0K(r3.A00, "client_add_ecppreprocessing_success"), 190);
        r5 = new X.AnonymousClass8Il(r6, r7, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04ff, code lost:
        X.C128957ke.A04(r1, r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0505, code lost:
        if (r4 != null) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x050a, code lost:
        if (r4 != null) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0685, code lost:
        return X.C13330nS.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x069c, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019a, code lost:
        r3.D7w(r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[SYNTHETIC, Splitter:B:44:0x00c6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x0686;
                case 1: goto L_0x0679;
                case 2: goto L_0x0668;
                case 3: goto L_0x065a;
                case 4: goto L_0x0606;
                case 5: goto L_0x05f9;
                case 6: goto L_0x057c;
                case 7: goto L_0x0028;
                case 8: goto L_0x0028;
                case 9: goto L_0x056c;
                case 10: goto L_0x054b;
                case 11: goto L_0x052a;
                case 12: goto L_0x0510;
                case 13: goto L_0x0474;
                case 14: goto L_0x043f;
                case 15: goto L_0x0414;
                case 16: goto L_0x03e9;
                case 17: goto L_0x03c0;
                case 18: goto L_0x039b;
                case 19: goto L_0x036a;
                case 20: goto L_0x033d;
                case 21: goto L_0x02a8;
                case 22: goto L_0x029b;
                case 23: goto L_0x0005;
                case 24: goto L_0x003c;
                case 25: goto L_0x027d;
                case 26: goto L_0x0005;
                case 27: goto L_0x003c;
                case 28: goto L_0x069d;
                case 29: goto L_0x0263;
                case 30: goto L_0x0249;
                case 31: goto L_0x0214;
                case 32: goto L_0x01f3;
                case 33: goto L_0x01c2;
                case 34: goto L_0x0005;
                case 35: goto L_0x01ad;
                case 36: goto L_0x019f;
                case 37: goto L_0x0188;
                case 38: goto L_0x017c;
                case 39: goto L_0x0162;
                case 40: goto L_0x0155;
                case 41: goto L_0x0095;
                case 42: goto L_0x0087;
                case 43: goto L_0x0005;
                case 44: goto L_0x006e;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x0060;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r3 = r0.invoke()
            if (r3 != 0) goto L_0x0027
        L_0x0011:
            java.lang.Object r0 = r14.A01
            X.0Oa r0 = (X.C04530Oa) r0
            java.lang.Object r1 = r0.getValue()
            X.06C r1 = (X.AnonymousClass06C) r1
            boolean r0 = r1 instanceof X.C012605w
            if (r0 == 0) goto L_0x0039
            X.05w r1 = (X.C012605w) r1
            if (r1 == 0) goto L_0x0039
            X.6o9 r3 = r1.getDefaultViewModelCreationExtras()
        L_0x0027:
            return r3
        L_0x0028:
            java.lang.Object r3 = r14.A01
            if (r3 != 0) goto L_0x0027
            java.lang.Object r0 = r14.A00
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r3 = r0.A00
            if (r3 != 0) goto L_0x0027
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0039:
            X.58e r3 = X.C884658e.A00
            return r3
        L_0x003c:
            java.lang.Object r0 = r14.A00
            X.0Oa r0 = (X.C04530Oa) r0
            java.lang.Object r1 = r0.getValue()
            X.06C r1 = (X.AnonymousClass06C) r1
            boolean r0 = r1 instanceof X.C012605w
            if (r0 == 0) goto L_0x0054
            X.05w r1 = (X.C012605w) r1
            if (r1 == 0) goto L_0x0054
            X.8nS r3 = r1.getDefaultViewModelProviderFactory()
            if (r3 != 0) goto L_0x005c
        L_0x0054:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.8nS r3 = r0.getDefaultViewModelProviderFactory()
        L_0x005c:
            X.C04220Ms.A09(r3)
            return r3
        L_0x0060:
            java.lang.Object r1 = r14.A00
            X.6mU r1 = (X.C110916mU) r1
            java.lang.Object r0 = r14.A01
            X.6LR r0 = (X.AnonymousClass6LR) r0
            X.7t8 r3 = new X.7t8
            r3.<init>(r1, r0)
            return r3
        L_0x006e:
            java.lang.Object r0 = r14.A01
            X.5xZ r0 = (X.AnonymousClass5xZ) r0
            java.lang.Object r3 = r14.A00
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r3 = (com.instagram.appreciation.analytics.creator.CreatorLoggingData) r3
            X.0Oa r0 = r0.A00
            java.lang.Object r2 = r0.getValue()
            X.7Jo r2 = (X.C122027Jo) r2
            java.lang.Integer r1 = X.AnonymousClass006.A1L
            java.lang.Integer r0 = X.AnonymousClass006.A06
            X.C122027Jo.A01(r2, r3, r1, r0)
            goto L_0x069a
        L_0x0087:
            java.lang.Object r1 = r14.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r14.A00
            android.content.Context r0 = (android.content.Context) r0
            X.KJ7 r3 = new X.KJ7
            r3.<init>(r1, r0)
            return r3
        L_0x0095:
            java.lang.Object r1 = r14.A01
            X.5uO r1 = (X.AnonymousClass5uO) r1
            java.lang.Object r0 = r14.A00
            X.JDp r0 = (X.C36024JDp) r0
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1.super.onResponse(r0)
            X.6m3 r8 = r1.A03     // Catch:{ IOException -> 0x0152 }
            r0 = 27
            kotlin.jvm.internal.KtLambdaShape150S0100000_I2_5 r7 = X.C86164wN.A0s(r1, r0)     // Catch:{ IOException -> 0x0152 }
            r0 = 4096(0x1000, float:5.74E-42)
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ IOException -> 0x0152 }
            X.C04220Ms.A06(r6)     // Catch:{ IOException -> 0x0152 }
        L_0x00b1:
            java.util.concurrent.locks.ReentrantLock r5 = r8.A04     // Catch:{ IOException -> 0x0152 }
            r5.lock()     // Catch:{ IOException -> 0x0152 }
        L_0x00b6:
            boolean r0 = r8.A01     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x00cc
            java.util.Queue r0 = r8.A02     // Catch:{ all -> 0x014d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00cc
            java.io.IOException r0 = r8.A00     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x00cc
            java.util.concurrent.locks.Condition r0 = r8.A03     // Catch:{ InterruptedException -> 0x00b6 }
            r0.await()     // Catch:{ InterruptedException -> 0x00b6 }
            goto L_0x00b6
        L_0x00cc:
            java.io.IOException r0 = r8.A00     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x014c
            boolean r0 = r8.A01     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00de
            java.util.Queue r0 = r8.A02     // Catch:{ all -> 0x014d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00de
            r0 = -1
            goto L_0x012f
        L_0x00de:
            int r1 = r6.position()     // Catch:{ all -> 0x014d }
            int r0 = r6.capacity()     // Catch:{ all -> 0x014d }
            if (r1 >= r0) goto L_0x012b
            java.util.Queue r4 = r8.A02     // Catch:{ all -> 0x014d }
            boolean r0 = X.C18190wL.A1a(r4)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x012b
            java.lang.Object r3 = r4.peek()     // Catch:{ all -> 0x014d }
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch:{ all -> 0x014d }
            if (r3 == 0) goto L_0x0146
            int r2 = r3.limit()     // Catch:{ all -> 0x014d }
            int r1 = r3.remaining()     // Catch:{ all -> 0x014d }
            int r0 = r6.remaining()     // Catch:{ all -> 0x014d }
            if (r1 <= r0) goto L_0x0112
            int r1 = r3.position()     // Catch:{ all -> 0x014d }
            int r0 = r6.remaining()     // Catch:{ all -> 0x014d }
            int r1 = r1 + r0
            r3.limit(r1)     // Catch:{ all -> 0x014d }
        L_0x0112:
            r6.put(r3)     // Catch:{ all -> 0x014d }
            r3.limit(r2)     // Catch:{ all -> 0x014d }
            int r0 = r3.remaining()     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x00de
            X.0YY r1 = r8.A05     // Catch:{ all -> 0x014d }
            java.lang.Object r0 = r4.remove()     // Catch:{ all -> 0x014d }
            X.C04220Ms.A06(r0)     // Catch:{ all -> 0x014d }
            r1.invoke(r0)     // Catch:{ all -> 0x014d }
            goto L_0x00de
        L_0x012b:
            int r0 = r6.position()     // Catch:{ all -> 0x014d }
        L_0x012f:
            r5.unlock()     // Catch:{ IOException -> 0x0152 }
            if (r0 <= 0) goto L_0x0152
            int r0 = r6.position()     // Catch:{ IOException -> 0x0152 }
            r6.limit(r0)     // Catch:{ IOException -> 0x0152 }
            r6.rewind()     // Catch:{ IOException -> 0x0152 }
            r7.invoke(r6)     // Catch:{ IOException -> 0x0152 }
            r6.clear()     // Catch:{ IOException -> 0x0152 }
            goto L_0x00b1
        L_0x0146:
            java.lang.String r0 = "Response body stream is in an invalid state: available bytes > 0, but no buffers remain"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x014d }
        L_0x014c:
            throw r0     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            r5.unlock()     // Catch:{ IOException -> 0x0152 }
            throw r0     // Catch:{ IOException -> 0x0152 }
        L_0x0152:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x0155:
            java.lang.Object r1 = r14.A01
            X.5uO r1 = (X.AnonymousClass5uO) r1
            java.lang.Object r0 = r14.A00
            X.KuL r0 = (X.C39476KuL) r0
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1.super.onEOM(r0)
            goto L_0x069a
        L_0x0162:
            java.lang.Object r3 = r14.A01
            X.K8N r3 = (X.K8N) r3
            java.lang.Object r1 = r14.A00
            X.KuL r1 = (X.C39476KuL) r1
            X.JXy r0 = r3.A05
            X.GXK r2 = r3.A06
            r0.A03(r2)
            r3.A0C(r1)
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r1 = r3.A04
            r0 = 2
            r1.markerEnd(r2, r0)
            goto L_0x069a
        L_0x017c:
            java.lang.Object r3 = r14.A00
            X.8m8 r3 = (X.C146368m8) r3
            java.lang.Object r0 = r14.A01
            X.5z2 r1 = new X.5z2
            r1.<init>(r0)
            goto L_0x019a
        L_0x0188:
            java.lang.Object r3 = r14.A00
            X.8m8 r3 = (X.C146368m8) r3
            java.lang.Object r1 = r14.A01
            X.2L8 r1 = (X.AnonymousClass2L8) r1
            X.5sY r0 = new X.5sY
            r0.<init>(r1)
            X.5z1 r1 = new X.5z1
            r1.<init>(r0)
        L_0x019a:
            r3.D7w(r1)
            goto L_0x069a
        L_0x019f:
            java.lang.Object r1 = r14.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r14.A00
            X.JNY r0 = (X.JNY) r0
            X.KHN r3 = new X.KHN
            r3.<init>(r0, r1)
            return r3
        L_0x01ad:
            java.lang.Object r1 = r14.A01
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r14.A00
            X.ByF r0 = (X.C21669ByF) r0
            if (r0 != 0) goto L_0x01bc
            X.7oU r0 = new X.7oU
            r0.<init>()
        L_0x01bc:
            X.AXM r3 = new X.AXM
            r3.<init>(r0, r1)
            return r3
        L_0x01c2:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.5j1 r0 = (X.C92635j1) r0
            com.fbpay.logging.LoggingContext r4 = r0.A01
            if (r4 == 0) goto L_0x046a
            X.58J r0 = r0.A00
            if (r0 != 0) goto L_0x01d6
            java.lang.String r2 = "ecpViewModel"
            goto L_0x046f
        L_0x01d6:
            X.587 r0 = r0.A0S
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r2 = "nux_checkout"
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_entityitems_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 296(0x128, float:4.15E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 34
            X.C128957ke.A03(r1, r4, r3, r2, r0)
            goto L_0x069a
        L_0x01f3:
            java.lang.Object r3 = r14.A00
            X.59v r3 = (X.C886359v) r3
            java.lang.Object r1 = r14.A01
            X.5j8 r1 = (X.AnonymousClass5j8) r1
            android.widget.FrameLayout r0 = r1.A09
            java.lang.String r2 = "otcOptionContainer"
            if (r0 == 0) goto L_0x046f
            X.M5O r3 = r3.A08(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.AnonCheckoutToggleViewBinder.AnonCheckoutToggleViewHolder"
            X.C04220Ms.A0C(r3, r0)
            android.widget.FrameLayout r1 = r1.A09
            if (r1 == 0) goto L_0x046f
            android.view.View r0 = r3.itemView
            r1.addView(r0)
            return r3
        L_0x0214:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.5j8 r0 = (X.AnonymousClass5j8) r0
            com.fbpay.logging.LoggingContext r3 = r0.A0S
            if (r3 == 0) goto L_0x046a
            X.58J r0 = r0.A0L
            if (r0 == 0) goto L_0x046d
            X.587 r0 = r0.A0S
            java.util.LinkedHashMap r4 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r6 = ""
            java.lang.String r5 = "nux_shipping_option"
            X.09x r1 = X.C128957ke.A00(r1, r6)
            java.lang.String r0 = "client_load_shippingoption_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 364(0x16c, float:5.1E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r7 = 3
            kotlin.jvm.internal.KtLambdaShape1S2200000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape1S2200000_I2
            r2.<init>(r3, r4, r5, r6, r7)
            X.C128957ke.A04(r0, r3, r2)
            goto L_0x069a
        L_0x0249:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.5j8 r0 = (X.AnonymousClass5j8) r0
            com.fbpay.logging.LoggingContext r4 = r0.A0S
            if (r4 == 0) goto L_0x046a
            X.58J r0 = r0.A0L
            if (r0 == 0) goto L_0x046d
            X.587 r0 = r0.A0S
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r2 = "nux_checkout"
            goto L_0x03d4
        L_0x0263:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.5j8 r0 = (X.AnonymousClass5j8) r0
            com.fbpay.logging.LoggingContext r5 = r0.A0S
            if (r5 == 0) goto L_0x046a
            X.58J r0 = r0.A0L
            if (r0 == 0) goto L_0x046d
            X.587 r0 = r0.A0S
            java.util.LinkedHashMap r4 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r3 = "nux_checkout"
            goto L_0x0351
        L_0x027d:
            java.lang.Object r4 = r14.A01
            X.0YY r4 = (X.AnonymousClass0YY) r4
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.Object r0 = r14.A00
            com.facebook.graphql.impls.BalanceInfoFragmentImpl r0 = (com.facebook.graphql.impls.BalanceInfoFragmentImpl) r0
            java.lang.String r1 = "EARNINGS_BALANCE_INFO"
            if (r0 != 0) goto L_0x0296
            r0 = 0
        L_0x028e:
            r3.putParcelable(r1, r0)
            r4.invoke(r3)
            goto L_0x069a
        L_0x0296:
            android.os.Parcelable r0 = X.C121697Hn.A00(r0)
            goto L_0x028e
        L_0x029b:
            java.lang.Object r1 = r14.A01
            X.5hr r1 = (X.C92245hr) r1
            java.lang.Object r0 = r14.A00
            com.facebookpay.form.view.FormLayout r0 = (com.facebookpay.form.view.FormLayout) r0
            X.C92245hr.A01(r1, r0)
            goto L_0x069a
        L_0x02a8:
            X.7ke r3 = X.AnonymousClass7JJ.A00()
            java.lang.Object r5 = r14.A01
            X.78P r5 = (X.AnonymousClass78P) r5
            com.fbpay.logging.LoggingContext r8 = r5.A06
            r0 = 0
            if (r8 != 0) goto L_0x02b9
            X.C86124wJ.A19()
            throw r0
        L_0x02b9:
            X.6B5 r6 = X.AnonymousClass6B5.UPDATE_CHECKOUT
            X.58K r1 = r5.A05
            if (r1 != 0) goto L_0x02c5
            java.lang.String r1 = "promoCodeViewModel"
            X.C04220Ms.A0E(r1)
            throw r0
        L_0x02c5:
            java.util.List r4 = r1.A08()
            X.588 r1 = r5.A03
            if (r1 != 0) goto L_0x02d3
            java.lang.String r1 = "incentiveViewModel"
            X.C04220Ms.A0E(r1)
            throw r0
        L_0x02d3:
            java.util.List r1 = r1.A05()
            java.util.List r9 = X.AnonymousClass00J.A0V(r1, r4)
            java.lang.Object r2 = r14.A00
            X.6mv r2 = (X.C111186mv) r2
            java.lang.String r1 = r2.A09
            if (r1 == 0) goto L_0x02f1
            java.lang.Long r7 = X.AnonymousClass4n2.A02(r1)
        L_0x02e7:
            X.587 r1 = r5.A04
            if (r1 != 0) goto L_0x02f3
            java.lang.String r1 = "otcViewModel"
            X.C04220Ms.A0E(r1)
            throw r0
        L_0x02f1:
            r7 = r0
            goto L_0x02e7
        L_0x02f3:
            X.7DP r4 = r1.A03()
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = r2.A01
            if (r1 == 0) goto L_0x0303
            java.lang.String r1 = r1.A04
            if (r1 == 0) goto L_0x0303
            java.lang.Long r0 = X.AnonymousClass4n2.A02(r1)
        L_0x0303:
            java.lang.String r2 = r2.A04
            java.util.LinkedHashMap r10 = X.C18220wO.A0y()
            X.AnonymousClass7Kr.A0B(r4, r10)
            if (r0 == 0) goto L_0x031b
            long r0 = r0.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "shipping_address_id"
            r10.put(r0, r1)
        L_0x031b:
            if (r2 == 0) goto L_0x0322
            java.lang.String r0 = "SHIPPING_OPTION_ID"
            r10.put(r0, r2)
        L_0x0322:
            X.09x r1 = X.C128957ke.A00(r3, r6)
            java.lang.String r0 = "client_submit_ecpeventhandling_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 398(0x18e, float:5.58E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r5 = 6
            kotlin.jvm.internal.KtLambdaShape4S0500000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape4S0500000_I2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.C128957ke.A04(r0, r8, r4)
            goto L_0x069a
        L_0x033d:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.58M r0 = (X.AnonymousClass58M) r0
            com.fbpay.logging.LoggingContext r5 = r0.A0v()
            X.587 r0 = r0.A1O
            java.util.LinkedHashMap r4 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r3 = "pux_checkout"
        L_0x0351:
            r2 = 0
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_terms_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 371(0x173, float:5.2E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1 r0 = new kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1
            r0.<init>(r4, r5, r3, r2)
            X.C128957ke.A04(r1, r5, r0)
            goto L_0x069a
        L_0x036a:
            X.7ke r3 = X.AnonymousClass7JJ.A00()
            java.lang.Object r1 = r14.A01
            X.58M r1 = (X.AnonymousClass58M) r1
            com.fbpay.logging.LoggingContext r7 = r1.A0v()
            X.58K r0 = r1.A1S
            java.util.List r5 = r0.A07()
            X.587 r0 = r1.A1O
            java.util.LinkedHashMap r6 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r8 = "applied_discounts"
            X.09x r1 = r3.A00
            java.lang.String r0 = "client_load_promocode_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 354(0x162, float:4.96E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r9 = 16
            kotlin.jvm.internal.KtLambdaShape3S1300000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape3S1300000_I2
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (int) r9)
            goto L_0x04ff
        L_0x039b:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.58M r0 = (X.AnonymousClass58M) r0
            com.fbpay.logging.LoggingContext r7 = r0.A0v()
            X.587 r0 = r0.A1O
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r2 = "pux_checkout"
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_pricetable_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 351(0x15f, float:4.92E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 45
            goto L_0x040d
        L_0x03c0:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.58M r0 = (X.AnonymousClass58M) r0
            com.fbpay.logging.LoggingContext r4 = r0.A0v()
            X.587 r0 = r0.A1O
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r2 = "pux_checkout"
        L_0x03d4:
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_ordersummary_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 335(0x14f, float:4.7E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 40
            X.C128957ke.A03(r1, r4, r3, r2, r0)
            goto L_0x069a
        L_0x03e9:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.58M r0 = (X.AnonymousClass58M) r0
            com.fbpay.logging.LoggingContext r7 = r0.A0v()
            X.587 r0 = r0.A1O
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r2 = "pux_checkout"
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_merchantheader_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 314(0x13a, float:4.4E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 37
        L_0x040d:
            kotlin.jvm.internal.KtLambdaShape3S1200000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape3S1200000_I2
            r4.<init>(r7, r3, r2, r0)
            goto L_0x04ff
        L_0x0414:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.58M r0 = (X.AnonymousClass58M) r0
            com.fbpay.logging.LoggingContext r4 = r0.A0v()
            X.587 r0 = r0.A1O
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r2 = "choose_another_way"
            X.09x r1 = X.C128957ke.A00(r1, r2)
            java.lang.String r0 = "client_load_ecpotc_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 289(0x121, float:4.05E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 32
            X.C128957ke.A03(r1, r4, r3, r2, r0)
            goto L_0x069a
        L_0x043f:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.58J r0 = (X.AnonymousClass58J) r0
            com.fbpay.logging.LoggingContext r4 = r0.A02
            if (r4 == 0) goto L_0x046a
            X.587 r0 = r0.A0S
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A08(r0, r14)
            java.lang.String r2 = "nux_shipping_address"
            X.09x r1 = X.C128957ke.A00(r1, r2)
            java.lang.String r0 = "client_load_shippingaddress_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 361(0x169, float:5.06E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 48
            X.C128957ke.A03(r1, r4, r3, r2, r0)
            goto L_0x069a
        L_0x046a:
            java.lang.String r2 = "loggingContext"
            goto L_0x046f
        L_0x046d:
            java.lang.String r2 = "nuxViewModel"
        L_0x046f:
            X.C04220Ms.A0E(r2)
            r0 = 0
            throw r0
        L_0x0474:
            java.lang.Object r0 = r14.A01
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r3 = r0.A01
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x050d
            java.lang.Class<com.facebook.graphql.impls.PreprocessingMutationResponseImpl$PaymentPreprocessingMutation> r1 = com.facebook.graphql.impls.PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.class
            java.lang.String r0 = "payment_preprocessing_mutation(input:$input)"
            com.facebook.pando.TreeJNI r4 = r3.getTreeValue(r0, r1)
        L_0x0486:
            X.7ke r3 = X.AnonymousClass7JJ.A00()
            java.lang.Object r7 = r14.A00
            com.fbpay.logging.LoggingContext r7 = (com.fbpay.logging.LoggingContext) r7
            if (r4 == 0) goto L_0x0504
            java.lang.Class<com.facebook.graphql.impls.PreprocessingMutationResponseImpl$PaymentPreprocessingMutation$PaymentAvailabilityResponse> r1 = com.facebook.graphql.impls.PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.PaymentAvailabilityResponse.class
            java.lang.String r0 = "payment_availability_response"
            com.google.common.collect.ImmutableList r0 = r4.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x0504
            java.lang.Object r1 = X.AnonymousClass00J.A0D(r0)
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x0504
            java.lang.String r0 = "payment_availability"
            boolean r10 = r1.hasFieldValue(r0)
        L_0x04a8:
            java.lang.Class<com.facebook.graphql.impls.PreprocessingMutationResponseImpl$PaymentPreprocessingMutation$PaymentAvailabilityResponse> r1 = com.facebook.graphql.impls.PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.PaymentAvailabilityResponse.class
            java.lang.String r0 = "payment_availability_response"
            com.google.common.collect.ImmutableList r0 = r4.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x0508
            java.lang.Object r2 = X.AnonymousClass00J.A0D(r0)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0508
            java.lang.Class<com.facebook.graphql.impls.PreprocessingMutationResponseImpl$PaymentPreprocessingMutation$PaymentAvailabilityResponse$ReceiverInfo> r1 = com.facebook.graphql.impls.PreprocessingMutationResponseImpl.PaymentPreprocessingMutation.PaymentAvailabilityResponse.ReceiverInfo.class
            java.lang.String r0 = "receiver_info"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0508
            java.lang.Class<com.facebook.graphql.impls.FBPayReceiverInfoImpl> r0 = com.facebook.graphql.impls.FBPayReceiverInfoImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            if (r0 == 0) goto L_0x0508
            java.lang.String r0 = X.C18220wO.A0m(r0)
            if (r0 == 0) goto L_0x0508
            long r8 = java.lang.Long.parseLong(r0)
        L_0x04d6:
            X.66S r1 = X.AnonymousClass66S.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "ux_type"
            java.lang.Enum r6 = X.C86104wH.A0a(r4, r1, r0)
            X.66S r6 = (X.AnonymousClass66S) r6
            if (r6 != 0) goto L_0x04e4
        L_0x04e2:
            X.66S r6 = X.AnonymousClass66S.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
        L_0x04e4:
            X.C04220Ms.A09(r6)
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            X.09x r1 = r3.A00
            java.lang.String r0 = "client_add_ecppreprocessing_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 190(0xbe, float:2.66E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.8Il r4 = new X.8Il
            r5 = r4
            r5.<init>(r6, r7, r8, r10)
        L_0x04ff:
            X.C128957ke.A04(r1, r7, r4)
            goto L_0x069a
        L_0x0504:
            r10 = 0
            if (r4 == 0) goto L_0x0508
            goto L_0x04a8
        L_0x0508:
            r8 = 0
            if (r4 == 0) goto L_0x04e2
            goto L_0x04d6
        L_0x050d:
            r4 = 0
            goto L_0x0486
        L_0x0510:
            X.7ke r4 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r14.A01
            X.59v r0 = (X.C886359v) r0
            com.fbpay.logging.LoggingContext r3 = r0.A03
            java.lang.Object r0 = r14.A00
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r0
            java.lang.String r0 = r0.A0A
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
            r0 = 0
            r4.A0D(r3, r1, r0)
            goto L_0x069a
        L_0x052a:
            java.lang.Object r0 = r14.A01
            X.5gb r0 = (X.C91665gb) r0
            X.0YM r3 = r0.A05
            java.lang.Object r0 = r14.A00
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem) r0
            if (r0 == 0) goto L_0x0549
            java.lang.String r0 = r0.A04
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
        L_0x0540:
            java.lang.String r1 = "user_remove_contact_cancel"
            java.lang.String r0 = "remove_phone_cancel"
            r3.invoke(r1, r0, r2)
            goto L_0x069a
        L_0x0549:
            r2 = 0
            goto L_0x0540
        L_0x054b:
            java.lang.Object r0 = r14.A01
            X.5ga r0 = (X.C91655ga) r0
            X.0YM r3 = r0.A05
            java.lang.Object r0 = r14.A00
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem) r0
            if (r0 == 0) goto L_0x056a
            java.lang.String r0 = r0.A04
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
        L_0x0561:
            java.lang.String r1 = "user_remove_contact_cancel"
            java.lang.String r0 = "remove_email_cancel"
            r3.invoke(r1, r0, r2)
            goto L_0x069a
        L_0x056a:
            r2 = 0
            goto L_0x0561
        L_0x056c:
            java.lang.Object r1 = r14.A01
            com.facebook.videolite.instagram.SuspendableVideoIngestionStep r1 = (com.facebook.videolite.instagram.SuspendableVideoIngestionStep) r1
            java.lang.Object r0 = r14.A00
            X.GbS r0 = (X.C30936GbS) r0
            X.Fe2 r3 = r1.D7y(r0)
            X.C04220Ms.A06(r3)
            return r3
        L_0x057c:
            java.lang.Object r3 = r14.A01
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36319385916281989(0x81084a00001485, double:3.031864127660704E-306)
            boolean r13 = X.C63803iN.A0E(r4, r3, r0)
            java.lang.Object r1 = r14.A00
            r0 = 1
            com.facebook.redex.IDxCallableShape88S0200000_2_I2 r12 = new com.facebook.redex.IDxCallableShape88S0200000_2_I2
            r12.<init>(r0, r1, r3)
            r5 = 0
            X.C04220Ms.A0B(r3, r5)
            java.lang.Class<X.7gP> r1 = X.C127027gP.class
            r0 = 41
            java.lang.Object r4 = X.C86124wJ.A0n(r3, r1, r0)
            X.8lj r4 = (X.C146148lj) r4
            java.lang.Class<X.7gQ> r2 = X.C127037gQ.class
            r1 = 28
            kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4 r0 = new kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.8lj r0 = (X.C146148lj) r0
            X.8lj[] r0 = new X.C146148lj[]{r4, r0}
            java.util.List r9 = X.C06750aI.A17(r0)
            X.0ZV r10 = X.AnonymousClass0ZV.A00
            java.lang.String r6 = r3.token
            java.lang.String r2 = "ig4a"
            java.lang.Class<X.5dv> r1 = X.C90695dv.class
            kotlin.jvm.internal.KtLambdaShape4S1100000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape4S1100000_I2
            r0.<init>(r2, r3, r5)
            java.lang.Object r4 = r3.A01(r1, r0)
            X.5dv r4 = (X.C90695dv) r4
            java.lang.Class<X.7tn> r2 = X.C132377tn.class
            r1 = 27
            kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4 r0 = new kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4
            r0.<init>(r3, r1)
            java.lang.Object r5 = r3.A01(r2, r0)
            X.7tn r5 = (X.C132377tn) r5
            X.6r1 r1 = X.AnonymousClass6XJ.A00
            java.io.File r0 = r1.A01(r3)
            java.lang.String r7 = r0.getCanonicalPath()
            java.io.File r0 = r1.A00(r3)
            java.lang.String r8 = r0.getCanonicalPath()
            X.C04220Ms.A06(r7)
            X.C04220Ms.A06(r8)
            X.7tt r3 = new X.7tt
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x05f9:
            java.lang.Object r1 = r14.A01
            X.8mE r1 = (X.C146428mE) r1
            java.lang.Object r0 = r14.A00
            X.8lj r0 = (X.C146148lj) r0
            com.google.common.util.concurrent.ListenableFuture r3 = r1.CwR(r0)
            return r3
        L_0x0606:
            java.lang.Object r4 = r14.A00
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r14.A01
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            X.AnonymousClass0wJ.A1N(r4, r3)
            java.lang.Class<X.7tt> r1 = X.C132437tt.class
            r0 = 6
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r0 = X.C86154wM.A11(r4, r3, r0)
            java.lang.Object r1 = r3.A01(r1, r0)
            X.7tt r1 = (X.C132437tt) r1
            r0 = 0
            com.facebook.redex.IDxCallableShape88S0200000_2_I2 r8 = new com.facebook.redex.IDxCallableShape88S0200000_2_I2
            r8.<init>(r0, r4, r1)
            boolean r9 = r1.A08
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            r0.<init>()
            com.google.common.collect.ImmutableMap r7 = r0.build()
            X.C04220Ms.A06(r7)
            com.google.common.collect.ImmutableList r6 = r1.A00()
            java.lang.Class<X.7tX> r2 = X.C132217tX.class
            r1 = 26
            kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4 r0 = new kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4
            r0.<init>(r3, r1)
            java.lang.Object r5 = r3.A01(r2, r0)
            X.7tX r5 = (X.C132217tX) r5
            java.lang.Class<X.7ts> r2 = X.C132427ts.class
            r1 = 25
            kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4 r0 = new kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4
            r0.<init>(r3, r1)
            java.lang.Object r4 = r3.A01(r2, r0)
            X.7ts r4 = (X.C132427ts) r4
            X.7gS r3 = new X.7gS
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x065a:
            java.lang.Object r1 = r14.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r14.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7tz r3 = new X.7tz
            r3.<init>(r1, r0)
            return r3
        L_0x0668:
            java.lang.Object r1 = r14.A01
            X.Hxy r1 = (X.C33975Hxy) r1
            X.GMK r0 = X.C33938HxM.A00
            java.lang.Object r1 = r1.AYx(r0)
            X.0i6 r1 = (X.C10300i6) r1
            java.lang.Object r0 = r14.A00
            X.H2K r0 = (X.H2K) r0
            goto L_0x0681
        L_0x0679:
            java.lang.Object r1 = r14.A01
            X.0i6 r1 = (X.C10300i6) r1
            java.lang.Object r0 = r14.A00
            X.H2J r0 = (X.H2J) r0
        L_0x0681:
            X.0nS r3 = X.C13330nS.A01(r0, r1)
            return r3
        L_0x0686:
            java.lang.Object r0 = r14.A01
            X.Gbp r0 = (X.C30948Gbp) r0
            X.6uA r3 = r0.A03()
            java.lang.Object r1 = r14.A00
            X.6uA r1 = (X.C114936uA) r1
            X.GrG r0 = new X.GrG
            r0.<init>(r1)
            r3.A01(r0)
        L_0x069a:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x069d:
            java.lang.Object r3 = r14.A01
            X.5j6 r3 = (X.AnonymousClass5j6) r3
            com.fbpay.logging.LoggingContext r2 = r3.A06
            if (r2 != 0) goto L_0x06aa
            X.C86124wJ.A19()
            r0 = 0
            throw r0
        L_0x06aa:
            r1 = 0
            java.lang.String r0 = "pin_upsell"
            X.AnonymousClass5j6.A03(r3, r2, r0, r1)
            X.AnonymousClass7Kz.A0K()
            java.lang.String r0 = "HubProvider not implemented for Instagram"
            java.lang.UnsupportedOperationException r0 = X.C86134wK.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1.invoke():java.lang.Object");
    }
}
