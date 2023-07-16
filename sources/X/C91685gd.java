package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.PayButtonItem;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;
import com.fbpay.logging.LoggingContext;
import java.util.Locale;

/* renamed from: X.5gd  reason: invalid class name and case insensitive filesystem */
public final class C91685gd extends C886359v {
    public final ContextThemeWrapper A00;
    public final AnonymousClass0ZU A01;

    public final void A0A(AnonymousClass5B6 r7, AnonymousClass7Kx r8) {
        String str;
        PayButtonItem payButtonItem;
        PayButtonItem payButtonItem2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        FBPayAnimationButton fBPayAnimationButton = r7.A00;
        fBPayAnimationButton.setOnClickListener(C64823rv.A00);
        Object obj = r8.A01;
        if (obj != null && (payButtonItem2 = (PayButtonItem) obj) != null && payButtonItem2.A03 == A1Z) {
            fBPayAnimationButton.A03();
            if (r8.A00 == AnonymousClass67Q.LOADING) {
                fBPayAnimationButton.A0A();
            } else {
                fBPayAnimationButton.A0B(r8);
            }
        } else if (AnonymousClass7Kx.A0R(r8) && (payButtonItem = (PayButtonItem) obj) != null && payButtonItem.A00 != null) {
            String A06 = A06(C18190wL.A0A(r7.itemView), payButtonItem);
            fBPayAnimationButton.A09();
            if (this.A01) {
                fBPayAnimationButton.getButtonView().setButtonStyle(AnonymousClass69C.A08);
            }
            if (A06 == null) {
                A06 = "";
            }
            fBPayAnimationButton.setText(A06);
            fBPayAnimationButton.setPayButtonState(A1Z);
            fBPayAnimationButton.A03();
            C86104wH.A1D(fBPayAnimationButton, 17, r7, this);
        } else if (AnonymousClass7Kx.A0P(r8)) {
            fBPayAnimationButton.setPayButtonState(false);
            fBPayAnimationButton.A07(A1Z);
        } else if (AnonymousClass7Kx.A0O(r8)) {
            PayButtonItem payButtonItem3 = (PayButtonItem) obj;
            if (payButtonItem3 == null || (str = A06(C18190wL.A0A(r7.itemView), payButtonItem3)) == null) {
                str = "";
            }
            fBPayAnimationButton.setText(str);
            fBPayAnimationButton.setPayButtonState(false);
            fBPayAnimationButton.A03();
        }
    }

    public C91685gd(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext, AnonymousClass0ZU r4, boolean z) {
        super(AnonymousClass69U.A0M, loggingContext, z);
        this.A00 = contextThemeWrapper;
        this.A01 = r4;
    }

    private final String A06(Context context, PayButtonItem payButtonItem) {
        String str;
        String format;
        if (this.A01) {
            format = payButtonItem.A02;
            if (format == null) {
                format = context.getString(2131826400);
            }
            return format;
        }
        CurrencyAmount currencyAmount = payButtonItem.A00;
        if (currencyAmount != null) {
            str = C86124wJ.A0v(currencyAmount, AnonymousClass77N.A00);
        } else {
            str = null;
        }
        Locale A0O = AnonymousClass7Kz.A0O();
        String A0k = AnonymousClass0wJ.A0k(context, 2131826402);
        String str2 = payButtonItem.A02;
        if (str2 == null) {
            str2 = AnonymousClass0wJ.A0k(context, 2131826401);
        }
        format = String.format(A0O, A0k, C86144wL.A1a(str2, str));
        C04220Ms.A06(format);
        return format;
    }
}
