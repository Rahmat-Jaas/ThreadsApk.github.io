package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;
import java.util.List;

/* renamed from: X.0yX  reason: invalid class name and case insensitive filesystem */
public final class C19040yX extends LinearLayout {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02 = ((TextView) AnonymousClass0wJ.A0I(this, R.id.card_suggested_name));
    public final IgSimpleImageView A03;
    public final CircularImageView A04;
    public final FollowButton A05;

    public /* synthetic */ C19040yX(Context context) {
        super(context, (AttributeSet) null, 0);
        setOrientation(1);
        View.inflate(context, R.layout.immersive_suggested_users_layout, this);
        FollowButton followButton = (FollowButton) AnonymousClass0wJ.A0I(this, R.id.card_follow_button);
        this.A05 = followButton;
        followButton.setBackground((Drawable) null);
        TextView textView = (TextView) AnonymousClass0wJ.A0I(this, R.id.card_suggested_subtitle);
        this.A01 = textView;
        this.A00 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.card_suggested_subtitle_stacked_avatar);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AnonymousClass0wJ.A0I(this, R.id.dismiss_button);
        this.A03 = igSimpleImageView;
        this.A04 = (CircularImageView) AnonymousClass0wJ.A0I(this, R.id.card_avatar);
        if (Settings.System.getFloat(context.getContentResolver(), "font_scale", 1.0f) > 1.0f) {
            textView.setMaxLines(1);
        }
        C09860go.A0g(igSimpleImageView, new C09910gw(igSimpleImageView, this));
        post(new AnonymousClass4QI(this));
    }

    public final void setOnDismissClickListener(View.OnClickListener onClickListener) {
        C04220Ms.A0B(onClickListener, 0);
        this.A03.setOnClickListener(onClickListener);
    }

    public final void setStackedAvatar(List list, C11630kW r24) {
        List list2 = list;
        C11630kW r5 = r24;
        boolean A1Z = AnonymousClass0wJ.A1Z(list2, r5);
        this.A01.setGravity(8388611);
        ImageView imageView = this.A00;
        imageView.setVisibility(0);
        Context A0A = C18190wL.A0A(this);
        String A0n = C18230wP.A0n(r5);
        int A012 = C18240wQ.A01(A0A, 18);
        imageView.setImageDrawable(C25131DgP.A00(A0A, (Drawable) null, Float.valueOf(0.6f), AnonymousClass006.A01, (Integer) null, Integer.valueOf(C18240wQ.A01(A0A, A1Z ? 1 : 0)), (Integer) null, Integer.valueOf(R.color.black), (Integer) null, (Integer) null, A0n, list2, A012, false, A1Z, false));
    }

    public final void setSubtitleText(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        this.A01.setText(charSequence);
    }

    public final void setSuggestedUserName(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        this.A02.setText(charSequence);
    }

    public final C25917DvL getFollowButtonHelper() {
        C25917DvL dvL = this.A05.A03;
        C04220Ms.A06(dvL);
        return dvL;
    }

    public final void setShouldShowFollowBack(boolean z) {
        this.A05.A04 = z;
    }

    public final void setAvatarImage(ImageUrl imageUrl, C11630kW r3) {
        AnonymousClass0wJ.A1N(imageUrl, r3);
        this.A04.setUrl(imageUrl, r3);
    }
}
