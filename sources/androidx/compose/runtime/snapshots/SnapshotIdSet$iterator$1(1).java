package androidx.compose.runtime.snapshots;

import X.AnonymousClass0YP;
import X.C134947yd;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {295, 300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
public final class SnapshotIdSet$iterator$1 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ C134947yd A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(C134947yd r2, C146958n9 r3) {
        super(2, r3);
        this.A05 = r2;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.A05, r4);
        snapshotIdSet$iterator$1.A04 = obj;
        return snapshotIdSet$iterator$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r12 >= 64) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r10 < 64) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            r7 = r17
            int r0 = r7.A02
            r5 = 0
            r15 = 1
            r10 = 2
            r4 = 64
            r13 = 0
            r11 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 == r11) goto L_0x0070
            if (r0 == r10) goto L_0x00ad
            int r10 = r7.A00
            java.lang.Object r3 = r7.A04
            X.83y r3 = (X.C1366983y) r3
            X.AnonymousClass0OU.A00(r18)
        L_0x001e:
            int r10 = r10 + 1
            if (r10 >= r4) goto L_0x00c6
        L_0x0022:
            X.7yd r11 = r7.A05
            long r0 = r11.A02
            long r8 = r15 << r10
            long r0 = r0 & r8
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x001e
            int r2 = r10 + 64
            int r0 = r11.A00
            int r2 = r2 + r0
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r2)
            r7.A04 = r3
            r7.A03 = r5
            r7.A00 = r10
            r0 = 3
            r7.A02 = r0
            java.lang.Object r0 = r3.A00(r1, r7)
            if (r0 != r6) goto L_0x001e
            return r6
        L_0x0047:
            X.AnonymousClass0OU.A00(r18)
            java.lang.Object r3 = r7.A04
            X.83y r3 = (X.C1366983y) r3
            X.7yd r0 = r7.A05
            int[] r9 = r0.A03
            if (r9 == 0) goto L_0x0082
            int r8 = r9.length
            r2 = 0
        L_0x0056:
            if (r2 >= r8) goto L_0x0082
            r1 = r9[r2]
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r7.A04 = r3
            r7.A03 = r9
            r7.A00 = r2
            r7.A01 = r8
            r7.A02 = r11
            java.lang.Object r0 = r3.A00(r0, r7)
            if (r0 != r6) goto L_0x007f
            return r6
        L_0x0070:
            int r8 = r7.A01
            int r2 = r7.A00
            java.lang.Object r9 = r7.A03
            int[] r9 = (int[]) r9
            java.lang.Object r3 = r7.A04
            X.83y r3 = (X.C1366983y) r3
            X.AnonymousClass0OU.A00(r18)
        L_0x007f:
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0082:
            X.7yd r0 = r7.A05
            long r0 = r0.A01
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x00bb
            r12 = 0
        L_0x008b:
            X.7yd r11 = r7.A05
            long r1 = r11.A01
            long r8 = r15 << r12
            long r1 = r1 & r8
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00b6
            int r1 = r11.A00
            int r1 = r1 + r12
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r7.A04 = r3
            r7.A03 = r5
            r7.A00 = r12
            r7.A02 = r10
            java.lang.Object r0 = r3.A00(r0, r7)
            if (r0 != r6) goto L_0x00b6
            return r6
        L_0x00ad:
            int r12 = r7.A00
            java.lang.Object r3 = r7.A04
            X.83y r3 = (X.C1366983y) r3
            X.AnonymousClass0OU.A00(r18)
        L_0x00b6:
            int r12 = r12 + 1
            if (r12 >= r4) goto L_0x00bb
            goto L_0x008b
        L_0x00bb:
            X.7yd r0 = r7.A05
            long r1 = r0.A02
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00c6
            r10 = 0
            goto L_0x0022
        L_0x00c6:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SnapshotIdSet$iterator$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
