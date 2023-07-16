package X;

import android.app.Dialog;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.browser.lite.BrowserLiteFragment;
import java.util.List;

/* renamed from: X.6qe  reason: invalid class name and case insensitive filesystem */
public final class C113056qe {
    public AnonymousClass55x A00;
    public C111316n8 A01;
    public Integer A02 = null;
    public Long A03 = null;
    public List A04;
    public boolean A05;
    public final C89405Ej A06;
    public final Handler A07;

    public final synchronized void A00(AnonymousClass55x r9, C111316n8 r10, String str) {
        int i;
        Dialog dialog;
        Integer num;
        String str2;
        String str3;
        Long l = this.A03;
        if (l == null) {
            this.A03 = Long.valueOf(SystemClock.elapsedRealtime());
            if ((r9 instanceof AnonymousClass5EU) || (r9 instanceof AnonymousClass5ES)) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            if ((r9 instanceof AnonymousClass5EU) || (r9 instanceof AnonymousClass5ES)) {
                i = 1;
            } else {
                i = 0;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long longValue = elapsedRealtime - l.longValue();
            if (longValue < 1000 && (num = this.A02) != null) {
                C89405Ej r2 = this.A06;
                int i2 = (int) longValue;
                int intValue = num.intValue();
                String str4 = r2.A0c;
                C39730Kys kys = r2.A03;
                if (kys == null) {
                    str2 = null;
                } else {
                    str2 = ((BrowserLiteFragment) kys).A0e;
                }
                if (intValue == 0) {
                    if (intValue == i) {
                        str3 = "MERGE_AUTOFILL_DIALOG_INTERVAL_CONTACT";
                    } else {
                        str3 = "MERGE_AUTOFILL_DIALOG_INTERVAL_CONTACT_PAYMENT";
                    }
                } else if (intValue != 1) {
                    str3 = "MERGE_AUTOFILL_DIALOG_INTERVAL";
                } else if (intValue == i) {
                    str3 = "MERGE_AUTOFILL_DIALOG_INTERVAL_PAYMENT";
                } else {
                    str3 = "MERGE_AUTOFILL_DIALOG_INTERVAL_PAYMENT_CONTACT";
                }
                AnonymousClass78Q r0 = new AnonymousClass78Q(str3, str4);
                r0.A06 = str2;
                r0.A01 = i2;
                AnonymousClass78Q.A00(r0);
            }
            this.A03 = Long.valueOf(elapsedRealtime);
        }
        this.A02 = Integer.valueOf(i);
        AnonymousClass55x r02 = this.A00;
        if (r02 == null || (dialog = r02.A02) == null || !dialog.isShowing() || this.A00.mRemoving) {
            if (!this.A05) {
                this.A05 = true;
                List list = this.A04;
                list.clear();
                list.add(new C108706io(r9, r10));
                this.A07.postDelayed(new C1363782m(this, r9, r10, str), 200);
            } else {
                this.A04.add(new C108706io(r9, r10));
            }
        }
    }

    public C113056qe(C89405Ej r2) {
        this.A06 = r2;
        this.A05 = false;
        this.A04 = AnonymousClass0wJ.A0v();
        this.A07 = AnonymousClass0wJ.A0F();
    }
}
