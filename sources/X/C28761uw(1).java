package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.EditText;
import com.facebook.redex.IDxCListenerShape332S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import java.util.List;

/* renamed from: X.1uw  reason: invalid class name and case insensitive filesystem */
public final class C28761uw extends AnonymousClass1bK {
    public static final String __redex_internal_original_name = "DataDownloadRequestFragment";
    public EditText A00;
    public UserSession A01;
    public DataDownloadStatusCheckResponse A02;
    public InlineErrorMessageView A03;

    public final String getModuleName() {
        return "data_download_request";
    }

    public static void A00(C28761uw r3) {
        String str;
        EditText editText;
        DataDownloadStatusCheckResponse dataDownloadStatusCheckResponse = r3.A02;
        if (dataDownloadStatusCheckResponse != null) {
            str = dataDownloadStatusCheckResponse.A01;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            List A002 = AnonymousClass3PY.A00(r3.requireContext(), r3.A00);
            if (!A002.isEmpty()) {
                str = C18190wL.A0p(A002, 0);
            }
        }
        if (str != null && (editText = r3.A00) != null && TextUtils.isEmpty(AnonymousClass0wJ.A0n(editText))) {
            r3.A00.append(str);
        }
    }

    public static void A01(C28761uw r5) {
        boolean A09 = AnonymousClass0hA.A09(AnonymousClass0wJ.A0n(r5.A00));
        InlineErrorMessageView inlineErrorMessageView = r5.A03;
        if (A09) {
            inlineErrorMessageView.A04();
            C25786Drz A0Q = C18180wK.A0Q(r5.getActivity(), r5.A00);
            C18190wL.A10();
            String A0n = AnonymousClass0wJ.A0n(r5.A00);
            C28751uv r2 = new C28751uv();
            Bundle A06 = C18180wK.A06();
            A06.putString("email", A0n);
            C18180wK.A0x(A06, r2, A0Q);
            return;
        }
        inlineErrorMessageView.A05(r5.getString(2131829202));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(467452371);
        super.onCreate(bundle);
        UserSession A0W = AnonymousClass0wJ.A0W(this);
        this.A01 = A0W;
        H1T A0O = C18180wK.A0O(A0W);
        A0O.A0J("dyi/check_data_state/");
        C63873iU.A0C(this, AnonymousClass0wJ.A0T(A0O, DataDownloadStatusCheckResponse.class, C60193Ob.class), 159);
        C14030oh.A09(586726786, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1475376005);
        View inflate = layoutInflater.inflate(R.layout.data_download_request_fragment, viewGroup, false);
        int i = 2131824758;
        if (C63803iN.A05(AnonymousClass0TJ.A05, this.A01, 36324299358871974L).booleanValue()) {
            i = 2131824759;
        }
        AnonymousClass0wJ.A0L(inflate, R.id.header_text).setText(2131824761);
        AnonymousClass0wJ.A0L(inflate, R.id.body_text).setText(i);
        C18200wM.A0J(inflate, R.id.header_icon).setImageDrawable(AnonymousClass0wJ.A0B(this).getDrawable(R.drawable.download_your_data_icon, (Resources.Theme) null));
        ((ViewStub) inflate.requireViewById(R.id.inline_error_stub)).inflate();
        EditText editText = (EditText) inflate.requireViewById(R.id.text_field);
        this.A00 = editText;
        editText.setHint(2131826735);
        this.A00.setInputType(32);
        this.A00.setImeOptions(6);
        C18210wN.A12(this.A00, this, 16);
        this.A03 = (InlineErrorMessageView) inflate.requireViewById(R.id.inline_error);
        C18230wP.A0W(inflate, R.id.bottom_button_layout).setPrimaryActionOnClickListener(C18210wN.A0H(this, 274));
        View requireViewById = inflate.requireViewById(R.id.scroll_view);
        requireViewById.setVerticalScrollBarEnabled(false);
        inflate.addOnLayoutChangeListener(new IDxCListenerShape332S0100000_1_I2(requireViewById, 3));
        DataDownloadStatusCheckResponse dataDownloadStatusCheckResponse = this.A02;
        if (dataDownloadStatusCheckResponse == null || dataDownloadStatusCheckResponse.A00 == DataDownloadStatusCheckResponse.JobStatus.NO_VALID_DOWNLOADABLE) {
            A00(this);
        }
        C14030oh.A09(-318296173, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(557122421);
        super.onPause();
        Window A0F = C18180wK.A0F(this);
        A0F.getClass();
        A0F.setSoftInputMode(0);
        C18240wQ.A10(this);
        C14030oh.A09(1781358446, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(224311025);
        super.onResume();
        Window A0F = C18190wL.A0F(this);
        A0F.getClass();
        A0F.setSoftInputMode(16);
        C14030oh.A09(170450405, A022);
    }
}
