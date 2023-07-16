package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3h8  reason: invalid class name and case insensitive filesystem */
public final class C63263h8 {
    public static String A00 = "";
    public static String A01 = "";
    public static HashSet A02 = C18200wM.A0u();
    public static HashSet A03 = C18200wM.A0u();

    public static AnonymousClass4A9 A00(C10300i6 r7, String str, Map map) {
        return new AnonymousClass4A9(A02(r7, str, (String) null, map, 0, 0, false));
    }

    public static AnonymousClass4A9 A01(C10300i6 r7, String str, Map map) {
        return new AnonymousClass4A9(A02(r7, str, (String) null, map, 0, 0, false));
    }

    public static C32165H8c A02(C10300i6 r6, String str, String str2, Map map, int i, long j, boolean z) {
        String str3;
        Class cls;
        Class cls2;
        H1T A0N = AnonymousClass0wJ.A0N(r6);
        A0N.A0J(AnonymousClass00U.A0V("bloks/apps/", str, "/"));
        A0N.A0O("bloks_versioning_id", "5f56efad68e1edec7801f630b5c122704ec5378adbee6609a448f105f34a9c73");
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            A0K.A0d("bloks_version", "5f56efad68e1edec7801f630b5c122704ec5378adbee6609a448f105f34a9c73");
            A0K.A0d("styles_id", "instagram");
            str3 = C18180wK.A0h(A0K, A0d);
        } catch (IOException e) {
            C10450iM.A06("IgBloksClientContext", "Error jsonizing IgBloksClientContext", e);
            str3 = "";
        }
        A0N.A0O("bk_client_context", str3);
        A0N.A0G(AnonymousClass006.A0Y);
        if (z) {
            cls = AnonymousClass1eG.class;
            cls2 = C59443Kv.class;
        } else {
            cls = AnonymousClass1eF.class;
            cls2 = C59433Ku.class;
        }
        A0N.A0B(cls, cls2);
        if (i == 3) {
            A0N.A05();
        }
        boolean z2 = false;
        if (j >= C18210wN.A06()) {
            z2 = true;
        }
        if (str2 != null && z2) {
            A0N.A0I(str2);
            A0N.A0E(AnonymousClass006.A0N);
            A0N.A07(j);
        }
        if (map != null) {
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                A0N.A0O(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
        }
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (C63173fJ.A05(r3, 18311696145851813L)) {
            String A04 = C63173fJ.A04(r3, 18874646099132921L);
            if (!A00.equals(A04)) {
                A00 = A04;
                A02 = A03(A04);
            }
            if (A02.contains(str)) {
                A0N.A04.A0G = true;
            }
        }
        if (C63173fJ.A05(r3, 18311696145917350L)) {
            String A042 = C63173fJ.A04(r3, 18874646099198458L);
            if (!A01.equals(A042)) {
                A01 = A042;
                A03 = A03(A042);
            }
            if (A03.contains(str)) {
                A0N.A04.A0H = true;
            }
        }
        return A0N.A02();
    }

    public static synchronized HashSet A03(String str) {
        HashSet A0u;
        synchronized (C63263h8.class) {
            A0u = C18200wM.A0u();
            if (!str.isEmpty()) {
                for (String str2 : str.trim().split("\\s*,\\s*")) {
                    if (!str2.isEmpty()) {
                        A0u.add(str2);
                    }
                }
            }
        }
        return A0u;
    }
}
