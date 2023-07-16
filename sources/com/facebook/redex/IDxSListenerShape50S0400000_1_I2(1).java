package com.facebook.redex;

import X.AnonymousClass3HX;
import X.AnonymousClass3VO;
import X.AnonymousClass601;
import X.C109326jp;
import X.C18210wN;
import X.C61043Rr;
import X.C63893iY;
import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Calendar;

public class IDxSListenerShape50S0400000_1_I2 implements TimePickerDialog.OnTimeSetListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxSListenerShape50S0400000_1_I2(AnonymousClass3HX r1, AnonymousClass601 r2, C109326jp r3, Calendar calendar, int i) {
        this.A04 = i;
        this.A01 = calendar;
        if (i != 0) {
            this.A02 = r2;
            this.A03 = r3;
        } else {
            this.A03 = r3;
            this.A02 = r2;
        }
        this.A00 = r1;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        int i3 = this.A04;
        Object obj = this.A01;
        if (i3 != 0) {
            Calendar calendar = (Calendar) obj;
            calendar.set(11, i);
            calendar.set(12, i2);
            long A07 = C18210wN.A07(calendar);
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A03(this.A00, 0);
            C61043Rr.A00((AnonymousClass601) this.A02, C63893iY.A04(A002, Long.valueOf(A07), 1), (C109326jp) this.A03);
            return;
        }
        Calendar calendar2 = (Calendar) obj;
        calendar2.set(11, i);
        calendar2.set(12, i2);
        C109326jp r4 = (C109326jp) this.A03;
        if (r4 != null) {
            AnonymousClass3VO A003 = AnonymousClass3VO.A00();
            A003.A03(this.A00, 0);
            A003.A03(String.valueOf(i), 1);
            C61043Rr.A00((AnonymousClass601) this.A02, C63893iY.A04(A003, String.valueOf(i2), 2), r4);
        }
    }
}
