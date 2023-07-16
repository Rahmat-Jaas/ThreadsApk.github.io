package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape270S0200000_2_I2;
import com.instagram.barcelona.R;

/* renamed from: X.51u  reason: invalid class name */
public class AnonymousClass51u extends LinearLayout implements C143538gu {
    public ImageView A00;
    public TextView A01;
    public C91985hP A02;
    public final C143158gC A03 = C86114wI.A0Q(this, 65);

    public void setViewModel(C91985hP r9) {
        int paddingTop;
        int paddingBottom;
        Integer num;
        this.A02 = r9;
        TextView textView = this.A01;
        Context context = getContext();
        String str = r9.A07;
        int i = r9.A03;
        if (i != 0) {
            str = context.getString(i);
        }
        str.getClass();
        int i2 = 0;
        textView.setText(C99186Il.A00(context, r9.A06, str).A00(new IDxCListenerShape270S0200000_2_I2(1, context, r9), false));
        textView.setMovementMethod(new LinkMovementMethod());
        boolean z = this instanceof C92065hY;
        if (z) {
            TextView textView2 = this.A01;
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            C04220Ms.A0C(layoutParams, C28174Ezk.A00(4));
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            AnonymousClass7IS.A02(textView2, (Integer) null, (Integer) null, 0, 0);
            int i3 = this.A02.A04;
            if (i3 != 0) {
                num = AnonymousClass7IS.A01(C18190wL.A0A(this), i3);
            } else {
                num = null;
            }
            int i4 = this.A02.A00;
            if (i4 == 0) {
                i4 = R.attr.fbpay_payment_method_header_cell_item_margin_bottom;
            }
            AnonymousClass7IS.A03(this, (Integer) null, (Integer) null, num, AnonymousClass7IS.A01(C18190wL.A0A(this), i4));
        } else {
            int i5 = this.A02.A04;
            if (i5 != 0) {
                AnonymousClass7IS.A03(this, (Integer) null, (Integer) null, AnonymousClass7IS.A01(C18190wL.A0A(this), i5), (Integer) null);
            }
            int i6 = this.A02.A00;
            if (i6 != 0) {
                AnonymousClass7IS.A03(this.A01, (Integer) null, (Integer) null, (Integer) null, AnonymousClass7IS.A01(C18190wL.A0A(this), i6));
            }
        }
        C91985hP r0 = this.A02;
        int i7 = r0.A05;
        int i8 = r0.A01;
        if (i7 != 0) {
            C04220Ms.A06(context);
            paddingTop = AnonymousClass7IS.A00(context, i7);
        } else {
            paddingTop = textView.getPaddingTop();
        }
        if (i8 != 0) {
            C04220Ms.A06(context);
            paddingBottom = AnonymousClass7IS.A00(context, i8);
        } else {
            paddingBottom = textView.getPaddingBottom();
        }
        textView.setPadding(0, paddingTop, 0, paddingBottom);
        int i9 = this.A02.A02;
        ImageView imageView = this.A00;
        if (i9 != 0) {
            C121097Ec.A01(context, imageView, AnonymousClass7Kz.A0G(), this.A02.A02, 0);
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        if (z) {
            C91985hP r2 = this.A02;
            C04220Ms.A0C(r2, "null cannot be cast to non-null type com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellViewModel");
            View requireViewById = inflate(context, R.layout.hub_cell_header_card_icons, this).requireViewById(R.id.card_icon_list);
            C04220Ms.A0C(requireViewById, C18170wI.A00(0));
            ViewGroup viewGroup = (ViewGroup) requireViewById;
            for (Object A04 : ((C92075hZ) r2).A00) {
                C86134wK.A14(context.getDrawable(AnonymousClass0wJ.A04(A04)), AnonymousClass0wJ.A0H(LayoutInflater.from(context), viewGroup, R.layout.hub_cell_header_card_icon), viewGroup);
            }
        }
    }

    public AnonymousClass51u(Context context, int i) {
        super(context);
        setOrientation(0);
        Context context2 = getContext();
        View inflate = inflate(context2, i, this);
        inflate.getClass();
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.label);
        this.A01 = A0L;
        A0L.setLinkTextColor(AnonymousClass7Kz.A0G().A03(context2, 5));
        if (C006702y.A00(this.A01) == null) {
            C116836xd.A00(this.A01, C18180wK.A0Y(), AnonymousClass006.A00, (String) null, (String) null);
        }
        View inflate2 = inflate(context2, R.layout.hub_cell_label_icon, this);
        inflate2.getClass();
        this.A00 = C18200wM.A0J(inflate2, R.id.icon);
    }

    public final void onAttachedToWindow() {
        int A06 = C14030oh.A06(248368016);
        super.onAttachedToWindow();
        this.A02.A07.A0E(this.A03);
        C14030oh.A0D(-774681924, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = C14030oh.A06(-13871934);
        super.onDetachedFromWindow();
        this.A02.A07.A0F(this.A03);
        C14030oh.A0D(1673500309, A06);
    }
}
