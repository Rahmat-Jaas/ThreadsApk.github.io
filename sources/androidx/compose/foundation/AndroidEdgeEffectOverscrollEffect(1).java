package androidx.compose.foundation;

import X.AnonymousClass0YY;
import X.AnonymousClass54x;
import X.AnonymousClass6WK;
import X.AnonymousClass7CA;
import X.AnonymousClass7JK;
import X.AnonymousClass7KC;
import X.AnonymousClass7V9;
import X.AnonymousClass7WP;
import X.AnonymousClass8bA;
import X.C04220Ms;
import X.C06750aI;
import X.C114206sr;
import X.C114476tM;
import X.C121617Ha;
import X.C121657He;
import X.C146058lZ;
import X.C146958n9;
import X.C147368pE;
import X.C147848q1;
import X.C86104wH;
import X.C86144wL;
import X.C98256Eu;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape145S0100000_I2;

public final class AndroidEdgeEffectOverscrollEffect implements C146058lZ {
    public long A00;
    public AnonymousClass7KC A01;
    public C114206sr A02;
    public boolean A03;
    public final EdgeEffect A04;
    public final EdgeEffect A05;
    public final EdgeEffect A06;
    public final EdgeEffect A07;
    public final EdgeEffect A08;
    public final EdgeEffect A09;
    public final EdgeEffect A0A;
    public final EdgeEffect A0B;
    public final C114476tM A0C;
    public final C147368pE A0D;
    public final Modifier A0E;
    public final List A0F;
    public final AnonymousClass0YY A0G;

