package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.13m  reason: invalid class name and case insensitive filesystem */
public final class C201913m extends M5O {
    public final Drawable A00;
    public final Drawable A01;
    public final View A02;
    public final IgLinearLayout A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final /* synthetic */ AnonymousClass111 A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C201913m(View view, AnonymousClass111 r5) {
        super(view);
        this.A08 = r5;
        this.A02 = view;
        this.A03 = (IgLinearLayout) AnonymousClass0wJ.A0I(view, R.id.birthday_effects_audience_item_root);
        this.A04 = (IgSimpleImageView) AnonymousClass0wJ.A0I(view, R.id.birthday_effects_audience_icon);
        this.A07 = (IgTextView) AnonymousClass0wJ.A0I(view, R.id.birthday_effects_audience_title);
        this.A06 = (IgTextView) AnonymousClass0wJ.A0I(view, R.id.birthday_effects_audience_subtitle);
        this.A05 = (IgSimpleImageView) AnonymousClass0wJ.A0I(view, R.id.birthday_effects_audience_radio_button);
        Context context = view.getContext();
        this.A00 = C18200wM.A0D(context);
        this.A01 = C19587Ayn.A01(context, R.drawable.unchecked, context.getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color));
    }
}
