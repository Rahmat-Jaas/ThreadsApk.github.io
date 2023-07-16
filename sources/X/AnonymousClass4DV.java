package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.4DV  reason: invalid class name */
public final class AnonymousClass4DV implements C27689Erf, C27691Erh {
    public static final AnonymousClass4DV A00 = new AnonymousClass4DV();

    public final Fragment Ajk(Object obj) {
        C04220Ms.A0B(obj, 0);
        C23032CkW ckW = (C23032CkW) obj;
        C62883b4.A04();
        String str = ckW.A02;
        String str2 = ckW.A01;
        String str3 = ckW.A00;
        C23331da r2 = new C23331da();
        Bundle A06 = C18180wK.A06();
        A06.putString("pages_connect_header_subtitle", str);
        A06.putString("pages_no_admin_pages_header_string", str2);
        A06.putString("pages_no_admin_pages_explanation_string", str3);
        r2.setArguments(A06);
        return r2;
    }

    public final String getName() {
        return "x_post_facebook";
    }
}
