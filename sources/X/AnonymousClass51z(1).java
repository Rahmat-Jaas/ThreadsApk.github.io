package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.instagram.barcelona.R;

/* renamed from: X.51z  reason: invalid class name */
public final class AnonymousClass51z extends ProgressBar {
    public Drawable A00;
    public GradientDrawable A01;
    public RotateDrawable A02;
    public ViewPropertyAnimator A03;

    public final void setIcon(AnonymousClass697 r5) {
        C04220Ms.A0B(r5, 0);
        setIconFromDrawable(AnonymousClass7Kz.A0G().A04(getContext(), r5.A00, r5.A01));
    }

    public final void A00(int i) {
        RotateDrawable rotateDrawable = this.A02;
        if (rotateDrawable == null) {
            C04220Ms.A0E("layerSpinnerRingDrawable");
            throw null;
        }
        Drawable drawable = rotateDrawable.getDrawable();
        if (drawable != null) {
            drawable.setTint(AnonymousClass7Kz.A0G().A03(getContext(), i));
        }
    }

    public final void setCircleColor(int i) {
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable == null) {
            C04220Ms.A0E("layerCircleDrawable");
            throw null;
        } else {
            gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), AnonymousClass7Kz.A0G().A03(getContext(), i));
        }
    }

    public final void setCircleColorRaw(int i) {
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable == null) {
            C04220Ms.A0E("layerCircleDrawable");
            throw null;
        } else {
            gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), i);
        }
    }

    public AnonymousClass51z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setIndeterminate(true);
        Resources resources = getResources();
        setIndeterminateDrawable(resources.getDrawable(R.drawable.fbpay_widget_pay_spinner, getContext().getTheme()));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        C04220Ms.A0C(indeterminateDrawable, AnonymousClass000.A00(7));
        LayerDrawable layerDrawable = (LayerDrawable) indeterminateDrawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.layer_item_circle);
        C04220Ms.A0C(findDrawableByLayerId, C28174Ezk.A00(0));
        this.A01 = (GradientDrawable) findDrawableByLayerId;
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.layer_item_spinner);
        C04220Ms.A0C(findDrawableByLayerId2, "null cannot be cast to non-null type android.graphics.drawable.RotateDrawable");
        this.A02 = (RotateDrawable) findDrawableByLayerId2;
        Drawable findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(R.id.layer_item_icon);
        C04220Ms.A0C(findDrawableByLayerId3, AnonymousClass000.A00(32));
        this.A00 = findDrawableByLayerId3;
        setCircleColor(20);
        setIcon(AnonymousClass697.PROGRESS_SPINNER_PRIVACY_LOCK_SMALL);
        A00(16);
        AnonymousClass7Fe.A02(this, 4);
    }

    private final void setIconFromDrawable(Drawable drawable) {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        C04220Ms.A0C(indeterminateDrawable, AnonymousClass000.A00(7));
        ((LayerDrawable) indeterminateDrawable).setDrawableByLayerId(R.id.layer_item_icon, drawable);
        if (drawable instanceof Animatable) {
            getRootView().post(new C135387zN(this));
        }
    }

    public final ViewPropertyAnimator animate() {
        ViewPropertyAnimator animate = super.animate();
        this.A03 = animate;
        C04220Ms.A06(animate);
        return animate;
    }

    public final void setIcon(int i) {
        Drawable drawable = getResources().getDrawable(i, getContext().getTheme());
        C04220Ms.A06(drawable);
        setIconFromDrawable(drawable);
    }
}
