package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.service.session.UserSession;
import com.instagram.ui.primer.PrimerBottomSheetConfig;

/* renamed from: X.3Z9  reason: invalid class name */
public final class AnonymousClass3Z9 {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public C37383Jqm A03;
    public final UserSession A04;
    public final PrimerBottomSheetConfig A05;
    public final CharSequence A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public /* synthetic */ AnonymousClass3Z9(UserSession userSession, PrimerBottomSheetConfig primerBottomSheetConfig, CharSequence charSequence, int i, boolean z, boolean z2, boolean z3) {
        charSequence = (i & 32) != 0 ? null : charSequence;
        boolean A1R = C18240wQ.A1R(i & 64, z);
        boolean A1R2 = C18240wQ.A1R(i & 128, z2);
        boolean A1R3 = C18240wQ.A1R(i & 256, z3);
        this.A04 = userSession;
        this.A05 = primerBottomSheetConfig;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A06 = charSequence;
        this.A07 = A1R;
        this.A09 = A1R2;
        this.A08 = A1R3;
    }

    public static final AnonymousClass1b2 A00(AnonymousClass3Z9 r3) {
        UserSession userSession = r3.A04;
        PrimerBottomSheetConfig primerBottomSheetConfig = r3.A05;
        C04220Ms.A0B(primerBottomSheetConfig, 1);
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putParcelable("arg_config", primerBottomSheetConfig);
        AnonymousClass1b2 r1 = new AnonymousClass1b2();
        r1.setArguments(A0E);
        r1.A01 = r3.A01;
        r1.A02 = r3.A02;
        r1.A00 = r3.A00;
        r1.A04 = r3.A06;
        return r1;
    }

    public static void A01(Object obj) {
        ((AnonymousClass3Z9) obj).A02();
    }

    public final void A02() {
        C37383Jqm jqm = this.A03;
        if (jqm != null) {
            jqm.A06();
        }
    }

    public final void A03(Context context) {
        C37032Jj9 A0L = C18210wN.A0L(this.A04);
        A0L.A0T = this.A07;
        A0L.A0U = false;
        A0L.A0c = this.A08;
        A0L.A0a = this.A09;
        C37383Jqm A002 = A0L.A00();
        this.A03 = A002;
        C04220Ms.A0C(A002, "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheet");
        this.A03 = C37383Jqm.A00(context, A00(this), A002);
    }

    public final boolean A04() {
        Fragment A0I;
        C37383Jqm jqm = this.A03;
        if (jqm == null) {
            return false;
        }
        BottomSheetFragment bottomSheetFragment = jqm.A01;
        if (!bottomSheetFragment.isAdded() || (A0I = bottomSheetFragment.A0I()) == null) {
            return false;
        }
        return A0I.isVisible();
    }
}
