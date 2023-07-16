package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.IDxSListenerShape59S0100000_2_I2;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.forker.Process;

/* renamed from: X.5A2  reason: invalid class name */
public final class AnonymousClass5A2 extends LBP {
    public int A00 = 0;
    public C109266jj A01;
    public boolean A02 = true;
    public int A03 = 0;

    public final void A0F(String str) {
        int i = 0;
        if (str != null) {
            i = 1;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        i = Process.WAIT_RESULT_TIMEOUT;
                        break;
                    } else {
                        return;
                    }
                case 100571:
                    if (!str.equals("end")) {
                        return;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        this.A03 = -1;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        this.A03 = i;
    }

    public final void A01() {
        C109266jj r0 = this.A01;
        if (r0 != null) {
            r0.A01.A06((RecyclerView) null);
        }
    }

    public final float A07(DisplayMetrics displayMetrics) {
        float f = 25.0f / ((float) displayMetrics.densityDpi);
        if (!this.A02) {
            return f * 0.1f;
        }
        return f;
    }

    public final int A08() {
        return this.A03;
    }

    public final int A09() {
        return this.A03;
    }

    public final int A0C(int i, int i2, int i3, int i4, int i5) {
        if (this.A03 == Integer.MIN_VALUE) {
            return (i3 + ((i4 - i3) >> 1)) - (i + ((i2 - i) >> 1));
        }
        return super.A0C(i, i2, i3, i4, i5);
    }

    public final int A0D(View view, int i) {
        int i2;
        M6x m6x = this.A02;
        if (m6x == null || !m6x.A1b()) {
            i2 = 0;
        } else {
            i2 = this.A00;
        }
        return super.A0D(view, i) + i2;
    }

    public final int A0E(View view, int i) {
        int i2;
        M6x m6x = this.A02;
        if (m6x == null || !m6x.A1c()) {
            i2 = 0;
        } else {
            i2 = this.A00;
        }
        return super.A0E(view, i) + i2;
    }

    public AnonymousClass5A2(Context context) {
        super(context);
    }

    public final void A03() {
        super.A03();
        C109266jj r3 = this.A01;
        if (r3 != null) {
            r3.A02.A01 = null;
            r3.A00.A11(new IDxSListenerShape59S0100000_2_I2(r3, 4));
        }
    }
}
