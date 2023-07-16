package X;

import com.google.common.collect.ImmutableList;
import com.instagram.model.shopping.merchant.MicroMerchantDict;
import java.util.ArrayList;

/* renamed from: X.64U  reason: invalid class name */
public final class AnonymousClass64U extends AnonymousClass5NL implements C21405Bto {
    public final C90625Mt D6I() {
        MicroMerchantDict microMerchantDict;
        String A03 = AnonymousClass5NL.A03(this);
        Long optionalTimeValueByHashCode = getOptionalTimeValueByHashCode(-900774058);
        C21758Bzj bzj = (C21758Bzj) getTreeValueByHashCode(-505296440, AnonymousClass9jT.class);
        ArrayList arrayList = null;
        if (bzj != null) {
            microMerchantDict = bzj.D63();
        } else {
            microMerchantDict = null;
        }
        ImmutableList<C144368iG> optionalTreeListByHashCode = getOptionalTreeListByHashCode(1531715286, AnonymousClass63Y.class);
        if (optionalTreeListByHashCode != null) {
            arrayList = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            for (C144368iG D2I : optionalTreeListByHashCode) {
                arrayList.add(D2I.D2I());
            }
        }
        return new C90625Mt(microMerchantDict, optionalTimeValueByHashCode, getOptionalTimeValueByHashCode(-147132913), A03, AnonymousClass5NL.A04(this), getStringValueByHashCode(-1064897719), getStringValueByHashCode(1595179052), arrayList);
    }
}
