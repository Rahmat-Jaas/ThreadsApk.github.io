package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass7HA;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.Unit;

public class KtSLambdaShape0S0101200_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public final int A04 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0101200_I2(C146958n9 r2, long j, long j2) {
        super(2, r2);
        this.A01 = j;
        this.A02 = j2;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        C146958n9 r3 = r10;
        if (this.A04 != 0) {
            KtSLambdaShape0S0101200_I2 ktSLambdaShape0S0101200_I2 = new KtSLambdaShape0S0101200_I2(r3, this.A01, this.A02);
            ktSLambdaShape0S0101200_I2.A03 = obj;
            return ktSLambdaShape0S0101200_I2;
        }
        KtSLambdaShape0S0101200_I2 ktSLambdaShape0S0101200_I22 = new KtSLambdaShape0S0101200_I2((ScrollingLogic) this.A03, r10);
        ktSLambdaShape0S0101200_I22.A01 = ((AnonymousClass7HA) obj).A00;
        return ktSLambdaShape0S0101200_I22;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C146958n9 create;
        if (this.A04 != 0) {
            create = C18220wO.A10(obj2, obj, this);
        } else {
            create = create(new AnonymousClass7HA(((AnonymousClass7HA) obj).A00), (C146958n9) obj2);
        }
        return ((KtSLambdaShape0S0101200_I2) create).invokeSuspend(Unit.A00);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087 A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r13 = r18
            r11 = r19
            int r0 = r13.A04
            if (r0 == 0) goto L_0x0096
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.A00
            r12 = 3
            r10 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0088
            if (r0 == r9) goto L_0x0074
            if (r0 != r10) goto L_0x0074
            java.lang.Object r7 = r13.A03
            X.4r0 r7 = (X.C83234r0) r7
            X.AnonymousClass0OU.A00(r11)
        L_0x001c:
            long r3 = r13.A02
            r13.A03 = r7
            r13.A00 = r12
        L_0x0022:
            r5 = 0
            long r0 = r3 ^ r5
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0069
            int r2 = (int) r0
            r0 = r2 & 1
            if (r0 == 0) goto L_0x0069
            int r0 = (int) r3
            r1 = r0 & 1
            int r0 = (int) r5
            r0 = r0 & 1
            int r1 = r1 - r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x003b
            int r1 = -r1
        L_0x003b:
            if (r1 <= 0) goto L_0x0071
        L_0x003d:
            int r0 = (int) r3
            r0 = r0 & 1
            if (r0 != r9) goto L_0x0062
            long r1 = X.C134797yO.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            long r1 = X.C134797yO.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            long r3 = r3 >> r9
        L_0x004f:
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            r3 = 1
        L_0x0057:
            java.lang.Object r0 = X.AnonymousClass729.A01(r13, r3)
            if (r0 == r8) goto L_0x005f
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x005f:
            if (r0 != r8) goto L_0x007b
            return r8
        L_0x0062:
            X.68s r0 = X.C972768s.MILLISECONDS
            long r3 = X.C134797yO.A00(r0, r3)
            goto L_0x004f
        L_0x0069:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0071
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
        L_0x0071:
            r3 = 0
            goto L_0x0057
        L_0x0074:
            java.lang.Object r7 = r13.A03
            X.4r0 r7 = (X.C83234r0) r7
            X.AnonymousClass0OU.A00(r11)
        L_0x007b:
            kotlin.Unit r0 = kotlin.Unit.A00
            r13.A03 = r7
            r13.A00 = r10
            java.lang.Object r0 = r7.emit(r0, r13)
            if (r0 != r8) goto L_0x001c
            return r8
        L_0x0088:
            X.AnonymousClass0OU.A00(r11)
            java.lang.Object r7 = r13.A03
            X.4r0 r7 = (X.C83234r0) r7
            long r3 = r13.A01
            r13.A03 = r7
            r13.A00 = r9
            goto L_0x0022
        L_0x0096:
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.A00
            r7 = 3
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L_0x00bc
            if (r0 == r3) goto L_0x00d8
            if (r0 == r6) goto L_0x00f6
            long r2 = r13.A02
            long r0 = r13.A01
            X.AnonymousClass0OU.A00(r11)
        L_0x00aa:
            X.7HA r11 = (X.AnonymousClass7HA) r11
            long r4 = r11.A00
            long r2 = X.AnonymousClass7HA.A00(r2, r4)
            long r0 = X.AnonymousClass7HA.A00(r0, r2)
            X.7HA r8 = new X.7HA
            r8.<init>(r0)
            return r8
        L_0x00bc:
            X.AnonymousClass0OU.A00(r11)
            long r0 = r13.A01
            java.lang.Object r2 = r13.A03
            androidx.compose.foundation.gestures.ScrollingLogic r2 = (androidx.compose.foundation.gestures.ScrollingLogic) r2
            X.4oM r2 = r2.A05
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r2
            r13.A01 = r0
            r13.A00 = r3
            java.lang.Object r11 = r2.A00(r13, r0)
            if (r11 != r8) goto L_0x00dd
            return r8
        L_0x00d8:
            long r0 = r13.A01
            X.AnonymousClass0OU.A00(r11)
        L_0x00dd:
            X.7HA r11 = (X.AnonymousClass7HA) r11
            long r2 = r11.A00
            long r4 = X.AnonymousClass7HA.A00(r0, r2)
            java.lang.Object r2 = r13.A03
            androidx.compose.foundation.gestures.ScrollingLogic r2 = (androidx.compose.foundation.gestures.ScrollingLogic) r2
            r13.A01 = r0
            r13.A02 = r4
            r13.A00 = r6
            java.lang.Object r11 = r2.A02(r13, r4)
            if (r11 != r8) goto L_0x00fd
            return r8
        L_0x00f6:
            long r4 = r13.A02
            long r0 = r13.A01
            X.AnonymousClass0OU.A00(r11)
        L_0x00fd:
            X.7HA r11 = (X.AnonymousClass7HA) r11
            long r2 = r11.A00
            java.lang.Object r6 = r13.A03
            androidx.compose.foundation.gestures.ScrollingLogic r6 = (androidx.compose.foundation.gestures.ScrollingLogic) r6
            X.4oM r6 = r6.A05
            java.lang.Object r12 = r6.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r12 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r12
            long r14 = X.AnonymousClass7HA.A00(r4, r2)
            r13.A01 = r0
            r13.A02 = r2
            r13.A00 = r7
            r16 = r2
            java.lang.Object r11 = r12.A01(r13, r14, r16)
            if (r11 != r8) goto L_0x00aa
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101200_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0101200_I2(ScrollingLogic scrollingLogic, C146958n9 r3) {
        super(2, r3);
        this.A03 = scrollingLogic;
    }
}
