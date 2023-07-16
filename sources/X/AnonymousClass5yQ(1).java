package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.5yQ  reason: invalid class name */
public final class AnonymousClass5yQ extends AnonymousClass436 {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5yQ(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1612705095);
        AnonymousClass0wJ.A1O(view, obj);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionSectionTitleBinderGroup.Holder");
            ((C106466f5) tag).A00.setText((String) obj);
        }
        C14030oh.A0A(-1662203712, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-388434478, viewGroup);
        View A0D = C18180wK.A0D(LayoutInflater.from(this.A00), viewGroup, R.layout.product_collection_section_title, false);
        A0D.setTag(new C106466f5(A0D));
        C14030oh.A0A(-1606559398, A002);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }
}
