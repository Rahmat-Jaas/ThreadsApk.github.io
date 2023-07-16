package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.3DG  reason: invalid class name */
public final class AnonymousClass3DG {
    public final Drawable A00;
    public final Drawable A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final IgdsButton A08;

    public AnonymousClass3DG(Context context, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, CircularImageView circularImageView, IgdsButton igdsButton) {
        AnonymousClass0wJ.A1Q(circularImageView, textView);
        C18180wK.A1R(textView2, imageView);
        C18210wN.A1M(textView3, 6, igdsButton);
        this.A07 = circularImageView;
        this.A06 = textView;
        this.A05 = textView2;
        this.A03 = imageView;
        this.A04 = textView3;
        this.A02 = view;
        this.A08 = igdsButton;
        Drawable drawable = context.getDrawable(R.drawable.instagram_payments_icons_radio);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            C04220Ms.A06(mutate);
            this.A00 = mutate;
            C63393hP.A03(context, mutate, R.color.blue_5);
            Drawable drawable2 = context.getDrawable(R.drawable.unchecked);
            if (drawable2 != null) {
                Drawable mutate2 = drawable2.mutate();
                C04220Ms.A06(mutate2);
                this.A01 = mutate2;
                C63393hP.A03(context, mutate2, R.color.grey_3);
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
