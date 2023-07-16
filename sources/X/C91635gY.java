package X;

import android.view.ContextThemeWrapper;
import android.widget.TextView;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutToggleItem;
import com.facebookpay.widget.otc.AnonCheckoutToggleButton;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.5gY  reason: invalid class name and case insensitive filesystem */
public final class C91635gY extends C886359v {
    public final ContextThemeWrapper A00;
    public final C143638h4 A01;
    public final AnonymousClass0YY A02;
    public final boolean A03;

    public final void A0A(AnonymousClass5BP r8, AnonymousClass7Kx r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        AnonCheckoutToggleItem anonCheckoutToggleItem = (AnonCheckoutToggleItem) r9.A01;
        if (AnonymousClass7Kx.A0R(r9) && anonCheckoutToggleItem != null) {
            r8.A00.A03();
            AnonCheckoutToggleButton anonCheckoutToggleButton = r8.A01;
            anonCheckoutToggleButton.setToggleOn(anonCheckoutToggleItem.A02);
            anonCheckoutToggleButton.setOnClickListener(this.A00);
            anonCheckoutToggleButton.setOnToggleCheckedListener(this.A02);
            TextView textView = anonCheckoutToggleButton.A02;
            PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl = anonCheckoutToggleItem.A01;
            String str = null;
            if (pAYLinkableTextFragmentImpl != null) {
                str = C86144wL.A0q(pAYLinkableTextFragmentImpl);
            }
            textView.setText(str);
            AnonymousClass7Fd.A02(textView, AnonymousClass69Q.PRIMARY_TEXT);
            anonCheckoutToggleButton.A03.setVisibility(0);
            anonCheckoutToggleButton.setEnableRedesign(this.A03);
            PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl2 = anonCheckoutToggleItem.A00;
            if (pAYLinkableTextFragmentImpl2 != null) {
                TextView textView2 = anonCheckoutToggleButton.A01;
                String A0q = C86144wL.A0q(pAYLinkableTextFragmentImpl2);
                if (A0q != null) {
                    textView2.setText(new C112166p6(A0q, AnonymousClass3JJ.A01(C18230wP.A0P(pAYLinkableTextFragmentImpl2, PAYLinkableTextFragmentImpl.Ranges.class, "ranges"), 0, A1Z)).A00(this.A01, false));
                    return;
                }
                throw AnonymousClass0wJ.A0b();
            }
        } else if (AnonymousClass7Kx.A0P(r9)) {
            r8.A01.A03.setVisibility(4);
            r8.A00.A07(A1Z);
        }
    }

    public C91635gY(ContextThemeWrapper contextThemeWrapper, C143638h4 r4, LoggingContext loggingContext, AnonymousClass0YY r6, boolean z) {
        super(AnonymousClass69U.A08, loggingContext, false);
        this.A00 = contextThemeWrapper;
        this.A02 = r6;
        this.A01 = r4;
        this.A03 = z;
    }
}
