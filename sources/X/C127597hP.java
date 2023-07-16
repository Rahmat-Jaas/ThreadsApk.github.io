package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.7hP  reason: invalid class name and case insensitive filesystem */
public final class C127597hP implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<C61803Vq> list = ((C90975fO) obj2).A08;
        if (list == null) {
            return null;
        }
        for (C61803Vq A0y : list) {
            recyclerView.A0y(A0y);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        List list = ((C90975fO) obj).A08;
        List list2 = ((C90975fO) obj2).A08;
        if (list == list2 || (list != null && list.equals(list2))) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<C61803Vq> list = ((C90975fO) obj2).A08;
        if (list != null) {
            for (C61803Vq A0z : list) {
                recyclerView.A0z(A0z);
            }
        }
    }
}
