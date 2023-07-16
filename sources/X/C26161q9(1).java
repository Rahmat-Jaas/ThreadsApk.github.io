package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.1q9  reason: invalid class name and case insensitive filesystem */
public final class C26161q9 extends C26171qA {
    public static final String __redex_internal_original_name = "FxCalFlowFragmentImpl";
    public final AnonymousClass01V A00;

    public final void A00(Fragment fragment, C10300i6 r6, String str, String str2, int i) {
        C04220Ms.A0B(r6, 0);
        C04220Ms.A0B(str, 2);
        if (!"ig_interop".equals(str)) {
            C59713Ma.A01(r6, true);
        }
        Bundle A06 = C18180wK.A06();
        A06.putString("flow", str);
        A06.putString("opaque_target_account_id", str2);
        C63863iT A02 = C63863iT.A02(fragment.getActivity(), A06, r6, ModalActivity.class, "fxcal_flow");
        if (str.equals(AnonymousClass264.INTEROP.A00())) {
            A02.A0G();
        }
        A02.A0J(fragment, i);
    }

    public final String getModuleName() {
        return "fxcal_flow";
    }

    public C26161q9() {
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        C04220Ms.A06(r0);
        this.A00 = r0;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1160679146);
        AnonymousClass01V r3 = this.A00;
        r3.markerStart(857807376);
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        r3.markerAnnotate(857807376, "entry_point", str);
        super.onCreate(bundle);
        C14030oh.A09(4244993, A02);
    }
}
