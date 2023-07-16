package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0620000_I2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6oK  reason: invalid class name and case insensitive filesystem */
public final class C111746oK {
    public Set A00 = AnonymousClass84Y.A00;

    public final void A00(Map map, Map map2, int i, int i2) {
        AP8 ap8;
        AnonymousClass0ZU r0;
        AnonymousClass0wJ.A1N(map, map2);
        LinkedHashSet A0u = C86134wK.A0u();
        Iterator it = AnonymousClass8bH.A02(i, i2).iterator();
        while (it.hasNext()) {
            Collection collection = (Collection) C18200wM.A0f(map, ((C1367083z) it).A00());
            if (collection != null) {
                A0u.addAll(collection);
            }
        }
        Set A0c = AnonymousClass00J.A0c(A0u);
        for (Object obj : AnonymousClass4WL.A00(this.A00, A0c)) {
            KtCSuperShape0S0620000_I2 ktCSuperShape0S0620000_I2 = (KtCSuperShape0S0620000_I2) map2.get(obj);
            if (!(ktCSuperShape0S0620000_I2 == null || (ap8 = (AP8) ktCSuperShape0S0620000_I2.A04) == null || (r0 = ap8.A01) == null)) {
                r0.invoke();
            }
        }
        this.A00 = A0c;
    }
}
