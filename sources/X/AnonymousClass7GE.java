package X;

import android.text.SpannableString;
import android.text.style.URLSpan;
import java.util.regex.Matcher;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7GE  reason: invalid class name */
public final class AnonymousClass7GE {
    public static final AnonymousClass7GE A00 = new AnonymousClass7GE();

    public static final C134747yH A00(AnonymousClass7F0 r31, String str, long j) {
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        SpannableString spannableString = new SpannableString(str2);
        C35578IyE.A00(spannableString);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        AnonymousClass7F0 r11 = new AnonymousClass7F0((C1201679b) null, (C1188372l) null, (C114236su) null, (C114246sv) null, (C134817yQ) null, (AnonymousClass83Y) null, (C114266sx) null, (AnonymousClass79I) null, (C121147Ei) null, (String) null, 16382, j, 0, 0, 0);
        Matcher matcher = AnonymousClass0hA.A02.matcher(str2);
        C134727yF r6 = new C134727yF((DefaultConstructorMarker) null, 0, 1);
        r6.A07(str2);
        C04220Ms.A04(uRLSpanArr);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            r6.A05(r11, spanStart, spanEnd);
            String url = uRLSpan.getURL();
            C04220Ms.A06(url);
            r6.A09("web_url_span", url, spanStart, spanEnd);
        }
        while (matcher.find()) {
            int start = matcher.start(1);
            int end = matcher.end(1);
            r6.A05(r31, start, end);
            String group = matcher.group(1);
            C04220Ms.A06(group);
            r6.A09("mention_span", group, start, end);
        }
        return r6.A01();
    }

    public static /* synthetic */ C134747yH A01(C134817yQ r23, String str, String str2, String str3, String str4, int i, long j, boolean z) {
        int i2;
        long j2 = j;
        C134817yQ r11 = r23;
        if ((i & 16) != 0) {
            r11 = null;
        }
        if ((i & 32) != 0) {
            j2 = AnonymousClass7KE.A06;
        }
        boolean A1R = C18240wQ.A1R(i & 64, z);
        String str5 = str2;
        String str6 = str4;
        C18180wK.A1P(str5, 1, str6);
        String str7 = str;
        if (A1R) {
            i2 = AnonymousClass8bP.A0I(str7, str5);
            if (i2 < 0) {
                throw C18180wK.A0a("Check failed.");
            }
        } else {
            i2 = AnonymousClass8bP.A0J(str7, str5, 0, false);
            if (i2 < 0) {
                throw C18180wK.A0a("Check failed.");
            }
        }
        int length = str5.length() + i2;
        C134727yF r1 = new C134727yF((DefaultConstructorMarker) null, 0, 1);
        r1.A07(str7);
        r1.A05(new AnonymousClass7F0((C1201679b) null, (C1188372l) null, (C114236su) null, (C114246sv) null, r11, (AnonymousClass83Y) null, (C114266sx) null, (AnonymousClass79I) null, (C121147Ei) null, (String) null, 16378, j2, 0, 0, 0), i2, length);
        r1.A09(str3, str6, i2, length);
        return r1.A01();
    }
}