    public AndroidEdgeEffectOverscrollEffect(Context context, C114476tM r10) {
        AnonymousClass0YY r0;
        C04220Ms.A0B(context, 1);
        this.A0C = r10;
        EdgeEffect A022 = C121617Ha.A02(context);
        this.A0A = A022;
        EdgeEffect A023 = C121617Ha.A02(context);
        this.A04 = A023;
        EdgeEffect A024 = C121617Ha.A02(context);
        this.A06 = A024;
        EdgeEffect A025 = C121617Ha.A02(context);
        this.A08 = A025;
        List A17 = C06750aI.A17(A024, A022, A025, A023);
        this.A0F = A17;
        this.A0B = C121617Ha.A02(context);
        this.A05 = C121617Ha.A02(context);
        this.A07 = C121617Ha.A02(context);
        this.A09 = C121617Ha.A02(context);
        int size = A17.size();
        for (int i = 0; i < size; i++) {
            ((EdgeEffect) A17.get(i)).setColor(C121657He.A01(this.A0C.A00));
        }
        Unit unit = Unit.A00;
        this.A0D = C86104wH.A0I(AnonymousClass7WP.A00, unit, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        this.A00 = AnonymousClass7JK.A02;
        KtLambdaShape145S0100000_I2 A16 = C86144wL.A16(this, 19);
        this.A0G = A16;
        Modifier modifier = AnonymousClass6WK.A00;
        C04220Ms.A0B(modifier, 0);
        Modifier A002 = C98256Eu.A00(AnonymousClass7CA.A01(modifier, unit, new KtSLambdaShape14S0201000_I2(this, (C146958n9) null, 2)), A16);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86144wL.A16(this, 20);
        } else {
            r0 = InspectableValueKt.A00;
        }
        this.A0E = A002.Cx6(new AnonymousClass54x(this, r0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A92(X.C146958n9 r11, X.AnonymousClass0YP r12, long r13) {
        /*
            r10 = this;
            r4 = 0
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2.A00(r4, r11)
            if (r0 == 0) goto L_0x013a
            r3 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x013a
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r6 = r3.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r2 = 2
            r7 = 1
            r9 = 0
            if (r0 == 0) goto L_0x008c
            if (r0 == r7) goto L_0x0088
            if (r0 != r2) goto L_0x0141
            long r0 = r3.A01
            java.lang.Object r3 = r3.A02
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r3 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r3
            X.AnonymousClass0OU.A00(r6)
        L_0x002d:
            X.7HA r6 = (X.AnonymousClass7HA) r6
            long r5 = r6.A00
            long r5 = X.AnonymousClass7HA.A00(r0, r5)
            r3.A03 = r4
            float r2 = X.C86104wH.A00(r5)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x007c
            android.widget.EdgeEffect r1 = r3.A06
            int r0 = X.AnonymousClass8bA.A02(r2)
        L_0x0045:
            X.C121617Ha.A04(r1, r0)
        L_0x0048:
            int r0 = X.C86104wH.A08(r5)
            float r2 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0070
            android.widget.EdgeEffect r1 = r3.A0A
            int r0 = X.AnonymousClass8bA.A02(r2)
        L_0x005a:
            X.C121617Ha.A04(r1, r0)
        L_0x005d:
            long r1 = X.AnonymousClass7HA.A01
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            X.8pE r1 = r3.A0D
            kotlin.Unit r0 = kotlin.Unit.A00
            r1.CrC(r0)
        L_0x006a:
            A04(r3)
        L_0x006d:
            kotlin.Unit r5 = kotlin.Unit.A00
        L_0x006f:
            return r5
        L_0x0070:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            android.widget.EdgeEffect r1 = r3.A04
            int r0 = X.AnonymousClass8bA.A02(r2)
            int r0 = -r0
            goto L_0x005a
        L_0x007c:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0048
            android.widget.EdgeEffect r1 = r3.A08
            int r0 = X.AnonymousClass8bA.A02(r2)
            int r0 = -r0
            goto L_0x0045
        L_0x0088:
            X.AnonymousClass0OU.A00(r6)
            goto L_0x006d
        L_0x008c:
            X.AnonymousClass0OU.A00(r6)
            long r0 = r10.A00
            float r6 = X.AnonymousClass7JK.A02(r0)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x012c
            float r0 = X.AnonymousClass7JK.A00(r0)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x012c
            float r1 = X.C86104wH.A00(r13)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0116
            android.widget.EdgeEffect r6 = r10.A06
            float r0 = X.C121617Ha.A00(r6)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0116
            int r0 = X.AnonymousClass8bA.A02(r1)
        L_0x00b7:
            X.C121617Ha.A04(r6, r0)
        L_0x00ba:
            int r0 = X.C86104wH.A08(r13)
            float r7 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0100
            android.widget.EdgeEffect r6 = r10.A0A
            float r0 = X.C121617Ha.A00(r6)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0100
            int r0 = X.AnonymousClass8bA.A02(r7)
        L_0x00d4:
            X.C121617Ha.A04(r6, r0)
        L_0x00d7:
            long r0 = X.C86104wH.A0C(r1, r7)
            long r7 = X.AnonymousClass7HA.A01
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x00e8
            X.8pE r7 = r10.A0D
            kotlin.Unit r6 = kotlin.Unit.A00
            r7.CrC(r6)
        L_0x00e8:
            long r0 = X.AnonymousClass7HA.A00(r13, r0)
            X.7HA r6 = new X.7HA
            r6.<init>(r0)
            r3.A02 = r10
            r3.A01 = r0
            r3.A00 = r2
            java.lang.Object r6 = r12.invoke(r6, r3)
            if (r6 == r5) goto L_0x006f
            r3 = r10
            goto L_0x002d
        L_0x0100:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0114
            android.widget.EdgeEffect r6 = r10.A04
            float r0 = X.C121617Ha.A00(r6)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0114
            int r0 = X.AnonymousClass8bA.A02(r7)
            int r0 = -r0
            goto L_0x00d4
        L_0x0114:
            r7 = 0
            goto L_0x00d7
        L_0x0116:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x012a
            android.widget.EdgeEffect r6 = r10.A08
            float r0 = X.C121617Ha.A00(r6)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x012a
            int r0 = X.AnonymousClass8bA.A02(r1)
            int r0 = -r0
            goto L_0x00b7
        L_0x012a:
            r1 = 0
            goto L_0x00ba
        L_0x012c:
            X.7HA r0 = new X.7HA
            r0.<init>(r13)
            r3.A00 = r7
            java.lang.Object r0 = r12.invoke(r0, r3)
            if (r0 != r5) goto L_0x006d
            return r5
        L_0x013a:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2
            r3.<init>(r10, r11, r4)
            goto L_0x0015
        L_0x0141:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A92(X.8n9, X.0YP, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0141, code lost:
        if (r3.isFinished() != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0162, code lost:
        if (r3.isFinished() != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0182, code lost:
        if (r3.isFinished() == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0190, code lost:
        if (r6 == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0192, code lost:
        if (r10 == false) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0197  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A93(X.AnonymousClass0YY r15, int r16, long r17) {
        /*
            r14 = this;
            r0 = 2
            X.C04220Ms.A0B(r15, r0)
            long r1 = r14.A00
            float r0 = X.AnonymousClass7JK.A02(r1)
            r8 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = r17
            if (r0 <= 0) goto L_0x01d1
            float r0 = X.AnonymousClass7JK.A00(r1)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d1
            boolean r0 = r14.A03
            r10 = 1
            if (r0 != 0) goto L_0x0060
            long r2 = X.AnonymousClass7An.A01(r1)
            android.widget.EdgeEffect r0 = r14.A06
            float r0 = X.C121617Ha.A00(r0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            long r0 = X.AnonymousClass7KC.A03
            r14.A01(r0, r2)
        L_0x0031:
            android.widget.EdgeEffect r0 = r14.A08
            float r0 = X.C121617Ha.A00(r0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            long r0 = X.AnonymousClass7KC.A03
            r14.A02(r0, r2)
        L_0x0040:
            android.widget.EdgeEffect r0 = r14.A0A
            float r0 = X.C121617Ha.A00(r0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x004f
            long r0 = X.AnonymousClass7KC.A03
            r14.A03(r0, r2)
        L_0x004f:
            android.widget.EdgeEffect r0 = r14.A04
            float r0 = X.C121617Ha.A00(r0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
            long r0 = X.AnonymousClass7KC.A03
            r14.A00(r0, r2)
        L_0x005e:
            r14.A03 = r10
        L_0x0060:
            X.7KC r0 = r14.A01
            if (r0 == 0) goto L_0x01c9
            long r2 = r0.A00
        L_0x0066:
            float r0 = X.AnonymousClass7KC.A02(r4)
            r6 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01c6
            android.widget.EdgeEffect r1 = r14.A0A
            float r0 = X.C121617Ha.A00(r1)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x01c0
            android.widget.EdgeEffect r1 = r14.A04
            float r0 = X.C121617Ha.A00(r1)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01c6
            float r7 = r14.A00(r4, r2)
        L_0x0087:
            float r0 = X.C121617Ha.A00(r1)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0092
            r1.onRelease()
        L_0x0092:
            float r0 = X.AnonymousClass7KC.A01(r4)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            android.widget.EdgeEffect r1 = r14.A06
            float r0 = X.C121617Ha.A00(r1)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x01ba
            android.widget.EdgeEffect r1 = r14.A08
            float r0 = X.C121617Ha.A00(r1)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            float r6 = r14.A02(r4, r2)
        L_0x00b2:
            float r0 = X.C121617Ha.A00(r1)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00bd
            r1.onRelease()
        L_0x00bd:
            long r0 = X.C86104wH.A0C(r6, r7)
            long r7 = X.AnonymousClass7KC.A03
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x00ce
            X.8pE r7 = r14.A0D
            kotlin.Unit r6 = kotlin.Unit.A00
            r7.CrC(r6)
        L_0x00ce:
            long r6 = X.AnonymousClass7KC.A04(r4, r0)
            X.7KC r8 = X.C86124wJ.A0O(r6)
            java.lang.Object r8 = r15.invoke(r8)
            X.7KC r8 = (X.AnonymousClass7KC) r8
            long r8 = r8.A00
            long r6 = X.AnonymousClass7KC.A04(r6, r8)
            r11 = r16
            if (r11 != r10) goto L_0x01b7
            float r10 = X.AnonymousClass7KC.A01(r6)
            r13 = -1090519040(0xffffffffbf000000, float:-0.5)
            r12 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x01a7
            r14.A01(r6, r2)
        L_0x00f5:
            r11 = 1
        L_0x00f6:
            float r10 = X.AnonymousClass7KC.A02(r6)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0197
            r14.A03(r6, r2)
        L_0x0101:
            r2 = 1
        L_0x0102:
            if (r11 != 0) goto L_0x0106
            if (r2 == 0) goto L_0x01b7
        L_0x0106:
            r10 = 1
        L_0x0107:
            android.widget.EdgeEffect r3 = r14.A06
            boolean r2 = r3.isFinished()
            r7 = 0
            if (r2 != 0) goto L_0x0195
            float r2 = X.AnonymousClass7KC.A01(r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0195
            float r2 = X.AnonymousClass7KC.A01(r4)
            X.C121617Ha.A03(r3, r2)
            boolean r6 = r3.isFinished()
        L_0x0123:
            android.widget.EdgeEffect r3 = r14.A08
            boolean r2 = r3.isFinished()
            if (r2 != 0) goto L_0x0144
            float r2 = X.AnonymousClass7KC.A01(r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0144
            float r2 = X.AnonymousClass7KC.A01(r4)
            X.C121617Ha.A03(r3, r2)
            if (r6 != 0) goto L_0x0143
            boolean r2 = r3.isFinished()
            r6 = 0
            if (r2 == 0) goto L_0x0144
        L_0x0143:
            r6 = 1
        L_0x0144:
            android.widget.EdgeEffect r3 = r14.A0A
            boolean r2 = r3.isFinished()
            if (r2 != 0) goto L_0x0165
            float r2 = X.AnonymousClass7KC.A02(r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0165
            float r2 = X.AnonymousClass7KC.A02(r4)
            X.C121617Ha.A03(r3, r2)
            if (r6 != 0) goto L_0x0164
            boolean r2 = r3.isFinished()
            r6 = 0
            if (r2 == 0) goto L_0x0165
        L_0x0164:
            r6 = 1
        L_0x0165:
            android.widget.EdgeEffect r3 = r14.A04
            boolean r2 = r3.isFinished()
            if (r2 != 0) goto L_0x0190
            float r2 = X.AnonymousClass7KC.A02(r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0190
            float r2 = X.AnonymousClass7KC.A02(r4)
            X.C121617Ha.A03(r3, r2)
            if (r6 != 0) goto L_0x0184
            boolean r2 = r3.isFinished()
            if (r2 == 0) goto L_0x0192
        L_0x0184:
            X.8pE r3 = r14.A0D
            kotlin.Unit r2 = kotlin.Unit.A00
            r3.CrC(r2)
        L_0x018b:
            long r0 = X.AnonymousClass7KC.A05(r0, r8)
            return r0
        L_0x0190:
            if (r6 != 0) goto L_0x0184
        L_0x0192:
            if (r10 == 0) goto L_0x018b
            goto L_0x0184
        L_0x0195:
            r6 = 0
            goto L_0x0123
        L_0x0197:
            float r10 = X.AnonymousClass7KC.A02(r6)
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x01a4
            r14.A00(r6, r2)
            goto L_0x0101
        L_0x01a4:
            r2 = 0
            goto L_0x0102
        L_0x01a7:
            float r10 = X.AnonymousClass7KC.A01(r6)
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x01b4
            r14.A02(r6, r2)
            goto L_0x00f5
        L_0x01b4:
            r11 = 0
            goto L_0x00f6
        L_0x01b7:
            r10 = 0
            goto L_0x0107
        L_0x01ba:
            float r6 = r14.A01(r4, r2)
            goto L_0x00b2
        L_0x01c0:
            float r7 = r14.A03(r4, r2)
            goto L_0x0087
        L_0x01c6:
            r7 = 0
            goto L_0x0092
        L_0x01c9:
            long r0 = r14.A00
            long r2 = X.AnonymousClass7An.A01(r0)
            goto L_0x0066
        L_0x01d1:
            X.7KC r0 = X.C86124wJ.A0O(r4)
            java.lang.Object r0 = r15.invoke(r0)
            X.7KC r0 = (X.AnonymousClass7KC) r0
            long r0 = r0.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A93(X.0YY, int, long):long");
    }

    public static final void A04(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        List list = androidEdgeEffectOverscrollEffect.A0F;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished()) {
                boolean z2 = z;
                z = false;
                if (!z2) {
                }
            }
            z = true;
        }
        if (z) {
            androidEdgeEffectOverscrollEffect.A0D.CrC(Unit.A00);
        }
    }

    public final Modifier Aep() {
        return this.A0E;
    }

    public final boolean BUw() {
        List list = this.A0F;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C121617Ha.A00((EdgeEffect) list.get(i)) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                return true;
            }
        }
        return false;
    }

    private final float A00(long j, long j2) {
        float A012 = AnonymousClass7KC.A01(j2);
        long j3 = this.A00;
        float A022 = A012 / AnonymousClass7JK.A02(j3);
        EdgeEffect edgeEffect = this.A04;
        float A002 = (-C121617Ha.A01(edgeEffect, -(AnonymousClass7KC.A02(j) / AnonymousClass7JK.A00(j3)), ((float) 1) - A022)) * AnonymousClass7JK.A00(this.A00);
        if (C121617Ha.A00(edgeEffect) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return AnonymousClass7KC.A02(j);
        }
        return A002;
    }

    private final float A01(long j, long j2) {
        float A022 = AnonymousClass7KC.A02(j2);
        long j3 = this.A00;
        float A002 = A022 / AnonymousClass7JK.A00(j3);
        EdgeEffect edgeEffect = this.A06;
        float A012 = C121617Ha.A01(edgeEffect, AnonymousClass7KC.A01(j) / AnonymousClass7JK.A02(j3), ((float) 1) - A002) * AnonymousClass7JK.A02(this.A00);
        if (C121617Ha.A00(edgeEffect) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return AnonymousClass7KC.A01(j);
        }
        return A012;
    }

    private final float A02(long j, long j2) {
        float A022 = AnonymousClass7KC.A02(j2);
        long j3 = this.A00;
        float A002 = A022 / AnonymousClass7JK.A00(j3);
        EdgeEffect edgeEffect = this.A08;
        float A023 = (-C121617Ha.A01(edgeEffect, -(AnonymousClass7KC.A01(j) / AnonymousClass7JK.A02(j3)), A002)) * AnonymousClass7JK.A02(this.A00);
        if (C121617Ha.A00(edgeEffect) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return AnonymousClass7KC.A01(j);
        }
        return A023;
    }

    private final float A03(long j, long j2) {
        float A012 = AnonymousClass7KC.A01(j2);
        long j3 = this.A00;
        float A022 = A012 / AnonymousClass7JK.A02(j3);
        EdgeEffect edgeEffect = this.A0A;
        float A013 = C121617Ha.A01(edgeEffect, AnonymousClass7KC.A02(j) / AnonymousClass7JK.A00(j3), A022) * AnonymousClass7JK.A00(this.A00);
        if (C121617Ha.A00(edgeEffect) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return AnonymousClass7KC.A02(j);
        }
        return A013;
    }

    public static final boolean A05(Canvas canvas, EdgeEffect edgeEffect, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C147848q1 r9) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        float CxL = r9.CxL(((AnonymousClass7V9) androidEdgeEffectOverscrollEffect.A0C.A01).A00);
        long j = androidEdgeEffectOverscrollEffect.A00;
        canvas.translate(-AnonymousClass7JK.A02(j), (-AnonymousClass7JK.A00(j)) + CxL);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static final boolean A06(Canvas canvas, EdgeEffect edgeEffect, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C147848q1 r7) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-AnonymousClass7JK.A00(androidEdgeEffectOverscrollEffect.A00), r7.CxL(androidEdgeEffectOverscrollEffect.A0C.A01.ABa(r7.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static final boolean A07(Canvas canvas, EdgeEffect edgeEffect, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C147848q1 r8) {
        int save = canvas.save();
        int A022 = AnonymousClass8bA.A02(AnonymousClass7JK.A02(androidEdgeEffectOverscrollEffect.A00));
        float ABe = androidEdgeEffectOverscrollEffect.A0C.A01.ABe(r8.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (-((float) A022)) + r8.CxL(ABe));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
}
