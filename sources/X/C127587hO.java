package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7hO  reason: invalid class name and case insensitive filesystem */
public final class C127587hO implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C28283F7x f7x = ((C90975fO) obj2).A06;
        if (f7x == null) {
            return null;
        }
        f7x.A06(recyclerView);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        C28283F7x f7x = ((C90975fO) obj).A06;
        C28283F7x f7x2 = ((C90975fO) obj2).A06;
        if (f7x == f7x2 || (f7x != null && f7x.equals(f7x2))) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C28283F7x f7x = ((C90975fO) obj2).A06;
        if (f7x != null) {
            f7x.A06((RecyclerView) null);
        }
    }
}
