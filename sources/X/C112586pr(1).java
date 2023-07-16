package X;

/* renamed from: X.6pr  reason: invalid class name and case insensitive filesystem */
public final class C112586pr {
    public final C147368pE A00 = C86104wH.A0I(AnonymousClass7WR.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final AnonymousClass8cW A01;
    public final String A02;
    public final /* synthetic */ C115556vT A03;

    public C112586pr(C115556vT r4, AnonymousClass8cW r5, String str) {
        C04220Ms.A0B(str, 3);
        this.A03 = r4;
        this.A01 = r5;
        this.A02 = str;
    }

    public final C81784oM A00(AnonymousClass0YY r8, AnonymousClass0YY r9) {
        C04220Ms.A0B(r8, 0);
        C147368pE r5 = this.A00;
        AnonymousClass7WU r2 = (AnonymousClass7WU) r5.getValue();
        if (r2 == null) {
            C115556vT r4 = this.A03;
            C147368pE r1 = r4.A01.A00;
            Object invoke = r9.invoke(r1.getValue());
            AnonymousClass8cW r22 = this.A01;
            C1203479u A002 = AnonymousClass7U0.A00(r22, r9.invoke(r1.getValue()));
            C04220Ms.A0B(A002, 0);
            r2 = new AnonymousClass7WU(this, new AnonymousClass7WX(C1203479u.A00(A002), r4, r22, invoke), r8, r9);
            r5.CrC(r2);
            r4.A09.add(r2.A02);
        }
        C115556vT r0 = this.A03;
        r2.A00 = r9;
        r2.A01 = r8;
        r2.A00((C145678ku) r0.A04.getValue());
        return r2;
    }
}
