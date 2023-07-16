package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass3HX;
import X.C109326jp;
import X.C121197Es;
import X.C127397h3;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C84714tk;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import kotlin.Unit;

public class KtSLambdaShape8S0301000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape8S0301000_I2(Object obj, C146958n9 r3, int i) {
        super(2, r3);
        this.A04 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ca, code lost:
        r4 = X.C86164wN.A0p(r1, r2, r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f9, code lost:
        r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2(r13, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2(r5, r6, r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016f, code lost:
        r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2(r1, r2, r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ae, code lost:
        return new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2(r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b5, code lost:
        r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2(r2, r1, r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ba, code lost:
        r4.A03 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01bc, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d5, code lost:
        r4 = X.C86164wN.A0p(r2, r1, r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d9, code lost:
        r4.A02 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01db, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ec, code lost:
        return new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2(r2, r1, r13, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C146958n9 create(java.lang.Object r12, X.C146958n9 r13) {
        /*
            r11 = this;
            int r0 = r11.A04
            r8 = r13
            switch(r0) {
                case 0: goto L_0x01e2;
                case 1: goto L_0x01dc;
                case 2: goto L_0x01d0;
                case 3: goto L_0x0075;
                case 4: goto L_0x01ca;
                case 5: goto L_0x006d;
                case 6: goto L_0x01c4;
                case 7: goto L_0x0065;
                case 8: goto L_0x01bd;
                case 9: goto L_0x01af;
                case 10: goto L_0x019a;
                case 11: goto L_0x018b;
                case 12: goto L_0x017c;
                case 13: goto L_0x005c;
                case 14: goto L_0x0175;
                case 15: goto L_0x0169;
                case 16: goto L_0x0162;
                case 17: goto L_0x0053;
                case 18: goto L_0x015b;
                case 19: goto L_0x0154;
                case 20: goto L_0x014d;
                case 21: goto L_0x0146;
                case 22: goto L_0x013f;
                case 23: goto L_0x0138;
                case 24: goto L_0x0131;
                case 25: goto L_0x012a;
                case 26: goto L_0x0120;
                case 27: goto L_0x0115;
                case 28: goto L_0x0107;
                case 29: goto L_0x0100;
                case 30: goto L_0x00ef;
                case 31: goto L_0x00e7;
                case 32: goto L_0x00dc;
                case 33: goto L_0x004a;
                case 34: goto L_0x00d0;
                case 35: goto L_0x00c5;
                case 36: goto L_0x00be;
                case 37: goto L_0x0041;
                case 38: goto L_0x00b6;
                case 39: goto L_0x00ae;
                case 40: goto L_0x00a3;
                case 41: goto L_0x008f;
                case 42: goto L_0x0085;
                case 43: goto L_0x0038;
                case 44: goto L_0x007d;
                case 45: goto L_0x002f;
                case 46: goto L_0x0026;
                case 47: goto L_0x001d;
                case 48: goto L_0x0014;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r5 = r11.A03
            java.lang.Object r6 = r11.A02
            java.lang.Object r7 = r11.A01
            r9 = 49
        L_0x000e:
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (X.C146958n9) r8, (int) r9)
            return r4
        L_0x0014:
            java.lang.Object r6 = r11.A02
            java.lang.Object r7 = r11.A01
            java.lang.Object r5 = r11.A03
            r9 = 48
            goto L_0x000e
        L_0x001d:
            java.lang.Object r6 = r11.A02
            java.lang.Object r7 = r11.A01
            java.lang.Object r5 = r11.A03
            r9 = 47
            goto L_0x000e
        L_0x0026:
            java.lang.Object r6 = r11.A02
            java.lang.Object r7 = r11.A01
            java.lang.Object r5 = r11.A03
            r9 = 46
            goto L_0x000e
        L_0x002f:
            java.lang.Object r6 = r11.A02
            java.lang.Object r7 = r11.A01
            java.lang.Object r5 = r11.A03
            r9 = 45
            goto L_0x000e
        L_0x0038:
            java.lang.Object r6 = r11.A02
            java.lang.Object r5 = r11.A03
            java.lang.Object r7 = r11.A01
            r9 = 43
            goto L_0x000e
        L_0x0041:
            java.lang.Object r7 = r11.A01
            java.lang.Object r5 = r11.A03
            java.lang.Object r6 = r11.A02
            r9 = 37
            goto L_0x000e
        L_0x004a:
            java.lang.Object r5 = r11.A03
            java.lang.Object r7 = r11.A01
            java.lang.Object r6 = r11.A02
            r9 = 33
            goto L_0x000e
        L_0x0053:
            java.lang.Object r6 = r11.A02
            java.lang.Object r5 = r11.A03
            java.lang.Object r7 = r11.A01
            r9 = 17
            goto L_0x000e
        L_0x005c:
            java.lang.Object r5 = r11.A03
            java.lang.Object r6 = r11.A02
            java.lang.Object r7 = r11.A01
            r9 = 13
            goto L_0x000e
        L_0x0065:
            java.lang.Object r5 = r11.A03
            java.lang.Object r6 = r11.A02
            java.lang.Object r7 = r11.A01
            r9 = 7
            goto L_0x000e
        L_0x006d:
            java.lang.Object r5 = r11.A03
            java.lang.Object r6 = r11.A02
            java.lang.Object r7 = r11.A01
            r9 = 5
            goto L_0x000e
        L_0x0075:
            java.lang.Object r5 = r11.A03
            java.lang.Object r6 = r11.A02
            java.lang.Object r7 = r11.A01
            r9 = 3
            goto L_0x000e
        L_0x007d:
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A01
            r0 = 44
            goto L_0x016f
        L_0x0085:
            java.lang.Object r1 = r11.A03
            r0 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>((java.lang.Object) r1, (X.C146958n9) r13, (int) r0, (int) r0)
            return r4
        L_0x008f:
            java.lang.Object r7 = r11.A03
            X.6jp r7 = (X.C109326jp) r7
            java.lang.Object r6 = r11.A02
            X.7h3 r6 = (X.C127397h3) r6
            int r9 = r11.A00
            java.lang.Object r5 = r11.A01
            X.3HX r5 = (X.AnonymousClass3HX) r5
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>((X.AnonymousClass3HX) r5, (X.C127397h3) r6, (X.C109326jp) r7, (X.C146958n9) r8, (int) r9)
            return r4
        L_0x00a3:
            java.lang.Object r2 = r11.A01
            java.lang.Object r1 = r11.A03
            r0 = 40
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = X.C86164wN.A0p(r1, r2, r13, r0)
            return r4
        L_0x00ae:
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A01
            r0 = 39
            goto L_0x016f
        L_0x00b6:
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A01
            r0 = 38
            goto L_0x016f
        L_0x00be:
            java.lang.Object r2 = r11.A01
            java.lang.Object r1 = r11.A03
            r0 = 36
            goto L_0x00ca
        L_0x00c5:
            r2 = 0
            java.lang.Object r1 = r11.A03
            r0 = 35
        L_0x00ca:
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = X.C86164wN.A0p(r1, r2, r13, r0)
            goto L_0x01d9
        L_0x00d0:
            java.lang.Object r2 = r11.A03
            r1 = 34
            r0 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>((java.lang.Object) r2, (X.C146958n9) r13, (int) r1, (int) r0)
            return r4
        L_0x00dc:
            java.lang.Object r2 = r11.A01
            X.4tk r2 = (X.C84714tk) r2
            java.lang.Object r1 = r11.A02
            X.0YM r1 = (X.AnonymousClass0YM) r1
            r0 = 32
            goto L_0x00f9
        L_0x00e7:
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A01
            r0 = 31
            goto L_0x016f
        L_0x00ef:
            java.lang.Object r2 = r11.A02
            X.4tk r2 = (X.C84714tk) r2
            java.lang.Object r1 = r11.A01
            X.0YM r1 = (X.AnonymousClass0YM) r1
            r0 = 30
        L_0x00f9:
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>((X.C146958n9) r13, (X.AnonymousClass0YM) r1, (X.C84714tk) r2, (int) r0)
            goto L_0x01ba
        L_0x0100:
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A01
            r0 = 29
            goto L_0x016f
        L_0x0107:
            java.lang.Object r2 = r11.A03
            r1 = 28
            r0 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>((java.lang.Object) r2, (X.C146958n9) r13, (int) r1, (int) r0)
            r4.A01 = r12
            return r4
        L_0x0115:
            java.lang.Object r1 = r11.A01
            r0 = 27
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>(r1, r13, r0)
            goto L_0x01d9
        L_0x0120:
            java.lang.Object r1 = r11.A01
            r0 = 26
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>(r1, r13, r0)
            return r4
        L_0x012a:
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A01
            r0 = 25
            goto L_0x016f
        L_0x0131:
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A01
            r0 = 24
            goto L_0x016f
        L_0x0138:
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A01
            r0 = 23
            goto L_0x016f
        L_0x013f:
            java.lang.Object r2 = r11.A01
            java.lang.Object r1 = r11.A02
            r0 = 22
            goto L_0x01b5
        L_0x0146:
            java.lang.Object r2 = r11.A01
            java.lang.Object r1 = r11.A02
            r0 = 21
            goto L_0x01b5
        L_0x014d:
            java.lang.Object r2 = r11.A01
            java.lang.Object r1 = r11.A02
            r0 = 20
            goto L_0x01b5
        L_0x0154:
            java.lang.Object r2 = r11.A01
            java.lang.Object r1 = r11.A02
            r0 = 19
            goto L_0x01b5
        L_0x015b:
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A01
            r0 = 18
            goto L_0x016f
        L_0x0162:
            java.lang.Object r2 = r11.A03
            java.lang.Object r1 = r11.A01
            r0 = 16
            goto L_0x01d5
        L_0x0169:
            java.lang.Object r2 = r11.A02
            java.lang.Object r1 = r11.A01
            r0 = 15
        L_0x016f:
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>((java.lang.Object) r1, (java.lang.Object) r2, (X.C146958n9) r13, (int) r0)
            goto L_0x01ba
        L_0x0175:
            java.lang.Object r2 = r11.A01
            java.lang.Object r1 = r11.A02
            r0 = 14
            goto L_0x01b5
        L_0x017c:
            java.lang.Object r9 = r11.A01
            X.0YM r9 = (X.AnonymousClass0YM) r9
            java.lang.Object r6 = r11.A02
            androidx.compose.foundation.gestures.PressGestureScopeImpl r6 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r6
            java.lang.Object r7 = r11.A03
            X.7Es r7 = (X.C121197Es) r7
            r10 = 12
            goto L_0x01a8
        L_0x018b:
            java.lang.Object r9 = r11.A02
            X.0YM r9 = (X.AnonymousClass0YM) r9
            java.lang.Object r6 = r11.A03
            androidx.compose.foundation.gestures.PressGestureScopeImpl r6 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r6
            java.lang.Object r7 = r11.A01
            X.7Es r7 = (X.C121197Es) r7
            r10 = 11
            goto L_0x01a8
        L_0x019a:
            java.lang.Object r9 = r11.A02
            X.0YM r9 = (X.AnonymousClass0YM) r9
            java.lang.Object r6 = r11.A03
            androidx.compose.foundation.gestures.PressGestureScopeImpl r6 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r6
            java.lang.Object r7 = r11.A01
            X.7Es r7 = (X.C121197Es) r7
            r10 = 10
        L_0x01a8:
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r5 = r4
            r5.<init>((androidx.compose.foundation.gestures.PressGestureScopeImpl) r6, (X.C121197Es) r7, (X.C146958n9) r8, (X.AnonymousClass0YM) r9, (int) r10)
            return r4
        L_0x01af:
            java.lang.Object r2 = r11.A01
            java.lang.Object r1 = r11.A02
            r0 = 9
        L_0x01b5:
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>((java.lang.Object) r2, (java.lang.Object) r1, (X.C146958n9) r13, (int) r0)
        L_0x01ba:
            r4.A03 = r12
            return r4
        L_0x01bd:
            java.lang.Object r2 = r11.A03
            java.lang.Object r1 = r11.A01
            r0 = 8
            goto L_0x01d5
        L_0x01c4:
            java.lang.Object r2 = r11.A03
            java.lang.Object r1 = r11.A01
            r0 = 6
            goto L_0x01d5
        L_0x01ca:
            java.lang.Object r2 = r11.A03
            java.lang.Object r1 = r11.A01
            r0 = 4
            goto L_0x01d5
        L_0x01d0:
            java.lang.Object r2 = r11.A03
            java.lang.Object r1 = r11.A01
            r0 = 2
        L_0x01d5:
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = X.C86164wN.A0p(r2, r1, r13, r0)
        L_0x01d9:
            r4.A02 = r12
            return r4
        L_0x01dc:
            java.lang.Object r2 = r11.A01
            java.lang.Object r1 = r11.A02
            r0 = 1
            goto L_0x01e7
        L_0x01e2:
            java.lang.Object r2 = r11.A01
            java.lang.Object r1 = r11.A02
            r0 = 0
        L_0x01e7:
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r4.<init>((java.lang.Object) r2, (java.lang.Object) r1, (X.C146958n9) r13, (int) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2.create(java.lang.Object, X.8n9):X.8n9");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0224, code lost:
        r2 = X.C86124wJ.A0O(((X.C121197Es) r2).A05);
        r0.A00 = r6;
        r0 = r5.invoke(r4, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0478, code lost:
        X.AnonymousClass0OU.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04b7, code lost:
        if (r0 != r1) goto L_0x0efb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04b9, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0548, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0549, code lost:
        X.AnonymousClass6W2.A00(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x054c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0765, code lost:
        if ((r8 instanceof com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource) != false) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0a24, code lost:
        if (r8.A00 != null) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0bd6, code lost:
        if (r2 != false) goto L_0x0bd8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0c20, code lost:
        if (r4 > (r1.A01 + r1.A02)) goto L_0x0bd8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0d8b, code lost:
        if (r0 == r2) goto L_0x103e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0efd, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x103e, code lost:
        if (r0 != r2) goto L_0x1046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x1040, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x1043, code lost:
        X.AnonymousClass0OU.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x1048, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0539 A[Catch:{ all -> 0x0548 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x072d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x087b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0a01 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0b09  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x0ba2  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0ba6  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0c05 A[LOOP:2: B:497:0x0bff->B:499:0x0c05, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x0dca  */
    /* JADX WARNING: Removed duplicated region for block: B:627:0x0ee4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r8 = r23
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x0017;
                case 1: goto L_0x0017;
                case 2: goto L_0x0054;
                case 3: goto L_0x0088;
                case 4: goto L_0x00b4;
                case 5: goto L_0x00f8;
                case 6: goto L_0x0129;
                case 7: goto L_0x016e;
                case 8: goto L_0x019f;
                case 9: goto L_0x01ca;
                case 10: goto L_0x01f1;
                case 11: goto L_0x01f1;
                case 12: goto L_0x020b;
                case 13: goto L_0x0d2c;
                case 14: goto L_0x0353;
                case 15: goto L_0x0382;
                case 16: goto L_0x03b5;
                case 17: goto L_0x03e4;
                case 18: goto L_0x0420;
                case 19: goto L_0x044a;
                case 20: goto L_0x046a;
                case 21: goto L_0x046a;
                case 22: goto L_0x04ba;
                case 23: goto L_0x0009;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x0500;
                case 27: goto L_0x054d;
                case 28: goto L_0x05a2;
                case 29: goto L_0x0604;
                case 30: goto L_0x0630;
                case 31: goto L_0x065f;
                case 32: goto L_0x0680;
                case 33: goto L_0x06b0;
                case 34: goto L_0x07b5;
                case 35: goto L_0x08fc;
                case 36: goto L_0x095c;
                case 37: goto L_0x0987;
                case 38: goto L_0x0c88;
                case 39: goto L_0x0cb2;
                case 40: goto L_0x0e04;
                case 41: goto L_0x0e36;
                case 42: goto L_0x0e63;
                case 43: goto L_0x0234;
                case 44: goto L_0x0f1a;
                case 45: goto L_0x0f4f;
                case 46: goto L_0x0f7d;
                case 47: goto L_0x0fac;
                case 48: goto L_0x0fd9;
                case 49: goto L_0x1006;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x049c
            if (r2 == r5) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0017:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x002a
            if (r2 != r6) goto L_0x004f
            java.lang.Object r5 = r0.A03
            X.8pE r5 = (X.C147368pE) r5
            X.AnonymousClass0OU.A00(r8)
        L_0x0027:
            r0 = 0
            goto L_0x00eb
        L_0x002a:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r5 = r0.A01
            X.8pE r5 = (X.C147368pE) r5
            java.lang.Object r4 = r5.getValue()
            X.7Um r4 = (X.C122917Um) r4
            if (r4 == 0) goto L_0x0efb
            java.lang.Object r3 = r0.A02
            X.8p3 r3 = (X.C147258p3) r3
            X.7Uq r2 = new X.7Uq
            r2.<init>(r4)
            if (r3 == 0) goto L_0x0027
            r0.A03 = r5
            r0.A00 = r6
            java.lang.Object r0 = r3.AJQ(r2, r0)
            if (r0 != r1) goto L_0x0027
            return r1
        L_0x004f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0054:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0062
            if (r2 == r7) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0062:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r6 = r0.A02
            java.lang.Object r5 = r0.A03
            X.7Y0 r5 = (X.AnonymousClass7Y0) r5
            androidx.compose.foundation.gestures.UpdatableAnimationState r4 = r5.A09
            float r2 = X.AnonymousClass7Y0.A01(r5)
            r4.A00 = r2
            java.lang.Object r3 = r0.A01
            r2 = 7
            kotlin.jvm.internal.KtLambdaShape10S0300000_I2 r3 = X.C86154wM.A0y(r6, r5, r3, r2)
            r2 = 14
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r2 = X.C86154wM.A12(r5, r2)
            r0.A00 = r7
            java.lang.Object r0 = r4.A00(r0, r2, r3)
            goto L_0x04b7
        L_0x0088:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0096
            if (r2 == r3) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0096:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r2 = r0.A03
            X.7UO r2 = (X.AnonymousClass7UO) r2
            X.6fT r5 = r2.A00
            X.Boc r7 = r2.A01
            java.lang.Object r4 = r0.A02
            java.lang.Object r6 = r0.A01
            r0.A00 = r3
            r8 = 0
            r9 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0901000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0901000_I2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = X.AnonymousClass7Ja.A01(r0, r3)
            goto L_0x04b7
        L_0x00b4:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x00c6
            if (r2 != r4) goto L_0x00c1
            X.AnonymousClass0OU.A00(r8)     // Catch:{ all -> 0x00f0 }
            goto L_0x00e1
        L_0x00c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00c6:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r3 = r0.A02
            java.lang.Object r2 = r0.A03
            X.7Ua r2 = (X.C122837Ua) r2
            X.8pE r2 = r2.A02
            X.C147368pE.A04(r2, r4)
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x00f0 }
            X.0YP r2 = (X.AnonymousClass0YP) r2     // Catch:{ all -> 0x00f0 }
            r0.A00 = r4     // Catch:{ all -> 0x00f0 }
            java.lang.Object r2 = r2.invoke(r3, r0)     // Catch:{ all -> 0x00f0 }
            if (r2 != r1) goto L_0x00e1
            return r1
        L_0x00e1:
            java.lang.Object r0 = r0.A03
            X.7Ua r0 = (X.C122837Ua) r0
            X.8pE r5 = r0.A02
            java.lang.Boolean r0 = X.C18180wK.A0X()
        L_0x00eb:
            r5.CrC(r0)
            goto L_0x0efb
        L_0x00f0:
            r2 = move-exception
            java.lang.Object r0 = r0.A03
            X.7Ua r0 = (X.C122837Ua) r0
            X.8pE r1 = r0.A02
            goto L_0x0169
        L_0x00f8:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0106
            if (r2 == r5) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0106:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r0.A03
            X.7Ua r4 = (X.C122837Ua) r4
            X.6fT r7 = r4.A00
            X.8fT r9 = r4.A01
            java.lang.Object r6 = r0.A02
            java.lang.Object r3 = r0.A01
            r10 = 0
            r2 = 4
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r8 = X.C86164wN.A0p(r4, r3, r10, r2)
            r0.A00 = r5
            r11 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0901000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0901000_I2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = X.AnonymousClass7Ja.A01(r0, r5)
            goto L_0x04b7
        L_0x0129:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x013b
            if (r2 != r4) goto L_0x0136
            X.AnonymousClass0OU.A00(r8)     // Catch:{ all -> 0x0162 }
            goto L_0x0156
        L_0x0136:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x013b:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r3 = r0.A02
            java.lang.Object r2 = r0.A03
            X.7Ug r2 = (X.C122867Ug) r2
            X.8pE r2 = r2.A02
            X.C147368pE.A04(r2, r4)
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x0162 }
            X.0YP r2 = (X.AnonymousClass0YP) r2     // Catch:{ all -> 0x0162 }
            r0.A00 = r4     // Catch:{ all -> 0x0162 }
            java.lang.Object r2 = r2.invoke(r3, r0)     // Catch:{ all -> 0x0162 }
            if (r2 != r1) goto L_0x0156
            return r1
        L_0x0156:
            java.lang.Object r0 = r0.A03
            X.7Ug r0 = (X.C122867Ug) r0
            X.8pE r1 = r0.A02
            r0 = 0
            X.C147368pE.A04(r1, r0)
            goto L_0x0efb
        L_0x0162:
            r2 = move-exception
            java.lang.Object r0 = r0.A03
            X.7Ug r0 = (X.C122867Ug) r0
            X.8pE r1 = r0.A02
        L_0x0169:
            r0 = 0
            X.C147368pE.A04(r1, r0)
            throw r2
        L_0x016e:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x017c
            if (r2 == r5) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x017c:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r0.A03
            X.7Ug r4 = (X.C122867Ug) r4
            X.6fT r7 = r4.A00
            X.8cY r9 = r4.A01
            java.lang.Object r6 = r0.A02
            java.lang.Object r3 = r0.A01
            r10 = 0
            r2 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r8 = X.C86164wN.A0p(r4, r3, r10, r2)
            r0.A00 = r5
            r11 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0901000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0901000_I2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = X.AnonymousClass7Ja.A01(r0, r5)
            goto L_0x04b7
        L_0x019f:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x01ad
            if (r2 == r5) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01ad:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r0.A02
            X.8fT r4 = (X.C142718fT) r4
            java.lang.Object r3 = r0.A03
            X.7UP r3 = (X.AnonymousClass7UP) r3
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            r3.A00 = r4
            java.lang.Object r2 = r0.A01
            X.0YP r2 = (X.AnonymousClass0YP) r2
            r0.A00 = r5
            java.lang.Object r0 = r2.invoke(r3, r0)
            goto L_0x04b7
        L_0x01ca:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x01d8
            if (r2 == r7) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01d8:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r6 = r0.A03
            X.8py r6 = (X.C147818py) r6
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A02
            r3 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0301000_I2
            r2.<init>(r5, r4, r3, r7)
            r0.A00 = r7
            java.lang.Object r0 = r6.AA6(r0, r2)
            goto L_0x04b7
        L_0x01f1:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x01ff
            if (r2 == r6) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01ff:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r5 = r0.A02
            X.0YM r5 = (X.AnonymousClass0YM) r5
            java.lang.Object r4 = r0.A03
            java.lang.Object r2 = r0.A01
            goto L_0x0224
        L_0x020b:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0219
            if (r2 == r6) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0219:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r5 = r0.A01
            X.0YM r5 = (X.AnonymousClass0YM) r5
            java.lang.Object r4 = r0.A02
            java.lang.Object r2 = r0.A03
        L_0x0224:
            X.7Es r2 = (X.C121197Es) r2
            long r2 = r2.A05
            X.7KC r2 = X.C86124wJ.A0O(r2)
            r0.A00 = r6
            java.lang.Object r0 = r5.invoke(r4, r2, r0)
            goto L_0x04b7
        L_0x0234:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x0333
            if (r1 != r4) goto L_0x034e
            X.AnonymousClass0OU.A00(r8)
        L_0x0240:
            X.7Kx r8 = (X.AnonymousClass7Kx) r8
            boolean r1 = X.AnonymousClass7Kx.A0R(r8)
            if (r1 == 0) goto L_0x02ec
            java.lang.Object r4 = r0.A03
            com.facebookpay.offsite.base.CheckoutHandler r4 = (com.facebookpay.offsite.base.CheckoutHandler) r4
            X.7AE r1 = com.facebookpay.offsite.base.CheckoutHandler.A02(r4)
            java.lang.Object r5 = r0.A01
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r5 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r5
            r1.A00 = r5
            X.7AE r3 = com.facebookpay.offsite.base.CheckoutHandler.A02(r4)
            java.lang.Object r2 = r8.A01
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x02ea
            java.lang.Class<com.facebook.graphql.impls.UpdateOffsiteOrderMutationResponseImpl$UpdateOffsiteOrder> r1 = com.facebook.graphql.impls.UpdateOffsiteOrderMutationResponseImpl.UpdateOffsiteOrder.class
            r0 = 1473(0x5c1, float:2.064E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x02ea
            java.lang.String r0 = "order_id"
            java.lang.String r0 = r1.getStringValue(r0)
        L_0x0274:
            r3.A06 = r0
            X.7AE r0 = com.facebookpay.offsite.base.CheckoutHandler.A02(r4)
            com.facebookpay.offsite.models.message.PaymentRequest r0 = r0.A02
            com.facebookpay.offsite.models.message.PaymentResponseContent r7 = X.C121717Hp.A03(r5, r0)
            X.68R r3 = X.AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_INIT
            java.util.Map r2 = r4.A0G
            com.facebookpay.offsite.models.message.PaymentContainer r0 = r7.container
            java.lang.String r1 = r0.containerId
            java.lang.String r0 = "TYPED_CONTAINER_ID"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r0 = X.AnonymousClass4WJ.A0F(r2, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            com.facebookpay.offsite.models.message.PaymentContainer r0 = r7.container
            com.facebookpay.offsite.models.message.PaymentContainerType r0 = r0.containerType
            if (r0 == 0) goto L_0x02a6
            java.lang.String r1 = r0.getType()
            java.lang.String r0 = "CONTAINER_TYPE"
            r2.put(r0, r1)
        L_0x02a6:
            r4.A0I(r3, r2)
            com.facebookpay.offsite.models.message.PaymentContainer r0 = r7.container
            com.facebookpay.offsite.models.message.PaymentContainerType r1 = r0.containerType
            com.facebookpay.offsite.models.message.PaymentContainerType r0 = com.facebookpay.offsite.models.message.PaymentContainerType.PAYPAL_OTC_V1
            if (r1 != r0) goto L_0x02c5
            java.lang.String r3 = r4.A0B
            if (r3 == 0) goto L_0x02c5
            X.7Gp r2 = X.C121537Gp.A00
            java.lang.String r1 = com.facebookpay.offsite.base.CheckoutHandler.A03(r4)
            r0 = 0
            java.util.Map r1 = r2.A02(r5, r1, r3, r0)
            java.lang.String r0 = "submit_payment_container_init"
            com.facebookpay.offsite.base.CheckoutHandler.A0A(r4, r0, r1)
        L_0x02c5:
            X.56r r0 = r4.A0R
            java.util.concurrent.atomic.AtomicLong r1 = X.C128557jn.A08
            java.lang.String r5 = X.C86124wJ.A0y(r1)
            java.lang.String r6 = r4.A0E
            if (r6 == 0) goto L_0x0349
            long r8 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicReference r1 = r4.A0X
            java.lang.Object r10 = r1.get()
            java.lang.String r10 = (java.lang.String) r10
            r12 = 0
            java.lang.String r11 = "paymentResponse"
            com.facebookpay.offsite.models.message.PaymentResponse r4 = new com.facebookpay.offsite.models.message.PaymentResponse
            r4.<init>(r5, r6, r7, r8, r10, r11, r12)
        L_0x02e5:
            r0.A0H(r4)
            goto L_0x1046
        L_0x02ea:
            r0 = 0
            goto L_0x0274
        L_0x02ec:
            boolean r1 = X.AnonymousClass7Kx.A0O(r8)
            if (r1 == 0) goto L_0x1046
            java.lang.Object r1 = r0.A03
            com.facebookpay.offsite.base.CheckoutHandler r1 = (com.facebookpay.offsite.base.CheckoutHandler) r1
            X.56r r0 = r1.A0S
            java.lang.Integer r3 = X.AnonymousClass006.A15
            X.4x8 r2 = r1.A05
            X.C04220Ms.A0B(r2, r4)
            r1 = 2131826479(0x7f11172f, float:1.9285844E38)
            java.lang.String r12 = X.AnonymousClass0wJ.A0k(r2, r1)
            r4 = 0
            java.lang.String r13 = X.AnonymousClass6IX.A00(r2, r3, r4, r4)
            r1 = 2131826477(0x7f11172d, float:1.928584E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r2, r1)
            X.68y r1 = X.C973368y.A04
            X.67N r1 = r1.A01
            X.6iz r6 = new X.6iz
            r6.<init>(r1, r2, r4)
            java.lang.Integer r11 = X.AnonymousClass006.A0C
            com.facebookpay.common.models.ErrorDialogContent r3 = new com.facebookpay.common.models.ErrorDialogContent
            r5 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.88a r2 = new X.88a
            r2.<init>(r3)
            kotlin.Unit r1 = kotlin.Unit.A00
            X.7Kx r4 = X.AnonymousClass7Kx.A0B(r1, r2)
            goto L_0x02e5
        L_0x0333:
            X.AnonymousClass0OU.A00(r8)
            X.7JJ r1 = X.AnonymousClass7Kz.A05()
            com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl r3 = r1.A0A
            java.lang.Object r1 = r0.A02
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r1 = (com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000) r1
            r0.A00 = r4
            java.lang.Object r8 = r3.A01(r1, r0)
            if (r8 != r2) goto L_0x0240
            return r2
        L_0x0349:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x034e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0353:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r11 = 1
            if (r2 == 0) goto L_0x0361
            if (r2 == r11) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0361:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r5 = r0.A03
            r7 = 0
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            r2 = 36
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r9 = X.C86164wN.A10(r4, r3, r2)
            r0.A00 = r11
            X.0YM r6 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2
            r8 = r7
            r10 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = X.AnonymousClass7Ja.A00(r1, r0, r4)
            goto L_0x04b7
        L_0x0382:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0390
            if (r2 == r7) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0390:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r6 = r0.A03
            X.4qz r6 = (X.C83224qz) r6
            java.lang.Object r3 = r0.A02
            r2 = 44
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r2 = X.C86154wM.A12(r3, r2)
            X.4tk r5 = X.AnonymousClass7Aj.A02(r2)
            java.lang.Object r4 = r0.A01
            X.7JH r4 = (X.AnonymousClass7JH) r4
            r3 = 3
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r2 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r2.<init>((X.AnonymousClass7JH) r4, (X.C83224qz) r6, (int) r3)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x04b7
        L_0x03b5:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x03c3
            if (r2 == r6) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x03c3:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r5 = r0.A02
            X.8py r5 = (X.C147818py) r5
            java.lang.Object r3 = r0.A01
            r2 = 37
            kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1 r4 = X.C86154wM.A0z(r3, r2)
            r0.A00 = r6
            r3 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape13S0201000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0201000_I2
            r2.<init>((X.C146958n9) r3, (X.AnonymousClass0YY) r4)
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r5, r0, r2)
            if (r0 == r1) goto L_0x04b7
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x04b7
        L_0x03e4:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x03f6
            if (r2 != r3) goto L_0x03f1
            X.AnonymousClass0OU.A00(r8)     // Catch:{ all -> 0x0413 }
            goto L_0x0406
        L_0x03f1:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x03f6:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r2 = r0.A02     // Catch:{ all -> 0x0413 }
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2     // Catch:{ all -> 0x0413 }
            r0.A00 = r3     // Catch:{ all -> 0x0413 }
            java.lang.Object r2 = r2.A00(r0)     // Catch:{ all -> 0x0413 }
            if (r2 != r1) goto L_0x0406
            return r1
        L_0x0406:
            java.lang.Object r1 = r0.A03
            X.52w r1 = (X.C874752w) r1
            X.84T r1 = r1.A02
            java.lang.Object r0 = r0.A01
            r1.remove(r0)
            goto L_0x0efb
        L_0x0413:
            r2 = move-exception
            java.lang.Object r1 = r0.A03
            X.52w r1 = (X.C874752w) r1
            X.84T r1 = r1.A02
            java.lang.Object r0 = r0.A01
            r1.remove(r0)
            throw r2
        L_0x0420:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x042e
            if (r2 == r7) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x042e:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r6 = r0.A03
            java.lang.Object r2 = r0.A02
            X.8fV r2 = (X.C142738fV) r2
            X.4tk r5 = r2.ApX()
            java.lang.Object r4 = r0.A01
            r3 = 4
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r2 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r6)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x04b7
        L_0x044a:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0458
            if (r2 == r5) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0458:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.0YM r3 = (X.AnonymousClass0YM) r3
            java.lang.Object r2 = r0.A02
            r0.A00 = r5
            java.lang.Object r0 = r3.invoke(r4, r2, r0)
            goto L_0x04b7
        L_0x046a:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x047d
            if (r2 == r6) goto L_0x0478
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0478:
            X.AnonymousClass0OU.A00(r8)
            goto L_0x0efb
        L_0x047d:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r2 = r0.A03
            X.4qz r2 = (X.C83224qz) r2
            java.lang.Object r5 = r0.A01
            X.0YP r5 = (X.AnonymousClass0YP) r5
            java.lang.Object r4 = r0.A02
            X.8pE r4 = (X.C147368pE) r4
            X.Ew2 r3 = r2.Aa1()
            androidx.compose.runtime.ProduceStateScopeImpl r2 = new androidx.compose.runtime.ProduceStateScopeImpl
            r2.<init>(r4, r3)
            r0.A00 = r6
            java.lang.Object r0 = r5.invoke(r2, r0)
            goto L_0x04b7
        L_0x049c:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r0.A03
            X.4qz r4 = (X.C83224qz) r4
            java.lang.Object r3 = r0.A02
            X.54D r3 = (X.AnonymousClass54D) r3
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            r3.A03 = r4
            java.lang.Object r2 = r0.A01
            X.0YP r2 = (X.AnonymousClass0YP) r2
            r0.A00 = r5
            java.lang.Object r0 = r2.invoke(r3, r0)
        L_0x04b7:
            if (r0 != r1) goto L_0x0efb
            return r1
        L_0x04ba:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r9 = 2
            r5 = 1
            if (r1 == 0) goto L_0x04cb
            if (r1 == r5) goto L_0x1043
            if (r1 == r9) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x04cb:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r7 = r0.A03
            java.lang.Object r6 = r0.A01
            X.Ew2 r6 = (X.C27952Ew2) r6
            X.869 r1 = X.AnonymousClass869.A00
            boolean r1 = X.C04220Ms.A0I(r6, r1)
            if (r1 == 0) goto L_0x04ee
            java.lang.Object r4 = r0.A02
            X.4tk r4 = (X.C84714tk) r4
            r3 = 5
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r1 = new com.facebook.redex.IDxFCollectorShape230S0100000_2_I2
            r1.<init>(r7, r3)
            r0.A00 = r5
            java.lang.Object r0 = r4.collect(r1, r0)
            goto L_0x103e
        L_0x04ee:
            java.lang.Object r5 = r0.A02
            r4 = 0
            r3 = 26
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r1.<init>((java.lang.Object) r7, (java.lang.Object) r5, (X.C146958n9) r4, (int) r3)
            r0.A00 = r9
            java.lang.Object r0 = X.C25599DoZ.A00(r0, r6, r1)
            goto L_0x103e
        L_0x0500:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0517
            if (r2 != r6) goto L_0x0512
            java.lang.Object r5 = r0.A03
            X.Dce r5 = (X.C24944Dce) r5
            java.lang.Object r4 = r0.A02
            X.Ewk r4 = (X.C27996Ewk) r4
            goto L_0x052f
        L_0x0512:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0517:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r0.A01
            X.Ewk r4 = (X.C27996Ewk) r4
            X.Dce r5 = r4.Ba7()     // Catch:{ all -> 0x0546 }
        L_0x0522:
            r0.A02 = r4     // Catch:{ all -> 0x0546 }
            r0.A03 = r5     // Catch:{ all -> 0x0546 }
            r0.A00 = r6     // Catch:{ all -> 0x0546 }
            java.lang.Object r8 = r5.A01(r0)     // Catch:{ all -> 0x0546 }
            if (r8 != r1) goto L_0x0532
            goto L_0x0540
        L_0x052f:
            X.AnonymousClass0OU.A00(r8)     // Catch:{ all -> 0x0546 }
        L_0x0532:
            r3 = 0
            boolean r2 = X.AnonymousClass0wJ.A1X(r8)     // Catch:{ all -> 0x0546 }
            if (r2 == 0) goto L_0x0541
            r5.A00()     // Catch:{ all -> 0x0546 }
            X.C121637Hc.A04()     // Catch:{ all -> 0x0546 }
            goto L_0x0522
        L_0x0540:
            return r1
        L_0x0541:
            r4.AC7(r3)
            goto L_0x0efb
        L_0x0546:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0548 }
        L_0x0548:
            r2 = move-exception
            X.AnonymousClass6W2.A00(r0, r4)
            throw r2
        L_0x054d:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r10 = 2
            r11 = 1
            r9 = 0
            if (r1 == 0) goto L_0x055f
            if (r1 == r11) goto L_0x0585
            if (r1 == r10) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x055f:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r6 = r0.A02
            X.4wC r6 = (X.C86054wC) r6
            r1 = 8
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r7 = X.C86114wI.A0Q(r6, r1)
            X.8bg r5 = X.C1370685y.A01()
            java.lang.Object r4 = r0.A01
            r3 = 3
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r1.<init>((java.lang.Object) r4, (java.lang.Object) r7, (X.C146958n9) r9, (int) r3)
            r0.A02 = r6
            r0.A03 = r7
            r0.A00 = r11
            java.lang.Object r1 = X.C25599DoZ.A00(r0, r5, r1)
            if (r1 != r2) goto L_0x058e
            return r2
        L_0x0585:
            java.lang.Object r7 = r0.A03
            java.lang.Object r6 = r0.A02
            X.4wC r6 = (X.C86054wC) r6
            X.AnonymousClass0OU.A00(r8)
        L_0x058e:
            java.lang.Object r3 = r0.A01
            r1 = 26
            kotlin.jvm.internal.KtLambdaShape16S0200000_I2 r1 = X.C86164wN.A0v(r7, r3, r1)
            r0.A02 = r9
            r0.A03 = r9
            r0.A00 = r10
            java.lang.Object r0 = X.C25238DiJ.A00(r0, r1, r6)
            goto L_0x103e
        L_0x05a2:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r5 = 2
            r4 = 1
            if (r1 == 0) goto L_0x05d0
            if (r1 == r4) goto L_0x05e8
            if (r1 != r5) goto L_0x05ff
            java.lang.Object r4 = r0.A02
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r0.A01
            X.4r0 r3 = (X.C83234r0) r3
            X.AnonymousClass0OU.A00(r8)
        L_0x05b9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x1046
            java.lang.Object r1 = r4.next()
            r0.A01 = r3
            r0.A02 = r4
            r0.A00 = r5
            java.lang.Object r1 = r3.emit(r1, r0)
            if (r1 != r2) goto L_0x05b9
            return r2
        L_0x05d0:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r3 = r0.A01
            X.4r0 r3 = (X.C83234r0) r3
            java.lang.Object r1 = r0.A03
            X.6lN r1 = (X.C110256lN) r1
            androidx.paging.FlattenedPageController r1 = r1.A00
            r0.A01 = r3
            r0.A00 = r4
            java.lang.Object r8 = r1.A01(r0)
            if (r8 != r2) goto L_0x05ef
            return r2
        L_0x05e8:
            java.lang.Object r3 = r0.A01
            X.4r0 r3 = (X.C83234r0) r3
            X.AnonymousClass0OU.A00(r8)
        L_0x05ef:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r1 = r0.A03
            X.6lN r1 = (X.C110256lN) r1
            X.8sG r1 = r1.A01
            r1.Cuq()
            java.util.Iterator r4 = r8.iterator()
            goto L_0x05b9
        L_0x05ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0604:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x0612
            if (r1 == r5) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0612:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A02
            X.8sG r3 = (X.C148838sG) r3
            r1 = 13
            kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3 r1 = X.C86164wN.A0q(r4, r1)
            r3.BQv(r1)
            java.lang.Object r1 = r0.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            r0.A00 = r5
            java.lang.Object r0 = r1.invoke(r4, r0)
            goto L_0x103e
        L_0x0630:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x063e
            if (r1 == r9) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x063e:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r7 = r0.A03
            X.0MJ r6 = X.C86144wL.A17()
            java.lang.Object r1 = X.AnonymousClass6X2.A00
            r6.A00 = r1
            java.lang.Object r5 = r0.A02
            X.4tk r5 = (X.C84714tk) r5
            java.lang.Object r4 = r0.A01
            r3 = 0
            com.facebook.redex.IDxFCollectorShape60S0300000_2_I2 r1 = new com.facebook.redex.IDxFCollectorShape60S0300000_2_I2
            r1.<init>(r3, r6, r4, r7)
            r0.A00 = r9
            java.lang.Object r0 = r5.collect(r1, r0)
            goto L_0x103e
        L_0x065f:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x066d
            if (r1 == r5) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x066d:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A02
            X.0YM r3 = (X.AnonymousClass0YM) r3
            java.lang.Object r1 = r0.A01
            r0.A00 = r5
            java.lang.Object r0 = r3.invoke(r1, r4, r0)
            goto L_0x103e
        L_0x0680:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x068e
            if (r1 == r9) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x068e:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r1 = r0.A03
            X.8m8 r1 = (X.C146368m8) r1
            java.lang.Object r7 = r0.A01
            X.4tk r7 = (X.C84714tk) r7
            X.86z r6 = new X.86z
            r6.<init>(r1)
            java.lang.Object r5 = r0.A02
            r4 = 0
            r3 = 31
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r1.<init>((java.lang.Object) r6, (java.lang.Object) r5, (X.C146958n9) r4, (int) r3)
            r0.A00 = r9
            java.lang.Object r0 = X.C25817DsW.A00(r0, r1, r7)
            goto L_0x103e
        L_0x06b0:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x06ee
            if (r1 != r5) goto L_0x07a1
            X.AnonymousClass0OU.A00(r8)
        L_0x06bc:
            java.lang.Object r2 = r0.A02
            X.6qB r8 = (X.C112786qB) r8
            java.util.List r5 = r8.A04
            boolean r0 = r5.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x06eb
            boolean r0 = r2 instanceof X.C885259a
            if (r0 == 0) goto L_0x06eb
            r0 = r4
        L_0x06ce:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x06e8
            boolean r1 = r2 instanceof X.AnonymousClass59Z
            if (r1 == 0) goto L_0x06e8
        L_0x06d8:
            int r3 = r8.A01
            int r2 = r8.A00
            X.59e r1 = new X.59e
            r6 = r1
            r7 = r0
            r8 = r4
            r9 = r5
            r10 = r3
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            return r1
        L_0x06e8:
            java.lang.Object r4 = r8.A02
            goto L_0x06d8
        L_0x06eb:
            java.lang.Object r0 = r8.A03
            goto L_0x06ce
        L_0x06ee:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r1 = r0.A03
            X.59f r1 = (X.C885759f) r1
            X.6bR r8 = r1.A01
            java.lang.Object r3 = r0.A01
            X.6lO r3 = (X.C110266lO) r3
            r0.A00 = r5
            X.59H r8 = (X.AnonymousClass59H) r8
            X.67E r4 = r3.A02
            X.67E r1 = X.AnonymousClass67E.REFRESH
            if (r4 != r1) goto L_0x0740
            X.6Fq r1 = new X.6Fq
            r1.<init>()
            X.EnC r1 = X.C18220wO.A11(r0)
            X.74f r7 = new X.74f
            r7.<init>(r1)
            boolean r3 = r8 instanceof com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource
            if (r3 == 0) goto L_0x072e
            com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource r8 = (com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource) r8
            X.4qz r6 = r8.A01
            r5 = 0
            r3 = 39
            kotlin.coroutines.jvm.internal.KtSLambdaShape17S0201000_I2_3 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape17S0201000_I2_3
            r4.<init>(r8, r7, r5, r3)
            r3 = 3
            X.C25237DiI.A00(r5, r5, r4, r6, r3)
        L_0x0727:
            java.lang.Object r8 = r1.A0B()
        L_0x072b:
            if (r8 != r2) goto L_0x06bc
            return r2
        L_0x072e:
            X.0ZV r8 = X.AnonymousClass0ZV.A00
            r6 = 0
            r9 = 0
            X.8s9 r4 = r7.A00
            int r3 = r8.size()
            int r10 = -r3
            X.6qB r5 = new X.6qB
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x079d
        L_0x0740:
            java.lang.Object r3 = r3.A03
            if (r3 != 0) goto L_0x0750
            X.0ZV r11 = X.AnonymousClass0ZV.A00
            r9 = 0
            r12 = 0
            X.6qB r8 = new X.6qB
            r10 = r9
            r13 = r12
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x072b
        L_0x0750:
            X.67E r1 = X.AnonymousClass67E.PREPEND
            if (r4 != r1) goto L_0x0768
            X.6bT r1 = new X.6bT
            r1.<init>(r3)
            X.EnC r1 = X.C18220wO.A11(r0)
            r3 = 0
            X.75R r7 = new X.75R
            r7.<init>(r1, r3)
            boolean r3 = r8 instanceof com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource
            if (r3 == 0) goto L_0x078f
            goto L_0x0727
        L_0x0768:
            X.67E r1 = X.AnonymousClass67E.APPEND
            if (r4 != r1) goto L_0x07a6
            X.6bT r9 = new X.6bT
            r9.<init>(r3)
            X.EnC r1 = X.C18220wO.A11(r0)
            X.75R r7 = new X.75R
            r7.<init>(r1, r5)
            boolean r3 = r8 instanceof com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource
            if (r3 == 0) goto L_0x078f
            com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource r8 = (com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource) r8
            X.4qz r4 = r8.A01
            r10 = 0
            r11 = 28
            kotlin.coroutines.jvm.internal.KtSLambdaShape10S0301000_I2_2 r6 = new kotlin.coroutines.jvm.internal.KtSLambdaShape10S0301000_I2_2
            r6.<init>(r7, r8, r9, r10, r11)
            r3 = 3
            X.C25237DiI.A00(r10, r10, r6, r4, r3)
            goto L_0x0727
        L_0x078f:
            X.0ZV r8 = X.AnonymousClass0ZV.A00
            r6 = 0
            X.8s9 r4 = r7.A00
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            X.6qB r5 = new X.6qB
            r7 = r6
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x079d:
            r4.resumeWith(r5)
            goto L_0x0727
        L_0x07a1:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0a()
            throw r2
        L_0x07a6:
            r0 = 745(0x2e9, float:1.044E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r4)
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r0)
            throw r2
        L_0x07b5:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r7 = 2
            r6 = 1
            if (r2 == 0) goto L_0x07f0
            if (r2 == r6) goto L_0x0851
            if (r2 != r7) goto L_0x08f7
            java.lang.Object r4 = r0.A02
            java.lang.Object r5 = r0.A01
            androidx.paging.PagingSource r5 = (androidx.paging.PagingSource) r5
            X.AnonymousClass0OU.A00(r8)
        L_0x07ca:
            X.6Fs r8 = (X.C98486Fs) r8
            boolean r1 = r8 instanceof X.C885459c
            if (r1 == 0) goto L_0x087c
            java.lang.Object r0 = r0.A03
            X.56i r0 = (X.C880256i) r0
            X.89E r3 = r0.A00
            X.67E r2 = X.AnonymousClass67E.REFRESH
            r0 = 0
            X.59K r1 = new X.59K
            r1.<init>(r0)
            boolean r0 = r3 instanceof X.AnonymousClass59W
            if (r0 == 0) goto L_0x07eb
            X.59W r3 = (X.AnonymousClass59W) r3
            X.7Gk r0 = r3.A04
            X.6pR r0 = r0.A00
            r0.A00(r1, r2)
        L_0x07eb:
            r5.A03()
            goto L_0x0efb
        L_0x07f0:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r9 = r0.A03
            X.56i r9 = (X.C880256i) r9
            X.89E r3 = r9.A00
            boolean r2 = r3 instanceof X.AnonymousClass59W
            if (r2 == 0) goto L_0x0837
            X.59W r3 = (X.AnonymousClass59W) r3
            androidx.paging.PagingSource r4 = r3.A05
        L_0x0801:
            X.0ZU r3 = r9.A04
            r2 = 0
            X.C04220Ms.A0B(r3, r2)
            X.6uj r2 = r4.A00
            r2.A01(r3)
            X.0ZU r2 = r9.A05
            java.lang.Object r5 = r2.invoke()
            androidx.paging.PagingSource r5 = (androidx.paging.PagingSource) r5
            X.6uj r2 = r5.A00
            r2.A00(r3)
            boolean r2 = r5 instanceof X.C885759f
            if (r2 == 0) goto L_0x083c
            r8 = r5
            X.59f r8 = (X.C885759f) r8
            r4 = 15
            int r3 = r8.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r2) goto L_0x083a
            if (r4 == r3) goto L_0x083a
            java.lang.String r1 = "Page size is already set to "
            r0 = 46
            java.lang.String r0 = X.AnonymousClass00U.A0E(r1, r0, r3)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0837:
            androidx.paging.PagingSource r4 = r3.A03
            goto L_0x0801
        L_0x083a:
            r8.A00 = r4
        L_0x083c:
            X.EgD r8 = r9.A07
            r4 = 0
            r3 = 11
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2
            r2.<init>(r9, r4, r3)
            r0.A01 = r5
            r0.A00 = r6
            java.lang.Object r2 = X.C25599DoZ.A00(r0, r8, r2)
            if (r2 != r1) goto L_0x0858
            return r1
        L_0x0851:
            java.lang.Object r5 = r0.A01
            androidx.paging.PagingSource r5 = (androidx.paging.PagingSource) r5
            X.AnonymousClass0OU.A00(r8)
        L_0x0858:
            java.lang.Object r3 = r0.A03
            X.56i r3 = (X.C880256i) r3
            X.89E r2 = r3.A00
            java.lang.Object r4 = r2.A01()
            X.6Fr r3 = r3.A02
            r2 = 0
            X.C04220Ms.A0B(r3, r2)
            r3 = 45
            X.59b r2 = new X.59b
            r2.<init>(r3, r4, r6)
            r0.A01 = r5
            r0.A02 = r4
            r0.A00 = r7
            java.lang.Object r8 = r5.A01(r2, r0)
            if (r8 != r1) goto L_0x07ca
            return r1
        L_0x087c:
            boolean r1 = r8 instanceof X.C885559d
            if (r1 == 0) goto L_0x08a0
            java.lang.Object r0 = r0.A03
            X.56i r0 = (X.C880256i) r0
            X.89E r3 = r0.A00
            X.67E r2 = X.AnonymousClass67E.REFRESH
            X.59d r8 = (X.C885559d) r8
            java.lang.Throwable r0 = r8.A00
            X.59I r1 = new X.59I
            r1.<init>(r0)
            boolean r0 = r3 instanceof X.AnonymousClass59W
            if (r0 == 0) goto L_0x0efb
            X.59W r3 = (X.AnonymousClass59W) r3
            X.7Gk r0 = r3.A04
            X.6pR r0 = r0.A00
            r0.A00(r1, r2)
            goto L_0x0efb
        L_0x08a0:
            boolean r1 = r8 instanceof X.C885659e
            if (r1 == 0) goto L_0x0efb
            X.59e r8 = (X.C885659e) r8
            java.lang.Object r11 = r0.A03
            X.56i r11 = (X.C880256i) r11
            X.4qz r13 = r11.A08
            X.EgD r12 = r11.A07
            X.EgD r10 = r11.A06
            r9 = 0
            X.6Fr r3 = r11.A02
            X.C18210wN.A0n(r7, r5, r13)
            X.AnonymousClass0wJ.A1R(r12, r10)
            r0 = 6
            X.C04220Ms.A0B(r3, r0)
            if (r8 != 0) goto L_0x08d5
            r0 = 45
            X.59b r2 = new X.59b
            r2.<init>(r0, r4, r6)
            r0 = 41
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r2, (X.C146958n9) r9, (int) r0)
            X.869 r0 = X.AnonymousClass869.A00
            java.lang.Object r8 = X.DH9.A00(r0, r1)
            X.59e r8 = (X.C885659e) r8
        L_0x08d5:
            X.59W r1 = new X.59W
            r14 = r1
            r15 = r3
            r16 = r8
            r17 = r5
            r18 = r4
            r19 = r12
            r20 = r10
            r21 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            X.89E r0 = r11.A00
            r0.A00 = r9
            java.lang.Runnable r0 = r11.A03
            r1.A00 = r0
            r11.A00 = r1
            r11.A0G(r1)
            goto L_0x0efb
        L_0x08f7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x08fc:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x090a
            if (r1 == r6) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x090a:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r7 = r0.A02
            X.8sN r7 = (X.C148908sN) r7
            r10 = 0
            java.lang.Object r8 = r0.A03
            androidx.paging.PageFetcher r8 = (androidx.paging.PageFetcher) r8
            X.77a r1 = r8.A00
            X.4tk r4 = r1.A00
            r3 = 38
            r15 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r1.<init>((java.lang.Object) r10, (X.C146958n9) r10, (int) r3, (int) r15)
            com.facebook.redex.IDxFlowShape94S0200000_2_I2 r11 = X.C86144wL.A0O(r1, r4)
            androidx.paging.PageFetcher$flow$1$2 r12 = new androidx.paging.PageFetcher$flow$1$2
            r12.<init>(r8, r10)
            r14 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2 r9 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2
            r13 = r10
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (X.C146958n9) r13, (int) r14, (int) r15)
            X.86y r3 = new X.86y
            r3.<init>(r9)
            r1 = 50
            com.facebook.redex.IDxFlowShape253S0100000_4_I2 r5 = new com.facebook.redex.IDxFlowShape253S0100000_4_I2
            r5.<init>((X.C84714tk) r3, (int) r1)
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0401000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0401000_I2
            r4.<init>((X.C146958n9) r10, (java.lang.Object) r8, (java.lang.Object) r10, (int) r6)
            r3 = 32
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r1.<init>((X.C146958n9) r10, (X.AnonymousClass0YM) r4, (X.C84714tk) r5, (int) r3)
            X.4tk r3 = X.D4V.A00(r1)
            X.87T r1 = new X.87T
            r1.<init>(r7)
            r0.A00 = r6
            java.lang.Object r0 = r3.collect(r1, r0)
            goto L_0x103e
        L_0x095c:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x096a
            if (r1 == r7) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x096a:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r6 = r0.A02
            java.lang.Object r1 = r0.A01
            X.Ewk r1 = (X.C27996Ewk) r1
            X.4tk r5 = X.AnonymousClass7C4.A01(r1)
            java.lang.Object r4 = r0.A03
            r3 = 6
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r1 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r1.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r6)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r1, r0)
            goto L_0x103e
        L_0x0987:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r9 = 3
            r5 = 2
            r4 = 1
            r3 = 0
            if (r2 == 0) goto L_0x09cd
            if (r2 == r4) goto L_0x0b45
            if (r2 == r5) goto L_0x0b45
            if (r2 != r9) goto L_0x0b40
            X.AnonymousClass0OU.A00(r8)
        L_0x099a:
            java.lang.Object r8 = r0.A03
            androidx.paging.PagingDataDiffer r8 = (androidx.paging.PagingDataDiffer) r8
            X.7cK r12 = r8.A01
            java.lang.Object r7 = r0.A01
            X.6qx r7 = (X.C113226qx) r7
            X.7cL r9 = r8.A05
            X.C04220Ms.A0B(r7, r3)
            X.C04220Ms.A0B(r9, r4)
            boolean r6 = r7 instanceof androidx.paging.PageEvent$Insert
            if (r6 == 0) goto L_0x0a51
            r10 = r7
            androidx.paging.PageEvent$Insert r10 = (androidx.paging.PageEvent$Insert) r10
            java.util.List r13 = r10.A05
            java.util.Iterator r11 = r13.iterator()
            r2 = 0
        L_0x09ba:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0b4a
            java.lang.Object r1 = r11.next()
            X.79m r1 = (X.C1202779m) r1
            java.util.List r1 = r1.A01
            int r2 = X.C86164wN.A06(r1, r2)
            goto L_0x09ba
        L_0x09cd:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r8 = r0.A01
            X.6qx r8 = (X.C113226qx) r8
            boolean r2 = r8 instanceof androidx.paging.PageEvent$Insert
            if (r2 == 0) goto L_0x0a02
            r7 = r8
            androidx.paging.PageEvent$Insert r7 = (androidx.paging.PageEvent$Insert) r7
            X.67E r6 = r7.A04
            X.67E r2 = X.AnonymousClass67E.REFRESH
            if (r6 != r2) goto L_0x0a02
            java.lang.Object r10 = r0.A03
            androidx.paging.PagingDataDiffer r10 = (androidx.paging.PagingDataDiffer) r10
            java.util.List r11 = r7.A05
            int r5 = r7.A01
            int r3 = r7.A00
            X.79c r8 = r7.A03
            X.79c r9 = r7.A02
            java.lang.Object r2 = r0.A02
            X.6ii r2 = (X.C108646ii) r2
            X.8gF r7 = r2.A00
            r0.A00 = r4
            r13 = r5
            r14 = r3
            r15 = r4
            r12 = r0
            java.lang.Object r2 = androidx.paging.PagingDataDiffer.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x09ff:
            if (r2 != r1) goto L_0x0be7
            return r1
        L_0x0a02:
            boolean r2 = r8 instanceof androidx.paging.PageEvent$StaticList
            java.lang.Object r11 = r0.A03
            androidx.paging.PagingDataDiffer r11 = (androidx.paging.PagingDataDiffer) r11
            if (r2 == 0) goto L_0x0a3a
            androidx.paging.PageEvent$StaticList r8 = (androidx.paging.PageEvent$StaticList) r8
            java.util.List r7 = r8.A02
            int[] r6 = new int[]{r3}
            r4 = 0
            X.79m r2 = new X.79m
            r2.<init>(r7, r4, r6, r3)
            java.util.List r12 = X.C18180wK.A0n(r2)
            X.79c r9 = r8.A01
            if (r9 != 0) goto L_0x0a26
            X.79c r2 = r8.A00
            r16 = 0
            if (r2 == 0) goto L_0x0a28
        L_0x0a26:
            r16 = 1
        L_0x0a28:
            X.79c r10 = r8.A00
            java.lang.Object r2 = r0.A02
            X.6ii r2 = (X.C108646ii) r2
            X.8gF r8 = r2.A00
            r0.A00 = r5
            r14 = r3
            r15 = r3
            r13 = r0
            java.lang.Object r2 = androidx.paging.PagingDataDiffer.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x09ff
        L_0x0a3a:
            boolean r2 = r11 instanceof androidx.paging.AsyncPagingDataDiffer$differBase$1
            if (r2 == 0) goto L_0x0a4f
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r11 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r11
            androidx.paging.AsyncPagingDataDiffer r2 = r11.A00
            boolean r2 = r2.A00
        L_0x0a44:
            if (r2 == 0) goto L_0x099a
            r0.A00 = r9
            java.lang.Object r2 = X.DHD.A00(r0)
            if (r2 != r1) goto L_0x099a
            return r1
        L_0x0a4f:
            r2 = 0
            goto L_0x0a44
        L_0x0a51:
            boolean r1 = r7 instanceof X.AnonymousClass59N
            if (r1 == 0) goto L_0x0b29
            r11 = r7
            X.59N r11 = (X.AnonymousClass59N) r11
            int r13 = r12.getSize()
            X.67E r1 = r11.A03
            X.67E r14 = X.AnonymousClass67E.PREPEND
            if (r1 != r14) goto L_0x0ade
            int r10 = r12.A01
            int r2 = r11.A01
            int r1 = r11.A00
            X.8bH r1 = X.AnonymousClass8bH.A02(r2, r1)
            int r2 = X.C125047cK.A00(r12, r1)
            int r1 = r12.A02
            int r1 = r1 - r2
            r12.A02 = r1
            int r11 = r11.A02
            r12.A01 = r11
            int r12 = r12.getSize()
            int r12 = r12 - r13
            if (r12 <= 0) goto L_0x0ad3
            androidx.paging.PagingDataDiffer r1 = r9.A00
            X.8l3 r1 = r1.A03
            r1.C2k(r3, r12)
        L_0x0a87:
            int r10 = r10 + r12
            int r2 = java.lang.Math.max(r3, r10)
            int r11 = r11 - r2
            if (r11 <= 0) goto L_0x0a96
            androidx.paging.PagingDataDiffer r1 = r9.A00
            X.8l3 r1 = r1.A03
            r1.BoU(r2, r11)
        L_0x0a96:
            X.59K r10 = X.AnonymousClass59K.A01
            X.C04220Ms.A0B(r14, r3)
            androidx.paging.PagingDataDiffer r1 = r9.A00
            X.76w r11 = r1.A04
            X.79c r1 = r11.A04
            int r2 = r14.ordinal()
            if (r2 == r5) goto L_0x0ad0
            X.6bS r1 = r1.A01
        L_0x0aa9:
            boolean r1 = X.C04220Ms.A0I(r1, r10)
            if (r1 != 0) goto L_0x0b9e
            r11.A05 = r4
            X.79c r9 = r11.A04
            X.6bS r4 = r9.A02
            if (r2 == r5) goto L_0x0ac8
            X.6bS r1 = r9.A00
            X.79c r2 = new X.79c
            r2.<init>(r4, r10, r1)
        L_0x0abe:
            r11.A04 = r2
            r2.equals(r9)
            X.C1197776w.A00(r11)
            goto L_0x0b9e
        L_0x0ac8:
            X.6bS r1 = r9.A01
            X.79c r2 = new X.79c
            r2.<init>(r4, r1, r10)
            goto L_0x0abe
        L_0x0ad0:
            X.6bS r1 = r1.A00
            goto L_0x0aa9
        L_0x0ad3:
            if (r12 >= 0) goto L_0x0a87
            int r2 = -r12
            androidx.paging.PagingDataDiffer r1 = r9.A00
            X.8l3 r1 = r1.A03
            r1.CFn(r3, r2)
            goto L_0x0a87
        L_0x0ade:
            int r10 = r12.A00
            int r2 = r11.A01
            int r1 = r11.A00
            X.8bH r1 = X.AnonymousClass8bH.A02(r2, r1)
            int r2 = X.C125047cK.A00(r12, r1)
            int r1 = r12.A02
            int r1 = r1 - r2
            r12.A02 = r1
            int r11 = r11.A02
            r12.A00 = r11
            int r2 = r12.getSize()
            int r2 = r2 - r13
            if (r2 <= 0) goto L_0x0b19
            androidx.paging.PagingDataDiffer r1 = r9.A00
            X.8l3 r1 = r1.A03
            r1.C2k(r13, r2)
        L_0x0b03:
            r1 = 0
        L_0x0b04:
            int r10 = r10 - r1
            int r10 = r11 - r10
            if (r10 <= 0) goto L_0x0b15
            int r2 = r12.getSize()
            int r2 = r2 - r11
            androidx.paging.PagingDataDiffer r1 = r9.A00
            X.8l3 r1 = r1.A03
            r1.BoU(r2, r10)
        L_0x0b15:
            X.67E r14 = X.AnonymousClass67E.APPEND
            goto L_0x0a96
        L_0x0b19:
            if (r2 >= 0) goto L_0x0b03
            int r13 = r13 + r2
            int r2 = -r2
            androidx.paging.PagingDataDiffer r1 = r9.A00
            X.8l3 r1 = r1.A03
            r1.CFn(r13, r2)
            int r1 = java.lang.Math.min(r10, r2)
            goto L_0x0b04
        L_0x0b29:
            boolean r1 = r7 instanceof X.AnonymousClass59L
            if (r1 == 0) goto L_0x0b35
            r1 = r7
            X.59L r1 = (X.AnonymousClass59L) r1
            X.79c r4 = r1.A01
            X.79c r2 = r1.A00
            goto L_0x0b96
        L_0x0b35:
            boolean r1 = r7 instanceof androidx.paging.PageEvent$StaticList
            if (r1 == 0) goto L_0x0b9e
            java.lang.String r0 = "Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0b40:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0b45:
            X.AnonymousClass0OU.A00(r8)
            goto L_0x0be7
        L_0x0b4a:
            int r16 = r12.getSize()
            X.67E r1 = r10.A04
            int r1 = r1.ordinal()
            if (r1 == r3) goto L_0x0c81
            if (r1 == r4) goto L_0x0c4a
            if (r1 != r5) goto L_0x0b92
            int r1 = r12.A00
            int r15 = java.lang.Math.min(r1, r2)
            int r14 = r12.A01
            int r1 = r12.A02
            int r14 = r14 + r1
            int r11 = r2 - r15
            int r5 = r14 + r15
            java.util.List r4 = r12.A03
            int r1 = r4.size()
            r4.addAll(r1, r13)
            int r1 = r12.A02
            int r1 = r1 + r2
            r12.A02 = r1
            int r1 = r10.A00
            r12.A00 = r1
            androidx.paging.PagingDataDiffer r1 = r9.A00
            X.8l3 r4 = r1.A03
            r4.BoU(r14, r15)
            r4.C2k(r5, r11)
            int r2 = r12.getSize()
            int r1 = r2 - r16
            int r1 = r1 - r11
            if (r1 <= 0) goto L_0x0c42
            int r2 = r2 - r1
            r4.C2k(r2, r1)
        L_0x0b92:
            X.79c r4 = r10.A03
            X.79c r2 = r10.A02
        L_0x0b96:
            X.C04220Ms.A0B(r4, r3)
            androidx.paging.PagingDataDiffer r1 = r9.A00
            r1.A04(r4, r2)
        L_0x0b9e:
            boolean r1 = r7 instanceof X.AnonymousClass59N
            if (r1 == 0) goto L_0x0ba4
            r8.A0C = r3
        L_0x0ba4:
            if (r6 == 0) goto L_0x0be7
            X.76w r1 = r8.A04
            X.79c r2 = r1.A04
            X.6bS r1 = r2.A01
            boolean r5 = r1.A00
            X.6bS r1 = r2.A00
            boolean r4 = r1.A00
            androidx.paging.PageEvent$Insert r7 = (androidx.paging.PageEvent$Insert) r7
            X.67E r2 = r7.A04
            X.67E r1 = X.AnonymousClass67E.PREPEND
            if (r2 != r1) goto L_0x0bbc
            if (r5 != 0) goto L_0x0c40
        L_0x0bbc:
            X.67E r1 = X.AnonymousClass67E.APPEND
            if (r2 != r1) goto L_0x0bc2
            if (r4 != 0) goto L_0x0c40
        L_0x0bc2:
            r4 = 1
        L_0x0bc3:
            java.util.List r2 = r7.A05
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0c26
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0c26
        L_0x0bcf:
            r2 = 1
        L_0x0bd0:
            if (r4 == 0) goto L_0x0c23
            boolean r1 = r8.A0C
            if (r1 != 0) goto L_0x0c0d
            if (r2 == 0) goto L_0x0be7
        L_0x0bd8:
            X.8gF r3 = r8.A00
            if (r3 == 0) goto L_0x0be7
            X.7cK r2 = r8.A01
            int r1 = r8.A0B
            X.59j r1 = r2.A01(r1)
            r3.A53(r1)
        L_0x0be7:
            java.lang.Object r2 = r0.A01
            boolean r1 = r2 instanceof androidx.paging.PageEvent$Insert
            if (r1 != 0) goto L_0x0bf5
            boolean r1 = r2 instanceof X.AnonymousClass59N
            if (r1 != 0) goto L_0x0bf5
            boolean r1 = r2 instanceof androidx.paging.PageEvent$StaticList
            if (r1 == 0) goto L_0x0efb
        L_0x0bf5:
            java.lang.Object r0 = r0.A03
            androidx.paging.PagingDataDiffer r0 = (androidx.paging.PagingDataDiffer) r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x0bff:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0efb
            java.lang.Object r0 = r1.next()
            X.C18240wQ.A1G(r0)
            goto L_0x0bff
        L_0x0c0d:
            if (r2 != 0) goto L_0x0bd8
            int r2 = r8.A0B
            X.7cK r1 = r8.A01
            int r1 = r1.A01
            if (r2 < r1) goto L_0x0bd8
            int r4 = r8.A0B
            X.7cK r1 = r8.A01
            int r2 = r1.A01
            int r1 = r1.A02
            int r2 = r2 + r1
            if (r4 <= r2) goto L_0x0c23
            goto L_0x0bd8
        L_0x0c23:
            r8.A0C = r3
            goto L_0x0be7
        L_0x0c26:
            java.util.Iterator r2 = r2.iterator()
        L_0x0c2a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0bcf
            java.lang.Object r1 = r2.next()
            X.79m r1 = (X.C1202779m) r1
            java.util.List r1 = r1.A01
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0c2a
            r2 = 0
            goto L_0x0bd0
        L_0x0c40:
            r4 = 0
            goto L_0x0bc3
        L_0x0c42:
            if (r1 >= 0) goto L_0x0b92
            int r1 = -r1
            r4.CFn(r2, r1)
            goto L_0x0b92
        L_0x0c4a:
            int r11 = r12.A01
            int r5 = java.lang.Math.min(r11, r2)
            int r11 = r11 - r5
            int r4 = r2 - r5
            java.util.List r1 = r12.A03
            r1.addAll(r3, r13)
            int r1 = r12.A02
            int r1 = r1 + r2
            r12.A02 = r1
            int r1 = r10.A01
            r12.A01 = r1
            androidx.paging.PagingDataDiffer r1 = r9.A00
            X.8l3 r2 = r1.A03
            r2.BoU(r11, r5)
            r2.C2k(r3, r4)
            int r1 = r12.getSize()
            int r1 = r1 - r16
            int r1 = r1 - r4
            if (r1 <= 0) goto L_0x0c79
            r2.C2k(r3, r1)
            goto L_0x0b92
        L_0x0c79:
            if (r1 >= 0) goto L_0x0b92
            int r1 = -r1
            r2.CFn(r3, r1)
            goto L_0x0b92
        L_0x0c81:
            java.lang.String r0 = "Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0c88:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x0c96
            if (r1 == r5) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0c96:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r0.A03
            X.4qz r4 = (X.C83224qz) r4
            java.lang.Object r1 = r0.A02
            X.8m8 r1 = (X.C146368m8) r1
            androidx.paging.SimpleProducerScopeImpl r3 = new androidx.paging.SimpleProducerScopeImpl
            r3.<init>(r4, r1)
            java.lang.Object r1 = r0.A01
            X.0YP r1 = (X.AnonymousClass0YP) r1
            r0.A00 = r5
            java.lang.Object r0 = r1.invoke(r3, r0)
            goto L_0x103e
        L_0x0cb2:
            r2 = r8
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r3 = r0.A00
            r4 = 1
            if (r3 == 0) goto L_0x0cc6
            if (r3 != r4) goto L_0x0cc1
            java.lang.Object r3 = r0.A03
            X.85x r3 = (X.AnonymousClass85x) r3
            goto L_0x0cf7
        L_0x0cc1:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0a()
            throw r2
        L_0x0cc6:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r2 = r0.A03
            X.4qz r2 = (X.C83224qz) r2
            X.Ew2 r3 = r2.Aa1()
            X.860 r2 = X.AnonymousClass85x.A02
            X.8sH r3 = r3.AOA(r2)
            X.C04220Ms.A0A(r3)
            X.85x r3 = (X.AnonymousClass85x) r3
            java.util.concurrent.atomic.AtomicInteger r2 = r3.A00
            r2.incrementAndGet()
            java.lang.Object r2 = r0.A02     // Catch:{ all -> 0x0d1c }
            X.M6w r2 = (X.C41259M6w) r2     // Catch:{ all -> 0x0d1c }
            r2.beginTransaction()     // Catch:{ all -> 0x0d1c }
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x0d13 }
            X.0YY r2 = (X.AnonymousClass0YY) r2     // Catch:{ all -> 0x0d13 }
            r0.A03 = r3     // Catch:{ all -> 0x0d13 }
            r0.A00 = r4     // Catch:{ all -> 0x0d13 }
            java.lang.Object r2 = r2.invoke(r0)     // Catch:{ all -> 0x0d13 }
            if (r2 != r1) goto L_0x0cfa
            return r1
        L_0x0cf7:
            X.AnonymousClass0OU.A00(r8)     // Catch:{ all -> 0x0d13 }
        L_0x0cfa:
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x0d13 }
            X.M6w r1 = (X.C41259M6w) r1     // Catch:{ all -> 0x0d13 }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x0d13 }
            r1.endTransaction()     // Catch:{ all -> 0x0d1c }
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A00
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x1040
            java.lang.String r0 = "Transaction was never started or was already released."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0d13:
            r1 = move-exception
            java.lang.Object r0 = r0.A02     // Catch:{ all -> 0x0d1c }
            X.M6w r0 = (X.C41259M6w) r0     // Catch:{ all -> 0x0d1c }
            r0.endTransaction()     // Catch:{ all -> 0x0d1c }
            throw r1     // Catch:{ all -> 0x0d1c }
        L_0x0d1c:
            r2 = move-exception
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A00
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0d39
            java.lang.String r0 = "Transaction was never started or was already released."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0d2c:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r10 = 1
            if (r1 == 0) goto L_0x0d3a
            if (r1 == r10) goto L_0x1043
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0a()
        L_0x0d39:
            throw r2
        L_0x0d3a:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r4 = r0.A03
            X.52r r4 = (X.C874252r) r4
            X.8cn r11 = r4.A00
            if (r11 == 0) goto L_0x0dfd
            java.lang.Object r3 = r0.A02
            X.8mM r3 = (X.C146508mM) r3
            java.lang.Object r1 = r0.A01
            X.0ZU r1 = (X.AnonymousClass0ZU) r1
            X.8DM r7 = new X.8DM
            r7.<init>(r4, r3, r1)
            r0.A00 = r10
            X.7Y0 r11 = (X.AnonymousClass7Y0) r11
            java.lang.Object r1 = r7.invoke()
            X.7F6 r1 = (X.AnonymousClass7F6) r1
            if (r1 == 0) goto L_0x0df9
            long r3 = r11.A00
            long r5 = X.AnonymousClass7Y0.A02(r11, r1, r3)
            long r3 = X.AnonymousClass7KC.A03
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0df9
            X.EnC r12 = X.C18220wO.A11(r0)
            X.6oo r9 = new X.6oo
            r9.<init>(r7, r12)
            X.6o5 r3 = r11.A06
            r8 = 0
            X.0ZU r0 = r9.A00
            java.lang.Object r7 = r0.invoke()
            X.7F6 r7 = (X.AnonymousClass7F6) r7
            X.8s9 r1 = r9.A01
            if (r7 != 0) goto L_0x0d8f
            kotlin.Unit r0 = kotlin.Unit.A00
            r1.resumeWith(r0)
        L_0x0d87:
            java.lang.Object r0 = r12.A0B()
            if (r0 != r2) goto L_0x0df9
            goto L_0x103e
        L_0x0d8f:
            r0 = 22
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r0 = X.C86164wN.A10(r9, r3, r0)
            r1.BQt(r0)
            X.84X r6 = r3.A00
            int r0 = r6.A00
            int r0 = r0 - r10
            X.8bH r0 = X.AnonymousClass8bH.A02(r8, r0)
            int r5 = r0.A00
            int r4 = r0.A01
            if (r5 > r4) goto L_0x0df5
        L_0x0da7:
            java.lang.Object[] r0 = r6.A01
            r0 = r0[r4]
            X.6oo r0 = (X.C112006oo) r0
            X.0ZU r0 = r0.A00
            java.lang.Object r3 = r0.invoke()
            X.7F6 r3 = (X.AnonymousClass7F6) r3
            if (r3 == 0) goto L_0x0df0
            X.7F6 r1 = r7.A04(r3)
            boolean r0 = X.C04220Ms.A0I(r1, r7)
            if (r0 == 0) goto L_0x0dce
            int r0 = r4 + 1
            r6.A08(r0, r9)
        L_0x0dc6:
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x0d87
            X.AnonymousClass7Y0.A04(r11)
            goto L_0x0d87
        L_0x0dce:
            boolean r0 = X.C04220Ms.A0I(r1, r3)
            if (r0 != 0) goto L_0x0df0
            java.lang.String r0 = "bringIntoView call interrupted by a newer, non-overlapping call"
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            r3.<init>(r0)
            int r1 = r6.A00
            int r1 = r1 - r10
            if (r1 > r4) goto L_0x0df0
        L_0x0de0:
            java.lang.Object[] r0 = r6.A01
            r0 = r0[r4]
            X.6oo r0 = (X.C112006oo) r0
            X.8s9 r0 = r0.A01
            r0.AC9(r3)
            if (r1 == r4) goto L_0x0df0
            int r1 = r1 + 1
            goto L_0x0de0
        L_0x0df0:
            if (r4 == r5) goto L_0x0df5
            int r4 = r4 + -1
            goto L_0x0da7
        L_0x0df5:
            r6.A08(r8, r9)
            goto L_0x0dc6
        L_0x0df9:
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x103e
        L_0x0dfd:
            java.lang.String r0 = "responder"
            X.C04220Ms.A0E(r0)
            r2 = 0
            throw r2
        L_0x0e04:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x0e1b
            if (r1 != r4) goto L_0x0e31
            java.lang.Object r3 = r0.A02
            X.7o3 r3 = (X.AnonymousClass7o3) r3
            X.AnonymousClass0OU.A00(r8)
        L_0x0e14:
            X.LCx r0 = r3.A00
            r0.A06(r8)
            goto L_0x0efb
        L_0x0e1b:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r3 = r0.A01
            X.7o3 r3 = (X.AnonymousClass7o3) r3
            java.lang.Object r1 = r0.A03
            androidx.work.CoroutineWorker r1 = (androidx.work.CoroutineWorker) r1
            r0.A02 = r3
            r0.A00 = r4
            java.lang.Object r8 = r1.A06(r0)
            if (r8 != r2) goto L_0x0e14
            return r2
        L_0x0e31:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0e36:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r6 = r0.A03
            X.6jp r6 = (X.C109326jp) r6
            if (r6 == 0) goto L_0x0efb
            java.lang.Object r5 = r0.A02
            X.7h3 r5 = (X.C127397h3) r5
            X.3VO r4 = X.AnonymousClass3VO.A00()
            r3 = 0
            int r1 = r0.A00
            float r2 = (float) r1
            r1 = 100
            float r1 = (float) r1
            float r2 = r2 / r1
            java.lang.Float r1 = X.C86154wM.A0W(r2)
            r4.A02(r1, r3)
            r1 = 1
            java.lang.Object r0 = r0.A01
            X.3HX r0 = (X.AnonymousClass3HX) r0
            r4.A02(r0, r1)
            X.C122047Jt.A07(r0, r5, r4, r6)
            goto L_0x0efb
        L_0x0e63:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r7 = 1
            r5 = 2
            if (r2 == 0) goto L_0x0eb7
            if (r2 == r7) goto L_0x0ec7
            if (r2 != r5) goto L_0x0f15
            java.lang.Object r3 = r0.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r0.A01
            X.LyC r4 = (X.C41173LyC) r4
            X.AnonymousClass0OU.A00(r8)
        L_0x0e7a:
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r6 = r8.A00
            X.LyC r6 = (X.C41173LyC) r6
            java.lang.Object r1 = r8.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.A03
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase r5 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase) r5
            java.util.List r9 = com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase.A03(r3)
            java.util.List r0 = com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase.A03(r1)
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r3 = r0.iterator()
        L_0x0e98:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0ee5
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.android.billingclient.api.Purchase r0 = (com.android.billingclient.api.Purchase) r0
            org.json.JSONObject r1 = r0.A02
            r0 = 756(0x2f4, float:1.06E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.optBoolean(r0, r7)
            if (r0 != 0) goto L_0x0e98
            r8.add(r2)
            goto L_0x0e98
        L_0x0eb7:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r2 = r0.A03
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase r2 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase) r2
            r0.A00 = r7
            java.lang.Object r8 = com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase.A02(r2, r0)
            if (r8 != r1) goto L_0x0eca
            return r1
        L_0x0ec7:
            X.AnonymousClass0OU.A00(r8)
        L_0x0eca:
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r4 = r8.A00
            X.LyC r4 = (X.C41173LyC) r4
            java.lang.Object r3 = r8.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.A03
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase r2 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase) r2
            r0.A01 = r4
            r0.A02 = r3
            r0.A00 = r5
            java.lang.Object r8 = com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase.A02(r2, r0)
            if (r8 != r1) goto L_0x0e7a
            return r1
        L_0x0ee5:
            java.util.List r3 = X.AnonymousClass00J.A0V(r8, r9)
            X.8mi r1 = r5.A0B
            r1.BQA(r3)
            int r0 = r4.A00
            r2 = 0
            if (r0 == 0) goto L_0x0efe
            r6 = r4
        L_0x0ef4:
            X.Lbs r1 = X.C40289Lbs.IAB_PRODUCT_FETCH_FAILED
            java.lang.String r0 = r6.A01
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase.A08(r5, r1, r0, r3, r2)
        L_0x0efb:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x0efe:
            int r0 = r6.A00
            if (r0 != 0) goto L_0x0ef4
            r1.CYg(r4, r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0f11
            X.Lbs r0 = X.C40289Lbs.SUCCESSFUL
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase.A08(r5, r0, r2, r2, r2)
            goto L_0x0efb
        L_0x0f11:
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase.A09(r5, r3)
            goto L_0x0efb
        L_0x0f15:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0f1a:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x0f28
            if (r1 == r7) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0f28:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r6 = r0.A03
            X.4wC r6 = (X.C86054wC) r6
            X.5z3 r1 = X.AnonymousClass5z3.A00
            r6.D7w(r1)
            java.lang.Object r5 = r0.A02
            X.Grx r5 = (X.C31580Grx) r5
            java.lang.Object r4 = r0.A01
            X.8mD r4 = (X.C146418mD) r4
            r3 = 0
            com.facebook.redex.IDxFCallbackShape313S0100000_1_I2 r1 = new com.facebook.redex.IDxFCallbackShape313S0100000_1_I2
            r1.<init>(r6, r3)
            r5.AMA(r4, r1)
            X.4aP r1 = X.C74414aP.A00
            r0.A00 = r7
            java.lang.Object r0 = X.C25238DiJ.A00(r0, r1, r6)
            goto L_0x103e
        L_0x0f4f:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x0f5d
            if (r1 == r9) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0f5d:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r1 = r0.A02
            X.066 r1 = (X.AnonymousClass066) r1
            X.062 r7 = r1.getLifecycle()
            java.lang.Object r6 = r0.A01
            X.061 r6 = (X.AnonymousClass061) r6
            r5 = 0
            java.lang.Object r4 = r0.A03
            r3 = 3
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1
            r1.<init>(r4, r5, r3)
            r0.A00 = r9
            java.lang.Object r0 = X.AnonymousClass3J4.A00(r6, r7, r0, r1)
            goto L_0x103e
        L_0x0f7d:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x0f8b
            if (r1 == r9) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0f8b:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r1 = r0.A02
            X.066 r1 = (X.AnonymousClass066) r1
            X.062 r7 = r1.getLifecycle()
            java.lang.Object r6 = r0.A01
            X.061 r6 = (X.AnonymousClass061) r6
            r5 = 0
            java.lang.Object r4 = r0.A03
            r3 = 13
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2
            r1.<init>(r4, r5, r3)
            r0.A00 = r9
            java.lang.Object r0 = X.AnonymousClass3J4.A00(r6, r7, r0, r1)
            goto L_0x103e
        L_0x0fac:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x0fba
            if (r1 == r9) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0fba:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r1 = r0.A02
            X.066 r1 = (X.AnonymousClass066) r1
            X.062 r7 = r1.getLifecycle()
            java.lang.Object r6 = r0.A01
            X.061 r6 = (X.AnonymousClass061) r6
            r5 = 0
            java.lang.Object r4 = r0.A03
            r3 = 4
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1
            r1.<init>(r4, r5, r3)
            r0.A00 = r9
            java.lang.Object r0 = X.AnonymousClass3J4.A00(r6, r7, r0, r1)
            goto L_0x103e
        L_0x0fd9:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x0fe7
            if (r1 == r9) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0fe7:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r1 = r0.A02
            X.066 r1 = (X.AnonymousClass066) r1
            X.062 r7 = r1.getLifecycle()
            java.lang.Object r6 = r0.A01
            X.061 r6 = (X.AnonymousClass061) r6
            r5 = 0
            java.lang.Object r4 = r0.A03
            r3 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1
            r1.<init>(r4, r5, r3)
            r0.A00 = r9
            java.lang.Object r0 = X.AnonymousClass3J4.A00(r6, r7, r0, r1)
            goto L_0x103e
        L_0x1006:
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x1014
            if (r1 == r4) goto L_0x1043
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x1014:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r1 = r0.A03
            X.58H r1 = (X.AnonymousClass58H) r1
            X.4wD r3 = r1.A05
            java.lang.Object r1 = r0.A02
            X.5HR r1 = (X.AnonymousClass5HR) r1
            boolean r7 = r1.A02
            boolean r8 = r1.A04
            boolean r9 = r1.A01
            boolean r10 = r1.A03
            java.lang.Object r1 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2) r1
            if (r1 == 0) goto L_0x1041
            java.lang.Object r6 = r1.A00
            java.util.Map r6 = (java.util.Map) r6
        L_0x1033:
            X.5ud r5 = new X.5ud
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A00 = r4
            java.lang.Object r0 = r3.Cgt(r5, r0)
        L_0x103e:
            if (r0 != r2) goto L_0x1046
        L_0x1040:
            return r2
        L_0x1041:
            r6 = 0
            goto L_0x1033
        L_0x1043:
            X.AnonymousClass0OU.A00(r8)
        L_0x1046:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape8S0301000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape8S0301000_I2(PressGestureScopeImpl pressGestureScopeImpl, C121197Es r3, C146958n9 r4, AnonymousClass0YM r5, int i) {
        super(2, r4);
        this.A04 = i;
        switch (i) {
            case 10:
            case 11:
                this.A02 = r5;
                this.A03 = pressGestureScopeImpl;
                this.A01 = r3;
                break;
            default:
                this.A01 = r5;
                this.A02 = pressGestureScopeImpl;
                this.A03 = r3;
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape8S0301000_I2(C146958n9 r2, AnonymousClass0YM r3, C84714tk r4, int i) {
        super(2, r2);
        this.A04 = i;
        if (30 - i != 0) {
            this.A01 = r4;
            this.A02 = r3;
        } else {
            this.A02 = r4;
            this.A01 = r3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape8S0301000_I2(Object obj, Object obj2, C146958n9 r4, int i, int i2) {
        super(2, r4);
        this.A04 = i;
        this.A03 = obj;
        this.A01 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape8S0301000_I2(AnonymousClass3HX r2, C127397h3 r3, C109326jp r4, C146958n9 r5, int i) {
        super(2, r5);
        this.A04 = 41;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = i;
        this.A01 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape8S0301000_I2(Object obj, Object obj2, Object obj3, C146958n9 r5, int i) {
        super(2, r5);
        this.A04 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape8S0301000_I2(Object obj, Object obj2, C146958n9 r4, int i) {
        super(2, r4);
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape8S0301000_I2(Object obj, C146958n9 r3, int i, int i2) {
        super(2, r3);
        this.A04 = i;
        this.A03 = obj;
    }
}
