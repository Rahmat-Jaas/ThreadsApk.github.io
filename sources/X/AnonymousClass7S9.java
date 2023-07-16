package X;

import android.os.Handler;
import android.widget.SeekBar;

/* renamed from: X.7S9  reason: invalid class name */
public final class AnonymousClass7S9 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C105666dn A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public AnonymousClass7S9(C105666dn r1, AnonymousClass3HX r2, C127397h3 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Handler handler = AnonymousClass6YE.A00;
        C105666dn r4 = this.A00;
        handler.removeMessages(0, r4);
        r4.A00 = new C109116jU(this.A01, this.A02, i);
        C86124wJ.A1E(handler, r4, 0);
    }
}
