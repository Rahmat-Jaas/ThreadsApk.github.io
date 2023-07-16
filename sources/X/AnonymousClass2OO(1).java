package X;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import libraries.access.src.main.sharedstorage.common.ReplicatedStorageRequest;

/* renamed from: X.2OO  reason: invalid class name */
public final class AnonymousClass2OO {
    public static AnonymousClass3AB A00(Context context, C10300i6 r23, Boolean bool, String str) {
        AnonymousClass3AB r3;
        boolean z;
        C307822y r0;
        int i;
        String A0h = C18230wP.A0h();
        C10300i6 r8 = r23;
        if (bool.booleanValue()) {
            LinkedHashSet<AnonymousClass255> linkedHashSet = new LinkedHashSet<>();
            linkedHashSet.add(AnonymousClass255.KATANA);
            linkedHashSet.add(AnonymousClass255.WAKIZASHI);
            r3 = null;
            for (AnonymousClass255 r10 : linkedHashSet) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                int ordinal = r10.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    A0v.add(new C61243Sl(C311624m.FACEBOOK, AnonymousClass24G.ACTIVE_ACCOUNT));
                    List A00 = C54742zw.A00(A0h, "InstagramSsoLoginUtil", new C81124nC(r8), new ReplicatedStorageRequest(A0v));
                    if (!(A00.isEmpty() || A00.get(0) == null || ((AnonymousClass3HZ) A00.get(0)).A01 == null)) {
                        AnonymousClass3HZ r1 = (AnonymousClass3HZ) A00.get(0);
                        r3 = new AnonymousClass3AB();
                        r3.A02 = r1.A01;
                        C566037v r6 = new C566037v();
                        r6.A01 = r1.A02;
                        Map map = r1.A03;
                        if (!map.isEmpty()) {
                            String str2 = "";
                            if (map.containsKey("profile_photo_url")) {
                                map.get("profile_photo_url");
                            }
                            if (map.containsKey("user_name")) {
                                str2 = C18210wN.A0g("user_name", map);
                            }
                            r6.A00 = str2;
                        }
                        r3.A00 = r6;
                        r3.A01 = r10;
                    }
                } else {
                    throw C18180wK.A0a("SsoApplication not supported.");
                }
            }
            if (r3 == null) {
                z = true;
            }
            return r3;
        }
        z = false;
        C57723Cf r12 = new C57723Cf();
        r12.A02 = new AnonymousClass4VE(r8, str);
        r12.A03 = new C81124nC(r8);
        C63053bO r62 = new C63053bO(r12);
        Iterator it = C63443hU.A02().iterator();
        r3 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass255 r102 = (AnonymousClass255) it.next();
            try {
                Context applicationContext = context.getApplicationContext();
                C84644tb r11 = r62.A02;
                r11.onStart();
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                for (C62273Yb r2 : r62.A04.A00(EnumSet.allOf(C307822y.class))) {
                    C307822y r122 = r2.A04;
                    int ordinal2 = r102.ordinal();
                    if (ordinal2 == 0 || ordinal2 == 1) {
                        r0 = C307822y.A01;
                    } else if (ordinal2 == 2) {
                        r0 = C307822y.A03;
                    } else {
                        throw C18180wK.A0a("SsoApplication not supported.");
                    }
                    if (r122 == r0) {
                        String str3 = r2.A02;
                        String str4 = r102.A01;
                        if (str3.equals(str4)) {
                            try {
                                i = context.getPackageManager().getPackageInfo(str4, 0).versionCode;
                            } catch (PackageManager.NameNotFoundException unused) {
                                i = -1;
                            }
                            if (i >= r102.A00) {
                                r11.Blm(r2);
                                r11.Bkl(Collections.singletonList(r122));
                                String str5 = "InstagramSsoLoginUtil";
                                String str6 = A0h;
                                C63053bO.A02(applicationContext, str6, str5, A0v2, r2, r62);
                            }
                        }
                    }
                }
                List unmodifiableList = Collections.unmodifiableList(A0v2);
                if (!unmodifiableList.isEmpty()) {
                    AnonymousClass3AB r112 = new AnonymousClass3AB();
                    AnonymousClass3VA r13 = ((AnonymousClass3H2) unmodifiableList.get(0)).A01;
                    r112.A02 = r13.A00;
                    C566037v r22 = new C566037v();
                    AnonymousClass3VD r14 = r13.A01;
                    r22.A01 = r14.A02;
                    r22.A00 = r14.A00;
                    r112.A00 = r22;
                    r112.A01 = r102;
                    r3 = r112;
                    break;
                }
            } catch (Throwable th) {
                AnonymousClass0LU.A0K("InstagramSsoLoginUtil", "Exception occurred while resolving sso session from %s", th, r102.A01);
            }
        }
        if (z && r3 != null) {
            new C81124nC(r8).A09(AnonymousClass006.A0N, "InstagramSsoLoginUtil", C18210wN.A0h("FACEBOOK"), C18210wN.A0h("ACTIVE_ACCOUNT"), new C73964Vg(A0h));
        }
        return r3;
    }
}
