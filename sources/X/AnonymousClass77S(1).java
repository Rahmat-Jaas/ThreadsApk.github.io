package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.77S  reason: invalid class name */
public final class AnonymousClass77S {
    public final LinkedList A00;

    public static void A00(AnonymousClass77S r12, String str, boolean z) {
        String str2;
        Object[] objArr;
        String str3;
        Pattern compile = Pattern.compile(AnonymousClass00U.A0V("^a=rtpmap:(\\d+) ", str, "(/\\d+)+[\r]?$"));
        if (z) {
            str2 = "m=audio ";
        } else {
            str2 = "m=video ";
        }
        LinkedList linkedList = r12.A00;
        ListIterator listIterator = linkedList.listIterator();
        String str4 = null;
        String str5 = null;
        int i = -1;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            String str6 = (String) listIterator.next();
            if (str6.startsWith(str2)) {
                i = nextIndex;
                str5 = str6;
            } else {
                Matcher matcher = compile.matcher(str6);
                if (matcher.matches()) {
                    str4 = matcher.group(1);
                }
            }
        }
        if (i == -1) {
            objArr = new Object[]{str2, str};
            str3 = "No %s line, so can't prefer %s";
        } else if (str4 == null) {
            objArr = new Object[]{str};
            str3 = "No rtpmap for %s";
        } else {
            String[] split = str5.split(" ");
            int length = split.length;
            int i2 = 3;
            if (length > 3) {
                StringBuilder A0r = C18200wM.A0r();
                A0r.append(split[0]);
                A0r.append(" ");
                A0r.append(split[1]);
                A0r.append(" ");
                C18230wP.A1S(split[2], " ", str4, A0r);
                do {
                    if (!split[i2].equals(str4)) {
                        A0r.append(" ");
                        A0r.append(split[i2]);
                    }
                    i2++;
                } while (i2 < length);
                linkedList.set(i, A0r.toString());
                return;
            }
            AnonymousClass0LU.A0N("SdpEditor", "Wrong SDP media description format: %s", str5);
            return;
        }
        AnonymousClass0LU.A0O("SdpEditor", str3, objArr);
    }

    public AnonymousClass77S(String str) {
        this.A00 = new LinkedList(Arrays.asList(str.split("\\r\\n?|\\n")));
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            A0r.append(C18180wK.A0k(it));
            A0r.append("\r\n");
        }
        return A0r.toString();
    }
}
