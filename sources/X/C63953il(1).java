package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: X.3il  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63953il implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C32262Ba A01;
    public final /* synthetic */ AnonymousClass3HX A02;
    public final /* synthetic */ AnonymousClass601 A03;
    public final /* synthetic */ C109326jp A04;
    public final /* synthetic */ C109326jp A05;
    public final /* synthetic */ Calendar A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ C63953il(Context context, C32262Ba r2, AnonymousClass3HX r3, AnonymousClass601 r4, C109326jp r5, C109326jp r6, Calendar calendar, boolean z, boolean z2) {
        this.A06 = calendar;
        this.A07 = z;
        this.A00 = context;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A08 = z2;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = this.A06;
        boolean z = this.A07;
        Context context = this.A00;
        AnonymousClass3HX r2 = this.A02;
        C109326jp r4 = this.A04;
        C109326jp r5 = this.A05;
        AnonymousClass601 r3 = this.A03;
        boolean z2 = this.A08;
        calendar.set(i, i2, i3);
        if (z) {
            AnonymousClass3J7.A01(context, r2, r3, r4, r5, calendar, z2);
        } else if (r3 != null) {
            C63893iY.A0F(r3, AnonymousClass3VO.A00(), r4, String.valueOf(C18210wN.A07(calendar)), 0);
        }
    }
}
