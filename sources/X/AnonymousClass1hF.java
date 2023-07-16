package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.1hF  reason: invalid class name */
public final class AnonymousClass1hF extends C63873iU {
    public String A00;
    public final /* synthetic */ AnonymousClass3T0 A01;

    public AnonymousClass1hF(AnonymousClass3T0 r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A03 = C14030oh.A03(-1923784361);
        C62973bE.A02(this.A01.A00.requireContext(), r3);
        C14030oh.A0A(653823593, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(1086274570);
        int A032 = C14030oh.A03(243197169);
        AnonymousClass3T0 r0 = this.A01;
        Fragment fragment = r0.A00;
        C25786Drz A002 = C63463hW.A00(fragment.getActivity(), r0.A02);
        AnonymousClass1aA r1 = new AnonymousClass1aA();
        String str = this.A00;
        AnonymousClass3Um r02 = ((AnonymousClass1U3) obj).A01;
        Bundle A06 = C18180wK.A06();
        r02.A00(A06);
        AnonymousClass2SL.A00(A06, str, (String) null, (String) null, false, false);
        A002.A0A(A06, r1);
        A002.A0C(fragment, 0);
        A002.A05();
        C14030oh.A0A(1624612814, A032);
        C14030oh.A0A(-1172949484, A03);
    }
}
