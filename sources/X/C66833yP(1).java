package X;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;

/* renamed from: X.3yP  reason: invalid class name and case insensitive filesystem */
public final class C66833yP implements C84814tu {
    public List A00 = AnonymousClass0ZV.A00;
    public final SparseArray A01;
    public final AnonymousClass3IA A02;
    public final C81864oW A03;
    public final C121997Jj A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66833yP) {
                C66833yP r5 = (C66833yP) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void A00(Bundle bundle, boolean z) {
        bundle.putString("__nav_data_type", "screen_query");
        Bundle A062 = C18180wK.A06();
        A062.putString("key_app_id", this.A06);
        A062.putInt("key_content_parse_result", C62533aC.A00(this.A04));
        A062.putInt("key_screen_config", C62533aC.A00(this.A02));
        A062.putInt("key_container_config", C62533aC.A00(this.A03));
        A062.putString("key_analytics_module", this.A05);
        A062.putBoolean("key_from_config_change", z);
        bundle.putBundle("key_screen_container_props_bundle", A062);
    }

    public final String AQz() {
        return this.A06;
    }

    public final String Ax4() {
        return "screen_query";
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A02, C18210wN.A04(this.A04)) + AnonymousClass0wJ.A03(this.A03);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ScreenContainerProps(parseResult=");
        A0s.append(this.A04);
        A0s.append(", screenConfig=");
        A0s.append(this.A02);
        A0s.append(", containerConfig=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C66833yP(AnonymousClass3IA r5, C81864oW r6, C121997Jj r7) {
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
        Map map = r5.A03;
        Object obj = map.get("__infra__app_id");
        C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        this.A06 = str;
        String str2 = r5.A01;
        this.A05 = str2 == null ? str : str2;
        Object obj2 = map.get("__infra__screen_id");
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
        this.A07 = (String) obj2;
        C04220Ms.A0C(map.get("__infra__ttrc_marker_id"), C28174Ezk.A00(7));
        C04220Ms.A0C(map.get("__infra__cache_ttl"), "null cannot be cast to non-null type kotlin.Long");
        this.A01 = (SparseArray) map.get("__key_additional_object_set");
    }
}
