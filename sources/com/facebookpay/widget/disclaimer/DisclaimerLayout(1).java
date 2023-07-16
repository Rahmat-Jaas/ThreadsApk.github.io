package com.facebookpay.widget.disclaimer;

import X.AnonymousClass006;
import X.AnonymousClass0A5;
import X.AnonymousClass0wJ;
import X.AnonymousClass69Q;
import X.AnonymousClass7Fe;
import X.AnonymousClass7Kz;
import X.AnonymousClass86W;
import X.C04220Ms;
import X.C121097Ec;
import X.C30111zq;
import X.C86024w9;
import X.C86114wI;
import X.C86134wK;
import X.D57;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.widget.accessibility.AccessibleTextView;
import com.instagram.barcelona.R;
import kotlin.properties.IDxOPropertyShape881S0100000_2_I2;

public final class DisclaimerLayout extends LinearLayout {
    public static final /* synthetic */ AnonymousClass0A5[] A0A;
    public View A00;
    public ShimmerFrameLayout A01;
    public ShimmerFrameLayout A02;
    public ShimmerFrameLayout A03;
    public ShimmerFrameLayout A04;
    public AccessibleTextView A05;
    public final C86024w9 A06;
    public final C86024w9 A07;
    public final C86024w9 A08;
    public final C86024w9 A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclaimerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A08 = AnonymousClass86W.A01(this, 24);
        this.A07 = AnonymousClass86W.A01(this, 25);
        AnonymousClass69Q r1 = AnonymousClass69Q.A0z;
        this.A09 = new IDxOPropertyShape881S0100000_2_I2(26, this, r1);
        this.A06 = new IDxOPropertyShape881S0100000_2_I2(27, this, C30111zq.DISCLAIMER_PUX);
        View inflate = LinearLayout.inflate(context, R.layout.fbpay_ui_disclaimer, this);
        C04220Ms.A06(inflate);
        this.A00 = inflate;
        ((LinearLayout) inflate).setOrientation(1);
        setPrimaryTextView((AccessibleTextView) AnonymousClass0wJ.A0I(this, R.id.disclaimer_ui_primary_text));
        this.A01 = (ShimmerFrameLayout) AnonymousClass0wJ.A0I(this, R.id.disclaimer_ui_shimmer_view_1);
        this.A02 = (ShimmerFrameLayout) AnonymousClass0wJ.A0I(this, R.id.disclaimer_ui_shimmer_view_2);
        this.A03 = (ShimmerFrameLayout) AnonymousClass0wJ.A0I(this, R.id.disclaimer_ui_shimmer_view_3);
        this.A04 = (ShimmerFrameLayout) AnonymousClass0wJ.A0I(this, R.id.disclaimer_ui_shimmer_view_4);
        setPrimaryTextStyle(r1);
        AnonymousClass7Fe.A02(this, 2);
        ShimmerFrameLayout shimmerFrameLayout = this.A01;
        if (shimmerFrameLayout != null) {
            AnonymousClass7Fe.A01(shimmerFrameLayout, 2131886574);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
            if (shimmerFrameLayout2 != null) {
                AnonymousClass7Fe.A01(shimmerFrameLayout2, 2131886574);
                ShimmerFrameLayout shimmerFrameLayout3 = this.A03;
                if (shimmerFrameLayout3 != null) {
                    AnonymousClass7Fe.A01(shimmerFrameLayout3, 2131886574);
                    ShimmerFrameLayout shimmerFrameLayout4 = this.A04;
                    if (shimmerFrameLayout4 != null) {
                        AnonymousClass7Fe.A01(shimmerFrameLayout4, 2131886574);
                        ShimmerFrameLayout shimmerFrameLayout5 = this.A01;
                        if (shimmerFrameLayout5 != null) {
                            AnonymousClass7Kz.A0G();
                            Context context2 = getContext();
                            Drawable drawable = context2.getDrawable(R.drawable.fbpay_shimmer_background);
                            C121097Ec.A00(context2, drawable, AnonymousClass7Kz.A0G(), 15);
                            shimmerFrameLayout5.setBackground(drawable);
                            ShimmerFrameLayout shimmerFrameLayout6 = this.A02;
                            if (shimmerFrameLayout6 != null) {
                                AnonymousClass7Kz.A0G();
                                Drawable drawable2 = context2.getDrawable(R.drawable.fbpay_shimmer_background);
                                C121097Ec.A00(context2, drawable2, AnonymousClass7Kz.A0G(), 15);
                                shimmerFrameLayout6.setBackground(drawable2);
                                ShimmerFrameLayout shimmerFrameLayout7 = this.A03;
                                if (shimmerFrameLayout7 != null) {
                                    AnonymousClass7Kz.A0G();
                                    Drawable drawable3 = context2.getDrawable(R.drawable.fbpay_shimmer_background);
                                    C121097Ec.A00(context2, drawable3, AnonymousClass7Kz.A0G(), 15);
                                    shimmerFrameLayout7.setBackground(drawable3);
                                    ShimmerFrameLayout shimmerFrameLayout8 = this.A04;
                                    if (shimmerFrameLayout8 != null) {
                                        AnonymousClass7Kz.A0G();
                                        Drawable drawable4 = context2.getDrawable(R.drawable.fbpay_shimmer_background);
                                        C121097Ec.A00(context2, drawable4, AnonymousClass7Kz.A0G(), 15);
                                        shimmerFrameLayout8.setBackground(drawable4);
                                        ShimmerFrameLayout shimmerFrameLayout9 = this.A01;
                                        if (shimmerFrameLayout9 != null) {
                                            D57.A00(shimmerFrameLayout9, AnonymousClass006.A0Y);
                                            ShimmerFrameLayout shimmerFrameLayout10 = this.A02;
                                            if (shimmerFrameLayout10 != null) {
                                                Integer num = AnonymousClass006.A0C;
                                                D57.A00(shimmerFrameLayout10, num);
                                                ShimmerFrameLayout shimmerFrameLayout11 = this.A03;
                                                if (shimmerFrameLayout11 != null) {
                                                    D57.A00(shimmerFrameLayout11, num);
                                                    ShimmerFrameLayout shimmerFrameLayout12 = this.A04;
                                                    if (shimmerFrameLayout12 != null) {
                                                        D57.A00(shimmerFrameLayout12, AnonymousClass006.A00);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C04220Ms.A0E("shimmerRow4");
                    throw null;
                }
                C04220Ms.A0E("shimmerRow3");
                throw null;
            }
            C04220Ms.A0E("shimmerRow2");
            throw null;
        }
        C04220Ms.A0E("shimmerRow1");
        throw null;
    }

    public final void setDisclaimerType(C30111zq r4) {
        C04220Ms.A0B(r4, 0);
        C86114wI.A1L(this, r4, this.A06, A0A, 3);
    }

    public final void setPrimaryTextStyle(AnonymousClass69Q r4) {
        C04220Ms.A0B(r4, 0);
        C86114wI.A1L(this, r4, this.A09, A0A, 2);
    }

    public final void setPrimaryTextView(AccessibleTextView accessibleTextView) {
        C04220Ms.A0B(accessibleTextView, 0);
        this.A05 = accessibleTextView;
    }

    static {
        Class<DisclaimerLayout> cls = DisclaimerLayout.class;
        A0A = new AnonymousClass0A5[]{C86134wK.A0x(cls, "primaryText", "getPrimaryText()Ljava/lang/String;"), C86134wK.A0x(cls, "primaryLinkableText", "getPrimaryLinkableText()Ljava/lang/CharSequence;"), C86134wK.A0x(cls, "primaryTextStyle", "getPrimaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), C86134wK.A0x(cls, "disclaimerType", "getDisclaimerType()Lcom/facebookpay/widget/disclaimer/DisclaimerWidgetStyleType;")};
    }

    public final C30111zq getDisclaimerType() {
        return (C30111zq) C86114wI.A0i(this, this.A06, A0A, 3);
    }

    public final CharSequence getPrimaryLinkableText() {
        return (CharSequence) C86114wI.A0i(this, this.A07, A0A, 1);
    }

    public final String getPrimaryText() {
        return (String) C86114wI.A0i(this, this.A08, A0A, 0);
    }

    public final AnonymousClass69Q getPrimaryTextStyle() {
        return (AnonymousClass69Q) C86114wI.A0i(this, this.A09, A0A, 2);
    }

    public final AccessibleTextView getPrimaryTextView() {
        AccessibleTextView accessibleTextView = this.A05;
        if (accessibleTextView != null) {
            return accessibleTextView;
        }
        C04220Ms.A0E("primaryTextView");
        throw null;
    }

    public final void setPrimaryLinkableText(CharSequence charSequence) {
        C86114wI.A1L(this, charSequence, this.A07, A0A, 1);
    }

    public final void setPrimaryText(String str) {
        C86114wI.A1L(this, str, this.A08, A0A, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DisclaimerLayout(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DisclaimerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
