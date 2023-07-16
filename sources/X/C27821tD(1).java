package X;

import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1tD  reason: invalid class name and case insensitive filesystem */
public final class C27821tD extends AnonymousClass5NL implements C82114p6 {
    public final AnonymousClass424 D05(C144028hi r12) {
        ArrayList arrayList;
        C04220Ms.A0B(r12, 0);
        User user = null;
        C112176p7 r2 = new C112176p7(r12);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1202000768);
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(100526016, ImmutablePandoMediaDict.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList<BKU> A0x = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                A0x.add(new BKU(r2, (ImmutablePandoMediaDict) it.next()));
            }
            arrayList = AnonymousClass0wJ.A0x(A0x, 10);
            for (BKU A00 : A0x) {
                arrayList.add(r2.A00(A00));
            }
        } else {
            arrayList = null;
        }
        A0A(-1081138730);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(1024940639);
        String A0A = A0A(1314516130);
        getOptionalIntValueByHashCode(-1896634307);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(3599307, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            user = (User) r2.A00(new User(immutablePandoUserDict));
        }
        return new AnonymousClass424(user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, A0A, arrayList);
    }
}
