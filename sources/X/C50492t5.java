package X;

import com.instagram.user.model.MicroUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2t5  reason: invalid class name and case insensitive filesystem */
public final class C50492t5 {
    public static final List A00(List list) {
        C04220Ms.A0B(list, 0);
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MicroUserDict microUserDict = (MicroUserDict) it.next();
            C04220Ms.A0B(microUserDict, 0);
            A0w.add(new C72144Mm(microUserDict));
        }
        return A0w;
    }
}
