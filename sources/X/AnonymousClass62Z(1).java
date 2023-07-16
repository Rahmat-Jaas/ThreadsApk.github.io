package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.62Z  reason: invalid class name */
public final class AnonymousClass62Z extends AnonymousClass5NL implements C27881Eus {
    public final List AkK() {
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(2081886408, AnonymousClass63R.class);
        if (optionalTreeListByHashCode != null) {
            return optionalTreeListByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final int BHZ() {
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-407761836);
        if (optionalIntValueByHashCode != null) {
            return optionalIntValueByHashCode.intValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final C130057oa CxP() {
        List<C27955Ew5> AkK = AkK();
        ArrayList A0w = AnonymousClass0wJ.A0w(AkK);
        for (C27955Ew5 D0l : AkK) {
            A0w.add(D0l.D0l());
        }
        return new C130057oa(A0w, BHZ());
    }
}
