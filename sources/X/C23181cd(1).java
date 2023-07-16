package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.1cd  reason: invalid class name and case insensitive filesystem */
public final class C23181cd extends C34640IcN implements C82424pb, AnonymousClass4tS, C10390iG {
    public static final String __redex_internal_original_name = "AddEmailFragment";
    public UserSession A00;
    public TextView A01;
    public IgdsHeadline A02;
    public C24721jv A03;
    public String A04;

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final boolean BXY() {
        return true;
    }

    public final String getModuleName() {
        return "nux_add_email_screen";
    }

    public final C313625r Aiy() {
        return C313625r.PHONE;
    }

    public final AnonymousClass265 BDt() {
        return AnonymousClass265.A09;
    }

    public final void C9G() {
        C62713aZ.A00.A03(this.A00, "add_email");
    }

    public final void CDH(boolean z) {
        this.A01.setEnabled(z);
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        C62223Xv.A00.A01(this.A00, "add_email");
        return false;
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(822069395);
        C54282zC.A00(this.A00, "add_email");
        C14030oh.A0A(906191064, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(-781421930, C14030oh.A03(-853961716));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1838585932);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0W(this);
        String string = requireArguments().getString("argument_email");
        this.A04 = string;
        string.getClass();
        C14030oh.A09(922278481, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(7432797);
        AnonymousClass3YT.A00.A02(this.A00, "add_email");
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.nux_add_email_fragment, C18190wL.A0E(A0H), true);
        TextView A0L = AnonymousClass0wJ.A0L(A0H, R.id.skip_button);
        this.A01 = A0L;
        A0L.setText(2131835995);
        AnonymousClass0wJ.A16(this.A01, 582, this);
        IgdsHeadline A0S = C18240wQ.A0S(A0H, R.id.field_title_igds);
        this.A02 = A0S;
        A0S.A08(R.drawable.email, true);
        IgdsHeadline igdsHeadline = this.A02;
        String string = AnonymousClass0wJ.A0B(this).getString(2131821050);
        string.getClass();
        igdsHeadline.setBody(String.format((Locale) null, string, new Object[]{this.A04}), (View.OnClickListener) null);
        C24721jv r0 = new C24721jv((TextView) null, this.A00, this, C18230wP.A0c(A0H));
        this.A03 = r0;
        registerLifecycleListener(r0);
        C691847d.A02(this);
        C14030oh.A09(-1134048437, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(543585802);
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        unregisterLifecycleListener(this.A03);
        C691847d.A03(this);
        C14030oh.A09(354608712, A022);
    }
}
