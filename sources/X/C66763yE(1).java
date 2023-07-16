package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3yE  reason: invalid class name and case insensitive filesystem */
public final class C66763yE implements C84864tz {
    public C63113bW A00;
    public final Context A01;
    public final LLH A02;
    public final String A03;

    public final void AHt() {
        this.A00.A07();
    }

    public final String ATg() {
        return this.A03;
    }

    public final View AZg(Context context) {
        Object obj = this.A00.A04(context).first;
        obj.getClass();
        return (View) obj;
    }

    public final LLH Ame() {
        return this.A02;
    }

    public final void CZg() {
        C84304sv r0 = this.A00.A01;
        if (r0 != null) {
            r0.CZg();
            return;
        }
        throw C18180wK.A0a("RequestData does not exist in BloksSurfaceController.");
    }

    public final void destroy() {
        this.A00.A06();
    }

    public final Context getContext() {
        return this.A01;
    }

    public C66763yE(LLH llh, String str) {
        this.A01 = llh.getContext();
        this.A02 = llh;
        this.A03 = str;
    }
}
