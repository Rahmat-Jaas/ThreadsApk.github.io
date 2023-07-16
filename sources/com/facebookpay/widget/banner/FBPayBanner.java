package com.facebookpay.widget.banner;

import X.AnonymousClass0A5;
import X.AnonymousClass0wJ;
import X.AnonymousClass69Q;
import X.AnonymousClass7Fd;
import X.AnonymousClass7Fe;
import X.AnonymousClass7Kz;
import X.AnonymousClass86W;
import X.C04220Ms;
import X.C86024w9;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebookpay.widget.accessibility.AccessibleTextView;
import com.instagram.barcelona.R;

public final class FBPayBanner extends ConstraintLayout {
    public static final /* synthetic */ AnonymousClass0A5[] A07;
    public ImageView A00;
    public TextView A01;
    public AccessibleTextView A02;
    public final C86024w9 A03;
    public final C86024w9 A04;
    public final C86024w9 A05;
    public final C86024w9 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A04 = AnonymousClass86W.A01(this, 0);
        this.A05 = AnonymousClass86W.A01(this, 1);
        this.A06 = AnonymousClass86W.A01(this, 2);
        this.A03 = AnonymousClass86W.A01(this, 3);
        ConstraintLayout.inflate(context, R.layout.fbpay_banner, this);
        this.A00 = (ImageView) AnonymousClass0wJ.A0J(this, R.id.icon);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(this, R.id.primary_text);
        this.A02 = (AccessibleTextView) AnonymousClass0wJ.A0J(this, R.id.secondary_text);
        TextView textView = this.A01;
        String str = "primaryTextView";
        if (textView != null) {
            AnonymousClass7Kz.A0G();
            AnonymousClass7Fe.A01(textView, R.style.FbpayBannerPrimaryTextStyle);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                AnonymousClass7Fd.A02(textView2, AnonymousClass69Q.A07);
                AccessibleTextView accessibleTextView = this.A02;
                str = "secondaryTextView";
                if (accessibleTextView != null) {
                    AnonymousClass7Fd.A02(accessibleTextView, AnonymousClass69Q.A08);
                    AccessibleTextView accessibleTextView2 = this.A02;
                    if (accessibleTextView2 != null) {
                        accessibleTextView2.setMovementMethod(new LinkMovementMethod());
                        AnonymousClass7Kz.A0G();
                        Context context2 = getContext();
                        Drawable drawable = context2.getDrawable(R.drawable.apm_buttons_shimmer_background);
                        AnonymousClass7Kz.A0G();
                        C86144wL.A19(drawable, this, context2.getColor(R.color.igds_elevated_background));
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    static {
        Class<FBPayBanner> cls = FBPayBanner.class;
        A07 = new AnonymousClass0A5[]{C86134wK.A0x(cls, "primaryText", "getPrimaryText()Ljava/lang/CharSequence;"), C86134wK.A0x(cls, "secondaryText", "getSecondaryText()Ljava/lang/CharSequence;"), C86134wK.A0x(cls, "secondaryTextClickHint", "getSecondaryTextClickHint()Ljava/lang/String;"), C86134wK.A0x(cls, "icon", "getIcon()Landroid/graphics/drawable/Drawable;")};
    }

    public final Drawable getIcon() {
        return (Drawable) C86114wI.A0i(this, this.A03, A07, 3);
    }

    public final CharSequence getPrimaryText() {
        return (CharSequence) C86114wI.A0i(this, this.A04, A07, 0);
    }

    public final CharSequence getSecondaryText() {
        return (CharSequence) C86114wI.A0i(this, this.A05, A07, 1);
    }

    public final String getSecondaryTextClickHint() {
        return (String) C86114wI.A0i(this, this.A06, A07, 2);
    }

    public final void setIcon(Drawable drawable) {
        C86114wI.A1L(this, drawable, this.A03, A07, 3);
    }

    public final void setPrimaryText(CharSequence charSequence) {
        C86114wI.A1L(this, charSequence, this.A04, A07, 0);
    }

    public final void setSecondaryText(CharSequence charSequence) {
        C86114wI.A1L(this, charSequence, this.A05, A07, 1);
    }

    public final void setSecondaryTextClickHint(String str) {
        C86114wI.A1L(this, str, this.A06, A07, 2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
