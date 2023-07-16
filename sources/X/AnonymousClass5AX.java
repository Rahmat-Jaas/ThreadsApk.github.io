package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.5AX  reason: invalid class name */
public final class AnonymousClass5AX extends C113246qz implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public final float A01;
    public final int A02;
    public final ValueAnimator A03;
    public final View A04;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C04220Ms.A0B(valueAnimator, 0);
        this.A04.setTranslationX(C18240wQ.A00(C86144wL.A0e(valueAnimator)) - ((float) this.A00));
    }

    public AnonymousClass5AX(View view) {
        this.A04 = view;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A03 = valueAnimator;
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_hashtags_notice_padding_horizontal) + (resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) << 1);
        this.A02 = dimensionPixelSize;
        float dimensionPixelSize2 = ((float) resources.getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal)) / 2.0f;
        this.A01 = dimensionPixelSize2;
        view.setTranslationX((((float) dimensionPixelSize) / 2.0f) - dimensionPixelSize2);
        view.setVisibility(0);
        valueAnimator.addUpdateListener(this);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = C14030oh.A03(1182168302);
        this.A00 = Math.max(0, this.A00 + i);
        if (!this.A03.isRunning()) {
            View view = this.A04;
            view.setTranslationX(view.getTranslationX() - ((float) i));
        }
        C14030oh.A0A(1621040581, A032);
    }
}
