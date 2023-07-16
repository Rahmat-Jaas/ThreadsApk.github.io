package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.2KF  reason: invalid class name */
public final class AnonymousClass2KF {
    public static final void A00(C82254pK r1, C58923Id r2, String str) {
        AnonymousClass0wJ.A1M(r2, 0, r1);
        r2.A04(false);
        r2.A02(r1);
        if (str == null) {
            str = "";
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = r2.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionText(str);
        }
    }
}
