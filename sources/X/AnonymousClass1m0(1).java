package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.1m0  reason: invalid class name */
public final class AnonymousClass1m0 extends ColorFilterAlphaImageView implements C81504nu {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1m0(Context context, View.OnClickListener onClickListener, Integer num, Integer num2, int i) {
        super(context);
        int i2;
        int i3;
        C04220Ms.A0B(context, 1);
        int intValue = num.intValue();
        Integer num3 = AnonymousClass006.A00;
        if (intValue != 0) {
            i2 = R.drawable.instagram_more_horizontal_pano_outline_24;
            if (num2 == num3) {
                i2 = 0;
            }
        } else {
            i2 = R.drawable.instagram_x_pano_outline_24;
            if (num2 == num3) {
                i2 = R.drawable.instagram_x_pano_outline_12;
            }
        }
        C18210wN.A0y(this);
        Resources resources = context.getResources();
        if (intValue != 0) {
            i3 = 2131830410;
        } else {
            i3 = 2131823054;
        }
        setContentDescription(resources.getString(i3));
        if (i2 != 0) {
            setImageResource(i2);
            int color = context.getColor(i);
            A03(color, color);
            int A01 = C18240wQ.A01(context, 10);
            C09860go.A0b(this, A01, A01);
            setOnClickListener(onClickListener);
        }
    }
}
