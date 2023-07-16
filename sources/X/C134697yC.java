package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7yC  reason: invalid class name and case insensitive filesystem */
public final class C134697yC implements Serializable {
    public final Pattern A00;

    public C134697yC(Set set, String str) {
        C04220Ms.A0B(set, 2);
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((C97366Bb) ((C142588fG) it.next())).A00;
        }
        Pattern compile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        C04220Ms.A06(compile);
        this.A00 = compile;
    }

    public static /* synthetic */ C110166lE A00(CharSequence charSequence, C134697yC r4) {
        Matcher matcher = r4.A00.matcher(charSequence);
        C04220Ms.A06(matcher);
        if (!matcher.find(0)) {
            return null;
        }
        return new C110166lE(charSequence, matcher);
    }

    public final List A02(CharSequence charSequence, int i) {
        C04220Ms.A0B(charSequence, 0);
        Matcher matcher = this.A00.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C18180wK.A0n(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0) {
            i2 = i;
        }
        ArrayList A0k = C18240wQ.A0k(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            C18210wN.A1O(charSequence.subSequence(i3, matcher.start()), A0k);
            i3 = matcher.end();
            if ((i4 >= 0 && A0k.size() == i4) || !matcher.find()) {
                C18210wN.A1O(charSequence.subSequence(i3, charSequence.length()), A0k);
            }
            C18210wN.A1O(charSequence.subSequence(i3, matcher.start()), A0k);
            i3 = matcher.end();
            break;
        } while (!matcher.find());
        C18210wN.A1O(charSequence.subSequence(i3, charSequence.length()), A0k);
        return A0k;
    }

    public final boolean A03(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        return this.A00.matcher(charSequence).find();
    }

    public final boolean A04(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        return C18240wQ.A1V(charSequence, this.A00);
    }

    public final String toString() {
        return C18190wL.A0n(this.A00);
    }

    public final String A01(CharSequence charSequence, String str) {
        AnonymousClass0wJ.A1N(charSequence, str);
        String replaceAll = this.A00.matcher(charSequence).replaceAll(str);
        C04220Ms.A06(replaceAll);
        return replaceAll;
    }

    public C134697yC(String str) {
        C04220Ms.A0B(str, 1);
        Pattern compile = Pattern.compile(str);
        C04220Ms.A06(compile);
        this.A00 = compile;
    }
}
