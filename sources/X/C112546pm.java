package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape119S0100000_I2_99;
import kotlin.jvm.internal.KtLambdaShape34S0200000_I2_18;

/* renamed from: X.6pm  reason: invalid class name and case insensitive filesystem */
public final class C112546pm {
    public final C144958jZ A00;
    public final C04530Oa A01;
    public final Fragment A02;

    public final void A00() {
        C86114wI.A1A(this.A02.getViewLifecycleOwner(), ((AnonymousClass8v9) this.A01.getValue()).A00, this, 295);
    }

    public C112546pm(Fragment fragment, UserSession userSession, C144958jZ r10, String str, String str2, boolean z) {
        AnonymousClass0wJ.A1O(userSession, fragment);
        C04220Ms.A0B(str, 4);
        this.A02 = fragment;
        this.A00 = r10;
        AnonymousClass8E5 r6 = new AnonymousClass8E5(userSession, str, str2, z);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape119S0100000_I2_99(new KtLambdaShape119S0100000_I2_99(fragment, 27), 28));
        this.A01 = C18220wO.A0M(new KtLambdaShape119S0100000_I2_99(A012, 29), r6, new KtLambdaShape34S0200000_I2_18(28, (Object) null, A012), C18210wN.A0l(AnonymousClass8v9.class));
    }
}
