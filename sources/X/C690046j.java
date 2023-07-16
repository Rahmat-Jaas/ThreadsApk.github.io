package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.46j  reason: invalid class name and case insensitive filesystem */
public final class C690046j implements C82394pY {
    public final /* synthetic */ AnonymousClass1aA A00;

    public C690046j(AnonymousClass1aA r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        String str;
        int A03 = C14030oh.A03(240669527);
        AnonymousClass45R r8 = (AnonymousClass45R) obj;
        int A032 = C14030oh.A03(1144252275);
        AnonymousClass1aA r6 = this.A00;
        Bundle bundle = r6.mArguments;
        if (!(bundle == null || bundle.getString("PHONE_NUMBER") == null)) {
            Bundle bundle2 = r6.mArguments;
            if (bundle2 != null) {
                str = bundle2.getString("PHONE_NUMBER");
            } else {
                str = null;
            }
            if (str.equals(r8.A02)) {
                Context requireContext = r6.requireContext();
                String string = r6.getString(2131826851);
                String str2 = r8.A01;
                if (TextUtils.isEmpty(str2)) {
                    str2 = C18230wP.A0l(r6);
                }
                C62973bE.A04(requireContext, str2, string);
                i = -1521928810;
                C14030oh.A0A(i, A032);
                C14030oh.A0A(-1497926542, A03);
            }
        }
        i = 1940679066;
        C14030oh.A0A(i, A032);
        C14030oh.A0A(-1497926542, A03);
    }
}
