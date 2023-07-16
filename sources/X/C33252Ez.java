package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Ez  reason: invalid class name and case insensitive filesystem */
public final class C33252Ez {
    public static C210118m A00(C84674tf r14, C84454tA r15, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Integer num2, String str, String str2, List list) {
        C210318o r2;
        if (r14 instanceof C210118m) {
            ArrayList arrayList = null;
            if (r15 != null) {
                r2 = r15.D2t();
            } else {
                r2 = null;
            }
            if (list != null) {
                arrayList = AnonymousClass0wJ.A0w(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C84444t9) it.next()).D0F());
                }
            }
            return new C210118m(r2, bool, bool2, bool3, bool4, bool5, bool6, bool7, num, num2, str, str2, arrayList);
        }
        throw new Exception("Pando builders are not available yet");
    }
}
