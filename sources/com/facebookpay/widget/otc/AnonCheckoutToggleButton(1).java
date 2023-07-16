package com.facebookpay.widget.otc;

import X.AnonymousClass006;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass69Q;
import X.AnonymousClass7Fd;
import X.AnonymousClass7IS;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C121047Dv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C78234i6;
import X.C86114wI;
import X.C86124wJ;
import X.C86144wL;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.redex.IDxCListenerShape268S0100000_2_I2;
import com.instagram.barcelona.R;

public final class AnonCheckoutToggleButton extends ConstraintLayout {
    public AnonymousClass0YY A00;
    public final TextView A01;
    public final TextView A02;
    public final SwitchCompat A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonCheckoutToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A00 = C78234i6.A00;
        ConstraintLayout.inflate(context, R.layout.ecp_anon_checkout_toggle, this);
        SwitchCompat switchCompat = (SwitchCompat) AnonymousClass0wJ.A0J(this, R.id.toggle_switch);
        this.A03 = switchCompat;
        TextView textView = (TextView) AnonymousClass0wJ.A0J(this, R.id.title_text);
        this.A02 = textView;
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(this, R.id.description_text);
        this.A01 = textView2;
        AnonymousClass7Fd.A02(textView, AnonymousClass69Q.A0n);
        Resources resources = getResources();
        textView.setTextSize(0, resources.getDimension(R.dimen.auth_edit_field_text_size));
        AnonymousClass7Kz.A0G();
        C18180wK.A0s(context, textView2, R.color.igds_secondary_text);
        textView2.setTextSize(0, resources.getDimension(R.dimen.auth_edit_field_text_size));
        AnonymousClass7Kz.A0G();
        textView2.setLinkTextColor(C18210wN.A01(context));
        textView2.setMovementMethod(new LinkMovementMethod());
        int[][] iArr = {new int[]{-16842912}, new int[]{16842912}};
        AnonymousClass7Kz.A0G();
        int color = context.getColor(R.color.canvas_bottom_sheet_description_text_color);
        AnonymousClass7Kz.A0G();
        int[] iArr2 = {color, context.getColor(R.color.default_cta_dominate_color)};
        AnonymousClass7Kz.A0G();
        int color2 = context.getColor(R.color.igds_separator);
        AnonymousClass7Kz.A0G();
        int[] iArr3 = {color2, context.getColor(R.color.igds_selected_text_background)};
        switchCompat.A0A.setTintList(new ColorStateList(iArr, iArr2));
        switchCompat.A0B.setTintList(new ColorStateList(iArr, iArr3));
        switchCompat.setOnCheckedChangeListener(new IDxCListenerShape268S0100000_2_I2(this, 3));
    }

    public final void setEnableRedesign(boolean z) {
        if (z) {
            Context A0A = C18190wL.A0A(this);
            C121047Dv.A01(A0A, this, AnonymousClass006.A00, (Integer) null, (Integer) null, 24);
            int A022 = C18210wN.A02(A0A);
            int A05 = C86114wI.A05(A0A);
            Integer valueOf = Integer.valueOf(A022);
            Integer valueOf2 = Integer.valueOf(A05);
            AnonymousClass7IS.A02(this, valueOf, valueOf, valueOf2, valueOf2);
            AnonymousClass7IS.A03(this, (Integer) null, (Integer) null, Integer.valueOf(C86124wJ.A09(A0A)), (Integer) null);
            return;
        }
        AnonymousClass7Kz.A0G();
        Context context = getContext();
        Drawable drawable = context.getDrawable(R.drawable.apm_buttons_shimmer_background);
        AnonymousClass7Kz.A0G();
        C86144wL.A19(drawable, this, context.getColor(R.color.igds_elevated_background));
    }

    public final void setOnToggleCheckedListener(AnonymousClass0YY r2) {
        C04220Ms.A0B(r2, 0);
        this.A00 = r2;
    }

    public final TextView getDescriptionTextView() {
        return this.A01;
    }

    public final AnonymousClass0YY getOnToggleCheckedListener() {
        return this.A00;
    }

    public final SwitchCompat getOtcSwitch() {
        return this.A03;
    }

    public final TextView getTitleTextView() {
        return this.A02;
    }

    public final void setToggleOn(boolean z) {
        this.A03.setChecked(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonCheckoutToggleButton(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonCheckoutToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
