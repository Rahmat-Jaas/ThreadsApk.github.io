package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.6Tn  reason: invalid class name and case insensitive filesystem */
public final class C102026Tn {
    public static void A00(MMo mMo, AnonymousClass1SO r4, String str) {
        if (DialogModule.KEY_ITEMS.equals(str)) {
            ArrayList arrayList = null;
            if (mMo.A0f() == C40318LcR.START_ARRAY) {
                arrayList = AnonymousClass0wJ.A0v();
                while (mMo.A0g() != C40318LcR.END_ARRAY) {
                    AnonymousClass7HP parseFromJson = C102066Tr.parseFromJson(mMo);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            C04220Ms.A0B(arrayList, 0);
            r4.A00 = arrayList;
            return;
        }
        AnonymousClass3Za.A01(mMo, r4, str);
    }
}
