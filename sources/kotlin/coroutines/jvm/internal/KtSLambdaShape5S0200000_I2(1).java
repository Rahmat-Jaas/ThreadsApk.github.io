package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape5S0200000_I2 extends C39142Kno implements AnonymousClass0YP {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape5S0200000_I2(Object obj, C146958n9 r3, int i) {
        super(2, r3);
        this.A02 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2(r1, r6, r0);
        r3.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2(r2, r6, r1, 42);
        r3.A01 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ee, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0115, code lost:
        return new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2(r1, r2, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012b, code lost:
        return new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2(r2, r1, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C146958n9 create(java.lang.Object r5, X.C146958n9 r6) {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x0122;
                case 1: goto L_0x00b0;
                case 2: goto L_0x00ab;
                case 3: goto L_0x011c;
                case 4: goto L_0x0116;
                case 5: goto L_0x00a6;
                case 6: goto L_0x00a1;
                case 7: goto L_0x010b;
                case 8: goto L_0x0104;
                case 9: goto L_0x00fd;
                case 10: goto L_0x00f6;
                case 11: goto L_0x00ef;
                case 12: goto L_0x009b;
                case 13: goto L_0x0095;
                case 14: goto L_0x008f;
                case 15: goto L_0x0089;
                case 16: goto L_0x0084;
                case 17: goto L_0x007f;
                case 18: goto L_0x007a;
                case 19: goto L_0x0075;
                case 20: goto L_0x0070;
                case 21: goto L_0x006b;
                case 22: goto L_0x0066;
                case 23: goto L_0x0061;
                case 24: goto L_0x005c;
                case 25: goto L_0x0057;
                case 26: goto L_0x0052;
                case 27: goto L_0x004d;
                case 28: goto L_0x0048;
                case 29: goto L_0x0043;
                case 30: goto L_0x00e1;
                case 31: goto L_0x00dc;
                case 32: goto L_0x003e;
                case 33: goto L_0x0039;
                case 34: goto L_0x0034;
                case 35: goto L_0x00d5;
                case 36: goto L_0x002f;
                case 37: goto L_0x00d0;
                case 38: goto L_0x00c9;
                case 39: goto L_0x002a;
                case 40: goto L_0x00c4;
                case 41: goto L_0x00bf;
                case 42: goto L_0x0025;
                case 43: goto L_0x0020;
                case 44: goto L_0x001b;
                case 45: goto L_0x00ba;
                case 46: goto L_0x00b5;
                case 47: goto L_0x0016;
                case 48: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A01
            r0 = 49
        L_0x0009:
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r3.<init>(r1, r6, r0)
            r3.A00 = r5
            return r3
        L_0x0011:
            java.lang.Object r1 = r4.A01
            r0 = 48
            goto L_0x0009
        L_0x0016:
            java.lang.Object r1 = r4.A01
            r0 = 47
            goto L_0x0009
        L_0x001b:
            java.lang.Object r1 = r4.A01
            r0 = 44
            goto L_0x0009
        L_0x0020:
            java.lang.Object r1 = r4.A01
            r0 = 43
            goto L_0x0009
        L_0x0025:
            java.lang.Object r1 = r4.A01
            r0 = 42
            goto L_0x0009
        L_0x002a:
            java.lang.Object r1 = r4.A01
            r0 = 39
            goto L_0x0009
        L_0x002f:
            java.lang.Object r1 = r4.A01
            r0 = 36
            goto L_0x0009
        L_0x0034:
            java.lang.Object r1 = r4.A01
            r0 = 34
            goto L_0x0009
        L_0x0039:
            java.lang.Object r1 = r4.A01
            r0 = 33
            goto L_0x0009
        L_0x003e:
            java.lang.Object r1 = r4.A01
            r0 = 32
            goto L_0x0009
        L_0x0043:
            java.lang.Object r1 = r4.A01
            r0 = 29
            goto L_0x0009
        L_0x0048:
            java.lang.Object r1 = r4.A01
            r0 = 28
            goto L_0x0009
        L_0x004d:
            java.lang.Object r1 = r4.A01
            r0 = 27
            goto L_0x0009
        L_0x0052:
            java.lang.Object r1 = r4.A01
            r0 = 26
            goto L_0x0009
        L_0x0057:
            java.lang.Object r1 = r4.A01
            r0 = 25
            goto L_0x0009
        L_0x005c:
            java.lang.Object r1 = r4.A01
            r0 = 24
            goto L_0x0009
        L_0x0061:
            java.lang.Object r1 = r4.A01
            r0 = 23
            goto L_0x0009
        L_0x0066:
            java.lang.Object r1 = r4.A01
            r0 = 22
            goto L_0x0009
        L_0x006b:
            java.lang.Object r1 = r4.A01
            r0 = 21
            goto L_0x0009
        L_0x0070:
            java.lang.Object r1 = r4.A01
            r0 = 20
            goto L_0x0009
        L_0x0075:
            java.lang.Object r1 = r4.A01
            r0 = 19
            goto L_0x0009
        L_0x007a:
            java.lang.Object r1 = r4.A01
            r0 = 18
            goto L_0x0009
        L_0x007f:
            java.lang.Object r1 = r4.A01
            r0 = 17
            goto L_0x0009
        L_0x0084:
            java.lang.Object r1 = r4.A01
            r0 = 16
            goto L_0x0009
        L_0x0089:
            java.lang.Object r1 = r4.A01
            r0 = 15
            goto L_0x0009
        L_0x008f:
            java.lang.Object r1 = r4.A01
            r0 = 14
            goto L_0x0009
        L_0x0095:
            java.lang.Object r1 = r4.A01
            r0 = 13
            goto L_0x0009
        L_0x009b:
            java.lang.Object r1 = r4.A01
            r0 = 12
            goto L_0x0009
        L_0x00a1:
            java.lang.Object r1 = r4.A01
            r0 = 6
            goto L_0x0009
        L_0x00a6:
            java.lang.Object r1 = r4.A01
            r0 = 5
            goto L_0x0009
        L_0x00ab:
            java.lang.Object r1 = r4.A01
            r0 = 2
            goto L_0x0009
        L_0x00b0:
            java.lang.Object r1 = r4.A01
            r0 = 1
            goto L_0x0009
        L_0x00b5:
            java.lang.Object r2 = r4.A00
            r1 = 46
            goto L_0x00e5
        L_0x00ba:
            java.lang.Object r2 = r4.A00
            r1 = 45
            goto L_0x00e5
        L_0x00bf:
            java.lang.Object r2 = r4.A00
            r1 = 41
            goto L_0x00e5
        L_0x00c4:
            java.lang.Object r2 = r4.A00
            r1 = 40
            goto L_0x00e5
        L_0x00c9:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A00
            r0 = 38
            goto L_0x0126
        L_0x00d0:
            java.lang.Object r2 = r4.A00
            r1 = 37
            goto L_0x00e5
        L_0x00d5:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A01
            r0 = 35
            goto L_0x0110
        L_0x00dc:
            java.lang.Object r2 = r4.A00
            r1 = 31
            goto L_0x00e5
        L_0x00e1:
            java.lang.Object r2 = r4.A00
            r1 = 30
        L_0x00e5:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r3.<init>((java.lang.Object) r2, (X.C146958n9) r6, (int) r1, (int) r0)
            r3.A01 = r5
            return r3
        L_0x00ef:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A01
            r0 = 11
            goto L_0x0110
        L_0x00f6:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A01
            r0 = 10
            goto L_0x0110
        L_0x00fd:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A01
            r0 = 9
            goto L_0x0110
        L_0x0104:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A00
            r0 = 8
            goto L_0x0126
        L_0x010b:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A01
            r0 = 7
        L_0x0110:
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r3.<init>((java.lang.Object) r1, (java.lang.Object) r2, (X.C146958n9) r6, (int) r0)
            return r3
        L_0x0116:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A00
            r0 = 4
            goto L_0x0126
        L_0x011c:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A00
            r0 = 3
            goto L_0x0126
        L_0x0122:
            r2 = 0
            java.lang.Object r1 = r4.A00
            r0 = 0
        L_0x0126:
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r1, (X.C146958n9) r6, (int) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2.create(java.lang.Object, X.8n9):X.8n9");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v500, resolved type: X.5xd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v502, resolved type: X.5xd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v76, resolved type: X.5xc} */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x07d6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f7, code lost:
        X.AnonymousClass7JB.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x089c, code lost:
        r1 = (androidx.fragment.app.Fragment) r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0ea5, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0ea6, code lost:
        r4.markerEnd(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0ecb, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x105f, code lost:
        if (r5.AQN() == false) goto L_0x1061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x12ca, code lost:
        if ((-r4.A02) > r2) goto L_0x12cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x1369, code lost:
        if (r6 != null) goto L_0x136b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x1386, code lost:
        if (r6 != null) goto L_0x1375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x029b, code lost:
        if (r3 == X.AnonymousClass68D.A01) goto L_0x029d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r1 = r28
            int r0 = r1.A02
            r2 = r29
            switch(r0) {
                case 0: goto L_0x001a;
                case 1: goto L_0x1277;
                case 2: goto L_0x129e;
                case 3: goto L_0x001e;
                case 4: goto L_0x002d;
                case 5: goto L_0x003c;
                case 6: goto L_0x12b3;
                case 7: goto L_0x0062;
                case 8: goto L_0x007e;
                case 9: goto L_0x00a5;
                case 10: goto L_0x00c0;
                case 11: goto L_0x00dc;
                case 12: goto L_0x00fc;
                case 13: goto L_0x0241;
                case 14: goto L_0x025f;
                case 15: goto L_0x02ac;
                case 16: goto L_0x0315;
                case 17: goto L_0x0315;
                case 18: goto L_0x033e;
                case 19: goto L_0x03f9;
                case 20: goto L_0x046d;
                case 21: goto L_0x04a0;
                case 22: goto L_0x0780;
                case 23: goto L_0x08b0;
                case 24: goto L_0x0a04;
                case 25: goto L_0x0527;
                case 26: goto L_0x0a37;
                case 27: goto L_0x0c90;
                case 28: goto L_0x12d2;
                case 29: goto L_0x0cc3;
                case 30: goto L_0x0cfb;
                case 31: goto L_0x0d75;
                case 32: goto L_0x0da0;
                case 33: goto L_0x0dcb;
                case 34: goto L_0x0ddb;
                case 35: goto L_0x0e44;
                case 36: goto L_0x1322;
                case 37: goto L_0x0e8c;
                case 38: goto L_0x0ecd;
                case 39: goto L_0x0f0d;
                case 40: goto L_0x0f34;
                case 41: goto L_0x0009;
                case 42: goto L_0x0f44;
                case 43: goto L_0x10e5;
                case 44: goto L_0x114f;
                case 45: goto L_0x0f34;
                case 46: goto L_0x0009;
                case 47: goto L_0x1170;
                case 48: goto L_0x118b;
                case 49: goto L_0x124b;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r2 = r1.A01
            X.69F r2 = (X.AnonymousClass69F) r2
            java.lang.Object r0 = r1.A00
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r0.setLoadingStatus(r2)
        L_0x0017:
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0019:
            return r0
        L_0x001a:
            X.AnonymousClass0OU.A00(r2)
            goto L_0x0017
        L_0x001e:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r2 = r1.A01
            X.M5J r2 = (X.M5J) r2
            java.lang.Object r0 = r1.A00
            X.8gC r0 = (X.C143158gC) r0
            r2.A0E(r0)
            goto L_0x0017
        L_0x002d:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r2 = r1.A01
            X.M5J r2 = (X.M5J) r2
            java.lang.Object r0 = r1.A00
            X.8gC r0 = (X.C143158gC) r0
            r2.A0F(r0)
            goto L_0x0017
        L_0x003c:
            java.lang.Object r4 = X.C86164wN.A0Z(r2, r1)
            X.4qz r4 = (X.C83224qz) r4
            java.lang.Object r3 = r1.A01
            androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) r3
            X.062 r2 = r3.A00
            r0 = r2
            X.0pE r0 = (X.C14340pE) r0
            X.061 r1 = r0.A00
            X.061 r0 = X.AnonymousClass061.INITIALIZED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x0059
            r2.A07(r3)
            goto L_0x0017
        L_0x0059:
            X.Ew2 r1 = r4.Aa1()
            r0 = 0
            X.AnonymousClass7C2.A00(r0, r1)
            goto L_0x0017
        L_0x0062:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x0075 }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ all -> 0x0075 }
            java.lang.Object r2 = r0.call()     // Catch:{ all -> 0x0075 }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x0075 }
            X.8s9 r0 = (X.AnonymousClass8s9) r0     // Catch:{ all -> 0x0075 }
            r0.resumeWith(r2)     // Catch:{ all -> 0x0075 }
            goto L_0x0017
        L_0x0075:
            r2 = move-exception
            java.lang.Object r0 = r1.A01
            X.8n9 r0 = (X.C146958n9) r0
            X.C146958n9.A00(r2, r0)
            goto L_0x0017
        L_0x007e:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r2 = r1.A01
            X.GVp r2 = (X.C30797GVp) r2
            X.50R r4 = r2.A02
            if (r4 == 0) goto L_0x0017
            java.lang.Object r0 = r1.A00
            java.util.Map r0 = (java.util.Map) r0
            X.6g2 r3 = new X.6g2
            r3.<init>(r2, r0)
            android.animation.ValueAnimator r2 = r4.A01
            r2.start()
            r1 = 0
            X.C86134wK.A0z(r2, r4, r1)
            com.facebook.redex.IDxAListenerShape374S0100000_5_I2 r0 = new com.facebook.redex.IDxAListenerShape374S0100000_5_I2
            r0.<init>(r3, r1)
            r2.addListener(r0)
            goto L_0x0017
        L_0x00a5:
            X.AnonymousClass0OU.A00(r2)
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.7j4 r3 = r0.A0B
            java.lang.Object r2 = r1.A00
            X.7Et r2 = (X.C121207Et) r2
            java.lang.Object r1 = r1.A01
            com.fbpay.logging.LoggingContext r1 = (com.fbpay.logging.LoggingContext) r1
            X.AnonymousClass0wJ.A1N(r2, r1)
            java.lang.String r0 = "APP_START_CREDENTIAL"
            X.M5J r0 = X.C128167j4.A01(r2, r3, r1, r0)
            goto L_0x00f7
        L_0x00c0:
            X.AnonymousClass0OU.A00(r2)
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.7j3 r4 = r0.A0D
            java.lang.Object r3 = r1.A00
            X.7Et r3 = (X.C121207Et) r3
            java.lang.Object r2 = r1.A01
            com.fbpay.logging.LoggingContext r2 = (com.fbpay.logging.LoggingContext) r2
            boolean r1 = X.AnonymousClass0wJ.A1Y(r3, r2)
            java.lang.String r0 = "APP_START_DEFAULT_COMPONENT"
            X.M5J r0 = X.C128157j3.A01(r3, r4, r2, r0, r1)
            goto L_0x00f7
        L_0x00dc:
            X.AnonymousClass0OU.A00(r2)
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.7j5 r4 = r0.A01
            java.lang.Object r3 = r1.A00
            X.7Et r3 = (X.C121207Et) r3
            java.lang.Object r2 = r1.A01
            com.fbpay.logging.LoggingContext r2 = (com.fbpay.logging.LoggingContext) r2
            boolean r1 = X.AnonymousClass0wJ.A1Y(r3, r2)
            java.lang.String r0 = "APP_START_DEFAULT_COMPONENT"
            X.M5J r0 = X.AnonymousClass7j5.A00(r4, r3, r2, r0, r1)
        L_0x00f7:
            X.AnonymousClass7JB.A02(r0)
            goto L_0x0017
        L_0x00fc:
            java.lang.Object r2 = X.C86164wN.A0Z(r2, r1)
            X.6Pk r2 = (X.C100976Pk) r2
            boolean r0 = r2 instanceof X.AnonymousClass5z2
            if (r0 == 0) goto L_0x0225
            X.5z2 r2 = (X.AnonymousClass5z2) r2
            java.lang.Object r2 = r2.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r2
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0179
            java.lang.Object r6 = r1.A01
            X.5xc r6 = (X.AnonymousClass5xc) r6
            androidx.fragment.app.FragmentActivity r7 = r6.requireActivity()
            boolean r0 = r7.isFinishing()
            if (r0 != 0) goto L_0x0179
            X.0Oa r0 = r6.A02
            X.3ak r8 = X.C18200wM.A0N(r0)
            X.4qz r5 = X.AnonymousClass3J5.A00(r8)
            r4 = 0
            r0 = 27
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2
            r3.<init>(r8, r4, r0)
            r0 = 3
            X.C25237DiI.A00(r4, r4, r3, r5, r0)
            X.Dsm r5 = new X.Dsm
            r5.<init>(r7)
            r0 = 2131231992(0x7f0804f8, float:1.808008E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r5.A0i(r0)
            r0 = 2131821368(0x7f110338, float:1.9275477E38)
            r5.A0L(r0)
            r0 = 2131821367(0x7f110337, float:1.9275475E38)
            r5.A0K(r0)
            r3 = 2131831976(0x7f112ca8, float:1.9296993E38)
            r0 = 38
            com.facebook.redex.IDxCListenerShape218S0100000_2_I2 r0 = X.C86154wM.A0N(r6, r0)
            r5.A0P(r0, r3)
            r4 = 2131829574(0x7f112346, float:1.929212E38)
            r3 = 4
            com.facebook.redex.IDxCListenerShape78S0200000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape78S0200000_2_I2
            r0.<init>(r3, r7, r6)
            r5.A0O(r0, r4)
            r0 = 1
            r5.A0r(r0)
            r5.A0q(r0)
            com.facebook.redex.IDxDListenerShape321S0100000_2_I2 r0 = new com.facebook.redex.IDxDListenerShape321S0100000_2_I2
            r0.<init>(r6, r3)
            r5.A0e(r0)
            X.AnonymousClass0wJ.A1K(r5)
        L_0x0179:
            java.lang.Object r6 = r1.A01
            X.5xc r6 = (X.AnonymousClass5xc) r6
            X.21l r5 = X.C304721l.LOADED
            X.0Oa r0 = r6.A02
            java.lang.Object r7 = r0.getValue()
            X.57S r7 = (X.AnonymousClass57S) r7
            X.8AN r4 = new X.8AN
            r4.<init>()
            java.lang.String r3 = r2.A03
            java.lang.String r1 = r2.A02
            X.5MI r0 = new X.5MI
            r0.<init>(r3, r1)
            r4.add(r0)
            com.instagram.service.session.UserSession r7 = r7.A04
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36321434616077082(0x810a2700061b1a, double:3.033159733660573E-306)
            boolean r0 = X.C63803iN.A0E(r3, r7, r0)
            r1 = 10
            if (r0 == 0) goto L_0x01f7
            java.lang.Object r7 = r2.A00
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r0 = X.C18190wL.A1a(r7)
            if (r0 == 0) goto L_0x01f7
            r0 = 2131821375(0x7f11033f, float:1.9275491E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.7sq r0 = new X.7sq
            r0.<init>(r3)
            r4.add(r0)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0x(r7, r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x01ca:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r0 = r7.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4200000_I2) r0
            java.lang.String r10 = r0.A04
            java.lang.String r12 = r0.A05
            java.lang.String r13 = r0.A03
            java.lang.Object r9 = r0.A00
            java.lang.Long r9 = (java.lang.Long) r9
            java.lang.Object r11 = r0.A01
            java.lang.Long r11 = (java.lang.Long) r11
            java.lang.String r14 = r0.A02
            X.7sv r8 = new X.7sv
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.add(r8)
            goto L_0x01ca
        L_0x01ef:
            X.7sm r0 = new X.7sm
            r0.<init>(r3)
            r4.add(r0)
        L_0x01f7:
            java.lang.Object r0 = r2.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r0, r1)
            java.util.Iterator r7 = r0.iterator()
        L_0x0203:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x021e
            java.lang.Object r0 = r7.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2) r0
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A02
            java.lang.String r1 = r0.A00
            X.5MK r0 = new X.5MK
            r0.<init>(r3, r2, r1)
            r8.add(r0)
            goto L_0x0203
        L_0x021e:
            r4.addAll(r8)
            X.AnonymousClass0OP.A11(r4)
            goto L_0x0231
        L_0x0225:
            boolean r0 = r2 instanceof X.AnonymousClass5z1
            if (r0 == 0) goto L_0x0236
            java.lang.Object r6 = r1.A01
            X.9NU r6 = (X.AnonymousClass9NU) r6
            X.21l r5 = X.C304721l.ERROR
        L_0x022f:
            X.0ZV r4 = X.AnonymousClass0ZV.A00
        L_0x0231:
            r6.updateUi(r5, r4)
            goto L_0x0017
        L_0x0236:
            boolean r0 = r2 instanceof X.AnonymousClass5z3
            if (r0 == 0) goto L_0x0017
            java.lang.Object r6 = r1.A01
            X.9NU r6 = (X.AnonymousClass9NU) r6
            X.21l r5 = X.C304721l.LOADING
            goto L_0x022f
        L_0x0241:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r0 = r1.A01
            X.5xc r0 = (X.AnonymousClass5xc) r0
            X.0Oa r0 = r0.A02
            X.3ak r1 = X.C18200wM.A0N(r0)
            X.4qz r3 = X.AnonymousClass3J5.A00(r1)
            r2 = 0
            r0 = 34
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r1, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x0017
        L_0x025f:
            java.lang.Object r3 = X.C86164wN.A0Z(r2, r1)
            X.68D r3 = (X.AnonymousClass68D) r3
            int r2 = r3.ordinal()
            r0 = 0
            if (r2 == r0) goto L_0x028c
            r0 = 1
            if (r2 == r0) goto L_0x028c
            r0 = 2
            if (r2 == r0) goto L_0x028c
            r0 = 3
            if (r2 == r0) goto L_0x028c
            r0 = 4
            if (r2 != r0) goto L_0x0017
            java.lang.Object r0 = r1.A01
            X.58H r0 = (X.AnonymousClass58H) r0
            X.7Jo r0 = r0.A00
            java.lang.Integer r3 = X.AnonymousClass006.A0N
            r1 = 0
            r6 = 110(0x6e, float:1.54E-43)
            java.lang.String r4 = ""
            r2 = r1
            r5 = r1
            X.C122027Jo.A03(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0017
        L_0x028c:
            java.lang.Object r0 = r1.A01
            X.58H r0 = (X.AnonymousClass58H) r0
            X.7Jo r2 = r0.A00
            java.lang.Integer r5 = X.AnonymousClass006.A0N
            X.68D r0 = X.AnonymousClass68D.ELIGIBLE
            if (r3 == r0) goto L_0x029d
            X.68D r1 = X.AnonymousClass68D.AT_RISK_OF_BECOMING_INELIGIBLE
            r0 = 0
            if (r3 != r1) goto L_0x029e
        L_0x029d:
            r0 = 1
        L_0x029e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r4 = 0
            r8 = 28
            r6 = r4
            r7 = r4
            X.C122027Jo.A04(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0017
        L_0x02ac:
            java.lang.Object r2 = X.C86164wN.A0Z(r2, r1)
            X.6Pk r2 = (X.C100976Pk) r2
            boolean r0 = r2 instanceof X.AnonymousClass5z2
            if (r0 == 0) goto L_0x02e2
            X.5z2 r2 = (X.AnonymousClass5z2) r2
            java.lang.Object r2 = r2.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0020000_I2) r2
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x02d8
            java.lang.Integer r6 = X.AnonymousClass006.A0j
        L_0x02c2:
            java.lang.Object r0 = r1.A01
            X.58H r0 = (X.AnonymousClass58H) r0
            X.7Jo r3 = r0.A00
            r4 = 0
            boolean r0 = r2.A01
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r9 = 26
            r7 = r4
            r8 = r4
            X.C122027Jo.A04(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0017
        L_0x02d8:
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x02df
            java.lang.Integer r6 = X.AnonymousClass006.A0Y
            goto L_0x02c2
        L_0x02df:
            java.lang.Integer r6 = X.AnonymousClass006.A15
            goto L_0x02c2
        L_0x02e2:
            boolean r0 = r2 instanceof X.AnonymousClass5z1
            if (r0 == 0) goto L_0x0017
            X.5z1 r2 = (X.AnonymousClass5z1) r2
            java.lang.Object r3 = r2.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2) r3
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x02fa
            java.lang.Object r2 = r1.A01
            X.58H r2 = (X.AnonymousClass58H) r2
            r0 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.AnonymousClass58H.A02(r2, r0)
        L_0x02fa:
            java.lang.Object r0 = r1.A01
            X.58H r0 = (X.AnonymousClass58H) r0
            X.7Jo r1 = r0.A00
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0312
            java.lang.Integer r4 = X.AnonymousClass006.A15
        L_0x0306:
            r2 = 0
            java.lang.String r5 = r3.A00
            r7 = 110(0x6e, float:1.54E-43)
            r3 = r2
            r6 = r2
            X.C122027Jo.A03(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0017
        L_0x0312:
            java.lang.Integer r4 = X.AnonymousClass006.A0j
            goto L_0x0306
        L_0x0315:
            java.lang.Object r2 = X.C86164wN.A0Z(r2, r1)
            X.5z2 r2 = (X.AnonymousClass5z2) r2
            java.lang.Object r0 = r1.A01
            X.6pc r0 = (X.C112456pc) r0
            java.lang.Object r3 = r2.A00
            X.6d7 r3 = (X.C105246d7) r3
            com.instagram.service.session.UserSession r2 = r0.A01
            X.8HN r1 = X.AnonymousClass8HN.A00
            java.lang.Class<X.7t4> r0 = X.C131947t4.class
            java.lang.Object r2 = r2.A01(r0, r1)
            X.7t4 r2 = (X.C131947t4) r2
            com.instagram.api.schemas.ContentAppreciationFeatureStatus r1 = r3.A00
            com.instagram.api.schemas.ContentAppreciationFeatureStatus r0 = com.instagram.api.schemas.ContentAppreciationFeatureStatus.ON
            if (r1 != r0) goto L_0x033b
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x0337:
            r2.A00 = r0
            goto L_0x0017
        L_0x033b:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x0337
        L_0x033e:
            java.lang.Object r6 = X.C86164wN.A0Z(r2, r1)
            X.6LQ r6 = (X.AnonymousClass6LQ) r6
            boolean r0 = r6 instanceof X.C94405ur
            java.lang.String r3 = "loadingSpinner"
            if (r0 == 0) goto L_0x0360
            java.lang.Object r2 = r1.A01
            X.5xb r2 = (X.AnonymousClass5xb) r2
            X.21l r1 = X.C304721l.LOADED
            java.util.List r0 = r2.A04
            r2.updateUi(r1, r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A01
            if (r1 == 0) goto L_0x03f4
            X.69F r0 = X.AnonymousClass69F.LOADING
            r1.setLoadingStatus(r0)
            goto L_0x0017
        L_0x0360:
            boolean r0 = r6 instanceof X.C94395uq
            if (r0 == 0) goto L_0x0017
            java.lang.Object r2 = r1.A01
            X.5xb r2 = (X.AnonymousClass5xb) r2
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A01
            if (r1 == 0) goto L_0x03f4
            X.69F r0 = X.AnonymousClass69F.SUCCESS
            r1.setLoadingStatus(r0)
            X.5uq r6 = (X.C94395uq) r6
            int r5 = r6.A00
            java.lang.String r4 = r6.A01
            X.60Y r1 = r2.A00
            if (r1 != 0) goto L_0x0394
            android.content.res.Resources r3 = X.AnonymousClass0wJ.A0B(r2)
            r1 = 2131689478(0x7f0f0006, float:1.9007973E38)
            java.lang.Object[] r0 = X.C18210wN.A1X(r5)
            java.lang.String r0 = r3.getQuantityString(r1, r5, r0)
            X.C04220Ms.A06(r0)
            X.60Y r1 = new X.60Y
            r1.<init>(r4, r0)
            r2.A00 = r1
        L_0x0394:
            X.0Oa r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.MfV r0 = (X.C41882MfV) r0
            X.MfV[] r0 = new X.C41882MfV[]{r1, r0}
            java.util.List r5 = X.C06750aI.A17(r0)
            java.util.List r3 = r6.A02
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x03ae:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03d9
            java.lang.Object r0 = r1.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2) r0
            java.lang.String r7 = r0.A03
            java.lang.String r8 = r0.A02
            java.lang.String r9 = r0.A04
            java.lang.String r10 = r0.A01
            boolean r12 = r0.A05
            java.lang.Object r0 = r0.A00
            X.3Dd r0 = (X.C57943Dd) r0
            java.lang.CharSequence r0 = X.C59523Ld.A01(r2, r0)
            java.lang.String r11 = r0.toString()
            X.7sw r6 = new X.7sw
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4.add(r6)
            goto L_0x03ae
        L_0x03d9:
            java.util.List r1 = X.AnonymousClass00J.A0V(r4, r5)
            X.0Oa r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = X.C18180wK.A0n(r0)
            java.util.List r1 = X.AnonymousClass00J.A0V(r0, r1)
            X.21l r0 = X.C304721l.LOADED
            r2.updateUi(r0, r1)
            r2.A02 = r3
            goto L_0x0017
        L_0x03f4:
            X.C04220Ms.A0E(r3)
            goto L_0x07d5
        L_0x03f9:
            java.lang.Object r2 = X.C86164wN.A0Z(r2, r1)
            X.6LP r2 = (X.AnonymousClass6LP) r2
            boolean r0 = r2 instanceof X.C94365un
            if (r0 == 0) goto L_0x0426
            java.lang.Object r5 = r1.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.5un r2 = (X.C94365un) r2
            java.lang.String r4 = r2.A01
            X.3Dd r3 = r2.A00
            X.KHr r2 = X.C38040KHr.A01
            X.3iD r1 = new X.3iD
            r1.<init>()
            X.22c r0 = X.C306022c.ERROR
            r1.A0F(r0)
            r1.A0E = r4
            java.lang.CharSequence r0 = X.C59523Ld.A01(r5, r3)
            r1.A0A = r0
            X.C63733iD.A09(r2, r1)
            goto L_0x0017
        L_0x0426:
            boolean r0 = r2 instanceof X.C94385up
            if (r0 == 0) goto L_0x044d
            java.lang.Object r2 = r1.A01
            X.5xb r2 = (X.AnonymousClass5xb) r2
            r0 = 1
            r2.A03 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "arg_has_performed_funding"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0}
            android.os.Bundle r1 = X.C98316Fa.A00(r0)
            java.lang.String r0 = "key_result_funding"
            X.C010604w.A00(r1, r2, r0)
            X.C18180wK.A12(r2)
            goto L_0x0017
        L_0x044d:
            boolean r0 = r2 instanceof X.C94375uo
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.A01
            X.5xb r0 = (X.AnonymousClass5xb) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0Oa r0 = r0.A07
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r0)
            X.5uo r2 = (X.C94375uo) r2
            java.lang.String r7 = r2.A01
            X.9wF r5 = r2.A00
            java.lang.String r8 = "appreciation_fan_spending_bottom_sheet"
            r6 = 0
            X.C37412JrW.A06(r3, r4, r5, r6, r7, r8)
            goto L_0x0017
        L_0x046d:
            java.lang.Object r6 = X.C86164wN.A0Z(r2, r1)
            X.4qz r6 = (X.C83224qz) r6
            java.lang.Object r5 = r1.A01
            X.5xb r5 = (X.AnonymousClass5xb) r5
            X.0Oa r4 = r5.A08
            java.lang.Object r0 = r4.getValue()
            X.57a r0 = (X.C881757a) r0
            X.4wG r2 = r0.A07
            r3 = 0
            r1 = 18
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r0.<init>(r5, r3, r1)
            X.C18230wP.A1T(r0, r6, r2)
            java.lang.Object r0 = r4.getValue()
            X.57a r0 = (X.C881757a) r0
            X.4tk r2 = r0.A05
            r1 = 19
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r0.<init>(r5, r3, r1)
            X.C18230wP.A1T(r0, r6, r2)
            goto L_0x0017
        L_0x04a0:
            java.lang.Object r2 = X.C86164wN.A0Z(r2, r1)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.Class<com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl$Viewer> r1 = com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl.Viewer.class
            java.lang.String r0 = "viewer"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x1389
            java.lang.Class<com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl$Viewer$User> r1 = com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl.Viewer.User.class
            java.lang.String r0 = "user"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x1389
            java.lang.Class<com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl$Viewer$User$ContentAppreciationFundingConfig> r1 = com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl.Viewer.User.ContentAppreciationFundingConfig.class
            java.lang.String r0 = "content_appreciation_funding_config(session_id:$session_id)"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x1389
            java.lang.Class<com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl$Viewer$User$ContentAppreciationFundingConfig$ContentAppreciationConsumableProducts> r1 = com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl.Viewer.User.ContentAppreciationFundingConfig.ContentAppreciationConsumableProducts.class
            java.lang.String r0 = "content_appreciation_consumable_products"
            com.google.common.collect.ImmutableList r1 = r2.getTreeList(r0, r1)
            if (r1 == 0) goto L_0x1389
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r8 = r1.iterator()
        L_0x04d6:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0019
            com.facebook.pando.TreeJNI r7 = X.C18210wN.A0G(r8)
            X.C04220Ms.A04(r7)
            java.lang.Class<com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl$Viewer$User$ContentAppreciationFundingConfig$ContentAppreciationConsumableProducts$Product> r6 = com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl.Viewer.User.ContentAppreciationFundingConfig.ContentAppreciationConsumableProducts.Product.class
            java.lang.String r3 = "product"
            com.facebook.pando.TreeJNI r2 = r7.getTreeValue(r3, r6)
            r4 = 0
            if (r2 == 0) goto L_0x0525
            java.lang.String r1 = "external_sku_for_app(app:\"INSTAGRAM\")"
            java.lang.String r5 = r2.getStringValue(r1)
        L_0x04f4:
            com.facebook.pando.TreeJNI r1 = r7.getTreeValue(r3, r6)
            if (r1 == 0) goto L_0x04fe
            java.lang.String r4 = X.C18220wO.A0m(r1)
        L_0x04fe:
            java.lang.String r3 = X.C86164wN.A0g(r7)
            if (r5 == 0) goto L_0x04d6
            boolean r1 = X.AnonymousClass8bQ.A0n(r5)
            if (r1 != 0) goto L_0x04d6
            if (r4 == 0) goto L_0x04d6
            boolean r1 = X.AnonymousClass8bQ.A0n(r4)
            if (r1 != 0) goto L_0x04d6
            if (r3 == 0) goto L_0x04d6
            boolean r1 = X.AnonymousClass8bQ.A0n(r3)
            if (r1 != 0) goto L_0x04d6
            r2 = 12
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2
            r1.<init>((java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r3, (int) r2)
            r0.add(r1)
            goto L_0x04d6
        L_0x0525:
            r5 = r4
            goto L_0x04f4
        L_0x0527:
            java.lang.Object r2 = X.C86164wN.A0Z(r2, r1)
            X.8ed r2 = (X.C142298ed) r2
            boolean r0 = r2 instanceof X.AnonymousClass5LU
            if (r0 == 0) goto L_0x0561
            java.lang.Object r6 = r1.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            X.5LU r2 = (X.AnonymousClass5LU) r2
            java.lang.String r5 = r2.A01
            X.3I0 r4 = r2.A00
            X.KHr r3 = X.C38040KHr.A01
            X.3iD r1 = new X.3iD
            r1.<init>()
            X.22c r0 = X.C306022c.ERROR
            r1.A0F(r0)
            r1.A0E = r5
            java.lang.String r0 = X.C59513Lc.A01(r6, r4)
            r1.A0A = r0
            X.C63733iD.A09(r3, r1)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0017
            X.DrH r0 = X.C18230wP.A0a(r6)
        L_0x055a:
            if (r0 == 0) goto L_0x0017
            r0.A0C()
            goto L_0x0017
        L_0x0561:
            boolean r0 = r2 instanceof X.AnonymousClass5LT
            if (r0 == 0) goto L_0x0634
            X.5LT r2 = (X.AnonymousClass5LT) r2
            com.instagram.common.typedurl.ImageUrl r3 = r2.A01
            if (r3 == 0) goto L_0x0589
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r0 = r0.requireContext()
            X.GfD r0 = X.C29573FqZ.A00(r0)
            java.lang.String r4 = r3.getUrl()
            X.C04220Ms.A06(r4)
            java.util.Map r3 = r0.A06
            X.GFL r0 = r0.A05
            java.lang.String r0 = r0.A00(r4)
            r3.remove(r0)
        L_0x0589:
            java.lang.Object r10 = r1.A01
            X.5xa r10 = (X.AnonymousClass5xa) r10
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r10)
            r0 = 2131821386(0x7f11034a, float:1.9275514E38)
            java.lang.String r3 = X.C18190wL.A0g(r1, r0)
            X.0Oa r9 = r10.A06
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r9)
            android.content.Context r1 = r10.requireContext()
            r4 = 0
            r7 = 1
            X.C04220Ms.A0B(r0, r7)
            X.Jj9 r6 = new X.Jj9
            r6.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r6.A0M = r0
            r6.A0e = r4
            r6.A0i = r7
            r6.A0O = r3
            boolean r0 = X.AnonymousClass0hB.A02(r1)
            if (r0 == 0) goto L_0x0631
            int[] r8 = X.C37032Jj9.A0s
        L_0x05c0:
            r5 = r8[r4]
            r3 = r8[r7]
            r0 = 2
            r1 = r8[r0]
            r0 = 3
            r0 = r8[r0]
            r6.A02(r5, r3, r1, r0)
            android.os.Bundle r3 = r10.requireArguments()
            X.Jqm r5 = r10.A03
            if (r5 == 0) goto L_0x0017
            X.6uP r0 = X.AnonymousClass2FT.A00()
            r0.A01()
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r9)
            int r12 = r2.A00
            java.lang.String r11 = r2.A02
            java.lang.String r0 = "arg_media_id"
            java.lang.String r10 = r3.getString(r0)
            if (r10 == 0) goto L_0x1396
            java.lang.String r0 = "arg_creator_id"
            java.lang.String r9 = r3.getString(r0)
            if (r9 == 0) goto L_0x1391
            java.lang.String r0 = "arg_entry_point"
            java.lang.String r8 = r3.getString(r0)
            if (r8 == 0) goto L_0x138c
            X.C04220Ms.A0B(r1, r4)
            X.5xb r4 = new X.5xb
            r4.<init>()
            java.lang.String r1 = r1.token
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            kotlin.Pair r3 = X.C18180wK.A0p(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = "ext_balance"
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r1)
            com.instagram.appreciation.analytics.LoggingFanData r1 = new com.instagram.appreciation.analytics.LoggingFanData
            r1.<init>(r11, r10, r9, r8)
            java.lang.String r0 = "arg_appreciation_logging_fan_data"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r3, r2, r0}
            android.os.Bundle r0 = X.C98316Fa.A00(r0)
            r4.setArguments(r0)
            r5.A0A(r4, r6, r7)
            goto L_0x0017
        L_0x0631:
            int[] r8 = X.C37032Jj9.A0t
            goto L_0x05c0
        L_0x0634:
            boolean r0 = r2 instanceof X.AnonymousClass5LV
            if (r0 == 0) goto L_0x0760
            java.lang.Object r4 = r1.A01
            X.5xa r4 = (X.AnonymousClass5xa) r4
            X.5LV r2 = (X.AnonymousClass5LV) r2
            int r8 = r2.A00
            java.lang.String r7 = r2.A03
            android.graphics.drawable.Drawable r3 = r2.A01
            com.instagram.common.typedurl.ImageUrl r13 = r2.A02
            java.lang.String r15 = r2.A05
            java.lang.String r10 = r2.A04
            java.util.List r9 = r2.A06
            androidx.fragment.app.FragmentActivity r11 = r4.requireActivity()
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "arg_media_id"
            java.lang.String r16 = r1.getString(r0)
            if (r16 == 0) goto L_0x13ae
            java.lang.String r0 = "arg_creator_id"
            java.lang.String r17 = r1.getString(r0)
            if (r17 == 0) goto L_0x13a9
            r0 = 299(0x12b, float:4.19E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r20 = r1.getString(r0)
            if (r20 == 0) goto L_0x13a4
            java.lang.String r0 = "arg_entry_point"
            java.lang.String r18 = r1.getString(r0)
            if (r18 == 0) goto L_0x139f
            X.0Oa r0 = r4.A06
            com.instagram.service.session.UserSession r14 = X.AnonymousClass0wJ.A0X(r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131100073(0x7f0601a9, float:1.7812517E38)
            int r26 = r1.getColor(r0)
            r6 = 2131821417(0x7f110369, float:1.9275577E38)
            r2 = 1
            r1 = 0
            java.lang.Object[] r5 = new java.lang.Object[]{r20}
            X.3I0 r0 = new X.3I0
            r0.<init>(r5, r6)
            java.lang.String r23 = X.C59513Lc.A01(r4, r0)
            r6 = 2131821416(0x7f110368, float:1.9275575E38)
            java.lang.Object[] r5 = new java.lang.Object[]{r20}
            X.3I0 r0 = new X.3I0
            r0.<init>(r5, r6)
            java.lang.String r21 = X.C59513Lc.A01(r4, r0)
            androidx.lifecycle.LifecycleCoroutineScopeImpl r5 = X.AnonymousClass067.A00(r11)
            r0 = 0
            com.instagram.appreciation.gifting.AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1 r12 = new com.instagram.appreciation.gifting.AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1
            r19 = r10
            r22 = r7
            r24 = r9
            r25 = r0
            r27 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r6 = 3
            X.C25237DiI.A00(r0, r0, r12, r5, r6)
            X.0Oa r5 = r4.A07
            java.lang.Object r5 = r5.getValue()
            X.57r r5 = (X.C883457r) r5
            X.7EX r10 = r5.A00
            java.lang.Integer r5 = X.AnonymousClass006.A0C
            X.5Ch r9 = X.AnonymousClass7EX.A01(r10, r5, r0, r7, r8)
            java.util.List r6 = r10.A00
            java.lang.String r5 = "gift_options"
            r9.A0B(r5, r6)
            X.0nS r6 = r10.A02
            X.C04220Ms.A05(r6)
            com.instagram.appreciation.analytics.LoggingFanData r5 = r10.A01
            java.lang.String r8 = r5.A03
            java.util.Map r7 = X.AnonymousClass4WJ.A0A()
            java.lang.String r5 = "client_load_appreciationgiver_display"
            X.0A2 r6 = X.AnonymousClass0wJ.A0M(r6, r5)
            r5 = 253(0xfd, float:3.55E-43)
            X.C86104wH.A1I(r6, r9, r8, r7, r5)
            X.9RY r7 = r4.A01
            if (r7 == 0) goto L_0x075a
            int r5 = r7.A00
            if (r5 < 0) goto L_0x075a
            X.BLL r6 = r7.A01
            int r4 = r6.A01()
            if (r5 >= r4) goto L_0x075a
            int r4 = r7.A00
            X.9CZ r5 = r6.A03(r4)
            X.C04220Ms.A0B(r5, r1)
            X.BMf r4 = r6.A07
            X.94O r4 = r4.A07(r5)
            X.BMj r5 = r4.A04
            if (r5 == 0) goto L_0x075a
            X.7gt r4 = r5.A0S
            if (r4 == 0) goto L_0x075a
            X.6jf r4 = r4.A01
            if (r4 == 0) goto L_0x075a
            java.lang.ref.WeakReference r4 = X.C86144wL.A0w(r3)
            r5.A1A = r4
            r4 = 42
            X.C20066BMj.A04(r5, r4)
            X.7gt r7 = r5.A0S
            if (r7 == 0) goto L_0x075a
            boolean r4 = r3 instanceof X.C86654y1
            if (r4 == 0) goto L_0x075a
            X.4y1 r3 = (X.C86654y1) r3
            r7.A00 = r3
            java.lang.String r6 = "gifDrawable"
            if (r3 == 0) goto L_0x139b
            boolean r4 = r3.A04
            if (r4 != 0) goto L_0x0741
            r3.A04 = r2
            r3.invalidateSelf()
        L_0x0741:
            X.4y1 r5 = r7.A00
            if (r5 == 0) goto L_0x139b
            r3 = 0
            r5.A02 = r3
            r5.A00 = r1
            X.DsR r1 = r7.A02
            X.C04220Ms.A05(r1)
            X.DrU r0 = X.C127297gt.A03
            r1.A0D(r0)
            r1.A06 = r2
            X.C86124wJ.A1M(r1)
        L_0x075a:
            X.DrH r0 = X.C18220wO.A0b(r11)
            goto L_0x055a
        L_0x0760:
            boolean r0 = r2 instanceof X.AnonymousClass5LS
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.A01
            X.5xa r0 = (X.AnonymousClass5xa) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0Oa r0 = r0.A06
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r0)
            X.5LS r2 = (X.AnonymousClass5LS) r2
            java.lang.String r7 = "https://help.instagram.com/523408036294825"
            X.9wF r5 = r2.A00
            java.lang.String r8 = "appreciation_gifting_bottom_sheet"
            r6 = 0
            X.C37412JrW.A06(r3, r4, r5, r6, r7, r8)
            goto L_0x0017
        L_0x0780:
            java.lang.Object r5 = X.C86164wN.A0Z(r2, r1)
            X.8eb r5 = (X.C142278eb) r5
            r12 = 0
            boolean r2 = r5 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1100000_I2
            if (r2 == 0) goto L_0x07b5
            r4 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1100000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1100000_I2) r4
            int r0 = r4.A02
            if (r0 != r12) goto L_0x07b5
            X.KHr r3 = X.C38040KHr.A01
            X.3iD r2 = new X.3iD
            r2.<init>()
            X.22c r0 = X.C306022c.ERROR
            r2.A0F(r0)
            java.lang.String r0 = r4.A01
            r2.A0E = r0
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.Object r0 = r4.A00
            X.3I0 r0 = (X.AnonymousClass3I0) r0
            java.lang.String r0 = X.C59513Lc.A01(r1, r0)
            r2.A0A = r0
            X.C63733iD.A09(r3, r2)
            goto L_0x0017
        L_0x07b5:
            boolean r0 = r5 instanceof X.AnonymousClass5LO
            if (r0 == 0) goto L_0x07d7
            java.lang.Object r0 = r1.A01
            X.5xd r0 = (X.AnonymousClass5xd) r0
            r0.requireActivity()
            X.5LO r5 = (X.AnonymousClass5LO) r5
            java.lang.String r3 = r5.A00
            X.0Oa r2 = r0.A07
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r2)
            java.lang.String r0 = "appreciation_gift_feed"
            X.C25586DoM.A02(r1, r3, r0, r0)
            r2.getValue()
            X.C60113Ns.A00()
        L_0x07d5:
            r0 = 0
            throw r0
        L_0x07d7:
            r0 = 1
            if (r2 == 0) goto L_0x0898
            r3 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1100000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape2S1100000_I2) r3
            int r2 = r3.A02
            if (r2 != r0) goto L_0x0898
            java.lang.Object r9 = r1.A01
            X.5xd r9 = (X.AnonymousClass5xd) r9
            java.lang.Object r10 = r3.A00
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.String r11 = r3.A01
            androidx.fragment.app.FragmentActivity r7 = r9.requireActivity()
            X.DrH r5 = X.C18220wO.A0b(r7)
            android.os.Bundle r4 = r9.requireArguments()
            X.0Oa r2 = r9.A07
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r2)
            java.lang.String r14 = r9.A00
            java.lang.String r1 = "arg_media_id"
            java.lang.String r15 = r4.getString(r1)
            if (r15 == 0) goto L_0x13b8
            java.lang.String r1 = "arg_creator_id"
            java.lang.String r16 = r4.getString(r1)
            if (r16 == 0) goto L_0x13b3
            java.lang.String r1 = "arg_entry_point"
            java.lang.String r17 = r4.getString(r1)
            if (r17 != 0) goto L_0x0819
            java.lang.String r17 = "unknown"
        L_0x0819:
            r18 = 5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2 r13 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2
            r13.<init>(r14, r15, r16, r17, r18)
            X.7JF r8 = new X.7JF
            r8.<init>(r13, r9, r3)
            X.0Oa r1 = r9.A08
            java.lang.Object r1 = r1.getValue()
            X.58E r1 = (X.AnonymousClass58E) r1
            java.lang.Long r17 = r1.A03()
            if (r5 == 0) goto L_0x0017
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r2)
            X.3Iu r3 = new X.3Iu
            r3.<init>(r1)
            java.lang.String r2 = r10.BK7()
            java.lang.String r1 = r10.Ak1()
            r3.A0A(r2, r1)
            com.instagram.common.typedurl.ImageUrl r2 = r10.B4M()
            X.3hu r1 = r3.A03
            if (r1 == 0) goto L_0x0851
            r1.A08 = r2
        L_0x0851:
            boolean r2 = r10.BRq()
            r1 = 2131821402(0x7f11035a, float:1.9275546E38)
            if (r2 == 0) goto L_0x085d
            r1 = 2131821404(0x7f11035c, float:1.927555E38)
        L_0x085d:
            com.facebook.redex.IDxCListenerShape1S1400000_2_I2 r6 = new com.facebook.redex.IDxCListenerShape1S1400000_2_I2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3.A01(r6, r1)
            boolean r1 = r10.A3Q()
            if (r1 == 0) goto L_0x0877
            r1 = 2131821403(0x7f11035b, float:1.9275548E38)
            com.facebook.redex.IDxCListenerShape1S1400000_2_I2 r6 = new com.facebook.redex.IDxCListenerShape1S1400000_2_I2
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3.A03(r6, r1)
        L_0x0877:
            r1 = 2131837947(0x7f1143fb, float:1.9309103E38)
            X.7RL r12 = new X.7RL
            r13 = r7
            r14 = r8
            r15 = r9
            r16 = r10
            r18 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r3.A03(r12, r1)
            com.facebook.redex.IDxListenerShape204S0200000_2_I2 r2 = new com.facebook.redex.IDxListenerShape204S0200000_2_I2
            r2.<init>(r0, r3, r7)
        L_0x088e:
            r0 = r5
            X.Ipf r0 = (X.C35189Ipf) r0
            r0.A0B = r2
            r5.A0C()
            goto L_0x0017
        L_0x0898:
            boolean r0 = r5 instanceof X.C130097og
            if (r0 == 0) goto L_0x0017
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.DrH r5 = X.C18220wO.A0b(r0)
            if (r5 == 0) goto L_0x0017
            com.facebook.redex.IDxListenerShape204S0200000_2_I2 r2 = new com.facebook.redex.IDxListenerShape204S0200000_2_I2
            r2.<init>(r12, r0, r1)
            goto L_0x088e
        L_0x08b0:
            java.lang.Object r2 = X.C86164wN.A0Z(r2, r1)
            X.8ec r2 = (X.C142288ec) r2
            boolean r0 = r2 instanceof X.C130107oi
            if (r0 == 0) goto L_0x08cd
            java.lang.Object r0 = r1.A01
            X.5xd r0 = (X.AnonymousClass5xd) r0
            X.21l r3 = X.C304721l.LOADED
            X.0Oa r1 = r0.A06
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
        L_0x08c8:
            r0.updateUi(r3, r1)
            goto L_0x0017
        L_0x08cd:
            boolean r0 = r2 instanceof X.AnonymousClass7oh
            if (r0 == 0) goto L_0x08da
            java.lang.Object r0 = r1.A01
            X.9NU r0 = (X.AnonymousClass9NU) r0
            X.21l r3 = X.C304721l.ERROR
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            goto L_0x08c8
        L_0x08da:
            boolean r0 = r2 instanceof X.AnonymousClass5LQ
            if (r0 == 0) goto L_0x09d5
            java.lang.Object r0 = r1.A01
            X.5xd r0 = (X.AnonymousClass5xd) r0
            X.21l r3 = X.C304721l.LOADED
            X.5LQ r2 = (X.AnonymousClass5LQ) r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0250000_I2 r2 = r2.A00
            java.lang.Object r1 = r2.A01
            java.util.List r1 = (java.util.List) r1
            boolean r6 = r1.isEmpty()
            X.8AN r1 = new X.8AN
            r1.<init>()
            boolean r5 = r2.A06
            boolean r4 = r2.A05
            java.util.List r4 = X.AnonymousClass5xd.A00(r0, r5, r4)
            r1.addAll(r4)
            java.lang.Object r7 = r2.A00
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            if (r6 == 0) goto L_0x0935
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r7)
            java.util.Iterator r5 = r7.iterator()
        L_0x090e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x09bf
            java.lang.Object r2 = r5.next()
            X.5HS r2 = (X.AnonymousClass5HS) r2
            long r10 = r2.A00
            X.3I0 r7 = r2.A01
            com.instagram.common.typedurl.ImageUrl r8 = r2.A03
            boolean r12 = r2.A04
            X.3Dd r2 = r2.A02
            java.lang.CharSequence r2 = X.C59523Ld.A01(r0, r2)
            java.lang.String r9 = r2.toString()
            X.MKA r6 = new X.MKA
            r6.<init>(r7, r8, r9, r10, r12)
            r4.add(r6)
            goto L_0x090e
        L_0x0935:
            r5 = 10
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0x(r7, r5)
            java.util.Iterator r7 = r7.iterator()
        L_0x093f:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0966
            java.lang.Object r4 = r7.next()
            X.5HS r4 = (X.AnonymousClass5HS) r4
            long r12 = r4.A00
            X.3I0 r9 = r4.A01
            com.instagram.common.typedurl.ImageUrl r10 = r4.A03
            boolean r14 = r4.A04
            X.3Dd r4 = r4.A02
            java.lang.CharSequence r4 = X.C59523Ld.A01(r0, r4)
            java.lang.String r11 = r4.toString()
            X.MKA r8 = new X.MKA
            r8.<init>(r9, r10, r11, r12, r14)
            r6.add(r8)
            goto L_0x093f
        L_0x0966:
            X.60X r4 = new X.60X
            r4.<init>(r6)
            r1.add(r4)
            X.0Oa r4 = r0.A02
            java.lang.Object r4 = r4.getValue()
            r1.add(r4)
            java.lang.Object r4 = r2.A01
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r4, r5)
            java.util.Iterator r9 = r4.iterator()
        L_0x0983:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x09b5
            java.lang.Object r6 = r9.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2) r6
            java.lang.String r14 = r6.A05
            java.lang.Object r13 = r6.A04
            com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
            int r4 = r6.A00
            double r15 = (double) r4
            long r4 = r6.A01
            java.lang.Object r11 = r6.A02
            com.instagram.common.typedurl.ImageUrl r11 = (com.instagram.common.typedurl.ImageUrl) r11
            boolean r7 = r6.A07
            java.lang.Object r12 = r6.A03
            com.instagram.model.reels.Reel r12 = (com.instagram.model.reels.Reel) r12
            boolean r6 = r6.A06
            X.KJV r10 = new X.KJV
            r19 = r7
            r20 = r6
            r17 = r4
            r10.<init>(r11, r12, r13, r14, r15, r17, r19, r20)
            r8.add(r10)
            goto L_0x0983
        L_0x09b5:
            r1.addAll(r8)
            boolean r2 = r2.A04
            if (r2 == 0) goto L_0x09d0
            X.0Oa r2 = r0.A05
            goto L_0x09c9
        L_0x09bf:
            X.60X r2 = new X.60X
            r2.<init>(r4)
            r1.add(r2)
            X.0Oa r2 = r0.A04
        L_0x09c9:
            java.lang.Object r2 = r2.getValue()
            r1.add(r2)
        L_0x09d0:
            X.AnonymousClass0OP.A11(r1)
            goto L_0x08c8
        L_0x09d5:
            boolean r0 = r2 instanceof X.AnonymousClass5LR
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.A01
            X.9NU r0 = (X.AnonymousClass9NU) r0
            X.21l r3 = X.C304721l.LOADED
            X.5LR r2 = (X.AnonymousClass5LR) r2
            X.3Dd r1 = r2.A01
            X.3Dd r2 = r2.A00
            java.lang.CharSequence r1 = X.C59523Ld.A01(r0, r1)
            java.lang.String r4 = r1.toString()
            if (r2 == 0) goto L_0x0a02
            java.lang.CharSequence r1 = X.C59523Ld.A01(r0, r2)
            java.lang.String r2 = r1.toString()
        L_0x09f7:
            X.60Z r1 = new X.60Z
            r1.<init>(r4, r2)
            java.util.List r1 = X.C18180wK.A0n(r1)
            goto L_0x08c8
        L_0x0a02:
            r2 = 0
            goto L_0x09f7
        L_0x0a04:
            java.lang.Object r6 = X.C86164wN.A0Z(r2, r1)
            X.4qz r6 = (X.C83224qz) r6
            java.lang.Object r5 = r1.A01
            X.5xd r5 = (X.AnonymousClass5xd) r5
            X.0Oa r4 = r5.A08
            java.lang.Object r0 = r4.getValue()
            X.58E r0 = (X.AnonymousClass58E) r0
            X.4tk r2 = r0.A05
            r3 = 0
            r1 = 22
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r0.<init>(r5, r3, r1)
            X.C18230wP.A1T(r0, r6, r2)
            java.lang.Object r0 = r4.getValue()
            X.58E r0 = (X.AnonymousClass58E) r0
            X.4wG r2 = r0.A07
            r1 = 23
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r0.<init>(r5, r3, r1)
            X.C18230wP.A1T(r0, r6, r2)
            goto L_0x0017
        L_0x0a37:
            java.lang.Object r5 = X.C86164wN.A0Z(r2, r1)
            X.8ee r5 = (X.C142308ee) r5
            boolean r2 = r5 instanceof X.C130117ok
            java.lang.String r4 = "loadingSpinner"
            r0 = 0
            if (r2 != 0) goto L_0x0c77
            boolean r2 = r5 instanceof X.C130127ol
            if (r2 != 0) goto L_0x0c77
            boolean r2 = r5 instanceof X.AnonymousClass7oj
            if (r2 == 0) goto L_0x0a59
            java.lang.Object r2 = r1.A01
            X.9NU r2 = (X.AnonymousClass9NU) r2
            X.21l r1 = X.C304721l.ERROR
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            r2.updateUi(r1, r0)
            goto L_0x0017
        L_0x0a59:
            boolean r2 = r5 instanceof X.AnonymousClass5LW
            r7 = 10
            if (r2 == 0) goto L_0x0a9c
            java.lang.Object r6 = r1.A01
            X.5xa r6 = (X.AnonymousClass5xa) r6
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r6.A02
            if (r1 != 0) goto L_0x0a6d
            java.lang.String r1 = "sendButton"
            X.C04220Ms.A0E(r1)
            throw r0
        L_0x0a6d:
            r0 = 1
            r1.setPrimaryActionIsLoading(r0)
            X.5LW r5 = (X.AnonymousClass5LW) r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2 r0 = r5.A01
            int r4 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0310000_I2 r3 = r5.A00
            java.lang.Object r0 = r0.A02
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r0, r7)
            java.util.Iterator r1 = r0.iterator()
        L_0x0a85:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a97
            java.lang.Object r0 = r1.next()
            X.5Hc r0 = (X.AnonymousClass5Hc) r0
            java.lang.String r0 = r0.A04
            r2.add(r0)
            goto L_0x0a85
        L_0x0a97:
            X.AnonymousClass5xa.A00(r3, r6, r2, r4)
            goto L_0x0017
        L_0x0a9c:
            boolean r2 = r5 instanceof X.AnonymousClass5LX
            if (r2 == 0) goto L_0x0017
            java.lang.Object r3 = r1.A01
            X.5xa r3 = (X.AnonymousClass5xa) r3
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r3.A04
            if (r2 == 0) goto L_0x13c7
            X.69F r1 = X.AnonymousClass69F.SUCCESS
            r2.setLoadingStatus(r1)
            r6 = r5
            X.5LX r6 = (X.AnonymousClass5LX) r6
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x0b10
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2 r2 = r6.A01
            java.lang.String r1 = r2.A03
            int r10 = r2.A00
            X.Jqm r2 = r3.A03
            if (r2 == 0) goto L_0x0b10
            r14 = 0
            r16 = 4095(0xfff, float:5.738E-42)
            X.17a r4 = new X.17a
            r11 = r4
            r12 = r0
            r13 = r0
            r15 = r14
            r17 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r4.A06 = r1
            r1 = 2131233052(0x7f08091c, float:1.808223E38)
            r4.A01 = r1
            r1 = 2131099673(0x7f060019, float:1.7811706E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.A08 = r1
            android.content.res.Resources r9 = X.AnonymousClass0wJ.A0B(r3)
            r8 = 2131689479(0x7f0f0007, float:1.9007975E38)
            java.lang.Object[] r1 = X.C18210wN.A1X(r10)
            java.lang.String r1 = r9.getQuantityString(r8, r10, r1)
            X.C04220Ms.A06(r1)
            r4.A07 = r1
            r1 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.A09 = r1
            r1 = 2131821386(0x7f11034a, float:1.9275514E38)
            java.lang.String r1 = X.C18180wK.A0g(r3, r1)
            r4.A05 = r1
            r1 = 83
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r1 = X.C86134wK.A0P(r3, r1)
            r4.A04 = r1
            X.JPd r1 = r4.A01()
            r2.A0D(r1)
        L_0x0b10:
            X.21l r11 = X.C304721l.LOADED
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2 r4 = r6.A01
            java.lang.Object r8 = r4.A02
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0x(r8, r7)
            java.util.Iterator r13 = r8.iterator()
        L_0x0b20:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0b57
            java.lang.Object r12 = r13.next()
            X.5Hc r12 = (X.AnonymousClass5Hc) r12
            java.lang.String r9 = r12.A04
            java.lang.String r2 = r12.A02
            java.lang.String r1 = r12.A05
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.C18250wR.A0K(r1)
            java.lang.String r1 = r12.A03
            com.instagram.common.typedurl.SimpleImageUrl r16 = X.C18250wR.A0K(r1)
            boolean r1 = r12.A06
            X.3Dd r12 = r12.A01
            java.lang.CharSequence r12 = X.C59523Ld.A01(r3, r12)
            java.lang.String r19 = r12.toString()
            X.7sx r14 = new X.7sx
            r18 = r2
            r20 = r1
            r17 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r10.add(r14)
            goto L_0x0b20
        L_0x0b57:
            r3.updateUi(r11, r10)
            java.lang.Object r10 = r4.A01
            X.20f r10 = (X.C302320f) r10
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r3.A02
            java.lang.String r15 = "sendButton"
            if (r1 == 0) goto L_0x0bd3
            java.lang.Object r1 = r1.getTag()
            if (r1 == r10) goto L_0x0bf8
            android.os.Bundle r2 = r3.requireArguments()
            r1 = 299(0x12b, float:4.19E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r12 = r2.getString(r1)
            if (r12 == 0) goto L_0x13c2
            android.content.Context r2 = r3.requireContext()
            r1 = 2131100109(0x7f0601cd, float:1.781259E38)
            int r11 = r2.getColor(r1)
            int r9 = r10.ordinal()
            r2 = 0
            r1 = 1
            if (r9 == r2) goto L_0x0bd7
            if (r9 != r1) goto L_0x13bd
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r3)
            r1 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r14 = X.C18190wL.A0g(r2, r1)
            r9 = 2131821413(0x7f110365, float:1.9275568E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r12}
            X.3I0 r1 = new X.3I0
            r1.<init>(r2, r9)
            java.lang.String r1 = X.C59513Lc.A01(r3, r1)
            android.text.SpannableStringBuilder r13 = X.C18190wL.A0D(r1, r14)
            int r9 = X.C18180wK.A00(r3)
            r2 = 3
            com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2 r1 = new com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2
            r1.<init>(r3, r9, r2)
            X.AnonymousClass3Zw.A00(r13, r1, r14)
        L_0x0bbb:
            X.0xk r1 = new X.0xk
            r1.<init>(r11)
            X.AnonymousClass3Zw.A00(r13, r1, r12)
            X.C04220Ms.A09(r13)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r3.A02
            if (r1 == 0) goto L_0x0bd3
            r1.setFooterText(r13)
            android.widget.Space r2 = r3.A00
            if (r2 != 0) goto L_0x0bec
            java.lang.String r15 = "termsPlaceHolder"
        L_0x0bd3:
            X.C04220Ms.A0E(r15)
            throw r0
        L_0x0bd7:
            r9 = 2131821412(0x7f110364, float:1.9275566E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r12}
            X.3I0 r1 = new X.3I0
            r1.<init>(r2, r9)
            java.lang.String r1 = X.C59513Lc.A01(r3, r1)
            android.text.SpannableStringBuilder r13 = X.C18200wM.A0E(r1)
            goto L_0x0bbb
        L_0x0bec:
            r1 = 8
            r2.setVisibility(r1)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r3.A02
            if (r1 == 0) goto L_0x0bd3
            r1.setTag(r10)
        L_0x0bf8:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0310000_I2 r6 = r6.A00
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0x(r8, r7)
            java.util.Iterator r2 = r8.iterator()
        L_0x0c02:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0c14
            java.lang.Object r1 = r2.next()
            X.5Hc r1 = (X.AnonymousClass5Hc) r1
            java.lang.String r1 = r1.A04
            r9.add(r1)
            goto L_0x0c02
        L_0x0c14:
            int r1 = r4.A00
            if (r1 != 0) goto L_0x0c58
            r1 = 2131821386(0x7f11034a, float:1.9275514E38)
            java.lang.String r4 = X.C18180wK.A0g(r3, r1)
            r1 = 19
            kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8 r7 = new kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8
            r7.<init>(r3, r1)
        L_0x0c26:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r3.A02
            if (r1 == 0) goto L_0x0c30
            android.view.View r1 = r1.A00
            if (r1 != 0) goto L_0x0c34
            java.lang.String r15 = "primaryActionContainer"
        L_0x0c30:
            X.C04220Ms.A0E(r15)
            throw r0
        L_0x0c34:
            boolean r1 = r1.isEnabled()
            if (r1 != 0) goto L_0x0c42
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r3.A02
            if (r2 == 0) goto L_0x0c30
            r1 = 1
            r2.setPrimaryButtonEnabled(r1)
        L_0x0c42:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r3.A02
            if (r1 == 0) goto L_0x0c30
            r1.setPrimaryActionText(r4)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r3.A02
            if (r1 == 0) goto L_0x0c30
            r0 = 27
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r7, r0)
            r1.setPrimaryActionOnClickListener(r0)
            goto L_0x0017
        L_0x0c58:
            if (r6 != 0) goto L_0x0c5f
            X.AnonymousClass5xa.A01(r3)
            goto L_0x0017
        L_0x0c5f:
            boolean r2 = r6.A03
            r1 = 2131821386(0x7f11034a, float:1.9275514E38)
            if (r2 == 0) goto L_0x0c69
            r1 = 2131835477(0x7f113a55, float:1.9304094E38)
        L_0x0c69:
            java.lang.String r4 = X.C18180wK.A0g(r3, r1)
            r8 = 7
            kotlin.jvm.internal.KtLambdaShape4S0400000_I2 r7 = new kotlin.jvm.internal.KtLambdaShape4S0400000_I2
            r10 = r6
            r11 = r5
            r12 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0c26
        L_0x0c77:
            java.lang.Object r2 = r1.A01
            X.5xa r2 = (X.AnonymousClass5xa) r2
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A04
            if (r1 == 0) goto L_0x13c7
            X.69F r0 = X.AnonymousClass69F.LOADING
            r1.setLoadingStatus(r0)
            X.AnonymousClass5xa.A01(r2)
            X.21l r1 = X.C304721l.LOADED
            java.util.List r0 = r2.A05
            r2.updateUi(r1, r0)
            goto L_0x0017
        L_0x0c90:
            java.lang.Object r6 = X.C86164wN.A0Z(r2, r1)
            X.4qz r6 = (X.C83224qz) r6
            java.lang.Object r5 = r1.A01
            X.5xa r5 = (X.AnonymousClass5xa) r5
            X.0Oa r4 = r5.A07
            java.lang.Object r0 = r4.getValue()
            X.57r r0 = (X.C883457r) r0
            X.4tk r2 = r0.A04
            r3 = 0
            r1 = 25
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r0.<init>(r5, r3, r1)
            X.C18230wP.A1T(r0, r6, r2)
            java.lang.Object r0 = r4.getValue()
            X.57r r0 = (X.C883457r) r0
            X.4wG r2 = r0.A06
            r1 = 26
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r0.<init>(r5, r3, r1)
            X.C18230wP.A1T(r0, r6, r2)
            goto L_0x0017
        L_0x0cc3:
            java.lang.Object r6 = X.C86164wN.A0Z(r2, r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r6
            java.lang.Object r5 = r1.A01
            X.5us r5 = (X.C94415us) r5
            X.21l r4 = X.C304721l.LOADED
            java.lang.Object r0 = r6.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0cdb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0cf0
            java.lang.Object r1 = r2.next()
            com.instagram.common.gallery.GalleryItem r1 = (com.instagram.common.gallery.GalleryItem) r1
            X.7sn r0 = new X.7sn
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0cdb
        L_0x0cf0:
            r5.updateUi(r4, r3)
            java.lang.Object r0 = r6.A01
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            r5.A00 = r0
            goto L_0x0017
        L_0x0cfb:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r3 = r1.A01
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0d38
            java.lang.Object r2 = r1.A00
            X.6jQ r2 = (X.C109076jQ) r2
            X.1jB r3 = (X.AnonymousClass1jB) r3
            java.lang.Object r1 = r3.A00
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.01V r4 = r2.A02
            int r3 = r2.A00
            boolean r0 = r1 instanceof X.C94445uv
            if (r0 == 0) goto L_0x0d26
            java.lang.String r1 = "http_error"
        L_0x0d1c:
            r2 = 17635885(0x10d1a2d, float:2.591639E-38)
            java.lang.String r0 = "failure_reason"
            r4.markerAnnotate((int) r2, (int) r3, (java.lang.String) r0, (java.lang.String) r1)
            goto L_0x0ea5
        L_0x0d26:
            boolean r0 = r1 instanceof X.C94435uu
            if (r0 == 0) goto L_0x0d2d
            java.lang.String r1 = "exception"
            goto L_0x0d1c
        L_0x0d2d:
            boolean r0 = r1 instanceof X.C94425ut
            if (r0 == 0) goto L_0x13cb
            r0 = 189(0xbd, float:2.65E-43)
            java.lang.String r1 = X.C28174Ezk.A00(r0)
            goto L_0x0d1c
        L_0x0d38:
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0017
            java.lang.Object r5 = r1.A00
            X.6jQ r5 = (X.C109076jQ) r5
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r0 = r3.A00
            X.6jP r0 = (X.C109066jP) r0
            java.lang.Integer r0 = r0.A01
            r4 = 17635885(0x10d1a2d, float:2.591639E-38)
            if (r0 == 0) goto L_0x0d65
            X.01V r3 = r5.A02
            int r2 = r5.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0d72
            r0 = 1
            if (r1 == r0) goto L_0x0d6f
            r0 = 2
            if (r1 != r0) goto L_0x13d0
            java.lang.String r1 = "expired_db"
        L_0x0d60:
            java.lang.String r0 = "cache_type"
            r3.markerAnnotate((int) r4, (int) r2, (java.lang.String) r0, (java.lang.String) r1)
        L_0x0d65:
            X.01V r2 = r5.A02
            int r1 = r5.A00
            r0 = 2
            r2.markerEnd(r4, r1, r0)
            goto L_0x0017
        L_0x0d6f:
            java.lang.String r1 = "db"
            goto L_0x0d60
        L_0x0d72:
            java.lang.String r1 = "http"
            goto L_0x0d60
        L_0x0d75:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r0 = r1.A01
            boolean r0 = r0 instanceof X.AnonymousClass1jA
            java.lang.Object r5 = r1.A00
            X.3Sa r5 = (X.C61133Sa) r5
            X.01V r4 = X.AnonymousClass01V.A0p
            int r3 = X.C61133Sa.A00(r5)
            r2 = 17640585(0x10d2c89, float:2.5929562E-38)
            if (r0 != 0) goto L_0x0ecb
            java.lang.String r1 = "failure_reason"
            r0 = 484(0x1e4, float:6.78E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r4.markerAnnotate((int) r2, (int) r3, (java.lang.String) r1, (java.lang.String) r0)
            int r1 = X.C61133Sa.A00(r5)
            r0 = 3
            r4.markerEnd(r2, r1, r0)
            goto L_0x0017
        L_0x0da0:
            java.lang.Object r5 = X.C86164wN.A0Z(r2, r1)
            X.3b6 r5 = (X.C62903b6) r5
            java.lang.Object r4 = r1.A01
            X.F6w r4 = (X.F6w) r4
            X.GJr r1 = r4.A03
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A06
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0dc5
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A05
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0dc5
            X.Gdr r3 = r1.A02
            long r1 = r1.A00
            java.lang.String r0 = "gallery_content_fetched"
            r3.A07(r1, r0)
        L_0x0dc5:
            r0 = 1
            X.F6w.A01(r4, r5, r0)
            goto L_0x0017
        L_0x0dcb:
            java.lang.Object r2 = X.C86164wN.A0Z(r2, r1)
            X.3b6 r2 = (X.C62903b6) r2
            java.lang.Object r1 = r1.A01
            X.F6w r1 = (X.F6w) r1
            r0 = 0
            X.F6w.A01(r1, r2, r0)
            goto L_0x0017
        L_0x0ddb:
            java.lang.Object r5 = X.C86164wN.A0Z(r2, r1)
            X.3b6 r5 = (X.C62903b6) r5
            boolean r0 = r5 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0e0f
            java.lang.Object r4 = r1.A01
            X.F70 r4 = (X.F70) r4
            X.6lc r1 = r4.A0C
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0e00
            X.Gdr r3 = r1.A01
            java.util.concurrent.atomic.AtomicLong r0 = r1.A03
            long r1 = r0.get()
            java.lang.String r0 = "categories_fetch_succeeded"
            r3.A07(r1, r0)
        L_0x0e00:
            X.1jA r5 = (X.AnonymousClass1jA) r5
            java.lang.Object r0 = r5.A00
            X.6jP r0 = (X.C109066jP) r0
            java.util.List r0 = r0.A02
            r4.A07 = r0
            X.F70.A00(r4)
            goto L_0x0017
        L_0x0e0f:
            boolean r0 = r5 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0017
            java.lang.Object r6 = r1.A01
            X.F70 r6 = (X.F70) r6
            X.6lc r2 = r6.A0C
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x0e36
            java.util.concurrent.atomic.AtomicLong r5 = r2.A03
            X.Gdr r4 = r2.A01
            r3 = 17638221(0x10d234d, float:2.5922937E-38)
            long r1 = r5.get()
            java.lang.String r0 = "categories_fetch_failed"
            long r0 = r4.A05(r0, r1, r3)
            r5.set(r0)
        L_0x0e36:
            X.F6n r1 = r6.A0E
            r0 = 2131831662(0x7f112b6e, float:1.9296356E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0H(r0)
            goto L_0x0017
        L_0x0e44:
            java.lang.Object r4 = X.C86164wN.A0Z(r2, r1)
            X.784 r4 = (X.AnonymousClass784) r4
            java.lang.Object r0 = r1.A01
            X.5He r0 = (X.AnonymousClass5He) r0
            long r9 = r0.A00
            X.01V r5 = X.AnonymousClass01V.A0p
            int r0 = X.AnonymousClass784.A00(r4)
            r6 = 17631244(0x10d080c, float:2.5903383E-38)
            r5.markerStart((int) r6, (int) r0)
            int r2 = X.AnonymousClass784.A00(r4)
            X.Dn3 r3 = r4.A01
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "product_id"
            r5.markerAnnotate((int) r6, (int) r2, (java.lang.String) r0, (java.lang.String) r1)
            int r2 = X.AnonymousClass784.A00(r4)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "category_id"
            r5.markerAnnotate((int) r6, (int) r2, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r2 = r4.A02
            if (r2 == 0) goto L_0x0e81
            int r1 = X.AnonymousClass784.A00(r4)
            java.lang.String r0 = "cursor"
            r5.markerAnnotate((int) r6, (int) r1, (java.lang.String) r0, (java.lang.String) r2)
        L_0x0e81:
            int r7 = X.AnonymousClass784.A00(r4)
            java.lang.String r8 = "request_cache_ttl"
            r5.markerAnnotate((int) r6, (int) r7, (java.lang.String) r8, (long) r9)
            goto L_0x0017
        L_0x0e8c:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r3 = r1.A01
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0eab
            java.lang.Object r0 = r1.A00
            X.6hA r0 = (X.C107696hA) r0
            X.01V r4 = X.AnonymousClass01V.A0p
            X.C04220Ms.A06(r4)
            int r3 = r0.A00
            r2 = 17631975(0x10d0ae7, float:2.5905432E-38)
        L_0x0ea5:
            r0 = 3
        L_0x0ea6:
            r4.markerEnd(r2, r3, r0)
            goto L_0x0017
        L_0x0eab:
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0017
            java.lang.Object r2 = r1.A00
            X.6hA r2 = (X.C107696hA) r2
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r0 = r3.A00
            X.6s5 r0 = (X.C113756s5) r0
            java.lang.Object r0 = r0.A00
            int r1 = X.C86144wL.A08(r0)
            X.01V r4 = X.AnonymousClass01V.A0p
            int r3 = r2.A00
            r2 = 17631975(0x10d0ae7, float:2.5905432E-38)
            java.lang.String r0 = "effects_count"
            r4.markerAnnotate((int) r2, (int) r3, (java.lang.String) r0, (int) r1)
        L_0x0ecb:
            r0 = 2
            goto L_0x0ea6
        L_0x0ecd:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r5 = r1.A01
            X.FOV r5 = (X.FOV) r5
            java.lang.Object r4 = r1.A00
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = X.GZ5.A00(r0)
            X.C04220Ms.A06(r1)
            com.instagram.service.session.UserSession r0 = r5.A04()
            java.lang.String r3 = X.C63253h7.A03(r0, r1)
            X.C04220Ms.A06(r3)
            android.content.Context r1 = r5.requireContext()
            r0 = 0
            java.lang.String r2 = X.C63253h7.A02(r1, r0)
            X.C04220Ms.A06(r2)
            com.instagram.service.session.UserSession r1 = r5.A04()
            r0 = 0
            java.io.File r1 = X.C31128GgN.A01(r4, r1, r2, r3, r0)
            X.81O r0 = new X.81O
            r0.<init>(r5, r1)
            X.C30965GcO.A00(r0)
            goto L_0x0017
        L_0x0f0d:
            java.lang.Object r3 = X.C86164wN.A0Z(r2, r1)
            X.7rW r3 = (X.C131167rW) r3
            java.lang.Object r0 = r1.A01
            X.58C r0 = (X.AnonymousClass58C) r0
            X.4wE r2 = r0.A04
        L_0x0f19:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1400000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1400000_I2) r4
            r5 = 0
            java.lang.String r8 = r3.A00
            r10 = 15
            r6 = r5
            r7 = r5
            r9 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1400000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1400000_I2.A00(r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0f19
            goto L_0x0017
        L_0x0f34:
            X.AnonymousClass0OU.A00(r2)
            java.lang.Object r2 = r1.A01
            X.3I1 r2 = (X.AnonymousClass3I1) r2
            java.lang.Object r0 = r1.A00
            X.8wA r0 = (X.C150388wA) r0
            r0.A04(r2)
            goto L_0x0017
        L_0x0f44:
            java.lang.Object r2 = X.C86164wN.A0Z(r2, r1)
            X.6Lm r2 = (X.C99976Lm) r2
            boolean r0 = r2 instanceof X.AnonymousClass5vI
            if (r0 == 0) goto L_0x0f59
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            r0.onBackPressed()
            goto L_0x0017
        L_0x0f59:
            boolean r0 = r2 instanceof X.AnonymousClass5vG
            r5 = 1
            java.lang.String r9 = "Required value was null."
            r13 = 0
            if (r0 == 0) goto L_0x1070
            X.5vG r2 = (X.AnonymousClass5vG) r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r0 = r2.A00
            java.lang.Object r4 = r0.A01
            X.98i r4 = (X.C1535598i) r4
            java.lang.Object r3 = r0.A02
            com.instagram.api.schemas.TrackData r3 = (com.instagram.api.schemas.TrackData) r3
            java.lang.Object r5 = r0.A00
            X.9A0 r5 = (X.AnonymousClass9A0) r5
            if (r4 == 0) goto L_0x0fd2
            X.B7d r5 = new X.B7d
            r5.<init>(r4)
            java.lang.Object r0 = r1.A01
            android.content.Context r0 = X.C18220wO.A0A(r0)
            com.instagram.music.common.config.MusicAttributionConfig r14 = r5.Bgk(r0)
        L_0x0f82:
            X.AhJ r0 = X.AnonymousClass3LM.A01()
            X.9QX r0 = (X.AnonymousClass9QX) r0
            X.AhA r6 = r0.A04
            java.lang.Object r5 = r1.A01
            X.5wz r5 = (X.AnonymousClass5wz) r5
            X.0Oa r0 = r5.A00
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            X.9zz r0 = X.C171799zz.A2i
            X.AfR r1 = r6.A04(r0, r1)
            r1.A0D = r14
            if (r4 == 0) goto L_0x0fcb
            java.lang.String r0 = r4.A0B
        L_0x0fa0:
            r1.A0J = r0
            java.util.UUID r0 = r2.A01
            java.lang.String r0 = r0.toString()
            r1.A0W = r0
            X.0Oa r0 = r5.A00
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r2 = r1.A00()
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            r0 = 149(0x95, float:2.09E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.3iT r1 = X.C63863iT.A06(r1, r2, r4, r3, r0)
            r0 = 9587(0x2573, float:1.3434E-41)
            r1.A0J(r5, r0)
            goto L_0x0017
        L_0x0fcb:
            if (r3 == 0) goto L_0x13d5
            java.lang.String r0 = r3.A06
            if (r0 == 0) goto L_0x13d5
            goto L_0x0fa0
        L_0x0fd2:
            if (r3 == 0) goto L_0x13da
            java.util.List r0 = r3.A0K
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x1007
            java.util.List r0 = r3.A0K
            java.lang.Object r0 = r0.get(r13)
            int r18 = X.AnonymousClass0wJ.A04(r0)
        L_0x0fe6:
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = r3.A0K
            java.util.Iterator r8 = r0.iterator()
        L_0x0ff0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x100a
            java.lang.Object r0 = r8.next()
            int r6 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            r7.add(r0)
            goto L_0x0ff0
        L_0x1007:
            r18 = 0
            goto L_0x0fe6
        L_0x100a:
            X.AfN r6 = new X.AfN
            r6.<init>()
            java.lang.String r0 = r3.A0B
            r6.A09 = r0
            java.lang.String r0 = r3.A06
            r6.A06 = r0
            java.lang.String r0 = r3.A0D
            r6.A0C = r0
            java.lang.String r0 = r3.A08
            r6.A07 = r0
            java.lang.String r0 = r3.A09
            r6.A08 = r0
            r6.A0E = r7
            r6.A08 = r0
            java.lang.String r0 = r3.A04
            r6.A05 = r0
            java.lang.String r0 = r3.A0H
            r6.A0D = r0
            com.instagram.common.typedurl.ImageUrl r0 = r3.A01
            r6.A02 = r0
            com.instagram.common.typedurl.ImageUrl r0 = r3.A00
            r6.A03 = r0
            boolean r0 = r3.A0M
            r6.A0I = r0
            r6.A0K = r13
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L_0x1047
            int r0 = r0.intValue()
            r6.A00 = r0
        L_0x1047:
            java.lang.Boolean r0 = r3.A02
            if (r0 == 0) goto L_0x1051
            boolean r0 = r0.booleanValue()
            r6.A0H = r0
        L_0x1051:
            com.instagram.music.common.model.MusicAssetModel r15 = r6.A00()
            r16 = 0
            if (r5 == 0) goto L_0x1061
            boolean r0 = r5.AQN()
            r21 = 1
            if (r0 != 0) goto L_0x1063
        L_0x1061:
            r21 = 0
        L_0x1063:
            com.instagram.music.common.config.MusicAttributionConfig r14 = new com.instagram.music.common.config.MusicAttributionConfig
            r17 = r16
            r19 = r13
            r20 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0f82
        L_0x1070:
            boolean r0 = r2 instanceof X.AnonymousClass5vH
            if (r0 == 0) goto L_0x0017
            X.5vH r2 = (X.AnonymousClass5vH) r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r4 = r2.A02
            java.lang.Object r0 = r4.A01
            X.98i r0 = (X.C1535598i) r0
            java.lang.Object r3 = r4.A02
            com.instagram.api.schemas.TrackData r3 = (com.instagram.api.schemas.TrackData) r3
            if (r0 == 0) goto L_0x10d0
            X.B7d r4 = new X.B7d
            r4.<init>(r0)
            java.lang.Object r0 = r1.A01
            android.content.Context r3 = X.C18220wO.A0A(r0)
            r5 = 0
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r14 = r13
            com.instagram.clips.model.metadata.AudioPageMetadata r6 = X.C19478Ax1.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x109a:
            java.lang.Object r5 = r1.A01
            X.5wz r5 = (X.AnonymousClass5wz) r5
            X.0Oa r0 = r5.A00
            X.0i6 r9 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r10 = com.instagram.modal.ModalActivity.class
            X.AhJ r0 = X.AnonymousClass3LM.A01()
            X.9QX r0 = (X.AnonymousClass9QX) r0
            X.AhA r4 = r0.A04
            X.9zv r3 = r2.A01
            java.util.UUID r0 = r2.A03
            java.lang.String r1 = X.C18190wL.A0n(r0)
            X.9zw r0 = r2.A00
            android.os.Bundle r8 = r4.A01(r0, r3, r6, r1)
            androidx.fragment.app.FragmentActivity r7 = r5.getActivity()
            java.lang.String r11 = "audio_page"
            X.3iT r6 = new X.3iT
            r6.<init>(r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            r6.A0I(r0)
            goto L_0x0017
        L_0x10d0:
            if (r3 == 0) goto L_0x13df
            java.lang.Object r0 = r4.A00
            X.9A0 r0 = (X.AnonymousClass9A0) r0
            if (r0 == 0) goto L_0x10e3
            boolean r0 = r0.BRt()
            if (r0 == 0) goto L_0x10e3
        L_0x10de:
            com.instagram.clips.model.metadata.AudioPageMetadata r6 = X.C19478Ax1.A01(r3, r5)
            goto L_0x109a
        L_0x10e3:
            r5 = 0
            goto L_0x10de
        L_0x10e5:
            java.lang.Object r4 = X.C86164wN.A0Z(r2, r1)
            X.5z2 r4 = (X.AnonymousClass5z2) r4
            java.lang.Object r5 = r1.A01
            X.57j r5 = (X.C882657j) r5
            X.6hG r1 = r5.A01
            X.9zw r3 = X.C171769zw.A0M
            com.instagram.service.session.UserSession r0 = r1.A01
            X.0kW r2 = r1.A00
            X.0nS r1 = X.C13330nS.A01(r2, r0)
            java.lang.String r0 = "instagram_music_playlist_page_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1854(0x73e, float:2.598E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "action_source"
            r1.A0O(r3, r0)
            X.C18240wQ.A14(r1, r2)
            r1.Bb4()
            X.4wE r1 = r5.A06
            X.69F r0 = X.AnonymousClass69F.SUCCESS
            r1.CrC(r0)
            java.lang.Object r0 = r4.A00
            X.4vm r0 = (X.C85794vm) r0
            java.lang.Object r0 = r0.D7H()
            X.C04220Ms.A06(r0)
            X.39f r0 = (X.C569639f) r0
            java.util.List r0 = r0.A01
            X.3I1 r4 = new X.3I1
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x1131:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1148
            java.lang.Object r2 = r3.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r2
            X.0kW r1 = r5.A03
            X.7sy r0 = new X.7sy
            r0.<init>(r2, r1)
            r4.A01(r0)
            goto L_0x1131
        L_0x1148:
            X.4wE r0 = r5.A07
            r0.CrC(r4)
            goto L_0x0017
        L_0x114f:
            java.lang.Object r0 = X.C86164wN.A0Z(r2, r1)
            boolean r0 = r0 instanceof X.AnonymousClass5vJ
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.A01
            X.5wj r0 = (X.C94775wj) r0
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            X.0Oa r0 = r0.A00
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Drz r2 = X.C18180wK.A0Q(r1, r0)
            r1 = 0
            r0 = 0
            r2.A0D(r1, r0)
            goto L_0x0017
        L_0x1170:
            java.lang.Object r0 = X.C86164wN.A0Z(r2, r1)
            X.5z2 r0 = (X.AnonymousClass5z2) r0
            java.lang.Object r1 = r1.A01
            X.580 r1 = (X.AnonymousClass580) r1
            java.lang.Object r0 = r0.A00
            X.4vm r0 = (X.C85794vm) r0
            java.lang.Object r0 = r0.D7H()
            X.6dB r0 = (X.C105286dB) r0
            java.util.List r0 = r0.A00
            r1.A01(r0)
            goto L_0x0017
        L_0x118b:
            java.lang.Object r2 = X.C86164wN.A0Z(r2, r1)
            X.6Lo r2 = (X.C99996Lo) r2
            boolean r0 = r2 instanceof X.AnonymousClass5vN
            if (r0 == 0) goto L_0x11c1
            java.lang.Object r0 = r1.A01
            X.1Zy r0 = (X.C22811Zy) r0
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            X.0Oa r0 = r0.A0A
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.DaC r0 = X.C24798DaC.A01
            if (r0 != 0) goto L_0x11b2
            java.lang.String r0 = "plugin"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x11b2:
            r0.A00()
            X.1bO r0 = new X.1bO
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            goto L_0x0017
        L_0x11c1:
            boolean r0 = r2 instanceof X.AnonymousClass5vO
            if (r0 == 0) goto L_0x11ee
            java.lang.Object r3 = r1.A01
            X.1Zy r3 = (X.C22811Zy) r3
            X.0Oa r0 = r3.A0A
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.3Iu r2 = new X.3Iu
            r2.<init>(r0)
            r1 = 2131821526(0x7f1103d6, float:1.9275798E38)
            r0 = 35
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r3, r0)
            r2.A03(r0, r1)
            X.3ag r1 = new X.3ag
            r1.<init>(r2)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            r1.A02(r0)
            goto L_0x0017
        L_0x11ee:
            boolean r0 = r2 instanceof X.AnonymousClass5vK
            if (r0 == 0) goto L_0x1227
            java.lang.Object r4 = r1.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            X.Dsm r3 = X.AnonymousClass0wJ.A0V(r4)
            r0 = 2131821528(0x7f1103d8, float:1.9275802E38)
            r3.A0L(r0)
            r1 = 2131821527(0x7f1103d7, float:1.92758E38)
            X.5vK r2 = (X.AnonymousClass5vK) r2
            java.lang.String r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r4, r0, r1)
            r3.A0p(r0)
            r2 = 2131834607(0x7f1136ef, float:1.930233E38)
            r1 = 5
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape217S0100000_1_I2
            r0.<init>((java.lang.Object) r4, (int) r1)
            r3.A0O(r0, r2)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            X.7Lm r0 = X.AnonymousClass7Lm.A00
            r3.A0P(r0, r1)
            X.AnonymousClass0wJ.A1K(r3)
            goto L_0x0017
        L_0x1227:
            boolean r0 = r2 instanceof X.AnonymousClass5vL
            if (r0 == 0) goto L_0x123c
            java.lang.Object r0 = r1.A01
            android.content.Context r3 = X.C18220wO.A0A(r0)
            X.5vL r2 = (X.AnonymousClass5vL) r2
            int r2 = r2.A00
            r1 = 0
            r0 = 0
            X.C63813iO.A03(r3, r1, r2, r0)
            goto L_0x0017
        L_0x123c:
            boolean r0 = r2 instanceof X.AnonymousClass5vM
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            r0.finish()
            goto L_0x0017
        L_0x124b:
            java.lang.Object r3 = X.C86164wN.A0Z(r2, r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2) r3
            if (r3 == 0) goto L_0x0017
            java.lang.Object r2 = r1.A01
            X.1Zy r2 = (X.C22811Zy) r2
            X.0Oa r0 = r2.A02
            java.lang.Object r1 = r0.getValue()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            java.lang.String r0 = r3.A02
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C18250wR.A0K(r0)
            r1.setUrl(r0, r2)
            X.0Oa r0 = r2.A00
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.A01
            r1.setText(r0)
            goto L_0x0017
        L_0x1277:
            java.lang.Object r4 = X.C86164wN.A0Z(r2, r1)
            X.4qz r4 = (X.C83224qz) r4
            r3 = 0
            java.lang.Object r2 = r1.A01
            r0 = 12
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r0 = X.C86164wN.A0o(r2, r3, r0)
            r1 = 3
            X.C25237DiI.A00(r3, r3, r0, r4, r1)
            r0 = 13
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r0 = X.C86164wN.A0o(r2, r3, r0)
            X.C25237DiI.A00(r3, r3, r0, r4, r1)
            r0 = 14
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r0 = X.C86164wN.A0o(r2, r3, r0)
            X.8sG r0 = X.C25237DiI.A00(r3, r3, r0, r4, r1)
            return r0
        L_0x129e:
            java.lang.Object r3 = X.C86164wN.A0Z(r2, r1)
            X.4qz r3 = (X.C83224qz) r3
            r2 = 0
            java.lang.Object r1 = r1.A01
            r0 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r1, r2, r0)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r2, r2, r1, r3, r0)
            return r0
        L_0x12b3:
            java.lang.Object r4 = X.C86164wN.A0Z(r2, r1)
            X.79h r4 = (X.C1202279h) r4
            int r0 = r4.A03
            int r3 = -r0
            java.lang.Object r0 = r1.A01
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            androidx.paging.PagingConfig r0 = r0.A02
            int r2 = r0.A01
            if (r3 > r2) goto L_0x12cc
            int r0 = r4.A02
            int r1 = -r0
            r0 = 0
            if (r1 <= r2) goto L_0x12cd
        L_0x12cc:
            r0 = 1
        L_0x12cd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x12d2:
            java.lang.Object r0 = X.C86164wN.A0Z(r2, r1)
            X.4vm r0 = (X.C85794vm) r0
            java.lang.Object r6 = r0.D7H()
            X.C04220Ms.A06(r6)
            X.39Y r6 = (X.AnonymousClass39Y) r6
            int r4 = r6.A00
            java.util.List r0 = r6.A02
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x12ed:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1311
            java.lang.Object r2 = r5.next()
            X.5HW r2 = (X.AnonymousClass5HW) r2
            long r0 = r2.A01
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r9 = r2.A00
            java.lang.String r10 = r2.A04
            java.lang.String r11 = r2.A03
            java.lang.String r12 = r2.A02
            r13 = 1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4001000_I2 r7 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4001000_I2
            r7.<init>((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13)
            r3.add(r7)
            goto L_0x12ed
        L_0x1311:
            com.instagram.api.schemas.ContentAppreciationDisclaimerType r1 = r6.A01
            com.instagram.api.schemas.ContentAppreciationDisclaimerType r0 = com.instagram.api.schemas.ContentAppreciationDisclaimerType.PAYOUT
            if (r1 != r0) goto L_0x131f
            X.20f r1 = X.C302320f.ELIGIBLE_FOR_PAYOUT
        L_0x1319:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2
            r0.<init>((X.C302320f) r1, (java.util.List) r3, (int) r4)
            return r0
        L_0x131f:
            X.20f r1 = X.C302320f.INELIGIBLE_FOR_PAYOUT
            goto L_0x1319
        L_0x1322:
            java.lang.Object r0 = X.C86164wN.A0Z(r2, r1)
            X.5z0 r0 = (X.AnonymousClass5z0) r0
            java.lang.Object r7 = r1.A01
            X.6h9 r7 = (X.C107686h9) r7
            java.lang.Object r0 = r0.A01
            X.8qB r0 = (X.C147938qB) r0
            if (r0 == 0) goto L_0x1365
            X.8qw r6 = r0.AYY()
        L_0x1336:
            r5 = 0
            if (r6 == 0) goto L_0x1367
            com.google.common.collect.ImmutableList r0 = r6.Axf()
            if (r0 == 0) goto L_0x1367
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r3 = r0.iterator()
        L_0x1347:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x136b
            java.lang.Object r0 = r3.next()
            X.8qA r0 = (X.C147928qA) r0
            X.GgT r2 = r7.A00
            X.Hz1 r1 = r0.A9M()
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A06(r1, r0)
            if (r0 == 0) goto L_0x1347
            r4.add(r0)
            goto L_0x1347
        L_0x1365:
            r6 = 0
            goto L_0x1336
        L_0x1367:
            X.0ZV r4 = X.AnonymousClass0ZV.A00
            if (r6 == 0) goto L_0x1385
        L_0x136b:
            X.8qv r0 = r6.Azr()
            if (r0 == 0) goto L_0x1385
            boolean r1 = r0.Am0()
        L_0x1375:
            X.8qv r0 = r6.Azr()
            if (r0 == 0) goto L_0x137f
            java.lang.String r5 = r0.Afk()
        L_0x137f:
            X.6s5 r0 = new X.6s5
            r0.<init>(r4, r5, r1)
            return r0
        L_0x1385:
            r1 = 0
            if (r6 == 0) goto L_0x137f
            goto L_0x1375
        L_0x1389:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            return r0
        L_0x138c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x1391:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x1396:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x139b:
            X.C04220Ms.A0E(r6)
            throw r0
        L_0x139f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x13a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x13a9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x13ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x13b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x13b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x13bd:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x13c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x13c7:
            X.C04220Ms.A0E(r4)
            throw r0
        L_0x13cb:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x13d0:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x13d5:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x13da:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x13df:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape5S0200000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape5S0200000_I2(Object obj, C146958n9 r3, int i, int i2) {
        super(2, r3);
        this.A02 = i;
        this.A00 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape5S0200000_I2(Object obj, Object obj2, C146958n9 r4, int i) {
        super(2, r4);
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }
}
