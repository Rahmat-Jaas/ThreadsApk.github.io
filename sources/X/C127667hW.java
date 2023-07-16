package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7hW  reason: invalid class name and case insensitive filesystem */
public final class C127667hW implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        C90965fN r7 = (C90965fN) obj2;
        AnonymousClass0wJ.A1M(viewGroup, 1, r7);
        View childAt = viewGroup.getChildAt(1);
        C04220Ms.A0C(childAt, C18170wI.A00(93));
        RecyclerView recyclerView = (RecyclerView) childAt;
        recyclerView.setAdapter(r7.A00);
        Parcelable parcelable = ((C130757qi) AnonymousClass7K7.A03(r7.A01, r7.A02)).A00;
        if (parcelable != null) {
            M6x m6x = recyclerView.A0H;
            if (m6x != null) {
                m6x.A15(parcelable);
            } else {
                throw C18180wK.A0a("LayoutManager for the RecyclerView was null by the time the SaveInstanceState binder was invoked");
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        C90965fN r3 = (C90965fN) obj;
        C90965fN r4 = (C90965fN) obj2;
        AnonymousClass0wJ.A1N(r3, r4);
        return C86144wL.A1X(r3.A00, r4.A00);
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup viewGroup = (ViewGroup) obj;
        C90965fN r7 = (C90965fN) obj2;
        AnonymousClass0wJ.A1M(viewGroup, 1, r7);
        View childAt = viewGroup.getChildAt(1);
        C04220Ms.A0C(childAt, C18170wI.A00(93));
        RecyclerView recyclerView = (RecyclerView) childAt;
        M6x m6x = recyclerView.A0H;
        if (m6x != null) {
            ((C130757qi) AnonymousClass7K7.A03(r7.A01, r7.A02)).A00 = m6x.A0p();
            recyclerView.setAdapter((C41030Luu) null);
            return;
        }
        throw C18180wK.A0a("LayoutManager for the RecyclerView was null by the time the SaveInstanceState binder was invoked");
    }
}
