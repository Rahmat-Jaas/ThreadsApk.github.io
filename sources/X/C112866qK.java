package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.instagram.barcelona.R;
import java.util.Arrays;

/* renamed from: X.6qK  reason: invalid class name and case insensitive filesystem */
public final class C112866qK {
    public float[] A00 = new float[8];
    public final float A01;
    public final float A02;
    public final Context A03;
    public final View A04;

    public C112866qK(Context context, View view) {
        C04220Ms.A0B(view, 2);
        this.A03 = context;
        this.A04 = view;
        this.A01 = (float) context.getResources().getDimensionPixelSize(R.dimen.audience_controls_footer_button_radius);
        this.A02 = (float) C18210wN.A02(context);
    }

    public final void A00(int i) {
        float[] fArr = this.A00;
        Arrays.fill(fArr, 0, 4, this.A02 * ((float) Math.min(Math.max((double) (((float) i) / this.A01), 0.0d), 1.0d)));
        Drawable background = this.A04.getBackground();
        C04220Ms.A0C(background, C28174Ezk.A00(0));
        ((GradientDrawable) background).setCornerRadii(fArr);
    }
}
