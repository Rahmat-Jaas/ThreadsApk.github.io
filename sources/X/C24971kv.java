package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.1kv  reason: invalid class name and case insensitive filesystem */
public final class C24971kv extends AnonymousClass1lO {
    public final Context A00;
    public final C11630kW A01;

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(viewGroup, 0);
        ViewGroup A0I = C18220wO.A0I(LayoutInflater.from(this.A00), viewGroup, R.layout.row_iglive_post_live_action, false);
        A0I.setTag(new C200813b(A0I));
        Object tag = A0I.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.video.live.ui.postlive.IgLivePostLiveSheetMultiAvatarViewBinder.Holder");
        return (M5O) tag;
    }

    public final Class modelClass() {
        return AnonymousClass48O.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass48O r8 = (AnonymousClass48O) mfV;
        C200813b r9 = (C200813b) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r8, r9);
        Context context = this.A00;
        C11630kW r4 = this.A01;
        IgTextView igTextView = r9.A00;
        igTextView.setTypeface((Typeface) null, A1Y ? 1 : 0);
        igTextView.setText(r8.A00);
        ImageUrl imageUrl = r8.A02;
        CircularImageView circularImageView = r9.A01;
        if (imageUrl != null) {
            circularImageView.setVisibility(8);
            StackedAvatarView stackedAvatarView = (StackedAvatarView) C18230wP.A0G(r9.A02);
            stackedAvatarView.setUrls(r8.A01, imageUrl, r4);
            stackedAvatarView.setVisibility(A1Y);
            return;
        }
        circularImageView.setUrl(r8.A01, r4);
        context.getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        circularImageView.invalidate();
        circularImageView.setVisibility(A1Y);
        C19577Ayd ayd = r9.A02;
        if (ayd.A0A()) {
            C18230wP.A0G(ayd).setVisibility(8);
        }
    }

    public C24971kv(Context context, C11630kW r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
