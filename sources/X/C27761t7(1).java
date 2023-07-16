package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1t7  reason: invalid class name and case insensitive filesystem */
public final class C27761t7 extends AnonymousClass5NL implements C21544Bw8 {
    public final AnonymousClass18U CzL(C112176p7 r6) {
        ArrayList arrayList;
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(-1167125638, ImmutablePandoUserDict.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList A0x = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                C18180wK.A1U(A0x, it);
            }
            arrayList = AnonymousClass0wJ.A0x(A0x, 10);
            Iterator it2 = A0x.iterator();
            while (it2.hasNext()) {
                C18190wL.A1Q(r6, arrayList, it2);
            }
        } else {
            arrayList = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(1324364035);
        if (optionalIntValueByHashCode != null) {
            int intValue = optionalIntValueByHashCode.intValue();
            String stringValueByHashCode = getStringValueByHashCode(-798298666);
            if (stringValueByHashCode != null) {
                String stringValueByHashCode2 = getStringValueByHashCode(3556653);
                if (stringValueByHashCode2 != null) {
                    return new AnonymousClass18U(stringValueByHashCode, stringValueByHashCode2, arrayList, intValue);
                }
                throw AnonymousClass0wJ.A0b();
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final AnonymousClass18U CzM(C144028hi r2) {
        return CzL(new C112176p7(r2));
    }
}
