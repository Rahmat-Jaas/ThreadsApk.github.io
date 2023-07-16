package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.facepile.IgFacepile;

/* renamed from: X.13o  reason: invalid class name and case insensitive filesystem */
public final class C202113o extends M5O {
    public ViewGroup A00;
    public TextView A01;
    public TextView A02;
    public String A03;
    public final ViewGroup A04;
    public final ViewGroup A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final IgImageView A0A;
    public final IgFacepile A0B;

    public C202113o(View view) {
        super(view);
        this.A04 = C18240wQ.A0G(view, R.id.megaphone_content);
        ImageView A0J = C18200wM.A0J(view, R.id.dismiss_button);
        this.A06 = A0J;
        C63393hP.A03(view.getContext(), A0J.getDrawable().mutate(), R.color.grey_5);
        this.A09 = C18180wK.A0G(view, R.id.title);
        this.A07 = C18180wK.A0G(view, R.id.message);
        this.A0A = (IgImageView) view.findViewById(R.id.megaphone_icon);
        this.A0B = (IgFacepile) view.findViewById(R.id.megaphone_social_context_facepile);
        this.A08 = C18180wK.A0G(view, R.id.megaphone_social_context_text);
        ViewGroup A0G = C18240wQ.A0G(view, R.id.button_placeholder);
        this.A05 = A0G;
        TextView textView = null;
        ViewGroup A002 = C36342Qy.A00(this.A04, A0G, (ViewGroup) null, (C310724c) null, C310724c.TWO_BUTTON_VERTICAL);
        this.A00 = A002;
        if (A002 != null) {
            this.A01 = C18180wK.A0G(A002, R.id.primary_button);
            textView = C18180wK.A0G(this.A00, R.id.secondary_button);
        } else {
            this.A01 = null;
        }
        this.A02 = textView;
    }
}
