package X;

import android.text.TextUtils;
import com.instagram.model.venue.Venue;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.61h  reason: invalid class name and case insensitive filesystem */
public final class C955861h extends AnonymousClass7HN {
    public String A00;
    public String A01;
    public final UserSession A02;
    public final long A03;
    public final C03710Kk A04;
    public final C11630kW A05;
    public final Integer A06;
    public final String A07 = C18180wK.A0e();

    public static C15730rn A00(C955861h r5, String str) {
        String str2;
        String str3;
        C15730rn A002 = C15730rn.A00(r5.A05, str);
        A002.A0D(C62983bG.A03(21, 10, 90), r5.A07);
        switch (r5.A06.intValue()) {
            case 1:
                str2 = "IG_POST";
                break;
            case 2:
                str2 = "IG_POST_SKITTLES";
                break;
            case 3:
                str2 = "IG_EDIT_POST";
                break;
            case 4:
                str2 = "IG_GUIDE";
                break;
            case 5:
                str2 = "IG_CLIPS";
                break;
            case 6:
                str2 = "IG_EVENT";
                break;
            default:
                str2 = "IG_STORY";
                break;
        }
        A002.A0D("surface", str2);
        if (TextUtils.isEmpty(r5.A00)) {
            str3 = "";
        } else {
            str3 = r5.A00;
        }
        A002.A0D("query", str3);
        A002.A0C("milliseconds_since_start", Long.valueOf(r5.A04.now() - r5.A03));
        if (!TextUtils.isEmpty(r5.A01)) {
            A002.A0D("results_list_id", r5.A01);
        }
        return A002;
    }

    public static void A01(C15730rn r4, List list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = ((Venue) list.get(i)).A02();
            }
            r4.A05.A0H(I17.A00(838), strArr);
        }
    }

    public C955861h(C03710Kk r3, C11630kW r4, UserSession userSession, Integer num) {
        this.A02 = userSession;
        this.A05 = r4;
        this.A06 = num;
        this.A03 = r3.now();
        this.A04 = r3;
    }
}
