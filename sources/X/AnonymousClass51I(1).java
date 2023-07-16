package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import kotlin.properties.IDxOPropertyShape881S0100000_2_I2;

/* renamed from: X.51I  reason: invalid class name */
public final class AnonymousClass51I extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0A5[] A03;
    public TextView A00;
    public final C86024w9 A01 = AnonymousClass86W.A01(this, 54);
    public final C86024w9 A02;

    public AnonymousClass51I(Context context) {
        super(context, (AttributeSet) null, 0);
        AnonymousClass69Q r5 = AnonymousClass69Q.PRIMARY_TEXT_DEEMPHASIZED;
        this.A02 = new IDxOPropertyShape881S0100000_2_I2(55, this, r5);
        addView(LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_left_add_on_label, this, false));
        this.A00 = (TextView) AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_label);
        Context context2 = getContext();
        AnonymousClass7Kz.A0G();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(R.style.FBPayUIListCell, C29934Fwk.A0c);
        TextView textView = this.A00;
        if (textView != null) {
            AnonymousClass7Fe.A00(obtainStyledAttributes, textView, 22, R.style.BusinessText);
            obtainStyledAttributes.recycle();
            TextView textView2 = this.A00;
            if (textView2 != null) {
                AnonymousClass7Fd.A02(textView2, r5);
                return;
            }
        }
        C04220Ms.A0E("textView");
        throw null;
    }

    public final void setSpannableString(SpannableString spannableString) {
        C04220Ms.A0B(spannableString, 0);
        TextView textView = this.A00;
        if (textView == null) {
            C04220Ms.A0E("textView");
            throw null;
        } else {
            textView.setText(spannableString);
        }
    }

    public final void setTextStyle(AnonymousClass69Q r4) {
        C04220Ms.A0B(r4, 0);
        C86114wI.A1L(this, r4, this.A02, A03, 1);
    }

    static {
        Class<AnonymousClass51I> cls = AnonymousClass51I.class;
        A03 = new AnonymousClass0A5[]{C86134wK.A0x(cls, "text", "getText()Ljava/lang/String;"), C86134wK.A0x(cls, "textStyle", "getTextStyle()Lcom/facebookpay/widget/style/TextStyle;")};
    }

    public final String getText() {
        return (String) C86114wI.A0i(this, this.A01, A03, 0);
    }

    public final AnonymousClass69Q getTextStyle() {
        return (AnonymousClass69Q) C86114wI.A0i(this, this.A02, A03, 1);
    }

    public final void setText(String str) {
        C86114wI.A1L(this, str, this.A01, A03, 0);
    }
}
