package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxTListenerShape94S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;

/* renamed from: X.1kt  reason: invalid class name and case insensitive filesystem */
public final class C24951kt extends AnonymousClass1lO {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(viewGroup, 0);
        ViewGroup A0I = C18220wO.A0I(LayoutInflater.from(this.A00), viewGroup, R.layout.row_iglive_post_live_action, false);
        A0I.setTag(new C201313g(A0I));
        Object tag = A0I.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.video.live.ui.postlive.IgLivePostLiveSheetActionRowViewBinder.Holder");
        return (M5O) tag;
    }

    public final Class modelClass() {
        return AnonymousClass48R.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        CircularImageView circularImageView;
        AnonymousClass48R r11 = (AnonymousClass48R) mfV;
        C201313g r12 = (C201313g) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r12);
        Context context = this.A00;
        UserSession userSession = this.A01;
        IgTextView igTextView = r12.A03;
        String str = r11.A06;
        CharSequence charSequence = str;
        if (str == null) {
            charSequence = r11.A00;
        }
        igTextView.setText(charSequence);
        Typeface typeface = r11.A01;
        if (typeface != null) {
            igTextView.setTypeface(typeface);
        }
        View view = r12.A00;
        view.setContentDescription(str);
        if (r11.A08) {
            igTextView.setTypeface(Typeface.DEFAULT);
            circularImageView = r12.A04;
            circularImageView.setImageDrawable(r11.A03);
        } else {
            circularImageView = r12.A04;
            Drawable mutate = r11.A03.mutate();
            boolean z = r11.A0A;
            int i = R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color;
            if (z) {
                i = R.color.igds_error_or_destructive;
            }
            C63393hP.A03(context, mutate, i);
            circularImageView.setImageDrawable(mutate);
            circularImageView.A0F(A1Z ? 1 : 0, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        }
        Drawable drawable = r11.A02;
        if (drawable != null) {
            ImageView imageView = r12.A01;
            Drawable mutate2 = drawable.mutate();
            C63393hP.A03(context, mutate2, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color);
            imageView.setImageDrawable(mutate2);
            imageView.setVisibility(0);
        }
        boolean z2 = r11.A09;
        float f = 1.0f;
        float f2 = 0.5f;
        if (z2) {
            f2 = 1.0f;
        }
        igTextView.setAlpha(f2);
        if (!z2) {
            f = 0.5f;
        }
        circularImageView.setAlpha(f);
        IgTextView igTextView2 = r12.A02;
        if (igTextView2.isEnabled()) {
            String str2 = r11.A05;
            if (str2 != null) {
                igTextView2.setVisibility(0);
            } else {
                str2 = null;
            }
            igTextView2.setText(str2);
        } else {
            igTextView2.setText(context.getText(2131832694));
            igTextView2.setVisibility(0);
        }
        if (r11.A07) {
            IgSwitch igSwitch = r12.A05;
            igSwitch.setVisibility(0);
            igSwitch.A07 = new IDxTListenerShape94S0300000_1_I2(4, context, userSession, r12);
        }
        AnonymousClass0wJ.A17(view, 355, r11);
        C18210wN.A0y(view);
    }

    public C24951kt(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
