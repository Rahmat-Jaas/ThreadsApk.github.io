package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.1jM  reason: invalid class name */
public final class AnonymousClass1jM extends C90995fQ {
    public final /* bridge */ /* synthetic */ View A0O(Context context) {
        C04220Ms.A0B(context, 0);
        return new IgdsMediaButton(context, (AttributeSet) null, 0);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        C04220Ms.A0B(context, 0);
        return new IgdsMediaButton(context, (AttributeSet) null, 0);
    }

    public final /* bridge */ /* synthetic */ Object A0P(View view, AnonymousClass3HX r6, C127397h3 r7, Object obj) {
        AnonymousClass25V r0;
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view;
        C04220Ms.A0B(igdsMediaButton, 0);
        AnonymousClass0wJ.A1O(r6, r7);
        String A0N = r7.A0N(44);
        if (A0N != null) {
            int hashCode = A0N.hashCode();
            if (hashCode != -1407516662) {
                if (hashCode != -817598092) {
                    if (hashCode == -314765822 && A0N.equals("primary")) {
                        r0 = AnonymousClass25V.PRIMARY;
                    }
                } else if (A0N.equals("secondary")) {
                    r0 = AnonymousClass25V.SECONDARY;
                }
            } else if (A0N.equals("secondary_on_black")) {
                r0 = AnonymousClass25V.SECONDARY_ON_BLACK;
            }
            igdsMediaButton.setButtonStyle(r0);
        }
        if (r7.A0T(35, false)) {
            igdsMediaButton.setButtonStyle(AnonymousClass25V.PRIMARY_DESTRUCTIVE);
        }
        igdsMediaButton.setEnabled(!r7.A0T(36, false));
        Context context = r6.A00;
        C04220Ms.A06(context);
        AnonymousClass2BX.A00(context, r7, igdsMediaButton);
        igdsMediaButton.setLabel(r7.A0N(43));
        C109326jp A0L = r7.A0L(41);
        if (A0L == null) {
            return null;
        }
        igdsMediaButton.setOnClickListener(new IDxCListenerShape41S0300000_1_I2(r6, r7, A0L, 3));
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r3, C127397h3 r4, Object obj, Object obj2) {
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view;
        C04220Ms.A0B(igdsMediaButton, 0);
        igdsMediaButton.setOnClickListener((View.OnClickListener) null);
        igdsMediaButton.setLabel((CharSequence) null);
        igdsMediaButton.A02();
        igdsMediaButton.A03();
        igdsMediaButton.setButtonStyle(AnonymousClass25V.PRIMARY);
    }

    public AnonymousClass1jM(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }
}
