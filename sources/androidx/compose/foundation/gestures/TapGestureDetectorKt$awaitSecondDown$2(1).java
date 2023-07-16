package androidx.compose.foundation.gestures;

import X.AnonymousClass0YP;
import X.C121197Es;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {212}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
public final class TapGestureDetectorKt$awaitSecondDown$2 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C121197Es A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(C121197Es r2, C146958n9 r3) {
        super(2, r3);
        this.A03 = r2;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.A03, r4);
        tapGestureDetectorKt$awaitSecondDown$2.A02 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034 A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r9.A00
            r7 = 1
            if (r0 == 0) goto L_0x0018
            long r2 = r9.A01
            java.lang.Object r0 = r9.A02
            X.8pz r4 = X.C86164wN.A0H(r0, r10)
        L_0x000f:
            X.7Es r10 = (X.C121197Es) r10
            long r5 = r10.A09
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
            return r10
        L_0x0018:
            X.AnonymousClass0OU.A00(r10)
            java.lang.Object r4 = r9.A02
            X.8pz r4 = (X.C147828pz) r4
            X.7Es r0 = r9.A03
            long r2 = r0.A09
            r0 = 40
            long r2 = r2 + r0
        L_0x0026:
            r9.A02 = r4
            r9.A01 = r2
            r9.A00 = r7
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r9, r7)
            if (r10 != r8) goto L_0x000f
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
