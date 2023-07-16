package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.82z  reason: invalid class name and case insensitive filesystem */
public final class C1365082z implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C169999uG A02;
    public final /* synthetic */ C19211AsY A03;

    public C1365082z(Activity activity, View view, C169999uG r3, C19211AsY asY) {
        this.A03 = asY;
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        X.C18729AkN.A00(new kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54(r4, r1), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ce, code lost:
        r6 = new X.C26431qd(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d3, code lost:
        r1 = new X.C25553Dnn(r3, r6);
        r1.A01(r2);
        r1.A03(X.D0f.BELOW_ANCHOR);
        r1.A00 = 5000;
        r1.A00().A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        X.C18729AkN.A00(new kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54(r4, r0), 1618983419);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            X.AsY r4 = r7.A03
            X.9uG r0 = r7.A02
            android.app.Activity r3 = r7.A00
            android.view.View r2 = r7.A01
            if (r3 == 0) goto L_0x0013
            if (r2 == 0) goto L_0x0013
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x001f;
                case 2: goto L_0x0036;
                case 3: goto L_0x0061;
                case 4: goto L_0x0089;
                case 5: goto L_0x0013;
                case 6: goto L_0x00ac;
                default: goto L_0x0013;
            }
        L_0x0013:
            return
        L_0x0014:
            r0 = 2131827089(0x7f111991, float:1.928708E38)
            X.1qd r6 = new X.1qd
            r6.<init>((int) r0)
            r0 = 42
            goto L_0x0029
        L_0x001f:
            r0 = 2131823530(0x7f110baa, float:1.9279862E38)
            X.1qd r6 = new X.1qd
            r6.<init>((int) r0)
            r0 = 44
        L_0x0029:
            kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54 r1 = new kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54
            r1.<init>(r4, r0)
            r0 = 1618983419(0x607fb9fb, float:7.370814E19)
            X.C18729AkN.A00(r1, r0)
            goto L_0x00d3
        L_0x0036:
            com.instagram.service.session.UserSession r0 = r4.A02
            android.content.SharedPreferences r5 = X.C28161tl.A04(r0)
            r0 = 423(0x1a7, float:5.93E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            int r1 = r5.getInt(r1, r0)
            r0 = 3
            if (r1 >= r0) goto L_0x0013
            java.util.concurrent.atomic.AtomicBoolean r1 = X.C19211AsY.A07
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x0013
            r0 = 2131832568(0x7f112ef8, float:1.9298194E38)
            X.1qd r6 = new X.1qd
            r6.<init>((int) r0)
            r5 = 1618983419(0x607fb9fb, float:7.370814E19)
            r1 = 45
            goto L_0x0080
        L_0x0061:
            com.instagram.service.session.UserSession r0 = r4.A02
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            r0 = 424(0x1a8, float:5.94E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.C18190wL.A1X(r1, r0)
            if (r0 != 0) goto L_0x0013
            r0 = 2131832569(0x7f112ef9, float:1.9298196E38)
            X.1qd r6 = new X.1qd
            r6.<init>((int) r0)
            r5 = 1618983419(0x607fb9fb, float:7.370814E19)
            r1 = 46
        L_0x0080:
            kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54 r0 = new kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54
            r0.<init>(r4, r1)
            X.C18729AkN.A00(r0, r5)
            goto L_0x00d3
        L_0x0089:
            com.instagram.service.session.UserSession r0 = r4.A02
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            r0 = 458(0x1ca, float:6.42E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.C18190wL.A1X(r1, r0)
            if (r0 != 0) goto L_0x0013
            r5 = 1618983419(0x607fb9fb, float:7.370814E19)
            r1 = 43
            kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54 r0 = new kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54
            r0.<init>(r4, r1)
            X.C18729AkN.A00(r0, r5)
            r0 = 2131835436(0x7f113a2c, float:1.930401E38)
            goto L_0x00ce
        L_0x00ac:
            com.instagram.service.session.UserSession r0 = r4.A02
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            r0 = 350(0x15e, float:4.9E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.C18190wL.A1X(r1, r0)
            if (r0 != 0) goto L_0x0013
            r5 = 1618983419(0x607fb9fb, float:7.370814E19)
            r1 = 47
            kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54 r0 = new kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54
            r0.<init>(r4, r1)
            X.C18729AkN.A00(r0, r5)
            r0 = 2131835785(0x7f113b89, float:1.9304718E38)
        L_0x00ce:
            X.1qd r6 = new X.1qd
            r6.<init>((int) r0)
        L_0x00d3:
            X.Dnn r1 = new X.Dnn
            r1.<init>(r3, r6)
            r1.A01(r2)
            X.D0f r0 = X.D0f.BELOW_ANCHOR
            r1.A03(r0)
            r0 = 5000(0x1388, float:7.006E-42)
            r1.A00 = r0
            X.DvM r0 = r1.A00()
            r0.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365082z.run():void");
    }
}
