package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass68o;
import X.AnonymousClass8iQ;
import X.C04220Ms;
import X.C10450iM;
import X.C112916qP;
import X.C115576vV;
import X.C131347ro;
import X.C131387rs;
import X.C14030oh;
import X.C171189wD;
import X.C18180wK;
import X.C82394pY;
import com.instagram.model.shopping.Product;

public class IDxEListenerShape166S0200000_2_I2 implements C82394pY {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxEListenerShape166S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        int i2;
        switch (this.A02) {
            case 0:
                A03 = C14030oh.A03(1399575593);
                C131347ro r8 = (C131347ro) obj;
                int A032 = C14030oh.A03(-970871784);
                C04220Ms.A0B(r8, 0);
                C115576vV r5 = (C115576vV) this.A01;
                if (C04220Ms.A0I(r5.A02, r8.A01)) {
                    AnonymousClass68o r2 = r8.A00;
                    int ordinal = r2.ordinal();
                    if (ordinal == 1) {
                        r5.A04(true);
                    } else if (ordinal != 2) {
                        if (ordinal != 3) {
                            C10450iM.A03("FlmConsentController", "Invalid FLM consent outcome");
                            r5.A02 = null;
                            r5.A00 = null;
                            r5.A01 = null;
                            i = -182892577;
                            C14030oh.A0A(i, A032);
                            i2 = 1644163826;
                            break;
                        }
                    } else {
                        r5.A04(false);
                    }
                    ((AnonymousClass8iQ) this.A00).AE8(r2);
                }
                i = 360931537;
                C14030oh.A0A(i, A032);
                i2 = 1644163826;
            case 1:
                C112916qP r4 = (C112916qP) this.A01;
                C131387rs r82 = (C131387rs) obj;
                if (r82.A02.equals(((Product) this.A00).A00.A0j)) {
                    C171189wD r22 = r82.A00;
                    C171189wD r1 = C171189wD.SAVED;
                    if (r22 == r1 || r22 == C171189wD.NOT_SAVED) {
                        boolean z = true;
                        boolean A1Z = C18180wK.A1Z(r22, r1);
                        if (r82.A01 != AnonymousClass006.A00) {
                            z = false;
                        }
                        r4.A00(A1Z, z);
                        return;
                    }
                    return;
                }
                return;
            default:
                A03 = C14030oh.A03(418633065);
                C131387rs r83 = (C131387rs) obj;
                int A033 = C14030oh.A03(972459029);
                C171189wD r23 = C171189wD.SAVED;
                C171189wD r12 = r83.A00;
                if (r23 == r12 || C171189wD.NOT_SAVED == r12) {
                    C112916qP r52 = (C112916qP) this.A01;
                    boolean z2 = true;
                    boolean A1Z2 = C18180wK.A1Z(r12, r23);
                    if (r83.A01 != AnonymousClass006.A00) {
                        z2 = false;
                    }
                    r52.A00(A1Z2, z2);
                }
                C14030oh.A0A(-1147019856, A033);
                i2 = 1656983425;
                break;
        }
        C14030oh.A0A(i2, A03);
    }
}
