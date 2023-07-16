package X;

import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: X.5zn  reason: invalid class name and case insensitive filesystem */
public final class C95295zn extends C111556ns {
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;

    public C95295zn(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        Pair A012 = C121727Ht.A01((C127397h3) obj, new AnonymousClass7r5(this.A00));
        int A04 = AnonymousClass0wJ.A04(A012.second);
        if (A04 < 0) {
            Log.w("ComponentTreeMutator", "replaceChildrenAfter: No existing child found with specified ID in parent. New children have not been added to parent.");
            return;
        }
        List list = (List) A012.first;
        int size = list.size();
        while (true) {
            size--;
            if (size > A04) {
                list.remove(size);
            } else {
                list.addAll(A04 + 1, C121727Ht.A03(this.A01));
                return;
            }
        }
    }
}
