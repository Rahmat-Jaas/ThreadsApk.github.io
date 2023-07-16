package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.facebook.redex.IDxObjectShape170S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayDeque;

/* renamed from: X.4AC  reason: invalid class name */
public final class AnonymousClass4AC implements C144658ir {
    public int A00 = 2;
    public IgEditText A01;
    public IgLinearLayout A02;
    public IgTextView A03;
    public C61723Vc A04;
    public String A05;
    public String A06;
    public IgLinearLayout A07;
    public IgSimpleImageView A08;
    public IgTextView A09;
    public GradientSpinnerAvatarView A0A;
    public final Context A0B;
    public final AnonymousClass1dM A0C;
    public final View A0D;
    public final C84464tB A0E;

    public AnonymousClass4AC(Context context, View view, AnonymousClass1dM r8) {
        C04220Ms.A0B(context, 1);
        this.A0B = context;
        this.A0D = view;
        this.A0C = r8;
        C84464tB A012 = C25711DqZ.A01(r8, false, false);
        this.A0E = A012;
        A012.A6s(this);
        A012.CLs(r8.requireActivity());
        View A0K = AnonymousClass0wJ.A0K(view, R.id.fb_comment_composer_post_button_container);
        View A0K2 = AnonymousClass0wJ.A0K(view, R.id.fb_comment_composer_post_text);
        this.A01 = (IgEditText) AnonymousClass0wJ.A0J(view, R.id.fb_comment_composer_edit_text);
        this.A0A = (GradientSpinnerAvatarView) AnonymousClass0wJ.A0J(view, R.id.fb_comment_composer_author_profile_picture);
        this.A09 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.layout_fb_composer_identity_disclaimer_text);
        this.A03 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.layout_fb_composer_reply_disclaimer_text);
        this.A07 = (IgLinearLayout) AnonymousClass0wJ.A0J(view, R.id.layout_fb_composer_identity_disclaimer_container);
        this.A02 = (IgLinearLayout) AnonymousClass0wJ.A0J(view, R.id.layout_fb_composer_reply_disclaimer_container);
        this.A08 = (IgSimpleImageView) AnonymousClass0wJ.A0J(view, R.id.layout_fb_composer_reply_disclaimer_dismiss_button);
        AnonymousClass0wJ.A17(A0K, 332, this);
        AnonymousClass0wJ.A17(this.A08, 333, this);
        this.A01.addTextChangedListener(new IDxObjectShape170S0200000_1_I2(7, A0K, A0K2));
    }

    public final void A00(String str, String str2) {
        this.A05 = str;
        this.A06 = str2;
        IgEditText igEditText = this.A01;
        Context context = this.A0B;
        igEditText.setHint(AnonymousClass0wJ.A0l(context, str, 2131827186));
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0A;
        gradientSpinnerAvatarView.A04();
        gradientSpinnerAvatarView.A09(C18250wR.A0K(str2), this.A0C);
        gradientSpinnerAvatarView.setBottomBadgeDrawable(context.getDrawable(R.drawable.avatar_bottom_badge));
        gradientSpinnerAvatarView.A01 = C09860go.A03(context, 2);
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        spannableStringBuilder.append(resources.getString(2131827187));
        AnonymousClass2C8.A00(spannableStringBuilder, str, "{facebook_name}", arrayDeque, new Object[]{new StyleSpan(1)}, 0);
        this.A09.setText(new SpannableString(spannableStringBuilder));
        this.A0D.setVisibility(0);
    }

    public final void C46(int i, boolean z) {
        int i2 = 0;
        IgLinearLayout igLinearLayout = this.A07;
        if (i == 0) {
            i2 = 8;
        }
        igLinearLayout.setVisibility(i2);
    }
}
