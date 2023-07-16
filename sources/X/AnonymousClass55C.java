package X;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape5S0102000_I2;

/* renamed from: X.55C  reason: invalid class name */
public final class AnonymousClass55C extends AnonymousClass7YV implements C147528pU, C147498pR, C147488pQ {
    public final WindowInsets A00;
    public final C147368pE A01;
    public final C147368pE A02;

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ int BfA(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int BfD(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A01(r2, r3, this, i);
    }

    public final /* synthetic */ int BgL(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int BgO(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A03(r2, r3, this, i);
    }

    public final void C7Y(C142998fw r6) {
        C04220Ms.A0B(r6, 0);
        WindowInsets windowInsets = (WindowInsets) r6.AbB(AnonymousClass6WQ.A00);
        WindowInsets windowInsets2 = this.A00;
        boolean A1Z = AnonymousClass0wJ.A1Z(windowInsets2, windowInsets);
        this.A02.CrC(new AnonymousClass7VC(windowInsets2, windowInsets));
        C04220Ms.A0B(windowInsets2, A1Z ? 1 : 0);
        this.A01.CrC(new AnonymousClass7VD(windowInsets, windowInsets2));
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass55C(androidx.compose.foundation.layout.WindowInsets r4) {
        /*
            r3 = this;
            boolean r0 = androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled
            if (r0 == 0) goto L_0x0023
            r0 = 36
            kotlin.jvm.internal.KtLambdaShape145S0100000_I2 r0 = X.C86144wL.A16(r4, r0)
        L_0x000a:
            X.AnonymousClass0wJ.A1O(r4, r0)
            r3.<init>(r0)
            r3.A00 = r4
            X.7WR r2 = X.AnonymousClass7WR.A00
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C86104wH.A0I(r2, r4, r1)
            r3.A02 = r0
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C86104wH.A0I(r2, r4, r1)
            r3.A01 = r0
            return
        L_0x0023:
            X.0YY r0 = androidx.compose.ui.platform.InspectableValueKt.A00
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55C.<init>(androidx.compose.foundation.layout.WindowInsets):void");
    }

    public final C104176bM Aqd() {
        return AnonymousClass6WQ.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass55C)) {
            return false;
        }
        return C04220Ms.A0I(((AnonymousClass55C) obj).A00, this.A00);
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A01.getValue();
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r9, C147618pd r10, long j) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r10, r9);
        C147368pE r3 = this.A02;
        int Aro = ((WindowInsets) r3.getValue()).Aro(r10, r10.getLayoutDirection());
        int BHQ = ((WindowInsets) r3.getValue()).BHQ(r10);
        int B8D = ((WindowInsets) r3.getValue()).B8D(r10, r10.getLayoutDirection()) + Aro;
        int AU2 = ((WindowInsets) r3.getValue()).AU2(r10) + BHQ;
        C123657Xy Bg4 = r9.Bg4(AnonymousClass7JT.A03(j, -B8D, -AU2));
        return C147618pd.A00(r10, new KtLambdaShape5S0102000_I2(Bg4, BHQ, Aro, A1Y ? 1 : 0), AnonymousClass8bI.A04(j, Bg4.A01 + B8D), AnonymousClass8bI.A03(j, Bg4.A00 + AU2));
    }
}
