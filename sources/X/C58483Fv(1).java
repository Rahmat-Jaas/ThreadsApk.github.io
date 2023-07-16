package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.3Fv  reason: invalid class name and case insensitive filesystem */
public final class C58483Fv {
    public C35121Ing A00;
    public Map A01 = AnonymousClass0wJ.A0y();
    public final C04530Oa A02 = AnonymousClass0OY.A02(C76644eR.A00);
    public final C04530Oa A03 = AnonymousClass0OY.A02(C76654eS.A00);
    public final C04530Oa A04 = AnonymousClass0OY.A02(C76664eT.A00);

    public final void A00(C37354Jq3 jq3) {
        C04530Oa r3 = this.A04;
        AnonymousClass0W7 r2 = jq3.A02;
        AbstractCollection abstractCollection = (AbstractCollection) AnonymousClass4WJ.A07(r2, (Map) r3.getValue());
        abstractCollection.add(jq3);
        ((Map) r3.getValue()).put(r2, abstractCollection);
        for (AnonymousClass0W7 r32 : jq3.A0O()) {
            C04530Oa r22 = this.A02;
            AbstractCollection abstractCollection2 = (AbstractCollection) AnonymousClass4WJ.A07(r32, (Map) r22.getValue());
            abstractCollection2.add(jq3);
            ((Map) r22.getValue()).put(r32, abstractCollection2);
        }
        ((AbstractMap) this.A03.getValue()).put(C18210wN.A0l(jq3.getClass()), jq3);
        if (jq3 instanceof C35121Ing) {
            this.A00 = (C35121Ing) jq3;
        }
    }
}
