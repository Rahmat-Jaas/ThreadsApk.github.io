package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.service.session.UserSession;

/* renamed from: X.1uD  reason: invalid class name and case insensitive filesystem */
public final class C28401uD extends C23091bu {
    public static final String __redex_internal_original_name = "QuickPromotionIIGCelebrationFullscreen";
    public IgSimpleImageView A00;
    public CircularImageView A01;
    public CircularImageView A02;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(473362156);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_celebration_fullscreen_fragment, viewGroup, false);
        CircularImageView circularImageView = (CircularImageView) C23091bu.A00(inflate, this);
        this.A02 = circularImageView;
        this.A05 = circularImageView;
        this.A01 = (CircularImageView) inflate.findViewById(R.id.animation_over_image);
        this.A00 = (IgSimpleImageView) inflate.findViewById(R.id.background_simple_imageview);
        C14030oh.A09(-113262650, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1367089087);
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        C14030oh.A09(-214635048, A022);
    }

    public final void onResume() {
        CircularImageView circularImageView;
        int A022 = C14030oh.A02(439250282);
        super.onResume();
        C28291u0 r1 = this.A07;
        if (r1 == null || this.A0B) {
            A01();
            this.A0A = true;
        } else {
            A02(r1);
            UserSession userSession = this.A09;
            if (!(userSession == null || (circularImageView = this.A02) == null)) {
                circularImageView.setUrl(AnonymousClass0wJ.A0Y(userSession).A0a(), this);
            }
            IgSimpleImageView igSimpleImageView = this.A00;
            if (igSimpleImageView != null) {
                C30403GCd gCd = new C30403GCd(igSimpleImageView, getModuleName(), igSimpleImageView.getRootView());
                gCd.A02 = requireContext().getColor(R.color.canvas_text_tool_scrim);
                gCd.A00 = 5;
                igSimpleImageView.setBackground(new C28200F0z(gCd));
            }
            CircularImageView circularImageView2 = this.A01;
            if (circularImageView2 != null) {
                C25702DqQ.A01(requireContext(), circularImageView2);
                C25702DqQ.A02(circularImageView2.getDrawable());
            }
        }
        C14030oh.A09(-510503725, A022);
    }
}
