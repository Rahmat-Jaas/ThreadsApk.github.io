package com.facebook.redex;

import X.AnonymousClass0MJ;
import X.AnonymousClass601;
import X.C109326jp;
import X.C121207Et;
import X.C143158gC;
import X.C880756q;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.fbpay.logging.LoggingContext;

public class IDxObserverShape55S0300000_2_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxObserverShape55S0300000_2_I2(AnonymousClass601 r1, C109326jp r2, C109326jp r3, int i) {
        this.A03 = i;
        switch (i) {
            case 28:
                this.A00 = r1;
                this.A02 = r2;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case 30:
                this.A02 = r2;
                this.A00 = r1;
                break;
            default:
                this.A00 = r1;
                this.A01 = r2;
                this.A02 = r3;
                break;
        }
        this.A01 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.5ga} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.5ge} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.5gb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.5gc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: X.5ga} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: X.5ga} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: X.5ga} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v61, resolved type: X.5ga} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0372, code lost:
        if (X.C86114wI.A1Z(X.C92885kB.A01, X.C117026y0.A00(r3.A02)) == false) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03ba, code lost:
        X.AnonymousClass7Kr.A0C(r3, r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x052e, code lost:
        r4.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0531, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0579, code lost:
        r4 = new com.facebookpay.common.models.ErrorDialogContent(X.C973368y.A04, (X.C973368y) null, (X.C108816iz) null, (X.C108816iz) null, 2131826362, 2131826361, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0595, code lost:
        r3 = (androidx.fragment.app.FragmentActivity) r2.A01;
        X.AnonymousClass77R.A00(r3, X.C117016xz.A01((android.graphics.drawable.Drawable) null, r4.A00(), (X.AnonymousClass67N) null, (X.C142188eA) null, new com.facebook.redex.IDxPDismissShape737S0100000_2_I2((X.AnonymousClass0ZU) r2.A00, 0), java.lang.Boolean.valueOf(r4.A06()), r4.A05(r3), r4.A02(r3), r4.A03(r3), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 2131826365), X.AnonymousClass7Kz.A0M());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05ec, code lost:
        X.C18240wQ.A1G(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0616, code lost:
        if (r4 != null) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0678, code lost:
        r1 = X.C86154wM.A15(r2, r5, r3, r1);
        r5 = X.C78224i5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0680, code lost:
        if ((r4 instanceof X.C92875kA) == false) goto L_0x06e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0682, code lost:
        r2 = X.AnonymousClass7Fb.A00((X.C92875kA) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0688, code lost:
        r4 = (com.facebookpay.common.models.ErrorDialogContent) r2.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x068e, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0690, code lost:
        r3 = X.AnonymousClass7Kz.A0M();
        r6 = X.AnonymousClass7Kz.A0G().A04(r0, 46, 41);
        r12 = r4.A05(r0);
        r13 = r4.A02(r0);
        r14 = r4.A03(r0);
        r7 = r4.A00();
        r11 = java.lang.Boolean.valueOf(r4.A06());
        r2 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06bd, code lost:
        if (r2 == null) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x06bf, code lost:
        r15 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06c1, code lost:
        r16 = r4.A04(r0);
        r8 = r4.A01();
        r2 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06cb, code lost:
        if (r2 == null) goto L_0x06e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x06cd, code lost:
        r2 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x06cf, code lost:
        X.AnonymousClass77R.A00(r0, X.C117016xz.A01(r6, r7, r8, new com.facebook.redex.IDxONavigationShape640S0100000_2_I2(r5, 5), new com.facebook.redex.IDxPDismissShape737S0100000_2_I2(r1, 3), r11, r12, r13, r14, r15, r16, r2, 2131826365), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06e5, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06e7, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06e9, code lost:
        r2 = new X.AnonymousClass7JD(new com.facebookpay.common.models.ErrorDialogContent(X.C973368y.A03, (X.C973368y) null, (X.C108816iz) null, (X.C108816iz) null, 2131826475, 2131826474, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        r0 = (X.C121207Et) r2.A00;
        r8 = r0.A08;
        r0 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        if (r0 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        r7 = X.AnonymousClass7DP.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        r4 = new kotlin.jvm.internal.KtLambdaShape4S1300000_I2(r5, r6, r7, r8, X.C18200wM.A02(0, r5, r6));
        r9 = new kotlin.jvm.internal.KtLambdaShape3S1300000_I2((java.lang.Object) r6, (java.lang.Object) r5, (java.lang.Object) r7, r8, 27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0867, code lost:
        X.C04220Ms.A0E(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00eb, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x086a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012c, code lost:
        X.C63913ic.A0K(r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014c, code lost:
        r1 = (X.C109326jp) r1;
        r0 = new java.lang.Object[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        r3.A0H(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0167, code lost:
        r1 = r4.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016b, code lost:
        X.C61043Rr.A00((X.AnonymousClass601) r2.A00, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0172, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:413:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r20) {
        /*
            r19 = this;
            r2 = r19
            r3 = r20
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x070d;
                case 1: goto L_0x0662;
                case 2: goto L_0x064b;
                case 3: goto L_0x0634;
                case 4: goto L_0x061d;
                case 5: goto L_0x009d;
                case 6: goto L_0x0552;
                case 7: goto L_0x05d2;
                case 8: goto L_0x0009;
                case 9: goto L_0x0009;
                case 10: goto L_0x03c9;
                case 11: goto L_0x0387;
                case 12: goto L_0x0850;
                case 13: goto L_0x07a3;
                case 14: goto L_0x0073;
                case 15: goto L_0x0318;
                case 16: goto L_0x02e1;
                case 17: goto L_0x0049;
                case 18: goto L_0x04ed;
                case 19: goto L_0x026b;
                case 20: goto L_0x078e;
                case 21: goto L_0x075f;
                case 22: goto L_0x0248;
                case 23: goto L_0x073b;
                case 24: goto L_0x021b;
                case 25: goto L_0x01f9;
                case 26: goto L_0x01d7;
                case 27: goto L_0x019a;
                case 28: goto L_0x013d;
                case 29: goto L_0x0151;
                case 30: goto L_0x002b;
                case 31: goto L_0x010f;
                case 32: goto L_0x00ed;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = X.AnonymousClass7JD.A00(r3)
            r0 = 1
            boolean r0 = X.C18190wL.A1Z(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r2.A02
            X.57i r0 = (X.C882557i) r0
            X.56r r3 = r0.A06
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r2.A01
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            X.7JD r5 = new X.7JD
            r5.<init>(r0)
        L_0x0027:
            r3.A0H(r5)
        L_0x002a:
            return
        L_0x002b:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r3)
            java.lang.Object r5 = r2.A02
            X.6jp r5 = (X.C109326jp) r5
            X.3VO r4 = X.C86124wJ.A0d(r0)
            goto L_0x0167
        L_0x0041:
            java.lang.Object r5 = r2.A01
            X.6jp r5 = (X.C109326jp) r5
            X.3iY r1 = X.C63893iY.A01
            goto L_0x016b
        L_0x0049:
            X.7Kx r3 = X.C86104wH.A0S(r3)
            boolean r0 = X.AnonymousClass7Kx.A0P(r3)
            if (r0 != 0) goto L_0x006c
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r2.A00
            X.7Et r0 = (X.C121207Et) r0
            java.lang.String r0 = r0.A08
            boolean r0 = X.AnonymousClass6I5.A00(r0)
            if (r0 != 0) goto L_0x006c
        L_0x0065:
            java.lang.Object r0 = r2.A02
            X.M5J r0 = (X.M5J) r0
            r0.A0H(r3)
        L_0x006c:
            java.lang.Object r5 = r2.A01
            com.fbpay.logging.LoggingContext r5 = (com.fbpay.logging.LoggingContext) r5
            X.69P r6 = X.AnonymousClass69P.SHIPPING_ADDRESS
            goto L_0x00c6
        L_0x0073:
            X.7Kx r3 = X.C86104wH.A0S(r3)
            boolean r0 = X.AnonymousClass7Kx.A0P(r3)
            if (r0 != 0) goto L_0x0096
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r2.A00
            X.7Et r0 = (X.C121207Et) r0
            java.lang.String r0 = r0.A08
            boolean r0 = X.AnonymousClass6I5.A00(r0)
            if (r0 != 0) goto L_0x0096
        L_0x008f:
            java.lang.Object r0 = r2.A02
            X.M5J r0 = (X.M5J) r0
            r0.A0H(r3)
        L_0x0096:
            java.lang.Object r5 = r2.A01
            com.fbpay.logging.LoggingContext r5 = (com.fbpay.logging.LoggingContext) r5
            X.69P r6 = X.AnonymousClass69P.PAYMENT_METHOD
            goto L_0x00c6
        L_0x009d:
            X.7Kx r3 = X.C86104wH.A0S(r3)
            boolean r0 = X.AnonymousClass7Kx.A0P(r3)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r2.A00
            X.7Et r0 = (X.C121207Et) r0
            java.lang.String r0 = r0.A08
            boolean r0 = X.AnonymousClass6I5.A00(r0)
            if (r0 != 0) goto L_0x00c0
        L_0x00b9:
            java.lang.Object r0 = r2.A01
            X.M5J r0 = (X.M5J) r0
            r0.A0H(r3)
        L_0x00c0:
            java.lang.Object r5 = r2.A02
            com.fbpay.logging.LoggingContext r5 = (com.fbpay.logging.LoggingContext) r5
            X.69P r6 = X.AnonymousClass69P.CONTACT_INFORMATION
        L_0x00c6:
            java.lang.Object r0 = r2.A00
            X.7Et r0 = (X.C121207Et) r0
            java.lang.String r8 = r0.A08
            com.facebookpay.otc.models.OtcInput r0 = r0.A03
            if (r0 == 0) goto L_0x00eb
            X.7DP r7 = X.AnonymousClass7DP.A00(r0)
        L_0x00d4:
            r0 = 0
            int r9 = X.C18200wM.A02(r0, r5, r6)
            kotlin.jvm.internal.KtLambdaShape4S1300000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape4S1300000_I2
            r4.<init>(r5, r6, r7, r8, r9)
            r14 = 27
            kotlin.jvm.internal.KtLambdaShape3S1300000_I2 r9 = new kotlin.jvm.internal.KtLambdaShape3S1300000_I2
            r10 = r6
            r11 = r5
            r12 = r7
            r13 = r8
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.String) r13, (int) r14)
            goto L_0x03ba
        L_0x00eb:
            r7 = 0
            goto L_0x00d4
        L_0x00ed:
            java.lang.Object r1 = r2.A00
            X.M5J r1 = (X.M5J) r1
            java.lang.Object r0 = r2.A01
            X.M5J r0 = (X.M5J) r0
            java.lang.Object r3 = r2.A02
            X.M5J r3 = (X.M5J) r3
            java.lang.Object r5 = r1.A08()
            java.lang.Object r0 = r0.A08()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r5 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002a
            goto L_0x0027
        L_0x010f:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            r5 = 0
            if (r0 != 0) goto L_0x0136
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r4 = r2.A00
            X.601 r4 = (X.AnonymousClass601) r4
            java.lang.Object r1 = r2.A02
            X.6jp r1 = (X.C109326jp) r1
            java.lang.Object r0 = r3.A01
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
        L_0x012c:
            X.C63913ic.A0K(r4, r1, r0)
            return
        L_0x0130:
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x002a
        L_0x0136:
            java.lang.Object r4 = r2.A00
            X.601 r4 = (X.AnonymousClass601) r4
            java.lang.Object r1 = r2.A01
            goto L_0x014c
        L_0x013d:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            r5 = 0
            if (r0 == 0) goto L_0x0130
            java.lang.Object r4 = r2.A00
            X.601 r4 = (X.AnonymousClass601) r4
            java.lang.Object r1 = r2.A02
        L_0x014c:
            X.6jp r1 = (X.C109326jp) r1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            goto L_0x012c
        L_0x0151:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            r6 = 0
            if (r0 == 0) goto L_0x0173
            java.lang.Object r5 = r2.A02
            X.6jp r5 = (X.C109326jp) r5
            X.3VO r4 = X.AnonymousClass3VO.A00()
            java.lang.Object r0 = r3.A01
        L_0x0164:
            r4.A02(r0, r6)
        L_0x0167:
            X.3iY r1 = r4.A01()
        L_0x016b:
            java.lang.Object r0 = r2.A00
            X.601 r0 = (X.AnonymousClass601) r0
            X.C61043Rr.A00(r0, r1, r5)
            return
        L_0x0173:
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x002a
            r1 = -1
            java.lang.Throwable r3 = r3.A02
            boolean r0 = r3 instanceof X.AnonymousClass88W
            if (r0 == 0) goto L_0x0194
            r3.getClass()
            X.88W r3 = (X.AnonymousClass88W) r3
            int r1 = r3.A00
        L_0x0187:
            java.lang.Object r5 = r2.A01
            X.6jp r5 = (X.C109326jp) r5
            X.3VO r4 = X.AnonymousClass3VO.A00()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0164
        L_0x0194:
            boolean r0 = r3 instanceof X.C1373088b
            if (r0 == 0) goto L_0x0187
            r1 = -2
            goto L_0x0187
        L_0x019a:
            X.7EC r3 = (X.AnonymousClass7EC) r3
            java.lang.Object r5 = r2.A02
            X.56X r5 = (X.AnonymousClass56X) r5
            X.56q r4 = r5.A05
            java.lang.Object r0 = r2.A00
            X.M5J r0 = (X.M5J) r0
            r4.A0J(r0)
            java.lang.Throwable r1 = r3.A02
            if (r1 != 0) goto L_0x01bc
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r2.A01
            X.0MQ r0 = (X.AnonymousClass0MQ) r0
            long r0 = r0.A00
            long r3 = r3 - r0
            X.AnonymousClass56X.A02(r5, r3)
            return
        L_0x01bc:
            X.67n r0 = X.C969967n.Error
            r4.A0H(r0)
            X.56r r3 = r5.A06
            r6 = 0
            android.app.Application r0 = r5.A08()
            X.771 r7 = new X.771
            r7.<init>(r0, r1)
            r8 = -1
            X.6ue r5 = new X.6ue
            r10 = r8
            r5.<init>(r6, r7, r8, r10)
            goto L_0x0027
        L_0x01d7:
            X.7Kx r1 = X.C86104wH.A0S(r3)
            boolean r0 = X.AnonymousClass7Kx.A0P(r1)
            if (r0 != 0) goto L_0x002a
            java.lang.Object r0 = r2.A01
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            r0.A00 = r1
            java.lang.Object r0 = r2.A00
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r3 = r2.A02
            X.M5J r3 = (X.M5J) r3
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x002a
            kotlin.Pair r5 = X.C18180wK.A0p(r0, r1)
            goto L_0x0027
        L_0x01f9:
            X.7Kx r1 = X.C86104wH.A0S(r3)
            boolean r0 = X.AnonymousClass7Kx.A0P(r1)
            if (r0 != 0) goto L_0x002a
            java.lang.Object r0 = r2.A00
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            r0.A00 = r1
            java.lang.Object r0 = r2.A01
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r3 = r2.A02
            X.M5J r3 = (X.M5J) r3
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x002a
            kotlin.Pair r5 = X.C18180wK.A0p(r1, r0)
            goto L_0x0027
        L_0x021b:
            X.7Kx r0 = X.C86104wH.A0S(r3)
            boolean r0 = X.AnonymousClass7Kx.A0P(r0)
            if (r0 != 0) goto L_0x002a
            java.lang.Object r3 = r2.A00
            X.0MZ r3 = (X.AnonymousClass0MZ) r3
            int r0 = r3.A00
            int r1 = r0 + 1
            r3.A00 = r1
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r2.A02
            X.M5J r3 = (X.M5J) r3
            int r0 = r0.size()
            if (r1 != r0) goto L_0x002a
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            X.7JD r5 = new X.7JD
            r5.<init>(r0)
            goto L_0x0027
        L_0x0248:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0P(r3)
            if (r0 != 0) goto L_0x002a
            java.lang.Object r4 = r2.A01
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            r0 = 0
            r4.setOnCheckedChangeListener(r0)
            java.lang.Object r1 = r3.A01
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r1)
            r4.setChecked(r0)
            java.lang.Object r0 = r2.A02
            android.widget.CompoundButton$OnCheckedChangeListener r0 = (android.widget.CompoundButton.OnCheckedChangeListener) r0
            r4.setOnCheckedChangeListener(r0)
            return
        L_0x026b:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r4 = X.AnonymousClass7Kx.A0P(r3)
            if (r4 != 0) goto L_0x0279
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x028d
        L_0x0279:
            java.lang.Object r1 = r2.A00
            X.5gY r1 = (X.C91635gY) r1
            X.C04220Ms.A07(r3)
            java.lang.Object r0 = r2.A01
            X.0Oa r0 = (X.C04530Oa) r0
            java.lang.Object r0 = r0.getValue()
            X.5BP r0 = (X.AnonymousClass5BP) r0
            r1.A0A(r0, r3)
        L_0x028d:
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            r1 = 0
            java.lang.String r6 = "nuxViewModel"
            if (r0 == 0) goto L_0x02bb
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x02bb
            java.lang.Object r0 = r2.A02
            X.5j8 r0 = (X.AnonymousClass5j8) r0
            X.58J r3 = r0.A0L
            if (r3 == 0) goto L_0x0867
            java.lang.String r2 = "otc_toggle"
            java.util.Map r1 = r3.A0U
            X.69P r0 = X.AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r2)
            X.78o r4 = X.C86114wI.A0R(r0, r1)
            if (r4 == 0) goto L_0x002a
            r0 = 14
            kotlin.jvm.internal.KtLambdaShape6S1100000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape6S1100000_I2
            r1.<init>(r2, r3, r0)
            goto L_0x052e
        L_0x02bb:
            if (r4 != 0) goto L_0x002a
            java.lang.Object r0 = r2.A02
            X.5j8 r0 = (X.AnonymousClass5j8) r0
            X.58J r5 = r0.A0L
            if (r5 == 0) goto L_0x0867
            java.lang.Throwable r4 = r3.A02
            java.lang.String r3 = "otc_toggle"
            java.util.Map r1 = r5.A0U
            X.69P r0 = X.AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r3)
            X.78o r2 = X.C86114wI.A0R(r0, r1)
            if (r2 == 0) goto L_0x002a
            r1 = 3
            kotlin.jvm.internal.KtLambdaShape5S1200000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape5S1200000_I2
            r0.<init>(r4, r5, r3, r1)
            r2.A00(r0)
            return
        L_0x02e1:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x0306
            java.lang.Object r0 = r2.A02
            X.57w r0 = (X.C883957w) r0
            X.56q r4 = r0.A03
            java.lang.Throwable r1 = r3.A02
            java.lang.Object r0 = r2.A00
            X.AnonymousClass7Kx.A0K(r4, r0, r1)
            java.lang.Object r3 = r2.A01
            X.M5J r3 = (X.M5J) r3
            java.lang.String r0 = "Nothing to reprocess"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            X.7Kx r5 = X.AnonymousClass7Kx.A0C(r0)
            goto L_0x0027
        L_0x0306:
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r3 = r2.A01
            X.M5J r3 = (X.M5J) r3
            java.lang.String r0 = "REPROCESS"
            X.7Kx r5 = X.AnonymousClass7Kx.A0A(r0)
            goto L_0x0027
        L_0x0318:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r5 = X.AnonymousClass7Kx.A0R(r3)
            if (r5 == 0) goto L_0x033b
            java.lang.Object r4 = r3.A01
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            if (r4 == 0) goto L_0x033b
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer> r1 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.class
            java.lang.String r0 = "request_payment_container(input:$input)"
            com.facebook.pando.TreeJNI r4 = r4.getTreeValue(r0, r1)
            if (r4 == 0) goto L_0x033b
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer$NonAuthStepUpError> r1 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.NonAuthStepUpError.class
            java.lang.String r0 = "non_auth_step_up_error"
            com.facebook.pando.TreeJNI r0 = r4.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x033b
            return
        L_0x033b:
            if (r5 != 0) goto L_0x0349
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x0356
            java.lang.Throwable r0 = r3.A02
            boolean r0 = r0 instanceof X.C92885kB
            if (r0 != 0) goto L_0x0356
        L_0x0349:
            java.lang.Object r0 = r2.A02
            X.57w r0 = (X.C883957w) r0
            X.56q r1 = r0.A03
            java.lang.Object r0 = r2.A01
            X.M5J r0 = (X.M5J) r0
            r1.A0J(r0)
        L_0x0356:
            java.lang.Object r0 = r2.A00
            X.6gT r0 = (X.C107266gT) r0
            android.os.Bundle r4 = r0.A01
            java.lang.String r1 = "REUSE_ATS_IN_AUTH_PROMPT_OBJ_SCOPED"
            r0 = 0
            boolean r0 = r4.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x0374
            java.lang.Throwable r0 = r3.A02
            int r1 = X.C117026y0.A00(r0)
            java.util.Set r0 = X.C92885kB.A01
            boolean r0 = X.C86114wI.A1Z(r0, r1)
            r1 = 1
            if (r0 != 0) goto L_0x0375
        L_0x0374:
            r1 = 0
        L_0x0375:
            java.lang.Throwable r0 = r3.A02
            boolean r0 = r0 instanceof X.C92885kB
            if (r0 != 0) goto L_0x002a
            if (r1 != 0) goto L_0x002a
            java.lang.Object r0 = r2.A02
            X.57w r0 = (X.C883957w) r0
            X.56q r0 = r0.A03
            r0.A0H(r3)
            return
        L_0x0387:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x03be
            java.lang.Object r1 = r2.A00
            X.M5J r1 = (X.M5J) r1
            X.7Sm r0 = X.AnonymousClass7Sm.A00
        L_0x0395:
            X.8fJ r0 = (X.C142618fJ) r0
            X.AnonymousClass7Kx.A0E(r0, r1, r3)
        L_0x039a:
            java.lang.Object r1 = r2.A02
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r1 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r1
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x002a
            boolean r0 = X.AnonymousClass7Kx.A0P(r3)
            if (r0 != 0) goto L_0x002a
            r0 = 1
            r1.A04 = r0
            X.C04220Ms.A07(r3)
            java.lang.Object r1 = r2.A01
            r0 = 13
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r4 = X.C86154wM.A11(r1, r3, r0)
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r9 = X.C86164wN.A0r(r1, r0)
        L_0x03ba:
            X.AnonymousClass7Kr.A0C(r3, r4, r9)
            return
        L_0x03be:
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x039a
            java.lang.Object r1 = r2.A00
            X.M5J r1 = (X.M5J) r1
            X.7Sn r0 = X.AnonymousClass7Sn.A00
            goto L_0x0395
        L_0x03c9:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            r8 = 0
            X.C04220Ms.A0B(r3, r8)
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x04d1
            java.lang.Object r3 = X.AnonymousClass7Kx.A0D(r3)
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            java.lang.Class<com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl$HandleCheckoutEvent> r1 = com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.class
            java.lang.String r0 = "handle_checkout_event(input:$input)"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r0, r1)
            if (r3 == 0) goto L_0x0494
            java.lang.Class<com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl$HandleCheckoutEvent$PaymentDetailsUpdates> r1 = com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates.class
            java.lang.String r0 = "payment_details_updates"
            com.google.common.collect.ImmutableList r7 = r3.getTreeList(r0, r1)
            if (r7 == 0) goto L_0x0494
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0494
            java.lang.Object r0 = r7.get(r8)
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x0494
            java.lang.Class<com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl$HandleCheckoutEvent$PaymentDetailsUpdates$Error> r6 = com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates.Error.class
            java.lang.String r5 = "error"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            if (r0 == 0) goto L_0x0494
            java.lang.Class<com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl$HandleCheckoutEvent$PaymentDetailsUpdates$Error$UserFacingError> r4 = com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates.Error.UserFacingError.class
            java.lang.String r3 = "user_facing_error"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r3, r4)
            if (r0 == 0) goto L_0x0494
            java.lang.Class<com.facebook.graphql.impls.SharedPaymentsErrorImpl> r1 = com.facebook.graphql.impls.SharedPaymentsErrorImpl.class
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r1)
            if (r0 == 0) goto L_0x0494
            java.lang.Object r0 = r7.get(r8)
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x0862
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            if (r0 == 0) goto L_0x0862
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r3, r4)
            if (r0 == 0) goto L_0x0862
            com.facebook.pando.TreeJNI r3 = r0.reinterpret(r1)
            if (r3 == 0) goto L_0x0862
            java.lang.Object r7 = r2.A01
            com.fbpay.logging.LoggingContext r7 = (com.fbpay.logging.LoggingContext) r7
            java.lang.Object r4 = r2.A00
            X.6lV r4 = (X.C110326lV) r4
            java.lang.String r1 = "error_title"
            java.lang.String r0 = r3.getStringValue(r1)
            if (r0 == 0) goto L_0x0491
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 != 0) goto L_0x0491
            java.lang.String r3 = r3.getStringValue(r1)
        L_0x044d:
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            X.6B5 r5 = X.AnonymousClass6B5.CANCEL_CHECKOUT
            java.lang.String r0 = r4.A01
            r1 = 0
            if (r0 == 0) goto L_0x048f
            java.lang.Long r6 = X.AnonymousClass0wJ.A0d(r0)
        L_0x045c:
            com.facebookpay.otc.models.OtcInput r0 = r4.A00
            if (r0 == 0) goto L_0x0464
            X.7DP r1 = X.AnonymousClass7DP.A00(r0)
        L_0x0464:
            r8 = 0
            java.util.LinkedHashMap r9 = X.C18220wO.A0y()
            if (r1 == 0) goto L_0x046e
            X.AnonymousClass7Kr.A0B(r1, r9)
        L_0x046e:
            java.lang.String r0 = "error_message"
            if (r3 == 0) goto L_0x0475
            r9.put(r0, r3)
        L_0x0475:
            X.09x r1 = X.C128957ke.A00(r2, r5)
            java.lang.String r0 = "client_submit_ecpeventhandling_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 396(0x18c, float:5.55E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r4 = 4
        L_0x0486:
            kotlin.jvm.internal.KtLambdaShape4S0500000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape4S0500000_I2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.C128957ke.A04(r0, r7, r3)
            return
        L_0x048f:
            r6 = r1
            goto L_0x045c
        L_0x0491:
            java.lang.String r3 = "Unknown Server Error For Cancel Checkout Event Handling"
            goto L_0x044d
        L_0x0494:
            java.lang.Object r7 = r2.A01
            com.fbpay.logging.LoggingContext r7 = (com.fbpay.logging.LoggingContext) r7
            java.lang.Object r3 = r2.A00
            X.6lV r3 = (X.C110326lV) r3
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            X.6B5 r5 = X.AnonymousClass6B5.CANCEL_CHECKOUT
            java.lang.String r0 = r3.A01
            r1 = 0
            if (r0 == 0) goto L_0x04cf
            java.lang.Long r6 = X.AnonymousClass0wJ.A0d(r0)
        L_0x04ab:
            com.facebookpay.otc.models.OtcInput r0 = r3.A00
            if (r0 == 0) goto L_0x04b3
            X.7DP r1 = X.AnonymousClass7DP.A00(r0)
        L_0x04b3:
            r8 = 0
            java.util.LinkedHashMap r9 = X.C18220wO.A0y()
            if (r1 == 0) goto L_0x04bd
            X.AnonymousClass7Kr.A0B(r1, r9)
        L_0x04bd:
            X.09x r1 = X.C128957ke.A00(r2, r5)
            java.lang.String r0 = "client_submit_ecpeventhandling_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 398(0x18e, float:5.58E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r4 = 6
            goto L_0x0486
        L_0x04cf:
            r6 = r1
            goto L_0x04ab
        L_0x04d1:
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r7 = r2.A01
            com.fbpay.logging.LoggingContext r7 = (com.fbpay.logging.LoggingContext) r7
            java.lang.Object r4 = r2.A00
            X.6lV r4 = (X.C110326lV) r4
            java.lang.Throwable r0 = r3.A02
            if (r0 == 0) goto L_0x04e9
            java.lang.String r3 = X.C117026y0.A01(r0)
            if (r3 != 0) goto L_0x044d
        L_0x04e9:
            java.lang.String r3 = ""
            goto L_0x044d
        L_0x04ed:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r4 = X.AnonymousClass7Kx.A0P(r3)
            if (r4 != 0) goto L_0x04fb
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x0509
        L_0x04fb:
            java.lang.Object r1 = r2.A00
            X.5gV r1 = (X.C91605gV) r1
            X.C04220Ms.A07(r3)
            java.lang.Object r0 = r2.A01
            X.5BO r0 = (X.AnonymousClass5BO) r0
            r1.A0A(r0, r3)
        L_0x0509:
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            java.lang.String r6 = "ecpViewModel"
            r1 = 0
            if (r0 == 0) goto L_0x0532
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x0532
            java.lang.Object r0 = r2.A02
            X.5j7 r0 = (X.AnonymousClass5j7) r0
            X.58M r2 = r0.A09
            if (r2 == 0) goto L_0x0867
            java.util.Map r1 = r2.A1X
            X.69P r0 = X.AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION
            X.78o r4 = X.C86114wI.A0R(r0, r1)
            if (r4 == 0) goto L_0x002a
            r0 = 16
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r1 = X.C86164wN.A0r(r2, r0)
        L_0x052e:
            r4.A01(r1)
            return
        L_0x0532:
            if (r4 != 0) goto L_0x002a
            java.lang.Object r0 = r2.A02
            X.5j7 r0 = (X.AnonymousClass5j7) r0
            X.58M r4 = r0.A09
            if (r4 == 0) goto L_0x0867
            java.lang.Throwable r2 = r3.A02
            java.util.Map r1 = r4.A1X
            X.69P r0 = X.AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION
            X.78o r1 = X.C86114wI.A0R(r0, r1)
            if (r1 == 0) goto L_0x002a
            r0 = 15
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r0 = X.C86154wM.A11(r2, r4, r0)
            r1.A00(r0)
            return
        L_0x0552:
            com.facebookpay.expresscheckout.models.CheckoutResponse r3 = (com.facebookpay.expresscheckout.models.CheckoutResponse) r3
            r1 = 0
            if (r3 == 0) goto L_0x061a
            java.lang.String r4 = r3.A00
        L_0x0559:
            java.lang.String r0 = "CHECKOUT_CANCEL"
            boolean r0 = X.C04220Ms.A0I(r4, r0)
            if (r0 != 0) goto L_0x05ec
            if (r3 == 0) goto L_0x05d0
            java.lang.String r4 = r3.A00
        L_0x0565:
            java.lang.String r0 = "CHECKOUT_COMPLETE"
            boolean r0 = X.C04220Ms.A0I(r4, r0)
            if (r0 != 0) goto L_0x05ec
            if (r3 == 0) goto L_0x0571
            java.lang.String r1 = r3.A00
        L_0x0571:
            java.lang.String r0 = "CHECKOUT_NOT_AVAILABLE"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
        L_0x0579:
            r0 = 2131826362(0x7f1116ba, float:1.9285606E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = 2131826361(0x7f1116b9, float:1.9285604E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            X.68y r5 = X.C973368y.A04
            r6 = 0
            com.facebookpay.common.models.ErrorDialogContent r4 = new com.facebookpay.common.models.ErrorDialogContent
            r7 = r6
            r8 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0595:
            java.lang.Object r3 = r2.A01
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r1 = r2.A00
            X.0ZU r1 = (X.AnonymousClass0ZU) r1
            java.lang.String r10 = r4.A05(r3)
            java.lang.String r11 = r4.A02(r3)
            java.lang.String r12 = r4.A03(r3)
            r16 = 2131826365(0x7f1116bd, float:1.9285612E38)
            X.67N r5 = r4.A00()
            boolean r0 = r4.A06()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            com.facebook.redex.IDxPDismissShape737S0100000_2_I2 r8 = new com.facebook.redex.IDxPDismissShape737S0100000_2_I2
            r8.<init>(r1, r0)
            r4 = 0
            r6 = r4
            r7 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            X.6sZ r1 = X.C117016xz.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.77R r0 = X.AnonymousClass7Kz.A0M()
            X.AnonymousClass77R.A00(r3, r1, r0)
            return
        L_0x05d0:
            r4 = r1
            goto L_0x0565
        L_0x05d2:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x05f2
            java.lang.Object r1 = r3.A01
            java.lang.String r0 = "CHECKOUT_CANCEL"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x05ec
            java.lang.String r0 = "CHECKOUT_COMPLETE"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
        L_0x05ec:
            java.lang.Object r0 = r2.A00
            X.C18240wQ.A1G(r0)
            return
        L_0x05f2:
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r3.A01
            java.lang.String r0 = "CHECKOUT_NOT_AVAILABLE"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Throwable r1 = r3.A02
            boolean r0 = r1 instanceof X.C92875kA
            if (r0 == 0) goto L_0x0579
            X.5kA r1 = (X.C92875kA) r1
            if (r1 == 0) goto L_0x0579
            X.7JD r0 = X.AnonymousClass7Fb.A00(r1)
            java.lang.Object r4 = r0.A05()
            com.facebookpay.common.models.ErrorDialogContent r4 = (com.facebookpay.common.models.ErrorDialogContent) r4
            if (r4 != 0) goto L_0x0595
            goto L_0x0579
        L_0x061a:
            r4 = r1
            goto L_0x0559
        L_0x061d:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r5 = r2.A02
            X.5gc r5 = (X.C91675gc) r5
            android.content.Context r0 = r5.A00
            java.lang.Throwable r4 = r3.A02
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A00
            r1 = 19
            goto L_0x0678
        L_0x0634:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r5 = r2.A02
            X.5gb r5 = (X.C91665gb) r5
            android.content.Context r0 = r5.A00
            java.lang.Throwable r4 = r3.A02
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A00
            r1 = 18
            goto L_0x0678
        L_0x064b:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r5 = r2.A02
            X.5ge r5 = (X.C91695ge) r5
            android.content.Context r0 = r5.A00
            java.lang.Throwable r4 = r3.A02
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A00
            r1 = 16
            goto L_0x0678
        L_0x0662:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r5 = r2.A02
            X.5ga r5 = (X.C91655ga) r5
            android.content.Context r0 = r5.A00
            java.lang.Throwable r4 = r3.A02
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A00
            r1 = 15
        L_0x0678:
            kotlin.jvm.internal.KtLambdaShape5S0300000_I2 r1 = X.C86154wM.A15(r2, r5, r3, r1)
            X.4i5 r5 = X.C78224i5.A00
            boolean r2 = r4 instanceof X.C92875kA
            if (r2 == 0) goto L_0x06e9
            X.5kA r4 = (X.C92875kA) r4
            X.7JD r2 = X.AnonymousClass7Fb.A00(r4)
        L_0x0688:
            java.lang.Object r4 = r2.A05()
            com.facebookpay.common.models.ErrorDialogContent r4 = (com.facebookpay.common.models.ErrorDialogContent) r4
            if (r4 == 0) goto L_0x002a
            X.77R r3 = X.AnonymousClass7Kz.A0M()
            X.7Ec r7 = X.AnonymousClass7Kz.A0G()
            r6 = 46
            r2 = 41
            android.graphics.drawable.Drawable r6 = r7.A04(r0, r6, r2)
            java.lang.String r12 = r4.A05(r0)
            java.lang.String r13 = r4.A02(r0)
            java.lang.String r14 = r4.A03(r0)
            r18 = 2131826365(0x7f1116bd, float:1.9285612E38)
            X.67N r7 = r4.A00()
            boolean r2 = r4.A06()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            X.6iz r2 = r4.A00
            if (r2 == 0) goto L_0x06e7
            java.lang.String r15 = r2.A02
        L_0x06c1:
            java.lang.String r16 = r4.A04(r0)
            X.67N r8 = r4.A01()
            X.6iz r2 = r4.A01
            if (r2 == 0) goto L_0x06e5
            java.lang.String r2 = r2.A02
        L_0x06cf:
            r4 = 3
            com.facebook.redex.IDxPDismissShape737S0100000_2_I2 r10 = new com.facebook.redex.IDxPDismissShape737S0100000_2_I2
            r10.<init>(r1, r4)
            r1 = 5
            com.facebook.redex.IDxONavigationShape640S0100000_2_I2 r9 = new com.facebook.redex.IDxONavigationShape640S0100000_2_I2
            r9.<init>(r5, r1)
            r17 = r2
            X.6sZ r1 = X.C117016xz.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.AnonymousClass77R.A00(r0, r1, r3)
            return
        L_0x06e5:
            r2 = 0
            goto L_0x06cf
        L_0x06e7:
            r15 = 0
            goto L_0x06c1
        L_0x06e9:
            r8 = 0
            r2 = 2131826475(0x7f11172b, float:1.9285835E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r2 = 2131826474(0x7f11172a, float:1.9285833E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            X.68y r7 = X.C973368y.A03
            com.facebookpay.common.models.ErrorDialogContent r6 = new com.facebookpay.common.models.ErrorDialogContent
            r9 = r8
            r10 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.7JD r2 = new X.7JD
            r2.<init>(r6)
            goto L_0x0688
        L_0x070d:
            X.6gm r3 = (X.C107456gm) r3
            if (r3 == 0) goto L_0x002a
            java.lang.Object r0 = r2.A02
            X.M5J r0 = (X.M5J) r0
            r0.A0F(r2)
            java.lang.Object r1 = r2.A00
            X.7K3 r1 = (X.AnonymousClass7K3) r1
            X.IF5 r0 = r1.A04
            if (r0 == 0) goto L_0x002a
            java.lang.Throwable r2 = r3.A01
            X.5Ej r0 = r1.A02
            android.content.Context r1 = r0.A00
            if (r2 != 0) goto L_0x0735
            if (r1 == 0) goto L_0x002a
            r0 = 2131835195(0x7f11393b, float:1.9303522E38)
        L_0x072d:
            java.lang.String r0 = r1.getString(r0)
            X.C63813iO.A01(r1, r0)
            return
        L_0x0735:
            if (r1 == 0) goto L_0x002a
            r0 = 2131835142(0x7f113906, float:1.9303414E38)
            goto L_0x072d
        L_0x073b:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 != 0) goto L_0x0749
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            if (r0 == 0) goto L_0x0754
        L_0x0749:
            java.lang.Object r1 = r2.A02
            X.56q r1 = (X.C880756q) r1
            java.lang.Object r0 = r2.A01
            X.M5J r0 = (X.M5J) r0
            r1.A0J(r0)
        L_0x0754:
            java.lang.Object r0 = r2.A00
            X.8gC r0 = (X.C143158gC) r0
            X.C04220Ms.A07(r3)
            r0.onChanged(r3)
            return
        L_0x075f:
            java.lang.Object r1 = r2.A00
            X.7Ic r1 = (X.AnonymousClass7Ic) r1
            java.lang.Object r5 = r2.A01
            X.8kM r5 = (X.C145348kM) r5
            java.lang.Object r4 = r2.A02
            X.6gT r4 = (X.C107266gT) r4
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x0785
            X.583 r2 = r1.A03
            java.lang.Object r1 = X.AnonymousClass7Kx.A0D(r3)
            X.7Dk r1 = (X.C120967Dk) r1
            java.security.Signature r0 = X.AnonymousClass583.A00(r2, r1)     // Catch:{ GeneralSecurityException -> 0x0780 }
            goto L_0x0781
        L_0x0780:
            r0 = 0
        L_0x0781:
            r2.A02(r5, r4, r1, r0)
            return
        L_0x0785:
            java.lang.Throwable r0 = r3.A02
            r0.getClass()
            r5.Bln(r0)
            return
        L_0x078e:
            java.lang.Object r4 = r2.A02
            X.M5J r4 = (X.M5J) r4
            java.lang.Object r0 = r2.A01
            X.M5J r0 = (X.M5J) r0
            java.lang.Object r1 = r0.A08()
            X.79P r0 = new X.79P
            r0.<init>(r1, r3)
            r4.A0G(r0)
            return
        L_0x07a3:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            java.lang.Object r4 = r3.A01
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            r5 = 0
            if (r4 == 0) goto L_0x07c7
            java.lang.Class<com.facebook.graphql.impls.SubmitPayContainerMutationResponseImpl$SubmitPaymentContainer> r1 = com.facebook.graphql.impls.SubmitPayContainerMutationResponseImpl.SubmitPaymentContainer.class
            java.lang.String r0 = "submit_payment_container(input:$input)"
            com.facebook.pando.TreeJNI r4 = r4.getTreeValue(r0, r1)
            if (r4 == 0) goto L_0x07c7
            java.lang.Class<com.facebook.graphql.impls.SubmitPayContainerMutationResponseImpl$SubmitPaymentContainer$SubmitPaymentContainerResponseList> r1 = com.facebook.graphql.impls.SubmitPayContainerMutationResponseImpl.SubmitPaymentContainer.SubmitPaymentContainerResponseList.class
            java.lang.String r0 = "submit_payment_container_response_list"
            com.google.common.collect.ImmutableList r1 = r4.getTreeList(r0, r1)
            if (r1 == 0) goto L_0x07c7
            r0 = 0
            java.lang.Object r5 = r1.get(r0)
            com.facebook.pando.TreeJNI r5 = (com.facebook.pando.TreeJNI) r5
        L_0x07c7:
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x082b
            java.lang.Object r4 = r2.A02
            X.58M r4 = (X.AnonymousClass58M) r4
            if (r5 == 0) goto L_0x0824
            java.lang.Object r3 = r2.A00
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r3 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r3
            java.lang.Object r2 = r2.A01
            X.0YY r2 = (X.AnonymousClass0YY) r2
            X.1zf r1 = X.C30001zf.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "payment_status"
            java.lang.Enum r0 = X.C86104wH.A0a(r5, r1, r0)
            X.1zf r0 = (X.C30001zf) r0
            if (r0 == 0) goto L_0x081d
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0816
            r0 = 3
            if (r1 == r0) goto L_0x0816
            r0 = 1
            if (r1 != r0) goto L_0x081d
            java.lang.Class<com.facebook.graphql.impls.SubmitPayContainerMutationResponseImpl$SubmitPaymentContainer$SubmitPaymentContainerResponseList$PaymentError> r1 = com.facebook.graphql.impls.SubmitPayContainerMutationResponseImpl.SubmitPaymentContainer.SubmitPaymentContainerResponseList.PaymentError.class
            java.lang.String r0 = "payment_error"
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x0814
            com.facebook.pando.TreeJNI r0 = X.C86124wJ.A0T(r0)
            com.facebook.graphql.impls.SharedPaymentsErrorImpl r0 = (com.facebook.graphql.impls.SharedPaymentsErrorImpl) r0
            if (r0 == 0) goto L_0x0814
            X.5kA r0 = X.AnonymousClass7Fb.A01(r0)
        L_0x080a:
            kotlin.Unit r1 = kotlin.Unit.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r1, r0)
        L_0x0810:
            X.AnonymousClass58M.A0I(r3, r4, r0, r2)
            return
        L_0x0814:
            r0 = 0
            goto L_0x080a
        L_0x0816:
            kotlin.Unit r0 = kotlin.Unit.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
            goto L_0x0810
        L_0x081d:
            java.lang.String r0 = "Unrecognized payment status from SubmitPayContainerMutationResponse"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            goto L_0x080a
        L_0x0824:
            java.lang.String r0 = "Wrong response data"
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)
            goto L_0x0837
        L_0x082b:
            boolean r0 = X.AnonymousClass7Kx.A0O(r3)
            java.lang.Object r4 = r2.A02
            X.58M r4 = (X.AnonymousClass58M) r4
            if (r0 == 0) goto L_0x0849
            java.lang.Throwable r1 = r3.A02
        L_0x0837:
            kotlin.Unit r0 = kotlin.Unit.A00
            X.7Kx r3 = X.AnonymousClass7Kx.A0B(r0, r1)
        L_0x083d:
            java.lang.Object r1 = r2.A00
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r1 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r1
            java.lang.Object r0 = r2.A01
            X.0YY r0 = (X.AnonymousClass0YY) r0
            X.AnonymousClass58M.A0I(r1, r4, r3, r0)
            return
        L_0x0849:
            kotlin.Unit r0 = kotlin.Unit.A00
            X.7Kx r3 = X.AnonymousClass7Kx.A09(r0)
            goto L_0x083d
        L_0x0850:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            java.lang.Object r5 = r2.A02
            java.lang.Object r4 = r2.A01
            java.lang.Object r2 = r2.A00
            r1 = 0
            com.facebook.redex.IDxFunctionShape122S0300000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape122S0300000_2_I2
            r0.<init>(r1, r2, r4, r5)
            X.AnonymousClass7Kx.A03(r0, r3)
            return
        L_0x0862:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            throw r1
        L_0x0867:
            X.C04220Ms.A0E(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape55S0300000_2_I2.onChanged(java.lang.Object):void");
    }

    public IDxObserverShape55S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public IDxObserverShape55S0300000_2_I2(C880756q r1, AnonymousClass0MJ r2, AnonymousClass0MJ r3, int i) {
        this.A03 = i;
        if (25 - i != 0) {
            this.A01 = r2;
            this.A00 = r3;
        } else {
            this.A00 = r2;
            this.A01 = r3;
        }
        this.A02 = r1;
    }

    public IDxObserverShape55S0300000_2_I2(C880756q r1, C121207Et r2, LoggingContext loggingContext, int i) {
        this.A03 = i;
        this.A00 = r2;
        if (5 - i != 0) {
            this.A02 = r1;
            this.A01 = loggingContext;
        } else {
            this.A01 = r1;
            this.A02 = loggingContext;
        }
    }
}
