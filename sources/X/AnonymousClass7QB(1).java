package X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7QB  reason: invalid class name */
public final class AnonymousClass7QB implements TextWatcher {
    public final /* synthetic */ I5H A00;

    public AnonymousClass7QB(I5H i5h) {
        this.A00 = i5h;
    }

    public final void afterTextChanged(Editable editable) {
        ArrayList arrayList;
        I5H i5h = this.A00;
        if (!i5h.A0E && (arrayList = i5h.A0C) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        I5H i5h = this.A00;
        if (!i5h.A0E && (arrayList = i5h.A0C) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        I5H i5h = this.A00;
        if (!i5h.A0E && (arrayList = i5h.A0C) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
            }
        }
        I5H.A02(i5h);
    }
}
