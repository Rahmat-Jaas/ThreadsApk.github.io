package X;

import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape388S0100000_1_I2;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1jv  reason: invalid class name and case insensitive filesystem */
public final class C24721jv extends C19819BBt {
    public TextView.OnEditorActionListener A00;
    public AnonymousClass4tS A01;
    public ProgressButton A02;
    public Integer A03;
    public TextView A04;
    public C10300i6 A05;
    public boolean A06;
    public final TextWatcher A07;
    public final TextView.OnEditorActionListener A08;

    public final void A00() {
        this.A06 = false;
        A02();
        this.A01.AJV();
    }

    public final void A01() {
        this.A06 = true;
        A02();
        this.A01.AHz();
    }

    public final void onDestroyView() {
        this.A04 = null;
        this.A02 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r2.A01.BXY() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r2 = this;
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            boolean r0 = r2.A06
            r1.setShowProgressBar(r0)
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0014
            X.4tS r0 = r2.A01
            boolean r0 = r0.BXY()
            r1 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r2.A02
            r0.setEnabled(r1)
            X.4tS r0 = r2.A01
            r0.CDH(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24721jv.A02():void");
    }

    public final void A03(boolean z) {
        String str;
        AnonymousClass4tS r1 = this.A01;
        r1.C9G();
        if (!(r1 instanceof C23211cm)) {
            C62713aZ r2 = C62713aZ.A00;
            C10300i6 r3 = this.A05;
            AnonymousClass265 BDt = r1.BDt();
            if (BDt != null) {
                str = BDt.A01;
            } else {
                str = null;
            }
            C313625r Aiy = r1.Aiy();
            Integer num = this.A03;
            Boolean valueOf = Boolean.valueOf(z);
            C04220Ms.A0B(r3, 0);
            r2.A02(r3, Aiy, valueOf, (Boolean) null, num, str, (String) null);
        }
    }

    public final void Bsd(View view) {
        AnonymousClass0wJ.A17(this.A02, 76, this);
        TextView textView = this.A04;
        if (textView != null) {
            TextView.OnEditorActionListener onEditorActionListener = this.A00;
            if (onEditorActionListener == null) {
                onEditorActionListener = this.A08;
            }
            textView.setOnEditorActionListener(onEditorActionListener);
        }
    }

    public final void onPause() {
        TextView textView = this.A04;
        if (textView != null) {
            textView.removeTextChangedListener(this.A07);
        }
    }

    public final void onResume() {
        TextView textView = this.A04;
        if (textView != null) {
            textView.addTextChangedListener(this.A07);
        }
        A02();
    }

    public C24721jv(TextView textView, C10300i6 r4, AnonymousClass4tS r5, ProgressButton progressButton, int i) {
        this.A08 = new IDxAListenerShape388S0100000_1_I2(this, 14);
        this.A07 = new IDxWAdapterShape193S0100000_1_I2(this, 16);
        this.A05 = r4;
        this.A01 = r5;
        this.A04 = textView;
        this.A02 = progressButton;
        progressButton.setText(i);
        this.A02.setEnabled(false);
        this.A01.CDH(false);
    }

    public C24721jv(TextView textView, C10300i6 r8, AnonymousClass4tS r9, ProgressButton progressButton) {
        this(textView, r8, r9, progressButton, 2131831737);
    }
}
