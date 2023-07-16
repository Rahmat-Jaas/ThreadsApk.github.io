package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.7gv  reason: invalid class name and case insensitive filesystem */
public final class C127317gv implements C27927Evd {
    public CircularImageView A00;
    public final View A01;
    public final FrameLayout A02;
    public final C25812DsR A03;
    public final IgTextView A04;
    public final float A05;

    public C127317gv(FrameLayout frameLayout) {
        C04220Ms.A0B(frameLayout, 1);
        this.A02 = frameLayout;
        Context context = frameLayout.getContext();
        View A0D = C18180wK.A0D(LayoutInflater.from(context), frameLayout, R.layout.layout_map_pill, false);
        this.A01 = A0D;
        this.A05 = C09860go.A03(context, 50);
        C25812DsR A022 = COK.A00().A02();
        A022.A06 = true;
        A022.A0E(this);
        this.A03 = A022;
        this.A00 = (CircularImageView) AnonymousClass0wJ.A0J(A0D, R.id.right_image);
        this.A04 = (IgTextView) AnonymousClass0wJ.A0J(A0D, R.id.text);
        A01((float) A022.A09.A00);
    }

    public final void CLf(C25812DsR dsR) {
    }

    public final void CLg(C25812DsR dsR) {
    }

    public final void CLh(C25812DsR dsR) {
    }

    public final void CLi(C25812DsR dsR) {
        C04220Ms.A0B(dsR, 0);
        A01((float) dsR.A09.A00);
    }

    private final void A00() {
        View view = this.A01;
        view.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setVisibility(4);
        view.setTranslationY(this.A05);
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            C04220Ms.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
    }

    private final void A01(float f) {
        if (this.A03.A09.A00 == 0.0d) {
            A00();
            return;
        }
        View view = this.A01;
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = this.A02;
        if (parent != frameLayout) {
            A00();
            frameLayout.addView(view);
        }
        view.setVisibility(0);
        view.setAlpha(AnonymousClass0hF.A02(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.5f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f));
        view.setTranslationY(AnonymousClass0hF.A02(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, this.A05, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
    }
}
