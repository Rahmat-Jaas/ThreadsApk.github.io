package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxCListenerShape207S0100000_5_I2;
import com.instagram.barcelona.R;

/* renamed from: X.1QN  reason: invalid class name */
public final class AnonymousClass1QN extends FLb {
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        C04220Ms.A0B(view, 0);
        ImageView imageView = (ImageView) AnonymousClass2CW.A00(view, R.id.iv_back_button);
        if (this.A00 != null) {
            drawable = getContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        AnonymousClass0wJ.A16(imageView, 13, this);
        AnonymousClass2CW.A00(view, R.id.btn_submit).setOnClickListener(new IDxCListenerShape207S0100000_5_I2((Object) this, 28));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-366565908);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.xmds_selfie_review_fragment, viewGroup, false);
        C14030oh.A09(-1073349018, A02);
        return inflate;
    }
}
