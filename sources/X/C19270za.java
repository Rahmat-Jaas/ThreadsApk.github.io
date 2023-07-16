package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.0za  reason: invalid class name and case insensitive filesystem */
public final class C19270za extends AnonymousClass10X {
    public final AnonymousClass4FC A00;
    public final AnonymousClass37U A01;
    public final C110926mV A02;
    public final EAW A03;
    public final UserSession A04;
    public final C86074wE A05;
    public final C86094wG A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017a A[Catch:{ SecurityException -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b7 A[Catch:{ SecurityException -> 0x01c1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C19270za(android.app.Application r38, com.instagram.service.session.UserSession r39) {
        /*
            r37 = this;
            r36 = r39
            X.6mV r2 = X.C33462Fu.A00(r36)
            X.DcD r1 = X.EAW.A0I
            r4 = r38
            r0 = r36
            X.EAW r24 = r1.A00(r4, r0)
            r23 = 1
            r22 = 2
            r21 = 3
            r1 = r21
            r0 = r24
            X.C18180wK.A1Q(r2, r1, r0)
            r3 = r37
            r3.<init>(r4)
            r0 = r36
            r3.A04 = r0
            r3.A02 = r2
            r0 = r24
            r3.A03 = r0
            X.37U r1 = new X.37U
            r0 = r36
            r1.<init>(r4, r0)
            r3.A01 = r1
            r2 = 0
            r10 = 0
            r8 = 7
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r4 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2
            r5 = r2
            r6 = r2
            r7 = r2
            r9 = r22
            r4.<init>((X.C81304nZ) r5, (java.util.List) r6, (kotlin.jvm.internal.DefaultConstructorMarker) r7, (int) r8, (int) r9, (boolean) r10)
            X.Enn r0 = X.C18190wL.A0z(r4)
            r3.A05 = r0
            X.Efm r0 = X.C18230wP.A0x(r2, r0)
            r3.A06 = r0
            X.4FC r20 = new X.4FC
            r0 = r20
            r0.<init>(r3)
            r3.A00 = r0
            android.app.Application r6 = r1.A00
            com.instagram.service.session.UserSession r5 = r1.A01
            X.BEu r0 = X.C19894BEu.A02(r6, r5)
            r0.A0E(r6)
            X.BEb r0 = X.C19875BEb.A00(r5)
            r0.A02(r6)
            X.258[] r9 = X.C18180wK.A1b()
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r0 = 18300984497408544(0x4104a600020a20, double:1.893332919776951E-307)
            boolean r4 = X.C63173fJ.A05(r7, r0)
            if (r4 == 0) goto L_0x01ce
            X.4nC r8 = new X.4nC
            r8.<init>(r5)
            X.24m r12 = X.C311624m.INSTAGRAM
            X.23U r11 = X.AnonymousClass23U.DEVICE_ID
            java.lang.String r10 = X.C18200wM.A0g()
            libraries.access.src.main.base.common.FXDeviceItem r4 = new libraries.access.src.main.base.common.FXDeviceItem
            r4.<init>(r2, r10, r12, r11)
            libraries.access.src.main.base.common.FXDeviceItem[] r4 = new libraries.access.src.main.base.common.FXDeviceItem[]{r4}
            boolean r0 = X.C63173fJ.A05(r7, r0)
            if (r0 == 0) goto L_0x01ce
            int r0 = r9.length
            r35 = r0
            int[] r0 = new int[r0]
            r19 = r0
            X.0rs r18 = X.C54752zx.A00()
            r0 = r23
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            libraries.access.src.main.base.common.FXDeviceItem[] r4 = (libraries.access.src.main.base.common.FXDeviceItem[]) r4
            java.lang.String r32 = "AccessLibrarySharedStorageManager"
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            int r12 = r4.length
            r11 = 0
        L_0x00b1:
            if (r11 >= r12) goto L_0x00c5
            r10 = r4[r11]
            X.23U r0 = r10.A03
            if (r0 == 0) goto L_0x00c1
            X.23U r0 = r10.A03
            X.C18210wN.A1O(r0, r1)
        L_0x00be:
            int r11 = r11 + 1
            goto L_0x00b1
        L_0x00c1:
            r1.add(r2)
            goto L_0x00be
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            r10 = r35
            if (r0 >= r10) goto L_0x01ce
            r17 = r9[r0]
            java.lang.String r27 = r17.name()     // Catch:{ SecurityException -> 0x01c1 }
            boolean r10 = r1.isEmpty()     // Catch:{ SecurityException -> 0x01c1 }
            if (r10 != 0) goto L_0x0143
            java.util.Iterator r16 = r1.iterator()     // Catch:{ SecurityException -> 0x01c1 }
        L_0x00da:
            boolean r10 = r16.hasNext()     // Catch:{ SecurityException -> 0x01c1 }
            if (r10 == 0) goto L_0x0143
            java.lang.String r10 = X.C18180wK.A0k(r16)     // Catch:{ SecurityException -> 0x01c1 }
            X.29w r25 = X.C320229w.WRITE_START     // Catch:{ SecurityException -> 0x01c1 }
            java.lang.Integer r26 = X.AnonymousClass006.A01     // Catch:{ SecurityException -> 0x01c1 }
            r29 = r10
            if (r10 != 0) goto L_0x00ee
            java.lang.String r29 = ""
        L_0x00ee:
            r28 = r2
            r30 = r2
            r31 = r2
            r33 = r2
            r34 = r8
            X.AnonymousClass3ZN.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ SecurityException -> 0x01c1 }
            X.3Eh r11 = r8.A03()     // Catch:{ SecurityException -> 0x01c1 }
            if (r11 == 0) goto L_0x00da
            X.3Eh r11 = r8.A03()     // Catch:{ SecurityException -> 0x01c1 }
            r12 = 857814589(0x3321363d, float:3.7535063E-8)
            com.facebook.quicklog.QuickPerformanceLogger r11 = r11.A00     // Catch:{ SecurityException -> 0x01c1 }
            if (r11 == 0) goto L_0x00da
            r11.markerStart(r12)     // Catch:{ SecurityException -> 0x01c1 }
            java.lang.String r14 = "platform"
            java.lang.String r13 = "Android"
            r11.markerAnnotate((int) r12, (java.lang.String) r14, (java.lang.String) r13)     // Catch:{ SecurityException -> 0x01c1 }
            r13 = 567067343352427(0x203bea790726b, double:2.801684932288968E-309)
            java.lang.String r15 = "app_id"
            r11.markerAnnotate((int) r12, (java.lang.String) r15, (long) r13)     // Catch:{ SecurityException -> 0x01c1 }
            r14 = r27
            if (r27 != 0) goto L_0x0126
            java.lang.String r14 = ""
        L_0x0126:
            java.lang.String r13 = "account_type"
            r11.markerAnnotate((int) r12, (java.lang.String) r13, (java.lang.String) r14)     // Catch:{ SecurityException -> 0x01c1 }
            java.lang.String r14 = "DEVICE_ITEM"
            java.lang.String r13 = "item_type"
            r11.markerAnnotate((int) r12, (java.lang.String) r13, (java.lang.String) r14)     // Catch:{ SecurityException -> 0x01c1 }
            if (r10 != 0) goto L_0x0136
            java.lang.String r10 = ""
        L_0x0136:
            java.lang.String r13 = "device_item_source"
            r11.markerAnnotate((int) r12, (java.lang.String) r13, (java.lang.String) r10)     // Catch:{ SecurityException -> 0x01c1 }
            java.lang.String r13 = "logging_version"
            java.lang.String r10 = "2.0"
            r11.markerAnnotate((int) r12, (java.lang.String) r13, (java.lang.String) r10)     // Catch:{ SecurityException -> 0x01c1 }
            goto L_0x00da
        L_0x0143:
            r10 = r9[r0]     // Catch:{ SecurityException -> 0x01c1 }
            java.lang.String r10 = r10.A01     // Catch:{ SecurityException -> 0x01c1 }
            android.net.Uri r11 = X.C15430rJ.A01(r10)     // Catch:{ SecurityException -> 0x01c1 }
            r10 = r18
            android.content.ContentProviderClient r13 = r10.A03(r6, r11)     // Catch:{ SecurityException -> 0x01c1 }
            if (r13 == 0) goto L_0x01ca
            java.lang.String r12 = "device_result"
            android.os.Bundle r11 = X.C18180wK.A06()     // Catch:{ RemoteException | IllegalArgumentException | NullPointerException | UnsupportedOperationException -> 0x0171 }
            java.lang.String r10 = "device_items"
            r11.putParcelableArray(r10, r4)     // Catch:{ RemoteException | IllegalArgumentException | NullPointerException | UnsupportedOperationException -> 0x0171 }
            java.lang.String r10 = "SAVE"
            android.os.Bundle r11 = r13.call(r10, r2, r11)     // Catch:{ RemoteException | IllegalArgumentException | NullPointerException | UnsupportedOperationException -> 0x0171 }
            if (r11 == 0) goto L_0x0171
            boolean r10 = r11.containsKey(r12)     // Catch:{ RemoteException | IllegalArgumentException | NullPointerException | UnsupportedOperationException -> 0x0171 }
            if (r10 == 0) goto L_0x0171
            int r10 = r11.getInt(r12)     // Catch:{ RemoteException | IllegalArgumentException | NullPointerException | UnsupportedOperationException -> 0x0171 }
            goto L_0x0172
        L_0x0171:
            r10 = 0
        L_0x0172:
            r19[r0] = r10     // Catch:{ SecurityException -> 0x01c1 }
            r11 = r19[r0]     // Catch:{ SecurityException -> 0x01c1 }
            r10 = r23
            if (r11 != r10) goto L_0x01b7
            java.lang.String r27 = r17.name()     // Catch:{ SecurityException -> 0x01c1 }
            r10 = 0
        L_0x017f:
            int r11 = r1.size()     // Catch:{ SecurityException -> 0x01c1 }
            if (r10 >= r11) goto L_0x01ca
            X.29w r25 = X.C320229w.WRITE_SUCCESS     // Catch:{ SecurityException -> 0x01c1 }
            java.lang.Integer r26 = X.AnonymousClass006.A01     // Catch:{ SecurityException -> 0x01c1 }
            java.lang.String r29 = X.C18190wL.A0p(r1, r10)     // Catch:{ SecurityException -> 0x01c1 }
            if (r29 != 0) goto L_0x0191
            java.lang.String r29 = ""
        L_0x0191:
            r28 = r2
            r30 = r2
            r31 = r2
            r33 = r2
            r34 = r8
            X.AnonymousClass3ZN.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ SecurityException -> 0x01c1 }
            X.3Eh r11 = r8.A03()     // Catch:{ SecurityException -> 0x01c1 }
            if (r11 == 0) goto L_0x01b4
            X.3Eh r11 = r8.A03()     // Catch:{ SecurityException -> 0x01c1 }
            r13 = 857814589(0x3321363d, float:3.7535063E-8)
            com.facebook.quicklog.QuickPerformanceLogger r12 = r11.A00     // Catch:{ SecurityException -> 0x01c1 }
            if (r12 == 0) goto L_0x01b4
            r11 = r22
            r12.markerEnd(r13, r11)     // Catch:{ SecurityException -> 0x01c1 }
        L_0x01b4:
            int r10 = r10 + 1
            goto L_0x017f
        L_0x01b7:
            java.lang.String r11 = r17.name()     // Catch:{ SecurityException -> 0x01c1 }
            java.lang.Integer r10 = X.AnonymousClass006.A0j     // Catch:{ SecurityException -> 0x01c1 }
            r8.A08(r10, r11, r1)     // Catch:{ SecurityException -> 0x01c1 }
            goto L_0x01ca
        L_0x01c1:
            java.lang.String r11 = r17.name()
            java.lang.Integer r10 = X.AnonymousClass006.A15
            r8.A08(r10, r11, r1)
        L_0x01ca:
            int r0 = r0 + 1
            goto L_0x00c6
        L_0x01ce:
            r0 = 36328010210617596(0x811022000028fc, double:3.037318166125788E-306)
            boolean r0 = X.C63803iN.A0E(r7, r5, r0)
            if (r0 != 0) goto L_0x01de
            X.3Dv r0 = X.C26288E7s.A04
            r0.A00(r6, r5)
        L_0x01de:
            X.C25787Ds0.setupLocationServices(r5)
            X.3DX r0 = X.AnonymousClass49U.A02
            X.49U r6 = r0.A00(r6, r5)
            com.instagram.service.session.UserSession r4 = r6.A01
            r0 = 36318651476873897(0x81079f000012a9, double:3.0313996652216766E-306)
            boolean r0 = X.C63803iN.A0E(r7, r4, r0)
            if (r0 == 0) goto L_0x0219
            X.0gW r4 = X.AnonymousClass0gN.A00()
            X.4OH r1 = new X.4OH
            r1.<init>(r6)
            r5 = 373673427(0x1645cdd3, float:1.597848E-25)
            X.0lj r0 = new X.0lj
            r0.<init>(r1, r5)
            r4.AKp(r0)
            X.0gW r4 = X.AnonymousClass0gN.A00()
            X.4OI r1 = new X.4OI
            r1.<init>(r6)
            X.0lj r0 = new X.0lj
            r0.<init>(r1, r5)
            r4.AKp(r0)
        L_0x0219:
            X.K4m r1 = X.C37791K4m.A02()
            X.3zV r0 = X.C67413zV.A00
            r1.A05(r0)
            X.KHr r6 = X.C38040KHr.A01
            X.7E6 r1 = new X.7E6
            r1.<init>(r6)
            java.lang.Class<X.0PA> r0 = X.AnonymousClass0PA.class
            X.4tk r4 = r1.A02(r0)
            r1 = 24
            kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1
            r0.<init>(r3, r2, r1)
            r5 = 34
            X.AnonymousClass3J5.A01(r3, r0, r4, r5)
            X.7E6 r1 = new X.7E6
            r1.<init>(r6)
            java.lang.Class<X.0PB> r0 = X.AnonymousClass0PB.class
            X.4tk r4 = r1.A02(r0)
            r1 = 25
            kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1
            r0.<init>(r3, r2, r1)
            X.AnonymousClass3J5.A01(r3, r0, r4, r5)
            X.KHq r0 = X.AnonymousClass3LY.A00(r36)
            X.7E6 r1 = new X.7E6
            r1.<init>(r0)
            java.lang.Class<X.7rb> r0 = X.C131217rb.class
            X.4tk r4 = r1.A02(r0)
            r1 = 26
            kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1
            r0.<init>(r3, r2, r1)
            X.AnonymousClass3J5.A01(r3, r0, r4, r5)
            r1 = r24
            r0 = r20
            r1.A0Q(r0)
            X.4qz r4 = X.AnonymousClass3J5.A00(r3)
            r0 = 8
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0101000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0101000_I2_2
            r1.<init>(r3, r2, r0)
            r0 = r21
            X.C25237DiI.A00(r2, r2, r1, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19270za.<init>(android.app.Application, com.instagram.service.session.UserSession):void");
    }

    public static final void A00(C81304nZ r5, C19270za r6) {
        Object value;
        boolean z;
        List list;
        C86074wE r4 = r6.A05;
        do {
            value = r4.getValue();
            KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2 = (KtCSuperShape0S0210000_I2) value;
            z = ktCSuperShape0S0210000_I2.A02;
            list = (List) ktCSuperShape0S0210000_I2.A01;
            C04220Ms.A0B(list, 2);
        } while (!r4.ADi(value, new KtCSuperShape0S0210000_I2(r5, list, z)));
    }

    public final void onCleared() {
        this.A03.A0R(this.A00);
    }

    public static final void A01(C19270za r6, PendingMedia pendingMedia, Integer num) {
        Object value;
        KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2;
        String str;
        if (pendingMedia.A11()) {
            C86074wE r62 = r6.A05;
            do {
                value = r62.getValue();
                ktCSuperShape0S0210000_I2 = (KtCSuperShape0S0210000_I2) value;
                str = pendingMedia.A2Y;
                C04220Ms.A06(str);
            } while (!r62.ADi(value, new KtCSuperShape0S0210000_I2((C81304nZ) ktCSuperShape0S0210000_I2.A00, AnonymousClass00J.A0X(new KtCSuperShape0S2100000_I2(str, num, pendingMedia.A2w), (Collection) ktCSuperShape0S0210000_I2.A01), ktCSuperShape0S0210000_I2.A02)));
        }
    }
}
