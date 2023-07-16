package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Iterator;

/* renamed from: X.7WX  reason: invalid class name */
public final class AnonymousClass7WX implements C81784oM {
    public C1203479u A00;
    public final C147218oz A01;
    public final AnonymousClass8cW A02;
    public final C147368pE A03;
    public final C147368pE A04;
    public final C147368pE A05;
    public final C147368pE A06;
    public final C147368pE A07;
    public final C147368pE A08;
    public final C147368pE A09;
    public final /* synthetic */ C115556vT A0A;

    public static /* synthetic */ void A00(AnonymousClass7WX r7, Object obj, int i, boolean z) {
        C142638fL r2;
        Object obj2 = obj;
        if ((i & 1) != 0) {
            obj2 = r7.A09.getValue();
        }
        if ((i & 2) != 0 || !z || (r7.A04.getValue() instanceof C122777Tu)) {
            r2 = (C142638fL) r7.A04.getValue();
        } else {
            r2 = r7.A01;
        }
        r7.A03.CrC(new C122667Tj(r2, r7.A00, r7.A02, obj2, r7.A08.getValue()));
        C115556vT r5 = r7.A0A;
        C147368pE r4 = r5.A07;
        C147368pE.A04(r4, true);
        if (C86104wH.A1X(r5.A02)) {
            Iterator it = r5.A09.iterator();
            while (it.hasNext()) {
                AnonymousClass7WX r22 = (AnonymousClass7WX) it.next();
                r22.A03.getValue();
                r22.A01(r5.A00);
            }
            C147368pE.A04(r4, false);
        }
    }

    public final void A02(C147218oz r6, Object obj) {
        C04220Ms.A0B(r6, 1);
        C147368pE r1 = this.A08;
        if (!C04220Ms.A0I(r1.getValue(), obj) || C86104wH.A1X(this.A06)) {
            r1.CrC(obj);
            this.A04.CrC(r6);
            C147368pE r2 = this.A05;
            A00(this, (Object) null, 1, !C86104wH.A1X(r2));
            Boolean A0X = C18180wK.A0X();
            r2.CrC(A0X);
            this.A07.CrC(Long.valueOf(C18190wL.A08(this.A0A.A03.getValue())));
            this.A06.CrC(A0X);
        }
    }

    public final void A03(C147218oz r4, Object obj, Object obj2) {
        C04220Ms.A0B(r4, 2);
        this.A08.CrC(obj2);
        this.A04.CrC(r4);
        C147368pE r1 = this.A03;
        if (!C04220Ms.A0I(((C122667Tj) r1.getValue()).A07, obj) || !C04220Ms.A0I(((C122667Tj) r1.getValue()).A08, obj2)) {
            A00(this, obj, 2, false);
        }
    }

    public AnonymousClass7WX(C1203479u r14, C115556vT r15, AnonymousClass8cW r16, Object obj) {
        this.A0A = r15;
        AnonymousClass8cW r10 = r16;
        this.A02 = r10;
        Object obj2 = null;
        AnonymousClass7WR r6 = AnonymousClass7WR.A00;
        Object obj3 = obj;
        this.A08 = C86104wH.A0I(r6, obj3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        ParcelableSnapshotMutableState A0I = C86104wH.A0I(r6, new C122777Tu((Object) null, 1.0f, 1500.0f), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A04 = A0I;
        this.A03 = C86104wH.A0I(r6, new C122667Tj((C142638fL) A0I.getValue(), r14, r10, obj3, this.A08.getValue()), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A05 = C86104wH.A0I(r6, C18180wK.A0Y(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A07 = C86104wH.A0I(r6, C18210wN.A0V(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A06 = C86104wH.A0I(r6, false, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A09 = C86104wH.A0I(r6, obj3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A00 = r14;
        Number A0j = C86124wJ.A0j(r10, AnonymousClass6ZH.A01);
        if (A0j != null) {
            float floatValue = A0j.floatValue();
            C1203479u A002 = AnonymousClass7U0.A00(r10, obj3);
            int A022 = A002.A02();
            for (int i = 0; i < A022; i++) {
                A002.A04(i, floatValue);
            }
            obj2 = ((AnonymousClass7U0) this.A02).A00.invoke(A002);
        }
        this.A01 = new C122777Tu(obj2, 1.0f, 1500.0f);
    }

    public final void A01(long j) {
        C147368pE r2 = this.A03;
        this.A09.CrC(((C122667Tj) r2.getValue()).BKK(j));
        this.A00 = ((C122667Tj) r2.getValue()).BKY(j);
    }

    public final Object getValue() {
        return this.A09.getValue();
    }
}
