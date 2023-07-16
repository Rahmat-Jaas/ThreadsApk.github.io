package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.barcelona.R;
import java.security.Signature;

/* renamed from: X.55z  reason: invalid class name */
public final class AnonymousClass55z extends AnonymousClass099 implements C145868lF, C145338kL {
    public View A00;
    public C143598h0 A01;
    public AnonymousClass57F A02;
    public C145868lF A03;
    public C145348kM A04;

    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Dialog dialog = this.A02;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setStatusBarColor(0);
        }
        View requireViewById = view.requireViewById(R.id.progress_bar_layout);
        this.A00 = requireViewById;
        requireViewById.setVisibility(8);
        C86114wI.A1A(this, this.A02.A00, C86114wI.A0Q(this, 186), 275);
    }

    public final void AMq(Bundle bundle, C120967Dk r5, Throwable th) {
        C145348kM r2 = this.A04;
        if (r2 != null) {
            if (th == null) {
                r2.Blo(new C108876j6(bundle, r5, (Signature) null));
            } else {
                r2.Bln(th);
            }
        }
        A07();
    }

    public final C120967Dk ArH() {
        return this.A03.ArH();
    }

    public final void BzY(Bundle bundle, C120967Dk r3) {
        this.A03.BzY(bundle, r3);
    }

    public final void BzZ(Throwable th) {
        this.A03.BzZ(th);
    }

    public final Dialog A0C(Bundle bundle) {
        Dialog A0C = super.A0C(bundle);
        A0C.setOnKeyListener(new C122227Lq(this));
        return A0C;
    }

    public final void onCreate(Bundle bundle) {
        C145868lF r0;
        int A022 = C14030oh.A02(-250985190);
        super.onCreate(bundle);
        A08(2, R.style.FBPayAuthContainerFullScreenDialog);
        AnonymousClass7IU A002 = AnonymousClass7IU.A00(C1203379t.A00(), this);
        this.A02 = (AnonymousClass57F) A002.A01(AnonymousClass57F.class);
        AnonymousClass583 r5 = (AnonymousClass583) A002.A01(AnonymousClass583.class);
        String A0j = C18190wL.A0j(requireArguments(), "AUTH_METHOD_TYPE");
        AnonymousClass57F r2 = this.A02;
        Bundle requireArguments = requireArguments();
        if ("PIN".equalsIgnoreCase(A0j) || "BIO_OR_PIN".equalsIgnoreCase(A0j)) {
            r0 = new C128617jw(requireArguments, r5, r2);
        } else if ("CSC".equalsIgnoreCase(A0j) || "PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(A0j)) {
            r0 = new C128607jv(requireArguments, r2);
        } else if ("IG_ACCESS_TOKEN".equalsIgnoreCase(A0j) || "FB_ACCESS_TOKEN".equalsIgnoreCase(A0j)) {
            r0 = new C128577js(requireArguments, r2);
        } else if ("THREE_DS".equalsIgnoreCase(A0j)) {
            r0 = new C128587jt(requireArguments, r2);
        } else if ("SDC".equalsIgnoreCase(A0j)) {
            r0 = new C128597ju(requireArguments, r2);
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0L("Not yet Impl! : ", A0j));
        }
        this.A03 = r0;
        C86114wI.A1A(this, this.A02.A02, C86114wI.A0Q(this, 183), 275);
        C86114wI.A1A(this, this.A02.A01, C86114wI.A0Q(this, 184), 275);
        C86114wI.A1A(this, r5.A05, C86114wI.A0Q(this, 185), 275);
        C14030oh.A09(1317670437, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1205870356);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.auth_container);
        C14030oh.A09(1036948479, A022);
        return A0H;
    }

    public final void Ci3(C145348kM r1) {
        this.A04 = r1;
    }
}
