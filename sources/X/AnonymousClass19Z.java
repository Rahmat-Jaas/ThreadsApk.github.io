package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.19Z  reason: invalid class name */
public final class AnonymousClass19Z extends C90925fJ {
    public final KtCSuperShape0S0210000_I2 A00;
    public final C11630kW A01;
    public final UserSession A02;
    public final C3G A03;

    public final AnonymousClass7H0 A0P(AnonymousClass39P r6, int i, int i2) {
        C04220Ms.A0B(r6, 0);
        if (this.A00.A00 == AnonymousClass006.A00) {
            return new AnonymousClass7H0(0, 0);
        }
        Context context = r6.A00.A04;
        C04220Ms.A06(context);
        View A0E = C18240wQ.A0E(LayoutInflater.from(context), R.layout.fan_club_badge_layout);
        C04220Ms.A0C(A0E, "null cannot be cast to non-null type com.instagram.common.ui.base.IgLinearLayout");
        C120587Bp.A01(context, A0E, this.A02, false);
        A0E.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return C18220wO.A0Q(A0E, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        C04220Ms.A0B(context, 0);
        View A0E = C18240wQ.A0E(LayoutInflater.from(context), R.layout.fan_club_badge_layout);
        C04220Ms.A0C(A0E, "null cannot be cast to non-null type com.instagram.common.ui.base.IgLinearLayout");
        return A0E;
    }

    public final /* bridge */ /* synthetic */ void A0Q(Context context, Object obj, Object obj2) {
        IDxCListenerShape41S0300000_1_I2 iDxCListenerShape41S0300000_1_I2;
        View view = (View) obj;
        boolean A1Z = AnonymousClass0wJ.A1Z(context, view);
        KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2 = this.A00;
        Object obj3 = ktCSuperShape0S0210000_I2.A01;
        if (obj3 != null) {
            int A04 = AnonymousClass0wJ.A04(ktCSuperShape0S0210000_I2.A00);
            if (A04 == A1Z) {
                view.setVisibility(0);
                C120587Bp.A01(C18190wL.A0A(view), view, this.A02, false);
                iDxCListenerShape41S0300000_1_I2 = new IDxCListenerShape41S0300000_1_I2(40, (Object) view, obj3, (Object) this);
            } else if (A04 == 2) {
                view.setVisibility(0);
                C120587Bp.A01(C18190wL.A0A(view), view, this.A02, false);
                iDxCListenerShape41S0300000_1_I2 = new IDxCListenerShape41S0300000_1_I2(41, (Object) context, obj3, (Object) this);
            } else if (A04 != 4) {
                view.setVisibility(8);
                return;
            } else {
                view.setVisibility(0);
                C120587Bp.A01(C18190wL.A0A(view), view, this.A02, false);
                iDxCListenerShape41S0300000_1_I2 = null;
            }
            view.setOnClickListener(iDxCListenerShape41S0300000_1_I2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass19Z(KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2, C11630kW r3, C3G c3g, UserSession userSession) {
        super(AnonymousClass006.A01);
        AnonymousClass0wJ.A1O(ktCSuperShape0S0210000_I2, userSession);
        C18190wL.A1S(r3, 3, c3g);
        this.A00 = ktCSuperShape0S0210000_I2;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = c3g;
    }

    public final /* bridge */ /* synthetic */ void A0R(Context context, Object obj, Object obj2) {
    }
}
