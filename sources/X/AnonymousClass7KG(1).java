package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.IDxPCallbackShape33S0100000_2_I2;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavController$$ExternalSyntheticLambda0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3;
import kotlin.jvm.internal.KtLambdaShape4S0410000_I2;
import kotlin.jvm.internal.KtLambdaShape4S0500000_I2;
import kotlin.jvm.internal.KtLambdaShape6S1000000_I2;

/* renamed from: X.7KG  reason: invalid class name */
public class AnonymousClass7KG {
    public Activity A00;
    public Bundle A01;
    public AnonymousClass00F A02;
    public AnonymousClass061 A03;
    public AnonymousClass066 A04;
    public AnonymousClass58Q A05;
    public AnonymousClass593 A06;
    public C1200478h A07;
    public AnonymousClass0YY A08;
    public AnonymousClass0YY A09;
    public boolean A0A;
    public boolean A0B;
    public Parcelable[] A0C;
    public int A0D;
    public final Context A0E;
    public final AnonymousClass00C A0F;
    public final AnonymousClass065 A0G;
    public final Map A0H;
    public final Map A0I;
    public final Map A0J;
    public final Map A0K;
    public final CopyOnWriteArrayList A0L;
    public final AnonymousClass8AL A0M;
    public final C84714tk A0N;
    public final C86074wE A0O;
    public final C86094wG A0P;
    public final List A0Q;
    public final Map A0R;
    public final Map A0S;
    public final C04530Oa A0T;
    public final C86084wF A0U;

