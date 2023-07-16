package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.13p  reason: invalid class name and case insensitive filesystem */
public final class C202213p extends M5O {
    public final Context A00;
    public final Drawable A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final GradientSpinnerAvatarView A06;
    public final RoundedCornerMediaFrameLayout A07;
    public final View A08;
    public final View A09;
    public final IgTextView A0A;
    public final IgTextView A0B;

    public C202213p(View view) {
        super(view);
        Context A0A2 = C18190wL.A0A(view);
        this.A00 = A0A2;
        View A0K = AnonymousClass0wJ.A0K(view, R.id.row_comment_indent);
        this.A08 = A0K;
        this.A02 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_comment);
        IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_time_ago);
        this.A0B = igTextView;
        IgTextView igTextView2 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_reply_button);
        this.A0A = igTextView2;
        this.A03 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_like_button);
        this.A04 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_reaction_count);
        this.A06 = (GradientSpinnerAvatarView) AnonymousClass0wJ.A0J(view, R.id.row_comment_imageview);
        this.A07 = (RoundedCornerMediaFrameLayout) AnonymousClass0wJ.A0J(view, R.id.row_caption_thumbnail_container);
        this.A05 = (IgImageView) AnonymousClass0wJ.A0J(view, R.id.row_caption_thumbnail_image);
        View A0K2 = AnonymousClass0wJ.A0K(view, R.id.row_divider);
        this.A09 = A0K2;
        this.A01 = A0A2.getDrawable(R.drawable.avatar_bottom_badge);
        A0K.setVisibility(8);
        igTextView.setVisibility(8);
        igTextView2.setVisibility(8);
        A0K2.setVisibility(0);
    }
}
