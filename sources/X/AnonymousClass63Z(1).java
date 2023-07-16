package X;

import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.63Z  reason: invalid class name */
public final class AnonymousClass63Z extends AnonymousClass5NL implements C144378iH {
    public final AnonymousClass5LB D2S(C112176p7 r7) {
        AnonymousClass5LC r4;
        C144388iI r0 = (C144388iI) getTreeValueByHashCode(-894921330, C959863a.class);
        if (r0 != null) {
            r4 = r0.D2T();
        } else {
            r4 = null;
        }
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(-3896982, ImmutablePandoMediaDict.class);
        if (optionalTreeListByHashCode != null) {
            ArrayList<BKU> A0x = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                A0x.add(new BKU(r7, (ImmutablePandoMediaDict) it.next()));
            }
            ArrayList A0x2 = AnonymousClass0wJ.A0x(A0x, 10);
            for (BKU A00 : A0x) {
                A0x2.add(r7.A00(A00));
            }
            TreeJNI treeValueByHashCode = getTreeValueByHashCode(-305109662, AnonymousClass63V.class);
            if (treeValueByHashCode != null) {
                StoryPromptTappableData D1v = ((C41826MeI) treeValueByHashCode).D1v(r7);
                ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(-745300429);
                if (optionalStringListByHashCode != null) {
                    return new AnonymousClass5LB(D1v, r4, A0x2, optionalStringListByHashCode);
                }
                throw AnonymousClass0wJ.A0b();
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }
}
