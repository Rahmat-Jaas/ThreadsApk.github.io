package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.CreateModeType;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.62r  reason: invalid class name and case insensitive filesystem */
public final class C959062r extends AnonymousClass5NL implements C145448kW {
    public final AnonymousClass5Kg CyQ(C112176p7 r12) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C90055Ki r3;
        C90065Kj r4;
        ArrayList arrayList3;
        ImmutableList<C144058hl> optionalTreeListByHashCode = getOptionalTreeListByHashCode(94431075, C957662d.class);
        AnonymousClass5N0 r5 = null;
        if (optionalTreeListByHashCode != null) {
            arrayList = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
            for (C144058hl Cxx : optionalTreeListByHashCode) {
                arrayList.add(Cxx.Cxx());
            }
        } else {
            arrayList = null;
        }
        ImmutableList optionalTreeListByHashCode2 = getOptionalTreeListByHashCode(1778619833, ImmutablePandoUserDict.class);
        if (optionalTreeListByHashCode2 != null) {
            ArrayList A0x = AnonymousClass0wJ.A0x(optionalTreeListByHashCode2, 10);
            Iterator it = optionalTreeListByHashCode2.iterator();
            while (it.hasNext()) {
                C18180wK.A1U(A0x, it);
            }
            arrayList2 = AnonymousClass0wJ.A0x(A0x, 10);
            Iterator it2 = A0x.iterator();
            while (it2.hasNext()) {
                C18190wL.A1Q(r12, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        C144178hx r0 = (C144178hx) getTreeValueByHashCode(541661630, C959362u.class);
        if (r0 != null) {
            r3 = r0.Cym();
        } else {
            r3 = null;
        }
        C144188hy r02 = (C144188hy) getTreeValueByHashCode(1841734510, C959462v.class);
        if (r02 != null) {
            r4 = r02.Cyp();
        } else {
            r4 = null;
        }
        String stringValueByHashCode = getStringValueByHashCode(3373707);
        ImmutableList<C82094p4> optionalTreeListByHashCode3 = getOptionalTreeListByHashCode(-276693162, C27801tB.class);
        if (optionalTreeListByHashCode3 != null) {
            arrayList3 = AnonymousClass0wJ.A0x(optionalTreeListByHashCode3, 10);
            for (C82094p4 Czp : optionalTreeListByHashCode3) {
                arrayList3.add(Czp.Czp());
            }
        } else {
            arrayList3 = null;
        }
        C144898jT r03 = (C144898jT) getTreeValueByHashCode(-732727820, C962464a.class);
        if (r03 != null) {
            r5 = r03.D70(r12);
        }
        return new AnonymousClass5Kg((CreateModeType) A09(AnonymousClass8NQ.A00, 3575610), r3, r4, r5, stringValueByHashCode, getStringValueByHashCode(1825632156), arrayList, arrayList2, arrayList3);
    }

    public final AnonymousClass5Kg CyR(C144028hi r2) {
        return CyQ(new C112176p7(r2));
    }
}
