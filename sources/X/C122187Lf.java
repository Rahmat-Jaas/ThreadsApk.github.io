package X;

import android.content.DialogInterface;
import com.instagram.common.api.base.IDxACallbackShape36S0200000_2_I2;
import com.instagram.service.session.UserSession;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.7Lf  reason: invalid class name and case insensitive filesystem */
public final class C122187Lf implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C34640IcN A02;
    public final /* synthetic */ EO9 A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C122187Lf(C34640IcN icN, EO9 eo9, UserSession userSession, Integer num, String str, String str2, int i, int i2) {
        this.A02 = icN;
        this.A04 = userSession;
        this.A05 = num;
        this.A06 = str;
        this.A07 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = eo9;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C34640IcN icN = this.A02;
        C18330wh A012 = C18330wh.A01(icN);
        A012.A04(AnonymousClass0wJ.A0B(icN).getString(2131832819));
        UserSession userSession = this.A04;
        Integer num = this.A05;
        String str2 = this.A06;
        String str3 = this.A07;
        int i2 = this.A01;
        int i3 = this.A00;
        C04220Ms.A0B(num, 1);
        String A0o = C86154wM.A0o(Locale.US, "music/track/%s/lyrics/report/", Arrays.copyOf(new Object[]{str2}, 1));
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J(A0o);
        A0O.A0O("audio_asset_id", str2);
        A0O.A0O("audio_cluster_id", str3);
        if (num.intValue() != 0) {
            str = "misaligned_timestamps";
        } else {
            str = "words_contain_mistakes";
        }
        A0O.A0O("feedback_type", str);
        A0O.A0O(AnonymousClass000.A00(792), String.valueOf(i2));
        C32165H8c A0T = C86104wH.A0T(A0O, "audio_snippet_duration_in_ms", String.valueOf(i3));
        A0T.A00 = new IDxACallbackShape36S0200000_2_I2(11, this.A03, A012);
        icN.schedule(A0T);
    }
}
