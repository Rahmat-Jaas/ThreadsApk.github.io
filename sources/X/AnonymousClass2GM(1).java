package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.2GM  reason: invalid class name */
public final class AnonymousClass2GM {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        AnonymousClass3HX A01;
        int A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        List list = r10.A00;
        if (list.size() >= A1Z) {
            String A0D = C63893iY.A0D(r10, 0);
            if (list.get(A1Z) == null) {
                A01 = C63913ic.A0D(r9);
            } else {
                A01 = C63893iY.A01(r10, A1Z);
            }
            AnonymousClass3GW r5 = AnonymousClass3GW.A00;
            C04220Ms.A06(r5);
            JSONObject A0j = C18250wR.A0j(A0D);
            JSONObject jSONObject = A0j.getJSONObject("error").getJSONObject("error_data");
            String string = jSONObject.getString("api_path");
            C10300i6 A0E = C63913ic.A0E(A01);
            C62123Xf r3 = new C62123Xf(string, jSONObject.getString("challenge_context"));
            String string2 = A0j.getJSONObject("error").getString(FXPFAccessLibraryDebugFragment.UID);
            C09120et A0X = C18190wL.A0X();
            if (A0X.A0E().contains(string2)) {
                Set A0E2 = A0X.A0E();
                C04220Ms.A06(string2);
                A0X.A0G(AnonymousClass4WL.A02(string2, A0E2));
            }
            C697449w A00 = r5.A00(A0E);
            if (A00 != null) {
                A00.A02(C10600ic.A00, r3);
            }
        }
        return null;
    }
}
