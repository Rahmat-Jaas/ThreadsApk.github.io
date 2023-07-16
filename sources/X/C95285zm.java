package X;

import android.util.Log;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5zm  reason: invalid class name and case insensitive filesystem */
public final class C95285zm extends C111556ns {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public C95285zm(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        String str;
        Pair A012 = C121727Ht.A01((C127397h3) obj, new AnonymousClass7r5(this.A01));
        List list = (List) A012.first;
        int A04 = AnonymousClass0wJ.A04(A012.second);
        int A002 = C121727Ht.A00(new AnonymousClass7r5(this.A00), list);
        if (A04 == -1) {
            str = "removeChildren: The starting id doesn't exist. No children have been removed.";
        } else if (A002 == -1) {
            str = "removeChildren: The ending id doesn't exist. No children have been removed.";
        } else if (A04 > A002) {
            str = "removeChildren: The starting index is larger than the ending index. No children have been removed.";
        } else {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                if (i > A04 && i < A002) {
                    it.remove();
                }
                i++;
            }
            return;
        }
        Log.w("ComponentTree", str);
    }
}
