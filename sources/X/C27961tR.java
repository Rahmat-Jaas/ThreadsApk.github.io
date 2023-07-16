package X;

import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1tR  reason: invalid class name and case insensitive filesystem */
public final class C27961tR extends AnonymousClass5NL implements C82154pA {
    public final C210018l D2e(C112176p7 r8) {
        BKU bku;
        BKU bku2;
        String stringValueByHashCode = getStringValueByHashCode(3076014);
        Class<ImmutablePandoMediaDict> cls = ImmutablePandoMediaDict.class;
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) getTreeValueByHashCode(689310300, cls);
        if (immutablePandoMediaDict != null) {
            bku = new BKU(r8, immutablePandoMediaDict);
        } else {
            bku = null;
        }
        ArrayList arrayList = null;
        if (bku != null) {
            bku2 = (BKU) r8.A00(bku);
        } else {
            bku2 = null;
        }
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(370429585, cls);
        if (optionalTreeListByHashCode != null) {
            ArrayList<BKU> A0x = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                A0x.add(new BKU(r8, (ImmutablePandoMediaDict) it.next()));
            }
            arrayList = AnonymousClass0wJ.A0x(A0x, 10);
            for (BKU A00 : A0x) {
                arrayList.add(r8.A00(A00));
            }
        }
        return new C210018l(bku2, stringValueByHashCode, getStringValueByHashCode(-265713450), arrayList);
    }
}
