package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6ku  reason: invalid class name and case insensitive filesystem */
public final class C109966ku {
    public final C147368pE A00;
    public final C147368pE A01;
    public final C134747yH A02;
    public final C134747yH A03;

    public C109966ku(AnonymousClass7F0 r23, Integer num, Integer num2, String str, String str2, long j, long j2) {
        AnonymousClass7F0 r6 = r23;
        String str3 = str;
        long j3 = j;
        C134747yH A002 = AnonymousClass7GE.A00(r6, str3, j3);
        this.A03 = A002;
        AnonymousClass7WR r5 = AnonymousClass7WR.A00;
        this.A01 = C86104wH.A0I(r5, A002, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        if (!(num2 == null || num == null)) {
            int intValue = num2.intValue();
            int intValue2 = (intValue - num.intValue()) + 1;
            String str4 = str2;
            int A003 = AnonymousClass2C6.A00(str4);
            String A0D = AnonymousClass8bN.A0D(AnonymousClass8bN.A0E(str3, intValue + 1), Math.min(intValue2, A003 + 4));
            AnonymousClass7F0 r11 = new C121807If((C134817yQ) null, (C121117Ee) null, 262142, j2, 0, 0).A02;
            C134747yH A004 = AnonymousClass7GE.A00(r6, A0D, j3);
            C134727yF r2 = new C134727yF((DefaultConstructorMarker) null, 0, 1);
            r2.A07(str4);
            r2.A05(r11, 0, A003);
            r2.A09("collapsed_span", "", 0, A003);
            A002 = A004.A06(r2.A01());
        }
        this.A02 = A002;
        this.A01.CrC(A002);
        this.A00 = C86104wH.A0I(r5, C302520h.Collapsed, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }
}
