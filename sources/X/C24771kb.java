package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.search.InlineSearchBox;

/* renamed from: X.1kb  reason: invalid class name and case insensitive filesystem */
public final class C24771kb extends AnonymousClass1lO {
    public final C23481dv A00;

    public final Class modelClass() {
        return AnonymousClass1lJ.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass1lJ r4 = (AnonymousClass1lJ) mfV;
        AnonymousClass135 r5 = (AnonymousClass135) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(r4, r5);
        String str = r4.A00;
        InlineSearchBox inlineSearchBox = r5.A02;
        inlineSearchBox.A07(str, A1Z);
        inlineSearchBox.A02 = r5.A00;
        inlineSearchBox.setImeOptions(6);
        C18200wM.A1C(inlineSearchBox);
    }

    public C24771kb(C23481dv r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass135(this.A00, new InlineSearchBox(C18190wL.A0A(viewGroup), (AttributeSet) null, C18200wM.A1Y(viewGroup) ? 1 : 0));
    }
}
