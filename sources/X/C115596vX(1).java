package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6vX  reason: invalid class name and case insensitive filesystem */
public final class C115596vX {
    public final C115556vT A00;
    public final C147368pE A01;
    public final C147368pE A02;
    public final C115596vX A03;
    public final C147368pE A04;
    public final String A05;
    public final Set A06 = C86134wK.A0u();

    public final C89915Hn A00(String str, String str2) {
        Object obj;
        C04220Ms.A0B(str2, 1);
        Iterator A0q = C86154wM.A0q(this.A02.getValue());
        while (true) {
            if (!A0q.hasNext()) {
                obj = null;
                break;
            }
            obj = A0q.next();
            C89915Hn r1 = (C89915Hn) obj;
            if (C04220Ms.A0I(r1.A07, str) && C04220Ms.A0I(r1.A06, str2)) {
                break;
            }
        }
        return (C89915Hn) obj;
    }

    public final void A01(C142638fL r22, C142638fL r23, String str, String str2, String str3, AnonymousClass0ZU r27, AnonymousClass0ZU r28, AnonymousClass0YP r29, float f, long j, long j2) {
        AnonymousClass7KC r9;
        String str4;
        Object obj;
        String str5 = str2;
        C04220Ms.A0B(str5, 1);
        C142638fL r7 = r22;
        C142638fL r8 = r23;
        AnonymousClass0ZU r13 = r27;
        C18180wK.A1S(r13, r7, r8);
        AnonymousClass0ZU r14 = r28;
        C04220Ms.A0B(r14, 9);
        C147368pE r3 = this.A02;
        Iterator A0q = C86154wM.A0q(r3.getValue());
        while (true) {
            r9 = null;
            str4 = str3;
            if (!A0q.hasNext()) {
                obj = null;
                break;
            }
            obj = A0q.next();
            if (C04220Ms.A0I(((C89915Hn) obj).A08, str4)) {
                break;
            }
        }
        C89915Hn r5 = (C89915Hn) obj;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : (Iterable) r3.getValue()) {
            if (!C04220Ms.A0I(((C89915Hn) next).A08, str4)) {
                A0v.add(next);
            }
        }
        if (r5 != null) {
            r9 = r5.A05;
        }
        String str6 = str;
        AnonymousClass0YP r15 = r29;
        float f2 = f;
        long j3 = j;
        long j4 = j2;
        r3.CrC(AnonymousClass00J.A0X(new C89915Hn(r7, r8, r9, str6, str5, str4, r13, r14, r15, f2, j3, j4), A0v));
        C115596vX r1 = this.A03;
        if (r1 != null) {
            String str7 = this.A05;
            if (str7 != null) {
                r1.A01(r7, r8, str6, str7, str4, r13, r14, r15, f2, j3, j4);
                return;
            }
            throw C18190wL.A0a("Required value was null.");
        }
    }

    public final void A02(String str) {
        C04220Ms.A0B(str, 0);
        if (((Set) this.A04.getValue()).contains(str)) {
            this.A06.add(str);
        } else {
            C147368pE r4 = this.A02;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : (Iterable) r4.getValue()) {
                if (!C04220Ms.A0I(((C89915Hn) next).A08, str)) {
                    A0v.add(next);
                }
            }
            r4.CrC(A0v);
            this.A06.remove(str);
        }
        C115596vX r0 = this.A03;
        if (r0 != null) {
            r0.A02(str);
        }
    }

    public final boolean A06(String str) {
        Object obj;
        C115556vT r5 = this.A00;
        if (r5.A05() || ((Set) this.A04.getValue()).contains(str)) {
            C147368pE r4 = this.A02;
            Iterator A0q = C86154wM.A0q(r4.getValue());
            while (true) {
                if (!A0q.hasNext()) {
                    obj = null;
                    break;
                }
                obj = A0q.next();
                if (C04220Ms.A0I(((C89915Hn) obj).A08, str)) {
                    break;
                }
            }
            C89915Hn r3 = (C89915Hn) obj;
            if (r3 != null && AnonymousClass0wJ.A1X(r3.A09.invoke())) {
                String str2 = r3.A06;
                C147368pE r2 = r5.A01.A00;
                if (C04220Ms.A0I(str2, ((C123917Zx) r2.getValue()).A0A)) {
                    Iterable<C89915Hn> iterable = (Iterable) r4.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        for (C89915Hn r7 : iterable) {
                            if (C04220Ms.A0I(r7.A07, r3.A07) && C04220Ms.A0I(r7.A06, ((C123917Zx) r5.A06.getValue()).A0A) && AnonymousClass0wJ.A1X(r7.A09.invoke())) {
                                return true;
                            }
                        }
                    }
                }
                if (C04220Ms.A0I(str2, ((C123917Zx) r5.A06.getValue()).A0A)) {
                    Iterable<C89915Hn> iterable2 = (Iterable) r4.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return false;
                    }
                    for (C89915Hn r42 : iterable2) {
                        if (C04220Ms.A0I(r42.A07, r3.A07) && C04220Ms.A0I(r42.A06, ((C123917Zx) r2.getValue()).A0A) && AnonymousClass0wJ.A1X(r42.A09.invoke())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean A07(String str) {
        C115596vX r0;
        C04220Ms.A0B(str, 0);
        if (A06(str) || ((r0 = this.A03) != null && !r0.A07(str))) {
            return false;
        }
        return true;
    }

    public final void A03(String str) {
        C147368pE r1 = this.A04;
        r1.CrC(AnonymousClass4WL.A03(str, (Set) r1.getValue()));
        C115596vX r0 = this.A03;
        if (r0 != null) {
            r0.A03(str);
        }
    }

    public final void A04(String str) {
        C147368pE r1 = this.A04;
        r1.CrC(AnonymousClass4WL.A02(str, (Set) r1.getValue()));
        if (this.A06.contains(str)) {
            A02(str);
        }
        C115596vX r0 = this.A03;
        if (r0 != null) {
            r0.A04(str);
        }
    }

    public final boolean A05() {
        C115596vX r0;
        if (this.A00.A05() || (((r0 = this.A03) != null && r0.A05()) || C18190wL.A1a((Collection) this.A04.getValue()))) {
            return true;
        }
        return false;
    }

    public C115596vX(C115556vT r5, C115596vX r6, String str) {
        this.A00 = r5;
        this.A03 = r6;
        this.A05 = str;
        AnonymousClass0ZV r3 = AnonymousClass0ZV.A00;
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A02 = C86104wH.A0I(r2, r3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A01 = C86104wH.A0I(r2, r3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A04 = C86104wH.A0I(r2, AnonymousClass84Y.A00, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        if (r6 != null) {
            C147368pE r1 = r6.A01;
            r1.CrC(AnonymousClass00J.A0X(this, (Collection) r1.getValue()));
        }
    }
}
