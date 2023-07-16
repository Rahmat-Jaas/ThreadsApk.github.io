package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.63p  reason: invalid class name and case insensitive filesystem */
public final class C961363p extends AnonymousClass5NL implements C21558BwN {
    public final List B9m() {
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(-50816531, C958662n.class);
        if (optionalTreeListByHashCode != null) {
            return optionalTreeListByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final AnonymousClass5M9 D3O() {
        AnonymousClass5KZ r4;
        AnonymousClass5Ka r5;
        AnonymousClass5KY r3;
        AnonymousClass5MA r6;
        C144108hq r0 = (C144108hq) getTreeValueByHashCode(114689134, C958362k.class);
        ArrayList arrayList = null;
        if (r0 != null) {
            r4 = r0.CyB();
        } else {
            r4 = null;
        }
        C144118hr r02 = (C144118hr) getTreeValueByHashCode(512292299, C958462l.class);
        if (r02 != null) {
            r5 = r02.CyC();
        } else {
            r5 = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(410680582);
        List<C144138ht> B9m = B9m();
        ArrayList A0x = AnonymousClass0wJ.A0x(B9m, 10);
        for (C144138ht CyE : B9m) {
            A0x.add(CyE.CyE());
        }
        C144098hp r03 = (C144098hp) getTreeValueByHashCode(-1762451107, C958262j.class);
        if (r03 != null) {
            r3 = r03.CyA();
        } else {
            r3 = null;
        }
        Long optionalTimeValueByHashCode = getOptionalTimeValueByHashCode(1491920727);
        if (optionalTimeValueByHashCode != null) {
            long longValue = optionalTimeValueByHashCode.longValue();
            C144508ic r04 = (C144508ic) getTreeValueByHashCode(1011536495, C961463q.class);
            if (r04 != null) {
                r6 = r04.D3P();
            } else {
                r6 = null;
            }
            ImmutableList<C144148hu> optionalTreeListByHashCode = getOptionalTreeListByHashCode(-1924529035, C958762o.class);
            if (optionalTreeListByHashCode != null) {
                arrayList = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
                for (C144148hu CyF : optionalTreeListByHashCode) {
                    arrayList.add(CyF.CyF());
                }
            }
            return new AnonymousClass5M9(r3, r4, r5, r6, optionalIntValueByHashCode, A0x, arrayList, longValue);
        }
        throw AnonymousClass0wJ.A0b();
    }
}
