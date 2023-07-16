package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.VideoView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.13q  reason: invalid class name and case insensitive filesystem */
public final class C202313q extends M5O {
    public final Context A00;
    public final Drawable A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final VideoView A06;
    public final IgLinearLayout A07;
    public final IgTextView A08;
    public final IgTextView A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final IgTextView A0C;
    public final IgTextView A0D;
    public final IgImageView A0E;
    public final GradientSpinnerAvatarView A0F;

    public C202313q(View view) {
        super(view);
        Context A0A2 = C18190wL.A0A(view);
        this.A00 = A0A2;
        this.A05 = view;
        this.A03 = AnonymousClass0wJ.A0K(view, R.id.row_comment_indent);
        this.A02 = AnonymousClass0wJ.A0K(view, R.id.row_comment_text_container);
        this.A08 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_comment);
        this.A0D = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_time_ago);
        this.A0C = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_reply_button);
        this.A09 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_like_button);
        this.A0B = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_reaction_count);
        this.A0F = (GradientSpinnerAvatarView) AnonymousClass0wJ.A0J(view, R.id.row_comment_imageview);
        this.A07 = (IgLinearLayout) AnonymousClass0wJ.A0J(view, R.id.row_comment_container);
        this.A0A = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.row_comment_textview_posting_to_facebook_text);
        this.A01 = A0A2.getDrawable(R.drawable.avatar_bottom_badge);
        this.A0E = (IgImageView) AnonymousClass0wJ.A0J(view, R.id.media_thumbnail_image);
        this.A06 = (VideoView) AnonymousClass0wJ.A0J(view, R.id.media_thumbnail_video);
        this.A04 = AnonymousClass0wJ.A0K(view, R.id.media_unsupported_message_container);
        Drawable[] compoundDrawables = AnonymousClass0wJ.A0L(view, R.id.media_unsupported_message).getCompoundDrawables();
        C04220Ms.A06(compoundDrawables);
        for (Drawable colorFilter : AnonymousClass8AP.A0A(compoundDrawables)) {
            colorFilter.setColorFilter(new PorterDuffColorFilter(this.A00.getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color), PorterDuff.Mode.SRC_IN));
        }
    }
}
