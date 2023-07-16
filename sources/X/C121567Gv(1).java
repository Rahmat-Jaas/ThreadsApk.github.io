package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import org.json.JSONObject;

/* renamed from: X.7Gv  reason: invalid class name and case insensitive filesystem */
public final class C121567Gv {
    public BlockingDeque A00 = new LinkedBlockingDeque();
    public final String A01;

    public final void A03(C109756kZ r8) {
        BlockingDeque blockingDeque = this.A00;
        C109756kZ r5 = (C109756kZ) blockingDeque.peekLast();
        if (r5 == null || r5.A03 != r8.A03 || r5.A01 != r8.A01) {
            blockingDeque.add(r8);
        }
    }

    public C121567Gv(String str) {
        this.A01 = str;
    }

    public static C109756kZ A00(List list, int i) {
        return (C109756kZ) list.get(i);
    }

    public static String A01(List list) {
        Integer num;
        long j;
        int size = list.size();
        int i = 0;
        if (list.isEmpty() || 0 >= list.size() || size <= 0 || size > list.size()) {
            return null;
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        C109756kZ A002 = A00(list, 0);
        A0y.put("f0", Arrays.asList(new String[]{Long.toString(A002.A03), Long.toString(A002.A01), Long.toString(A002.A02)}));
        A0y.put(ClientCookie.VERSION_ATTR, 1);
        boolean z = false;
        if (size > 1) {
            int i2 = size;
            while (true) {
                i2--;
                if (i2 <= 0) {
                    break;
                }
                int i3 = i2 - 1;
                A00(list, i2).A03 -= A00(list, i3).A03;
                A00(list, i2).A01 -= A00(list, i3).A01;
                A00(list, i2).A02 -= A00(list, i3).A02;
                C109756kZ A003 = A00(list, i2);
                if (A00(list, i3).A00 == -1) {
                    j = 0;
                } else {
                    j = A00(list, i2).A00 - A00(list, i3).A00;
                }
                A003.A00 = j;
                A00(list, i2).A02 -= A00(list, i2).A01;
            }
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            int i4 = 1;
            int i5 = 1;
            do {
                long j2 = A00(list, i5).A03;
                long j3 = A00(list, i5).A01;
                Long valueOf = Long.valueOf(j2);
                int i6 = 1;
                if (A0y2.containsKey(valueOf)) {
                    num = Integer.valueOf(AnonymousClass0wJ.A04(A0y2.get(valueOf)) + 1);
                } else {
                    num = 1;
                }
                A0y2.put(valueOf, num);
                Long valueOf2 = Long.valueOf(j3);
                if (A0y2.containsKey(valueOf2)) {
                    i6 = AnonymousClass0wJ.A04(A0y2.get(valueOf2)) + 1;
                }
                C86134wK.A1P(valueOf2, A0y2, i6);
                i5++;
            } while (i5 < size);
            long j4 = 3333;
            int i7 = 0;
            Iterator A0u = C18190wL.A0u(A0y2);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                int A04 = AnonymousClass0wJ.A04(A0o.getValue());
                if (i7 < A04) {
                    j4 = C18190wL.A08(A0o.getKey());
                    i7 = A04;
                }
            }
            do {
                A00(list, i4).A03 -= j4;
                A00(list, i4).A01 -= j4;
                i4++;
            } while (i4 < size);
            A0y.put("baseDelta", Long.valueOf(j4));
            ArrayList A0v = AnonymousClass0wJ.A0v();
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                }
                C86144wL.A1U(A0v, A00(list, i).A03);
                C86144wL.A1U(A0v, A00(list, i).A01);
                C86144wL.A1U(A0v, A00(list, i).A02);
                C86144wL.A1U(A0v2, A00(list, i).A00);
                if (A00(list, i).A00 != 0) {
                    z = true;
                }
            }
            A0y.put("fn", A02(A0v));
            A0y.put("fAudio", A02(A0v2));
            A0y.put("isSoundOn", Boolean.valueOf(z));
        }
        String obj = new JSONObject(A0y).toString();
        if (obj.length() > 900000) {
            return "{\"err\":\"SIZE_EXCEED_MAX_CAP\"}";
        }
        return obj;
    }

    public static String A02(List list) {
        StringBuilder A0r = C18200wM.A0r();
        for (Object A08 : list) {
            long A082 = C18190wL.A08(A08);
            long j = (A082 >> 63) ^ (A082 << 1);
            while (true) {
                long j2 = (long) 128;
                if (j < j2) {
                    break;
                }
                j >>= 7;
                A0r.append((char) ((int) (j2 | (((long) StringTreeSet.MAX_SYMBOL_COUNT) & j))));
            }
            A0r.append((char) ((int) j));
        }
        StringBuilder A0s = C18190wL.A0s(A0r.toString());
        StringBuilder A0r2 = C18200wM.A0r();
        StringBuilder A0r3 = C18200wM.A0r();
        int length = A0s.length() % 3;
        if (length > 0) {
            while (length < 3) {
                A0r3.append('=');
                A0s.append(0);
                length++;
            }
        }
        for (int i = 0; i < A0s.length(); i += 3) {
            int charAt = (A0s.charAt(i) << 16) + (A0s.charAt(i + 1) << 8) + A0s.charAt(i + 2);
            A0r2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 18) & 63));
            A0r2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 12) & 63));
            A0r2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 6) & 63));
            A0r2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(charAt & 63));
        }
        return C86104wH.A0x(A0r3, A0r2.substring(0, A0r2.length() - A0r3.length()), C18200wM.A0r());
    }
}
