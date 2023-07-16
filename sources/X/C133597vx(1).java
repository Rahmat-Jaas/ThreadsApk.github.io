package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.7vx  reason: invalid class name and case insensitive filesystem */
public final class C133597vx implements C39777Kzl {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass79D A02;
    public final /* synthetic */ C134527xq A03;
    public final /* synthetic */ String A04;

    public final void onShow() {
    }

    public C133597vx(Fragment fragment, UserSession userSession, AnonymousClass79D r3, C134527xq r4, String str) {
        this.A02 = r3;
        this.A04 = str;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A03 = r4;
    }

    public final void onButtonClick(View view) {
        this.A02.A03("upsell_snackbar", this.A04, I17.A00(557), I17.A00(218));
        Bundle A06 = C18180wK.A06();
        A06.putString(C18170wI.A00(351), "upsell");
        Fragment fragment = this.A00;
        C63863iT.A05(fragment.getActivity(), A06, this.A01, ModalActivity.class, C18170wI.A00(197)).A0I(fragment.getActivity());
    }

    public final void onDismiss() {
        this.A03.A00 = null;
    }
}
