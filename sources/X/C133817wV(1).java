package X;

import org.json.JSONException;

/* renamed from: X.7wV  reason: invalid class name and case insensitive filesystem */
public final class C133817wV implements C145598kl {
    public final /* synthetic */ AnonymousClass601 A00;
    public final /* synthetic */ C109326jp A01;
    public final /* synthetic */ C109326jp A02;

    public C133817wV(AnonymousClass601 r1, C109326jp r2, C109326jp r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void CRt(Exception exc) {
        C86124wJ.A1Q(this.A00, this.A01, exc.getMessage());
    }

    public final void CRv(String str) {
        try {
            C86124wJ.A1Q(this.A00, this.A02, C18250wR.A0j(str).getString("h"));
        } catch (JSONException unused) {
            C86124wJ.A1Q(this.A00, this.A01, "Failed to parse the response");
        }
    }
}
