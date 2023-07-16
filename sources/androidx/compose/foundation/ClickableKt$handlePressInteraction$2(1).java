package androidx.compose.foundation;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C147258p3;
import X.C147368pE;
import X.C147808px;
import X.C18220wO;
import X.C39142Kno;
import X.C81784oM;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {445, 447, 454, 455, 464}, m = "invokeSuspend", n = {"delayJob", "success", "releaseInteraction"}, s = {"L$0", "Z$0", "L$0"})
public final class ClickableKt$handlePressInteraction$2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public boolean A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C147808px A04;
    public final /* synthetic */ C147258p3 A05;
    public final /* synthetic */ C147368pE A06;
    public final /* synthetic */ C81784oM A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2(C147808px r2, C147258p3 r3, C147368pE r4, C81784oM r5, C146958n9 r6, long j) {
        super(2, r6);
        this.A04 = r2;
        this.A03 = j;
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.A04, this.A05, this.A06, this.A07, r10, this.A03);
        clickableKt$handlePressInteraction$2.A02 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r14.A00
            r2 = 4
            r5 = 3
            r6 = 2
            r1 = 1
            r11 = 0
            if (r0 == 0) goto L_0x001c
            if (r0 == r1) goto L_0x0041
            if (r0 == r6) goto L_0x0066
            if (r0 == r5) goto L_0x0086
            X.AnonymousClass0OU.A00(r15)
        L_0x0014:
            X.8pE r0 = r14.A06
            r0.CrC(r11)
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x001c:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r0 = r14.A02
            X.4qz r0 = (X.C83224qz) r0
            X.4oM r10 = r14.A07
            long r12 = r14.A03
            X.8p3 r8 = r14.A05
            X.8pE r9 = r14.A06
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0401100_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0401100_I2
            r7.<init>(r8, r9, r10, r11, r12)
            X.8sG r4 = X.C25237DiI.A00(r11, r11, r7, r0, r5)
            X.8px r0 = r14.A04
            r14.A02 = r4
            r14.A00 = r1
            java.lang.Object r15 = r0.D7p(r14)
            if (r15 != r3) goto L_0x0048
            return r3
        L_0x0041:
            java.lang.Object r4 = r14.A02
            X.8sG r4 = (X.C148838sG) r4
            X.AnonymousClass0OU.A00(r15)
        L_0x0048:
            boolean r1 = X.AnonymousClass0wJ.A1X(r15)
            boolean r0 = r4.isActive()
            if (r0 == 0) goto L_0x009a
            r14.A02 = r11
            r14.A01 = r1
            r14.A00 = r6
            r4.AC7(r11)
            java.lang.Object r0 = r4.Ba9(r14)
            if (r0 == r3) goto L_0x0063
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0063:
            if (r0 != r3) goto L_0x006b
            return r3
        L_0x0066:
            boolean r1 = r14.A01
            X.AnonymousClass0OU.A00(r15)
        L_0x006b:
            if (r1 == 0) goto L_0x0014
            long r0 = r14.A03
            X.7Uv r4 = new X.7Uv
            r4.<init>(r0)
            X.7Uw r1 = new X.7Uw
            r1.<init>(r4)
            X.8p3 r0 = r14.A05
            r14.A02 = r1
            r14.A00 = r5
            java.lang.Object r0 = r0.AJQ(r4, r14)
            if (r0 != r3) goto L_0x008d
            return r3
        L_0x0086:
            java.lang.Object r1 = r14.A02
            X.7Uw r1 = (X.C122997Uw) r1
            X.AnonymousClass0OU.A00(r15)
        L_0x008d:
            X.8p3 r0 = r14.A05
            r14.A02 = r11
            r14.A00 = r2
            java.lang.Object r0 = r0.AJQ(r1, r14)
            if (r0 != r3) goto L_0x0014
            return r3
        L_0x009a:
            X.8pE r0 = r14.A06
            java.lang.Object r0 = r0.getValue()
            X.7Uv r0 = (X.C122987Uv) r0
            if (r0 == 0) goto L_0x0014
            X.8p3 r2 = r14.A05
            if (r1 == 0) goto L_0x00b9
            X.7Uw r1 = new X.7Uw
            r1.<init>(r0)
        L_0x00ad:
            r14.A02 = r11
            r0 = 5
            r14.A00 = r0
            java.lang.Object r0 = r2.AJQ(r1, r14)
            if (r0 != r3) goto L_0x0014
            return r3
        L_0x00b9:
            X.7Uu r1 = new X.7Uu
            r1.<init>(r0)
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClickableKt$handlePressInteraction$2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
