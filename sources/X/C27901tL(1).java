package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1tL  reason: invalid class name and case insensitive filesystem */
public final class C27901tL extends AnonymousClass5NL implements C27997Ewl {
    public final List Ah5() {
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(497541391, ImmutablePandoUserDict.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                C18180wK.A1U(A0w, it);
            }
            return A0w;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String AZj() {
        String stringValueByHashCode = getStringValueByHashCode(951530927);
        if (stringValueByHashCode != null) {
            return stringValueByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String Al5() {
        String stringValueByHashCode = getStringValueByHashCode(98629247);
        if (stringValueByHashCode != null) {
            return stringValueByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final Boolean BBn() {
        return getOptionalBooleanValueByHashCode(-1401042162);
    }

    public final String BEm() {
        return getStringValueByHashCode(-2060497896);
    }

    public final String BH2() {
        String stringValueByHashCode = getStringValueByHashCode(110371416);
        if (stringValueByHashCode != null) {
            return stringValueByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final AnonymousClass18h D0e(C112176p7 r10) {
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(-1161803523);
        String stringValueByHashCode = getStringValueByHashCode(50511102);
        String AZj = AZj();
        List Ah5 = Ah5();
        ArrayList A0w = AnonymousClass0wJ.A0w(Ah5);
        Iterator it = Ah5.iterator();
        while (it.hasNext()) {
            C18190wL.A1Q(r10, A0w, it);
        }
        return new AnonymousClass18h(getOptionalBooleanValueByHashCode(-1401042162), stringValueByHashCode, AZj, Al5(), getStringValueByHashCode(-2060497896), BH2(), optionalStringListByHashCode, A0w);
    }

    public final String getCategory() {
        return getStringValueByHashCode(50511102);
    }
}
