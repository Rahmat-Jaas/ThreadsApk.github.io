package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;

/* renamed from: X.7Wb  reason: invalid class name */
public final class AnonymousClass7Wb implements C146078lb, C145108jq {
    public final C147368pE A00 = C86104wH.A0I(AnonymousClass7WR.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final C146078lb A01;
    public final Set A02 = C86134wK.A0u();

    public AnonymousClass7Wb(C146078lb r4, Map map) {
        this.A01 = new C65853w5(map, C86154wM.A0z(r4, 6));
    }

    public final void A4s(C147188nY r7, Object obj, AnonymousClass0YP r9, int i) {
        Object obj2 = obj;
        AnonymousClass0YP r4 = r9;
        AnonymousClass0wJ.A1N(obj, r9);
        r7.Cvd(-697180401);
        C145108jq r1 = (C145108jq) this.A00.getValue();
        if (r1 != null) {
            int i2 = i;
            r1.A4s(r7, obj, r9, (i & 112) | 520);
            AnonymousClass7K5.A04(r7, obj, C86164wN.A10(obj, this, 32));
            C147178nW AKE = r7.AKE();
            if (AKE != null) {
                AKE.D9d(new KtLambdaShape18S0301000_I2(i2, 2, r4, obj2, this));
                return;
            }
            return;
        }
        throw C18190wL.A0a("Required value was null.");
    }

    public final boolean ABk(Object obj) {
        return this.A01.ABk(obj);
    }

    public final Object AEF(String str) {
        return this.A01.AEF(str);
    }

    public final void CcR(Object obj) {
        C04220Ms.A0B(obj, 0);
        C145108jq r0 = (C145108jq) this.A00.getValue();
        if (r0 != null) {
            r0.CcR(obj);
            return;
        }
        throw C18190wL.A0a("Required value was null.");
    }

    public final Map CWd() {
        C145108jq r2 = (C145108jq) this.A00.getValue();
        if (r2 != null) {
            for (Object CcR : this.A02) {
                r2.CcR(CcR);
            }
        }
        return this.A01.CWd();
    }

    public final C142858fi CaL(String str, AnonymousClass0ZU r3) {
        AnonymousClass0wJ.A1N(str, r3);
        return this.A01.CaL(str, r3);
    }
}
