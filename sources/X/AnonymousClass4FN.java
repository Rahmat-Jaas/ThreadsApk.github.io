package X;

import android.content.Context;
import com.facebook.redex.IDxDListenerShape320S0100000_1_I2;
import java.util.List;

/* renamed from: X.4FN  reason: invalid class name */
public final class AnonymousClass4FN implements C84194si {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C85874vu A01;
    public final /* synthetic */ List A02;

    public final String AUg() {
        return "generic";
    }

    public AnonymousClass4FN(Context context, C85874vu r2, List list) {
        this.A00 = context;
        this.A02 = list;
        this.A01 = r2;
    }

    public final String AUe() {
        return this.A00.getString(2131830699);
    }

    public final void onClick() {
        C25828Dsm A0W = C18190wL.A0W(this.A00);
        List list = this.A02;
        CharSequence[] charSequenceArr = new CharSequence[list.size()];
        for (int i = 0; i < list.size(); i++) {
            charSequenceArr[i] = ((C84194si) list.get(i)).AUe();
        }
        A0W.A0d(C18220wO.A0O(this, 136), charSequenceArr);
        C18200wM.A1O(A0W);
        A0W.A0e(new IDxDListenerShape320S0100000_1_I2(this, 6));
    }
}
