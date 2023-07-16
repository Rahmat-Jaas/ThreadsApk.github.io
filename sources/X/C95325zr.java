package X;

import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: X.5zr  reason: invalid class name and case insensitive filesystem */
public final class C95325zr extends C111556ns {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public C95325zr(List list, int i, String str) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        Pair A012 = C121727Ht.A01((C127397h3) obj, new AnonymousClass7r5(this.A01));
        int A04 = AnonymousClass0wJ.A04(A012.second);
        if (A04 < 0) {
            Log.w("ComponentTree", "insertChildrenRelativeToId: No existing child found with specified ID in parent. New children have not been added to parent.");
        } else {
            ((List) A012.first).addAll(A04 + this.A00, C121727Ht.A03(this.A02));
        }
    }
}
