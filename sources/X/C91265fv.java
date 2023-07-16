package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;

/* renamed from: X.5fv  reason: invalid class name and case insensitive filesystem */
public final class C91265fv extends C91275fw {
    public static void A00(View view, String str, int i) {
        ((TextView) AnonymousClass2CW.A00(view, i)).setText(str);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(159431393);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.data_information_fragment);
        C14030oh.A09(-1857540839, A02);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ImageView imageView = (ImageView) AnonymousClass2CW.A00(view, R.id.icon_lock);
            ImageView imageView2 = (ImageView) AnonymousClass2CW.A00(view, R.id.icon_portrait);
            ImageView imageView3 = (ImageView) AnonymousClass2CW.A00(view, R.id.iv_back_button);
            imageView.setColorFilter(C31090GfY.A01(activity, R.attr.sc_primary_icon));
            imageView2.setColorFilter(C31090GfY.A01(activity, R.attr.sc_primary_icon));
            imageView3.setColorFilter(C31090GfY.A01(activity, R.attr.sc_primary_icon));
            if (this.A00 != null) {
                imageView.setImageDrawable((Drawable) null);
                imageView2.setImageDrawable((Drawable) null);
                C18180wK.A0r(activity, imageView3, R.drawable.instagram_arrow_left_pano_outline_24);
            }
            C86104wH.A1C(imageView3, 11, this);
        }
        A00(view, this.A00.A0G, R.id.data_information_title);
        A00(view, this.A00.A0A, R.id.data_information_body);
        A00(view, this.A00.A0D, R.id.data_information_first_section_title);
        A00(view, this.A00.A0B, R.id.data_information_first_section_body1);
        A00(view, this.A00.A0C, R.id.data_information_first_section_body2);
        A00(view, this.A00.A0F, R.id.data_information_second_section_title);
        A00(view, this.A00.A0E, R.id.data_information_second_section_body);
    }
}
