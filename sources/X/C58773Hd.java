package X;

import android.app.Activity;
import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.instagram.request.IDxDCallbackShape59S0200000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Hd  reason: invalid class name and case insensitive filesystem */
public final class C58773Hd {
    public AnonymousClass366 A00;
    public final Activity A01;
    public final Context A02;
    public final CompoundButton.OnCheckedChangeListener A03 = new IDxCListenerShape267S0100000_1_I2((Object) this, 47);
    public final Fragment A04;
    public final UserSession A05;
    public final AnonymousClass3VR A06;
    public final List A07;
    public final Set A08;
    public final boolean A09;
    public final C12560m7 A0A;
    public final AnonymousClass06E A0B;

    public final void A00(AnonymousClass366 r6) {
        this.A00 = r6;
        IDxDCallbackShape59S0200000_1_I2 iDxDCallbackShape59S0200000_1_I2 = new IDxDCallbackShape59S0200000_1_I2(this.A0A, this, r6, 0);
        Context context = this.A02;
        AnonymousClass06E r2 = this.A0B;
        C32165H8c A002 = AnonymousClass3OP.A00(this.A05, "notifications");
        A002.A00 = iDxDCallbackShape59S0200000_1_I2;
        C31155GhB.A01(context, r2, A002);
    }

    public final void A01(Boolean bool) {
        for (Object next : this.A08) {
            if (next instanceof AnonymousClass4MA) {
                ((AnonymousClass4MA) next).A07 = !bool.booleanValue();
            }
            if (next instanceof C23540Cu6) {
                ((AnonymousClass4MC) next).A0C = bool.booleanValue();
            }
        }
        AnonymousClass366 r0 = this.A00;
        r0.getClass();
        r0.A00.setItems(this.A07);
    }

    public C58773Hd(Fragment fragment, UserSession userSession, AnonymousClass3VR r5, boolean z) {
        this.A04 = fragment;
        this.A0B = AnonymousClass06E.A00(fragment);
        this.A0A = fragment.mFragmentManager;
        this.A02 = fragment.requireContext();
        this.A01 = fragment.requireActivity();
        this.A05 = userSession;
        this.A06 = r5;
        this.A09 = z;
        this.A07 = AnonymousClass0wJ.A0v();
        this.A08 = C18200wM.A0u();
    }
}
