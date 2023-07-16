package X;

import android.view.View;
import android.widget.EditText;
import com.instagram.barcelona.R;

/* renamed from: X.13Q  reason: invalid class name */
public final class AnonymousClass13Q extends M5O {
    public final EditText A00;
    public final AnonymousClass0YY A01;
    public final AnonymousClass0YY A02;
    public final View A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass13Q(View view, AnonymousClass0YY r6, AnonymousClass0YY r7) {
        super(view);
        AnonymousClass0wJ.A1Q(r6, r7);
        this.A01 = r6;
        this.A02 = r7;
        EditText editText = (EditText) AnonymousClass0wJ.A0J(view, R.id.muted_word_edit_text);
        this.A00 = editText;
        View A0K = AnonymousClass0wJ.A0K(view, R.id.muted_word_delete_button);
        this.A03 = A0K;
        editText.setImeOptions(6);
        editText.setRawInputType(1);
        C18210wN.A12(editText, this, 1);
        C18210wN.A10(editText, 1, this);
        AnonymousClass0wJ.A16(A0K, 394, this);
    }
}
