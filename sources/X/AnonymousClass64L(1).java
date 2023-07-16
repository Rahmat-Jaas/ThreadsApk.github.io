package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.64L  reason: invalid class name */
public final class AnonymousClass64L extends AnonymousClass5NL implements C144818jK {
    public final C90595Mp D55() {
        ArrayList arrayList;
        ImmutableList<C144788jH> optionalTreeListByHashCode = getOptionalTreeListByHashCode(-847398795, AnonymousClass64I.class);
        if (optionalTreeListByHashCode != null) {
            arrayList = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            for (C144788jH D52 : optionalTreeListByHashCode) {
                arrayList.add(D52.D52());
            }
        } else {
            arrayList = null;
        }
        String stringValueByHashCode = getStringValueByHashCode(111948);
        if (stringValueByHashCode != null) {
            String A05 = AnonymousClass5NL.A05(this);
            if (A05 != null) {
                Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(1047317644);
                String stringValueByHashCode2 = getStringValueByHashCode(3575610);
                if (stringValueByHashCode2 != null) {
                    return new C90595Mp(optionalIntValueByHashCode, stringValueByHashCode, A05, stringValueByHashCode2, arrayList);
                }
                throw AnonymousClass0wJ.A0b();
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }
}
