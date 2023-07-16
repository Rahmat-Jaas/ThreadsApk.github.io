package androidx.compose.foundation.gestures;

import X.AnonymousClass0YM;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4Y8;
import X.AnonymousClass8Z8;
import X.C04220Ms;
import X.C120417Am;
import X.C138608Jp;
import X.C142698fR;
import X.C146958n9;
import X.C147258p3;
import X.C18240wQ;
import X.C77644h9;
import X.C86104wH;
import X.C86154wM;
import X.C967266l;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0000000_I2;

public final class DraggableKt {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (X.C18240wQ.A00(r9.invoke(r11)) == com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.A05(((androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r5).A04.A01, r0) != false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0057 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C967266l r11, X.C147828pz r12, X.C146958n9 r13, X.AnonymousClass0YY r14, long r15) {
        /*
            r5 = r12
            r0 = r15
            r4 = r14
            r8 = 1
            r9 = r13
            boolean r2 = kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2.A00(r8, r13)
            if (r2 == 0) goto L_0x00de
            r7 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2) r7
            int r6 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r6 & r3
            if (r2 == 0) goto L_0x00de
            int r6 = r6 - r3
            r7.A00 = r6
        L_0x0019:
            java.lang.Object r3 = r7.A06
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            if (r2 == 0) goto L_0x0085
            if (r2 != r8) goto L_0x00e5
            java.lang.Object r10 = r7.A05
            X.0MQ r10 = (X.AnonymousClass0MQ) r10
            java.lang.Object r12 = r7.A04
            X.8pz r12 = (X.C147828pz) r12
            java.lang.Object r5 = r7.A03
            X.8pz r5 = (X.C147828pz) r5
            java.lang.Object r9 = r7.A02
            X.0YY r9 = (X.AnonymousClass0YY) r9
            java.lang.Object r4 = r7.A01
            X.0YY r4 = (X.AnonymousClass0YY) r4
            X.AnonymousClass0OU.A00(r3)
        L_0x003a:
            X.6kM r3 = (X.C109656kM) r3
            java.util.List r13 = r3.A03
            int r15 = r13.size()
            r14 = 0
        L_0x0043:
            if (r14 >= r15) goto L_0x0057
            java.lang.Object r11 = r13.get(r14)
            r0 = r11
            X.7Es r0 = (X.C121197Es) r0
            long r2 = r0.A04
            long r0 = r10.A00
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x0058
            int r14 = r14 + 1
            goto L_0x0043
        L_0x0057:
            r11 = 0
        L_0x0058:
            X.7Es r11 = (X.C121197Es) r11
            if (r11 == 0) goto L_0x009d
            boolean r0 = X.C121667Hg.A02(r11)
            if (r0 == 0) goto L_0x0077
            int r3 = r13.size()
            r2 = 0
        L_0x0067:
            if (r2 >= r3) goto L_0x00b1
            java.lang.Object r1 = r13.get(r2)
            r0 = r1
            X.7Es r0 = (X.C121197Es) r0
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x00b2
            int r2 = r2 + 1
            goto L_0x0067
        L_0x0077:
            java.lang.Object r0 = r9.invoke(r11)
            float r1 = X.C18240wQ.A00(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00ca
            goto L_0x00ba
        L_0x0085:
            X.AnonymousClass0OU.A00(r3)
            X.66l r2 = X.C967266l.Vertical
            if (r11 != r2) goto L_0x00db
            X.8L6 r9 = X.AnonymousClass8L6.A00
        L_0x008e:
            X.0YY r9 = (X.AnonymousClass0YY) r9
            r2 = r5
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r2
            X.54D r2 = r2.A04
            X.6kM r2 = r2.A01
            boolean r2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A05(r2, r0)
            if (r2 == 0) goto L_0x00a8
        L_0x009d:
            r1 = 0
        L_0x009e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x00a3:
            r4.invoke(r11)
            long r0 = r11.A04
        L_0x00a8:
            X.0MQ r10 = new X.0MQ
            r10.<init>()
            r10.A00 = r0
            r12 = r5
            goto L_0x00ba
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            X.7Es r1 = (X.C121197Es) r1
            if (r1 == 0) goto L_0x00ca
            long r0 = r1.A04
            r10.A00 = r0
        L_0x00ba:
            X.C86154wM.A1S(r4, r9, r5, r12, r7)
            r7.A05 = r10
            r7.A00 = r8
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r3 = r12.AA5(r0, r7)
            if (r3 != r6) goto L_0x003a
            return r6
        L_0x00ca:
            r1 = 1
            boolean r0 = r11.A02()
            if (r0 != 0) goto L_0x009d
            boolean r0 = X.C121667Hg.A02(r11)
            if (r0 == 0) goto L_0x00a3
            r4.invoke(r11)
            goto L_0x009e
        L_0x00db:
            X.8L7 r9 = X.AnonymousClass8L7.A00
            goto L_0x008e
        L_0x00de:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2
            r7.<init>(r13)
            goto L_0x0019
        L_0x00e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.A02(X.66l, X.8pz, X.8n9, X.0YY, long):java.lang.Object");
    }

    public static /* synthetic */ Modifier A00(C142698fR r16, C967266l r17, C147258p3 r18, Modifier modifier, AnonymousClass0YM r20, int i, boolean z, boolean z2) {
        AnonymousClass0YY r4;
        AnonymousClass0YM r1 = r20;
        C147258p3 r7 = r18;
        KtSLambdaShape1S0000000_I2 ktSLambdaShape1S0000000_I2 = null;
        int i2 = i;
        boolean A1Z = C86154wM.A1Z(i & 4, z);
        if ((i & 8) != 0) {
            r7 = null;
        }
        boolean A1R = C18240wQ.A1R(i & 16, z2);
        if ((i & 32) != 0) {
            ktSLambdaShape1S0000000_I2 = new KtSLambdaShape1S0000000_I2(0);
        }
        if ((i & 64) != 0) {
            r1 = new KtSLambdaShape1S0000000_I2(1);
        }
        boolean A1R2 = C18240wQ.A1R(i2 & 128, false);
        C142698fR r5 = r16;
        Modifier modifier2 = modifier;
        AnonymousClass0wJ.A1N(modifier2, r5);
        C967266l r6 = r17;
        C04220Ms.A0B(r6, 2);
        C86104wH.A1P(ktSLambdaShape1S0000000_I2, 6, r1);
        C77644h9 r9 = C77644h9.A00;
        AnonymousClass4Y8 r8 = new AnonymousClass4Y8(A1R);
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(r6, (C146958n9) null, r1);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r4 = new C138608Jp(r5, r6, r7, r8, r9, ktSLambdaShape1S0000000_I2, draggableKt$draggable$5, A1Z, A1R2);
        } else {
            r4 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier2, r4, new AnonymousClass8Z8(r5, r6, r7, r8, r9, ktSLambdaShape1S0000000_I2, draggableKt$draggable$5, A1Z, A1R2));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0145 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018a A[SYNTHETIC] */
    public static final java.lang.Object A01(X.C967266l r17, X.C81784oM r18, X.C81784oM r19, X.C147828pz r20, X.C113636rr r21, X.C146958n9 r22) {
        /*
            r1 = r18
            r4 = r17
            r9 = r22
            r3 = r19
            r7 = r21
            r6 = r20
            boolean r0 = r9 instanceof X.C137868Ap
            if (r0 == 0) goto L_0x0249
            r5 = r9
            X.8Ap r5 = (X.C137868Ap) r5
            int r8 = r5.A04
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r8 & r2
            if (r0 == 0) goto L_0x0249
            int r8 = r8 - r2
            r5.A04 = r8
        L_0x001e:
            java.lang.Object r11 = r5.A0B
            X.D0E r15 = X.D0E.COROUTINE_SUSPENDED
            int r12 = r5.A04
            r10 = 4
            r20 = 3
            r8 = 2
            r2 = 0
            r9 = 1
            r13 = 0
            if (r12 == 0) goto L_0x0061
            if (r12 == r9) goto L_0x0079
            if (r12 == r8) goto L_0x00d3
            r0 = r20
            if (r12 == r0) goto L_0x0146
            if (r12 != r10) goto L_0x0250
            float r7 = r5.A02
            float r14 = r5.A01
            float r10 = r5.A00
            int r12 = r5.A03
            java.lang.Object r2 = r5.A0A
            X.7Es r2 = (X.C121197Es) r2
            java.lang.Object r8 = r5.A09
            X.0MQ r8 = (X.AnonymousClass0MQ) r8
            java.lang.Object r4 = r5.A08
            X.8kv r4 = (X.C145688kv) r4
            java.lang.Object r6 = r5.A07
            X.8pz r6 = (X.C147828pz) r6
            java.lang.Object r9 = r5.A06
            X.0YP r9 = (X.AnonymousClass0YP) r9
            java.lang.Object r3 = r5.A05
            X.0MQ r3 = (X.AnonymousClass0MQ) r3
            X.AnonymousClass0OU.A00(r11)
        L_0x005a:
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0125
        L_0x0060:
            return r13
        L_0x0061:
            X.AnonymousClass0OU.A00(r11)
            X.67C r0 = X.AnonymousClass67C.Initial
            r5.A05 = r6
            r5.A06 = r1
            r5.A07 = r3
            r5.A08 = r7
            r5.A09 = r4
            r5.A04 = r9
            java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r6, r0, r5, r2)
            if (r11 != r15) goto L_0x008d
        L_0x0078:
            return r15
        L_0x0079:
            java.lang.Object r4 = r5.A09
            java.lang.Object r7 = r5.A08
            X.6rr r7 = (X.C113636rr) r7
            java.lang.Object r3 = r5.A07
            X.4oM r3 = (X.C81784oM) r3
            java.lang.Object r1 = r5.A06
            X.4oM r1 = (X.C81784oM) r1
            java.lang.Object r0 = r5.A05
            X.8pz r6 = X.C86164wN.A0H(r0, r11)
        L_0x008d:
            X.7Es r11 = (X.C121197Es) r11
            java.lang.Object r0 = r1.getValue()
            X.0YY r0 = (X.AnonymousClass0YY) r0
            java.lang.Object r0 = r0.invoke(r11)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r3.getValue()
            java.lang.Object r0 = X.C86144wL.A0j(r0)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x00be
            r11.A01()
            X.C98216Eq.A00(r11, r7)
            long r0 = X.AnonymousClass7KC.A03
            X.7KC r0 = X.C86124wJ.A0O(r0)
            kotlin.Pair r13 = X.C18180wK.A0p(r11, r0)
            return r13
        L_0x00be:
            r5.A05 = r6
            r5.A06 = r7
            r5.A07 = r4
            r5.A08 = r13
            r5.A09 = r13
            r5.A04 = r8
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r6, r0, r5, r2)
            if (r11 != r15) goto L_0x00df
            return r15
        L_0x00d3:
            java.lang.Object r4 = r5.A07
            java.lang.Object r7 = r5.A06
            X.6rr r7 = (X.C113636rr) r7
            java.lang.Object r0 = r5.A05
            X.8pz r6 = X.C86164wN.A0H(r0, r11)
        L_0x00df:
            X.7Es r11 = (X.C121197Es) r11
            X.C98216Eq.A00(r11, r7)
            X.0MQ r3 = new X.0MQ
            r3.<init>()
            long r0 = X.AnonymousClass7KC.A03
            r3.A00 = r0
            kotlin.jvm.internal.KtLambdaShape48S0200000_I2 r9 = new kotlin.jvm.internal.KtLambdaShape48S0200000_I2
            r9.<init>(r2, r3, r7)
            long r0 = r11.A04
            int r10 = r11.A03
            X.C04220Ms.A0B(r4, r2)
            X.66l r2 = X.C967266l.Vertical
            if (r4 != r2) goto L_0x0245
            X.8kv r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02
        L_0x00ff:
            r2 = r6
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r2
            X.54D r7 = r2.A04
            X.6kM r2 = r7.A01
            boolean r2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A05(r2, r0)
            if (r2 != 0) goto L_0x0060
            X.8lf r7 = r7.A05
            boolean r2 = X.AnonymousClass0wJ.A1T(r10, r8)
            float r10 = r7.BHh()
            if (r2 == 0) goto L_0x011b
            float r2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00
            float r10 = r10 * r2
        L_0x011b:
            X.0MQ r8 = new X.0MQ
            r8.<init>()
            r8.A00 = r0
            r14 = 0
            r12 = 1
            r7 = 0
        L_0x0125:
            r5.A05 = r3
            r5.A06 = r9
            r5.A07 = r6
            r5.A08 = r4
            r5.A09 = r8
            r5.A0A = r13
            r5.A03 = r12
            r5.A00 = r10
            r5.A01 = r14
            r5.A02 = r7
            r0 = r20
            r5.A04 = r0
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r11 = r6.AA5(r0, r5)
            if (r11 != r15) goto L_0x0165
            return r15
        L_0x0146:
            float r7 = r5.A02
            float r14 = r5.A01
            float r10 = r5.A00
            int r12 = r5.A03
            java.lang.Object r8 = r5.A09
            X.0MQ r8 = (X.AnonymousClass0MQ) r8
            java.lang.Object r4 = r5.A08
            X.8kv r4 = (X.C145688kv) r4
            java.lang.Object r6 = r5.A07
            X.8pz r6 = (X.C147828pz) r6
            java.lang.Object r9 = r5.A06
            X.0YP r9 = (X.AnonymousClass0YP) r9
            java.lang.Object r3 = r5.A05
            X.0MQ r3 = (X.AnonymousClass0MQ) r3
            X.AnonymousClass0OU.A00(r11)
        L_0x0165:
            X.6kM r11 = (X.C109656kM) r11
            java.util.List r0 = r11.A03
            r21 = r0
            int r19 = r21.size()
            r11 = 0
        L_0x0170:
            r0 = r19
            if (r11 >= r0) goto L_0x018a
            r0 = r21
            java.lang.Object r2 = r0.get(r11)
            r0 = r2
            X.7Es r0 = (X.C121197Es) r0
            long r0 = r0.A04
            r17 = r0
            long r0 = r8.A00
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x018b
            int r11 = r11 + 1
            goto L_0x0170
        L_0x018a:
            r2 = 0
        L_0x018b:
            X.7Es r2 = (X.C121197Es) r2
            if (r2 == 0) goto L_0x0060
            boolean r0 = r2.A02()
            if (r0 != 0) goto L_0x0060
            boolean r0 = X.C121667Hg.A02(r2)
            if (r0 == 0) goto L_0x01bd
            int r2 = r21.size()
            r1 = 0
        L_0x01a0:
            if (r1 >= r2) goto L_0x01b2
            r0 = r21
            java.lang.Object r11 = r0.get(r1)
            r0 = r11
            X.7Es r0 = (X.C121197Es) r0
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x01b3
            int r1 = r1 + 1
            goto L_0x01a0
        L_0x01b2:
            r11 = 0
        L_0x01b3:
            X.7Es r11 = (X.C121197Es) r11
            if (r11 == 0) goto L_0x0060
            long r0 = r11.A04
            r8.A00 = r0
            goto L_0x0125
        L_0x01bd:
            long r0 = r2.A05
            r21 = r0
            long r0 = r2.A06
            r17 = r0
            r0 = r21
            float r11 = r4.BeQ(r0)
            r0 = r17
            float r0 = r4.BeQ(r0)
            float r11 = r11 - r0
            r0 = r21
            float r16 = r4.AGj(r0)
            r0 = r17
            float r0 = r4.AGj(r0)
            float r16 = r16 - r0
            float r11 = r11 + r14
            float r7 = r7 + r16
            if (r12 == 0) goto L_0x020f
            float r1 = java.lang.Math.abs(r11)
        L_0x01e9:
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0218
            X.67C r1 = X.AnonymousClass67C.Final
            r5.A05 = r3
            r5.A06 = r9
            r5.A07 = r6
            r5.A08 = r4
            r5.A09 = r8
            r5.A0A = r2
            r5.A03 = r12
            r5.A00 = r10
            r5.A01 = r11
            r5.A02 = r7
            r0 = 4
            r5.A04 = r0
            java.lang.Object r0 = r6.AA5(r1, r5)
            if (r0 == r15) goto L_0x0078
            r14 = r11
            goto L_0x005a
        L_0x020f:
            long r0 = r4.Biq(r11, r7)
            float r1 = X.AnonymousClass7KC.A00(r0)
            goto L_0x01e9
        L_0x0218:
            if (r12 == 0) goto L_0x023c
            float r0 = java.lang.Math.signum(r11)
            float r0 = r0 * r10
            float r11 = r11 - r0
            long r0 = r4.Biq(r11, r7)
        L_0x0224:
            X.7KC r0 = X.C86124wJ.A0O(r0)
            r9.invoke(r2, r0)
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0241
            long r0 = r3.A00
            X.7KC r0 = X.C86124wJ.A0O(r0)
            kotlin.Pair r13 = X.C18180wK.A0p(r2, r0)
            return r13
        L_0x023c:
            long r0 = X.AnonymousClass7FN.A01(r4, r11, r7, r1, r10)
            goto L_0x0224
        L_0x0241:
            r7 = 0
            r14 = 0
            goto L_0x0125
        L_0x0245:
            X.8kv r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A01
            goto L_0x00ff
        L_0x0249:
            X.8Ap r5 = new X.8Ap
            r5.<init>(r9)
            goto L_0x001e
        L_0x0250:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.A01(X.66l, X.4oM, X.4oM, X.8pz, X.6rr, X.8n9):java.lang.Object");
    }
}
