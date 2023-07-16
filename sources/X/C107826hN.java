package X;

import android.net.Uri;
import android.text.SpannableString;
import android.text.style.URLSpan;
import java.util.regex.Matcher;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6hN  reason: invalid class name and case insensitive filesystem */
public final class C107826hN {
    public final C147368pE A00;
    public final C134747yH A01;

    public C107826hN(long j, String str, boolean z) {
        C134747yH r1;
        String host;
        StringBuilder A0r;
        int codePointAt;
        long j2 = j;
        AnonymousClass7F0 r9 = new AnonymousClass7F0((C1201679b) null, (C1188372l) null, (C114236su) null, (C114246sv) null, (C134817yQ) null, (AnonymousClass83Y) null, (C114266sx) null, (AnonymousClass79I) null, (C121147Ei) null, (String) null, 16382, j2, 0, 0, 0);
        String str2 = str;
        SpannableString spannableString = new SpannableString(str2);
        C35578IyE.A00(spannableString);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        AnonymousClass7F0 r25 = new AnonymousClass7F0((C1201679b) null, (C1188372l) null, (C114236su) null, (C114246sv) null, (C134817yQ) null, (AnonymousClass83Y) null, (C114266sx) null, (AnonymousClass79I) null, (C121147Ei) null, (String) null, 16382, j2, 0, 0, 0);
        int i = 0;
        try {
            C134727yF r14 = new C134727yF((DefaultConstructorMarker) null, 0, 1);
            String str3 = "";
            String str4 = str3;
            C04220Ms.A04(uRLSpanArr);
            int length = uRLSpanArr.length;
            int i2 = 0;
            while (i2 < length) {
                URLSpan uRLSpan = uRLSpanArr[i2];
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                while (true) {
                    int i3 = spanEnd + 1;
                    if (AnonymousClass0hA.A01(str2) <= i3 || (codePointAt = str2.codePointAt(spanEnd)) == 10 || codePointAt == 32) {
                        String A0s = C18230wP.A0s(str2, i, spanStart);
                        r14.A07(A0s);
                        String A0L = AnonymousClass00U.A0L(str3, A0s);
                        String url = uRLSpan.getURL();
                        C04220Ms.A06(url);
                        Uri A002 = C15430rJ.A00(new C36890Jge(C18170wI.A00(266)).A01, url, false);
                    } else {
                        spanEnd = i3;
                    }
                }
                String A0s2 = C18230wP.A0s(str2, i, spanStart);
                r14.A07(A0s2);
                String A0L2 = AnonymousClass00U.A0L(str3, A0s2);
                String url2 = uRLSpan.getURL();
                C04220Ms.A06(url2);
                Uri A0022 = C15430rJ.A00(new C36890Jge(C18170wI.A00(266)).A01, url2, false);
                if (!(A0022 == null || (host = A0022.getHost()) == null)) {
                    String A0Q = AnonymousClass8bP.A0Q("www.", host);
                    if (AnonymousClass0hA.A01(A0Q) >= 30) {
                        A0r = C18200wM.A0r();
                        A0r.append(C18230wP.A0s(A0Q, 0, 30));
                        A0r.append(8230);
                    } else {
                        String path = A0022.getPath();
                        path = path == null ? str4 : path;
                        if (path.length() > 0 && path.charAt(path.length() - 1) == '/') {
                            int A012 = AnonymousClass0hA.A01(path) - 1;
                            path = C18230wP.A0s(path, 0, A012 < 0 ? 0 : A012);
                        }
                        if (path.length() != 0) {
                            int A013 = AnonymousClass0hA.A01(path);
                            String A0s3 = C18230wP.A0s(path, 0, 6 > A013 ? A013 : 6);
                            int length2 = A0s3.length() - 1;
                            if (length2 >= 0) {
                                while (true) {
                                    int i4 = length2 - 1;
                                    if (!Character.isLetterOrDigit(A0s3.charAt(length2))) {
                                        if (i4 < 0) {
                                            break;
                                        }
                                        length2 = i4;
                                    } else {
                                        break;
                                    }
                                }
                            }
                            length2 = 0;
                            int i5 = length2 + 1;
                            int A014 = AnonymousClass0hA.A01(path);
                            String A0s4 = C18230wP.A0s(path, 0, i5 > A014 ? A014 : i5);
                            if (!A0s4.equals(path)) {
                                path = AnonymousClass00U.A0A(A0s4, 8230);
                            }
                        }
                        A0r = C18200wM.A0r();
                        A0r.append(A0Q);
                        A0r.append(path);
                    }
                    url2 = A0r.toString();
                }
                r14.A07(url2);
                str3 = AnonymousClass00U.A0L(A0L2, url2);
                int A015 = AnonymousClass0hA.A01(str3);
                int A016 = AnonymousClass0hA.A01(str3) - AnonymousClass0hA.A01(url2);
                r14.A05(r25, A016, A015);
                String url3 = uRLSpan.getURL();
                C04220Ms.A06(url3);
                r14.A09("web_url_span", url3, A016, A015);
                i2++;
                i = spanEnd;
            }
            if (i != AnonymousClass0hA.A01(str2)) {
                String A0q = C86134wK.A0q(str2, i);
                r14.A07(A0q);
                str3 = AnonymousClass00U.A0L(str3, A0q);
            }
            Matcher matcher = AnonymousClass0hA.A02.matcher(str3);
            while (matcher.find()) {
                int start = matcher.start(1);
                int end = matcher.end(1);
                r14.A05(r9, start, end);
                String group = matcher.group(1);
                C04220Ms.A06(group);
                r14.A09("mention_span", group, start, end);
            }
            r1 = r14.A01();
        } catch (StringIndexOutOfBoundsException unused) {
            C10450iM.A02("BarcelonaSpanUtil:IndexOutOfBounds", AnonymousClass006.A0C, AnonymousClass00U.A0L("error when shrink link on text ", z ^ true ? str2 : null));
            r1 = AnonymousClass7GE.A00(r9, str2, j2);
        }
        this.A01 = r1;
        this.A00 = C86104wH.A0I(AnonymousClass7WR.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }
}
