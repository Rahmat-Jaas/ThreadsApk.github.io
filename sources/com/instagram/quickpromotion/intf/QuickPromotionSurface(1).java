package com.instagram.quickpromotion.intf;

import X.C18250wR;
import X.C60123Nu;
import X.C81654o9;
import java.util.HashMap;
import java.util.Map;

public enum QuickPromotionSurface implements C81654o9 {
    MEGAPHONE(4715, C60123Nu.A00(r16)),
    TOOLTIP(5858, C60123Nu.A00(r4)),
    INTERSTITIAL(5734, C60123Nu.A00(r16)),
    STORIES_TRAY(6319, C60123Nu.A00(r4)),
    MESSAGE_FOOTER(8034, C60123Nu.A00(r4)),
    FLOATING_BANNER(8972, C60123Nu.A00(r4)),
    RTC_PEEK(9643, C60123Nu.A00(r4)),
    TWO_BY_TWO_TILE(9775, C60123Nu.A00(r4)),
    REELS_MIDCARD(10671, C60123Nu.A00(r16)),
    BOTTOMSHEET(11383, C60123Nu.A00(r4)),
    BARCELONA_MEGAPHONE(11451, C60123Nu.A00(r16));
    
    public static Map A02;
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        A02 = new HashMap(r3);
        for (QuickPromotionSurface quickPromotionSurface : values()) {
            C18250wR.A1F(quickPromotionSurface, A02, quickPromotionSurface.A00);
        }
    }

    /* access modifiers changed from: public */
    QuickPromotionSurface(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
