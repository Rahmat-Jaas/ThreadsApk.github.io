package X;

import android.widget.EditText;

/* renamed from: X.833  reason: invalid class name */
public final class AnonymousClass833 implements Runnable {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;
    public final /* synthetic */ C111326n9 A03;
    public final /* synthetic */ C109326jp A04;

    public AnonymousClass833(EditText editText, AnonymousClass3HX r2, C127397h3 r3, C111326n9 r4, C109326jp r5) {
        this.A03 = r4;
        this.A00 = editText;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final void run() {
        if (this.A03.A0Q) {
            EditText editText = this.A00;
            C127397h3 r4 = this.A02;
            C109326jp r3 = this.A04;
            editText.setText((CharSequence) C122047Jt.A03(this.A01, r4, C86154wM.A0S(AnonymousClass3VO.A00(), AnonymousClass0wJ.A0n(editText), 0), r3));
        }
    }
}
