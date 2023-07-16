package X;

import android.os.Handler;
import android.widget.SeekBar;

/* renamed from: X.7SA  reason: invalid class name */
public final class AnonymousClass7SA implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ AnonymousClass5z5 A00;
    public final /* synthetic */ C111286n5 A01;
    public final /* synthetic */ AnonymousClass3HX A02;
    public final /* synthetic */ C127397h3 A03;
    public final /* synthetic */ C109326jp A04;
    public final /* synthetic */ C109326jp A05;

    public AnonymousClass7SA(AnonymousClass5z5 r1, C111286n5 r2, AnonymousClass3HX r3, C127397h3 r4, C109326jp r5, C109326jp r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r6;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Handler handler = AnonymousClass7CE.A00;
        C111286n5 r1 = this.A01;
        handler.removeMessages(0, r1);
        r1.A06 = i;
        C86124wJ.A1E(handler, r1, 0);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        C109326jp r4 = this.A05;
        if (r4 != null) {
            C127397h3 r3 = this.A03;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            AnonymousClass3HX r0 = this.A02;
            A002.A02(r0, 0);
            C122047Jt.A07(r0, r3, A002, r4);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C109326jp r4 = this.A04;
        if (r4 != null) {
            C127397h3 r3 = this.A03;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            AnonymousClass3HX r0 = this.A02;
            A002.A02(r0, 0);
            C122047Jt.A07(r0, r3, A002, r4);
        }
    }
}
