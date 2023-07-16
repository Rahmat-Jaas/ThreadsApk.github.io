package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1qE  reason: invalid class name and case insensitive filesystem */
public final class C26211qE extends C23161cb {
    public static final String __redex_internal_original_name = "ConsentIntroFragment";
    public View A00;
    public View A01;
    public LinearLayout A02;
    public TextView A03;
    public C24651jm A04;
    public ProgressButton A05;
    public final View.OnClickListener A06 = C18190wL.A0H(this, 450);

    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int A022 = C14030oh.A02(-1116650716);
        super.onCreate(bundle);
        String string = requireArguments().getString("GDPR.Fragment.EntryPoint");
        if (string == null) {
            string = "unknown";
        }
        String string2 = requireArguments().getString("GDPR.Fragment.UserState");
        Integer[] A1Z = C18240wQ.A1Z();
        int length = A1Z.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = AnonymousClass006.A0C;
                break;
            }
            num = A1Z[i];
            if (AnonymousClass2PB.A00(num).equals(string2)) {
                break;
            }
            i++;
        }
        synchronized (AnonymousClass3VH.A00()) {
            AnonymousClass3VH r0 = AnonymousClass3VH.A0B;
            r0.A06 = string;
            r0.A04 = num;
        }
        C63093bU.A00().A05(string, num);
        synchronized (C18250wR.A0C(this.A00)) {
        }
        C14030oh.A09(1687580611, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RegFlowExtras regFlowExtras;
        int A022 = C14030oh.A02(229151491);
        View inflate = layoutInflater.inflate(R.layout.gdpr_intro_layout, viewGroup, false);
        this.A00 = inflate.requireViewById(R.id.container);
        this.A01 = inflate.findViewById(R.id.loading_indicator);
        this.A03 = C18180wK.A0G(this.A00, R.id.content_title);
        AnonymousClass3Zk.A03(this.A03, getContext());
        this.A02 = (LinearLayout) this.A00.requireViewById(R.id.paragraphs_container);
        this.A00.requireViewById(R.id.data_policy_link).setOnClickListener(this.A06);
        ProgressButton A0c = C18230wP.A0c(this.A00);
        this.A05 = A0c;
        C24651jm r0 = new C24651jm(this, A0c, (String) null);
        this.A04 = r0;
        registerLifecycleListener(r0);
        this.A01.setVisibility(0);
        C26181qB r7 = new C26181qB(this, this);
        Context context = getContext();
        Integer num = AnonymousClass3VH.A00().A04;
        String str = AnonymousClass3VH.A00().A07;
        C10300i6 r8 = this.A00;
        H1T h1t = new H1T(r8);
        if (AnonymousClass3VH.A00().A04 == AnonymousClass006.A00 && (regFlowExtras = this.A01) != null) {
            String str2 = regFlowExtras.A08;
            String str3 = regFlowExtras.A0Q;
            h1t.A0P("email", str2);
            h1t.A0P("phone", str3);
        }
        C59733Mc.A00(context, h1t, r7, r8, (Integer) null, num, str);
        C14030oh.A09(-891409667, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(498162851);
        super.onDestroy();
        C24651jm r0 = this.A04;
        if (r0 != null) {
            unregisterLifecycleListener(r0);
        }
        C14030oh.A09(1238380305, A022);
    }
}
