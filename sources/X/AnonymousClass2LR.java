package X;

import java.util.HashMap;

/* renamed from: X.2LR  reason: invalid class name */
public final class AnonymousClass2LR {
    public static final HashMap A00(MMo mMo) {
        HashMap hashMap = null;
        if (mMo.A0f() == C40318LcR.START_OBJECT) {
            hashMap = AnonymousClass0wJ.A0y();
            while (mMo.A0g() != C40318LcR.END_OBJECT) {
                AnonymousClass0wJ.A1G(mMo, hashMap);
            }
        }
        return hashMap;
    }
}
