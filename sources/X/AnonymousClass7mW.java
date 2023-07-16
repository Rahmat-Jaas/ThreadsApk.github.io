package X;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7mW  reason: invalid class name */
public final class AnonymousClass7mW implements C145418kT {
    public final int AnQ() {
        return 2;
    }

    public final boolean BZe(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && !dateValidator.BZd(j)) {
                return false;
            }
        }
        return true;
    }
}
