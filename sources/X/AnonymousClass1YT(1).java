package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenDismissCallback;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.1YT  reason: invalid class name */
public final class AnonymousClass1YT extends C34640IcN {
    public static final String __redex_internal_original_name = "IgBloksNativeHybridFXSwitcherNativePropsDemoFragment";
    public IgBloksScreenConfig A00;
    public C57763Cj A01;
    public UserSession A02;
    public Button A03;
    public Button A04;

    public final String getModuleName() {
        return "ig_bloks_native_hybrid_shell_cds_fx_switcher_playground";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1785405923);
        super.onCreate(bundle);
        UserSession A0V = C18180wK.A0V(this.mArguments);
        this.A02 = A0V;
        Integer num = C66883yU.A0F;
        Integer num2 = AnonymousClass006.A00;
        C66883yU r5 = new C66883yU((C81804oQ) null, (CdsOpenScreenDismissCallback) null, (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A01, AnonymousClass006.A0Y, num, num2, (Integer) null, (Integer) null, false, false, false);
        IgBloksScreenConfig A0N = C18190wL.A0N(A0V);
        A0N.A0P = "com.bloks.www.fx.playground.company-identity-switcher.native-props-demo";
        A0N.A01 = r5;
        this.A00 = A0N;
        C57763Cj r2 = new C57763Cj(requireContext());
        r2.A00 = SandboxRepository.CACHE_TTL;
        this.A01 = r2;
        C14030oh.A09(-1488221899, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1269100218);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.fx_switcher_native_props_demo);
        Button button = (Button) A0H.requireViewById(R.id.button);
        this.A03 = button;
        AnonymousClass0wJ.A16(button, 49, this);
        Button button2 = (Button) A0H.requireViewById(R.id.prefetch_button);
        this.A04 = button2;
        AnonymousClass0wJ.A16(button2, 50, this);
        C14030oh.A09(-1062395077, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1444427810);
        super.onDestroyView();
        this.A03 = null;
        this.A04 = null;
        C14030oh.A09(429467042, A022);
    }
}
