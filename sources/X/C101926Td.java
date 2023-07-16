package X;

import java.util.List;

/* renamed from: X.6Td  reason: invalid class name and case insensitive filesystem */
public final class C101926Td {
    public static final String A00(C90625Mt r3) {
        C04220Ms.A0B(r3, 0);
        List list = r3.A07;
        if (list == null || list.isEmpty()) {
            throw C18180wK.A0a("non-empty stickers expected");
        }
        String str = ((AnonymousClass5LA) list.get(0)).A00;
        if (str == null) {
            return "";
        }
        return str;
    }
}
