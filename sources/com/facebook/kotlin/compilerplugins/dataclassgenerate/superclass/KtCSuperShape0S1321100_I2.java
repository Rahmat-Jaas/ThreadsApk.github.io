package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C86104wH;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

public class KtCSuperShape0S1321100_I2 extends AnonymousClass0Sf {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final int A08;

    public KtCSuperShape0S1321100_I2(ImageUrl imageUrl, Reel reel, User user, String str, int i, int i2, long j, boolean z, boolean z2) {
        this.A08 = i2;
        C18180wK.A1Q(user, 2, imageUrl);
        this.A05 = str;
        this.A04 = user;
        this.A01 = j;
        this.A02 = imageUrl;
        this.A00 = i;
        this.A07 = z;
        this.A03 = reel;
        this.A06 = z2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A08 != 0) {
            i = 1;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof KtCSuperShape0S1321100_I2)) {
            return false;
        }
        KtCSuperShape0S1321100_I2 ktCSuperShape0S1321100_I2 = (KtCSuperShape0S1321100_I2) obj;
        if (ktCSuperShape0S1321100_I2.A08 == i && C04220Ms.A0I(this.A05, ktCSuperShape0S1321100_I2.A05) && C04220Ms.A0I(this.A04, ktCSuperShape0S1321100_I2.A04) && this.A01 == ktCSuperShape0S1321100_I2.A01 && C04220Ms.A0I(this.A02, ktCSuperShape0S1321100_I2.A02) && this.A00 == ktCSuperShape0S1321100_I2.A00 && this.A07 == ktCSuperShape0S1321100_I2.A07 && C04220Ms.A0I(this.A03, ktCSuperShape0S1321100_I2.A03) && this.A06 == ktCSuperShape0S1321100_I2.A06) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A052 = (AnonymousClass0wJ.A05(this.A02, C86104wH.A06(AnonymousClass0wJ.A05(this.A04, C18180wK.A03(this.A05)), this.A01)) + this.A00) * 31;
        boolean z = this.A07;
        int i = 1;
        if (z) {
            z = true;
        }
        int A032 = (((A052 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31;
        if (!this.A06) {
            i = 0;
        }
        return A032 + i;
    }
}
