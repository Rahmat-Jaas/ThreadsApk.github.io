package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.1gB  reason: invalid class name */
public final class AnonymousClass1gB extends AnonymousClass436 {
    public final Context A00;
    public final C21839C2o A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r3, Object obj, Object obj2) {
        C04220Ms.A0B(r3, 0);
        r3.A5L(0, obj, (Object) null);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gB(Context context, C21839C2o c2o) {
        this.A00 = context;
        this.A01 = c2o;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(352904683);
        C04220Ms.A0B(view, 1);
        Context context = this.A00;
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.comments.adapter.SlideThreadHeaderImageViewBinder.Holder");
        C555733t r2 = (C555733t) tag;
        C04220Ms.A0C(obj, I17.A00(18));
        BKU bku = (BKU) obj;
        C21839C2o c2o = this.A01;
        AnonymousClass0wJ.A1M(r2, 1, bku);
        if (bku.A22() == null) {
            r2.A00.setVisibility(8);
        } else {
            RoundedCornerImageView roundedCornerImageView = r2.A00;
            ImageUrl A22 = bku.A22();
            C04220Ms.A06(A22);
            roundedCornerImageView.setUrl(A22, c2o);
            roundedCornerImageView.setElevation((float) C18250wR.A00(context.getResources()));
            C09860go.A0M(roundedCornerImageView, C18220wO.A03(context.getResources()));
            C09860go.A0X(roundedCornerImageView, context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material));
            roundedCornerImageView.setVisibility(0);
        }
        C14030oh.A0A(-47677443, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(385809312, viewGroup);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.slide_thread_header_image);
        C04220Ms.A06(A0H);
        A0H.setTag(new C555733t(A0H));
        C14030oh.A0A(192769778, A002);
        return A0H;
    }
}
