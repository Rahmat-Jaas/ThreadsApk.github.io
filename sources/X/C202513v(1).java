package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.13v  reason: invalid class name and case insensitive filesystem */
public final class C202513v extends M5O {
    public TextView A00;
    public TextView A01;
    public ViewGroup A02;
    public C310724c A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final IgImageView A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;

    public static void A00(C310724c r4, C202513v r5) {
        ViewGroup A002 = C36342Qy.A00(r5.A09, r5.A0A, r5.A02, r5.A03, r4);
        A002.getClass();
        r5.A02 = A002;
        r5.A03 = r4;
        r5.A01 = C18180wK.A0G(A002, R.id.secondary_button);
        r5.A00 = AnonymousClass0wJ.A0L(r5.A02, R.id.primary_button);
    }

    public C202513v(View view) {
        super(view);
        this.A09 = C18220wO.A0J(view, R.id.megaphone_content);
        ImageView A0J = C18200wM.A0J(view, R.id.dismiss_button);
        this.A04 = A0J;
        Drawable drawable = A0J.getDrawable();
        drawable.getClass();
        C63393hP.A03(view.getContext(), drawable.mutate(), R.color.grey_5);
        this.A07 = AnonymousClass0wJ.A0L(view, R.id.title);
        this.A05 = AnonymousClass0wJ.A0L(view, R.id.message);
        this.A08 = C18250wR.A0M(view, R.id.megaphone_icon);
        this.A06 = AnonymousClass0wJ.A0L(view, R.id.megaphone_social_context_text);
        this.A0A = C18220wO.A0J(view, R.id.button_placeholder);
        A00(C310724c.TWO_BUTTON_HORIZONTAL, this);
    }
}
