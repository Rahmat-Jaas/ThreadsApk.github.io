package androidx.compose.animation;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass7FV;
import X.AnonymousClass7JH;
import X.AnonymousClass7WR;
import X.AnonymousClass7XV;
import X.C04220Ms;
import X.C103866ar;
import X.C114336t4;
import X.C114436tI;
import X.C123657Xy;
import X.C142638fL;
import X.C146098ld;
import X.C146958n9;
import X.C147368pE;
import X.C147578pZ;
import X.C147618pd;
import X.C25237DiI;
import X.C27952Ew2;
import X.C83224qz;
import X.C86104wH;
import X.C86144wL;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0201100_I2;

public final class SizeAnimationModifier extends AnonymousClass7XV {
    public AnonymousClass0YP A00;
    public final C142638fL A01;
    public final C147368pE A02 = C86104wH.A0I(AnonymousClass7WR.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final C83224qz A03;

    public SizeAnimationModifier(C142638fL r4, C83224qz r5) {
        C04220Ms.A0B(r4, 1);
        this.A01 = r4;
        this.A03 = r5;
    }

    public final C146098ld Bg3(C147578pZ r13, C147618pd r14, long j) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, r13);
        C123657Xy Bg4 = r13.Bg4(j);
        long A002 = AnonymousClass7FV.A00(Bg4.A01, Bg4.A00);
        C147368pE r2 = this.A02;
        C114436tI r6 = (C114436tI) r2.getValue();
        if (r6 != null) {
            AnonymousClass7JH r5 = r6.A01;
            if (A002 != ((C114336t4) r5.A0A.getValue()).A00) {
                r6.A00 = ((C114336t4) AnonymousClass7JH.A01(r5)).A00;
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0201100_I2(r6, this, (C146958n9) null, 0, A002), this.A03, 3);
            }
        } else {
            r6 = new C114436tI(new AnonymousClass7JH(C103866ar.A04, new C114336t4(A002), AnonymousClass7FV.A03(A1Z ? 1 : 0), "Animatable"), A002);
        }
        r2.CrC(r6);
        long j2 = ((C114336t4) AnonymousClass7JH.A01(r6.A01)).A00;
        return C147618pd.A00(r14, C86144wL.A16(Bg4, 14), C86104wH.A07(j2), C86104wH.A08(j2));
    }
}
