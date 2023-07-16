package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;

/* renamed from: X.1xu  reason: invalid class name and case insensitive filesystem */
public final class C29381xu extends C18720xk {
    public final Uri A00;
    public final C10300i6 A01;

    public final void onClick(View view) {
        Uri uri = this.A00;
        C10650ih.A06(view.getContext(), uri);
        C10300i6 r3 = this.A01;
        C15730rn A002 = C63313hF.A00(r3, "terms_of_service_link_clicked");
        A002.A0D("uri_path", uri.getPath());
        C18180wK.A1K(A002, r3);
    }

    public C29381xu(Context context, C10300i6 r3, String str, int i) {
        super(i);
        this.A00 = AnonymousClass3W8.A00(context, C15430rJ.A01(str));
        this.A01 = r3;
    }
}
