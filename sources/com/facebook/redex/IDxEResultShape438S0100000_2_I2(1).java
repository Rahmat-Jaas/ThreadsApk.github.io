package com.facebook.redex;

import X.AnonymousClass00C;
import X.AnonymousClass00J;
import X.AnonymousClass066;
import X.AnonymousClass0wJ;
import X.AnonymousClass52E;
import X.AnonymousClass544;
import X.AnonymousClass7F8;
import X.AnonymousClass7H8;
import X.AnonymousClass7JQ;
import X.AnonymousClass7KG;
import X.AnonymousClass7Y2;
import X.AnonymousClass7Y3;
import X.C105506dX;
import X.C110206lI;
import X.C110236lL;
import X.C113196qu;
import X.C115556vT;
import X.C115596vX;
import X.C116066wM;
import X.C1195976a;
import X.C121827Ii;
import X.C123247Wa;
import X.C142818fe;
import X.C142858fi;
import X.C142978fu;
import X.C146068la;
import X.C147368pE;
import X.C18190wL;
import X.C28552FRy;
import X.C86104wH;
import X.C86144wL;
import X.C877854n;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IDxEResultShape438S0100000_2_I2 implements C142818fe {
    public Object A00;
    public final int A01;

    public IDxEResultShape438S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void dispose() {
        C147368pE r2;
        List list;
        switch (this.A01) {
            case 0:
                ((AnonymousClass00C) this.A00).A00();
                return;
            case 3:
                r2 = (C147368pE) this.A00;
                C142978fu r0 = (C142978fu) r2.getValue();
                if (r0 != null) {
                    r0.release();
                }
                list = null;
                break;
            case 4:
                ((C110206lI) this.A00).A00 = null;
                return;
            case 5:
                AnonymousClass7Y2 r22 = (AnonymousClass7Y2) this.A00;
                int A04 = AnonymousClass0wJ.A04(r22.A03.getValue());
                for (int i = 0; i < A04; i++) {
                    r22.release();
                }
                return;
            case 6:
                C113196qu r1 = (C113196qu) this.A00;
                if (C86104wH.A1X(r1.A09)) {
                    AnonymousClass7JQ.A01(r1);
                    return;
                }
                return;
            case 7:
                ((C121827Ii) this.A00).A06();
                return;
            case 8:
                ((AnonymousClass7F8) this.A00).A05();
                return;
            case 9:
                ((C142858fi) this.A00).D8F();
                return;
            case 10:
                ((C146068la) this.A00).dispose();
                return;
            case 11:
                AnonymousClass7H8 r4 = ((C1195976a) C86104wH.A0f(this.A00)).A00;
                if (r4 != null) {
                    AnonymousClass7Y3 r3 = r4.A06;
                    r3.A0L = true;
                    Map map = r4.A07;
                    Iterator A0z = C86144wL.A0z(map);
                    while (A0z.hasNext()) {
                        C146068la r02 = ((C110236lL) A0z.next()).A00;
                        if (r02 != null) {
                            r02.dispose();
                        }
                    }
                    r3.A0G();
                    r3.A0L = false;
                    map.clear();
                    r4.A09.clear();
                    r4.A01 = 0;
                    r4.A02 = 0;
                    r4.A08.clear();
                    r4.A03();
                    return;
                }
                throw C18190wL.A0a("SubcomposeLayoutState is not attached to SubcomposeLayout");
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                ((C123247Wa) this.A00).A00.invoke();
                return;
            case 13:
                AnonymousClass52E r03 = (AnonymousClass52E) this.A00;
                r03.dismiss();
                r03.A03.A03();
                return;
            case 14:
                C877854n r12 = (C877854n) this.A00;
                r12.A03();
                C116066wM.A01(r12, (AnonymousClass066) null);
                r12.A0A.removeViewImmediate(r12);
                return;
            case 15:
                C115596vX r13 = (C115596vX) this.A00;
                C115596vX r04 = r13.A03;
                if (r04 != null) {
                    r2 = r04.A01;
                    list = AnonymousClass00J.A0U((Iterable) r2.getValue(), r13);
                    break;
                } else {
                    return;
                }
            case 16:
                C28552FRy fRy = ((C105506dX) this.A00).A00;
                if (!fRy.A08()) {
                    fRy.A04();
                    return;
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
                AnonymousClass7KG r14 = (AnonymousClass7KG) this.A00;
                r14.A0B = false;
                AnonymousClass7KG.A04(r14);
                return;
            case 18:
                ((AnonymousClass544) this.A00).A02 = true;
                return;
            default:
                ((C115556vT) this.A00).A00();
                return;
        }
        r2.CrC(list);
    }
}
