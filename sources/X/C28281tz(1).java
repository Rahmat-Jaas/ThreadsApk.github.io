package X;

import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;

/* renamed from: X.1tz  reason: invalid class name and case insensitive filesystem */
public final class C28281tz extends C28291u0 implements C81644o8 {
    public QPTooltipAnchor A00;
    public Integer A01;
    public String A02;

    public C28281tz(QuickPromotionSurface quickPromotionSurface, C28221tt r10, AnonymousClass3GI r11, C62303Ye r12, String str, int i, long j, long j2, long j3, boolean z, boolean z2) {
        super(quickPromotionSurface, r10, r11, r12, str, i, j, j2, j3, z, z2);
        QPTooltipAnchor qPTooltipAnchor;
        Integer num;
        String str2;
        AnonymousClass3Gy r7 = r11.A01;
        C58473Fu A002 = r7.A00("tooltip_anchor");
        String str3 = null;
        if (A002 != null) {
            String str4 = A002.A03;
            QPTooltipAnchor[] values = QPTooltipAnchor.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    qPTooltipAnchor = null;
                    break;
                }
                qPTooltipAnchor = values[i2];
                if (C04220Ms.A0I(qPTooltipAnchor.A00, str4)) {
                    break;
                }
                i2++;
            }
        } else {
            qPTooltipAnchor = null;
        }
        this.A00 = qPTooltipAnchor;
        C58473Fu A003 = r7.A00("tooltip_direction");
        if (A003 != null) {
            String str5 = A003.A03;
            Integer[] A004 = AnonymousClass006.A00(2);
            int length2 = A004.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    num = null;
                    break;
                }
                num = A004[i3];
                if (1 - num.intValue() != 0) {
                    str2 = "UP";
                } else {
                    str2 = "DOWN";
                }
                if (str2.equals(str5)) {
                    break;
                }
                i3++;
            }
        } else {
            num = null;
        }
        this.A01 = num;
        C28251tw r1 = r10.A09;
        this.A02 = r1 != null ? r1.A00 : str3;
    }

    public C28281tz() {
    }
}
