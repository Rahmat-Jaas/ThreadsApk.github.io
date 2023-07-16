package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.BKU;
import X.C04220Ms;
import X.C18200wM;
import X.C23912D1a;
import com.instagram.api.schemas.LineType;
import com.instagram.model.upcomingevents.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.Date;
import java.util.List;

public class KtCSuperShape0S1420000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final int A07 = 0;

    public KtCSuperShape0S1420000_I2(UpcomingEvent upcomingEvent, C23912D1a d1a, String str, Date date, Date date2, boolean z) {
        this(upcomingEvent, d1a, str, date, date2, false, z);
    }

    public static /* synthetic */ KtCSuperShape0S1420000_I2 A00(KtCSuperShape0S1420000_I2 ktCSuperShape0S1420000_I2, String str, Date date, Date date2, int i, boolean z) {
        boolean z2 = z;
        Date date3 = date2;
        Date date4 = date;
        String str2 = str;
        UpcomingEvent upcomingEvent = null;
        C23912D1a d1a = null;
        boolean z3 = false;
        if ((i & 1) != 0) {
            upcomingEvent = (UpcomingEvent) ktCSuperShape0S1420000_I2.A01;
        }
        if ((i & 2) != 0) {
            d1a = (C23912D1a) ktCSuperShape0S1420000_I2.A02;
        }
        if ((i & 4) != 0) {
            str2 = ktCSuperShape0S1420000_I2.A04;
        }
        if ((i & 8) != 0) {
            date4 = (Date) ktCSuperShape0S1420000_I2.A03;
        }
        if ((i & 16) != 0) {
            date3 = (Date) ktCSuperShape0S1420000_I2.A00;
        }
        if ((i & 32) != 0) {
            z2 = ktCSuperShape0S1420000_I2.A05;
        }
        if ((i & 64) != 0) {
            z3 = ktCSuperShape0S1420000_I2.A06;
        }
        AnonymousClass0wJ.A1O(d1a, str2);
        return new KtCSuperShape0S1420000_I2(upcomingEvent, d1a, str2, date4, date3, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this.A07 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape0S1420000_I2)) {
                return false;
            }
            KtCSuperShape0S1420000_I2 ktCSuperShape0S1420000_I2 = (KtCSuperShape0S1420000_I2) obj;
            if (ktCSuperShape0S1420000_I2.A07 != 1 || !C04220Ms.A0I(this.A01, ktCSuperShape0S1420000_I2.A01) || this.A02 != ktCSuperShape0S1420000_I2.A02 || !C04220Ms.A0I(this.A04, ktCSuperShape0S1420000_I2.A04) || !C04220Ms.A0I(this.A03, ktCSuperShape0S1420000_I2.A03) || !C04220Ms.A0I(this.A00, ktCSuperShape0S1420000_I2.A00) || this.A05 != ktCSuperShape0S1420000_I2.A05 || this.A06 != ktCSuperShape0S1420000_I2.A06) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape0S1420000_I2)) {
                return false;
            }
            KtCSuperShape0S1420000_I2 ktCSuperShape0S1420000_I22 = (KtCSuperShape0S1420000_I2) obj;
            if (ktCSuperShape0S1420000_I22.A07 != 0 || this.A05 != ktCSuperShape0S1420000_I22.A05 || this.A00 != ktCSuperShape0S1420000_I22.A00 || !C04220Ms.A0I(this.A01, ktCSuperShape0S1420000_I22.A01) || !C04220Ms.A0I(this.A02, ktCSuperShape0S1420000_I22.A02) || !C04220Ms.A0I(this.A03, ktCSuperShape0S1420000_I22.A03) || this.A06 != ktCSuperShape0S1420000_I22.A06 || !C04220Ms.A0I(this.A04, ktCSuperShape0S1420000_I22.A04)) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int i;
        int A09;
        if (this.A07 != 0) {
            int A072 = (((AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A03(this.A01) * 31)) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A00)) * 31;
            boolean z = this.A05;
            A09 = 1;
            if (z) {
                z = true;
            }
            i = (A072 + (z ? 1 : 0)) * 31;
            if (!this.A06) {
                A09 = 0;
            }
        } else {
            boolean z2 = this.A05;
            int i2 = 1;
            if (z2) {
                z2 = true;
            }
            int A052 = (AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A00, (z2 ? 1 : 0) * true))) + AnonymousClass0wJ.A03(this.A03)) * 31;
            if (!this.A06) {
                i2 = 0;
            }
            i = (A052 + i2) * 31;
            A09 = C18200wM.A09(this.A04);
        }
        return i + A09;
    }

    public KtCSuperShape0S1420000_I2(LineType lineType, BKU bku, User user, String str, List list, boolean z, boolean z2) {
        AnonymousClass0wJ.A1Q(lineType, bku);
        C04220Ms.A0B(list, 4);
        this.A05 = z;
        this.A00 = lineType;
        this.A01 = bku;
        this.A02 = list;
        this.A03 = user;
        this.A06 = z2;
        this.A04 = str;
    }

    public KtCSuperShape0S1420000_I2(UpcomingEvent upcomingEvent, C23912D1a d1a, String str, Date date, Date date2, boolean z, boolean z2) {
        AnonymousClass0wJ.A1Q(d1a, str);
        this.A01 = upcomingEvent;
        this.A02 = d1a;
        this.A04 = str;
        this.A03 = date;
        this.A00 = date2;
        this.A05 = z;
        this.A06 = z2;
    }
}
