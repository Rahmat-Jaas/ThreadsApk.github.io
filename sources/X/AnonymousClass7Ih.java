package X;

import android.text.TextUtils;
import android.util.SparseArray;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;

/* renamed from: X.7Ih  reason: invalid class name */
public abstract class AnonymousClass7Ih {
    public C1198277d A00;
    public FormCellLoggingEvents A01;
    public final int A02;
    public final int A03;
    public final SparseArray A04;
    public final C880756q A05;
    public final C880856r A06;
    public final C880856r A07;
    public final boolean A08;
    public final boolean A09;

    public AnonymousClass7Ih(int i, boolean z, boolean z2) {
        this((FormCellLoggingEvents) null, 0, i, z, z2);
    }

    public void A0G() {
    }

    public static Object A0C(AnonymousClass7Ih r0) {
        return r0.A05.A08();
    }

    public final SparseArray A0E() {
        if (this instanceof C92055hW) {
            return C92055hW.A0B(this);
        }
        SparseArray A0D = C86154wM.A0D();
        A0D.put(this.A02, A0C(this));
        return A0D;
    }

    public final AnonymousClass7Ih A0F(int i) {
        if (this instanceof C92055hW) {
            C92055hW r3 = (C92055hW) this;
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = r3.A00;
                if (i2 < sparseArray.size()) {
                    AnonymousClass7Ih r1 = (AnonymousClass7Ih) sparseArray.valueAt(i2);
                    if (r1.A02 == i) {
                        return r1;
                    }
                    i2++;
                } else {
                    C92055hW r12 = r3;
                    if (r3.A02 != i) {
                        return null;
                    }
                    return r12;
                }
            }
        } else if (this.A02 == i) {
            return this;
        }
        return null;
    }

    public final void A0H(C1198277d r5) {
        if (this instanceof C92055hW) {
            C92055hW r3 = (C92055hW) this;
            r3.A00 = r5;
            int i = 0;
            while (true) {
                SparseArray sparseArray = r3.A00;
                if (i < sparseArray.size()) {
                    AnonymousClass7Ih r0 = (AnonymousClass7Ih) sparseArray.valueAt(i);
                    if (r0 != null) {
                        r0.A0H(r5);
                    }
                    i++;
                } else {
                    return;
                }
            }
        } else {
            this.A00 = r5;
        }
    }

    public void A0I(boolean z) {
        C86114wI.A1B(this.A07, z);
    }

    public final boolean A0J() {
        if (this instanceof C92005hR) {
            return TextUtils.isEmpty((CharSequence) A0C(this));
        }
        if (!(this instanceof C92055hW)) {
            return true;
        }
        C92055hW r3 = (C92055hW) this;
        int i = 0;
        while (true) {
            SparseArray sparseArray = r3.A00;
            if (i >= sparseArray.size()) {
                return true;
            }
            if (sparseArray.valueAt(i) != null && !((AnonymousClass7Ih) sparseArray.valueAt(i)).A0J()) {
                return false;
            }
            i++;
        }
    }

    public final boolean A0K() {
        if (this instanceof C92005hR) {
            C92005hR r1 = (C92005hR) this;
            if (!r1.A09 || !r1.A08) {
                return true;
            }
            String str = (String) A0C(r1);
            C1366783w it = r1.A00.iterator();
            while (it.hasNext()) {
                if (!((C113646ru) it.next()).A01(str)) {
                    return false;
                }
            }
            return true;
        } else if (!(this instanceof C92055hW)) {
            return true;
        } else {
            C92055hW r3 = (C92055hW) this;
            int i = 0;
            while (true) {
                SparseArray sparseArray = r3.A00;
                if (i >= sparseArray.size()) {
                    return true;
                }
                AnonymousClass7Ih r12 = (AnonymousClass7Ih) sparseArray.valueAt(i);
                Object A082 = r3.A07.A08();
                A082.getClass();
                if (AnonymousClass0wJ.A1X(A082) && !r12.A0K()) {
                    return false;
                }
                i++;
            }
        }
    }

    public static boolean A0D(SparseArray sparseArray, SparseArray sparseArray2, int i) {
        return C121687Hl.A04((String) sparseArray.get(i), (String) sparseArray2.get(i));
    }

    public AnonymousClass7Ih(CellParams cellParams) {
        this.A06 = C880856r.A03();
        this.A05 = C880756q.A01();
        this.A04 = C86154wM.A0D();
        this.A07 = C880856r.A04(C18180wK.A0Y());
        this.A03 = cellParams.A03;
        this.A02 = cellParams.A02;
        this.A09 = cellParams.A06;
        this.A08 = cellParams.A05;
        this.A01 = cellParams.A04;
    }

    public AnonymousClass7Ih(FormCellLoggingEvents formCellLoggingEvents, int i, int i2, boolean z, boolean z2) {
        this.A06 = C880856r.A03();
        this.A05 = C880756q.A01();
        this.A04 = C86154wM.A0D();
        this.A07 = C880856r.A04(C18180wK.A0Y());
        this.A03 = i;
        this.A02 = i2;
        this.A09 = z;
        this.A08 = z2;
        this.A01 = formCellLoggingEvents;
    }
}
