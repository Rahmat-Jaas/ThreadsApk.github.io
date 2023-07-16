package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7EZ  reason: invalid class name */
public final class AnonymousClass7EZ {
    public static final Pattern A09 = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final String A04;
    public final List A05 = AnonymousClass0wJ.A0v();
    public final Map A06 = C18220wO.A0y();
    public final C04530Oa A07 = C86114wI.A0w(this, 1);
    public final C04530Oa A08 = C86114wI.A0w(this, 2);

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass7EZ)) {
            return false;
        }
        return C86134wK.A1a(this.A04, ((AnonymousClass7EZ) obj).A04, false);
    }

    public final int hashCode() {
        return C18220wO.A07(this.A04) * 31 * 31;
    }

    public AnonymousClass7EZ(String str) {
        this.A04 = str;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.A02 = AnonymousClass0wJ.A1W(parse.getQuery());
            StringBuilder A0s = C18190wL.A0s("^");
            if (!A09.matcher(str).find()) {
                A0s.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.A02) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String A0s2 = C18230wP.A0s(str, 0, matcher.start());
                    C04220Ms.A06(compile);
                    this.A01 = A00(A0s2, A0s, compile);
                }
                Iterator<String> it = parse.getQueryParameterNames().iterator();
                while (it.hasNext()) {
                    String A0k = C18180wK.A0k(it);
                    StringBuilder A0r = C18200wM.A0r();
                    String queryParameter = parse.getQueryParameter(A0k);
                    if (queryParameter == null) {
                        this.A03 = true;
                        queryParameter = A0k;
                    }
                    Matcher matcher2 = compile.matcher(queryParameter);
                    C106936fs r3 = new C106936fs();
                    int i = 0;
                    while (matcher2.find()) {
                        String group = matcher2.group(1);
                        if (group != null) {
                            r3.A01.add(group);
                            C04220Ms.A09(queryParameter);
                            A0r.append(Pattern.quote(C18230wP.A0s(queryParameter, i, matcher2.start())));
                            A0r.append("(.+?)?");
                            i = matcher2.end();
                        } else {
                            throw C18210wN.A0W("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i < queryParameter.length()) {
                        A0r.append(Pattern.quote(C86134wK.A0q(queryParameter, i)));
                    }
                    r3.A00 = AnonymousClass8bQ.A0l(C18190wL.A0n(A0r), ".*", "\\E.*\\Q", false);
                    Map map = this.A06;
                    C04220Ms.A04(A0k);
                    map.put(A0k, r3);
                }
            } else {
                C04220Ms.A06(compile);
                this.A01 = A00(str, A0s, compile);
            }
            this.A00 = AnonymousClass8bQ.A0l(C18190wL.A0n(A0s), ".*", "\\E.*\\Q", false);
        }
    }

    private final boolean A00(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !AnonymousClass8bP.A0j(str, ".*", false);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.A05.add(group);
                sb.append(Pattern.quote(C18230wP.A0s(str, i, matcher.start())));
                sb.append("([^/]+?)");
                i = matcher.end();
                z = false;
            } else {
                throw C18210wN.A0W("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(C86134wK.A0q(str, i)));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }
}
