package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.1QL  reason: invalid class name */
public final class AnonymousClass1QL extends AnonymousClass1QM {
    public Button A00;

    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        Drawable drawable2;
        C04220Ms.A0B(view, 0);
        Button button = (Button) AnonymousClass2CW.A00(view, R.id.btn_camera_access_allow);
        this.A00 = button;
        if (button == null) {
            C04220Ms.A0E("btnCameraAccessAllow");
            throw null;
        }
        AnonymousClass0wJ.A16(AnonymousClass2CW.A00(button, R.id.btn_camera_access_allow), 12, this);
        ImageView imageView = (ImageView) AnonymousClass2CW.A00(view, R.id.iv_permissions_statement1);
        ImageView imageView2 = (ImageView) AnonymousClass2CW.A00(view, R.id.iv_permissions_statement2);
        ImageView imageView3 = (ImageView) AnonymousClass2CW.A00(view, R.id.iv_permissions_statement3);
        Drawable drawable3 = null;
        if (this.A00 != null) {
            drawable = view.getContext().getDrawable(R.drawable.instagram_video_chat_pano_filled_24);
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        if (this.A00 == null || (drawable2 = view.getContext().getDrawable(R.drawable.instagram_sparkles_pano_outline_24)) == null) {
            drawable2 = null;
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(requireContext().getColor(R.color.abc_decor_view_status_guard_light), PorterDuff.Mode.SRC_ATOP));
        }
        imageView2.setImageDrawable(drawable2);
        if (this.A00 != null) {
            drawable3 = view.getContext().getDrawable(R.drawable.instagram_settings_pano_outline_24);
        }
        imageView3.setImageDrawable(drawable3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1562989461);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.xmds_permissions_fragment, viewGroup, false);
        C14030oh.A09(1137842974, A02);
        return inflate;
    }
}
