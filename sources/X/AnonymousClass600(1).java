package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxLListenerShape407S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.Product;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape119S0100000_I2_99;

/* renamed from: X.600  reason: invalid class name */
public final class AnonymousClass600 extends C19819BBt implements C144988jc, C144998jd {
    public IgImageView A00;
    public C144988jc A01;
    public View A02;
    public View A03;
    public C127277gr A04;
    public final Context A05;
    public final Fragment A06;
    public final C127307gu A07;
    public final C04530Oa A08 = AnonymousClass0OY.A02(new KtLambdaShape119S0100000_I2_99(this, 41));
    public final C11630kW A09;
    public final UserSession A0A;

    public AnonymousClass600(Context context, Fragment fragment, C11630kW r5, UserSession userSession, C127307gu r7) {
        C04220Ms.A0B(userSession, 4);
        this.A06 = fragment;
        this.A05 = context;
        this.A09 = r5;
        this.A0A = userSession;
        this.A07 = r7;
    }

    public final void A01(View view, ViewGroup viewGroup, Product product, Integer num) {
        ExtendedImageUrl A032;
        ViewGroup viewGroup2;
        boolean A1Z = AnonymousClass0wJ.A1Z(product, viewGroup);
        if (num.intValue() == 0) {
            UserSession userSession = this.A0A;
            if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36312733011936421L) || !AnonymousClass6VJ.A00(userSession).A05(product)) {
                return;
            }
        }
        if (!(!this.A07.A03.A0G())) {
            this.A02 = view;
            View view2 = this.A03;
            if (view2 == null) {
                view2 = LayoutInflater.from(this.A06.requireContext()).inflate(R.layout.product_thumbnail_popout_image, viewGroup, false);
                this.A00 = (IgImageView) view2.findViewById(R.id.save_popout_imageview);
                C04530Oa r1 = this.A08;
                C09860go.A0Y(view2, AnonymousClass0wJ.A04(r1.getValue()));
                C09860go.A0O(view2, AnonymousClass0wJ.A04(r1.getValue()));
            }
            this.A03 = view2;
            ViewParent parent = view2.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                viewGroup2.removeView(view2);
            }
            viewGroup.addView(view2);
            ImageInfo A012 = product.A01();
            if (A012 != null && (A032 = C122057Ju.A03(C18190wL.A0A(view2), A012, AnonymousClass006.A00)) != null) {
                A00(view2);
                IgImageView igImageView = this.A00;
                if (igImageView != null) {
                    igImageView.A0F = new IDxLListenerShape407S0100000_2_I2(this, A1Z ? 1 : 0);
                    igImageView.setUrl(A032, this.A09);
                }
            }
        }
    }

    public final void onDestroy() {
        this.A02 = null;
        this.A00 = null;
    }

    private final void A00(View view) {
        View view2 = this.A02;
        if (view2 != null) {
            view.setX(view2.getX() + C86134wK.A01(view2.getWidth() - AnonymousClass0wJ.A04(this.A08.getValue())));
            view.setY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            view.setScaleX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            view.setScaleY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    public final void Bki(float f, boolean z) {
        if (z) {
            View view = this.A03;
            if (view != null) {
                view.setScaleX(f);
            }
            View view2 = this.A03;
            if (view2 != null) {
                view2.setScaleY(f);
                return;
            }
            return;
        }
        float f2 = (f / 2.0f) + 0.5f;
        View view3 = this.A03;
        if (view3 != null) {
            view3.setScaleX(f2);
        }
        View view4 = this.A03;
        if (view4 != null) {
            view4.setScaleY(f2);
        }
        View view5 = this.A03;
        if (view5 != null) {
            view5.setY(view5.getY() - ((1.0f - f) * ((float) view5.getHeight())));
        }
    }

    public final void CBb(int i) {
        View view = this.A02;
        if (view != null) {
            C127277gr r3 = new C127277gr(view);
            C25812DsR dsR = r3.A00;
            dsR.A0E(r3);
            dsR.A08();
            dsR.A09(1.0d);
            dsR.A0A(1.25d);
            this.A04 = r3;
        }
        C144988jc r0 = this.A01;
        if (r0 != null) {
            r0.CBb(i);
        }
    }

    public final void onPause() {
        C127307gu r1 = this.A07;
        r1.A01((C144998jd) null);
        r1.A04.clear();
        C127277gr r12 = this.A04;
        if (r12 != null) {
            C25812DsR dsR = r12.A00;
            dsR.A0F(r12);
            dsR.A08();
        }
        View view = this.A03;
        if (view != null) {
            A00(view);
        }
    }

    public final void onResume() {
        C127307gu r2 = this.A07;
        r2.A01(this);
        r2.A04.add(this);
        C25812DsR dsR = r2.A03;
        if (!dsR.A0G()) {
            r2.CLi(dsR);
        }
        C127277gr r1 = this.A04;
        if (r1 != null) {
            C25812DsR dsR2 = r1.A00;
            dsR2.A0E(r1);
            dsR2.A08();
        }
    }
}
