package X;

import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import com.facebook.redex.IDxCListenerShape270S0200000_2_I2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;
import com.fbpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5gV  reason: invalid class name and case insensitive filesystem */
public final class C91605gV extends C886359v {
    public final ContextThemeWrapper A00;
    public final boolean A01;

    public final void A0A(AnonymousClass5BO r9, AnonymousClass7Kx r10) {
        ImmutableList treeList;
        FrameLayout.LayoutParams layoutParams;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        AnonCheckoutPuxLink anonCheckoutPuxLink = (AnonCheckoutPuxLink) r10.A01;
        if (AnonymousClass7Kx.A0R(r10) && anonCheckoutPuxLink != null) {
            ShimmerFrameLayout shimmerFrameLayout = r9.A01;
            shimmerFrameLayout.A03();
            String str = null;
            shimmerFrameLayout.setBackground((Drawable) null);
            if (this.A01) {
                TextView textView = r9.A00;
                textView.setMovementMethod(new LinkMovementMethod());
                PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl = anonCheckoutPuxLink.A00;
                if (pAYLinkableTextFragmentImpl != null) {
                    str = C86144wL.A0q(pAYLinkableTextFragmentImpl);
                }
                if (str == null) {
                    throw C18180wK.A0a("Required value was null.");
                } else if (pAYLinkableTextFragmentImpl == null || (treeList = pAYLinkableTextFragmentImpl.getTreeList("ranges", PAYLinkableTextFragmentImpl.Ranges.class)) == null) {
                    throw C18180wK.A0a("Required value was null.");
                } else {
                    textView.setText(new C112166p6(str, AnonymousClass3JJ.A01(treeList, 0, false)).A00(new IDxCListenerShape270S0200000_2_I2(0, this, r9), false));
                    C121097Ec A0G = AnonymousClass7Kz.A0G();
                    ContextThemeWrapper contextThemeWrapper = this.A00;
                    textView.setLinkTextColor(A0G.A03(contextThemeWrapper, 5));
                    int A05 = C86114wI.A05(contextThemeWrapper);
                    int A02 = C18210wN.A02(contextThemeWrapper);
                    Integer valueOf = Integer.valueOf(A05);
                    Integer valueOf2 = Integer.valueOf(A02);
                    AnonymousClass7IS.A03(textView, valueOf, valueOf, valueOf2, valueOf2);
                    AnonymousClass7IS.A03(shimmerFrameLayout, 0, 0, 0, 0);
                    AnonymousClass7Fd.A02(textView, AnonymousClass69Q.A0z);
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                        layoutParams.gravity = 8388611;
                        textView.setLayoutParams(layoutParams);
                    }
                }
            } else {
                AnonymousClass7IS.A03(shimmerFrameLayout, (Integer) null, (Integer) null, 0, (Integer) null);
                TextView textView2 = r9.A00;
                AnonymousClass7Fd.A02(textView2, AnonymousClass69Q.A1B);
                textView2.setOnClickListener(this.A00);
                PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl2 = anonCheckoutPuxLink.A00;
                if (pAYLinkableTextFragmentImpl2 != null) {
                    str = C86144wL.A0q(pAYLinkableTextFragmentImpl2);
                }
                textView2.setText(str);
            }
        } else if (AnonymousClass7Kx.A0P(r10)) {
            r9.A01.A07(A1Z);
        }
    }

    public C91605gV(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext, boolean z) {
        super(AnonymousClass69U.A07, loggingContext, false);
        this.A00 = contextThemeWrapper;
        this.A01 = z;
    }
}
