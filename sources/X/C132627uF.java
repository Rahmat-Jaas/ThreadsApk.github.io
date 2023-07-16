package X;

import android.view.ViewGroup;
import com.fbpay.w3c.CardDetails;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7uF  reason: invalid class name and case insensitive filesystem */
public final class C132627uF implements C33619HrR {
    public final /* synthetic */ CardDetails A00;
    public final /* synthetic */ IgTextView A01;
    public final /* synthetic */ IgImageView A02;
    public final /* synthetic */ AnonymousClass5jC A03;

    public final void C4t(C17828APc aPc) {
    }

    public C132627uF(CardDetails cardDetails, IgTextView igTextView, IgImageView igImageView, AnonymousClass5jC r4) {
        this.A02 = igImageView;
        this.A01 = igTextView;
        this.A03 = r4;
        this.A00 = cardDetails;
    }

    public final void By3() {
        this.A02.setVisibility(8);
        IgTextView igTextView = this.A01;
        ViewGroup.LayoutParams layoutParams = igTextView.getLayoutParams();
        C04220Ms.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(AnonymousClass0wJ.A0B(this.A03).getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal));
        igTextView.setLayoutParams(marginLayoutParams);
        AnonymousClass5jC.A04(this.A00, igTextView, true);
    }
}
