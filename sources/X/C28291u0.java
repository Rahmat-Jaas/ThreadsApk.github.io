package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1u0  reason: invalid class name and case insensitive filesystem */
public class C28291u0 extends AnonymousClass1UE implements C81644o8 {
    public int A00;
    public int A01;
    public long A02;
    public long A03 = System.currentTimeMillis();
    public long A04;
    public long A05;
    public QuickPromotionSurface A06;
    public AnonymousClass3FV A07;
    public C28221tt A08;
    public AnonymousClass3Gy A09;
    public C62303Ye A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C28291u0 r5 = (C28291u0) obj;
            if (!this.A0E.equals(r5.A0E) || !this.A0D.equals(r5.A0D)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A0D, C18180wK.A03(this.A0E));
    }

    public C28291u0(QuickPromotionSurface quickPromotionSurface, C28221tt r4, AnonymousClass3GI r5, C62303Ye r6, String str, int i, long j, long j2, long j3, boolean z, boolean z2) {
        this.A08 = r4;
        this.A09 = r5.A01;
        List list = r5.A07;
        this.A0F = list == null ? Collections.emptyList() : list;
        this.A0B = r5.A03;
        this.A0D = r5.A05;
        this.A06 = quickPromotionSurface;
        this.A0E = str;
        this.A04 = j;
        this.A02 = j2;
        this.A05 = j3;
        this.A00 = C18210wN.A03(r5.A02);
        this.A01 = i;
        this.A0A = r6;
        this.A0K = z;
        this.A0H = z2;
        this.A0C = r5.A04;
        this.A07 = r5.A00;
        this.A0I = r5.A09;
        this.A0G = r5.A08;
        this.A0J = r5.A0A;
        this.A0L = r5.A0B;
    }

    public C28291u0() {
    }
}
