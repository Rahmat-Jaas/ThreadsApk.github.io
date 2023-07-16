package androidx.compose.ui.input.pointer;

import X.AnonymousClass54D;
import X.AnonymousClass67C;
import X.AnonymousClass7JK;
import X.AnonymousClass84X;
import X.AnonymousClass869;
import X.AnonymousClass8s9;
import X.C146508mM;
import X.C146958n9;
import X.C147168nV;
import X.C147828pz;
import X.C27420EnC;
import X.C27952Ew2;
import X.C86104wH;
import com.facebook.react.uimanager.BaseViewManager;

public final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine implements C147168nV, C146958n9, C147828pz {
    public AnonymousClass67C A00 = AnonymousClass67C.Main;
    public AnonymousClass8s9 A01;
    public final C146958n9 A02;
    public final C27952Ew2 A03 = AnonymousClass869.A00;
    public final /* synthetic */ AnonymousClass54D A04;
    public final /* synthetic */ AnonymousClass54D A05;

    public SuspendingPointerInputFilter$PointerEventHandlerCoroutine(AnonymousClass54D r2, C146958n9 r3) {
        this.A04 = r2;
        this.A02 = r3;
        this.A05 = r2;
    }

    public final float Acr() {
        return this.A05.A07.Acr();
    }

    public final long Agc() {
        long j;
        AnonymousClass54D r3 = this.A04;
        long D7K = r3.A07.D7K(r3.A05.Avw());
        C146508mM r0 = r3.A00;
        if (r0 != null) {
            j = r0.BCI();
        } else {
            j = 0;
        }
        return C86104wH.A0C(Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, AnonymousClass7JK.A02(D7K) - ((float) C86104wH.A07(j))) / 2.0f, Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, AnonymousClass7JK.A00(D7K) - ((float) C86104wH.A08(j))) / 2.0f);
    }

    public final float AjK() {
        return this.A05.A07.AjK();
    }

    public final int CfK(long j) {
        return this.A05.A07.CfK(j);
    }

    public final int CfL(float f) {
        return this.A05.A07.CfL(f);
    }

    public final float CxD(float f) {
        return this.A05.A07.CxD(f);
    }

    public final float CxE(int i) {
        return this.A05.A07.CxE(i);
    }

    public final long CxF(long j) {
        return this.A05.A07.CxF(j);
    }

    public final float CxK(long j) {
        return this.A05.A07.CxK(j);
    }

    public final float CxL(float f) {
        return this.A05.A07.CxL(f);
    }

    public final long D7K(long j) {
        return this.A05.A07.D7K(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object DBE(X.C146958n9 r13, X.AnonymousClass0YP r14, long r15) {
        /*
            r12 = this;
            r4 = 14
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r4, r13)
            r7 = r12
            if (r0 == 0) goto L_0x0028
            r3 = r13
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0017:
            java.lang.Object r5 = r3.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r2 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0036
            if (r0 != r2) goto L_0x0031
            java.lang.Object r1 = r3.A01
            X.8sG r1 = (X.C148838sG) r1
            goto L_0x002d
        L_0x0028:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r3 = X.C86164wN.A0n(r12, r13, r4)
            goto L_0x0017
        L_0x002d:
            X.AnonymousClass0OU.A00(r5)     // Catch:{ all -> 0x006a }
            goto L_0x0066
        L_0x0031:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0036:
            X.AnonymousClass0OU.A00(r5)
            r5 = 0
            r10 = r15
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x004c
            X.8s9 r1 = r12.A01
            if (r1 == 0) goto L_0x004c
            X.89x r0 = new X.89x
            r0.<init>(r10)
            X.C146958n9.A00(r0, r1)
        L_0x004c:
            X.54D r0 = r12.A04
            X.4qz r1 = r0.A03
            r9 = 2
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2 r6 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2
            r6.<init>(r7, r8, r9, r10)
            r0 = 3
            X.8sG r1 = X.C25237DiI.A00(r8, r8, r6, r1, r0)
            r3.A01 = r1     // Catch:{ all -> 0x006a }
            r3.A00 = r2     // Catch:{ all -> 0x006a }
            java.lang.Object r5 = r14.invoke(r12, r3)     // Catch:{ all -> 0x006a }
            if (r5 != r4) goto L_0x0066
            return r4
        L_0x0066:
            r1.AC7(r8)
            return r5
        L_0x006a:
            r0 = move-exception
            r1.AC7(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine.DBE(X.8n9, X.0YP, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object DBF(X.C146958n9 r6, X.AnonymousClass0YP r7, long r8) {
        /*
            r5 = this;
            r3 = 11
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r6)
            if (r0 == 0) goto L_0x0022
            r4 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r0) goto L_0x002b
            goto L_0x0027
        L_0x0022:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = X.C86114wI.A0x(r5, r6, r3)
            goto L_0x0016
        L_0x0027:
            X.AnonymousClass0OU.A00(r3)     // Catch:{ 89x -> 0x003c }
            return r3
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0030:
            X.AnonymousClass0OU.A00(r3)
            r4.A00 = r0     // Catch:{ 89x -> 0x003c }
            java.lang.Object r3 = r5.DBE(r4, r7, r8)     // Catch:{ 89x -> 0x003c }
            if (r3 != r2) goto L_0x003d
            return r2
        L_0x003c:
            r3 = 0
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine.DBF(X.8n9, X.0YP, long):java.lang.Object");
    }

    public final C27952Ew2 getContext() {
        return this.A03;
    }

    public final void resumeWith(Object obj) {
        AnonymousClass84X r1 = this.A04.A04;
        synchronized (r1) {
            r1.A0E(this);
        }
        this.A02.resumeWith(obj);
    }

    public final Object AA5(AnonymousClass67C r2, C146958n9 r3) {
        C27420EnC A17 = C86104wH.A17(r3);
        this.A00 = r2;
        this.A01 = A17;
        return A17.A0B();
    }
}
