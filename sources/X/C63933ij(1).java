package X;

import android.app.DatePickerDialog;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: X.3ij  reason: invalid class name and case insensitive filesystem */
public final class C63933ij implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ Calendar A03;

    public C63933ij(AnonymousClass3HX r1, AnonymousClass601 r2, C109326jp r3, Calendar calendar) {
        this.A03 = calendar;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = this.A03;
        calendar.set(i, i2, i3);
        C109326jp r4 = this.A02;
        if (r4 != null) {
            AnonymousClass601 r3 = this.A01;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A03(this.A00, 0);
            C61043Rr.A00(r3, C63893iY.A04(A002, DateFormat.format("yyyy-MM-dd", calendar), 1), r4);
        }
    }
}
