package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: X.8D1  reason: invalid class name */
public final class AnonymousClass8D1 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public /* synthetic */ int A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ AnonymousClass87W A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8D1(C146958n9 r2, AnonymousClass87W r3) {
        super(3, r2);
        this.A03 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r6 = 5
            r7 = 4
            r4 = 3
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 == r3) goto L_0x006c
            if (r0 == r1) goto L_0x0041
            if (r0 == r4) goto L_0x0055
            if (r0 != r7) goto L_0x006c
            java.lang.Object r2 = r8.A02
            X.4r0 r2 = (X.C83234r0) r2
            X.AnonymousClass0OU.A00(r9)
        L_0x001a:
            X.67f r1 = X.C969267f.STOP_AND_RESET_REPLAY_CACHE
            r0 = 0
            r8.A02 = r0
            r8.A00 = r6
        L_0x0021:
            java.lang.Object r0 = r2.emit(r1, r8)
            if (r0 != r5) goto L_0x006f
            return r5
        L_0x0028:
            X.AnonymousClass0OU.A00(r9)
            java.lang.Object r2 = r8.A02
            X.4r0 r2 = (X.C83234r0) r2
            int r0 = r8.A01
            if (r0 <= 0) goto L_0x0038
            X.67f r1 = X.C969267f.START
            r8.A00 = r3
            goto L_0x0021
        L_0x0038:
            r8.A02 = r2
            r8.A00 = r1
            kotlin.Unit r0 = kotlin.Unit.A00
            if (r0 != r5) goto L_0x0048
            return r5
        L_0x0041:
            java.lang.Object r2 = r8.A02
            X.4r0 r2 = (X.C83234r0) r2
            X.AnonymousClass0OU.A00(r9)
        L_0x0048:
            X.67f r0 = X.C969267f.STOP
            r8.A02 = r2
            r8.A00 = r4
            java.lang.Object r0 = r2.emit(r0, r8)
            if (r0 != r5) goto L_0x005c
            return r5
        L_0x0055:
            java.lang.Object r2 = r8.A02
            X.4r0 r2 = (X.C83234r0) r2
            X.AnonymousClass0OU.A00(r9)
        L_0x005c:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.A02 = r2
            r8.A00 = r7
            java.lang.Object r0 = X.AnonymousClass729.A01(r8, r0)
            if (r0 != r5) goto L_0x001a
            return r5
        L_0x006c:
            X.AnonymousClass0OU.A00(r9)
        L_0x006f:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8D1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A04 = AnonymousClass0wJ.A04(obj2);
        AnonymousClass8D1 r1 = new AnonymousClass8D1((C146958n9) obj3, this.A03);
        r1.A02 = obj;
        r1.A01 = A04;
        return r1.invokeSuspend(Unit.A00);
    }
}
