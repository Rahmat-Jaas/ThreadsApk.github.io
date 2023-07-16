package X;

import android.os.Bundle;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.4Et  reason: invalid class name and case insensitive filesystem */
public final class C70464Et implements C82774qF {
    public final /* synthetic */ C26651qz A00;
    public final /* synthetic */ C24441io A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public C70464Et(C26651qz r1, C24441io r2, List list, List list2) {
        this.A01 = r2;
        this.A02 = list;
        this.A03 = list2;
        this.A00 = r1;
    }

    public final void CwK(Bundle bundle) {
        String str;
        C24441io r4 = this.A01;
        bundle.putString("extra_cal_fb_user_id", r4.A07);
        bundle.putStringArrayList("extra_cal_usernames", C18200wM.A0s(this.A02));
        List list = this.A03;
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C569038z r5 = (C569038z) list.get(i);
            try {
                StringWriter A0d = C18230wP.A0d();
                MMp A0K = C18180wK.A0K(A0d);
                String str2 = r5.A01;
                if (str2 != null) {
                    A0K.A0d(C63383hO.A00(), str2);
                }
                String str3 = r5.A00;
                if (str3 != null) {
                    A0K.A0d("prototype", str3);
                }
                str = C18180wK.A0h(A0K, A0d);
            } catch (IOException unused) {
                str = null;
            }
            strArr[i] = str;
        }
        bundle.putStringArray("extra_cal_usernames_with_metadata", strArr);
        bundle.putString("extra_cal_tos_version", this.A00.A0B);
        bundle.putBoolean("extra_cal_force_signup_with_fb_after_cp_claiming", r4.A03);
        bundle.putString("extra_cal_registration_source", r4.A04.A0A.A01);
    }
}
