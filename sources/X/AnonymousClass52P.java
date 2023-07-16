package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.52P  reason: invalid class name */
public final class AnonymousClass52P extends L7m {
    public AnonymousClass52P(Context context) {
        super(context, (AttributeSet) null, R.attr.seekBarStyle);
    }

    public final void A00(List list) {
        setBackground((Drawable) null);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18200wM.A1U(A0v, Color.parseColor(AnonymousClass00U.A0L("#", C18180wK.A0k(it))));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, AnonymousClass00J.A0m(A0v));
        gradientDrawable.setCornerRadius(100.0f);
        setProgressDrawable(gradientDrawable);
        setThumbOffset(20);
    }
}
