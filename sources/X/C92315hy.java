package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebookpay.form.view.BaseAutoCompleteTextView;
import com.instagram.barcelona.R;

/* renamed from: X.5hy  reason: invalid class name and case insensitive filesystem */
public final class C92315hy extends C93675qs implements C143538gu {
    public C91975hO A00;
    public final View.OnClickListener A01 = C86134wK.A0P(this, 19);
    public final C143158gC A02 = C86114wI.A0Q(this, 66);

    /* access modifiers changed from: private */
    public String getExistingLabel() {
        C91975hO r0 = this.A00;
        int i = r0.A01;
        if (i != 0) {
            return getContext().getString(i);
        }
        return r0.A03;
    }

    public void setViewModel(C91975hO r8) {
        this.A00 = r8;
        this.A06 = r8.A04;
        setDescendantFocusability(393216);
        BaseAutoCompleteTextView baseAutoCompleteTextView = this.A04;
        View.OnClickListener onClickListener = this.A01;
        baseAutoCompleteTextView.setOnClickListener(onClickListener);
        baseAutoCompleteTextView.setLongClickable(false);
        AnonymousClass7Kz.A0G();
        Context context = getContext();
        Drawable drawable = context.getDrawable(C86104wH.A0G(context, R.attr.fbpay_input_field_right_chevron).resourceId);
        AnonymousClass7Kz.A0G();
        int color = context.getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color);
        C04220Ms.A0B(drawable, 1);
        drawable.setTint(color);
        A0V(drawable, onClickListener, Integer.valueOf(R.dimen.abc_select_dialog_padding_start_material));
        setHint((CharSequence) getExistingLabel());
        setId(this.A00.A03);
        C116836xd.A01(baseAutoCompleteTextView, AnonymousClass006.A0N, (String) null);
        this.A02.setImportantForAccessibility(2);
        baseAutoCompleteTextView.setImportantForAutofill(2);
        baseAutoCompleteTextView.A01 = 0;
        if (this.A00.A04) {
            A0U();
            int A002 = (int) C117006xy.A00(context, R.attr.fbpay_condensed_input_field_vertical_padding);
            int A003 = (int) C117006xy.A00(context, R.attr.fbpay_condensed_input_field_horizontal_padding);
            setPadding(A003, A002, A003, A002);
        }
    }

    public C92315hy(Context context) {
        super(context);
    }

    public final void onAttachedToWindow() {
        int A06 = C14030oh.A06(-1654133525);
        super.onAttachedToWindow();
        this.A00.A05.A0E(this.A02);
        C14030oh.A0D(-387456190, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = C14030oh.A06(1890333737);
        super.onDetachedFromWindow();
        this.A00.A05.A0F(this.A02);
        C14030oh.A0D(786468615, A06);
    }
}
