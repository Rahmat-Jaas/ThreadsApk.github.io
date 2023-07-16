package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6n1  reason: invalid class name and case insensitive filesystem */
public final class C111246n1 {
    public AnonymousClass73X A00;
    public final C104686cC A01;
    public final AnonymousClass7A1 A02;
    public final C112216pC A03;
    public final C109246jh A04;
    public final C109246jh A05;
    public final C142478ev A06;
    public final C82414pa A07;
    public final String A08;
    public final List A09 = AnonymousClass0wJ.A0v();
    public final Map A0A = AnonymousClass0wJ.A0y();
    public final Map A0B;
    public final Set A0C;

    public C111246n1(C104686cC r5, AnonymousClass7A1 r6, C112216pC r7, C110936mW r8, AnonymousClass73X r9, C142478ev r10, C82414pa r11, String str) {
        this.A07 = r11;
        this.A00 = r9;
        this.A08 = str;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A06 = r10;
        if (r8 != null) {
            C109246jh r1 = r8.A01;
            this.A05 = new C109246jh(r1);
            this.A04 = r1;
            this.A0B = r8.A05;
            this.A0C = C18200wM.A0u();
            Iterator A0z = AnonymousClass0wJ.A0z(r8.A04);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                Object key = A0o.getKey();
                if (!C100986Pl.A00(A0o.getValue(), r6.A06.get(key))) {
                    this.A0C.add(key);
                }
            }
            return;
        }
        this.A05 = new C109246jh((C109246jh) null);
        this.A04 = new C109246jh((C109246jh) null);
        this.A0B = Collections.emptyMap();
    }
}
