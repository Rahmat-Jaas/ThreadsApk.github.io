package X;

import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: X.5zk  reason: invalid class name and case insensitive filesystem */
public final class C95265zk extends C111556ns {
    public final /* synthetic */ String A00;

    public C95265zk(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        Pair A01 = C121727Ht.A01((C127397h3) obj, new AnonymousClass7r5(this.A00));
        int A04 = AnonymousClass0wJ.A04(A01.second);
        if (A04 < 0) {
            Log.w("ComponentTreeMutator", "removeChildById: No existing child found with specified ID in parent. No child has been removed from the parent.");
        } else {
            ((List) A01.first).remove(A04);
        }
    }
}
