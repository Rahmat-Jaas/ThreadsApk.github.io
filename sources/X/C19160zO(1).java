package X;

import android.app.DatePickerDialog;
import android.content.DialogInterface;

/* renamed from: X.0zO  reason: invalid class name and case insensitive filesystem */
public final class C19160zO extends AnonymousClass099 {
    public DatePickerDialog.OnDateSetListener A00;
    public DialogInterface.OnDismissListener A01;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
        if (r3 != null) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog A0C(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            android.os.Bundle r3 = r0.mArguments
            androidx.fragment.app.FragmentActivity r11 = r0.getActivity()
            android.app.DatePickerDialog$OnDateSetListener r13 = r0.A00
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            if (r3 == 0) goto L_0x001f
            java.lang.String r1 = "date"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x001f
            long r0 = r3.getLong(r1)
            r2.setTimeInMillis(r0)
        L_0x001f:
            r4 = 1
            r7 = 0
            int r14 = r2.get(r4)
            r0 = 2
            int r15 = r2.get(r0)
            int r16 = X.C18240wQ.A07(r2)
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r0 = 0
            if (r3 == 0) goto L_0x004f
            java.lang.String r5 = "mode"
            java.lang.String r0 = r3.getString(r5, r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r5 = r3.getString(r5)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toUpperCase(r0)
            java.lang.String r0 = "CALENDAR"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00f1
            java.lang.Integer r1 = X.AnonymousClass006.A00
        L_0x004f:
            int r0 = r1.intValue()
            if (r0 == r7) goto L_0x00da
            if (r0 == r4) goto L_0x00c5
            X.0we r10 = new X.0we
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x0061:
            android.widget.DatePicker r8 = r10.getDatePicker()
            r9 = 14
            r6 = 13
            r5 = 12
            r4 = 11
            if (r3 == 0) goto L_0x00ba
            java.lang.String r1 = "minDate"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00ba
            long r0 = r3.getLong(r1)
            r2.setTimeInMillis(r0)
            r2.set(r4, r7)
            r2.set(r5, r7)
            r2.set(r6, r7)
            r2.set(r9, r7)
            long r0 = r2.getTimeInMillis()
            r8.setMinDate(r0)
        L_0x0091:
            java.lang.String r1 = "maxDate"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x00b9
            long r0 = r3.getLong(r1)
            r2.setTimeInMillis(r0)
            r0 = 23
            r2.set(r4, r0)
            r0 = 59
            r2.set(r5, r0)
            r2.set(r6, r0)
            r0 = 999(0x3e7, float:1.4E-42)
            r2.set(r9, r0)
            long r0 = r2.getTimeInMillis()
            r8.setMaxDate(r0)
        L_0x00b9:
            return r10
        L_0x00ba:
            r0 = -2208988800001(0xfffffdfdae01dbff, double:NaN)
            r8.setMinDate(r0)
            if (r3 == 0) goto L_0x00b9
            goto L_0x0091
        L_0x00c5:
            r12 = 16973939(0x1030073, float:2.4061222E-38)
            X.0we r10 = new X.0we
            r10.<init>(r11, r12, r13, r14, r15, r16)
            android.view.Window r1 = r10.getWindow()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r7)
            r1.setBackgroundDrawable(r0)
            goto L_0x0061
        L_0x00da:
            android.content.res.Resources r5 = r11.getResources()
            java.lang.String r4 = r11.getPackageName()
            java.lang.String r1 = "CalendarDatePickerDialog"
            java.lang.String r0 = "style"
            int r12 = r5.getIdentifier(r1, r0, r4)
            X.0we r10 = new X.0we
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x0061
        L_0x00f1:
            java.lang.String r0 = "SPINNER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00fd
            java.lang.Integer r1 = X.AnonymousClass006.A01
            goto L_0x004f
        L_0x00fd:
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x004f
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19160zO.A0C(android.os.Bundle):android.app.Dialog");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
