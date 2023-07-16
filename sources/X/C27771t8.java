package X;

import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1t8  reason: invalid class name and case insensitive filesystem */
public final class C27771t8 extends AnonymousClass5NL implements C82084p3 {
    public final AnonymousClass18V Cze(C112176p7 r6) {
        ArrayList<BKU> arrayList;
        ArrayList arrayList2;
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(106855379, ImmutablePandoMediaDict.class);
        if (optionalTreeListByHashCode != null) {
            arrayList = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                arrayList.add(new BKU(r6, (ImmutablePandoMediaDict) it.next()));
            }
        } else {
            arrayList = null;
        }
        User user = null;
        if (arrayList != null) {
            arrayList2 = AnonymousClass0wJ.A0w(arrayList);
            for (BKU A00 : arrayList) {
                arrayList2.add(r6.A00(A00));
            }
        } else {
            arrayList2 = null;
        }
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(3599307, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            user = (User) r6.A00(new User(immutablePandoUserDict));
        }
        return new AnonymousClass18V(user, arrayList2);
    }
}
