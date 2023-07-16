package androidx.compose.ui.input.pointer;

import X.AnonymousClass0YP;
import X.C141788cx;
import X.C146738mm;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", f = "PointerIcon.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
public final class PointerIconKt$pointerHoverIcon$2$1$1 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C146738mm A02;
    public final /* synthetic */ C141788cx A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerIconKt$pointerHoverIcon$2$1$1(C146738mm r2, C141788cx r3, C146958n9 r4, boolean z) {
        super(2, r4);
        this.A04 = z;
        this.A03 = r3;
        this.A02 = r2;
    }

    public final C146958n9 create(Object obj, C146958n9 r6) {
        boolean z = this.A04;
        PointerIconKt$pointerHoverIcon$2$1$1 pointerIconKt$pointerHoverIcon$2$1$1 = new PointerIconKt$pointerHoverIcon$2$1$1(this.A02, this.A03, r6, z);
        pointerIconKt$pointerHoverIcon$2$1$1.A01 = obj;
        return pointerIconKt$pointerHoverIcon$2$1$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r9.A00
            r5 = 1
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r9.A01
            X.8pz r4 = X.C86164wN.A0H(r0, r10)
        L_0x000d:
            X.6kM r10 = (X.C109656kM) r10
            int r1 = r10.A00
            r0 = 2
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            r8 = 0
            if (r0 == 0) goto L_0x002f
            java.util.List r0 = r10.A03
            X.7Es r7 = X.C86124wJ.A0P(r0, r8)
            r0 = r4
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r0
            X.54D r0 = r0.A04
            long r2 = r0.A00
            long r0 = X.AnonymousClass7JK.A02
            boolean r0 = X.C121667Hg.A04(r7, r2, r0)
            if (r0 == 0) goto L_0x002f
            r8 = 1
        L_0x002f:
            int r1 = r10.A00
            r0 = 5
            if (r1 == r0) goto L_0x0044
            if (r8 != 0) goto L_0x0044
            X.8cx r2 = r9.A03
            X.8mm r1 = r9.A02
            X.7XN r2 = (X.AnonymousClass7XN) r2
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            androidx.compose.ui.platform.AndroidComposeView r0 = r2.A00
            r0.A04 = r1
        L_0x0044:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0055
            X.67C r0 = X.AnonymousClass67C.Main
        L_0x004a:
            r9.A01 = r4
            r9.A00 = r5
            java.lang.Object r10 = r4.AA5(r0, r9)
            if (r10 != r6) goto L_0x000d
            return r6
        L_0x0055:
            X.67C r0 = X.AnonymousClass67C.Initial
            goto L_0x004a
        L_0x0058:
            X.AnonymousClass0OU.A00(r10)
            java.lang.Object r4 = r9.A01
            X.8pz r4 = (X.C147828pz) r4
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PointerIconKt$pointerHoverIcon$2$1$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
