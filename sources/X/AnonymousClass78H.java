package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.78H  reason: invalid class name */
public final class AnonymousClass78H {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public AnonymousClass78H() {
        this((String) null, (String) null, (String) null, StringTreeSet.MAX_SYMBOL_COUNT, (String) null, (String) null, (String) null);
    }

    public /* synthetic */ AnonymousClass78H(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        String str7;
        if ((i & 1) != 0) {
            str7 = new SimpleDateFormat(AnonymousClass000.A00(495), Locale.US).format(C18200wM.A0c());
            C04220Ms.A06(str7);
        } else {
            str7 = null;
        }
        String str8 = null;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        str8 = (i & 64) == 0 ? str6 : str8;
        C04220Ms.A0B(str7, 1);
        this.A06 = str7;
        this.A01 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A00 = str4;
        this.A04 = str5;
        this.A03 = str8;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("time: ");
        A0s.append(this.A06);
        A0s.append(" container_module: ");
        A0s.append(this.A01);
        A0s.append("  sessionId: ");
        A0s.append(this.A05);
        A0s.append("  action: ");
        A0s.append(this.A02);
        A0s.append(" ad_id: ");
        A0s.append(this.A00);
        A0s.append(" media_id: ");
        A0s.append(this.A04);
        A0s.append(" extraData: ");
        return C18180wK.A0i(this.A03, A0s);
    }
}
