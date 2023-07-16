package X;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* renamed from: X.3vx  reason: invalid class name and case insensitive filesystem */
public final class C65823vx implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnonymousClass1jR A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;
    public final /* synthetic */ C109326jp A03;
    public final /* synthetic */ ConfirmationCodeEditText A04;

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        C109326jp r3 = this.A03;
        if (r3 != null) {
            C122047Jt.A03(this.A01, this.A02, C63893iY.A04(AnonymousClass3VO.A00(), C18210wN.A0c(textView), 0), r3);
            return true;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.A04.getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return true;
        }
        inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);
        return true;
    }

    public C65823vx(AnonymousClass1jR r1, AnonymousClass3HX r2, C127397h3 r3, C109326jp r4, ConfirmationCodeEditText confirmationCodeEditText) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = confirmationCodeEditText;
    }
}
