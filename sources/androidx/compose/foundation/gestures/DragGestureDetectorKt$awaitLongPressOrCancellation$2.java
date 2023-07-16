package androidx.compose.foundation.gestures;

import X.AnonymousClass0MJ;
import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {811, 828}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ AnonymousClass0MJ A04;
    public final /* synthetic */ AnonymousClass0MJ A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(C146958n9 r2, AnonymousClass0MJ r3, AnonymousClass0MJ r4) {
        super(2, r2);
        this.A04 = r3;
        this.A05 = r4;
    }

    public final C146958n9 create(Object obj, C146958n9 r5) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(r5, this.A04, this.A05);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.A03 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r1 == null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r12.A00 = r1;
        r9.A05.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r5 == 0) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:46:0x00e0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r19
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            r9 = r18
            int r0 = r9.A01
            r17 = 2
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00f3
            int r5 = r9.A00
            if (r0 == r6) goto L_0x009a
            java.lang.Object r10 = r9.A02
            X.6kM r10 = (X.C109656kM) r10
            java.lang.Object r0 = r9.A03
            X.8pz r4 = X.C86164wN.A0H(r0, r1)
        L_0x001c:
            X.6kM r1 = (X.C109656kM) r1
            java.util.List r3 = r1.A03
            int r2 = r3.size()
            r1 = 0
        L_0x0025:
            if (r1 >= r2) goto L_0x0032
            X.7Es r0 = X.C86124wJ.A0P(r3, r1)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0097
            r5 = 1
        L_0x0032:
            X.0MJ r12 = r9.A04
            java.lang.Object r0 = r12.A00
            X.7Es r0 = (X.C121197Es) r0
            long r0 = r0.A04
            boolean r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A05(r10, r0)
            if (r0 == 0) goto L_0x0072
            java.util.List r10 = r10.A03
            int r3 = r10.size()
            r2 = 0
        L_0x0047:
            if (r2 >= r3) goto L_0x00fd
            java.lang.Object r1 = r10.get(r2)
            r0 = r1
            X.7Es r0 = (X.C121197Es) r0
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x00fd
            r12.A00 = r1
            X.0MJ r0 = r9.A05
            r0.A00 = r1
        L_0x005c:
            if (r5 != 0) goto L_0x00fd
        L_0x005e:
            X.67C r0 = X.AnonymousClass67C.Main
            r9.A03 = r4
            r9.A02 = r7
            r9.A00 = r5
            r9.A01 = r6
            java.lang.Object r1 = r4.AA5(r0, r9)
            if (r1 != r8) goto L_0x00a0
            return r8
        L_0x006f:
            int r2 = r2 + 1
            goto L_0x0047
        L_0x0072:
            X.0MJ r14 = r9.A05
            java.util.List r15 = r10.A03
            int r13 = r15.size()
            r11 = 0
        L_0x007b:
            if (r11 >= r13) goto L_0x0093
            java.lang.Object r10 = r15.get(r11)
            r0 = r10
            X.7Es r0 = (X.C121197Es) r0
            long r2 = r0.A04
            java.lang.Object r0 = r12.A00
            X.7Es r0 = (X.C121197Es) r0
            long r0 = r0.A04
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x0094
            int r11 = r11 + 1
            goto L_0x007b
        L_0x0093:
            r10 = 0
        L_0x0094:
            r14.A00 = r10
            goto L_0x005c
        L_0x0097:
            int r1 = r1 + 1
            goto L_0x0025
        L_0x009a:
            java.lang.Object r0 = r9.A03
            X.8pz r4 = X.C86164wN.A0H(r0, r1)
        L_0x00a0:
            r10 = r1
            X.6kM r10 = (X.C109656kM) r10
            java.util.List r13 = r10.A03
            int r2 = r13.size()
            r1 = 0
        L_0x00aa:
            if (r1 >= r2) goto L_0x00b9
            X.7Es r0 = X.C86124wJ.A0P(r13, r1)
            boolean r0 = X.C121667Hg.A02(r0)
            if (r0 == 0) goto L_0x00ba
            int r1 = r1 + 1
            goto L_0x00aa
        L_0x00b9:
            r5 = 1
        L_0x00ba:
            int r12 = r13.size()
            r11 = 0
        L_0x00bf:
            if (r11 >= r12) goto L_0x00e0
            X.7Es r14 = X.C86124wJ.A0P(r13, r11)
            boolean r0 = r14.A02()
            if (r0 != 0) goto L_0x00df
            r0 = r4
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r0
            X.54D r0 = r0.A04
            long r2 = r0.A00
            long r0 = r4.Agc()
            boolean r0 = X.C121667Hg.A04(r14, r2, r0)
            if (r0 != 0) goto L_0x00df
            int r11 = r11 + 1
            goto L_0x00bf
        L_0x00df:
            r5 = 1
        L_0x00e0:
            X.67C r1 = X.AnonymousClass67C.Final
            r9.A03 = r4
            r9.A02 = r10
            r9.A00 = r5
            r0 = r17
            r9.A01 = r0
            java.lang.Object r1 = r4.AA5(r1, r9)
            if (r1 != r8) goto L_0x001c
            return r8
        L_0x00f3:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r4 = r9.A03
            X.8pz r4 = (X.C147828pz) r4
            r5 = 0
            goto L_0x005e
        L_0x00fd:
            kotlin.Unit r8 = kotlin.Unit.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
