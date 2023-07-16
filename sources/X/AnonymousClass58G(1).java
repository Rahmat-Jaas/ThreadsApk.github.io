package X;

import android.util.SparseArray;
import com.facebookpay.form.fragment.model.FormClickEvent;
import com.facebookpay.form.fragment.model.FormParams;
import com.fbpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58G  reason: invalid class name */
public final class AnonymousClass58G extends C62793ak {
    public M5J A00;
    public FormParams A01;
    public C883057n A02;
    public AnonymousClass587 A03;
    public LoggingContext A04;
    public String A05;
    public String A06;
    public String A07;
    public final C880756q A08 = C880756q.A01();
    public final C880856r A09 = C880856r.A03();
    public final C880856r A0A = C880856r.A03();
    public final C880856r A0B = C880856r.A03();
    public final C880856r A0C;
    public final C143158gC A0D = C86114wI.A0Q(this, 80);
    public final AnonymousClass6IA A0E;

    public static final C40307LcE A00(int i) {
        if (i == 3) {
            return C40307LcE.A01;
        }
        if (i != 7) {
            return null;
        }
        return C40307LcE.A06;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0009  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C92005hR A04(int r4) {
        /*
            r3 = this;
            r2 = 0
            switch(r4) {
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0014;
                case 8: goto L_0x0014;
                case 9: goto L_0x0014;
                case 10: goto L_0x0004;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x000d;
                case 14: goto L_0x000d;
                case 15: goto L_0x000d;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = r2
        L_0x0005:
            boolean r0 = r1 instanceof X.C92005hR
            if (r0 == 0) goto L_0x000c
            r2 = r1
            X.5hR r2 = (X.C92005hR) r2
        L_0x000c:
            return r2
        L_0x000d:
            X.57n r1 = r3.A05()
            r0 = 13
            goto L_0x001a
        L_0x0014:
            X.57n r1 = r3.A05()
            r0 = 11
        L_0x001a:
            X.7Ih r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0004
            X.7Ih r1 = r0.A0F(r4)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58G.A04(int):X.5hR");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        if (r1 != 7) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.otc.models.OtcInput A01(X.AnonymousClass58G r3, boolean r4) {
        /*
            com.facebookpay.form.fragment.model.FormParams r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "formParams"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x000b:
            int r1 = r0.A04
            if (r1 == 0) goto L_0x0033
            r0 = 1
            if (r1 == r0) goto L_0x0033
            r0 = 2
            if (r1 == r0) goto L_0x0030
            r0 = 3
            if (r1 == r0) goto L_0x002d
            r0 = 5
            if (r1 == r0) goto L_0x0033
            r0 = 6
            if (r1 == r0) goto L_0x002a
            r0 = 7
            if (r1 == r0) goto L_0x002d
        L_0x0021:
            X.587 r0 = r3.A06()
            com.facebookpay.otc.models.OtcInput r0 = r0.A02(r2, r4)
            return r0
        L_0x002a:
            X.69P r2 = X.AnonymousClass69P.PROMO_CODE
            goto L_0x0021
        L_0x002d:
            X.69P r2 = X.AnonymousClass69P.PAYMENT_METHOD
            goto L_0x0021
        L_0x0030:
            X.69P r2 = X.AnonymousClass69P.SHIPPING_ADDRESS
            goto L_0x0021
        L_0x0033:
            X.69P r2 = X.AnonymousClass69P.CONTACT_INFORMATION
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58G.A01(X.58G, boolean):com.facebookpay.otc.models.OtcInput");
    }

    public static final void A02(FormClickEvent formClickEvent, AnonymousClass58G r10) {
        Long l;
        Map map;
        AnonymousClass6IA r4 = r10.A0E;
        Long l2 = null;
        if (r4 != null) {
            LoggingContext loggingContext = r10.A04;
            if (loggingContext != null) {
                FormParams formParams = r10.A01;
                if (formParams == null) {
                    C04220Ms.A0E("formParams");
                    throw null;
                }
                String str = formParams.A0H;
                if (str != null) {
                    l2 = AnonymousClass0wJ.A0d(str);
                }
                LinkedHashMap A072 = AnonymousClass7Kr.A07(r10.A06());
                if (r4 instanceof C92255hs) {
                    AnonymousClass7JJ.A00().A0E(loggingContext, l2, A072);
                    return;
                }
                return;
            }
        } else if (formClickEvent != null) {
            C128957ke A012 = AnonymousClass7JJ.A01();
            String str2 = formClickEvent.A00;
            LoggingContext loggingContext2 = r10.A04;
            if (loggingContext2 != null) {
                String str3 = formClickEvent.A01;
                FormParams formParams2 = r10.A01;
                if (formParams2 == null) {
                    C04220Ms.A0E("formParams");
                    throw null;
                }
                String str4 = formParams2.A0H;
                if (str4 != null) {
                    l = AnonymousClass0wJ.A0d(str4);
                } else {
                    l = null;
                }
                AnonymousClass7DP A032 = r10.A06().A03();
                FormParams formParams3 = r10.A01;
                if (formParams3 == null) {
                    C04220Ms.A0E("formParams");
                    throw null;
                }
                C40307LcE A002 = A00(formParams3.A04);
                LinkedHashMap A0y = C18220wO.A0y();
                C86164wN.A1K(loggingContext2, A0y);
                C86104wH.A1O(l, "TARGET_NAME", str3, A0y);
                C86134wK.A1O(A002, A0y);
                Object obj = A0y.get("extra_data");
                if (!(obj instanceof Map) || (((obj instanceof C03740Kn) && !(obj instanceof AnonymousClass0WC)) || (map = (Map) obj) == null)) {
                    map = C18220wO.A0y();
                }
                A012.Bb8(str2, AnonymousClass7Kr.A04(A032, A0y, map));
                return;
            }
        } else {
            return;
        }
        C04220Ms.A0E("loggingContext");
        throw null;
    }

    public final C883057n A05() {
        C883057n r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("formViewModel");
        throw null;
    }

    public final AnonymousClass587 A06() {
        AnonymousClass587 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("otcViewModel");
        throw null;
    }

    public AnonymousClass58G(AnonymousClass6IA r3) {
        this.A0E = r3;
        C880856r A032 = C880856r.A03();
        this.A0C = A032;
        A032.A0E(C86114wI.A0Q(this, 79));
    }

    public final SparseArray A03() {
        SparseArray A002 = A05().A00();
        FormParams formParams = this.A01;
        if (formParams == null) {
            C04220Ms.A0E("formParams");
            throw null;
        }
        A002.put(12, formParams.A0H);
        A002.put(39, formParams.A0C);
        return A002;
    }
}
