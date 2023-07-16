package X;

import java.util.List;

/* renamed from: X.3Ye  reason: invalid class name and case insensitive filesystem */
public final class C62303Ye {
    public Long A00;
    public String A01;
    public String A02;
    public List A03 = AnonymousClass0wJ.A0v();
    public List A04 = AnonymousClass0wJ.A0v();
    public List A05 = AnonymousClass0wJ.A0v();
    public List A06 = AnonymousClass0wJ.A0v();
    public List A07 = AnonymousClass0wJ.A0v();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C62303Ye r5 = (C62303Ye) obj;
            if (!this.A02.equals(r5.A02) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18180wK.A03(this.A02));
    }

    public C62303Ye(C62303Ye r2) {
        synchronized (r2) {
            this.A01 = r2.A01;
            this.A02 = r2.A02;
            this.A05 = r2.A05;
            this.A06 = r2.A06;
            this.A04 = r2.A04;
            this.A00 = r2.A00;
            this.A03 = r2.A03;
        }
    }

    public C62303Ye(String str, String str2, long j) {
        str.getClass();
        this.A02 = str;
        str2.getClass();
        this.A01 = str2;
        this.A00 = Long.valueOf(j);
    }

    public C62303Ye() {
    }
}
