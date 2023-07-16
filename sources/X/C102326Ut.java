package X;

import com.instagram.model.shopping.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Ut  reason: invalid class name and case insensitive filesystem */
public final class C102326Ut {
    public static final List A00(List list) {
        C04220Ms.A0B(list, 0);
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Product) it.next()).A00.A0j;
            C04220Ms.A06(str);
            A0w.add(AnonymousClass0wJ.A0d(str));
        }
        return A0w;
    }
}
