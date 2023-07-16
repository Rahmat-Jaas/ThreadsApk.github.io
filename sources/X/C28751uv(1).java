package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

/* renamed from: X.1uv  reason: invalid class name and case insensitive filesystem */
public final class C28751uv extends AnonymousClass1bK {
    public static final String __redex_internal_original_name = "DataDownloadPasswordFragment";
    public int A00;
    public int A01;
    public EditText A02;
    public TextView A03;
    public UserSession A04;
    public InlineErrorMessageView A05;
    public String A06;

    public final String getModuleName() {
        return "data_download_password";
    }

    public static void A00(C28751uv r6) {
        r6.A05.A04();
        if (!C09860go.A0p(r6.A02)) {
            AnonymousClass3F8 r5 = new AnonymousClass3F8(r6.A04);
            r5.A00("unified_dyi_home", "create_job");
            String A0n = AnonymousClass0wJ.A0n(r6.A02);
            UserSession userSession = r6.A04;
            String str = r6.A06;
            H1T A0N = AnonymousClass0wJ.A0N(userSession);
            A0N.A0J("dyi/request_download_data/");
            A0N.A0O("enc_password", C62663aU.A01(A0N, userSession, "email", str, A0n));
            C32165H8c A0T = C18180wK.A0T(A0N, C21811Sg.class, C60183Oa.class);
            C63873iU.A0F(A0T, r6, r5, 39);
            C31155GhB.A03(A0T);
            return;
        }
        r6.A05.A05(r6.getString(2131832179));
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        int i;
        super.configureActionBar(r4);
        boolean z = false;
        r4.AJT(false);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A0F = getString(2131831737);
        this.A03 = (TextView) r4.A7Q(C18190wL.A0L(A0K, this, 272));
        EditText editText = this.A02;
        if (editText != null && !C09860go.A0p(editText)) {
            z = true;
        }
        this.A03.setEnabled(z);
        TextView textView = this.A03;
        if (z) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        textView.setTextColor(i);
        r4.Crl(C18190wL.A0L(C18190wL.A0K(), this, 273));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-565067494);
        super.onCreate(bundle);
        this.A06 = requireArguments().getString("email");
        this.A04 = C18180wK.A0V(this.mArguments);
        this.A00 = getContext().getColor(R.color.blue_5_30_transparent);
        this.A01 = getContext().getColor(R.color.blue_5);
        C14030oh.A09(702741799, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1406989078);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.data_download_password_fragment);
        AnonymousClass0wJ.A0L(A0H, R.id.header_text).setText(AnonymousClass0wJ.A0o(this, AnonymousClass0wJ.A0Y(this.A04).BK7(), 2131824757));
        ((ViewStub) A0H.requireViewById(R.id.inline_error_stub)).inflate();
        this.A05 = (InlineErrorMessageView) A0H.findViewById(R.id.inline_error);
        TextView A0L = AnonymousClass0wJ.A0L(A0H, R.id.help_text);
        C18200wM.A18(AnonymousClass0wJ.A0B(this), A0L, 2131827679);
        AnonymousClass0wJ.A17(A0L, 271, this);
        EditText editText = (EditText) A0H.requireViewById(R.id.text_field);
        this.A02 = editText;
        editText.setHint(2131832176);
        this.A02.setInputType(128);
        C18240wQ.A0z(this.A02);
        this.A02.setImeOptions(6);
        C18210wN.A12(this.A02, this, 15);
        C18230wP.A17(this.A02, this, 21);
        C14030oh.A09(832607786, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1306254141);
        super.onResume();
        this.A02.requestFocus();
        C09860go.A0K(this.A02);
        C14030oh.A09(1862796429, A022);
    }
}
