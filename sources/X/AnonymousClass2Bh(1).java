package X;

import android.os.Bundle;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.2Bh  reason: invalid class name */
public final class AnonymousClass2Bh {
    public static final C66833yP A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("key_screen_container_props_bundle");
        if (bundle2 == null) {
            return null;
        }
        Integer A0T = C18210wN.A0T(bundle2, "key_content_parse_result");
        C121997Jj r4 = (C121997Jj) C62533aC.A01(C121997Jj.class, A0T);
        if (r4 != null) {
            boolean z = bundle2.getBoolean("key_from_config_change");
            Integer A0T2 = C18210wN.A0T(bundle2, "key_screen_config");
            AnonymousClass3IA r3 = (AnonymousClass3IA) C62533aC.A01(AnonymousClass3IA.class, A0T2);
            if (r3 != null) {
                if (z) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(r3.A03);
                    if (linkedHashMap.containsKey("__infra__ttrc_instance_id")) {
                        linkedHashMap.put("__infra__ttrc_instance_id", String.valueOf(new SecureRandom().nextInt()));
                    }
                    if (linkedHashMap.containsKey("__infra__ttrc_timestamp")) {
                        C62093Xc r2 = C62093Xc.A04;
                        linkedHashMap.put("__infra__ttrc_timestamp", Long.valueOf(C62093Xc.A00(r2, r2.A01.now())));
                    }
                    r3 = new AnonymousClass3IA(r3.A00, r3.A01, linkedHashMap, r3.A02);
                }
                Integer A0T3 = C18210wN.A0T(bundle2, "key_container_config");
                List A17 = C06750aI.A17(A0T, A0T2, A0T3);
                C66833yP r5 = new C66833yP(r3, (C81864oW) C62533aC.A01(C81864oW.class, A0T3), r4);
                r3.A03.get("__infra__app_id");
                r5.A00 = A17;
                return r5;
            }
            throw C18180wK.A0a("Must have non-null or non-empty Screen Config");
        }
        throw C18180wK.A0a("Must have a non-null content ParseResult");
    }
}
