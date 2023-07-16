package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C882857l;
import kotlin.Unit;

public class KtSLambdaShape0S0101100_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x027c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cc A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r11 = r14
            int r0 = r14.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            switch(r0) {
                case 0: goto L_0x021a;
                case 1: goto L_0x01f4;
                case 2: goto L_0x0240;
                case 3: goto L_0x01d6;
                case 4: goto L_0x01b3;
                case 5: goto L_0x0184;
                case 6: goto L_0x0157;
                case 7: goto L_0x0127;
                case 8: goto L_0x00ff;
                case 9: goto L_0x00ce;
                case 10: goto L_0x0054;
                case 11: goto L_0x002c;
                default: goto L_0x0008;
            }
        L_0x0008:
            int r0 = r14.A00
            r5 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r5) goto L_0x0226
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0014:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r0 = r14.A02
            X.CAg r0 = (X.C21971CAg) r0
            X.4wD r4 = r0.A05
            long r1 = r14.A01
            X.Cya r0 = new X.Cya
            r0.<init>(r1)
            r14.A00 = r5
            java.lang.Object r0 = r4.Cgt(r0, r14)
            goto L_0x023d
        L_0x002c:
            int r0 = r14.A00
            r2 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r2) goto L_0x004f
            X.AnonymousClass0OU.A00(r15)
        L_0x0036:
            java.lang.Object r0 = r14.A02
            X.56W r0 = (X.AnonymousClass56W) r0
            X.3Ur r0 = r0.A0C
            r0.A00()
            goto L_0x025f
        L_0x0041:
            X.AnonymousClass0OU.A00(r15)
            long r0 = r14.A01
            r14.A00 = r2
            java.lang.Object r0 = X.AnonymousClass729.A01(r14, r0)
            if (r0 != r3) goto L_0x0036
            return r3
        L_0x004f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0054:
            int r2 = r14.A00
            r7 = 2
            r6 = 1
            if (r2 == 0) goto L_0x00c0
            long r0 = r14.A01
            if (r2 == r6) goto L_0x00a9
            X.AnonymousClass0OU.A00(r15)
        L_0x0061:
            java.lang.Object r8 = r14.A02
            X.57l r8 = (X.C882857l) r8
            java.lang.String r10 = X.AnonymousClass6R1.A00(r0)
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            boolean r9 = X.C86124wJ.A1X(r2)
            X.4wE r5 = r8.A04
            java.lang.Object r2 = r5.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1020000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1020000_I2) r2
            boolean r4 = r2.A02
            X.C04220Ms.A0B(r10, r6)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1020000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1020000_I2
            r2.<init>((java.lang.String) r10, (boolean) r4, (boolean) r9, (int) r6)
            r5.CrC(r2)
            java.util.Map r4 = r8.A02
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            java.lang.Number r2 = X.C86124wJ.A0j(r2, r4)
            if (r2 == 0) goto L_0x00ac
            long r4 = r2.longValue()
            X.4wF r8 = r8.A03
            X.74y r2 = new X.74y
            r2.<init>(r4)
            r14.A01 = r0
            r14.A00 = r6
            java.lang.Object r2 = r8.emit(r2, r14)
            if (r2 != r3) goto L_0x00ac
            return r3
        L_0x00a9:
            X.AnonymousClass0OU.A00(r15)
        L_0x00ac:
            r4 = -1
            long r0 = r0 + r4
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = X.C86154wM.A08(r2)
            r14.A01 = r0
            r14.A00 = r7
            java.lang.Object r2 = X.AnonymousClass729.A01(r14, r4)
            if (r2 != r3) goto L_0x0061
            return r3
        L_0x00c0:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r0 = r14.A02
            X.57l r0 = (X.C882857l) r0
            X.Ah8 r0 = r0.A01
            long r0 = r0.A00()
            goto L_0x0061
        L_0x00ce:
            int r0 = r14.A00
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L_0x00ed
            if (r0 != r2) goto L_0x0226
            X.AnonymousClass0OU.A00(r15)
        L_0x00d9:
            X.8bg r5 = X.AnonymousClass6ZB.A00
            java.lang.Object r4 = r14.A02
            r2 = 0
            r1 = 25
            kotlin.coroutines.jvm.internal.KtSLambdaShape13S0100000_I2_2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0100000_I2_2
            r0.<init>(r4, r2, r1)
            r14.A00 = r6
            java.lang.Object r0 = X.C25599DoZ.A00(r14, r5, r0)
            goto L_0x023d
        L_0x00ed:
            X.AnonymousClass0OU.A00(r15)
            r0 = 250(0xfa, float:3.5E-43)
            long r4 = (long) r0
            long r0 = r14.A01
            long r4 = r4 + r0
            r14.A00 = r2
            java.lang.Object r0 = X.AnonymousClass729.A01(r14, r4)
            if (r0 != r3) goto L_0x00d9
            return r3
        L_0x00ff:
            int r0 = r14.A00
            r2 = 1
            if (r0 == 0) goto L_0x0114
            if (r0 != r2) goto L_0x0122
            X.AnonymousClass0OU.A00(r15)
        L_0x0109:
            java.lang.Object r0 = r14.A02
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            if (r0 == 0) goto L_0x025f
            r0.invoke()
            goto L_0x025f
        L_0x0114:
            X.AnonymousClass0OU.A00(r15)
            long r0 = r14.A01
            r14.A00 = r2
            java.lang.Object r0 = X.AnonymousClass729.A01(r14, r0)
            if (r0 != r3) goto L_0x0109
            return r3
        L_0x0122:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0127:
            int r0 = r14.A00
            r6 = 1
            if (r0 == 0) goto L_0x0133
            if (r0 == r6) goto L_0x0226
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0133:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r0 = r14.A02
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r0 = (com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository) r0
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r2 = r0.A01
            long r4 = r14.A01
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 - r0
            r14.A00 = r6
            X.Dr2 r2 = r2.A04
            X.M6w r1 = r2.A02
            X.84g r0 = new X.84g
            r0.<init>(r2, r4)
            java.lang.Object r0 = X.C120467Az.A01(r1, r0, r14)
            if (r0 == r3) goto L_0x023d
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x023d
        L_0x0157:
            int r0 = r14.A00
            r2 = 1
            if (r0 == 0) goto L_0x0163
            if (r0 == r2) goto L_0x0226
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0163:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r0 = r14.A02
            X.6hL r0 = (X.C107806hL) r0
            X.7JH r7 = r0.A00
            long r0 = X.AnonymousClass7KC.A03
            X.7KC r9 = X.C86124wJ.A0O(r0)
            r8 = 0
            long r0 = r14.A01
            X.7KC r10 = X.C86124wJ.A0O(r0)
            r13 = 10
            r14.A00 = r2
            r12 = r8
            java.lang.Object r0 = X.AnonymousClass7JH.A02(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x023d
        L_0x0184:
            int r0 = r14.A00
            r6 = 1
            if (r0 == 0) goto L_0x0190
            if (r0 == r6) goto L_0x0226
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0190:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r0 = r14.A02
            X.6hL r0 = (X.C107806hL) r0
            X.7JH r2 = r0.A00
            java.lang.Object r0 = X.AnonymousClass7JH.A01(r2)
            X.7KC r0 = (X.AnonymousClass7KC) r0
            long r4 = r0.A00
            long r0 = r14.A01
            long r0 = X.AnonymousClass7KC.A05(r4, r0)
            X.7KC r0 = X.C86124wJ.A0O(r0)
            r14.A00 = r6
            java.lang.Object r0 = r2.A05(r0, r14)
            goto L_0x023d
        L_0x01b3:
            int r0 = r14.A00
            r2 = 1
            if (r0 == 0) goto L_0x01cd
            if (r0 != r2) goto L_0x01d1
            X.AnonymousClass0OU.A00(r15)
        L_0x01bd:
            java.lang.Object r0 = r14.A02
            X.C18240wQ.A1G(r0)
        L_0x01c2:
            long r0 = r14.A01
            r14.A00 = r2
            java.lang.Object r0 = X.AnonymousClass729.A01(r14, r0)
            if (r0 != r3) goto L_0x01bd
            return r3
        L_0x01cd:
            X.AnonymousClass0OU.A00(r15)
            goto L_0x01c2
        L_0x01d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01d6:
            int r0 = r14.A00
            r4 = 1
            if (r0 == 0) goto L_0x01e2
            if (r0 == r4) goto L_0x0226
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01e2:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r0 = r14.A02
            X.50o r0 = (X.C872050o) r0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = r0.A0F
            long r0 = r14.A01
            r14.A00 = r4
            java.lang.Object r0 = r2.A00(r14, r0)
            goto L_0x023d
        L_0x01f4:
            int r0 = r14.A00
            r2 = 1
            if (r0 == 0) goto L_0x0200
            if (r0 == r2) goto L_0x0226
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0200:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r7 = r14.A02
            X.7JH r7 = (X.AnonymousClass7JH) r7
            long r0 = r14.A01
            X.7KC r9 = X.C86124wJ.A0O(r0)
            X.7Tu r8 = X.C103656aV.A02
            r10 = 0
            r13 = 12
            r14.A00 = r2
            r12 = r10
            java.lang.Object r0 = X.AnonymousClass7JH.A02(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x023d
        L_0x021a:
            int r0 = r14.A00
            r4 = 1
            if (r0 == 0) goto L_0x022a
            if (r0 == r4) goto L_0x0226
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0226:
            X.AnonymousClass0OU.A00(r15)
            goto L_0x025f
        L_0x022a:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r0 = r14.A02
            java.lang.Object r2 = X.C86104wH.A0f(r0)
            androidx.compose.foundation.gestures.ScrollingLogic r2 = (androidx.compose.foundation.gestures.ScrollingLogic) r2
            long r0 = r14.A01
            r14.A00 = r4
            java.lang.Object r0 = r2.A03(r14, r0)
        L_0x023d:
            if (r0 != r3) goto L_0x025f
            return r3
        L_0x0240:
            int r0 = r14.A00
            r4 = 1
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0262
            if (r0 == r2) goto L_0x0271
            X.AnonymousClass0OU.A00(r15)
        L_0x024d:
            java.lang.Object r0 = r14.A02
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r0
            X.8s9 r3 = r0.A01
            if (r3 == 0) goto L_0x025f
            long r1 = r14.A01
            X.89x r0 = new X.89x
            r0.<init>(r1)
            X.C146958n9.A00(r0, r3)
        L_0x025f:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x0262:
            X.AnonymousClass0OU.A00(r15)
            long r0 = r14.A01
            long r0 = r0 - r4
            r14.A00 = r2
            java.lang.Object r0 = X.AnonymousClass729.A01(r14, r0)
            if (r0 != r3) goto L_0x0274
            return r3
        L_0x0271:
            X.AnonymousClass0OU.A00(r15)
        L_0x0274:
            r14.A00 = r6
            java.lang.Object r0 = X.AnonymousClass729.A01(r14, r4)
            if (r0 != r3) goto L_0x024d
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0101100_I2(C882857l r2, C146958n9 r3) {
        super(2, r3);
        this.A03 = 10;
        this.A02 = r2;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        Object obj2;
        long j;
        int i;
        C146958n9 r3 = r9;
        switch (this.A03) {
            case 0:
                obj2 = this.A02;
                j = this.A01;
                i = 0;
                break;
            case 1:
                obj2 = this.A02;
                j = this.A01;
                i = 1;
                break;
            case 2:
                j = this.A01;
                obj2 = this.A02;
                i = 2;
                break;
            case 3:
                obj2 = this.A02;
                j = this.A01;
                i = 3;
                break;
            case 4:
                j = this.A01;
                obj2 = this.A02;
                i = 4;
                break;
            case 5:
                obj2 = this.A02;
                j = this.A01;
                i = 5;
                break;
            case 6:
                obj2 = this.A02;
                j = this.A01;
                i = 6;
                break;
            case 7:
                obj2 = this.A02;
                j = this.A01;
                i = 7;
                break;
            case 8:
                j = this.A01;
                obj2 = this.A02;
                i = 8;
                break;
            case 9:
                j = this.A01;
                obj2 = this.A02;
                i = 9;
                break;
            case 10:
                return new KtSLambdaShape0S0101100_I2((C882857l) this.A02, r9);
            case 11:
                j = this.A01;
                obj2 = this.A02;
                i = 11;
                break;
            default:
                obj2 = this.A02;
                j = this.A01;
                i = 12;
                break;
        }
        return new KtSLambdaShape0S0101100_I2(obj2, r3, i, j);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0101100_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0101100_I2(Object obj, C146958n9 r3, int i, long j) {
        super(2, r3);
        this.A03 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
