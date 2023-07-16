package X;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7mV  reason: invalid class name */
public final class AnonymousClass7mV implements C145418kT {
    public final int AnQ() {
        return 1;
    }

    public final boolean BZe(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && dateValidator.BZd(j)) {
                return true;
            }
        }
        return false;
    }
}
