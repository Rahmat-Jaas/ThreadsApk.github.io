package X;

import org.json.JSONObject;

/* renamed from: X.5Gs  reason: invalid class name and case insensitive filesystem */
public final class C89785Gs extends C58933Ih implements C148478r8 {
    public final String B0O() {
        return A05("payment_date");
    }

    public final C148278ql B0W() {
        return (C148278ql) A00(C89775Gr.class, "payout_batch_item_payout_amount");
    }

    public final C966866h B0Y() {
        return (C966866h) A04("payout_batch_item_status", C966866h.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final String getId() {
        return A05("id");
    }

    public C89785Gs(JSONObject jSONObject) {
        super(jSONObject);
    }
}
