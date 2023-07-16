package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.facebook.redex.IDxFunctionShape326S0100000_2_I2;
import com.instagram.common.bloks.mutations.IDxUOperationShape121S0100000_2_I2;
import java.util.List;

/* renamed from: X.7QF  reason: invalid class name */
public final class AnonymousClass7QF implements TextWatcher {
    public boolean A00 = false;
    public final C111326n9 A01;
    public final List A02;
    public final C107206gM A03;
    public final AnonymousClass3HX A04;
    public final C127397h3 A05;

    public final void afterTextChanged(Editable editable) {
        C111326n9 r3 = this.A01;
        r3.A0L = editable;
        r3.A0Q = false;
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher afterTextChanged : this.A02) {
                afterTextChanged.afterTextChanged(r3.A0L);
            }
            C127397h3 r4 = this.A05;
            if (AnonymousClass2LL.A00(C127397h3.A0A(r4, 63), false)) {
                AnonymousClass3HX r2 = this.A04;
                int lineCount = ((TextView) r4.A0J(r2)).getLineCount();
                if (r3.A03 != lineCount) {
                    r3.A03 = lineCount;
                    if (AnonymousClass7K7.A07(r2)) {
                        C107206gM r0 = this.A03;
                        r0.getClass();
                        r0.A00.AKM(new C108066hl(new IDxFunctionShape326S0100000_2_I2((Object) this, 51), r4.A02));
                    } else {
                        AnonymousClass7HV A012 = AnonymousClass7K7.A01(r2);
                        A012.A0A(new AnonymousClass7r3(A012.A04(), r4), new IDxUOperationShape121S0100000_2_I2(this, 7));
                        A012.A06();
                    }
                }
            }
            C109326jp A0L = r4.A0L(48);
            if (A0L != null) {
                AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                A002.A03(r4, 0);
                AnonymousClass3HX r02 = this.A04;
                A002.A03(r02, 1);
                C122047Jt.A07(r02, r4, A002, A0L);
            }
            this.A00 = false;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher beforeTextChanged : this.A02) {
                beforeTextChanged.beforeTextChanged(charSequence, i, i2, i3);
            }
            this.A00 = false;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher onTextChanged : this.A02) {
                onTextChanged.onTextChanged(charSequence, i, i2, i3);
            }
            this.A00 = false;
        }
    }

    public AnonymousClass7QF(C107206gM r2, AnonymousClass3HX r3, C127397h3 r4) {
        this.A05 = r4;
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = (C111326n9) AnonymousClass7K7.A03(r3, r4);
        this.A02 = AnonymousClass0wJ.A0v();
    }
}
