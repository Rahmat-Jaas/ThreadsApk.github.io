package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0MQ;
import X.AnonymousClass0wJ;
import X.AnonymousClass56X;
import X.AnonymousClass67R;
import X.AnonymousClass771;
import X.AnonymousClass78Q;
import X.AnonymousClass7EC;
import X.AnonymousClass7K3;
import X.C107456gm;
import X.C115186ue;
import X.C143158gC;
import X.C18180wK;
import X.C18220wO;
import X.C18240wQ;
import X.C880756q;
import X.C880856r;
import X.C969967n;
import X.M5J;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.models.W3CCardDetail;

public class IDxObserverShape3S0300100_2_I2 implements C143158gC {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxObserverShape3S0300100_2_I2(int i, long j, Object obj, Object obj2, Object obj3) {
        this.A04 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        AnonymousClass78Q A07;
        String message;
        String str2;
        C880856r r4;
        Object r6;
        switch (this.A04) {
            case 0:
                C107456gm r14 = (C107456gm) obj;
                if (r14 != null) {
                    ((M5J) this.A02).A0F(this);
                    Throwable th = r14.A01;
                    boolean A1U = C18220wO.A1U(th);
                    boolean equals = this.A03.equals(AnonymousClass006.A00);
                    if (A1U) {
                        if (equals) {
                            str2 = "SUCCEEDED_SAVE_NEW_CARD";
                        } else {
                            str2 = "SUCCEEDED_SAVE_PAYMENT_OPT_IN_DATA";
                        }
                        A07 = ((AnonymousClass7K3) this.A01).A07(str2, System.currentTimeMillis() - this.A00, -1);
                        message = (String) r14.A00;
                    } else {
                        if (equals) {
                            str = "FAILED_SAVE_NEW_CARD";
                        } else {
                            str = "FAILED_SAVE_PAYMENT_OPT_IN_DATA";
                        }
                        A07 = ((AnonymousClass7K3) this.A01).A07(str, System.currentTimeMillis() - this.A00, -1);
                        if (th == null) {
                            message = "Card save failed with empty error message";
                        } else {
                            message = th.getMessage();
                        }
                    }
                    A07.A0C = message;
                    A07.A0F = "PAYMENT_AUTOFILL";
                    AnonymousClass78Q.A00(A07);
                    return;
                }
                return;
            case 1:
                AnonymousClass7EC r142 = (AnonymousClass7EC) obj;
                if (r142 != null) {
                    AnonymousClass56X r5 = (AnonymousClass56X) this.A03;
                    C880756q r62 = r5.A05;
                    r62.A0J((M5J) this.A01);
                    Throwable th2 = r142.A02;
                    if (C18220wO.A1U(th2)) {
                        C880856r r2 = r5.A06;
                        Object obj2 = r142.A01;
                        if (obj2 != null) {
                            r2.A0H(new C115186ue(((W3CCardDetail) obj2).A00, (AnonymousClass771) null, System.currentTimeMillis() - ((AnonymousClass0MQ) this.A02).A00, this.A00));
                            return;
                        }
                        throw C18180wK.A0a("Required value was null.");
                    } else if (th2 != null) {
                        long j = ((AnonymousClass0MQ) this.A02).A00;
                        AnonymousClass771 r8 = new AnonymousClass771(r5.A08(), th2);
                        if (AnonymousClass0wJ.A1X(r8.A08.getValue())) {
                            r4 = r5.A07;
                            if (r4.A08() == AnonymousClass67R.A01) {
                                r6 = AnonymousClass67R.A02;
                                r4.A0H(r6);
                                AnonymousClass56X.A01(r5);
                                return;
                            }
                        }
                        r62.A0H(C969967n.Error);
                        r4 = r5.A06;
                        r6 = new C115186ue((CardDetails) null, r8, C18240wQ.A09(j), -1);
                        r4.A0H(r6);
                        AnonymousClass56X.A01(r5);
                        return;
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
