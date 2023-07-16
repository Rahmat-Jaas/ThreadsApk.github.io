package X;

import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.5G4  reason: invalid class name */
public final class AnonymousClass5G4 extends C58933Ih implements C148568rI {
    public final C147958qD AYZ() {
        return (C147958qD) A00(C89585Fy.class, "company_address");
    }

    public final ImmutableList AYa() {
        return A01("company_emails");
    }

    public final String AYb() {
        return A05("company_name");
    }

    public final String AYc() {
        return A05("company_phone");
    }

    public final String AYd() {
        return A05("company_tin_type");
    }

    public final C35294Is8 AYe() {
        return (C35294Is8) A04("company_type", C35294Is8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final C147968qE AzY() {
        return (C147968qE) A00(C89595Fz.class, "owner_address");
    }

    public final String AzZ() {
        return A05("owner_birthday");
    }

    public final ImmutableList B0K() {
        return A02("payees", AnonymousClass5G0.class);
    }

    public final C147988qG B0a() {
        return (C147988qG) A00(AnonymousClass5G1.class, "payout_batch_items");
    }

    public final ImmutableList B0f() {
        return A02("payout_hold", AnonymousClass5G2.class);
    }

    public final ImmutableList B0g() {
        return A02("payout_info", AnonymousClass5G3.class);
    }

    public final String getId() {
        return A05("id");
    }

    public AnonymousClass5G4(JSONObject jSONObject) {
        super(jSONObject);
    }
}