    public AnonymousClass7KG(Context context) {
        Object obj;
        this.A0E = context;
        Iterator it = AnonymousClass8bL.A08(context, AnonymousClass8MU.A00).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!(obj instanceof Activity));
        this.A00 = (Activity) obj;
        this.A0M = new AnonymousClass8AL();
        C27457Enn A0z = C18190wL.A0z(AnonymousClass0ZV.A00);
        this.A0O = A0z;
        this.A0P = C18230wP.A0x((C148838sG) null, A0z);
        this.A0R = C18220wO.A0y();
        this.A0S = C18220wO.A0y();
        this.A0H = C18220wO.A0y();
        this.A0I = C18220wO.A0y();
        this.A0L = new CopyOnWriteArrayList();
        this.A03 = AnonymousClass061.INITIALIZED;
        this.A0G = new NavController$$ExternalSyntheticLambda0(this);
        this.A0F = new IDxPCallbackShape33S0100000_2_I2(this);
        this.A0B = true;
        C1200478h r1 = new C1200478h();
        this.A07 = r1;
        this.A0K = C18220wO.A0y();
        this.A0J = C18220wO.A0y();
        r1.A01(new AnonymousClass59C(r1));
        this.A07.A01(new AnonymousClass59D(this.A0E));
        this.A0Q = AnonymousClass0wJ.A0v();
        this.A0T = C86114wI.A0w(this, 0);
        C27456Enm enm = new C27456Enm(AnonymousClass006.A01, 1, 1);
        this.A0U = enm;
        this.A0N = new C27198Efl((C148838sG) null, enm);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018d, code lost:
        if (r9 == null) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018f, code lost:
        r10 = r0.A0E;
        r14 = r0.A06;
        X.C04220Ms.A0A(r14);
        r4 = r0.A06;
        X.C04220Ms.A0A(r4);
        r11 = r4.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a1, code lost:
        if (r0.A04 != null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a3, code lost:
        r13 = X.AnonymousClass061.CREATED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a5, code lost:
        r15 = r0.A05;
        r16 = X.C18190wL.A0n(java.util.UUID.randomUUID());
        X.C18180wK.A1P(r14, 1, r13);
        r9 = new X.C123917Zx(r10, r11, (android.os.Bundle) null, r13, r14, r15, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e2, code lost:
        r13 = r0.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.os.Bundle r14, X.C123917Zx r15, X.AnonymousClass7KG r16, X.AnonymousClass7AO r17, java.util.List r18) {
        /*
            r3 = r15
            X.7AO r15 = r15.A03
            boolean r1 = r15 instanceof X.AnonymousClass8dP
            r0 = r16
            if (r1 != 0) goto L_0x002f
        L_0x0009:
            X.8AL r2 = r0.A0M
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x002f
            java.lang.Object r1 = r2.A0S()
            X.7Zx r1 = (X.C123917Zx) r1
            X.7AO r1 = r1.A03
            boolean r1 = r1 instanceof X.AnonymousClass8dP
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r2.A0S()
            X.7Zx r1 = (X.C123917Zx) r1
            X.7AO r1 = r1.A03
            int r4 = r1.A00
            r2 = 1
            r1 = 0
            boolean r1 = A07(r0, r4, r2, r1)
            if (r1 != 0) goto L_0x0009
        L_0x002f:
            X.8AL r1 = new X.8AL
            r1.<init>()
            r2 = r17
            boolean r4 = r2 instanceof X.AnonymousClass593
            r9 = 0
            r8 = r14
            if (r4 == 0) goto L_0x010c
            r11 = r15
        L_0x003d:
            X.C04220Ms.A0A(r11)
            X.593 r11 = r11.A01
            if (r11 == 0) goto L_0x0109
            java.util.ListIterator r5 = X.C86144wL.A10(r18)
        L_0x0048:
            boolean r4 = r5.hasPrevious()
            if (r4 == 0) goto L_0x00e8
            java.lang.Object r6 = r5.previous()
            r4 = r6
            X.7Zx r4 = (X.C123917Zx) r4
            X.7AO r4 = r4.A03
            boolean r4 = X.C04220Ms.A0I(r4, r11)
            if (r4 == 0) goto L_0x0048
            if (r6 == 0) goto L_0x00e8
            r4 = r15
        L_0x0060:
            r1.A0W(r6)
            X.8AL r6 = r0.A0M
            boolean r5 = X.C18250wR.A1K(r6)
            if (r5 == 0) goto L_0x0084
            java.lang.Object r5 = r6.A0S()
            X.7Zx r5 = (X.C123917Zx) r5
            X.7AO r5 = r5.A03
            if (r5 != r11) goto L_0x0084
            java.lang.Object r7 = r6.A0S()
            X.7Zx r7 = (X.C123917Zx) r7
            r6 = 0
            X.8AL r5 = new X.8AL
            r5.<init>()
            A03(r7, r0, r5, r6)
        L_0x0084:
            if (r11 == 0) goto L_0x0088
            if (r11 != r2) goto L_0x003d
        L_0x0088:
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x0096
            java.lang.Object r5 = r1.A0Q()
            X.7Zx r5 = (X.C123917Zx) r5
            X.7AO r15 = r5.A03
        L_0x0096:
            if (r15 == 0) goto L_0x010f
        L_0x0098:
            int r5 = r15.A00
            X.7AO r5 = r0.A0B(r5)
            if (r5 != 0) goto L_0x010f
            X.593 r15 = r15.A01
            if (r15 == 0) goto L_0x010f
            java.util.ListIterator r6 = X.C86144wL.A10(r18)
        L_0x00a8:
            boolean r5 = r6.hasPrevious()
            if (r5 == 0) goto L_0x00bf
            java.lang.Object r10 = r6.previous()
            r5 = r10
            X.7Zx r5 = (X.C123917Zx) r5
            X.7AO r5 = r5.A03
            boolean r5 = X.C04220Ms.A0I(r5, r15)
            if (r5 == 0) goto L_0x00a8
            if (r10 != 0) goto L_0x00e1
        L_0x00bf:
            android.content.Context r11 = r0.A0E
            android.os.Bundle r12 = r15.A00(r8)
            X.066 r5 = r0.A04
            if (r5 != 0) goto L_0x00e5
            X.061 r14 = X.AnonymousClass061.CREATED
        L_0x00cb:
            X.58Q r6 = r0.A05
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r17 = X.C18190wL.A0n(r5)
            r5 = 3
            X.C04220Ms.A0B(r14, r5)
            X.7Zx r10 = new X.7Zx
            r13 = r9
            r16 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
        L_0x00e1:
            r1.A0W(r10)
            goto L_0x0098
        L_0x00e5:
            X.061 r14 = r0.A03
            goto L_0x00cb
        L_0x00e8:
            android.content.Context r7 = r0.A0E
            X.066 r4 = r0.A04
            if (r4 != 0) goto L_0x0106
            X.061 r10 = X.AnonymousClass061.CREATED
        L_0x00f0:
            X.58Q r12 = r0.A05
            r4 = r15
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r13 = X.C18190wL.A0n(r5)
            r5 = 3
            X.C04220Ms.A0B(r10, r5)
            X.7Zx r6 = new X.7Zx
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0060
        L_0x0106:
            X.061 r10 = r0.A03
            goto L_0x00f0
        L_0x0109:
            r4 = r15
            goto L_0x0088
        L_0x010c:
            r4 = r15
            goto L_0x0088
        L_0x010f:
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x011d
            java.lang.Object r4 = r1.A0Q()
            X.7Zx r4 = (X.C123917Zx) r4
            X.7AO r4 = r4.A03
        L_0x011d:
            X.8AL r5 = r0.A0M
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0155
            java.lang.Object r6 = r5.A0S()
            X.7Zx r6 = (X.C123917Zx) r6
            X.7AO r6 = r6.A03
            boolean r6 = r6 instanceof X.AnonymousClass593
            if (r6 == 0) goto L_0x0155
            java.lang.Object r6 = r5.A0S()
            X.7Zx r6 = (X.C123917Zx) r6
            X.7AO r6 = r6.A03
            X.593 r6 = (X.AnonymousClass593) r6
            int r7 = r4.A00
            X.00y r6 = r6.A03
            java.lang.Object r6 = r6.A04(r7)
            if (r6 != 0) goto L_0x0155
            java.lang.Object r7 = r5.A0S()
            X.7Zx r7 = (X.C123917Zx) r7
            r6 = 0
            X.8AL r5 = new X.8AL
            r5.<init>()
            A03(r7, r0, r5, r6)
            goto L_0x011d
        L_0x0155:
            java.lang.Object r4 = r5.A0R()
            X.7Zx r4 = (X.C123917Zx) r4
            if (r4 != 0) goto L_0x0165
            java.lang.Object r4 = r1.A0R()
            X.7Zx r4 = (X.C123917Zx) r4
            if (r4 == 0) goto L_0x0167
        L_0x0165:
            X.7AO r9 = r4.A03
        L_0x0167:
            X.593 r4 = r0.A06
            boolean r4 = X.C04220Ms.A0I(r9, r4)
            if (r4 != 0) goto L_0x01bc
            java.util.ListIterator r7 = X.C86144wL.A10(r18)
        L_0x0173:
            boolean r4 = r7.hasPrevious()
            if (r4 == 0) goto L_0x018f
            java.lang.Object r9 = r7.previous()
            r4 = r9
            X.7Zx r4 = (X.C123917Zx) r4
            X.7AO r6 = r4.A03
            X.593 r4 = r0.A06
            X.C04220Ms.A0A(r4)
            boolean r4 = X.C04220Ms.A0I(r6, r4)
            if (r4 == 0) goto L_0x0173
            if (r9 != 0) goto L_0x01b9
        L_0x018f:
            android.content.Context r10 = r0.A0E
            X.593 r14 = r0.A06
            X.C04220Ms.A0A(r14)
            X.593 r4 = r0.A06
            X.C04220Ms.A0A(r4)
            android.os.Bundle r11 = r4.A00(r8)
            X.066 r4 = r0.A04
            if (r4 != 0) goto L_0x01e2
            X.061 r13 = X.AnonymousClass061.CREATED
        L_0x01a5:
            X.58Q r15 = r0.A05
            r12 = 0
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r16 = X.C18190wL.A0n(r4)
            r4 = 1
            X.C18180wK.A1P(r14, r4, r13)
            X.7Zx r9 = new X.7Zx
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x01b9:
            r1.A0W(r9)
        L_0x01bc:
            java.util.Iterator r8 = r1.iterator()
        L_0x01c0:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x01f4
            X.7Zx r7 = X.C86154wM.A0J(r8)
            X.78h r6 = r0.A07
            X.7AO r4 = r7.A03
            java.lang.String r4 = r4.A05
            X.6tX r6 = r6.A00(r4)
            java.util.Map r4 = r0.A0K
            java.lang.Object r4 = r4.get(r6)
            if (r4 == 0) goto L_0x01e5
            X.7F7 r4 = (X.AnonymousClass7F7) r4
            r4.A03(r7)
            goto L_0x01c0
        L_0x01e2:
            X.061 r13 = r0.A03
            goto L_0x01a5
        L_0x01e5:
            java.lang.String r3 = "NavigatorBackStack for "
            java.lang.String r1 = r2.A05
            java.lang.String r0 = " should already be created"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r3, r1, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x01f4:
            r5.addAll(r1)
            r5.add(r3)
            java.util.List r1 = X.AnonymousClass00J.A0X(r3, r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x0202:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x021c
            X.7Zx r2 = X.C86154wM.A0J(r3)
            X.7AO r1 = r2.A03
            X.593 r1 = r1.A01
            if (r1 == 0) goto L_0x0202
            int r1 = r1.A00
            X.7Zx r1 = r0.A09(r1)
            A02(r2, r1, r0)
            goto L_0x0202
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KG.A00(android.os.Bundle, X.7Zx, X.7KG, X.7AO, java.util.List):void");
    }

    public final void A0E(C123917Zx r5) {
        C04220Ms.A0B(r5, 0);
        C123917Zx r3 = (C123917Zx) this.A0R.remove(r5);
        if (r3 != null) {
            Map map = this.A0S;
            AtomicInteger atomicInteger = (AtomicInteger) map.get(r3);
            if (atomicInteger != null) {
                int decrementAndGet = atomicInteger.decrementAndGet();
                if (Integer.valueOf(decrementAndGet) != null && decrementAndGet == 0) {
                    AnonymousClass7F7 r0 = (AnonymousClass7F7) this.A0K.get(this.A07.A00(r3.A03.A05));
                    if (r0 != null) {
                        r0.A04(r3);
                    }
                    map.remove(r3);
                }
            }
        }
    }

    public final void A0G(C113926sO r4, AnonymousClass8dR r5, String str) {
        C04220Ms.A0B(str, 0);
        Uri parse = Uri.parse(AnonymousClass00U.A0L("android-app://androidx.navigation/", str));
        if (parse == null) {
            IllegalStateException A0a = C18180wK.A0a(AnonymousClass00U.A0L("INVOKE_RETURN", " must not be null"));
            C04220Ms.A0F(C04220Ms.class.getName(), A0a);
            throw A0a;
        }
        A0F(new C112346pQ(parse, (String) null, (String) null), r4, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[LOOP:1: B:18:0x005c->B:20:0x0062, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.os.Bundle r16, X.AnonymousClass7KG r17, X.AnonymousClass7AO r18, X.C113926sO r19, X.AnonymousClass8dR r20) {
        /*
            r6 = r17
            java.util.Map r5 = r6.A0K
            java.util.Iterator r2 = X.C86144wL.A0z(r5)
        L_0x0008:
            boolean r0 = r2.hasNext()
            r1 = 1
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r2.next()
            X.7F7 r0 = (X.AnonymousClass7F7) r0
            r0.A00 = r1
            goto L_0x0008
        L_0x0018:
            X.0Mo r4 = new X.0Mo
            r4.<init>()
            r8 = r19
            if (r19 == 0) goto L_0x014b
            int r3 = r8.A02
            r0 = -1
            if (r3 == r0) goto L_0x014b
            boolean r2 = r8.A03
            boolean r0 = r8.A04
            boolean r12 = A07(r6, r3, r2, r0)
        L_0x002e:
            r9 = r18
            r0 = r16
            android.os.Bundle r15 = r9.A00(r0)
            r7 = r20
            if (r19 == 0) goto L_0x006c
            boolean r0 = r8.A05
            if (r0 != r1) goto L_0x006c
            java.util.Map r2 = r6.A0H
            int r0 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x006c
            int r0 = r9.A00
            boolean r0 = A05(r15, r6, r8, r7, r0)
            r4.A00 = r0
        L_0x0054:
            r1 = 0
        L_0x0055:
            A04(r6)
            java.util.Iterator r3 = X.C86144wL.A0z(r5)
        L_0x005c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r2 = r3.next()
            X.7F7 r2 = (X.AnonymousClass7F7) r2
            r0 = 0
            r2.A00 = r0
            goto L_0x005c
        L_0x006c:
            X.8AL r10 = r6.A0M
            java.lang.Object r11 = r10.A0T()
            X.7Zx r11 = (X.C123917Zx) r11
            X.78h r2 = r6.A07
            java.lang.String r0 = r9.A05
            X.6tX r3 = r2.A00(r0)
            if (r19 == 0) goto L_0x010c
            boolean r0 = r8.A06
            if (r0 != r1) goto L_0x010c
            if (r11 == 0) goto L_0x010c
            X.7AO r0 = r11.A03
            if (r0 == 0) goto L_0x010c
            int r2 = r9.A00
            int r0 = r0.A00
            if (r2 != r0) goto L_0x010c
            java.lang.Object r0 = r10.A0V()
            X.7Zx r0 = (X.C123917Zx) r0
            r6.A0E(r0)
            android.content.Context r14 = r11.A05
            X.7AO r9 = r11.A03
            X.061 r8 = r11.A00
            X.8dQ r7 = r11.A08
            java.lang.String r2 = r11.A0A
            android.os.Bundle r0 = r11.A07
            X.7Zx r13 = new X.7Zx
            r17 = r8
            r18 = r9
            r19 = r7
            r20 = r2
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.061 r0 = r11.A00
            r13.A00 = r0
            X.061 r0 = r11.A01
            r13.A02(r0)
            r10.A0X(r13)
            X.7AO r0 = r13.A03
            X.593 r0 = r0.A01
            if (r0 == 0) goto L_0x00cd
            int r0 = r0.A00
            X.7Zx r0 = r6.A09(r0)
            A02(r13, r0, r6)
        L_0x00cd:
            X.7AO r7 = r13.A03
            if (r7 == 0) goto L_0x0055
            X.8Mb r0 = X.C138948Mb.A00
            X.C98436Fn.A00(r0)
            boolean r0 = r3 instanceof X.AnonymousClass59D
            if (r0 == 0) goto L_0x00e9
            java.lang.String r2 = "Destination "
            int r1 = r7.A00
            java.lang.String r0 = " does not have an Intent set."
            java.lang.String r0 = X.AnonymousClass00U.A0S(r2, r0, r1)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00e9:
            X.7F7 r0 = r3.A00()
            X.4wE r3 = r0.A02
            java.lang.Object r2 = r3.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r0 = r3.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = X.AnonymousClass00J.A0E(r0)
            java.util.List r0 = X.AnonymousClass00J.A0U(r2, r0)
            java.util.List r0 = X.AnonymousClass00J.A0X(r13, r0)
            r3.CrC(r0)
            goto L_0x0055
        L_0x010c:
            android.content.Context r14 = r6.A0E
            X.066 r0 = r6.A04
            if (r0 != 0) goto L_0x0148
            X.061 r10 = X.AnonymousClass061.CREATED
        L_0x0114:
            X.58Q r1 = r6.A05
            r2 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r20 = X.C18190wL.A0n(r0)
            r0 = 3
            X.C04220Ms.A0B(r10, r0)
            X.7Zx r13 = new X.7Zx
            r17 = r10
            r19 = r1
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            java.util.List r1 = X.C18180wK.A0n(r13)
            r14 = 6
            kotlin.jvm.internal.KtLambdaShape6S0400000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape6S0400000_I2
            r16 = r6
            r17 = r9
            r18 = r4
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            r6.A08 = r0
            r3.A02(r8, r7, r1)
            r6.A08 = r2
            goto L_0x0054
        L_0x0148:
            X.061 r10 = r6.A03
            goto L_0x0114
        L_0x014b:
            r12 = 0
            goto L_0x002e
        L_0x014e:
            if (r12 != 0) goto L_0x015a
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x015a
            if (r1 != 0) goto L_0x015a
            r6.A0D()
            return
        L_0x015a:
            A06(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KG.A01(android.os.Bundle, X.7KG, X.7AO, X.6sO, X.8dR):void");
    }

    public static final void A02(C123917Zx r1, C123917Zx r2, AnonymousClass7KG r3) {
        r3.A0R.put(r1, r2);
        Map map = r3.A0S;
        if (map.get(r2) == null) {
            map.put(r2, C86144wL.A11());
        }
        Object obj = map.get(r2);
        C04220Ms.A0A(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public static final void A03(C123917Zx r4, AnonymousClass7KG r5, AnonymousClass8AL r6, boolean z) {
        AnonymousClass58Q r2;
        Set set;
        AnonymousClass8AL r1 = r5.A0M;
        C123917Zx r3 = (C123917Zx) r1.A0S();
        if (C04220Ms.A0I(r3, r4)) {
            r1.A0V();
            AnonymousClass7F7 r0 = (AnonymousClass7F7) r5.A0K.get(r5.A07.A00(r3.A03.A05));
            boolean z2 = true;
            if ((r0 == null || (set = (Set) r0.A05.getValue()) == null || !set.contains(r3)) && !r5.A0S.containsKey(r3)) {
                z2 = false;
            }
            AnonymousClass061 r02 = r3.A02.A00;
            AnonymousClass061 r12 = AnonymousClass061.CREATED;
            if (r02.A00(r12)) {
                if (z) {
                    r3.A02(r12);
                    r6.A0W(new NavBackStackEntryState(r3));
                }
                if (!z2) {
                    r3.A02(AnonymousClass061.DESTROYED);
                    r5.A0E(r3);
                } else {
                    r3.A02(r12);
                }
            }
            if (!z && !z2 && (r2 = r5.A05) != null) {
                String str = r3.A0A;
                C04220Ms.A0B(str, 0);
                AnonymousClass06B r03 = (AnonymousClass06B) r2.A00.remove(str);
                if (r03 != null) {
                    r03.A00();
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder A0s = C18190wL.A0s("Attempted to pop ");
        A0s.append(r4.A03);
        A0s.append(", which is not the top of the back stack (");
        throw C18180wK.A0a(C86104wH.A0y(r3.A03, A0s));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r2 > 1) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass7KG r5) {
        /*
            X.00C r4 = r5.A0F
            boolean r0 = r5.A0B
            r3 = 1
            if (r0 == 0) goto L_0x0014
            X.8AL r1 = r5.A0M
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L_0x0019
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0019
        L_0x0014:
            r3 = 0
        L_0x0015:
            r4.A02(r3)
            return
        L_0x0019:
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            X.7Zx r0 = X.C86154wM.A0J(r1)
            X.7AO r0 = r0.A03
            boolean r0 = r0 instanceof X.AnonymousClass593
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001d
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x001d
            X.C06750aI.A19()
            r0 = 0
            throw r0
        L_0x0038:
            if (r2 <= r3) goto L_0x0014
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KG.A04(X.7KG):void");
    }

    public static final boolean A05(Bundle bundle, AnonymousClass7KG r18, C113926sO r19, AnonymousClass8dR r20, int i) {
        AnonymousClass7AO r5;
        String str;
        Object obj;
        C123917Zx r0;
        AnonymousClass7AO r02;
        AnonymousClass061 r9;
        AnonymousClass593 r10;
        AnonymousClass7KG r13 = r18;
        Map map = r13.A0H;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return false;
        }
        String A0r = C18220wO.A0r(valueOf, map);
        C000300e.A0s(map.values(), new KtLambdaShape6S1000000_I2(A0r, 3));
        AbstractCollection abstractCollection = (AbstractCollection) C03940Lk.A02(r13.A0I).remove(A0r);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C123917Zx r03 = (C123917Zx) r13.A0M.A0T();
        if ((r03 == null || (r5 = r03.A03) == null) && (r5 = r13.A06) == null) {
            throw C18180wK.A0a(AnonymousClass000.A00(120));
        }
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                int i2 = navBackStackEntryState.A00;
                AnonymousClass7AO r102 = r5;
                if (r5.A00 != i2) {
                    if (r5 instanceof AnonymousClass593) {
                        r10 = (AnonymousClass593) r102;
                    } else {
                        r10 = r5.A01;
                        C04220Ms.A0A(r10);
                    }
                    r102 = r10.A04(i2);
                }
                if (r102 != null) {
                    Context context = r13.A0E;
                    if (r13.A04 == null) {
                        r9 = AnonymousClass061.CREATED;
                    } else {
                        r9 = r13.A03;
                    }
                    AnonymousClass58Q r11 = r13.A05;
                    C04220Ms.A0B(r9, 2);
                    Bundle bundle2 = navBackStackEntryState.A01;
                    if (bundle2 != null) {
                        bundle2.setClassLoader(context.getClassLoader());
                    } else {
                        bundle2 = null;
                    }
                    String str2 = navBackStackEntryState.A03;
                    Bundle bundle3 = navBackStackEntryState.A02;
                    C04220Ms.A0B(str2, 5);
                    A0v.add(new C123917Zx(context, bundle2, bundle3, r9, r102, r11, str2));
                    r5 = r102;
                } else {
                    String A002 = C98416Fl.A00(r13.A0E, i2);
                    StringBuilder A0s = C18190wL.A0s("Restore State failed: destination ");
                    A0s.append(A002);
                    throw C18180wK.A0a(C86104wH.A0x(r5, " cannot be found from the current destination ", A0s));
                }
            }
        }
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        ArrayList A0v3 = AnonymousClass0wJ.A0v();
        for (Object next : A0v) {
            if (!(((C123917Zx) next).A03 instanceof AnonymousClass593)) {
                A0v3.add(next);
            }
        }
        Iterator it2 = A0v3.iterator();
        while (it2.hasNext()) {
            C123917Zx A0J2 = C86154wM.A0J(it2);
            List list = (List) AnonymousClass00J.A0F(A0v2);
            if (list == null || (r0 = (C123917Zx) AnonymousClass00J.A0E(list)) == null || (r02 = r0.A03) == null) {
                str = null;
            } else {
                str = r02.A05;
            }
            if (!C04220Ms.A0I(str, A0J2.A03.A05)) {
                list = A0v2;
                obj = C06750aI.A18(A0J2);
            } else {
                obj = A0J2;
            }
            list.add(obj);
        }
        C04180Mo r14 = new C04180Mo();
        Iterator it3 = A0v2.iterator();
        while (it3.hasNext()) {
            List list2 = (List) it3.next();
            C114586tX A003 = r13.A07.A00(((C123917Zx) AnonymousClass00J.A0C(list2)).A03.A05);
            r13.A08 = new KtLambdaShape4S0500000_I2(1, bundle, r13, r14, A0v, new AnonymousClass0MZ());
            A003.A02(r19, r20, list2);
            r13.A08 = null;
        }
        return r14.A00;
    }

    public static final boolean A06(AnonymousClass7KG r8) {
        AnonymousClass8AL r1;
        while (true) {
            r1 = r8.A0M;
            if (r1.isEmpty() || !(((C123917Zx) r1.A0S()).A03 instanceof AnonymousClass593)) {
                Object A0T2 = r1.A0T();
            } else {
                A03((C123917Zx) r1.A0S(), r8, new AnonymousClass8AL(), false);
            }
        }
        Object A0T22 = r1.A0T();
        if (A0T22 != null) {
            r8.A0Q.add(A0T22);
        }
        r8.A0D++;
        r8.A0D();
        int i = r8.A0D - 1;
        r8.A0D = i;
        if (i == 0) {
            List list = r8.A0Q;
            C04220Ms.A0B(list, 0);
            ArrayList A0s = C18200wM.A0s(list);
            list.clear();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                C123917Zx A0J2 = C86154wM.A0J(it);
                Iterator it2 = r8.A0L.iterator();
                while (it2.hasNext()) {
                    ((C143168gD) it2.next()).BtZ(A0J2.A06, r8, A0J2.A03);
                }
                r8.A0U.D7t(A0J2);
            }
            r8.A0O.D7t(r8.A0C());
        }
        if (A0T22 == null) {
            return false;
        }
        return true;
    }

    public static final boolean A07(AnonymousClass7KG r20, int i, boolean z, boolean z2) {
        int i2;
        AnonymousClass7AO r8;
        String str;
        C04180Mo r7;
        AnonymousClass7KG r6 = r20;
        AnonymousClass8AL r10 = r6.A0M;
        if (!r10.isEmpty()) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            Iterator it = AnonymousClass00J.A0L(r10).iterator();
            do {
                i2 = i;
                if (it.hasNext()) {
                    r8 = C86154wM.A0J(it).A03;
                    C114586tX A002 = r6.A07.A00(r8.A05);
                    if (z || r8.A00 != i2) {
                        A0v.add(A002);
                    }
                } else {
                    C98416Fl.A00(r6.A0E, i2);
                }
            } while (r8.A00 != i2);
            C04180Mo r5 = new C04180Mo();
            AnonymousClass8AL r4 = new AnonymousClass8AL();
            Iterator it2 = A0v.iterator();
            do {
                boolean z3 = z2;
                if (!it2.hasNext()) {
                    break;
                }
                C114586tX r12 = (C114586tX) it2.next();
                r7 = new C04180Mo();
                C123917Zx r2 = (C123917Zx) r10.A0S();
                C04180Mo r18 = r5;
                AnonymousClass7KG r17 = r6;
                r6.A09 = new KtLambdaShape4S0410000_I2(2, r17, r18, r7, r4, z3);
                if (!(r12 instanceof AnonymousClass59F)) {
                    if (r12 instanceof AnonymousClass59E) {
                        AnonymousClass59E r122 = (AnonymousClass59E) r12;
                        C04220Ms.A0B(r2, 0);
                        C112186p9 r13 = r122.A02;
                        if (r13 != null) {
                            r13.A00(r2.A03, C86144wL.A08(r122.A00().A04.getValue()));
                        }
                        r122.A00().A08(r2, z3);
                        C147368pE.A04(r122.A01, true);
                        C147368pE.A04(r122.A00, false);
                    } else if (!(r12 instanceof AnonymousClass59B) && !(r12 instanceof AnonymousClass59A)) {
                        C04220Ms.A0B(r2, 0);
                        List list = (List) r12.A00().A04.getValue();
                        if (list.contains(r2)) {
                            ListIterator A10 = C86144wL.A10(list);
                            C123917Zx r1 = null;
                            do {
                                if (r12 instanceof AnonymousClass59D) {
                                    Activity activity = ((AnonymousClass59D) r12).A00;
                                    if (activity == null) {
                                        break;
                                    }
                                    activity.finish();
                                }
                                r1 = (C123917Zx) A10.previous();
                            } while (!C04220Ms.A0I(r1, r2));
                            if (r1 != null) {
                                r12.A00().A07(r1, z3);
                            }
                        } else {
                            StringBuilder A0s = C18190wL.A0s("popBackStack was called with ");
                            A0s.append(r2);
                            throw C18180wK.A0a(C86104wH.A0x(list, " which does not exist in back stack ", A0s));
                        }
                    }
                    r6.A09 = null;
                }
                C04220Ms.A0B(r2, 0);
                r12.A00().A08(r2, z3);
                r6.A09 = null;
            } while (r7.A00);
            if (z2) {
                if (!z) {
                    C146838mw A082 = AnonymousClass8bL.A08(r8, AnonymousClass8MX.A00);
                    KtLambdaShape148S0100000_I2_3 A0q = C86164wN.A0q(r6, 9);
                    C04220Ms.A0B(A082, 0);
                    for (AnonymousClass7AO r0 : new C1371186e(A0q, A082)) {
                        Map map = r6.A0H;
                        Integer valueOf = Integer.valueOf(r0.A00);
                        NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) r4.A0R();
                        if (navBackStackEntryState != null) {
                            str = navBackStackEntryState.A03;
                        } else {
                            str = null;
                        }
                        map.put(valueOf, str);
                    }
                }
                if (C18250wR.A1K(r4)) {
                    NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) r4.A0Q();
                    C146838mw A083 = AnonymousClass8bL.A08(r6.A0B(navBackStackEntryState2.A00), AnonymousClass8MY.A00);
                    KtLambdaShape148S0100000_I2_3 A0q2 = C86164wN.A0q(r6, 10);
                    C04220Ms.A0B(A083, 0);
                    for (AnonymousClass7AO r02 : new C1371186e(A0q2, A083)) {
                        r6.A0H.put(Integer.valueOf(r02.A00), navBackStackEntryState2.A03);
                    }
                    r6.A0I.put(navBackStackEntryState2.A03, r4);
                }
            }
            A04(r6);
            return r5.A00;
        }
        return false;
    }

    public final C123917Zx A08() {
        Object obj;
        Iterator it = AnonymousClass00J.A0L(this.A0M).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = AnonymousClass8bL.A09(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((C123917Zx) obj).A03 instanceof AnonymousClass593)) {
                break;
            }
        }
        return (C123917Zx) obj;
    }

    public final C123917Zx A09(int i) {
        Object obj;
        AnonymousClass8AL r1 = this.A0M;
        ListIterator listIterator = r1.listIterator(r1.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C123917Zx) obj).A03.A00 == i) {
                break;
            }
        }
        C123917Zx r12 = (C123917Zx) obj;
        if (r12 != null) {
            return r12;
        }
        StringBuilder A0s = C18190wL.A0s("No destination with ID ");
        A0s.append(i);
        A0s.append(" is on the NavController's back stack. The current destination is ");
        throw C18190wL.A0a(C18200wM.A0m(A0A(), A0s));
    }

    public final AnonymousClass7AO A0A() {
        C123917Zx r0 = (C123917Zx) this.A0M.A0T();
        if (r0 != null) {
            return r0.A03;
        }
        return null;
    }

    public final AnonymousClass7AO A0B(int i) {
        AnonymousClass7AO r1;
        AnonymousClass593 r12;
        AnonymousClass593 r13 = this.A06;
        if (r13 == null) {
            return null;
        }
        if (r13.A00 == i) {
            return r13;
        }
        C123917Zx r0 = (C123917Zx) this.A0M.A0T();
        if (r0 == null || (r1 = r0.A03) == null) {
            r1 = this.A06;
            C04220Ms.A0A(r1);
        }
        if (r1.A00 == i) {
            return r1;
        }
        if (r1 instanceof AnonymousClass593) {
            r12 = (AnonymousClass593) r1;
        } else {
            r12 = r1.A01;
            C04220Ms.A0A(r12);
        }
        return r12.A04(i);
    }

    public final void A0D() {
        AnonymousClass7AO r4;
        Boolean bool;
        AtomicInteger atomicInteger;
        Set set;
        ArrayList A0s = C18200wM.A0s(this.A0M);
        if (!A0s.isEmpty()) {
            AnonymousClass7AO r5 = ((C123917Zx) AnonymousClass00J.A0E(A0s)).A03;
            if (r5 instanceof AnonymousClass8dP) {
                Iterator it = AnonymousClass00J.A0L(A0s).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r4 = C86154wM.A0J(it).A03;
                    if (!(r4 instanceof AnonymousClass593) && !(r4 instanceof AnonymousClass8dP)) {
                        break;
                    }
                }
            }
            r4 = null;
            HashMap A0y = AnonymousClass0wJ.A0y();
            Iterator it2 = AnonymousClass00J.A0L(A0s).iterator();
            while (it2.hasNext()) {
                C123917Zx A0J2 = C86154wM.A0J(it2);
                AnonymousClass061 r8 = A0J2.A01;
                AnonymousClass7AO r7 = A0J2.A03;
                if (r5 != null && r7.A00 == r5.A00) {
                    AnonymousClass061 r6 = AnonymousClass061.RESUMED;
                    if (r8 != r6) {
                        AnonymousClass7F7 r0 = (AnonymousClass7F7) this.A0K.get(this.A07.A00(r7.A05));
                        if (r0 == null || (set = (Set) r0.A05.getValue()) == null) {
                            bool = null;
                        } else {
                            bool = Boolean.valueOf(set.contains(A0J2));
                        }
                        if (C18190wL.A1Z(bool, true) || ((atomicInteger = (AtomicInteger) this.A0S.get(A0J2)) != null && atomicInteger.get() == 0)) {
                            A0y.put(A0J2, AnonymousClass061.STARTED);
                        } else {
                            A0y.put(A0J2, r6);
                        }
                    }
                    r5 = r5.A01;
                } else if (r4 == null || r7.A00 != r4.A00) {
                    A0J2.A02(AnonymousClass061.CREATED);
                } else {
                    if (r8 == AnonymousClass061.RESUMED) {
                        A0J2.A02(AnonymousClass061.STARTED);
                    } else {
                        AnonymousClass061 r02 = AnonymousClass061.STARTED;
                        if (r8 != r02) {
                            A0y.put(A0J2, r02);
                        }
                    }
                    r4 = r4.A01;
                }
            }
            Iterator it3 = A0s.iterator();
            while (it3.hasNext()) {
                C123917Zx A0J3 = C86154wM.A0J(it3);
                AnonymousClass061 r03 = (AnonymousClass061) A0y.get(A0J3);
                if (r03 != null) {
                    A0J3.A02(r03);
                } else {
                    A0J3.A01();
                }
            }
        }
    }

    public final void A0F(C112346pQ r6, C113926sO r7, AnonymousClass8dR r8) {
        AnonymousClass593 r0 = this.A06;
        C04220Ms.A0A(r0);
        C134777yK A012 = r0.A01(r6);
        if (A012 != null) {
            AnonymousClass7AO r4 = A012.A01;
            Bundle A002 = r4.A00(A012.A00);
            if (A002 == null) {
                A002 = C18180wK.A06();
            }
            Intent A0B2 = C18230wP.A0B();
            A0B2.setDataAndType(r6.A00, (String) null);
            A0B2.setAction((String) null);
            A002.putParcelable("android-support-nav:controller:deepLinkIntent", A0B2);
            A01(A002, this, r4, r7, r8);
            return;
        }
        StringBuilder A0s = C18190wL.A0s("Navigation destination that matches request ");
        A0s.append(r6);
        A0s.append(" cannot be found in the navigation graph ");
        throw C18190wL.A0a(C18200wM.A0m(this.A06, A0s));
    }

    public final boolean A0H() {
        if (!this.A0M.isEmpty()) {
            AnonymousClass7AO A0A2 = A0A();
            C04220Ms.A0A(A0A2);
            if (!A07(this, A0A2.A00, true, false) || !A06(this)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final List A0C() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator A0z = C86144wL.A0z(this.A0K);
        while (A0z.hasNext()) {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (Object next : (Iterable) ((AnonymousClass7F7) A0z.next()).A05.getValue()) {
                C123917Zx r1 = (C123917Zx) next;
                if (!A0v.contains(r1) && !r1.A01.A00(AnonymousClass061.STARTED)) {
                    A0v2.add(next);
                }
            }
            C000300e.A0r(A0v2, A0v);
        }
        AnonymousClass8AL r0 = this.A0M;
        ArrayList A0v3 = AnonymousClass0wJ.A0v();
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            C123917Zx r12 = (C123917Zx) next2;
            if (!A0v.contains(r12) && r12.A01.A00(AnonymousClass061.STARTED)) {
                A0v3.add(next2);
            }
        }
        C000300e.A0r(A0v3, A0v);
        ArrayList A0v4 = AnonymousClass0wJ.A0v();
        Iterator it2 = A0v.iterator();
        while (it2.hasNext()) {
            Object next3 = it2.next();
            C18240wQ.A1N(next3, A0v4, ((C123917Zx) next3).A03 instanceof AnonymousClass593 ? 1 : 0);
        }
        return A0v4;
    }
}
